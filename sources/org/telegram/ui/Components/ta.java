package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public abstract class ta extends ab {
    public final LinearLayout X;
    public FrameLayout Y;
    public ci.d Z;

    public ta(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, false, false, f6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.X = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    @Override // org.telegram.ui.Components.ab
    public final xl0 v(yl0 yl0Var) {
        return new gg.n0(this, 1);
    }

    @Override // org.telegram.ui.Components.ab
    public final CharSequence y() {
        return null;
    }
}
