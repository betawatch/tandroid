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
import org.telegram.ui.e11;
import org.telegram.ui.oh1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class e11 extends org.telegram.ui.Cells.a7 {
    public final /* synthetic */ f11 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e11(f11 f11Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.h = f11Var;
        this.f = UserConfig.selectedAccount;
        final int i10 = 1;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        com.google.android.gms.internal.play_billing.k3.m(15.0f, 1, textView);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.L6, c6Var));
        addView(textView, w7.a6.t(-1, -2, (LocaleController.isRTL ? 5 : 3) | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.da0 da0Var = new org.telegram.ui.Components.da0(context, c6Var);
        this.b = da0Var;
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        da0Var.setTextSize(1, 14.0f);
        da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.J6, c6Var));
        da0Var.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.K6, c6Var));
        da0Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        da0Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(da0Var, w7.a6.t(-2, -2, LocaleController.isRTL ? 5 : 3, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        final int i11 = 0;
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.a6.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        int i12 = 0;
        while (i12 < 2) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.g6.Oh));
            w7.c6.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            org.telegram.ui.Cells.d0.p(org.telegram.ui.ActionBar.g6.Sh, c6Var, textView2, 1, 14.0f);
            linearLayout.addView(textView2, w7.a6.m(0.5f, 0, 44, i12 == 0 ? 0 : 4, i12 == 0 ? 4 : 0, 0));
            if (i12 == 0) {
                this.c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.z6
                    public final /* synthetic */ e11 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                e11 e11Var = this.b;
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.o8(e11Var, e11Var.e, 26));
                                break;
                            default:
                                e11 e11Var2 = this.b;
                                int i13 = e11Var2.e;
                                ProfileActivity profileActivity = e11Var2.h.e;
                                if (i13 != 0) {
                                    profileActivity.presentFragment(new oh1(8, null));
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
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.z6
                    public final /* synthetic */ e11 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                e11 e11Var = this.b;
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.o8(e11Var, e11Var.e, 26));
                                break;
                            default:
                                e11 e11Var2 = this.b;
                                int i13 = e11Var2.e;
                                ProfileActivity profileActivity = e11Var2.h.e;
                                if (i13 != 0) {
                                    profileActivity.presentFragment(new oh1(8, null));
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
