package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class zc extends LinearLayout {
    public final ad[] a;

    public zc(Context context) {
        super(context);
        this.a = new ad[2];
    }

    public final void a(org.telegram.ui.fk fkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.a[childCount] = fkVar;
            addView(fkVar, layoutParams);
        }
    }

    public ad[] getButtons() {
        return this.a;
    }
}
