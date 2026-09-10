package com.google.android.gms.internal.vision;

import java.io.IOException;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class d1 implements Cloneable {
    public final f1 a;
    public f1 b;
    public boolean c = false;

    public d1(f1 f1Var) {
        this.a = f1Var;
        this.b = (f1) f1Var.e(4);
    }

    public static void b(f1 f1Var, f1 f1Var2) {
        l2 l2Var = l2.c;
        l2Var.getClass();
        l2Var.a(f1Var.getClass()).e(f1Var, f1Var2);
    }

    public final void a(f1 f1Var) {
        if (this.c) {
            d();
            this.c = false;
        }
        b(this.b, f1Var);
    }

    public final void c(byte[] bArr, int i10, u0 u0Var) {
        if (this.c) {
            d();
            this.c = false;
        }
        try {
            l2 l2Var = l2.c;
            f1 f1Var = this.b;
            l2Var.getClass();
            o2 a2 = l2Var.a(f1Var.getClass());
            f1 f1Var2 = this.b;
            com.google.android.gms.internal.clearcut.m mVar = new com.google.android.gms.internal.clearcut.m();
            u0Var.getClass();
            a2.f(f1Var2, bArr, 0, i10, mVar);
        } catch (n1 e) {
            throw e;
        } catch (IOException e7) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e7);
        } catch (IndexOutOfBoundsException unused) {
            throw n1.a();
        }
    }

    public final /* synthetic */ Object clone() {
        d1 d1Var = (d1) this.a.e(5);
        d1Var.a(e());
        return d1Var;
    }

    public final void d() {
        f1 f1Var = (f1) this.b.e(4);
        b(f1Var, this.b);
        this.b = f1Var;
    }

    public final f1 e() {
        if (this.c) {
            return this.b;
        }
        f1 f1Var = this.b;
        l2 l2Var = l2.c;
        l2Var.getClass();
        l2Var.a(f1Var.getClass()).b(f1Var);
        this.c = true;
        return this.b;
    }

    public final f1 f() {
        f1 e = e();
        boolean z10 = true;
        byte byteValue = ((Byte) e.e(1)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z10 = false;
            } else {
                l2 l2Var = l2.c;
                l2Var.getClass();
                z10 = l2Var.a(e.getClass()).a(e);
                e.e(2);
            }
        }
        if (z10) {
            return e;
        }
        throw new androidx.car.app.j("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
