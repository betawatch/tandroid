package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public abstract class wa extends db {
    public final LinearLayout X;
    public FrameLayout Y;
    public di.d Z;

    public wa(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, false, false, c6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.X = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override // org.telegram.ui.Components.db
    public final CharSequence B() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    @Override // org.telegram.ui.Components.db
    public final lm0 x(mm0 mm0Var) {
        return new hg.m0(this, 1);
    }
}
