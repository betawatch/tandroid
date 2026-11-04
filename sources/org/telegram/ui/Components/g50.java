package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g50 extends org.telegram.ui.Cells.pa {
    public final TextView c0;
    public final TextView d0;

    public g50(Context context) {
        super(context, 6, 0, true);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        TextView textView = new TextView(context);
        this.c0 = textView;
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.G6, null, 1, 16.0f);
        f10.addView(textView, b8.mf.r(-2, -2, 5));
        TextView textView2 = new TextView(context);
        this.d0 = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.z6, null);
        textView2.setTextSize(1, 13.0f);
        f10.addView(textView2, b8.mf.t(-2, -2, 5, 0, 1, 0, 0));
        addView(f10, b8.mf.d(-2, -2.0f, (org.telegram.messenger.bd.a0 ? 3 : 5) | 16, 18.0f, 0.0f, 18.0f, 0.0f));
    }
}
