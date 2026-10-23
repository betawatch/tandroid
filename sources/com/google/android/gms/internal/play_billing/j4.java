package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
