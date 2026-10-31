package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pc extends LinearLayout {
    public final qc[] a;

    public pc(Context context) {
        super(context);
        this.a = new qc[2];
    }

    public final void a(org.telegram.ui.ok okVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.a[childCount] = okVar;
            addView(okVar, layoutParams);
        }
    }

    public qc[] getButtons() {
        return this.a;
    }
}
