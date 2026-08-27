package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class qe implements a71, x4 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ qe(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.x4
    public void I(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        boolean T0 = chatActivityEnterView.T0(i10, z10, i11, true, 0L);
        ye yeVar = chatActivityEnterView.H0;
        if (yeVar != null) {
            yeVar.h(!T0);
            chatActivityEnterView.H0 = null;
        }
    }
}
