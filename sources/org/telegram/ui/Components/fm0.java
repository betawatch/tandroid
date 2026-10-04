package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
