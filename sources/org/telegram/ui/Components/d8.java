package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public abstract class d8 extends FrameLayout {
    public final v9[] a;
    public int b;
    public AnimatorSet c;

    public d8(Context context) {
        super(context);
        this.a = new v9[2];
        for (int i10 = 0; i10 < 2; i10++) {
            this.a[i10] = new v9(context);
            this.a[i10].getImageReceiver().setDelegate(new i2.s(this, i10, 5));
            this.a[i10].setRoundRadius(AndroidUtilities.dp(4.0f));
            if (i10 == 1) {
                this.a[i10].setVisibility(8);
            }
            addView(this.a[i10], w7.y5.c(-1.0f, -1));
        }
    }
}
