package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class fm0 extends jc {
    public final gm0 c;

    public fm0(Activity activity, String str) {
        super(activity, null);
        this.b.setText(str);
        this.b.setTranslationY(-1.0f);
        ImageView imageView = this.a;
        gm0 gm0Var = new gm0();
        this.c = gm0Var;
        imageView.setImageDrawable(gm0Var);
    }

    @Override // org.telegram.ui.Components.vb
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        gm0 gm0Var = this.c;
        gm0Var.getClass();
        gm0Var.g = System.currentTimeMillis();
        gm0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.vb
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        gm0 gm0Var = this.c;
        gm0Var.g = -1L;
        gm0Var.invalidateSelf();
    }
}
