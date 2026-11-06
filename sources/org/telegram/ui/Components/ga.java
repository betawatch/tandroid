package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public abstract class ga extends na {
    public final LinearLayout P1;
    public FrameLayout Q1;
    public fi.d R1;

    public ga(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, false, false, f6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.P1 = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override // org.telegram.ui.Components.na
    public final oj0 L0(pj0 pj0Var) {
        return new bi.k5(this, 2);
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.l1.setTitle(charSequence);
    }
}
