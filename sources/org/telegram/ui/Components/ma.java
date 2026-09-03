package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class ma extends sa {
    public final LinearLayout U;
    public FrameLayout V;
    public qh.d W;

    public ma(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, false, false, false, 1, g6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    @Override // org.telegram.ui.Components.sa
    public final rl0 v(sl0 sl0Var) {
        return new fg.g(this, 2);
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return null;
    }
}
