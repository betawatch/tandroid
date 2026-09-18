package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class zl0 extends ic {
    public final am0 c;

    public zl0(Activity activity, String str) {
        super(activity, null);
        this.b.setText(str);
        this.b.setTranslationY(-1.0f);
        ImageView imageView = this.a;
        am0 am0Var = new am0();
        this.c = am0Var;
        imageView.setImageDrawable(am0Var);
    }

    @Override // org.telegram.ui.Components.ub
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        am0 am0Var = this.c;
        am0Var.getClass();
        am0Var.g = System.currentTimeMillis();
        am0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.ub
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        am0 am0Var = this.c;
        am0Var.g = -1L;
        am0Var.invalidateSelf();
    }
}
