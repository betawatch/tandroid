package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public abstract class sa extends za {
    public final LinearLayout X;
    public FrameLayout Y;
    public ci.d Z;

    public sa(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, false, false, e6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.X = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    @Override // org.telegram.ui.Components.za
    public final kl0 v(ll0 ll0Var) {
        return new gg.n0(this, 1);
    }

    @Override // org.telegram.ui.Components.za
    public final CharSequence y() {
        return null;
    }
}
