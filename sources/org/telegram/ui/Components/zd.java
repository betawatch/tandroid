package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class zd implements t4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ zd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.t4
    public final void L(int i7, int i10, boolean z9) {
        switch (this.a) {
            case 0:
                this.b.T0(z9, i7, i10, 0L, true);
                break;
            case 1:
                this.b.T0(z9, i7, 0, 0L, true);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = this.b;
                boolean T0 = chatActivityEnterView.T0(z9, i7, i10, 0L, true);
                ue ueVar = chatActivityEnterView.L0;
                if (ueVar != null) {
                    ueVar.g(!T0);
                    chatActivityEnterView.L0 = null;
                    break;
                }
                break;
        }
    }
}
