package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class fa extends ma {
    public final LinearLayout S1;
    public FrameLayout T1;
    public fi.d U1;

    public fa(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null, false, false, h6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.S1 = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override // org.telegram.ui.Components.ma
    public final oj0 L0(pj0 pj0Var) {
        return new bi.k5(this, 2);
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.o1.setTitle(charSequence);
    }
}
