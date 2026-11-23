package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ke implements a5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ ke(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.a5
    public void O(int i7, int i10, boolean z10) {
        switch (this.a) {
            case 0:
                boolean w12 = this.b.w1(z10, i7, i10, 0L, true);
                ChatActivityEnterView chatActivityEnterView = this.b;
                org.telegram.ui.eg0 eg0Var = chatActivityEnterView.M0;
                if (eg0Var != null) {
                    eg0Var.h(!w12);
                    chatActivityEnterView.M0 = null;
                    break;
                }
                break;
            default:
                this.b.w1(z10, i7, i10, 0L, true);
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                org.telegram.ui.eg0 eg0Var2 = chatActivityEnterView2.M0;
                if (eg0Var2 != null) {
                    eg0Var2.i();
                    chatActivityEnterView2.M0 = null;
                    break;
                }
                break;
        }
    }
}
