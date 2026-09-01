package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class xl0 extends ac {
    public final yl0 c;

    public xl0(Activity activity, String str) {
        super(activity, null);
        this.b.setText(str);
        this.b.setTranslationY(-1.0f);
        ImageView imageView = this.a;
        yl0 yl0Var = new yl0();
        this.c = yl0Var;
        imageView.setImageDrawable(yl0Var);
    }

    @Override // org.telegram.ui.Components.nb
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        yl0 yl0Var = this.c;
        yl0Var.getClass();
        yl0Var.g = System.currentTimeMillis();
        yl0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.nb
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        yl0 yl0Var = this.c;
        yl0Var.g = -1L;
        yl0Var.invalidateSelf();
    }
}
