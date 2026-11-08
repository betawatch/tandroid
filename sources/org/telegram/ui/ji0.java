package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ji0 extends FrameLayout {
    public final org.telegram.ui.Components.ch0 a;

    public ji0(Context context) {
        super(context);
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(context);
        this.a = ch0Var;
        ch0Var.setOnClickListener(new g40(this, 15));
        int L = org.telegram.messenger.g0.L(120.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(L, L);
        layoutParams.gravity = 1;
        addView(ch0Var, layoutParams);
        setPadding(0, org.telegram.messenger.g0.L(32.0f), 0, 0);
        setLayoutParams(new v4.o0(-1, -2));
    }
}
