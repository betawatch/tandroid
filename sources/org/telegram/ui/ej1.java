package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ej1 {
    public org.telegram.ui.Cells.z1 a;
    public org.telegram.ui.ActionBar.b2 b;
    public TextView c;

    public static void a(Context context, Utilities.Callback callback, Runnable runnable) {
        ej1 ej1Var = new ej1();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.TermsOfUse);
        LinearLayout f7 = org.telegram.messenger.ul.f(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.j5, false));
        textView.setTextSize(1, 14.0f);
        f7.addView(textView, w7.x5.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 1, null);
        ej1Var.a = z1Var;
        z1Var.getTextView().getLayoutParams().width = -1;
        ej1Var.a.getTextView().setTextSize(1, 14.0f);
        f7.addView(ej1Var.a, w7.x5.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.z0.m(R.string.BotWebAppDisclaimerSubtitle, textView);
        ej1Var.a.e(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new lv(context, 8)), "", false, false, false);
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new org.telegram.ui.Components.a3(1, callback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new rs(21));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        ej1Var.b = b2Var;
        b2Var.show();
        TextView textView2 = (TextView) ej1Var.b.d(-1);
        ej1Var.c = textView2;
        textView2.setEnabled(false);
        ej1Var.c.setAlpha(0.5f);
        ej1Var.a.setOnClickListener(new z31(ej1Var, 9));
        ej1Var.a.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.i6, false), 7, -1));
        ej1Var.b.setOnDismissListener(new org.telegram.ui.Components.n2(zArr, runnable));
    }
}
