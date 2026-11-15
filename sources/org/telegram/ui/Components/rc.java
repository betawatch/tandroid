package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class rc extends LinearLayout {
    public final sc[] a;

    public rc(Context context) {
        super(context);
        this.a = new sc[2];
    }

    public final void a(org.telegram.ui.sj sjVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.a[childCount] = sjVar;
            addView(sjVar, layoutParams);
        }
    }

    public sc[] getButtons() {
        return this.a;
    }
}
