package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.hw0;
import org.telegram.ui.xa1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class hw0 extends org.telegram.ui.Cells.w6 {
    public final /* synthetic */ iw0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw0(iw0 iw0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = iw0Var;
        this.f = org.telegram.messenger.m10.t0;
        final int i7 = 1;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        i5.c.v(textView, 1, 15.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.L6, e6Var);
        addView(textView, c8.ja.t(-1, -2, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.z70 z70Var = new org.telegram.ui.Components.z70(context, e6Var);
        this.b = z70Var;
        org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.G6, e6Var);
        z70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.J6, e6Var);
        org.telegram.ui.ActionBar.q6.C(z70Var, org.telegram.ui.ActionBar.j6.K6, e6Var);
        final int i10 = 0;
        z70Var.setMovementMethod(new org.telegram.messenger.c0(false));
        z70Var.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
        addView(z70Var, c8.ja.t(-2, -2, org.telegram.messenger.hd.a0 ? 5 : 3, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, c8.ja.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        int i11 = 0;
        while (i11 < 2) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.j6.Fi, 8.0f));
            c8.na.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            org.telegram.messenger.k5.m(textView2, org.telegram.ui.ActionBar.j6.Ji, e6Var, 1, 14.0f);
            linearLayout.addView(textView2, c8.ja.m(0.5f, 0, 44, i11 == 0 ? 0 : 4, i11 == 0 ? 4 : 0, 0));
            if (i11 == 0) {
                this.c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.v6
                    public final /* synthetic */ hw0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                hw0 hw0Var = this.b;
                                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.a2(hw0Var, hw0Var.e, 27));
                                break;
                            default:
                                hw0 hw0Var2 = this.b;
                                int i12 = hw0Var2.e;
                                ProfileActivity profileActivity = hw0Var2.h.e;
                                if (i12 != 0) {
                                    profileActivity.presentFragment(new xa1(8, null));
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
                    public final /* synthetic */ hw0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i7) {
                            case 0:
                                hw0 hw0Var = this.b;
                                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.a2(hw0Var, hw0Var.e, 27));
                                break;
                            default:
                                hw0 hw0Var2 = this.b;
                                int i12 = hw0Var2.e;
                                ProfileActivity profileActivity = hw0Var2.h.e;
                                if (i12 != 0) {
                                    profileActivity.presentFragment(new xa1(8, null));
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
