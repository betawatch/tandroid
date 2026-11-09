package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class li0 extends FrameLayout {
    public final org.telegram.ui.Components.dh0 a;

    public li0(Context context) {
        super(context);
        org.telegram.ui.Components.dh0 dh0Var = new org.telegram.ui.Components.dh0(context);
        this.a = dh0Var;
        dh0Var.setOnClickListener(new i40(this, 15));
        int L = org.telegram.messenger.g0.L(120.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(L, L);
        layoutParams.gravity = 1;
        addView(dh0Var, layoutParams);
        setPadding(0, org.telegram.messenger.g0.L(32.0f), 0, 0);
        setLayoutParams(new v4.o0(-1, -2));
    }
}
