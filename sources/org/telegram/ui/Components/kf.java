package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class kf extends ey {
    public final /* synthetic */ ChatActivityEnterView W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.d2 d2Var, boolean z10, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z11, org.telegram.ui.ActionBar.e6 e6Var, boolean z12, boolean z13) {
        super(d2Var, z10, true, true, context, true, chatFull, viewGroup, z11, e6Var, z12, z13);
        this.W2 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.ey, android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ChatActivityEnterView chatActivityEnterView = this.W2;
        if (chatActivityEnterView.W0 == null || chatActivityEnterView.p3 != 0) {
            return;
        }
        chatActivityEnterView.a3.x(f10);
    }
}
