package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class eg extends kz {
    public final /* synthetic */ ChatActivityEnterView P2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z11, org.telegram.ui.ActionBar.f6 f6Var, boolean z12, boolean z13) {
        super(n2Var, z10, true, true, context, true, chatFull, viewGroup, z11, f6Var, z12, z13);
        this.P2 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.kz, android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.P2;
        if (chatActivityEnterView.V0 == null || chatActivityEnterView.n3 != 0) {
            return;
        }
        chatActivityEnterView.Y2.x(f7);
    }
}
