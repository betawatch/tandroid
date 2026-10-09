package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class g8 extends FrameLayout {
    public final y9[] a;
    public int b;
    public AnimatorSet c;

    public g8(Context context) {
        super(context);
        this.a = new y9[2];
        for (int i10 = 0; i10 < 2; i10++) {
            this.a[i10] = new y9(context);
            this.a[i10].getImageReceiver().setDelegate(new i2.s(this, i10, 6));
            this.a[i10].setRoundRadius(AndroidUtilities.dp(4.0f));
            if (i10 == 1) {
                this.a[i10].setVisibility(8);
            }
            addView(this.a[i10], w7.x5.d(-1.0f, -1));
        }
    }
}
