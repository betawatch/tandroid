package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class le implements z4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ le(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.z4
    public void I(int i7, int i10, boolean z10) {
        switch (this.a) {
            case 0:
                boolean x12 = this.b.x1(z10, i7, i10, 0L, true);
                ChatActivityEnterView chatActivityEnterView = this.b;
                org.telegram.ui.dg0 dg0Var = chatActivityEnterView.M0;
                if (dg0Var != null) {
                    dg0Var.h(!x12);
                    chatActivityEnterView.M0 = null;
                    break;
                }
                break;
            default:
                this.b.x1(z10, i7, i10, 0L, true);
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                org.telegram.ui.dg0 dg0Var2 = chatActivityEnterView2.M0;
                if (dg0Var2 != null) {
                    dg0Var2.i();
                    chatActivityEnterView2.M0 = null;
                    break;
                }
                break;
        }
    }
}
