package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class bm0 extends hc {
    public final cm0 c;

    public bm0(Activity activity, String str) {
        super(activity, null);
        this.b.setText(str);
        this.b.setTranslationY(-1.0f);
        ImageView imageView = this.a;
        cm0 cm0Var = new cm0();
        this.c = cm0Var;
        imageView.setImageDrawable(cm0Var);
    }

    @Override // org.telegram.ui.Components.tb
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        cm0 cm0Var = this.c;
        cm0Var.getClass();
        cm0Var.g = System.currentTimeMillis();
        cm0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.tb
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        cm0 cm0Var = this.c;
        cm0Var.g = -1L;
        cm0Var.invalidateSelf();
    }
}
