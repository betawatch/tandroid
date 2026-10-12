package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class c11 implements li.r0, NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final boolean b;
    public final HashMap c = new HashMap();
    public boolean d;

    public c11(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
    }

    public final synchronized void a(long j10, File file, long j11, long j12) {
        a11 a11Var = (a11) this.c.get(Long.valueOf(j10));
        if (!this.d && a11Var != null && !a11Var.e) {
            e(a11Var);
            a11Var.b = Math.max(a11Var.b, j11 + j12);
            FileLoader.getInstance(this.a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.b, a11Var.b, 0L);
        }
    }

    public final synchronized void b(long j10, long j11, File file) {
        a11 a11Var = (a11) this.c.get(Long.valueOf(j10));
        if (!this.d && a11Var != null && !a11Var.e) {
            e(a11Var);
            a11Var.b = Math.max(a11Var.b, j11);
            a11Var.c = j11;
            FileLoader.getInstance(this.a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.b, a11Var.b, j11);
        }
    }

    public final synchronized void c(long j10) {
        a11 a11Var = (a11) this.c.remove(Long.valueOf(j10));
        if (a11Var == null) {
            return;
        }
        a11Var.e = true;
        if (a11Var.d) {
            FileLoader.getInstance(this.a).cancelFileUpload(a11Var.a.getAbsolutePath(), this.b);
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
                    a11 a11Var = (a11) it.next();
                    if (a11Var.d && !a11Var.e) {
                        FileLoader.getInstance(this.a).cancelFileUpload(a11Var.a.getAbsolutePath(), this.b);
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
                a11 a11Var = (a11) it.next();
                if (!a11Var.e && a11Var.a.getAbsolutePath().equals(str)) {
                    break;
                }
            }
        }
    }

    public final void e(a11 a11Var) {
        if (a11Var.d) {
            return;
        }
        a11Var.d = true;
        FileLoader.getInstance(this.a).uploadFile(a11Var.a.getAbsolutePath(), this.b, false, 1L, 33554432, false);
    }
}
