package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zj0 extends sb {
    public final ak0 c;

    public zj0(Activity activity, String str) {
        super(activity, null);
        this.b.setText(str);
        this.b.setTranslationY(-1.0f);
        ImageView imageView = this.a;
        ak0 ak0Var = new ak0();
        this.c = ak0Var;
        imageView.setImageDrawable(ak0Var);
    }

    @Override // org.telegram.ui.Components.fb
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        ak0 ak0Var = this.c;
        ak0Var.getClass();
        ak0Var.g = System.currentTimeMillis();
        ak0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.fb
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        ak0 ak0Var = this.c;
        ak0Var.g = -1L;
        ak0Var.invalidateSelf();
    }
}
