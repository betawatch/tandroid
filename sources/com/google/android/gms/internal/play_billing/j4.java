package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class j4 extends h4 {
    public final /* synthetic */ k4 n;

    public j4(k4 k4Var) {
        this.n = k4Var;
    }

    @Override // com.google.android.gms.internal.play_billing.h4
    public final String c() {
        i4 i4Var = (i4) this.n.a.get();
        return i4Var == null ? "Completer object has been garbage collected, future will fail soon" : a1.g.p("tag=[", String.valueOf(i4Var.a), "]");
    }
}
