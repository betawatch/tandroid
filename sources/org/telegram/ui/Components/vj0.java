package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class vj0 extends tb {
    public final wj0 c;

    public vj0(Activity activity, String str) {
        super(activity, null);
        this.b.setText(str);
        this.b.setTranslationY(-1.0f);
        ImageView imageView = this.a;
        wj0 wj0Var = new wj0();
        this.c = wj0Var;
        imageView.setImageDrawable(wj0Var);
    }

    @Override // org.telegram.ui.Components.fb
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        wj0 wj0Var = this.c;
        wj0Var.getClass();
        wj0Var.g = System.currentTimeMillis();
        wj0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.fb
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        wj0 wj0Var = this.c;
        wj0Var.g = -1L;
        wj0Var.invalidateSelf();
    }
}
