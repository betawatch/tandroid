package org.telegram.ui.Components;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class he implements y4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ he(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.y4
    public final void I(int i10, int i11, boolean z4) {
        switch (this.a) {
            case 0:
                this.b.T0(i10, z4, i11, true, 0L);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = this.b;
                chatActivityEnterView.T0(i10, z4, i11, true, 0L);
                cf cfVar = chatActivityEnterView.I0;
                if (cfVar != null) {
                    cfVar.i();
                    chatActivityEnterView.I0 = null;
                    break;
                }
                break;
        }
    }
}
