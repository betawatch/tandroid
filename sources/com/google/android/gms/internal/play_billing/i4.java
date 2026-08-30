package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class i4 extends g4 {
    public final /* synthetic */ j4 n;

    public i4(j4 j4Var) {
        this.n = j4Var;
    }

    @Override // com.google.android.gms.internal.play_billing.g4
    public final String b() {
        h4 h4Var = (h4) this.n.a.get();
        return h4Var == null ? "Completer object has been garbage collected, future will fail soon" : android.support.v4.media.a.o("tag=[", String.valueOf(h4Var.a), "]");
    }
}
