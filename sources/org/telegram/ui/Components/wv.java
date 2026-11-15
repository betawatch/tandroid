package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class wv extends v4.s {
    public final /* synthetic */ ly Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv(ly lyVar) {
        super(5);
        this.Q = lyVar;
    }

    @Override // v4.s, v4.b0, v4.o0
    public final int o0(int i7, v4.w0 w0Var, v4.b1 b1Var) {
        int o02 = super.o0(i7, w0Var, b1Var);
        ly lyVar = this.Q;
        if (o02 != 0 && lyVar.E0.getScrollState() == 1) {
            lyVar.Y1 = false;
            lyVar.Z();
        }
        if (lyVar.U0 == null) {
            jg.d1 d1Var = new jg.d1(lyVar, lyVar.d1, lyVar.u1.a(), lyVar.u1.f(), 1);
            lyVar.U0 = d1Var;
            d1Var.a();
        }
        lyVar.U0.b();
        return o02;
    }

    @Override // v4.b0, v4.o0
    public final void v0(RecyclerView recyclerView, v4.b1 b1Var, int i7) {
        try {
            pi.l lVar = new pi.l(recyclerView.getContext(), 2);
            lVar.a = i7;
            w0(lVar);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
