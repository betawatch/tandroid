package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ml0 extends ec {
    public final nl0 c;

    public ml0(Activity activity, String str) {
        super(activity, null);
        this.b.setText(str);
        this.b.setTranslationY(-1.0f);
        ImageView imageView = this.a;
        nl0 nl0Var = new nl0();
        this.c = nl0Var;
        imageView.setImageDrawable(nl0Var);
    }

    @Override // org.telegram.ui.Components.rb
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        nl0 nl0Var = this.c;
        nl0Var.getClass();
        nl0Var.g = System.currentTimeMillis();
        nl0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.rb
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        nl0 nl0Var = this.c;
        nl0Var.g = -1L;
        nl0Var.invalidateSelf();
    }
}
