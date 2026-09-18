package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public abstract class sa extends za {
    public final LinearLayout X;
    public FrameLayout Y;
    public ci.d Z;

    public sa(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, false, false, f6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.X = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    @Override // org.telegram.ui.Components.za
    public final ll0 v(ml0 ml0Var) {
        return new gg.n0(this, 1);
    }

    @Override // org.telegram.ui.Components.za
    public final CharSequence y() {
        return null;
    }
}
