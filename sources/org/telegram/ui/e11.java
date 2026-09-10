package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.zd;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.e11;
import org.telegram.ui.mh1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class e11 extends org.telegram.ui.Cells.b7 {
    public final /* synthetic */ f11 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e11(f11 f11Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = f11Var;
        this.f = UserConfig.selectedAccount;
        final int i10 = 1;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        com.google.android.gms.internal.vision.e2.k(15.0f, 1, textView);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6, f6Var));
        addView(textView, w7.a6.t(-1, -2, (LocaleController.isRTL ? 5 : 3) | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.m90 m90Var = new org.telegram.ui.Components.m90(context, f6Var);
        this.b = m90Var;
        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        m90Var.setTextSize(1, 14.0f);
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J6, f6Var));
        m90Var.setHighlightColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.K6, f6Var));
        m90Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        m90Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(m90Var, w7.a6.t(-2, -2, LocaleController.isRTL ? 5 : 3, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        final int i11 = 0;
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.a6.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        int i12 = 0;
        while (i12 < 2) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.j6.Oh));
            w7.c6.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            org.telegram.messenger.em.x(org.telegram.ui.ActionBar.j6.Sh, f6Var, textView2, 1, 14.0f);
            linearLayout.addView(textView2, w7.a6.m(0.5f, 0, 44, i12 == 0 ? 0 : 4, i12 == 0 ? 4 : 0, 0));
            if (i12 == 0) {
                this.c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.a7
                    public final /* synthetic */ e11 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                e11 e11Var = this.b;
                                AndroidUtilities.runOnUIThread(new zd(e11Var, e11Var.e, 23));
                                break;
                            default:
                                e11 e11Var2 = this.b;
                                int i13 = e11Var2.e;
                                ProfileActivity profileActivity = e11Var2.h.e;
                                if (i13 != 0) {
                                    profileActivity.presentFragment(new mh1(8, null));
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
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.a7
                    public final /* synthetic */ e11 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                e11 e11Var = this.b;
                                AndroidUtilities.runOnUIThread(new zd(e11Var, e11Var.e, 23));
                                break;
                            default:
                                e11 e11Var2 = this.b;
                                int i13 = e11Var2.e;
                                ProfileActivity profileActivity = e11Var2.h.e;
                                if (i13 != 0) {
                                    profileActivity.presentFragment(new mh1(8, null));
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
