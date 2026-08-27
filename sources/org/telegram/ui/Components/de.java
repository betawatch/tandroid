package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class de implements x4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ de(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.x4
    public final void I(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                this.b.T0(i10, z10, i11, true, 0L);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = this.b;
                chatActivityEnterView.T0(i10, z10, i11, true, 0L);
                ye yeVar = chatActivityEnterView.H0;
                if (yeVar != null) {
                    yeVar.i();
                    chatActivityEnterView.H0 = null;
                    break;
                }
                break;
        }
    }
}
