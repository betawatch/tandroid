package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ol0 extends gc {
    public final pl0 c;

    public ol0(Activity activity, String str) {
        super(activity, null);
        this.b.setText(str);
        this.b.setTranslationY(-1.0f);
        ImageView imageView = this.a;
        pl0 pl0Var = new pl0();
        this.c = pl0Var;
        imageView.setImageDrawable(pl0Var);
    }

    @Override // org.telegram.ui.Components.sb
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        pl0 pl0Var = this.c;
        pl0Var.getClass();
        pl0Var.g = System.currentTimeMillis();
        pl0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.sb
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        pl0 pl0Var = this.c;
        pl0Var.g = -1L;
        pl0Var.invalidateSelf();
    }
}
