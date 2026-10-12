package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
