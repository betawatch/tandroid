package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class e8 extends FrameLayout {
    public final w9[] a;
    public int b;
    public AnimatorSet c;

    public e8(Context context) {
        super(context);
        this.a = new w9[2];
        for (int i10 = 0; i10 < 2; i10++) {
            this.a[i10] = new w9(context);
            this.a[i10].getImageReceiver().setDelegate(new i2.s(this, i10, 5));
            this.a[i10].setRoundRadius(AndroidUtilities.dp(4.0f));
            if (i10 == 1) {
                this.a[i10].setVisibility(8);
            }
            addView(this.a[i10], w7.a6.c(-1.0f, -1));
        }
    }
}
