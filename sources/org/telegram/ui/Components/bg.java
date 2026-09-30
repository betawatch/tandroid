package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class bg extends ei.p0 {
    public final /* synthetic */ ChatActivityEnterView y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.y = chatActivityEnterView;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.y;
        if (chatActivityEnterView.V0 == null || chatActivityEnterView.o3 != 1) {
            return;
        }
        chatActivityEnterView.Z2.y(f7);
    }
}
