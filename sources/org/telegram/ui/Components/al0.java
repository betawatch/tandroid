package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class al0 extends ob {
    public final bl0 c;

    public al0(Activity activity, String str) {
        super(activity, null);
        this.b.setText(str);
        this.b.setTranslationY(-1.0f);
        ImageView imageView = this.a;
        bl0 bl0Var = new bl0();
        this.c = bl0Var;
        imageView.setImageDrawable(bl0Var);
    }

    @Override // org.telegram.ui.Components.bb
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        bl0 bl0Var = this.c;
        bl0Var.getClass();
        bl0Var.g = System.currentTimeMillis();
        bl0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.bb
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        bl0 bl0Var = this.c;
        bl0Var.g = -1L;
        bl0Var.invalidateSelf();
    }
}
