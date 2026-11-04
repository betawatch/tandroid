package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xd implements r4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ xd(ChatActivityEnterView chatActivityEnterView, int i3) {
        this.a = i3;
        this.b = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.r4
    public final void L(int i3, int i10, boolean z10) {
        switch (this.a) {
            case 0:
                this.b.S0(z10, i3, i10, 0L, true);
                break;
            case 1:
                this.b.S0(z10, i3, 0, 0L, true);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = this.b;
                boolean S0 = chatActivityEnterView.S0(z10, i3, i10, 0L, true);
                se seVar = chatActivityEnterView.M0;
                if (seVar != null) {
                    seVar.g(!S0);
                    chatActivityEnterView.M0 = null;
                    break;
                }
                break;
        }
    }
}
