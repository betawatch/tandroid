package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class xe extends ImageView {
    public float a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe(ChatActivityEnterView chatActivityEnterView, Context context) {
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
        ze zeVar = chatActivityEnterView.J1;
        float dp2 = AndroidUtilities.dp((zeVar == null || zeVar.getVisibility() != 0) ? 0.0f : -44.0f);
        ze zeVar2 = chatActivityEnterView.J1;
        float alpha = (dp2 * (zeVar2 == null ? 0.0f : zeVar2.getAlpha())) + f10;
        ze zeVar3 = chatActivityEnterView.w1;
        float dp3 = AndroidUtilities.dp((zeVar3 == null || zeVar3.getVisibility() != 0) ? 0.0f : -44.0f);
        ze zeVar4 = chatActivityEnterView.w1;
        super.setTranslationX((dp3 * (zeVar4 != null ? zeVar4.getAlpha() : 0.0f)) + alpha);
    }
}
