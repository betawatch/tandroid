package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class uf extends mz {
    public final /* synthetic */ ChatActivityEnterView M2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.p2 p2Var, boolean z4, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z10, org.telegram.ui.ActionBar.g6 g6Var, boolean z11, boolean z12) {
        super(p2Var, z4, true, true, context, true, chatFull, viewGroup, z10, g6Var, z11, z12);
        this.M2 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.mz, android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ChatActivityEnterView chatActivityEnterView = this.M2;
        if (chatActivityEnterView.S0 == null || chatActivityEnterView.k3 != 0) {
            return;
        }
        chatActivityEnterView.V2.x(f10);
    }
}
