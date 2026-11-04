package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.aw0;
import org.telegram.ui.ra1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class aw0 extends org.telegram.ui.Cells.w6 {
    public final /* synthetic */ bw0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw0(bw0 bw0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = bw0Var;
        this.f = org.telegram.messenger.h10.t0;
        final int i3 = 1;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        k2.p1.t(textView, 1, 15.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.L6, e6Var);
        addView(textView, b8.mf.t(-1, -2, (org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.s70 s70Var = new org.telegram.ui.Components.s70(context, e6Var);
        this.b = s70Var;
        org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.G6, e6Var);
        s70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.J6, e6Var);
        org.telegram.ui.ActionBar.r6.D(s70Var, org.telegram.ui.ActionBar.k6.K6, e6Var);
        final int i10 = 0;
        s70Var.setMovementMethod(new org.telegram.messenger.c0(false));
        s70Var.setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
        addView(s70Var, b8.mf.t(-2, -2, org.telegram.messenger.bd.a0 ? 5 : 3, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, b8.mf.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        int i11 = 0;
        while (i11 < 2) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.k6.Ci, 8.0f));
            b8.pf.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.k6.Gi, e6Var, 1, 14.0f);
            linearLayout.addView(textView2, b8.mf.m(0.5f, 0, 44, i11 == 0 ? 0 : 4, i11 == 0 ? 4 : 0, 0));
            if (i11 == 0) {
                this.c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.v6
                    public final /* synthetic */ aw0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                aw0 aw0Var = this.b;
                                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.o2(aw0Var, aw0Var.e, 24));
                                break;
                            default:
                                aw0 aw0Var2 = this.b;
                                int i12 = aw0Var2.e;
                                ProfileActivity profileActivity = aw0Var2.h.e;
                                if (i12 != 0) {
                                    profileActivity.presentFragment(new ra1(8, null));
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
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.v6
                    public final /* synthetic */ aw0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i3) {
                            case 0:
                                aw0 aw0Var = this.b;
                                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.o2(aw0Var, aw0Var.e, 24));
                                break;
                            default:
                                aw0 aw0Var2 = this.b;
                                int i12 = aw0Var2.e;
                                ProfileActivity profileActivity = aw0Var2.h.e;
                                if (i12 != 0) {
                                    profileActivity.presentFragment(new ra1(8, null));
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
