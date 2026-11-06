package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class gw extends v4.s {
    public final /* synthetic */ gy Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw(gy gyVar) {
        super(8);
        this.Q = gyVar;
    }

    @Override // v4.b0, v4.n0
    public final void v0(RecyclerView recyclerView, v4.a1 a1Var, int i7) {
        try {
            fi.j1 j1Var = new fi.j1(2, recyclerView.getContext(), this);
            j1Var.a = i7;
            w0(j1Var);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
