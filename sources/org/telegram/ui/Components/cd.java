package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cd extends LinearLayout {
    public final dd[] a;

    public cd(Context context) {
        super(context);
        this.a = new dd[2];
    }

    public final void a(org.telegram.ui.dk dkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.a[childCount] = dkVar;
            addView(dkVar, layoutParams);
        }
    }

    public dd[] getButtons() {
        return this.a;
    }
}
