package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class mm0 extends ic {
    public final nm0 c;

    public mm0(Activity activity, String str) {
        super(activity, null);
        this.b.setText(str);
        this.b.setTranslationY(-1.0f);
        ImageView imageView = this.a;
        nm0 nm0Var = new nm0();
        this.c = nm0Var;
        imageView.setImageDrawable(nm0Var);
    }

    @Override // org.telegram.ui.Components.ub
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        nm0 nm0Var = this.c;
        nm0Var.getClass();
        nm0Var.g = System.currentTimeMillis();
        nm0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.ub
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        nm0 nm0Var = this.c;
        nm0Var.g = -1L;
        nm0Var.invalidateSelf();
    }
}
