package org.telegram.ui.Components;

import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class p01 implements ki.l0, NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final boolean b;
    public final HashMap c = new HashMap();
    public boolean d;

    public p01(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
    }

    public final synchronized void a(long j3) {
        n01 n01Var = (n01) this.c.remove(Long.valueOf(j3));
        if (n01Var == null) {
            return;
        }
        n01Var.e = true;
        if (n01Var.d) {
            FileLoader.getInstance(this.a).cancelFileUpload(n01Var.a.getAbsolutePath(), this.b);
        }
    }

    public final synchronized void b(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.fileUploaded);
            if (z10) {
                Iterator it = this.c.values().iterator();
                while (it.hasNext()) {
                    n01 n01Var = (n01) it.next();
                    if (n01Var.d && !n01Var.e) {
                        FileLoader.getInstance(this.a).cancelFileUpload(n01Var.a.getAbsolutePath(), this.b);
                    }
                    it.remove();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c(n01 n01Var) {
        if (n01Var.d) {
            return;
        }
        n01Var.d = true;
        FileLoader.getInstance(this.a).uploadFile(n01Var.a.getAbsolutePath(), this.b, false, 1L, 33554432, false);
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
                n01 n01Var = (n01) it.next();
                if (!n01Var.e && n01Var.a.getAbsolutePath().equals(str)) {
                    break;
                }
            }
        }
    }
}
