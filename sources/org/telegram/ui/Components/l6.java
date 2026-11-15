package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.widget.TextView;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class l6 extends va {
    public l6(LaunchActivity launchActivity, org.telegram.ui.w80 w80Var) {
        super(launchActivity, null);
        org.telegram.ui.Cells.q qVar = new org.telegram.ui.Cells.q(getContext());
        TextView textView = new TextView(getContext());
        addView(qVar, c8.ja.i(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        textView.setGravity(8388611);
        textView.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.yj, null);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(Typeface.SANS_SERIF);
        addView(textView, c8.ja.i(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        qVar.setImageDrawable(launchActivity.getDrawable(w80Var.b));
        qVar.setOuterPadding(org.telegram.messenger.g0.L(8.0f));
        qVar.setBackgroundOuterPadding(org.telegram.messenger.g0.L(24.0f));
        qVar.setForeground(w80Var.c);
        org.telegram.messenger.k5.q(null, null, 2131754238, new Object[]{org.telegram.messenger.hd.M0(w80Var.d, null)}, textView);
    }
}
