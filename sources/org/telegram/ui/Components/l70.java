package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class l70 extends org.telegram.ui.Cells.ab {
    public final TextView b0;
    public final TextView c0;

    public l70(Context context) {
        super(context, 6, 0, true);
        LinearLayout d = org.telegram.messenger.vh.d(context, 1);
        TextView textView = new TextView(context);
        this.b0 = textView;
        org.telegram.messenger.t.r(textView, org.telegram.ui.ActionBar.y6.G6, null, 1, 16.0f);
        d.addView(textView, gb1.u(-2, -2, 5));
        TextView textView2 = new TextView(context);
        this.c0 = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.z6, null);
        textView2.setTextSize(1, 13.0f);
        d.addView(textView2, gb1.x(-2, -2, 5, 0, 1, 0, 0));
        addView(d, gb1.h(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, 18.0f, 0.0f, 18.0f, 0.0f));
    }
}
