package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class p60 extends org.telegram.ui.Cells.ab {
    public final TextView a0;
    public final TextView b0;

    public p60(Context context) {
        super(context, 6, 0, true);
        LinearLayout f7 = org.telegram.messenger.vl.f(context, 1);
        TextView textView = new TextView(context);
        this.a0 = textView;
        org.telegram.messenger.y0.q(textView, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false), 1, 16.0f);
        f7.addView(textView, w7.x5.q(-2, -2, 5));
        TextView textView2 = new TextView(context);
        this.b0 = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.z6, false));
        textView2.setTextSize(1, 13.0f);
        f7.addView(textView2, w7.x5.t(-2, -2, 5, 0, 1, 0, 0));
        addView(f7, w7.x5.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, 18.0f, 0.0f, 18.0f, 0.0f));
    }
}
