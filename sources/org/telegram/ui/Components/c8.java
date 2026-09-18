package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public abstract class c8 extends FrameLayout {
    public final u9[] a;
    public int b;
    public AnimatorSet c;

    public c8(Context context) {
        super(context);
        this.a = new u9[2];
        for (int i10 = 0; i10 < 2; i10++) {
            this.a[i10] = new u9(context);
            this.a[i10].getImageReceiver().setDelegate(new i2.s(this, i10, 5));
            this.a[i10].setRoundRadius(AndroidUtilities.dp(4.0f));
            if (i10 == 1) {
                this.a[i10].setVisibility(8);
            }
            addView(this.a[i10], w7.x5.c(-1.0f, -1));
        }
    }
}
