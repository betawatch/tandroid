package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class rf extends mh.o0 {
    public final /* synthetic */ ChatActivityEnterView y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.y = chatActivityEnterView;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ChatActivityEnterView chatActivityEnterView = this.y;
        if (chatActivityEnterView.R0 == null || chatActivityEnterView.j3 != 1) {
            return;
        }
        chatActivityEnterView.U2.o(f10);
    }
}
