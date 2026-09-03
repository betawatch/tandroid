package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class rf extends sh.l0 {
    public final /* synthetic */ ChatActivityEnterView y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.y = chatActivityEnterView;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ChatActivityEnterView chatActivityEnterView = this.y;
        if (chatActivityEnterView.S0 == null || chatActivityEnterView.k3 != 1) {
            return;
        }
        chatActivityEnterView.V2.x(f10);
    }
}
