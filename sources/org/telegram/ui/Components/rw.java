package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class rw extends v4.t {
    public final /* synthetic */ qy Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw(qy qyVar) {
        super(8);
        this.Q = qyVar;
    }

    @Override // v4.c0, v4.p0
    public final void v0(RecyclerView recyclerView, v4.c1 c1Var, int i7) {
        try {
            hi.t1 t1Var = new hi.t1(2, recyclerView.getContext(), this);
            t1Var.a = i7;
            w0(t1Var);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
