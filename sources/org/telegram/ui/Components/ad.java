package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ad extends LinearLayout {
    public final bd[] a;

    public ad(Context context) {
        super(context);
        this.a = new bd[2];
    }

    public final void a(org.telegram.ui.tj tjVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.a[childCount] = tjVar;
            addView(tjVar, layoutParams);
        }
    }

    public bd[] getButtons() {
        return this.a;
    }
}
