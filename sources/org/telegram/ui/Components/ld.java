package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ld extends LinearLayout {
    public final md[] a;

    public ld(Context context) {
        super(context);
        this.a = new md[2];
    }

    public final void a(org.telegram.ui.rk rkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.a[childCount] = rkVar;
            addView(rkVar, layoutParams);
        }
    }

    public md[] getButtons() {
        return this.a;
    }
}
