package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class ra extends xa {
    public final LinearLayout T;
    public FrameLayout U;
    public nh.d V;

    public ra(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, false, false, false, 1, c6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.T = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    @Override // org.telegram.ui.Components.xa
    public final il0 v(jl0 jl0Var) {
        return new cg.g(this, 2);
    }

    @Override // org.telegram.ui.Components.xa
    public final CharSequence y() {
        return null;
    }
}
