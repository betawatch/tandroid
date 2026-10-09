package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class qd extends LinearLayout {
    public final rd[] a;

    public qd(Context context) {
        super(context);
        this.a = new rd[2];
    }

    public final void a(org.telegram.ui.qk qkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.a[childCount] = qkVar;
            addView(qkVar, layoutParams);
        }
    }

    public rd[] getButtons() {
        return this.a;
    }
}
