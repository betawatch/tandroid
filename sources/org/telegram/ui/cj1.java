package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class cj1 {
    public org.telegram.ui.Cells.a2 a;
    public org.telegram.ui.ActionBar.b2 b;
    public TextView c;

    public static void a(Context context, Utilities.Callback callback, Runnable runnable) {
        cj1 cj1Var = new cj1();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.TermsOfUse);
        LinearLayout e7 = org.telegram.messenger.bi.e(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.j5, false));
        textView.setTextSize(1, 14.0f);
        e7.addView(textView, w7.z5.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, 1, null);
        cj1Var.a = a2Var;
        a2Var.getTextView().getLayoutParams().width = -1;
        cj1Var.a.getTextView().setTextSize(1, 14.0f);
        e7.addView(cj1Var.a, w7.z5.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.q.m(R.string.BotWebAppDisclaimerSubtitle, textView);
        cj1Var.a.e(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new ov(context, 8)), "", false, false, false);
        alertDialog$Builder.n(e7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new org.telegram.ui.Components.b3(1, callback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.voip.e1(29));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        cj1Var.b = b2Var;
        b2Var.show();
        TextView textView2 = (TextView) cj1Var.b.d(-1);
        cj1Var.c = textView2;
        textView2.setEnabled(false);
        cj1Var.c.setAlpha(0.5f);
        cj1Var.a.setOnClickListener(new y31(cj1Var, 9));
        cj1Var.a.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.i6, false), 7, -1));
        cj1Var.b.setOnDismissListener(new org.telegram.ui.Components.n2(zArr, runnable));
    }
}
