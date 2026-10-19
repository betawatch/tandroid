package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class md extends LinearLayout {
    public final nd[] a;

    public md(Context context) {
        super(context);
        this.a = new nd[2];
    }

    public final void a(org.telegram.ui.hk hkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.a[childCount] = hkVar;
            addView(hkVar, layoutParams);
        }
    }

    public nd[] getButtons() {
        return this.a;
    }
}
