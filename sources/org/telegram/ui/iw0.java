package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.iw0;
import org.telegram.ui.ya1;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class iw0 extends org.telegram.ui.Cells.x6 {
    public final /* synthetic */ jw0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw0(jw0 jw0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = jw0Var;
        this.f = org.telegram.messenger.p10.s0;
        final int i7 = 1;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        com.google.android.recaptcha.internal.a.q(textView, 1, 15.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.L6, f6Var);
        addView(textView, c8.ha.t(-1, -2, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(context, f6Var);
        this.b = w70Var;
        org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.G6, f6Var);
        w70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.J6, f6Var);
        org.telegram.ui.ActionBar.r6.D(w70Var, org.telegram.ui.ActionBar.k6.K6, f6Var);
        final int i10 = 0;
        w70Var.setMovementMethod(new org.telegram.messenger.c0(false));
        w70Var.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
        addView(w70Var, c8.ha.t(-2, -2, org.telegram.messenger.hd.a0 ? 5 : 3, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, c8.ha.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        int i11 = 0;
        while (i11 < 2) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.z5.f(org.telegram.ui.ActionBar.k6.Ci, 8.0f));
            c8.ka.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.k6.Gi, f6Var, 1, 14.0f);
            linearLayout.addView(textView2, c8.ha.m(0.5f, 0, 44, i11 == 0 ? 0 : 4, i11 == 0 ? 4 : 0, 0));
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
                                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.r2(iw0Var, iw0Var.e, 24));
                                break;
                            default:
                                iw0 iw0Var2 = this.b;
                                int i12 = iw0Var2.e;
                                ProfileActivity profileActivity = iw0Var2.h.e;
                                if (i12 != 0) {
                                    profileActivity.presentFragment(new ya1(8, null));
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
                                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.r2(iw0Var, iw0Var.e, 24));
                                break;
                            default:
                                iw0 iw0Var2 = this.b;
                                int i12 = iw0Var2.e;
                                ProfileActivity profileActivity = iw0Var2.h.e;
                                if (i12 != 0) {
                                    profileActivity.presentFragment(new ya1(8, null));
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
