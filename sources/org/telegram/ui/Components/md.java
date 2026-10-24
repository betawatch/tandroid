package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class md extends LinearLayout {
    public final nd[] a;

    public md(Context context) {
        super(context);
        this.a = new nd[2];
    }

    public final void a(org.telegram.ui.ik ikVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.a[childCount] = ikVar;
            addView(ikVar, layoutParams);
        }
    }

    public nd[] getButtons() {
        return this.a;
    }
}
