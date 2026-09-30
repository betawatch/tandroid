package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class bm0 extends ic {
    public final cm0 c;

    public bm0(Activity activity, String str) {
        super(activity, null);
        this.b.setText(str);
        this.b.setTranslationY(-1.0f);
        ImageView imageView = this.a;
        cm0 cm0Var = new cm0();
        this.c = cm0Var;
        imageView.setImageDrawable(cm0Var);
    }

    @Override // org.telegram.ui.Components.ub
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        cm0 cm0Var = this.c;
        cm0Var.getClass();
        cm0Var.g = System.currentTimeMillis();
        cm0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.ub
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        cm0 cm0Var = this.c;
        cm0Var.g = -1L;
        cm0Var.invalidateSelf();
    }
}
