package org.telegram.ui.Components;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class ef implements u71, d5 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ ef(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        boolean T0 = chatActivityEnterView.T0(i10, z10, i11, true, 0L);
        nf nfVar = chatActivityEnterView.L0;
        if (nfVar != null) {
            nfVar.h(!T0);
            chatActivityEnterView.L0 = null;
        }
    }
}
