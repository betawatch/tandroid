package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class mw extends v4.s {
    public final /* synthetic */ ly Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw(ly lyVar) {
        super(8);
        this.Q = lyVar;
    }

    @Override // v4.b0, v4.o0
    public final void v0(RecyclerView recyclerView, v4.b1 b1Var, int i7) {
        try {
            hi.l1 l1Var = new hi.l1(2, recyclerView.getContext(), this);
            l1Var.a = i7;
            w0(l1Var);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
