package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gi1 {
    public org.telegram.ui.Cells.y1 a;
    public org.telegram.ui.ActionBar.c2 b;
    public TextView c;

    public static void a(Context context, f5.d dVar, Runnable runnable) {
        gi1 gi1Var = new gi1();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.TermsOfUse);
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false));
        textView.setTextSize(1, 14.0f);
        g10.addView(textView, i7.f6.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(context, 1, null);
        gi1Var.a = y1Var;
        y1Var.getTextView().getLayoutParams().width = -1;
        gi1Var.a.getTextView().setTextSize(1, 14.0f);
        g10.addView(gi1Var.a, i7.f6.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.x3.r(R.string.BotWebAppDisclaimerSubtitle, textView);
        gi1Var.a.e(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new dv(context, 8)), "", false, false, false);
        alertDialog$Builder.n(g10);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new fi1(0, dVar, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new xx0(4));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        gi1Var.b = c2Var;
        c2Var.show();
        TextView textView2 = (TextView) gi1Var.b.d(-1);
        gi1Var.c = textView2;
        textView2.setEnabled(false);
        gi1Var.c.setAlpha(0.5f);
        gi1Var.a.setOnClickListener(new w21(gi1Var, 10));
        gi1Var.a.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.i6, false), 7, -1));
        gi1Var.b.setOnDismissListener(new org.telegram.ui.Components.n2(zArr, runnable));
    }
}
