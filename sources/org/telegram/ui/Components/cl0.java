package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class cl0 extends wb {
    public final dl0 c;

    public cl0(Activity activity, String str) {
        super(activity, null);
        this.b.setText(str);
        this.b.setTranslationY(-1.0f);
        ImageView imageView = this.a;
        dl0 dl0Var = new dl0();
        this.c = dl0Var;
        imageView.setImageDrawable(dl0Var);
    }

    @Override // org.telegram.ui.Components.jb
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        dl0 dl0Var = this.c;
        dl0Var.getClass();
        dl0Var.g = System.currentTimeMillis();
        dl0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.jb
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        dl0 dl0Var = this.c;
        dl0Var.g = -1L;
        dl0Var.invalidateSelf();
    }
}
