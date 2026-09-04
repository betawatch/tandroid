package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        cf cfVar = chatActivityEnterView.J1;
        float dp2 = AndroidUtilities.dp((cfVar == null || cfVar.getVisibility() != 0) ? 0.0f : -44.0f);
        cf cfVar2 = chatActivityEnterView.J1;
        float alpha = (dp2 * (cfVar2 == null ? 0.0f : cfVar2.getAlpha())) + f10;
        cf cfVar3 = chatActivityEnterView.w1;
        float dp3 = AndroidUtilities.dp((cfVar3 == null || cfVar3.getVisibility() != 0) ? 0.0f : -44.0f);
        cf cfVar4 = chatActivityEnterView.w1;
        super.setTranslationX((dp3 * (cfVar4 != null ? cfVar4.getAlpha() : 0.0f)) + alpha);
    }
}
