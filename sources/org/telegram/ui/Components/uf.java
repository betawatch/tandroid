package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class uf extends kz {
    public final /* synthetic */ ChatActivityEnterView M2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.p2 p2Var, boolean z4, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z10, org.telegram.ui.ActionBar.f6 f6Var, boolean z11, boolean z12) {
        super(p2Var, z4, true, true, context, true, chatFull, viewGroup, z10, f6Var, z11, z12);
        this.M2 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.kz, android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ChatActivityEnterView chatActivityEnterView = this.M2;
        if (chatActivityEnterView.S0 == null || chatActivityEnterView.k3 != 0) {
            return;
        }
        chatActivityEnterView.V2.x(f10);
    }
}
