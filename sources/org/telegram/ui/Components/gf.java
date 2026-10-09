package org.telegram.ui.Components;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class gf implements z81, f5 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ gf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.f5
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        boolean R0 = chatActivityEnterView.R0(i10, z10, i11, true, 0L);
        pf pfVar = chatActivityEnterView.L0;
        if (pfVar != null) {
            pfVar.h(!R0);
            chatActivityEnterView.L0 = null;
        }
    }
}
