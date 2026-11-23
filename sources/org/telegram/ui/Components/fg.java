package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class fg extends ty {
    public final /* synthetic */ ChatActivityEnterView W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.g2 g2Var, boolean z10, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z11, org.telegram.ui.ActionBar.h6 h6Var, boolean z12, boolean z13) {
        super(g2Var, z10, true, true, context, true, chatFull, viewGroup, z11, h6Var, z12, z13);
        this.W2 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.ty, android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ChatActivityEnterView chatActivityEnterView = this.W2;
        if (chatActivityEnterView.W0 == null || chatActivityEnterView.e4 != 0) {
            return;
        }
        chatActivityEnterView.P3.x(f10);
    }
}
