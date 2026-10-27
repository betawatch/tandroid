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
import org.telegram.ui.fg1;
import org.telegram.ui.k01;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class k01 extends org.telegram.ui.Cells.e7 {
    public final /* synthetic */ l01 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k01(l01 l01Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.h = l01Var;
        this.f = UserConfig.selectedAccount;
        final int i10 = 1;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        ic.a.o(15.0f, 1, textView);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.L6, u6Var);
        addView(textView, org.telegram.ui.Components.kb1.x(-1, -2, (LocaleController.isRTL ? 5 : 3) | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.aa0 aa0Var = new org.telegram.ui.Components.aa0(context, u6Var);
        this.b = aa0Var;
        org.telegram.ui.ActionBar.f7.V(aa0Var, org.telegram.ui.ActionBar.y6.G6, u6Var);
        aa0Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.H(aa0Var, org.telegram.ui.ActionBar.y6.J6, u6Var);
        org.telegram.ui.ActionBar.f7.D(aa0Var, org.telegram.ui.ActionBar.y6.K6, u6Var);
        aa0Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        aa0Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(aa0Var, org.telegram.ui.Components.kb1.x(-2, -2, LocaleController.isRTL ? 5 : 3, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        final int i11 = 0;
        linearLayout.setOrientation(0);
        addView(linearLayout, org.telegram.ui.Components.kb1.o(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        int i12 = 0;
        while (i12 < 2) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.o6.f(new float[]{8.0f}, org.telegram.ui.ActionBar.y6.Oh));
            org.telegram.ui.Components.kb1.c(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            org.telegram.messenger.t.r(textView2, org.telegram.ui.ActionBar.y6.Sh, u6Var, 1, 14.0f);
            linearLayout.addView(textView2, org.telegram.ui.Components.kb1.q(0.5f, 0, 44, i12 == 0 ? 0 : 4, i12 == 0 ? 4 : 0, 0));
            if (i12 == 0) {
                this.c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.d7
                    public final /* synthetic */ k01 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                k01 k01Var = this.b;
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.h2(k01Var, k01Var.e, 27));
                                break;
                            default:
                                k01 k01Var2 = this.b;
                                int i13 = k01Var2.e;
                                ProfileActivity profileActivity = k01Var2.h.e;
                                if (i13 != 0) {
                                    profileActivity.presentFragment(new fg1(8, null));
                                    break;
                                } else {
                                    profileActivity.presentFragment(new org.telegram.ui.g(3));
                                    break;
                                }
                        }
                    }
                });
            } else {
                this.d = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.d7
                    public final /* synthetic */ k01 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                k01 k01Var = this.b;
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.h2(k01Var, k01Var.e, 27));
                                break;
                            default:
                                k01 k01Var2 = this.b;
                                int i13 = k01Var2.e;
                                ProfileActivity profileActivity = k01Var2.h.e;
                                if (i13 != 0) {
                                    profileActivity.presentFragment(new fg1(8, null));
                                    break;
                                } else {
                                    profileActivity.presentFragment(new org.telegram.ui.g(3));
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
