package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class x7 extends FrameLayout {
    public final o9[] a;
    public int b;
    public AnimatorSet c;

    public x7(Context context) {
        super(context);
        this.a = new o9[2];
        for (int i9 = 0; i9 < 2; i9++) {
            this.a[i9] = new o9(context);
            this.a[i9].getImageReceiver().setDelegate(new bg.x2(this, i9, 4));
            this.a[i9].setRoundRadius(AndroidUtilities.dp(4.0f));
            if (i9 == 1) {
                this.a[i9].setVisibility(8);
            }
            addView(this.a[i9], g7.e6.c(-1.0f, -1));
        }
    }
}
