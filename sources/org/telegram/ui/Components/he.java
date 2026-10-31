package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class he implements i71, q4 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ he(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.q4
    public void K(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        boolean R0 = chatActivityEnterView.R0(z10, i10, i11, 0L, true);
        pe peVar = chatActivityEnterView.L0;
        if (peVar != null) {
            peVar.g(!R0);
            chatActivityEnterView.L0 = null;
        }
    }
}
