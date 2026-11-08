package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class jf extends hi.k0 {
    public final /* synthetic */ ChatActivityEnterView D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
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
