package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class il0 extends FrameLayout {
    public final org.telegram.ui.Components.kj0 a;

    public il0(Context context) {
        super(context);
        org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(context);
        this.a = kj0Var;
        kj0Var.setOnClickListener(new f60(this, 14));
        int dp = AndroidUtilities.dp(120.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dp, dp);
        layoutParams.gravity = 1;
        addView(kj0Var, layoutParams);
        setPadding(0, AndroidUtilities.dp(32.0f), 0, 0);
        setLayoutParams(new f2.x0(-1, -2));
    }
}
