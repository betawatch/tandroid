package org.telegram.ui.Components;

import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class q01 implements ki.f0, NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final boolean b;
    public final HashMap c = new HashMap();
    public boolean d;

    public q01(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
    }

    public final synchronized void a(long j3) {
        o01 o01Var = (o01) this.c.remove(Long.valueOf(j3));
        if (o01Var == null) {
            return;
        }
        o01Var.e = true;
        if (o01Var.d) {
            FileLoader.getInstance(this.a).cancelFileUpload(o01Var.a.getAbsolutePath(), this.b);
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
                    o01 o01Var = (o01) it.next();
                    if (o01Var.d && !o01Var.e) {
                        FileLoader.getInstance(this.a).cancelFileUpload(o01Var.a.getAbsolutePath(), this.b);
                    }
                    it.remove();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c(o01 o01Var) {
        if (o01Var.d) {
            return;
        }
        o01Var.d = true;
        FileLoader.getInstance(this.a).uploadFile(o01Var.a.getAbsolutePath(), this.b, false, 1L, 33554432, false);
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
                o01 o01Var = (o01) it.next();
                if (!o01Var.e && o01Var.a.getAbsolutePath().equals(str)) {
                    break;
                }
            }
        }
    }
}
