package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class de extends ImageView {
    public float a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de(ChatActivityEnterView chatActivityEnterView, Context context) {
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
        float L = org.telegram.messenger.i0.L(-44.0f) + this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        float f10 = L + chatActivityEnterView.D + chatActivityEnterView.y;
        fe feVar = chatActivityEnterView.K1;
        float L2 = org.telegram.messenger.i0.L((feVar == null || feVar.getVisibility() != 0) ? 0.0f : -44.0f);
        fe feVar2 = chatActivityEnterView.K1;
        float alpha = (L2 * (feVar2 == null ? 0.0f : feVar2.getAlpha())) + f10;
        fe feVar3 = chatActivityEnterView.x1;
        float L3 = org.telegram.messenger.i0.L((feVar3 == null || feVar3.getVisibility() != 0) ? 0.0f : -44.0f);
        fe feVar4 = chatActivityEnterView.x1;
        super.setTranslationX((L3 * (feVar4 != null ? feVar4.getAlpha() : 0.0f)) + alpha);
    }
}
