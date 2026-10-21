package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
