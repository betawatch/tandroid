package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class zd implements s4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ zd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.s4
    public final void L(int i7, int i10, boolean z9) {
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.b;
                boolean T0 = chatActivityEnterView.T0(z9, i7, i10, 0L, true);
                te teVar = chatActivityEnterView.L0;
                if (teVar != null) {
                    teVar.g(!T0);
                    chatActivityEnterView.L0 = null;
                    break;
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.T0(z9, i7, i10, 0L, true);
                te teVar2 = chatActivityEnterView2.L0;
                if (teVar2 != null) {
                    teVar2.h();
                    chatActivityEnterView2.L0 = null;
                    break;
                }
                break;
        }
    }
}
