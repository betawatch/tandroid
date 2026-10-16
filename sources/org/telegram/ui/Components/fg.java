package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class fg extends wz {
    public final /* synthetic */ ChatActivityEnterView P2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.m2 m2Var, boolean z10, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z11, org.telegram.ui.ActionBar.c6 c6Var, boolean z12, boolean z13) {
        super(m2Var, z10, true, true, context, true, chatFull, viewGroup, z11, c6Var, z12, z13);
        this.P2 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.wz, android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.P2;
        if (chatActivityEnterView.V0 == null || chatActivityEnterView.o3 != 0) {
            return;
        }
        chatActivityEnterView.Z2.A(f7);
    }
}
