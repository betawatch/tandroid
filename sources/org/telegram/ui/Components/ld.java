package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ld extends LinearLayout {
    public final md[] a;

    public ld(Context context) {
        super(context);
        this.a = new md[2];
    }

    public final void a(org.telegram.ui.qk qkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.a[childCount] = qkVar;
            addView(qkVar, layoutParams);
        }
    }

    public md[] getButtons() {
        return this.a;
    }
}
