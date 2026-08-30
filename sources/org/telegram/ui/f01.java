package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.hm;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.f01;
import org.telegram.ui.og1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class f01 extends org.telegram.ui.Cells.y6 {
    public final /* synthetic */ g01 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f01(g01 g01Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = g01Var;
        this.f = UserConfig.selectedAccount;
        final int i10 = 1;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        yh.p(15.0f, 1, textView);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6, f6Var));
        addView(textView, k7.b6.t(-1, -2, (LocaleController.isRTL ? 5 : 3) | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.e90 e90Var = new org.telegram.ui.Components.e90(context, f6Var);
        this.b = e90Var;
        e90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        e90Var.setTextSize(1, 14.0f);
        e90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J6, f6Var));
        e90Var.setHighlightColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.K6, f6Var));
        e90Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        e90Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(e90Var, k7.b6.t(-2, -2, LocaleController.isRTL ? 5 : 3, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        final int i11 = 0;
        linearLayout.setOrientation(0);
        addView(linearLayout, k7.b6.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        int i12 = 0;
        while (i12 < 2) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.j6.Oh));
            k7.d6.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            b.w(org.telegram.ui.ActionBar.j6.Sh, f6Var, textView2, 1, 14.0f);
            linearLayout.addView(textView2, k7.b6.m(0.5f, 0, 44, i12 == 0 ? 0 : 4, i12 == 0 ? 4 : 0, 0));
            if (i12 == 0) {
                this.c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.x6
                    public final /* synthetic */ f01 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                f01 f01Var = this.b;
                                AndroidUtilities.runOnUIThread(new hm(f01Var, f01Var.e, 22));
                                break;
                            default:
                                f01 f01Var2 = this.b;
                                int i13 = f01Var2.e;
                                ProfileActivity profileActivity = f01Var2.h.e;
                                if (i13 != 0) {
                                    profileActivity.presentFragment(new og1(8, null));
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
                    public final /* synthetic */ f01 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                f01 f01Var = this.b;
                                AndroidUtilities.runOnUIThread(new hm(f01Var, f01Var.e, 22));
                                break;
                            default:
                                f01 f01Var2 = this.b;
                                int i13 = f01Var2.e;
                                ProfileActivity profileActivity = f01Var2.h.e;
                                if (i13 != 0) {
                                    profileActivity.presentFragment(new og1(8, null));
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
