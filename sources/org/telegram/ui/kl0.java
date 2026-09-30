package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class kl0 extends FrameLayout {
    public final org.telegram.ui.Components.nj0 a;

    public kl0(Context context) {
        super(context);
        org.telegram.ui.Components.nj0 nj0Var = new org.telegram.ui.Components.nj0(context);
        this.a = nj0Var;
        nj0Var.setOnClickListener(new f60(this, 14));
        int dp = AndroidUtilities.dp(120.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dp, dp);
        layoutParams.gravity = 1;
        addView(nj0Var, layoutParams);
        setPadding(0, AndroidUtilities.dp(32.0f), 0, 0);
        setLayoutParams(new s4.p0(-1, -2));
    }
}
