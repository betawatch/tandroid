package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class tm0 extends lc {
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

    @Override // org.telegram.ui.Components.xb
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        um0 um0Var = this.c;
        um0Var.getClass();
        um0Var.g = System.currentTimeMillis();
        um0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.xb
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        um0 um0Var = this.c;
        um0Var.g = -1L;
        um0Var.invalidateSelf();
    }
}
