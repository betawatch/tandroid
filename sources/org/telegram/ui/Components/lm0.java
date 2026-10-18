package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class lm0 extends ic {
    public final mm0 c;

    public lm0(Activity activity, String str) {
        super(activity, null);
        this.b.setText(str);
        this.b.setTranslationY(-1.0f);
        ImageView imageView = this.a;
        mm0 mm0Var = new mm0();
        this.c = mm0Var;
        imageView.setImageDrawable(mm0Var);
    }

    @Override // org.telegram.ui.Components.ub
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        mm0 mm0Var = this.c;
        mm0Var.getClass();
        mm0Var.g = System.currentTimeMillis();
        mm0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.ub
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        mm0 mm0Var = this.c;
        mm0Var.g = -1L;
        mm0Var.invalidateSelf();
    }
}
