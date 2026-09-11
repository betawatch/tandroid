package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
