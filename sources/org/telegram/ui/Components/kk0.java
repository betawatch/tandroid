package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class kk0 extends yb {
    public final lk0 c;

    public kk0(Activity activity, String str) {
        super(activity, null);
        this.b.setText(str);
        this.b.setTranslationY(-1.0f);
        ImageView imageView = this.a;
        lk0 lk0Var = new lk0();
        this.c = lk0Var;
        imageView.setImageDrawable(lk0Var);
    }

    @Override // org.telegram.ui.Components.lb
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        lk0 lk0Var = this.c;
        lk0Var.getClass();
        lk0Var.g = System.currentTimeMillis();
        lk0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.lb
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        lk0 lk0Var = this.c;
        lk0Var.g = -1L;
        lk0Var.invalidateSelf();
    }
}
