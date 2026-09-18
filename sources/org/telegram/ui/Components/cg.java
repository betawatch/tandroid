package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class cg extends kz {
    public final /* synthetic */ ChatActivityEnterView P2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z11, org.telegram.ui.ActionBar.f6 f6Var, boolean z12, boolean z13) {
        super(o2Var, z10, true, true, context, true, chatFull, viewGroup, z11, f6Var, z12, z13);
        this.P2 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.kz, android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.P2;
        if (chatActivityEnterView.V0 == null || chatActivityEnterView.n3 != 0) {
            return;
        }
        chatActivityEnterView.Y2.y(f7);
    }
}
