package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class bf extends ImageView {
    public float a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.b = chatActivityEnterView;
    }

    @Override // android.view.View
    public final float getTranslationX() {
        return this.a;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        this.a = f7;
        float dp = AndroidUtilities.dp(-44.0f) + this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        float f10 = dp + chatActivityEnterView.y + chatActivityEnterView.x;
        df dfVar = chatActivityEnterView.K1;
        float dp2 = AndroidUtilities.dp((dfVar == null || dfVar.getVisibility() != 0) ? 0.0f : -44.0f);
        df dfVar2 = chatActivityEnterView.K1;
        float alpha = (dp2 * (dfVar2 == null ? 0.0f : dfVar2.getAlpha())) + f10;
        df dfVar3 = chatActivityEnterView.x1;
        float dp3 = AndroidUtilities.dp((dfVar3 == null || dfVar3.getVisibility() != 0) ? 0.0f : -44.0f);
        df dfVar4 = chatActivityEnterView.x1;
        super.setTranslationX((dp3 * (dfVar4 != null ? dfVar4.getAlpha() : 0.0f)) + alpha);
    }
}
