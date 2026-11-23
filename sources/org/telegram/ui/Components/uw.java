package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class uw extends v4.t {
    public final /* synthetic */ ty Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw(ty tyVar) {
        super(8);
        this.Q = tyVar;
    }

    @Override // v4.c0, v4.p0
    public final void v0(RecyclerView recyclerView, v4.c1 c1Var, int i7) {
        try {
            hi.l1 l1Var = new hi.l1(2, recyclerView.getContext(), this);
            l1Var.a = i7;
            w0(l1Var);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
