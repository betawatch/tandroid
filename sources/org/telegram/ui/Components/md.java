package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class md extends LinearLayout {
    public final nd[] a;

    public md(Context context) {
        super(context);
        this.a = new nd[2];
    }

    public final void a(org.telegram.ui.ok okVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.a[childCount] = okVar;
            addView(okVar, layoutParams);
        }
    }

    public nd[] getButtons() {
        return this.a;
    }
}
