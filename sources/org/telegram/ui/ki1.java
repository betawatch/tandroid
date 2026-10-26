package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ki1 {
    public org.telegram.ui.Cells.y1 a;
    public org.telegram.ui.ActionBar.e2 b;
    public TextView c;

    public static void a(Context context, Utilities.Callback callback, Runnable runnable) {
        ki1 ki1Var = new ki1();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.TermsOfUse);
        LinearLayout d = org.telegram.messenger.vh.d(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.j5, null);
        textView.setTextSize(1, 14.0f);
        d.addView(textView, org.telegram.ui.Components.gb1.x(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(context, 1, null);
        ki1Var.a = y1Var;
        y1Var.getTextView().getLayoutParams().width = -1;
        ki1Var.a.getTextView().setTextSize(1, 14.0f);
        d.addView(ki1Var.a, org.telegram.ui.Components.gb1.x(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.t.n(R.string.BotWebAppDisclaimerSubtitle, textView);
        ki1Var.a.e(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new av(context, 8)), "", false, false, false);
        alertDialog$Builder.o(d);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new org.telegram.ui.Components.d3(1, callback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ji1(0));
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        ki1Var.b = e2Var;
        e2Var.show();
        TextView textView2 = (TextView) ki1Var.b.d(-1);
        ki1Var.c = textView2;
        textView2.setEnabled(false);
        ki1Var.c.setAlpha(0.5f);
        ki1Var.a.setOnClickListener(new t21(ki1Var, 10));
        ki1Var.a.setBackground(org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.i6, false), 7, -1));
        ki1Var.b.setOnDismissListener(new org.telegram.ui.Components.q2(zArr, runnable));
    }
}
