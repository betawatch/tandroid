package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a60 extends org.telegram.ui.Cells.pa {
    public final TextView b0;
    public final TextView c0;

    public a60(Context context) {
        super(context, 6, 0, true);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        TextView textView = new TextView(context);
        this.b0 = textView;
        org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.G6, null, 1, 16.0f);
        f7.addView(textView, w7.b6.r(-2, -2, 5));
        TextView textView2 = new TextView(context);
        this.c0 = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.z6, null);
        textView2.setTextSize(1, 13.0f);
        f7.addView(textView2, w7.b6.t(-2, -2, 5, 0, 1, 0, 0));
        addView(f7, w7.b6.d(-2, -2.0f, (org.telegram.messenger.cd.X ? 3 : 5) | 16, 18.0f, 0.0f, 18.0f, 0.0f));
    }
}
