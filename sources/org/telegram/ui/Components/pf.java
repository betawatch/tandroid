package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class pf extends ki.m0 {
    public final /* synthetic */ ChatActivityEnterView E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.E = chatActivityEnterView;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ChatActivityEnterView chatActivityEnterView = this.E;
        if (chatActivityEnterView.W0 == null || chatActivityEnterView.W3 != 1) {
            return;
        }
        chatActivityEnterView.H3.y(f10);
    }
}
