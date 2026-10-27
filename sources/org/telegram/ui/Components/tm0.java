package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class tm0 extends ic {
    public final um0 c;

    public tm0(Activity activity, String str) {
        super(activity, null);
        this.b.setText(str);
        this.b.setTranslationY(-1.0f);
        ImageView imageView = this.a;
        um0 um0Var = new um0();
        this.c = um0Var;
        imageView.setImageDrawable(um0Var);
    }

    @Override // org.telegram.ui.Components.ub
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        um0 um0Var = this.c;
        um0Var.getClass();
        um0Var.g = System.currentTimeMillis();
        um0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.ub
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        um0 um0Var = this.c;
        um0Var.g = -1L;
        um0Var.invalidateSelf();
    }
}
