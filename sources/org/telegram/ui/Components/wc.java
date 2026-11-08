package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
