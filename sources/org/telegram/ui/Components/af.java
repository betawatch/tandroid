package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class af extends ImageView {
    public float a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(ChatActivityEnterView chatActivityEnterView, Context context) {
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
        cf cfVar = chatActivityEnterView.K1;
        float dp2 = AndroidUtilities.dp((cfVar == null || cfVar.getVisibility() != 0) ? 0.0f : -44.0f);
        cf cfVar2 = chatActivityEnterView.K1;
        float alpha = (dp2 * (cfVar2 == null ? 0.0f : cfVar2.getAlpha())) + f10;
        cf cfVar3 = chatActivityEnterView.x1;
        float dp3 = AndroidUtilities.dp((cfVar3 == null || cfVar3.getVisibility() != 0) ? 0.0f : -44.0f);
        cf cfVar4 = chatActivityEnterView.x1;
        super.setTranslationX((dp3 * (cfVar4 != null ? cfVar4.getAlpha() : 0.0f)) + alpha);
    }
}
