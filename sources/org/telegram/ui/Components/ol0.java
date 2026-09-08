package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ol0 extends ic {
    public final pl0 c;

    public ol0(Activity activity, String str) {
        super(activity, null);
        this.b.setText(str);
        this.b.setTranslationY(-1.0f);
        ImageView imageView = this.a;
        pl0 pl0Var = new pl0();
        this.c = pl0Var;
        imageView.setImageDrawable(pl0Var);
    }

    @Override // org.telegram.ui.Components.ub
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        pl0 pl0Var = this.c;
        pl0Var.getClass();
        pl0Var.g = System.currentTimeMillis();
        pl0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.ub
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        pl0 pl0Var = this.c;
        pl0Var.g = -1L;
        pl0Var.invalidateSelf();
    }
}
