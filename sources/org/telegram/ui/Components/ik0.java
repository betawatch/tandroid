package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
