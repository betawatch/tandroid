package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.jm;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.h01;
import org.telegram.ui.qg1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class h01 extends org.telegram.ui.Cells.y6 {
    public final /* synthetic */ i01 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h01(i01 i01Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.h = i01Var;
        this.f = UserConfig.selectedAccount;
        final int i10 = 1;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        yh.p(15.0f, 1, textView);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.L6, g6Var));
        addView(textView, k7.c6.t(-1, -2, (LocaleController.isRTL ? 5 : 3) | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.g90 g90Var = new org.telegram.ui.Components.g90(context, g6Var);
        this.b = g90Var;
        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        g90Var.setTextSize(1, 14.0f);
        g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.J6, g6Var));
        g90Var.setHighlightColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.K6, g6Var));
        g90Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        g90Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(g90Var, k7.c6.t(-2, -2, LocaleController.isRTL ? 5 : 3, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        final int i11 = 0;
        linearLayout.setOrientation(0);
        addView(linearLayout, k7.c6.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        int i12 = 0;
        while (i12 < 2) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.a6.f(new float[]{8.0f}, org.telegram.ui.ActionBar.k6.Oh));
            k7.e6.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            b.w(org.telegram.ui.ActionBar.k6.Sh, g6Var, textView2, 1, 14.0f);
            linearLayout.addView(textView2, k7.c6.m(0.5f, 0, 44, i12 == 0 ? 0 : 4, i12 == 0 ? 4 : 0, 0));
            if (i12 == 0) {
                this.c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.x6
                    public final /* synthetic */ h01 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                h01 h01Var = this.b;
                                AndroidUtilities.runOnUIThread(new jm(h01Var, h01Var.e, 22));
                                break;
                            default:
                                h01 h01Var2 = this.b;
                                int i13 = h01Var2.e;
                                ProfileActivity profileActivity = h01Var2.h.e;
                                if (i13 != 0) {
                                    profileActivity.presentFragment(new qg1(8, null));
                                    break;
                                } else {
                                    profileActivity.presentFragment(new org.telegram.ui.i(3));
                                    break;
                                }
                        }
                    }
                });
            } else {
                this.d = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.x6
                    public final /* synthetic */ h01 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                h01 h01Var = this.b;
                                AndroidUtilities.runOnUIThread(new jm(h01Var, h01Var.e, 22));
                                break;
                            default:
                                h01 h01Var2 = this.b;
                                int i13 = h01Var2.e;
                                ProfileActivity profileActivity = h01Var2.h.e;
                                if (i13 != 0) {
                                    profileActivity.presentFragment(new qg1(8, null));
                                    break;
                                } else {
                                    profileActivity.presentFragment(new org.telegram.ui.i(3));
                                    break;
                                }
                        }
                    }
                });
            }
            i12++;
        }
    }
}
