package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class lf extends gy {
    public final /* synthetic */ ChatActivityEnterView V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.f2 f2Var, boolean z9, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z10, org.telegram.ui.ActionBar.h6 h6Var, boolean z11, boolean z12) {
        super(f2Var, z9, true, true, context, true, chatFull, viewGroup, z10, h6Var, z11, z12);
        this.V2 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.gy, android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ChatActivityEnterView chatActivityEnterView = this.V2;
        if (chatActivityEnterView.V0 == null || chatActivityEnterView.o3 != 0) {
            return;
        }
        chatActivityEnterView.Z2.w(f10);
    }
}
