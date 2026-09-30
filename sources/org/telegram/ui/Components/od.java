package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class od extends LinearLayout {
    public final pd[] a;

    public od(Context context) {
        super(context);
        this.a = new pd[2];
    }

    public final void a(org.telegram.ui.mk mkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.a[childCount] = mkVar;
            addView(mkVar, layoutParams);
        }
    }

    public pd[] getButtons() {
        return this.a;
    }
}
