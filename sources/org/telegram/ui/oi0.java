package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class oi0 extends FrameLayout {
    public final org.telegram.ui.Components.ph0 a;

    public oi0(Context context) {
        super(context);
        org.telegram.ui.Components.ph0 ph0Var = new org.telegram.ui.Components.ph0(context);
        this.a = ph0Var;
        ph0Var.setOnClickListener(new j40(this, 15));
        int L = org.telegram.messenger.g0.L(120.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(L, L);
        layoutParams.gravity = 1;
        addView(ph0Var, layoutParams);
        setPadding(0, org.telegram.messenger.g0.L(32.0f), 0, 0);
        setLayoutParams(new v4.q0(-1, -2));
    }
}
