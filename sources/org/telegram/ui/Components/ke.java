package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                org.telegram.ui.fg0 fg0Var = chatActivityEnterView.M0;
                if (fg0Var != null) {
                    fg0Var.h(!s12);
                    chatActivityEnterView.M0 = null;
                    break;
                }
                break;
            default:
                this.b.s1(z10, i7, i10, 0L, true);
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                org.telegram.ui.fg0 fg0Var2 = chatActivityEnterView2.M0;
                if (fg0Var2 != null) {
                    fg0Var2.i();
                    chatActivityEnterView2.M0 = null;
                    break;
                }
                break;
        }
    }
}
