package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class cf extends ImageView {
    public float a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf(ChatActivityEnterView chatActivityEnterView, Context context) {
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
        ef efVar = chatActivityEnterView.K1;
        float dp2 = AndroidUtilities.dp((efVar == null || efVar.getVisibility() != 0) ? 0.0f : -44.0f);
        ef efVar2 = chatActivityEnterView.K1;
        float alpha = (dp2 * (efVar2 == null ? 0.0f : efVar2.getAlpha())) + f10;
        ef efVar3 = chatActivityEnterView.x1;
        float dp3 = AndroidUtilities.dp((efVar3 == null || efVar3.getVisibility() != 0) ? 0.0f : -44.0f);
        ef efVar4 = chatActivityEnterView.x1;
        super.setTranslationX((dp3 * (efVar4 != null ? efVar4.getAlpha() : 0.0f)) + alpha);
    }
}
