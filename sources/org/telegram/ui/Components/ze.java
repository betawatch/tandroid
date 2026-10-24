package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ze extends ImageView {
    public float a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze(ChatActivityEnterView chatActivityEnterView, Context context) {
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
        bf bfVar = chatActivityEnterView.K1;
        float dp2 = AndroidUtilities.dp((bfVar == null || bfVar.getVisibility() != 0) ? 0.0f : -44.0f);
        bf bfVar2 = chatActivityEnterView.K1;
        float alpha = (dp2 * (bfVar2 == null ? 0.0f : bfVar2.getAlpha())) + f10;
        bf bfVar3 = chatActivityEnterView.x1;
        float dp3 = AndroidUtilities.dp((bfVar3 == null || bfVar3.getVisibility() != 0) ? 0.0f : -44.0f);
        bf bfVar4 = chatActivityEnterView.x1;
        super.setTranslationX((dp3 * (bfVar4 != null ? bfVar4.getAlpha() : 0.0f)) + alpha);
    }
}
