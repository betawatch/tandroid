package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class vc extends LinearLayout {
    public final wc[] a;

    public vc(Context context) {
        super(context);
        this.a = new wc[2];
    }

    public final void a(org.telegram.ui.uj ujVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.a[childCount] = ujVar;
            addView(ujVar, layoutParams);
        }
    }

    public wc[] getButtons() {
        return this.a;
    }
}
