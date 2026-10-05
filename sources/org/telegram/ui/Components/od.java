package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
