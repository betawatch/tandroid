package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class qy0 implements zi.r0, org.telegram.messenger.fs {
    public final int a;
    public final boolean b;
    public final HashMap c = new HashMap();
    public boolean d;

    public qy0(int i7, boolean z10) {
        this.a = i7;
        this.b = z10;
        org.telegram.messenger.ks.f(i7).b(this, org.telegram.messenger.ks.U1);
    }

    public final synchronized void a(long j3, File file, long j10, long j11) {
        oy0 oy0Var = (oy0) this.c.get(Long.valueOf(j3));
        if (!this.d && oy0Var != null && !oy0Var.e) {
            e(oy0Var);
            oy0Var.b = Math.max(oy0Var.b, j10 + j11);
            org.telegram.messenger.w7.G(this.a).n(file.getAbsolutePath(), this.b, oy0Var.b, 0L, null);
        }
    }

    public final synchronized void b(long j3, long j10, File file) {
        oy0 oy0Var = (oy0) this.c.get(Long.valueOf(j3));
        if (!this.d && oy0Var != null && !oy0Var.e) {
            e(oy0Var);
            oy0Var.b = Math.max(oy0Var.b, j10);
            oy0Var.c = j10;
            org.telegram.messenger.w7.G(this.a).n(file.getAbsolutePath(), this.b, oy0Var.b, j10, null);
        }
    }

    public final synchronized void c(long j3) {
        oy0 oy0Var = (oy0) this.c.remove(Long.valueOf(j3));
        if (oy0Var == null) {
            return;
        }
        oy0Var.e = true;
        if (oy0Var.d) {
            org.telegram.messenger.w7.G(this.a).b(oy0Var.a.getAbsolutePath(), this.b);
        }
    }

    public final synchronized void d(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            org.telegram.messenger.ks.f(this.a).n(this, org.telegram.messenger.ks.U1);
            if (z10) {
                Iterator it = this.c.values().iterator();
                while (it.hasNext()) {
                    oy0 oy0Var = (oy0) it.next();
                    if (oy0Var.d && !oy0Var.e) {
                        org.telegram.messenger.w7.G(this.a).b(oy0Var.a.getAbsolutePath(), this.b);
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
    @Override // org.telegram.messenger.fs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (!this.d && i7 == org.telegram.messenger.ks.U1 && objArr.length >= 6) {
            String str = (String) objArr[0];
            Iterator it = this.c.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                oy0 oy0Var = (oy0) it.next();
                if (!oy0Var.e && oy0Var.a.getAbsolutePath().equals(str)) {
                    break;
                }
            }
        }
    }

    public final void e(oy0 oy0Var) {
        if (oy0Var.d) {
            return;
        }
        oy0Var.d = true;
        org.telegram.messenger.w7.G(this.a).g0(oy0Var.a.getAbsolutePath(), this.b, false, 1L, 33554432, false);
    }
}
