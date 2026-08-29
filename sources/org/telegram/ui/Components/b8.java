package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class b8 extends FrameLayout {
    public final t9[] a;
    public int b;
    public AnimatorSet c;

    public b8(Context context) {
        super(context);
        this.a = new t9[2];
        for (int i10 = 0; i10 < 2; i10++) {
            this.a[i10] = new t9(context);
            this.a[i10].getImageReceiver().setDelegate(new eg.n2(this, i10, 4));
            this.a[i10].setRoundRadius(AndroidUtilities.dp(4.0f));
            if (i10 == 1) {
                this.a[i10].setVisibility(8);
            }
            addView(this.a[i10], i7.f6.c(-1.0f, -1));
        }
    }
}
