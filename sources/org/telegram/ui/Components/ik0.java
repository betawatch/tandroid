package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ik0 extends yb {
    public final jk0 c;

    public ik0(Activity activity, String str) {
        super(activity, null);
        this.b.setText(str);
        this.b.setTranslationY(-1.0f);
        ImageView imageView = this.a;
        jk0 jk0Var = new jk0();
        this.c = jk0Var;
        imageView.setImageDrawable(jk0Var);
    }

    @Override // org.telegram.ui.Components.lb
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        jk0 jk0Var = this.c;
        jk0Var.getClass();
        jk0Var.g = System.currentTimeMillis();
        jk0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.lb
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        jk0 jk0Var = this.c;
        jk0Var.g = -1L;
        jk0Var.invalidateSelf();
    }
}
