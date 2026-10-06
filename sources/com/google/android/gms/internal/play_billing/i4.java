package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final class i4 extends g4 {
    public final /* synthetic */ j4 n;

    public i4(j4 j4Var) {
        this.n = j4Var;
    }

    @Override // com.google.android.gms.internal.play_billing.g4
    public final String c() {
        h4 h4Var = (h4) this.n.a.get();
        return h4Var == null ? "Completer object has been garbage collected, future will fail soon" : a4.a.q("tag=[", String.valueOf(h4Var.a), "]");
    }
}
