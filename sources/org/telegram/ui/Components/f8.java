package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public abstract class f8 extends FrameLayout {
    public final x9[] a;
    public int b;
    public AnimatorSet c;

    public f8(Context context) {
        super(context);
        this.a = new x9[2];
        for (int i10 = 0; i10 < 2; i10++) {
            this.a[i10] = new x9(context);
            this.a[i10].getImageReceiver().setDelegate(new i2.t(this, i10, 5));
            this.a[i10].setRoundRadius(AndroidUtilities.dp(4.0f));
            if (i10 == 1) {
                this.a[i10].setVisibility(8);
            }
            addView(this.a[i10], w7.x5.c(-1.0f, -1));
        }
    }
}
