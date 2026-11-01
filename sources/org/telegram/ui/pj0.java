package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class pj0 extends FrameLayout {
    public final org.telegram.ui.Components.fi0 a;

    public pj0(Context context) {
        super(context);
        org.telegram.ui.Components.fi0 fi0Var = new org.telegram.ui.Components.fi0(context);
        this.a = fi0Var;
        fi0Var.setOnClickListener(new e50(this, 15));
        int L = org.telegram.messenger.i0.L(120.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(L, L);
        layoutParams.gravity = 1;
        addView(fi0Var, layoutParams);
        setPadding(0, org.telegram.messenger.i0.L(32.0f), 0, 0);
        setLayoutParams(new s4.o0(-1, -2));
    }
}
