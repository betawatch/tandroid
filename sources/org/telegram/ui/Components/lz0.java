package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class lz0 implements li.u0, org.telegram.messenger.us {
    public final int a;
    public final boolean b;
    public final HashMap c = new HashMap();
    public boolean d;

    public lz0(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
        org.telegram.messenger.zs.f(i10).b(this, org.telegram.messenger.zs.U1);
    }

    public final synchronized void a(long j10, File file, long j11, long j12) {
        jz0 jz0Var = (jz0) this.c.get(Long.valueOf(j10));
        if (!this.d && jz0Var != null && !jz0Var.e) {
            e(jz0Var);
            jz0Var.b = Math.max(jz0Var.b, j11 + j12);
            org.telegram.messenger.b8.G(this.a).n(file.getAbsolutePath(), this.b, jz0Var.b, 0L, null);
        }
    }

    public final synchronized void b(long j10, long j11, File file) {
        jz0 jz0Var = (jz0) this.c.get(Long.valueOf(j10));
        if (!this.d && jz0Var != null && !jz0Var.e) {
            e(jz0Var);
            jz0Var.b = Math.max(jz0Var.b, j11);
            jz0Var.c = j11;
            org.telegram.messenger.b8.G(this.a).n(file.getAbsolutePath(), this.b, jz0Var.b, j11, null);
        }
    }

    public final synchronized void c(long j10) {
        jz0 jz0Var = (jz0) this.c.remove(Long.valueOf(j10));
        if (jz0Var == null) {
            return;
        }
        jz0Var.e = true;
        if (jz0Var.d) {
            org.telegram.messenger.b8.G(this.a).b(jz0Var.a.getAbsolutePath(), this.b);
        }
    }

    public final synchronized void d(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            org.telegram.messenger.zs.f(this.a).n(this, org.telegram.messenger.zs.U1);
            if (z10) {
                Iterator it = this.c.values().iterator();
                while (it.hasNext()) {
                    jz0 jz0Var = (jz0) it.next();
                    if (jz0Var.d && !jz0Var.e) {
                        org.telegram.messenger.b8.G(this.a).b(jz0Var.a.getAbsolutePath(), this.b);
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
    @Override // org.telegram.messenger.us
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (!this.d && i10 == org.telegram.messenger.zs.U1 && objArr.length >= 6) {
            String str = (String) objArr[0];
            Iterator it = this.c.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                jz0 jz0Var = (jz0) it.next();
                if (!jz0Var.e && jz0Var.a.getAbsolutePath().equals(str)) {
                    break;
                }
            }
        }
    }

    public final void e(jz0 jz0Var) {
        if (jz0Var.d) {
            return;
        }
        jz0Var.d = true;
        org.telegram.messenger.b8.G(this.a).h0(jz0Var.a.getAbsolutePath(), this.b, false, 1L, 33554432, false);
    }
}
