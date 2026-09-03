package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.dw;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.m01;
import org.telegram.ui.wg1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class m01 extends org.telegram.ui.Cells.x6 {
    public final /* synthetic */ n01 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m01(n01 n01Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = n01Var;
        this.f = UserConfig.selectedAccount;
        final int i10 = 1;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        ai.o(15.0f, 1, textView);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6, f6Var));
        addView(textView, k7.b6.t(-1, -2, (LocaleController.isRTL ? 5 : 3) | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.f90 f90Var = new org.telegram.ui.Components.f90(context, f6Var);
        this.b = f90Var;
        f90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        f90Var.setTextSize(1, 14.0f);
        f90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J6, f6Var));
        f90Var.setHighlightColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.K6, f6Var));
        f90Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        f90Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(f90Var, k7.b6.t(-2, -2, LocaleController.isRTL ? 5 : 3, 21, 14, 21, 0));
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
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.w6
                    public final /* synthetic */ m01 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                m01 m01Var = this.b;
                                AndroidUtilities.runOnUIThread(new dw(m01Var, m01Var.e, 21));
                                break;
                            default:
                                m01 m01Var2 = this.b;
                                int i13 = m01Var2.e;
                                ProfileActivity profileActivity = m01Var2.h.e;
                                if (i13 != 0) {
                                    profileActivity.presentFragment(new wg1(8, null));
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
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.w6
                    public final /* synthetic */ m01 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                m01 m01Var = this.b;
                                AndroidUtilities.runOnUIThread(new dw(m01Var, m01Var.e, 21));
                                break;
                            default:
                                m01 m01Var2 = this.b;
                                int i13 = m01Var2.e;
                                ProfileActivity profileActivity = m01Var2.h.e;
                                if (i13 != 0) {
                                    profileActivity.presentFragment(new wg1(8, null));
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
