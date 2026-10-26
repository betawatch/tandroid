package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class h8 extends FrameLayout {
    public final y9[] a;
    public int b;
    public AnimatorSet c;

    public h8(Context context) {
        super(context);
        this.a = new y9[2];
        for (int i10 = 0; i10 < 2; i10++) {
            this.a[i10] = new y9(context);
            this.a[i10].getImageReceiver().setDelegate(new i2.r(this, i10, 6));
            this.a[i10].setRoundRadius(AndroidUtilities.dp(4.0f));
            if (i10 == 1) {
                this.a[i10].setVisibility(8);
            }
            addView(this.a[i10], gb1.g(-1.0f, -1));
        }
    }
}
