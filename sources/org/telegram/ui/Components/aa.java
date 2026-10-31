package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class aa extends ha {
    public final LinearLayout P1;
    public FrameLayout Q1;
    public vh.d R1;

    public aa(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, null, false, false, p6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.P1 = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override // org.telegram.ui.Components.ha
    public final sk0 L0(tk0 tk0Var) {
        return new kg.f(this, 2);
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.l1.setTitle(charSequence);
    }
}
