package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class e1 {
    protected int zza;

    public final byte[] a() {
        try {
            u1 u1Var = (u1) this;
            int e10 = u1Var.e();
            byte[] bArr = new byte[e10];
            l1 l1Var = new l1(bArr, e10);
            s2 a2 = p2.c.a(u1Var.getClass());
            h2 h2Var = l1Var.a;
            if (h2Var == null) {
                h2Var = new h2(l1Var);
            }
            a2.d(u1Var, h2Var);
            if (e10 - l1Var.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e11) {
            throw new RuntimeException(a4.w.n("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e11);
        }
    }

    public abstract int b(s2 s2Var);
}
