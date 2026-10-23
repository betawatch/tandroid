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
import org.telegram.ui.bg1;
import org.telegram.ui.e01;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class e01 extends org.telegram.ui.Cells.a7 {
    public final /* synthetic */ f01 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e01(f01 f01Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.h = f01Var;
        this.f = UserConfig.selectedAccount;
        final int i10 = 1;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        com.google.android.gms.internal.play_billing.k3.m(15.0f, 1, textView);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.L6, g6Var);
        addView(textView, w7.z5.t(-1, -2, (LocaleController.isRTL ? 5 : 3) | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.y90 y90Var = new org.telegram.ui.Components.y90(context, g6Var);
        this.b = y90Var;
        org.telegram.ui.ActionBar.r6.W(y90Var, org.telegram.ui.ActionBar.k6.G6, g6Var);
        y90Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.I(y90Var, org.telegram.ui.ActionBar.k6.J6, g6Var);
        org.telegram.ui.ActionBar.r6.E(y90Var, org.telegram.ui.ActionBar.k6.K6, g6Var);
        y90Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        y90Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(y90Var, w7.z5.t(-2, -2, LocaleController.isRTL ? 5 : 3, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        final int i11 = 0;
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.z5.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        int i12 = 0;
        while (i12 < 2) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.a6.f(new float[]{8.0f}, org.telegram.ui.ActionBar.k6.Oh));
            w7.b6.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            org.telegram.messenger.v0.q(textView2, org.telegram.ui.ActionBar.k6.Sh, g6Var, 1, 14.0f);
            linearLayout.addView(textView2, w7.z5.m(0.5f, 0, 44, i12 == 0 ? 0 : 4, i12 == 0 ? 4 : 0, 0));
            if (i12 == 0) {
                this.c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.z6
                    public final /* synthetic */ e01 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                e01 e01Var = this.b;
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.d2(e01Var, e01Var.e, 27));
                                break;
                            default:
                                e01 e01Var2 = this.b;
                                int i13 = e01Var2.e;
                                ProfileActivity profileActivity = e01Var2.h.e;
                                if (i13 != 0) {
                                    profileActivity.presentFragment(new bg1(8, null));
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
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.z6
                    public final /* synthetic */ e01 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                e01 e01Var = this.b;
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.d2(e01Var, e01Var.e, 27));
                                break;
                            default:
                                e01 e01Var2 = this.b;
                                int i13 = e01Var2.e;
                                ProfileActivity profileActivity = e01Var2.h.e;
                                if (i13 != 0) {
                                    profileActivity.presentFragment(new bg1(8, null));
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
