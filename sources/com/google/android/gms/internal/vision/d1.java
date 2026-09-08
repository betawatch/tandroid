package com.google.android.gms.internal.vision;

import java.io.IOException;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
            com.google.android.gms.internal.clearcut.l lVar = new com.google.android.gms.internal.clearcut.l();
            u0Var.getClass();
            a2.f(f1Var2, bArr, 0, i10, lVar);
        } catch (n1 e7) {
            throw e7;
        } catch (IOException e10) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e10);
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
        f1 e7 = e();
        boolean z10 = true;
        byte byteValue = ((Byte) e7.e(1)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z10 = false;
            } else {
                l2 l2Var = l2.c;
                l2Var.getClass();
                z10 = l2Var.a(e7.getClass()).a(e7);
                e7.e(2);
            }
        }
        if (z10) {
            return e7;
        }
        throw new androidx.car.app.j("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
