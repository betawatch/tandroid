package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ry0 implements zi.r0, org.telegram.messenger.fs {
    public final int a;
    public final boolean b;
    public final HashMap c = new HashMap();
    public boolean d;

    public ry0(int i7, boolean z10) {
        this.a = i7;
        this.b = z10;
        org.telegram.messenger.ks.f(i7).b(this, org.telegram.messenger.ks.U1);
    }

    public final synchronized void a(long j3, File file, long j10, long j11) {
        py0 py0Var = (py0) this.c.get(Long.valueOf(j3));
        if (!this.d && py0Var != null && !py0Var.e) {
            e(py0Var);
            py0Var.b = Math.max(py0Var.b, j10 + j11);
            org.telegram.messenger.w7.G(this.a).n(file.getAbsolutePath(), this.b, py0Var.b, 0L, null);
        }
    }

    public final synchronized void b(long j3, long j10, File file) {
        py0 py0Var = (py0) this.c.get(Long.valueOf(j3));
        if (!this.d && py0Var != null && !py0Var.e) {
            e(py0Var);
            py0Var.b = Math.max(py0Var.b, j10);
            py0Var.c = j10;
            org.telegram.messenger.w7.G(this.a).n(file.getAbsolutePath(), this.b, py0Var.b, j10, null);
        }
    }

    public final synchronized void c(long j3) {
        py0 py0Var = (py0) this.c.remove(Long.valueOf(j3));
        if (py0Var == null) {
            return;
        }
        py0Var.e = true;
        if (py0Var.d) {
            org.telegram.messenger.w7.G(this.a).b(py0Var.a.getAbsolutePath(), this.b);
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
                    py0 py0Var = (py0) it.next();
                    if (py0Var.d && !py0Var.e) {
                        org.telegram.messenger.w7.G(this.a).b(py0Var.a.getAbsolutePath(), this.b);
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
                py0 py0Var = (py0) it.next();
                if (!py0Var.e && py0Var.a.getAbsolutePath().equals(str)) {
                    break;
                }
            }
        }
    }

    public final void e(py0 py0Var) {
        if (py0Var.d) {
            return;
        }
        py0Var.d = true;
        org.telegram.messenger.w7.G(this.a).g0(py0Var.a.getAbsolutePath(), this.b, false, 1L, 33554432, false);
    }
}
