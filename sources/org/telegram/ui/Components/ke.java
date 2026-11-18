package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ke implements z4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ ke(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.z4
    public void O(int i7, int i10, boolean z10) {
        switch (this.a) {
            case 0:
                boolean s12 = this.b.s1(z10, i7, i10, 0L, true);
                ChatActivityEnterView chatActivityEnterView = this.b;
                org.telegram.ui.eg0 eg0Var = chatActivityEnterView.M0;
                if (eg0Var != null) {
                    eg0Var.h(!s12);
                    chatActivityEnterView.M0 = null;
                    break;
                }
                break;
            default:
                this.b.s1(z10, i7, i10, 0L, true);
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
