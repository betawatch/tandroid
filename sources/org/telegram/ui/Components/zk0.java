package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zk0 extends yb {
    public final al0 c;

    public zk0(Activity activity, String str) {
        super(activity, null);
        this.b.setText(str);
        this.b.setTranslationY(-1.0f);
        ImageView imageView = this.a;
        al0 al0Var = new al0();
        this.c = al0Var;
        imageView.setImageDrawable(al0Var);
    }

    @Override // org.telegram.ui.Components.lb
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        al0 al0Var = this.c;
        al0Var.getClass();
        al0Var.g = System.currentTimeMillis();
        al0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.lb
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        al0 al0Var = this.c;
        al0Var.g = -1L;
        al0Var.invalidateSelf();
    }
}
