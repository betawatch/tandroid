package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class te extends ImageView {
    public float a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.b = chatActivityEnterView;
    }

    @Override // android.view.View
    public final float getTranslationX() {
        return this.a;
    }

    @Override // android.view.View
    public final void setTranslationX(float f9) {
        this.a = f9;
        float dp = AndroidUtilities.dp(-44.0f) + this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        float f10 = dp + chatActivityEnterView.y + chatActivityEnterView.x;
        ve veVar = chatActivityEnterView.F1;
        float dp2 = AndroidUtilities.dp((veVar == null || veVar.getVisibility() != 0) ? 0.0f : -44.0f);
        ve veVar2 = chatActivityEnterView.F1;
        float alpha = (dp2 * (veVar2 == null ? 0.0f : veVar2.getAlpha())) + f10;
        ve veVar3 = chatActivityEnterView.s1;
        float dp3 = AndroidUtilities.dp((veVar3 == null || veVar3.getVisibility() != 0) ? 0.0f : -44.0f);
        ve veVar4 = chatActivityEnterView.s1;
        super.setTranslationX((dp3 * (veVar4 != null ? veVar4.getAlpha() : 0.0f)) + alpha);
    }
}
