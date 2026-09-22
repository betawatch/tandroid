package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ld extends LinearLayout {
    public final md[] a;

    public ld(Context context) {
        super(context);
        this.a = new md[2];
    }

    public final void a(org.telegram.ui.pk pkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.a[childCount] = pkVar;
            addView(pkVar, layoutParams);
        }
    }

    public md[] getButtons() {
        return this.a;
    }
}
