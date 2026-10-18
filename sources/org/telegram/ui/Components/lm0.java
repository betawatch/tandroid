package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class lm0 extends ic {
    public final mm0 c;

    public lm0(Activity activity, String str) {
        super(activity, null);
        this.b.setText(str);
        this.b.setTranslationY(-1.0f);
        ImageView imageView = this.a;
        mm0 mm0Var = new mm0();
        this.c = mm0Var;
        imageView.setImageDrawable(mm0Var);
    }

    @Override // org.telegram.ui.Components.ub
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        mm0 mm0Var = this.c;
        mm0Var.getClass();
        mm0Var.g = System.currentTimeMillis();
        mm0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.ub
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        mm0 mm0Var = this.c;
        mm0Var.g = -1L;
        mm0Var.invalidateSelf();
    }
}
