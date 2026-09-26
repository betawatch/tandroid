package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class kl0 extends FrameLayout {
    public final org.telegram.ui.Components.lj0 a;

    public kl0(Context context) {
        super(context);
        org.telegram.ui.Components.lj0 lj0Var = new org.telegram.ui.Components.lj0(context);
        this.a = lj0Var;
        lj0Var.setOnClickListener(new f60(this, 14));
        int dp = AndroidUtilities.dp(120.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dp, dp);
        layoutParams.gravity = 1;
        addView(lj0Var, layoutParams);
        setPadding(0, AndroidUtilities.dp(32.0f), 0, 0);
        setLayoutParams(new s4.p0(-1, -2));
    }
}
