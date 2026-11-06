package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class ie extends ImageView {
    public float a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie(ChatActivityEnterView chatActivityEnterView, Context context) {
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
        ke keVar = chatActivityEnterView.K1;
        float L2 = org.telegram.messenger.g0.L((keVar == null || keVar.getVisibility() != 0) ? 0.0f : -44.0f);
        ke keVar2 = chatActivityEnterView.K1;
        float alpha = (L2 * (keVar2 == null ? 0.0f : keVar2.getAlpha())) + f11;
        ke keVar3 = chatActivityEnterView.x1;
        float L3 = org.telegram.messenger.g0.L((keVar3 == null || keVar3.getVisibility() != 0) ? 0.0f : -44.0f);
        ke keVar4 = chatActivityEnterView.x1;
        super.setTranslationX((L3 * (keVar4 != null ? keVar4.getAlpha() : 0.0f)) + alpha);
    }
}
