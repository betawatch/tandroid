package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class cl0 extends FrameLayout {
    public final org.telegram.ui.Components.xj0 a;

    public cl0(Context context) {
        super(context);
        org.telegram.ui.Components.xj0 xj0Var = new org.telegram.ui.Components.xj0(context);
        this.a = xj0Var;
        xj0Var.setOnClickListener(new s50(this, 14));
        int dp = AndroidUtilities.dp(120.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dp, dp);
        layoutParams.gravity = 1;
        addView(xj0Var, layoutParams);
        setPadding(0, AndroidUtilities.dp(32.0f), 0, 0);
        setLayoutParams(new s4.o0(-1, -2));
    }
}
