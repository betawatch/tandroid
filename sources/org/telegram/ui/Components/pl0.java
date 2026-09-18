package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class pl0 extends gc {
    public final ql0 c;

    public pl0(Activity activity, String str) {
        super(activity, null);
        this.b.setText(str);
        this.b.setTranslationY(-1.0f);
        ImageView imageView = this.a;
        ql0 ql0Var = new ql0();
        this.c = ql0Var;
        imageView.setImageDrawable(ql0Var);
    }

    @Override // org.telegram.ui.Components.sb
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        ql0 ql0Var = this.c;
        ql0Var.getClass();
        ql0Var.g = System.currentTimeMillis();
        ql0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.sb
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        ql0 ql0Var = this.c;
        ql0Var.g = -1L;
        ql0Var.invalidateSelf();
    }
}
