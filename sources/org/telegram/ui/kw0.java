package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bb1;
import org.telegram.ui.jw0;
import org.telegram.ui.kw0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class kw0 extends org.telegram.ui.Cells.y6 {
    public final /* synthetic */ lw0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw0(lw0 lw0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.h = lw0Var;
        this.f = org.telegram.messenger.k10.t0;
        final int i7 = 1;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        i5.c.x(textView, 1, 15.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.L6, h6Var);
        addView(textView, c8.ma.t(-1, -2, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.m80 m80Var = new org.telegram.ui.Components.m80(context, h6Var);
        this.b = m80Var;
        org.telegram.ui.ActionBar.t6.U(m80Var, org.telegram.ui.ActionBar.m6.G6, h6Var);
        m80Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.J6, h6Var);
        org.telegram.ui.ActionBar.t6.C(m80Var, org.telegram.ui.ActionBar.m6.K6, h6Var);
        final int i10 = 0;
        m80Var.setMovementMethod(new org.telegram.messenger.c0(false));
        m80Var.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
        addView(m80Var, c8.ma.t(-2, -2, org.telegram.messenger.hd.a0 ? 5 : 3, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, c8.ma.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        int i11 = 0;
        while (i11 < 2) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.m6.Fi, 8.0f));
            c8.ra.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            org.telegram.messenger.f3.l(textView2, org.telegram.ui.ActionBar.m6.Ji, h6Var, 1, 14.0f);
            linearLayout.addView(textView2, c8.ma.m(0.5f, 0, 44, i11 == 0 ? 0 : 4, i11 == 0 ? 4 : 0, 0));
            if (i11 == 0) {
                this.c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.x6
                    public final /* synthetic */ kw0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                kw0 kw0Var = this.b;
                                org.telegram.messenger.g0.g3(new jw0(kw0Var, kw0Var.e, 0));
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
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.x6
                    public final /* synthetic */ kw0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i7) {
                            case 0:
                                kw0 kw0Var = this.b;
                                org.telegram.messenger.g0.g3(new jw0(kw0Var, kw0Var.e, 0));
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
