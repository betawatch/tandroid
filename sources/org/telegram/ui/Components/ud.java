package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ud implements q4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ ud(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.q4
    public final void K(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                this.b.R0(z10, i10, i11, 0L, true);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = this.b;
                chatActivityEnterView.R0(z10, i10, i11, 0L, true);
                pe peVar = chatActivityEnterView.L0;
                if (peVar != null) {
                    peVar.h();
                    chatActivityEnterView.L0 = null;
                    break;
                }
                break;
        }
    }
}
