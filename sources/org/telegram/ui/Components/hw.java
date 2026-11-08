package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class hw extends v4.s {
    public final /* synthetic */ hy Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw(hy hyVar) {
        super(8);
        this.Q = hyVar;
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
