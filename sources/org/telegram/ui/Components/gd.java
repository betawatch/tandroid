package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gd extends LinearLayout {
    public final hd[] a;

    public gd(Context context) {
        super(context);
        this.a = new hd[2];
    }

    public final void a(org.telegram.ui.gk gkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.a[childCount] = gkVar;
            addView(gkVar, layoutParams);
        }
    }

    public hd[] getButtons() {
        return this.a;
    }
}
