package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class he implements x4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ he(ChatActivityEnterView chatActivityEnterView, int i9) {
        this.a = i9;
        this.b = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.x4
    public final void B(int i9, int i10, boolean z10) {
        switch (this.a) {
            case 0:
                this.b.T0(i9, z10, i10, true, 0L);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = this.b;
                chatActivityEnterView.T0(i9, z10, i10, true, 0L);
                cf cfVar = chatActivityEnterView.H0;
                if (cfVar != null) {
                    cfVar.i();
                    chatActivityEnterView.H0 = null;
                    break;
                }
                break;
        }
    }
}
