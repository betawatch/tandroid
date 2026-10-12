package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public abstract class h8 extends FrameLayout {
    public final z9[] a;
    public int b;
    public AnimatorSet c;

    public h8(Context context) {
        super(context);
        this.a = new z9[2];
        for (int i10 = 0; i10 < 2; i10++) {
            this.a[i10] = new z9(context);
            this.a[i10].getImageReceiver().setDelegate(new i2.r(this, i10, 6));
            this.a[i10].setRoundRadius(AndroidUtilities.dp(4.0f));
            if (i10 == 1) {
                this.a[i10].setVisibility(8);
            }
            addView(this.a[i10], w7.a6.d(-1.0f, -1));
        }
    }
}
