package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class df extends xh.j0 {
    public final /* synthetic */ ChatActivityEnterView D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.D = chatActivityEnterView;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.D;
        if (chatActivityEnterView.V0 == null || chatActivityEnterView.o3 != 1) {
            return;
        }
        chatActivityEnterView.Z2.y(f7);
    }
}
