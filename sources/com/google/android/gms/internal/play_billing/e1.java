package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class e1 {
    protected int zza;

    public final byte[] a() {
        try {
            v1 v1Var = (v1) this;
            int e10 = v1Var.e();
            byte[] bArr = new byte[e10];
            m1 m1Var = new m1(bArr, e10);
            t2 a10 = q2.c.a(v1Var.getClass());
            i2 i2Var = m1Var.a;
            if (i2Var == null) {
                i2Var = new i2(m1Var);
            }
            a10.c(v1Var, i2Var);
            if (e10 - m1Var.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e11) {
            throw new RuntimeException(a8.p0.p("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e11);
        }
    }

    public abstract int b(t2 t2Var);
}
