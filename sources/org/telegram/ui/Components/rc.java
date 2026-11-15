package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class rc extends LinearLayout {
    public final sc[] a;

    public rc(Context context) {
        super(context);
        this.a = new sc[2];
    }

    public final void a(org.telegram.ui.sj sjVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.a[childCount] = sjVar;
            addView(sjVar, layoutParams);
        }
    }

    public sc[] getButtons() {
        return this.a;
    }
}
