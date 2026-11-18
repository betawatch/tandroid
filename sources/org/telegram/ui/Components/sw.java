package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class sw extends v4.t {
    public final /* synthetic */ ry Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw(ry ryVar) {
        super(8);
        this.Q = ryVar;
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
