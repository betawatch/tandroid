package org.telegram.ui.Components;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class oe implements b5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ oe(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.b5
    public final void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                this.b.U0(i10, z10, i11, true, 0L);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = this.b;
                chatActivityEnterView.U0(i10, z10, i11, true, 0L);
                kf kfVar = chatActivityEnterView.L0;
                if (kfVar != null) {
                    kfVar.i();
                    chatActivityEnterView.L0 = null;
                    break;
                }
                break;
        }
    }
}
