package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class md extends LinearLayout {
    public final nd[] a;

    public md(Context context) {
        super(context);
        this.a = new nd[2];
    }

    public final void a(org.telegram.ui.jk jkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.a[childCount] = jkVar;
            addView(jkVar, layoutParams);
        }
    }

    public nd[] getButtons() {
        return this.a;
    }
}
