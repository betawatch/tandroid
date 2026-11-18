package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class g01 extends v4.t {
    public final /* synthetic */ int Q;
    public final /* synthetic */ r11 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g01(r11 r11Var, int i7) {
        super(40);
        this.Q = i7;
        this.R = r11Var;
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
