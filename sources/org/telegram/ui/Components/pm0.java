package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class pm0 extends ic {
    public final qm0 c;

    public pm0(Activity activity, String str) {
        super(activity, null);
        this.b.setText(str);
        this.b.setTranslationY(-1.0f);
        ImageView imageView = this.a;
        qm0 qm0Var = new qm0();
        this.c = qm0Var;
        imageView.setImageDrawable(qm0Var);
    }

    @Override // org.telegram.ui.Components.ub
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        qm0 qm0Var = this.c;
        qm0Var.getClass();
        qm0Var.g = System.currentTimeMillis();
        qm0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.ub
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        qm0 qm0Var = this.c;
        qm0Var.g = -1L;
        qm0Var.invalidateSelf();
    }
}
