package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class yf extends ki.m0 {
    public final /* synthetic */ ChatActivityEnterView E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.E = chatActivityEnterView;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ChatActivityEnterView chatActivityEnterView = this.E;
        if (chatActivityEnterView.W0 == null || chatActivityEnterView.c4 != 1) {
            return;
        }
        chatActivityEnterView.N3.x(f10);
    }
}
