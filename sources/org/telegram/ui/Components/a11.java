package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class a11 implements ki.p0, NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final boolean b;
    public final HashMap c = new HashMap();
    public boolean d;

    public a11(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
    }

    public final synchronized void a(long j3, File file, long j10, long j11) {
        y01 y01Var = (y01) this.c.get(Long.valueOf(j3));
        if (!this.d && y01Var != null && !y01Var.e) {
            e(y01Var);
            y01Var.b = Math.max(y01Var.b, j10 + j11);
            FileLoader.getInstance(this.a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.b, y01Var.b, 0L);
        }
    }

    public final synchronized void b(long j3, long j10, File file) {
        y01 y01Var = (y01) this.c.get(Long.valueOf(j3));
        if (!this.d && y01Var != null && !y01Var.e) {
            e(y01Var);
            y01Var.b = Math.max(y01Var.b, j10);
            y01Var.c = j10;
            FileLoader.getInstance(this.a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.b, y01Var.b, j10);
        }
    }

    public final synchronized void c(long j3) {
        y01 y01Var = (y01) this.c.remove(Long.valueOf(j3));
        if (y01Var == null) {
            return;
        }
        y01Var.e = true;
        if (y01Var.d) {
            FileLoader.getInstance(this.a).cancelFileUpload(y01Var.a.getAbsolutePath(), this.b);
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
                    y01 y01Var = (y01) it.next();
                    if (y01Var.d && !y01Var.e) {
                        FileLoader.getInstance(this.a).cancelFileUpload(y01Var.a.getAbsolutePath(), this.b);
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
                y01 y01Var = (y01) it.next();
                if (!y01Var.e && y01Var.a.getAbsolutePath().equals(str)) {
                    break;
                }
            }
        }
    }

    public final void e(y01 y01Var) {
        if (y01Var.d) {
            return;
        }
        y01Var.d = true;
        FileLoader.getInstance(this.a).uploadFile(y01Var.a.getAbsolutePath(), this.b, false, 1L, 33554432, false);
    }
}
