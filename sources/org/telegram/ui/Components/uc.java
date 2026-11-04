package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class uc extends LinearLayout {
    public final vc[] a;

    public uc(Context context) {
        super(context);
        this.a = new vc[2];
    }

    public final void a(org.telegram.ui.oj ojVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.a[childCount] = ojVar;
            addView(ojVar, layoutParams);
        }
    }

    public vc[] getButtons() {
        return this.a;
    }
}
