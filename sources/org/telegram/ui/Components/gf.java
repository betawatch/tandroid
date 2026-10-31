package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class gf extends vy {
    public final /* synthetic */ ChatActivityEnterView V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.k2 k2Var, boolean z10, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z11, org.telegram.ui.ActionBar.p6 p6Var, boolean z12, boolean z13) {
        super(k2Var, z10, true, true, context, true, chatFull, viewGroup, z11, p6Var, z12, z13);
        this.V2 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.vy, android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.V2;
        if (chatActivityEnterView.V0 == null || chatActivityEnterView.o3 != 0) {
            return;
        }
        chatActivityEnterView.Z2.y(f7);
    }
}
