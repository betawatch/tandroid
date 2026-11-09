package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bb1;
import org.telegram.ui.kw0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class kw0 extends org.telegram.ui.Cells.x6 {
    public final /* synthetic */ lw0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw0(lw0 lw0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.h = lw0Var;
        this.f = org.telegram.messenger.p10.s0;
        final int i7 = 1;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        com.google.android.recaptcha.internal.a.q(textView, 1, 15.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 16);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.L6, g6Var);
        addView(textView, c8.ha.t(-1, -2, (org.telegram.messenger.id.a0 ? 5 : 3) | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.x70 x70Var = new org.telegram.ui.Components.x70(context, g6Var);
        this.b = x70Var;
        org.telegram.ui.ActionBar.s6.U(x70Var, org.telegram.ui.ActionBar.l6.G6, g6Var);
        x70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.s6.G(x70Var, org.telegram.ui.ActionBar.l6.J6, g6Var);
        org.telegram.ui.ActionBar.s6.C(x70Var, org.telegram.ui.ActionBar.l6.K6, g6Var);
        final int i10 = 0;
        x70Var.setMovementMethod(new org.telegram.messenger.c0(false));
        x70Var.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
        addView(x70Var, c8.ha.t(-2, -2, org.telegram.messenger.id.a0 ? 5 : 3, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, c8.ha.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        int i11 = 0;
        while (i11 < 2) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.l6.Ci, 8.0f));
            c8.ka.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.l6.Gi, g6Var, 1, 14.0f);
            linearLayout.addView(textView2, c8.ha.m(0.5f, 0, 44, i11 == 0 ? 0 : 4, i11 == 0 ? 4 : 0, 0));
            if (i11 == 0) {
                this.c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.w6
                    public final /* synthetic */ kw0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                kw0 kw0Var = this.b;
                                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.r2(kw0Var, kw0Var.e, 24));
                                break;
                            default:
                                kw0 kw0Var2 = this.b;
                                int i12 = kw0Var2.e;
                                ProfileActivity profileActivity = kw0Var2.h.e;
                                if (i12 != 0) {
                                    profileActivity.presentFragment(new bb1(8, null));
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
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.w6
                    public final /* synthetic */ kw0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i7) {
                            case 0:
                                kw0 kw0Var = this.b;
                                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.r2(kw0Var, kw0Var.e, 24));
                                break;
                            default:
                                kw0 kw0Var2 = this.b;
                                int i12 = kw0Var2.e;
                                ProfileActivity profileActivity = kw0Var2.h.e;
                                if (i12 != 0) {
                                    profileActivity.presentFragment(new bb1(8, null));
                                    break;
                                } else {
                                    profileActivity.presentFragment(new org.telegram.ui.g(3));
                                    break;
                                }
                        }
                    }
                });
            }
            i11++;
        }
    }
}
