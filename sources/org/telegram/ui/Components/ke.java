package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ke implements b5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ ke(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.b5
    public final void I(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                this.b.T0(i10, z10, i11, true, 0L);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = this.b;
                chatActivityEnterView.T0(i10, z10, i11, true, 0L);
                ff ffVar = chatActivityEnterView.H0;
                if (ffVar != null) {
                    ffVar.i();
                    chatActivityEnterView.H0 = null;
                    break;
                }
                break;
        }
    }
}
