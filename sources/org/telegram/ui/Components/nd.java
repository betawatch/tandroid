package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class nd extends LinearLayout {
    public final od[] a;

    public nd(Context context) {
        super(context);
        this.a = new od[2];
    }

    public final void a(org.telegram.ui.pk pkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.a[childCount] = pkVar;
            addView(pkVar, layoutParams);
        }
    }

    public od[] getButtons() {
        return this.a;
    }
}
