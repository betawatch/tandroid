package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vw extends s4.r {
    public final /* synthetic */ vy Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw(vy vyVar) {
        super(8);
        this.Q = vyVar;
    }

    @Override // s4.a0, s4.n0
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        try {
            qw qwVar = new qw(this, recyclerView.getContext(), 1);
            qwVar.a = i10;
            w0(qwVar);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
