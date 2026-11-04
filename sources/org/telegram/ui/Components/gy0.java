package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class gy0 implements wi.q0, org.telegram.messenger.cs {
    public final int a;
    public final boolean b;
    public final HashMap c = new HashMap();
    public boolean d;

    public gy0(int i3, boolean z10) {
        this.a = i3;
        this.b = z10;
        org.telegram.messenger.hs.f(i3).b(this, org.telegram.messenger.hs.U1);
    }

    public final synchronized void a(long j10, File file, long j11, long j12) {
        ey0 ey0Var = (ey0) this.c.get(Long.valueOf(j10));
        if (!this.d && ey0Var != null && !ey0Var.e) {
            e(ey0Var);
            ey0Var.b = Math.max(ey0Var.b, j11 + j12);
            org.telegram.messenger.w7.G(this.a).n(file.getAbsolutePath(), this.b, ey0Var.b, 0L, null);
        }
    }

    public final synchronized void b(long j10, long j11, File file) {
        ey0 ey0Var = (ey0) this.c.get(Long.valueOf(j10));
        if (!this.d && ey0Var != null && !ey0Var.e) {
            e(ey0Var);
            ey0Var.b = Math.max(ey0Var.b, j11);
            ey0Var.c = j11;
            org.telegram.messenger.w7.G(this.a).n(file.getAbsolutePath(), this.b, ey0Var.b, j11, null);
        }
    }

    public final synchronized void c(long j10) {
        ey0 ey0Var = (ey0) this.c.remove(Long.valueOf(j10));
        if (ey0Var == null) {
            return;
        }
        ey0Var.e = true;
        if (ey0Var.d) {
            org.telegram.messenger.w7.G(this.a).b(ey0Var.a.getAbsolutePath(), this.b);
        }
    }

    public final synchronized void d(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            org.telegram.messenger.hs.f(this.a).n(this, org.telegram.messenger.hs.U1);
            if (z10) {
                Iterator it = this.c.values().iterator();
                while (it.hasNext()) {
                    ey0 ey0Var = (ey0) it.next();
                    if (ey0Var.d && !ey0Var.e) {
                        org.telegram.messenger.w7.G(this.a).b(ey0Var.a.getAbsolutePath(), this.b);
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
    @Override // org.telegram.messenger.cs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (!this.d && i3 == org.telegram.messenger.hs.U1 && objArr.length >= 6) {
            String str = (String) objArr[0];
            Iterator it = this.c.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ey0 ey0Var = (ey0) it.next();
                if (!ey0Var.e && ey0Var.a.getAbsolutePath().equals(str)) {
                    break;
                }
            }
        }
    }

    public final void e(ey0 ey0Var) {
        if (ey0Var.d) {
            return;
        }
        ey0Var.d = true;
        org.telegram.messenger.w7.G(this.a).h0(ey0Var.a.getAbsolutePath(), this.b, false, 1L, 33554432, false);
    }
}
