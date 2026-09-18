package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class lj1 {
    public org.telegram.ui.Cells.z1 a;
    public org.telegram.ui.ActionBar.c2 b;
    public TextView c;

    public static void a(Context context, e2.h hVar, Runnable runnable) {
        lj1 lj1Var = new lj1();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.TermsOfUse);
        LinearLayout f7 = org.telegram.messenger.wl.f(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
        textView.setTextSize(1, 14.0f);
        f7.addView(textView, w7.x5.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 1, null);
        lj1Var.a = z1Var;
        z1Var.getTextView().getLayoutParams().width = -1;
        lj1Var.a.getTextView().setTextSize(1, 14.0f);
        f7.addView(lj1Var.a, w7.x5.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.w1.n(R.string.BotWebAppDisclaimerSubtitle, textView);
        lj1Var.a.e(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new qv(context, 8)), "", false, false, false);
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new tv0(20, hVar, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new bs0(8));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        lj1Var.b = c2Var;
        c2Var.show();
        TextView textView2 = (TextView) lj1Var.b.d(-1);
        lj1Var.c = textView2;
        textView2.setEnabled(false);
        lj1Var.c.setAlpha(0.5f);
        lj1Var.a.setOnClickListener(new i41(lj1Var, 9));
        lj1Var.a.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 7, -1));
        lj1Var.b.setOnDismissListener(new org.telegram.ui.Components.n2(zArr, runnable));
    }
}
