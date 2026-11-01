package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class mz0 implements li.u0, org.telegram.messenger.vs {
    public final int a;
    public final boolean b;
    public final HashMap c = new HashMap();
    public boolean d;

    public mz0(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
        org.telegram.messenger.at.f(i10).b(this, org.telegram.messenger.at.U1);
    }

    public final synchronized void a(long j10, File file, long j11, long j12) {
        kz0 kz0Var = (kz0) this.c.get(Long.valueOf(j10));
        if (!this.d && kz0Var != null && !kz0Var.e) {
            e(kz0Var);
            kz0Var.b = Math.max(kz0Var.b, j11 + j12);
            org.telegram.messenger.b8.G(this.a).n(file.getAbsolutePath(), this.b, kz0Var.b, 0L, null);
        }
    }

    public final synchronized void b(long j10, long j11, File file) {
        kz0 kz0Var = (kz0) this.c.get(Long.valueOf(j10));
        if (!this.d && kz0Var != null && !kz0Var.e) {
            e(kz0Var);
            kz0Var.b = Math.max(kz0Var.b, j11);
            kz0Var.c = j11;
            org.telegram.messenger.b8.G(this.a).n(file.getAbsolutePath(), this.b, kz0Var.b, j11, null);
        }
    }

    public final synchronized void c(long j10) {
        kz0 kz0Var = (kz0) this.c.remove(Long.valueOf(j10));
        if (kz0Var == null) {
            return;
        }
        kz0Var.e = true;
        if (kz0Var.d) {
            org.telegram.messenger.b8.G(this.a).b(kz0Var.a.getAbsolutePath(), this.b);
        }
    }

    public final synchronized void d(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            org.telegram.messenger.at.f(this.a).n(this, org.telegram.messenger.at.U1);
            if (z10) {
                Iterator it = this.c.values().iterator();
                while (it.hasNext()) {
                    kz0 kz0Var = (kz0) it.next();
                    if (kz0Var.d && !kz0Var.e) {
                        org.telegram.messenger.b8.G(this.a).b(kz0Var.a.getAbsolutePath(), this.b);
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
    @Override // org.telegram.messenger.vs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (!this.d && i10 == org.telegram.messenger.at.U1 && objArr.length >= 6) {
            String str = (String) objArr[0];
            Iterator it = this.c.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                kz0 kz0Var = (kz0) it.next();
                if (!kz0Var.e && kz0Var.a.getAbsolutePath().equals(str)) {
                    break;
                }
            }
        }
    }

    public final void e(kz0 kz0Var) {
        if (kz0Var.d) {
            return;
        }
        kz0Var.d = true;
        org.telegram.messenger.b8.G(this.a).h0(kz0Var.a.getAbsolutePath(), this.b, false, 1L, 33554432, false);
    }
}
