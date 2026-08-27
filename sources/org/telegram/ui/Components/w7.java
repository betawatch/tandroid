package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class w7 extends FrameLayout {
    public final n9[] a;
    public int b;
    public AnimatorSet c;

    public w7(Context context) {
        super(context);
        this.a = new n9[2];
        for (int i10 = 0; i10 < 2; i10++) {
            this.a[i10] = new n9(context);
            this.a[i10].getImageReceiver().setDelegate(new cg.p2(this, i10, 4));
            this.a[i10].setRoundRadius(AndroidUtilities.dp(4.0f));
            if (i10 == 1) {
                this.a[i10].setVisibility(8);
            }
            addView(this.a[i10], h7.z5.c(-1.0f, -1));
        }
    }
}
