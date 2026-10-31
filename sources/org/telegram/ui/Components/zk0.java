package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zk0 extends ob {
    public final al0 c;

    public zk0(Activity activity, String str) {
        super(activity, null);
        this.b.setText(str);
        this.b.setTranslationY(-1.0f);
        ImageView imageView = this.a;
        al0 al0Var = new al0();
        this.c = al0Var;
        imageView.setImageDrawable(al0Var);
    }

    @Override // org.telegram.ui.Components.bb
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        al0 al0Var = this.c;
        al0Var.getClass();
        al0Var.g = System.currentTimeMillis();
        al0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.bb
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        al0 al0Var = this.c;
        al0Var.g = -1L;
        al0Var.invalidateSelf();
    }
}
