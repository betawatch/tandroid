package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fi1 {
    public org.telegram.ui.Cells.z1 a;
    public org.telegram.ui.ActionBar.c2 b;
    public TextView c;

    public static void a(Context context, d5.d dVar, Runnable runnable) {
        fi1 fi1Var = new fi1();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.TermsOfUse);
        LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.j5, false));
        textView.setTextSize(1, 14.0f);
        f10.addView(textView, g7.e6.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 1, null);
        fi1Var.a = z1Var;
        z1Var.getTextView().getLayoutParams().width = -1;
        fi1Var.a.getTextView().setTextSize(1, 14.0f);
        f10.addView(fi1Var.a, g7.e6.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.l0.m(R.string.BotWebAppDisclaimerSubtitle, textView);
        fi1Var.a.e(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new cv(context, 8)), "", false, false, false);
        alertDialog$Builder.n(f10);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new ei1(0, dVar, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new fk0(10));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        fi1Var.b = c2Var;
        c2Var.show();
        TextView textView2 = (TextView) fi1Var.b.d(-1);
        fi1Var.c = textView2;
        textView2.setEnabled(false);
        fi1Var.c.setAlpha(0.5f);
        fi1Var.a.setOnClickListener(new w21(fi1Var, 10));
        fi1Var.a.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.i6, false), 7, -1));
        fi1Var.b.setOnDismissListener(new org.telegram.ui.Components.k2(zArr, runnable));
    }
}
