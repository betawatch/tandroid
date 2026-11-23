package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
