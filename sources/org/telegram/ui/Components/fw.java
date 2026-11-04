package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class fw extends u4.s {
    public final /* synthetic */ ey Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw(ey eyVar) {
        super(8);
        this.Q = eyVar;
    }

    @Override // u4.b0, u4.o0
    public final void v0(RecyclerView recyclerView, u4.a1 a1Var, int i3) {
        try {
            gi.j1 j1Var = new gi.j1(2, recyclerView.getContext(), this);
            j1Var.a = i3;
            w0(j1Var);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
