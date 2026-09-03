package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class dd extends LinearLayout {
    public final ed[] a;

    public dd(Context context) {
        super(context);
        this.a = new ed[2];
    }

    public final void a(org.telegram.ui.ok okVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.a[childCount] = okVar;
            addView(okVar, layoutParams);
        }
    }

    public ed[] getButtons() {
        return this.a;
    }
}
