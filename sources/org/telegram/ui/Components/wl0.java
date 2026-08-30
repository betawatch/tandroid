package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class wl0 extends ac {
    public final xl0 c;

    public wl0(Activity activity, String str) {
        super(activity, null);
        this.b.setText(str);
        this.b.setTranslationY(-1.0f);
        ImageView imageView = this.a;
        xl0 xl0Var = new xl0();
        this.c = xl0Var;
        imageView.setImageDrawable(xl0Var);
    }

    @Override // org.telegram.ui.Components.nb
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        xl0 xl0Var = this.c;
        xl0Var.getClass();
        xl0Var.g = System.currentTimeMillis();
        xl0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.nb
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        xl0 xl0Var = this.c;
        xl0Var.g = -1L;
        xl0Var.invalidateSelf();
    }
}
