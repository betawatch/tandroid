package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class hy0 implements wi.q0, org.telegram.messenger.ls {
    public final int a;
    public final boolean b;
    public final HashMap c = new HashMap();
    public boolean d;

    public hy0(int i7, boolean z9) {
        this.a = i7;
        this.b = z9;
        org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.U1);
    }

    public final synchronized void a(long j3, File file, long j10, long j11) {
        fy0 fy0Var = (fy0) this.c.get(Long.valueOf(j3));
        if (!this.d && fy0Var != null && !fy0Var.e) {
            e(fy0Var);
            fy0Var.b = Math.max(fy0Var.b, j10 + j11);
            org.telegram.messenger.w7.G(this.a).n(file.getAbsolutePath(), this.b, fy0Var.b, 0L, null);
        }
    }

    public final synchronized void b(long j3, long j10, File file) {
        fy0 fy0Var = (fy0) this.c.get(Long.valueOf(j3));
        if (!this.d && fy0Var != null && !fy0Var.e) {
            e(fy0Var);
            fy0Var.b = Math.max(fy0Var.b, j10);
            fy0Var.c = j10;
            org.telegram.messenger.w7.G(this.a).n(file.getAbsolutePath(), this.b, fy0Var.b, j10, null);
        }
    }

    public final synchronized void c(long j3) {
        fy0 fy0Var = (fy0) this.c.remove(Long.valueOf(j3));
        if (fy0Var == null) {
            return;
        }
        fy0Var.e = true;
        if (fy0Var.d) {
            org.telegram.messenger.w7.G(this.a).b(fy0Var.a.getAbsolutePath(), this.b);
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
                    fy0 fy0Var = (fy0) it.next();
                    if (fy0Var.d && !fy0Var.e) {
                        org.telegram.messenger.w7.G(this.a).b(fy0Var.a.getAbsolutePath(), this.b);
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
                fy0 fy0Var = (fy0) it.next();
                if (!fy0Var.e && fy0Var.a.getAbsolutePath().equals(str)) {
                    break;
                }
            }
        }
    }

    public final void e(fy0 fy0Var) {
        if (fy0Var.d) {
            return;
        }
        fy0Var.d = true;
        org.telegram.messenger.w7.G(this.a).g0(fy0Var.a.getAbsolutePath(), this.b, false, 1L, 33554432, false);
    }
}
