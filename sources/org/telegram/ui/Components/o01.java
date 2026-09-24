package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class o01 implements ki.o0, NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final boolean b;
    public final HashMap c = new HashMap();
    public boolean d;

    public o01(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
    }

    public final synchronized void a(long j3, File file, long j10, long j11) {
        m01 m01Var = (m01) this.c.get(Long.valueOf(j3));
        if (!this.d && m01Var != null && !m01Var.e) {
            e(m01Var);
            m01Var.b = Math.max(m01Var.b, j10 + j11);
            FileLoader.getInstance(this.a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.b, m01Var.b, 0L);
        }
    }

    public final synchronized void b(long j3, long j10, File file) {
        m01 m01Var = (m01) this.c.get(Long.valueOf(j3));
        if (!this.d && m01Var != null && !m01Var.e) {
            e(m01Var);
            m01Var.b = Math.max(m01Var.b, j10);
            m01Var.c = j10;
            FileLoader.getInstance(this.a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.b, m01Var.b, j10);
        }
    }

    public final synchronized void c(long j3) {
        m01 m01Var = (m01) this.c.remove(Long.valueOf(j3));
        if (m01Var == null) {
            return;
        }
        m01Var.e = true;
        if (m01Var.d) {
            FileLoader.getInstance(this.a).cancelFileUpload(m01Var.a.getAbsolutePath(), this.b);
        }
    }

    public final synchronized void d(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.fileUploaded);
            if (z10) {
                Iterator it = this.c.values().iterator();
                while (it.hasNext()) {
                    m01 m01Var = (m01) it.next();
                    if (m01Var.d && !m01Var.e) {
                        FileLoader.getInstance(this.a).cancelFileUpload(m01Var.a.getAbsolutePath(), this.b);
                    }
                    it.remove();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        r0.f = (org.telegram.tgnet.TLRPC.InputFile) r6[1];
        r0.g = (org.telegram.tgnet.TLRPC.InputEncryptedFile) r6[2];
        r0.h = (byte[]) r6[3];
        r0.i = (byte[]) r6[4];
        r0.c = java.lang.Math.max(r0.c, ((java.lang.Long) r6[5]).longValue());
     */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (!this.d && i10 == NotificationCenter.fileUploaded && objArr.length >= 6) {
            String str = (String) objArr[0];
            Iterator it = this.c.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                m01 m01Var = (m01) it.next();
                if (!m01Var.e && m01Var.a.getAbsolutePath().equals(str)) {
                    break;
                }
            }
        }
    }

    public final void e(m01 m01Var) {
        if (m01Var.d) {
            return;
        }
        m01Var.d = true;
        FileLoader.getInstance(this.a).uploadFile(m01Var.a.getAbsolutePath(), this.b, false, 1L, 33554432, false);
    }
}
