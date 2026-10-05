package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public abstract class va extends cb {
    public final LinearLayout X;
    public FrameLayout Y;
    public ci.d Z;

    public va(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null, false, false, d6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.X = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    @Override // org.telegram.ui.Components.cb
    public final yl0 v(zl0 zl0Var) {
        return new gg.n0(this, 1);
    }

    @Override // org.telegram.ui.Components.cb
    public final CharSequence y() {
        return null;
    }
}
