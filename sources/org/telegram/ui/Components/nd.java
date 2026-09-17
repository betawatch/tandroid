package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
