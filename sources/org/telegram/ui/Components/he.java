package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class he extends ImageView {
    public float a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.b = chatActivityEnterView;
    }

    @Override // android.view.View
    public final float getTranslationX() {
        return this.a;
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        this.a = f10;
        float L = org.telegram.messenger.g0.L(-44.0f) + this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        float f11 = L + chatActivityEnterView.D + chatActivityEnterView.y;
        je jeVar = chatActivityEnterView.K1;
        float L2 = org.telegram.messenger.g0.L((jeVar == null || jeVar.getVisibility() != 0) ? 0.0f : -44.0f);
        je jeVar2 = chatActivityEnterView.K1;
        float alpha = (L2 * (jeVar2 == null ? 0.0f : jeVar2.getAlpha())) + f11;
        je jeVar3 = chatActivityEnterView.x1;
        float L3 = org.telegram.messenger.g0.L((jeVar3 == null || jeVar3.getVisibility() != 0) ? 0.0f : -44.0f);
        je jeVar4 = chatActivityEnterView.x1;
        super.setTranslationX((L3 * (jeVar4 != null ? jeVar4.getAlpha() : 0.0f)) + alpha);
    }
}
