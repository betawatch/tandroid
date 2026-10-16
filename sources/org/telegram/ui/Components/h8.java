package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
            addView(this.a[i10], w7.z5.d(-1.0f, -1));
        }
    }
}
