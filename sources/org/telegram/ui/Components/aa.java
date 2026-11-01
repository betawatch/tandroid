package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
    public final tk0 L0(uk0 uk0Var) {
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
