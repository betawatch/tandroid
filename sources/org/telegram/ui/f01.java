package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class f01 extends v4.s {
    public final /* synthetic */ int Q;
    public final /* synthetic */ q11 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f01(q11 q11Var, int i7) {
        super(40);
        this.Q = i7;
        this.R = q11Var;
    }

    @Override // v4.b0, v4.n0
    public final void v0(RecyclerView recyclerView, v4.a1 a1Var, int i7) {
        switch (this.Q) {
            case 0:
                try {
                    fi.j1 j1Var = new fi.j1(3, recyclerView.getContext(), this);
                    j1Var.a = i7;
                    w0(j1Var);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            default:
                try {
                    fi.j1 j1Var2 = new fi.j1(5, recyclerView.getContext(), this);
                    j1Var2.a = i7;
                    w0(j1Var2);
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
        }
    }
}
