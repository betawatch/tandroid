package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class kj1 {
    public org.telegram.ui.Cells.a2 a;
    public org.telegram.ui.ActionBar.b2 b;
    public TextView c;

    public static void a(Context context, e2.h hVar, Runnable runnable) {
        kj1 kj1Var = new kj1();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.TermsOfUse);
        LinearLayout e = org.telegram.messenger.wh.e(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
        textView.setTextSize(1, 14.0f);
        e.addView(textView, w7.y5.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, 1, null);
        kj1Var.a = a2Var;
        a2Var.getTextView().getLayoutParams().width = -1;
        kj1Var.a.getTextView().setTextSize(1, 14.0f);
        e.addView(kj1Var.a, w7.y5.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.q.n(R.string.BotWebAppDisclaimerSubtitle, textView);
        kj1Var.a.e(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new pv(context, 8)), "", false, false, false);
        alertDialog$Builder.n(e);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new rv0(21, hVar, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new wk0(10));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        kj1Var.b = b2Var;
        b2Var.show();
        TextView textView2 = (TextView) kj1Var.b.d(-1);
        kj1Var.c = textView2;
        textView2.setEnabled(false);
        kj1Var.c.setAlpha(0.5f);
        kj1Var.a.setOnClickListener(new g41(kj1Var, 9));
        kj1Var.a.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 7, -1));
        kj1Var.b.setOnDismissListener(new org.telegram.ui.Components.n2(zArr, runnable));
    }
}
