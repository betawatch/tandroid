package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
