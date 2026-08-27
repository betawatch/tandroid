package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class me extends ImageView {
    public float a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me(ChatActivityEnterView chatActivityEnterView, Context context) {
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
        float dp = AndroidUtilities.dp(-44.0f) + this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        float f11 = dp + chatActivityEnterView.y + chatActivityEnterView.x;
        oe oeVar = chatActivityEnterView.F1;
        float dp2 = AndroidUtilities.dp((oeVar == null || oeVar.getVisibility() != 0) ? 0.0f : -44.0f);
        oe oeVar2 = chatActivityEnterView.F1;
        float alpha = (dp2 * (oeVar2 == null ? 0.0f : oeVar2.getAlpha())) + f11;
        oe oeVar3 = chatActivityEnterView.s1;
        float dp3 = AndroidUtilities.dp((oeVar3 == null || oeVar3.getVisibility() != 0) ? 0.0f : -44.0f);
        oe oeVar4 = chatActivityEnterView.s1;
        super.setTranslationX((dp3 * (oeVar4 != null ? oeVar4.getAlpha() : 0.0f)) + alpha);
    }
}
