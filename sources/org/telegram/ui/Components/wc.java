package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class wc extends LinearLayout {
    public final xc[] a;

    public wc(Context context) {
        super(context);
        this.a = new xc[2];
    }

    public final void a(org.telegram.ui.uj ujVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.a[childCount] = ujVar;
            addView(ujVar, layoutParams);
        }
    }

    public xc[] getButtons() {
        return this.a;
    }
}
