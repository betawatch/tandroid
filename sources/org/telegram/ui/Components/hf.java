package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class hf extends hi.k0 {
    public final /* synthetic */ ChatActivityEnterView D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.D = chatActivityEnterView;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ChatActivityEnterView chatActivityEnterView = this.D;
        if (chatActivityEnterView.V0 == null || chatActivityEnterView.o3 != 1) {
            return;
        }
        chatActivityEnterView.Z2.w(f10);
    }
}
