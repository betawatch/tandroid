package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class mj1 {
    public org.telegram.ui.Cells.z1 a;
    public org.telegram.ui.ActionBar.b2 b;
    public TextView c;

    public static void a(Context context, e2.h hVar, Runnable runnable) {
        mj1 mj1Var = new mj1();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.TermsOfUse);
        LinearLayout f7 = org.telegram.messenger.vl.f(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.j5, false));
        textView.setTextSize(1, 14.0f);
        f7.addView(textView, w7.x5.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 1, null);
        mj1Var.a = z1Var;
        z1Var.getTextView().getLayoutParams().width = -1;
        mj1Var.a.getTextView().setTextSize(1, 14.0f);
        f7.addView(mj1Var.a, w7.x5.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.y0.m(R.string.BotWebAppDisclaimerSubtitle, textView);
        mj1Var.a.e(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new ov(context, 8)), "", false, false, false);
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new rv0(20, hVar, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new js0(7));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        mj1Var.b = b2Var;
        b2Var.show();
        TextView textView2 = (TextView) mj1Var.b.d(-1);
        mj1Var.c = textView2;
        textView2.setEnabled(false);
        mj1Var.c.setAlpha(0.5f);
        mj1Var.a.setOnClickListener(new h41(mj1Var, 9));
        mj1Var.a.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.i6, false), 7, -1));
        mj1Var.b.setOnDismissListener(new org.telegram.ui.Components.m2(zArr, runnable));
    }
}
