package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class f01 extends v4.t {
    public final /* synthetic */ int Q;
    public final /* synthetic */ q11 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f01(q11 q11Var, int i7) {
        super(40);
        this.Q = i7;
        this.R = q11Var;
    }

    @Override // v4.c0, v4.p0
    public final void v0(RecyclerView recyclerView, v4.c1 c1Var, int i7) {
        switch (this.Q) {
            case 0:
                try {
                    hi.t1 t1Var = new hi.t1(3, recyclerView.getContext(), this);
                    t1Var.a = i7;
                    w0(t1Var);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            default:
                try {
                    hi.t1 t1Var2 = new hi.t1(5, recyclerView.getContext(), this);
                    t1Var2.a = i7;
                    w0(t1Var2);
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
        }
    }
}
