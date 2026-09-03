package com.google.android.gms.internal.vision;

import java.io.IOException;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        k2 k2Var = k2.c;
        k2Var.getClass();
        k2Var.a(f1Var.getClass()).e(f1Var, f1Var2);
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
            k2 k2Var = k2.c;
            f1 f1Var = this.b;
            k2Var.getClass();
            n2 a2 = k2Var.a(f1Var.getClass());
            f1 f1Var2 = this.b;
            com.google.android.gms.internal.clearcut.m mVar = new com.google.android.gms.internal.clearcut.m();
            u0Var.getClass();
            a2.f(f1Var2, bArr, 0, i10, mVar);
        } catch (n1 e6) {
            throw e6;
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
        k2 k2Var = k2.c;
        k2Var.getClass();
        k2Var.a(f1Var.getClass()).b(f1Var);
        this.c = true;
        return this.b;
    }

    public final f1 f() {
        f1 e6 = e();
        boolean z4 = true;
        byte byteValue = ((Byte) e6.e(1)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z4 = false;
            } else {
                k2 k2Var = k2.c;
                k2Var.getClass();
                z4 = k2Var.a(e6.getClass()).a(e6);
                e6.e(2);
            }
        }
        if (z4) {
            return e6;
        }
        throw new a7.b("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
