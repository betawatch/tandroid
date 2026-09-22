package org.telegram.ui.Components;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
