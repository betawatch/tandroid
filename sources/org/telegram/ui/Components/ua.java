package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class ua extends bb {
    public final LinearLayout X;
    public FrameLayout Y;
    public fi.d Z;

    public ua(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, null, false, false, u6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.X = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    @Override // org.telegram.ui.Components.bb
    public final mm0 v(nm0 nm0Var) {
        return new bi.h5(this, 2);
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return null;
    }
}
