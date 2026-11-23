package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class h01 extends v4.t {
    public final /* synthetic */ int Q;
    public final /* synthetic */ s11 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h01(s11 s11Var, int i7) {
        super(40);
        this.Q = i7;
        this.R = s11Var;
    }

    @Override // v4.c0, v4.p0
    public final void v0(RecyclerView recyclerView, v4.c1 c1Var, int i7) {
        switch (this.Q) {
            case 0:
                try {
                    hi.l1 l1Var = new hi.l1(3, recyclerView.getContext(), this);
                    l1Var.a = i7;
                    w0(l1Var);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            default:
                try {
                    hi.l1 l1Var2 = new hi.l1(5, recyclerView.getContext(), this);
                    l1Var2.a = i7;
                    w0(l1Var2);
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
        }
    }
}
