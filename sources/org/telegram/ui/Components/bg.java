package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
