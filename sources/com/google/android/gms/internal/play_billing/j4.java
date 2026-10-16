package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
