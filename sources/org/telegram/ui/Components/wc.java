package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
