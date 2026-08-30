package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class x7 extends FrameLayout {
    public final p9[] a;
    public int b;
    public AnimatorSet c;

    public x7(Context context) {
        super(context);
        this.a = new p9[2];
        for (int i10 = 0; i10 < 2; i10++) {
            this.a[i10] = new p9(context);
            this.a[i10].getImageReceiver().setDelegate(new gg.m2(this, i10, 5));
            this.a[i10].setRoundRadius(AndroidUtilities.dp(4.0f));
            if (i10 == 1) {
                this.a[i10].setVisibility(8);
            }
            addView(this.a[i10], k7.b6.c(-1.0f, -1));
        }
    }
}
