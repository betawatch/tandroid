package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
