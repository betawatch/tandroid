package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class gy0 implements wi.q0, org.telegram.messenger.ls {
    public final int a;
    public final boolean b;
    public final HashMap c = new HashMap();
    public boolean d;

    public gy0(int i7, boolean z9) {
        this.a = i7;
        this.b = z9;
        org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.U1);
    }

    public final synchronized void a(long j3, File file, long j10, long j11) {
        ey0 ey0Var = (ey0) this.c.get(Long.valueOf(j3));
        if (!this.d && ey0Var != null && !ey0Var.e) {
            e(ey0Var);
            ey0Var.b = Math.max(ey0Var.b, j10 + j11);
            org.telegram.messenger.w7.G(this.a).n(file.getAbsolutePath(), this.b, ey0Var.b, 0L, null);
        }
    }

    public final synchronized void b(long j3, long j10, File file) {
        ey0 ey0Var = (ey0) this.c.get(Long.valueOf(j3));
        if (!this.d && ey0Var != null && !ey0Var.e) {
            e(ey0Var);
            ey0Var.b = Math.max(ey0Var.b, j10);
            ey0Var.c = j10;
            org.telegram.messenger.w7.G(this.a).n(file.getAbsolutePath(), this.b, ey0Var.b, j10, null);
        }
    }

    public final synchronized void c(long j3) {
        ey0 ey0Var = (ey0) this.c.remove(Long.valueOf(j3));
        if (ey0Var == null) {
            return;
        }
        ey0Var.e = true;
        if (ey0Var.d) {
            org.telegram.messenger.w7.G(this.a).b(ey0Var.a.getAbsolutePath(), this.b);
        }
    }

    public final synchronized void d(boolean z9) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            org.telegram.messenger.qs.f(this.a).n(this, org.telegram.messenger.qs.U1);
            if (z9) {
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
    @Override // org.telegram.messenger.ls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (!this.d && i7 == org.telegram.messenger.qs.U1 && objArr.length >= 6) {
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
