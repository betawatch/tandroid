package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ao0;
import org.telegram.ui.iw0;
import org.telegram.ui.za1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class iw0 extends org.telegram.ui.Cells.x6 {
    public final /* synthetic */ jw0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw0(jw0 jw0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.h = jw0Var;
        this.f = org.telegram.messenger.i10.t0;
        final int i7 = 1;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        i5.c.x(textView, 1, 15.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 16);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.L6, i6Var);
        addView(textView, c8.na.t(-1, -2, (org.telegram.messenger.gd.a0 ? 5 : 3) | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.j80 j80Var = new org.telegram.ui.Components.j80(context, i6Var);
        this.b = j80Var;
        org.telegram.ui.ActionBar.u6.U(j80Var, org.telegram.ui.ActionBar.n6.G6, i6Var);
        j80Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.G(j80Var, org.telegram.ui.ActionBar.n6.J6, i6Var);
        org.telegram.ui.ActionBar.u6.C(j80Var, org.telegram.ui.ActionBar.n6.K6, i6Var);
        final int i10 = 0;
        j80Var.setMovementMethod(new org.telegram.messenger.c0(false));
        j80Var.setGravity(org.telegram.messenger.gd.a0 ? 5 : 3);
        addView(j80Var, c8.na.t(-2, -2, org.telegram.messenger.gd.a0 ? 5 : 3, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, c8.na.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        int i11 = 0;
        while (i11 < 2) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.n6.Fi, 8.0f));
            c8.sa.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            org.telegram.messenger.f3.l(textView2, org.telegram.ui.ActionBar.n6.Ji, i6Var, 1, 14.0f);
            linearLayout.addView(textView2, c8.na.m(0.5f, 0, 44, i11 == 0 ? 0 : 4, i11 == 0 ? 4 : 0, 0));
            if (i11 == 0) {
                this.c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.w6
                    public final /* synthetic */ iw0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                iw0 iw0Var = this.b;
                                org.telegram.messenger.g0.g3(new ao0(iw0Var, iw0Var.e, 2));
                                break;
                            default:
                                iw0 iw0Var2 = this.b;
                                int i12 = iw0Var2.e;
                                ProfileActivity profileActivity = iw0Var2.h.e;
                                if (i12 != 0) {
                                    profileActivity.presentFragment(new za1(8, null));
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
                    public final /* synthetic */ iw0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i7) {
                            case 0:
                                iw0 iw0Var = this.b;
                                org.telegram.messenger.g0.g3(new ao0(iw0Var, iw0Var.e, 2));
                                break;
                            default:
                                iw0 iw0Var2 = this.b;
                                int i12 = iw0Var2.e;
                                ProfileActivity profileActivity = iw0Var2.h.e;
                                if (i12 != 0) {
                                    profileActivity.presentFragment(new za1(8, null));
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
