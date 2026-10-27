package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class nd extends LinearLayout {
    public final od[] a;

    public nd(Context context) {
        super(context);
        this.a = new od[2];
    }

    public final void a(org.telegram.ui.lk lkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.a[childCount] = lkVar;
            addView(lkVar, layoutParams);
        }
    }

    public od[] getButtons() {
        return this.a;
    }
}
