package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ad extends LinearLayout {
    public final bd[] a;

    public ad(Context context) {
        super(context);
        this.a = new bd[2];
    }

    public final void a(org.telegram.ui.tj tjVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.a[childCount] = tjVar;
            addView(tjVar, layoutParams);
        }
    }

    public bd[] getButtons() {
        return this.a;
    }
}
