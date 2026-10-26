package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class nd extends LinearLayout {
    public final od[] a;

    public nd(Context context) {
        super(context);
        this.a = new od[2];
    }

    public final void a(org.telegram.ui.jk jkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.a[childCount] = jkVar;
            addView(jkVar, layoutParams);
        }
    }

    public od[] getButtons() {
        return this.a;
    }
}
