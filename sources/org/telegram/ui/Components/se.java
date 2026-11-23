package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class se extends ImageView {
    public float a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se(ChatActivityEnterView chatActivityEnterView, Context context) {
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
        float f11 = L + chatActivityEnterView.E + chatActivityEnterView.y;
        ie ieVar = chatActivityEnterView.A2;
        float L2 = org.telegram.messenger.g0.L((ieVar == null || ieVar.getVisibility() != 0) ? 0.0f : -44.0f);
        ie ieVar2 = chatActivityEnterView.A2;
        float alpha = (L2 * (ieVar2 == null ? 0.0f : ieVar2.getAlpha())) + f11;
        ie ieVar3 = chatActivityEnterView.n2;
        float L3 = org.telegram.messenger.g0.L((ieVar3 == null || ieVar3.getVisibility() != 0) ? 0.0f : -44.0f);
        ie ieVar4 = chatActivityEnterView.n2;
        super.setTranslationX((L3 * (ieVar4 != null ? ieVar4.getAlpha() : 0.0f)) + alpha);
    }
}
