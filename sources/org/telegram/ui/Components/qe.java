package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class qe extends ImageView {
    public float a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe(ChatActivityEnterView chatActivityEnterView, Context context) {
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
        se seVar = chatActivityEnterView.G1;
        float dp2 = AndroidUtilities.dp((seVar == null || seVar.getVisibility() != 0) ? 0.0f : -44.0f);
        se seVar2 = chatActivityEnterView.G1;
        float alpha = (dp2 * (seVar2 == null ? 0.0f : seVar2.getAlpha())) + f11;
        se seVar3 = chatActivityEnterView.t1;
        float dp3 = AndroidUtilities.dp((seVar3 == null || seVar3.getVisibility() != 0) ? 0.0f : -44.0f);
        se seVar4 = chatActivityEnterView.t1;
        super.setTranslationX((dp3 * (seVar4 != null ? seVar4.getAlpha() : 0.0f)) + alpha);
    }
}
