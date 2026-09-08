package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class e1 {
    protected int zza;

    public final byte[] a() {
        try {
            v1 v1Var = (v1) this;
            int e7 = v1Var.e();
            byte[] bArr = new byte[e7];
            m1 m1Var = new m1(bArr, e7);
            t2 a2 = q2.c.a(v1Var.getClass());
            i2 i2Var = m1Var.a;
            if (i2Var == null) {
                i2Var = new i2(m1Var);
            }
            a2.c(v1Var, i2Var);
            if (e7 - m1Var.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(a4.a.p("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }

    public abstract int b(t2 t2Var);
}
