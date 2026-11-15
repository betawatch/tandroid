package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class sf extends ly {
    public final /* synthetic */ ChatActivityEnterView W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.e2 e2Var, boolean z10, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z11, org.telegram.ui.ActionBar.e6 e6Var, boolean z12, boolean z13) {
        super(e2Var, z10, true, true, context, true, chatFull, viewGroup, z11, e6Var, z12, z13);
        this.W2 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.ly, android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ChatActivityEnterView chatActivityEnterView = this.W2;
        if (chatActivityEnterView.W0 == null || chatActivityEnterView.W3 != 0) {
            return;
        }
        chatActivityEnterView.H3.y(f10);
    }
}
