package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ei1 {
    public org.telegram.ui.Cells.y1 a;
    public org.telegram.ui.ActionBar.b2 b;
    public TextView c;

    public static void a(Context context, d5.d dVar, Runnable runnable) {
        ei1 ei1Var = new ei1();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.TermsOfUse);
        LinearLayout g10 = org.telegram.messenger.y1.g(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false));
        textView.setTextSize(1, 14.0f);
        g10.addView(textView, h7.z5.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(context, 1, null);
        ei1Var.a = y1Var;
        y1Var.getTextView().getLayoutParams().width = -1;
        ei1Var.a.getTextView().setTextSize(1, 14.0f);
        g10.addView(ei1Var.a, h7.z5.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.y1.p(R.string.BotWebAppDisclaimerSubtitle, textView);
        ei1Var.a.e(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new fv(context, 8)), "", false, false, false);
        alertDialog$Builder.n(g10);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new di1(0, dVar, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new j70(15));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        ei1Var.b = b2Var;
        b2Var.show();
        TextView textView2 = (TextView) ei1Var.b.d(-1);
        ei1Var.c = textView2;
        textView2.setEnabled(false);
        ei1Var.c.setAlpha(0.5f);
        ei1Var.a.setOnClickListener(new v21(ei1Var, 10));
        ei1Var.a.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.i6, false), 7, -1));
        ei1Var.b.setOnDismissListener(new org.telegram.ui.Components.k2(zArr, runnable));
    }
}
