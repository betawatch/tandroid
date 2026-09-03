package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class vl0 extends ac {
    public final wl0 c;

    public vl0(Activity activity, String str) {
        super(activity, null);
        this.b.setText(str);
        this.b.setTranslationY(-1.0f);
        ImageView imageView = this.a;
        wl0 wl0Var = new wl0();
        this.c = wl0Var;
        imageView.setImageDrawable(wl0Var);
    }

    @Override // org.telegram.ui.Components.nb
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        wl0 wl0Var = this.c;
        wl0Var.getClass();
        wl0Var.g = System.currentTimeMillis();
        wl0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.nb
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        wl0 wl0Var = this.c;
        wl0Var.g = -1L;
        wl0Var.invalidateSelf();
    }
}
