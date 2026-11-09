package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class iy0 implements wi.q0, org.telegram.messenger.ls {
    public final int a;
    public final boolean b;
    public final HashMap c = new HashMap();
    public boolean d;

    public iy0(int i7, boolean z9) {
        this.a = i7;
        this.b = z9;
        org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.U1);
    }

    public final synchronized void a(long j3, File file, long j10, long j11) {
        gy0 gy0Var = (gy0) this.c.get(Long.valueOf(j3));
        if (!this.d && gy0Var != null && !gy0Var.e) {
            e(gy0Var);
            gy0Var.b = Math.max(gy0Var.b, j10 + j11);
            org.telegram.messenger.w7.G(this.a).n(file.getAbsolutePath(), this.b, gy0Var.b, 0L, null);
        }
    }

    public final synchronized void b(long j3, long j10, File file) {
        gy0 gy0Var = (gy0) this.c.get(Long.valueOf(j3));
        if (!this.d && gy0Var != null && !gy0Var.e) {
            e(gy0Var);
            gy0Var.b = Math.max(gy0Var.b, j10);
            gy0Var.c = j10;
            org.telegram.messenger.w7.G(this.a).n(file.getAbsolutePath(), this.b, gy0Var.b, j10, null);
        }
    }

    public final synchronized void c(long j3) {
        gy0 gy0Var = (gy0) this.c.remove(Long.valueOf(j3));
        if (gy0Var == null) {
            return;
        }
        gy0Var.e = true;
        if (gy0Var.d) {
            org.telegram.messenger.w7.G(this.a).b(gy0Var.a.getAbsolutePath(), this.b);
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
                    gy0 gy0Var = (gy0) it.next();
                    if (gy0Var.d && !gy0Var.e) {
                        org.telegram.messenger.w7.G(this.a).b(gy0Var.a.getAbsolutePath(), this.b);
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
                gy0 gy0Var = (gy0) it.next();
                if (!gy0Var.e && gy0Var.a.getAbsolutePath().equals(str)) {
                    break;
                }
            }
        }
    }

    public final void e(gy0 gy0Var) {
        if (gy0Var.d) {
            return;
        }
        gy0Var.d = true;
        org.telegram.messenger.w7.G(this.a).g0(gy0Var.a.getAbsolutePath(), this.b, false, 1L, 33554432, false);
    }
}
