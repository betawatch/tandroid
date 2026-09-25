package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class od extends LinearLayout {
    public final pd[] a;

    public od(Context context) {
        super(context);
        this.a = new pd[2];
    }

    public final void a(org.telegram.ui.mk mkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.a[childCount] = mkVar;
            addView(mkVar, layoutParams);
        }
    }

    public pd[] getButtons() {
        return this.a;
    }
}
