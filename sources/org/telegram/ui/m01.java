package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.im;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.m01;
import org.telegram.ui.vg1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class m01 extends org.telegram.ui.Cells.y6 {
    public final /* synthetic */ n01 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m01(n01 n01Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.h = n01Var;
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
                    public final /* synthetic */ m01 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                m01 m01Var = this.b;
                                AndroidUtilities.runOnUIThread(new im(m01Var, m01Var.e, 22));
                                break;
                            default:
                                m01 m01Var2 = this.b;
                                int i13 = m01Var2.e;
                                ProfileActivity profileActivity = m01Var2.h.e;
                                if (i13 != 0) {
                                    profileActivity.presentFragment(new vg1(8, null));
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
                    public final /* synthetic */ m01 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                m01 m01Var = this.b;
                                AndroidUtilities.runOnUIThread(new im(m01Var, m01Var.e, 22));
                                break;
                            default:
                                m01 m01Var2 = this.b;
                                int i13 = m01Var2.e;
                                ProfileActivity profileActivity = m01Var2.h.e;
                                if (i13 != 0) {
                                    profileActivity.presentFragment(new vg1(8, null));
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
