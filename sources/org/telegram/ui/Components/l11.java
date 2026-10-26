package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class l11 implements vi.p0, NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final boolean b;
    public final HashMap c = new HashMap();
    public boolean d;

    public l11(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
    }

    public final synchronized void a(long j10, File file, long j11, long j12) {
        j11 j11Var = (j11) this.c.get(Long.valueOf(j10));
        if (!this.d && j11Var != null && !j11Var.e) {
            e(j11Var);
            j11Var.b = Math.max(j11Var.b, j11 + j12);
            FileLoader.getInstance(this.a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.b, j11Var.b, 0L);
        }
    }

    public final synchronized void b(long j10, long j11, File file) {
        j11 j11Var = (j11) this.c.get(Long.valueOf(j10));
        if (!this.d && j11Var != null && !j11Var.e) {
            e(j11Var);
            j11Var.b = Math.max(j11Var.b, j11);
            j11Var.c = j11;
            FileLoader.getInstance(this.a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.b, j11Var.b, j11);
        }
    }

    public final synchronized void c(long j10) {
        j11 j11Var = (j11) this.c.remove(Long.valueOf(j10));
        if (j11Var == null) {
            return;
        }
        j11Var.e = true;
        if (j11Var.d) {
            FileLoader.getInstance(this.a).cancelFileUpload(j11Var.a.getAbsolutePath(), this.b);
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
                    j11 j11Var = (j11) it.next();
                    if (j11Var.d && !j11Var.e) {
                        FileLoader.getInstance(this.a).cancelFileUpload(j11Var.a.getAbsolutePath(), this.b);
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
                j11 j11Var = (j11) it.next();
                if (!j11Var.e && j11Var.a.getAbsolutePath().equals(str)) {
                    break;
                }
            }
        }
    }

    public final void e(j11 j11Var) {
        if (j11Var.d) {
            return;
        }
        j11Var.d = true;
        FileLoader.getInstance(this.a).uploadFile(j11Var.a.getAbsolutePath(), this.b, false, 1L, 33554432, false);
    }
}
