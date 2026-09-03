package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class dd extends LinearLayout {
    public final ed[] a;

    public dd(Context context) {
        super(context);
        this.a = new ed[2];
    }

    public final void a(org.telegram.ui.mk mkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.a[childCount] = mkVar;
            addView(mkVar, layoutParams);
        }
    }

    public ed[] getButtons() {
        return this.a;
    }
}
