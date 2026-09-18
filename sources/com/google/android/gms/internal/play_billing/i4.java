package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class i4 extends g4 {
    public final /* synthetic */ j4 n;

    public i4(j4 j4Var) {
        this.n = j4Var;
    }

    @Override // com.google.android.gms.internal.play_billing.g4
    public final String c() {
        h4 h4Var = (h4) this.n.a.get();
        return h4Var == null ? "Completer object has been garbage collected, future will fail soon" : a4.a.p("tag=[", String.valueOf(h4Var.a), "]");
    }
}
