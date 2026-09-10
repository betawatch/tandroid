package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class yl0 extends hc {
    public final zl0 c;

    public yl0(Activity activity, String str) {
        super(activity, null);
        this.b.setText(str);
        this.b.setTranslationY(-1.0f);
        ImageView imageView = this.a;
        zl0 zl0Var = new zl0();
        this.c = zl0Var;
        imageView.setImageDrawable(zl0Var);
    }

    @Override // org.telegram.ui.Components.tb
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        zl0 zl0Var = this.c;
        zl0Var.getClass();
        zl0Var.g = System.currentTimeMillis();
        zl0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.tb
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        zl0 zl0Var = this.c;
        zl0Var.g = -1L;
        zl0Var.invalidateSelf();
    }
}
