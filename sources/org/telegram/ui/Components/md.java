package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class md extends LinearLayout {
    public final nd[] a;

    public md(Context context) {
        super(context);
        this.a = new nd[2];
    }

    public final void a(org.telegram.ui.jk jkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.a[childCount] = jkVar;
            addView(jkVar, layoutParams);
        }
    }

    public nd[] getButtons() {
        return this.a;
    }
}
