package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class wj0 extends ub {
    public final xj0 c;

    public wj0(Activity activity, String str) {
        super(activity, null);
        this.b.setText(str);
        this.b.setTranslationY(-1.0f);
        ImageView imageView = this.a;
        xj0 xj0Var = new xj0();
        this.c = xj0Var;
        imageView.setImageDrawable(xj0Var);
    }

    @Override // org.telegram.ui.Components.gb
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        xj0 xj0Var = this.c;
        xj0Var.getClass();
        xj0Var.g = System.currentTimeMillis();
        xj0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.gb
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        xj0 xj0Var = this.c;
        xj0Var.g = -1L;
        xj0Var.invalidateSelf();
    }
}
