package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class wc extends LinearLayout {
    public final xc[] a;

    public wc(Context context) {
        super(context);
        this.a = new xc[2];
    }

    public final void a(org.telegram.ui.sj sjVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.a[childCount] = sjVar;
            addView(sjVar, layoutParams);
        }
    }

    public xc[] getButtons() {
        return this.a;
    }
}
