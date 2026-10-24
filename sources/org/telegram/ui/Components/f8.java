package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public abstract class f8 extends FrameLayout {
    public final w9[] a;
    public int b;
    public AnimatorSet c;

    public f8(Context context) {
        super(context);
        this.a = new w9[2];
        for (int i10 = 0; i10 < 2; i10++) {
            this.a[i10] = new w9(context);
            this.a[i10].getImageReceiver().setDelegate(new i2.r(this, i10, 6));
            this.a[i10].setRoundRadius(AndroidUtilities.dp(4.0f));
            if (i10 == 1) {
                this.a[i10].setVisibility(8);
            }
            addView(this.a[i10], w7.z5.c(-1.0f, -1));
        }
    }
}
