package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public abstract class e1 {
    protected int zza;

    public final byte[] a() {
        try {
            v1 v1Var = (v1) this;
            int e = v1Var.e();
            byte[] bArr = new byte[e];
            m1 m1Var = new m1(bArr, e);
            t2 a2 = q2.c.a(v1Var.getClass());
            i2 i2Var = m1Var.a;
            if (i2Var == null) {
                i2Var = new i2(m1Var);
            }
            a2.c(v1Var, i2Var);
            if (e - m1Var.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e7) {
            throw new RuntimeException(a4.a.q("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e7);
        }
    }

    public abstract int b(t2 t2Var);
}
