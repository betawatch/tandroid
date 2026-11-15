package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class jy0 implements zi.s0, org.telegram.messenger.is {
    public final int a;
    public final boolean b;
    public final HashMap c = new HashMap();
    public boolean d;

    public jy0(int i7, boolean z10) {
        this.a = i7;
        this.b = z10;
        org.telegram.messenger.ns.f(i7).b(this, org.telegram.messenger.ns.U1);
    }

    public final synchronized void a(long j3, File file, long j10, long j11) {
        hy0 hy0Var = (hy0) this.c.get(Long.valueOf(j3));
        if (!this.d && hy0Var != null && !hy0Var.e) {
            e(hy0Var);
            hy0Var.b = Math.max(hy0Var.b, j10 + j11);
            org.telegram.messenger.w7.G(this.a).n(file.getAbsolutePath(), this.b, hy0Var.b, 0L, null);
        }
    }

    public final synchronized void b(long j3, long j10, File file) {
        hy0 hy0Var = (hy0) this.c.get(Long.valueOf(j3));
        if (!this.d && hy0Var != null && !hy0Var.e) {
            e(hy0Var);
            hy0Var.b = Math.max(hy0Var.b, j10);
            hy0Var.c = j10;
            org.telegram.messenger.w7.G(this.a).n(file.getAbsolutePath(), this.b, hy0Var.b, j10, null);
        }
    }

    public final synchronized void c(long j3) {
        hy0 hy0Var = (hy0) this.c.remove(Long.valueOf(j3));
        if (hy0Var == null) {
            return;
        }
        hy0Var.e = true;
        if (hy0Var.d) {
            org.telegram.messenger.w7.G(this.a).b(hy0Var.a.getAbsolutePath(), this.b);
        }
    }

    public final synchronized void d(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            org.telegram.messenger.ns.f(this.a).n(this, org.telegram.messenger.ns.U1);
            if (z10) {
                Iterator it = this.c.values().iterator();
                while (it.hasNext()) {
                    hy0 hy0Var = (hy0) it.next();
                    if (hy0Var.d && !hy0Var.e) {
                        org.telegram.messenger.w7.G(this.a).b(hy0Var.a.getAbsolutePath(), this.b);
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
    @Override // org.telegram.messenger.is
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (!this.d && i7 == org.telegram.messenger.ns.U1 && objArr.length >= 6) {
            String str = (String) objArr[0];
            Iterator it = this.c.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                hy0 hy0Var = (hy0) it.next();
                if (!hy0Var.e && hy0Var.a.getAbsolutePath().equals(str)) {
                    break;
                }
            }
        }
    }

    public final void e(hy0 hy0Var) {
        if (hy0Var.d) {
            return;
        }
        hy0Var.d = true;
        org.telegram.messenger.w7.G(this.a).g0(hy0Var.a.getAbsolutePath(), this.b, false, 1L, 33554432, false);
    }
}
