package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c01;
import org.telegram.ui.xf1;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class c01 extends org.telegram.ui.Cells.y6 {
    public final /* synthetic */ d01 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c01(d01 d01Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.h = d01Var;
        this.f = UserConfig.selectedAccount;
        final int i10 = 1;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        com.google.android.gms.internal.cast.a6.m(15.0f, 1, textView);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.L6, d6Var));
        addView(textView, w7.z5.t(-1, -2, (LocaleController.isRTL ? 5 : 3) | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.x90 x90Var = new org.telegram.ui.Components.x90(context, d6Var);
        this.b = x90Var;
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        x90Var.setTextSize(1, 14.0f);
        x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.J6, d6Var));
        x90Var.setHighlightColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.K6, d6Var));
        x90Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        x90Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(x90Var, w7.z5.t(-2, -2, LocaleController.isRTL ? 5 : 3, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        final int i11 = 0;
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.z5.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        int i12 = 0;
        while (i12 < 2) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.h6.Oh));
            w7.b6.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            org.telegram.ui.Cells.t0.r(org.telegram.ui.ActionBar.h6.Sh, d6Var, textView2, 1, 14.0f);
            linearLayout.addView(textView2, w7.z5.m(0.5f, 0, 44, i12 == 0 ? 0 : 4, i12 == 0 ? 4 : 0, 0));
            if (i12 == 0) {
                this.c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.x6
                    public final /* synthetic */ c01 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                c01 c01Var = this.b;
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e2(c01Var, c01Var.e, 26));
                                break;
                            default:
                                c01 c01Var2 = this.b;
                                int i13 = c01Var2.e;
                                ProfileActivity profileActivity = c01Var2.h.e;
                                if (i13 != 0) {
                                    profileActivity.presentFragment(new xf1(8, null));
                                    break;
                                } else {
                                    profileActivity.presentFragment(new org.telegram.ui.h(3));
                                    break;
                                }
                        }
                    }
                });
            } else {
                this.d = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.x6
                    public final /* synthetic */ c01 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                c01 c01Var = this.b;
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e2(c01Var, c01Var.e, 26));
                                break;
                            default:
                                c01 c01Var2 = this.b;
                                int i13 = c01Var2.e;
                                ProfileActivity profileActivity = c01Var2.h.e;
                                if (i13 != 0) {
                                    profileActivity.presentFragment(new xf1(8, null));
                                    break;
                                } else {
                                    profileActivity.presentFragment(new org.telegram.ui.h(3));
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
