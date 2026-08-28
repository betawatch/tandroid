package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class ma extends sa {
    public final LinearLayout T;
    public FrameLayout U;
    public kh.d V;

    public ma(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, null, false, false, false, 1, b6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.T = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    @Override // org.telegram.ui.Components.sa
    public final vk0 v(wk0 wk0Var) {
        return new gh.t3(this, 2);
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return null;
    }
}
