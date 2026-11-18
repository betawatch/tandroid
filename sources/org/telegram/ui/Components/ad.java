package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
