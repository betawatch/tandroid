package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ih0 extends org.telegram.ui.ActionBar.x2 implements org.telegram.messenger.fs {
    public final gh0 m1;
    public final org.telegram.ui.Components.ph0 n1;
    public org.telegram.messenger.x10 o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih0(Context context, boolean z10, org.telegram.messenger.x10 x10Var) {
        super(context, false);
        final int i7 = 0;
        this.o1 = x10Var;
        final int i10 = 1;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.ph0 ph0Var = new org.telegram.ui.Components.ph0(context);
        this.n1 = ph0Var;
        ph0Var.setScaleType(ImageView.ScaleType.CENTER);
        ph0Var.f(R.raw.silent_unmute, 46, 46, null);
        ph0Var.d();
        int L = org.telegram.messenger.g0.L(72.0f);
        int i11 = org.telegram.ui.ActionBar.n6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.n6.L(L, org.telegram.ui.ActionBar.n6.x0(null, i11, false));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
        ph0Var.setBackground(L2);
        org.telegram.ui.ActionBar.u6.j(ph0Var, L2, M, null, null);
        frameLayout.addView(ph0Var, c8.ma.e(72, 72, 17));
        gh0 gh0Var = new gh0(context);
        this.m1 = gh0Var;
        frameLayout.addView(gh0Var, c8.ma.d(64, 32.0f, 49, 29.0f, 16.0f, 0.0f, 0.0f));
        gh0Var.a(0);
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.fh0
            public final /* synthetic */ ih0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        org.telegram.ui.Components.ph0 ph0Var2 = this.b.n1;
                        if (!ph0Var2.b()) {
                            ph0Var2.setProgress(0.0f);
                            ph0Var2.d();
                            break;
                        }
                        break;
                    default:
                        ih0 ih0Var = this.b;
                        org.telegram.messenger.x10 x10Var2 = ih0Var.o1;
                        if (x10Var2 != null) {
                            x10Var2.a(Boolean.TRUE);
                            ih0Var.o1 = null;
                        }
                        ih0Var.dismiss();
                        break;
                }
            }
        });
        g10.addView(frameLayout, c8.ma.o(-1, org.telegram.messenger.ks.v1));
        TextView textView = new TextView(context);
        int i12 = org.telegram.ui.ActionBar.n6.j5;
        org.telegram.ui.ActionBar.u6.U(textView, i12, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setText(org.telegram.messenger.gd.M0(2131747693, null));
        textView.setPadding(org.telegram.messenger.g0.L(30.0f), 0, org.telegram.messenger.g0.L(30.0f), 0);
        g10.addView(textView, c8.ma.o(-1, -2));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.u6.U(textView2, i12, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setText(org.telegram.messenger.gd.M0(2131747694, null));
        textView2.setPadding(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(21.0f));
        g10.addView(textView2, c8.ma.o(-1, -2));
        g10.addView(new hh0(R.drawable.msg_message_s, context, org.telegram.messenger.gd.M0(2131747697, null)), c8.ma.o(-1, -2));
        g10.addView(new hh0(R.drawable.msg_members_list2, context, org.telegram.messenger.gd.M0(2131747696, null)), c8.ma.o(-1, -2));
        g10.addView(new hh0(R.drawable.msg_customize_s, context, org.telegram.messenger.gd.M0(2131747695, null)), c8.ma.o(-1, -2));
        this.O = g10;
        Q(org.telegram.ui.ActionBar.n6.h5);
        TextView textView3 = new TextView(context);
        textView3.setText(org.telegram.messenger.gd.M0(z10 ? 2131747691 : 2131747692, null));
        textView3.setGravity(17);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.Ji, null);
        org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.b6.e(org.telegram.ui.ActionBar.n6.x0(null, i11, false), 24.0f);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i11);
        org.telegram.ui.ActionBar.q6 e11 = org.telegram.ui.ActionBar.u6.e(i11);
        textView3.setBackground(e10);
        org.telegram.ui.ActionBar.u6.j(textView3, e10, M2, e11, null);
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.fh0
            public final /* synthetic */ ih0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        org.telegram.ui.Components.ph0 ph0Var2 = this.b.n1;
                        if (!ph0Var2.b()) {
                            ph0Var2.setProgress(0.0f);
                            ph0Var2.d();
                            break;
                        }
                        break;
                    default:
                        ih0 ih0Var = this.b;
                        org.telegram.messenger.x10 x10Var2 = ih0Var.o1;
                        if (x10Var2 != null) {
                            x10Var2.a(Boolean.TRUE);
                            ih0Var.o1 = null;
                        }
                        ih0Var.dismiss();
                        break;
                }
            }
        });
        g10.addView(textView3, c8.ma.k(14.0f, 14.0f, 14.0f, 10.0f, -1, 48));
        while (i7 < 4) {
            try {
                org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.r);
            } catch (Exception unused) {
            }
            i7++;
        }
    }

    public static void J0() {
        long j3 = org.telegram.messenger.mp.g1().getLong("askNotificationsDuration", 86400000L);
        long currentTimeMillis = System.currentTimeMillis() + j3;
        long j10 = 259200000;
        if (j3 >= 259200000) {
            j10 = 604800000;
            if (j3 >= 604800000) {
                j10 = 2592000000L;
            }
        }
        org.telegram.messenger.mp.g1().edit().putLong("askNotificationsAfter", currentTimeMillis).putLong("askNotificationsDuration", j10).apply();
    }

    public static boolean K0(Activity activity) {
        if (activity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
            return false;
        }
        long j3 = org.telegram.messenger.mp.g1().getLong("askNotificationsAfter", -1L);
        if (j3 != -2) {
            return j3 < 0 || System.currentTimeMillis() >= j3;
        }
        return false;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.mp.I8;
            if ((intValue & 256) >= 0) {
                int i12 = 0;
                for (int i13 = 0; i13 < 4; i13++) {
                    i12 += org.telegram.messenger.tr.a0(i13).L;
                }
                if (this.m1.a(i12)) {
                    org.telegram.ui.Components.ph0 ph0Var = this.n1;
                    if (ph0Var.b()) {
                        return;
                    }
                    ph0Var.setProgress(0.0f);
                    ph0Var.d();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.d2
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.x10 x10Var = this.o1;
        if (x10Var != null) {
            x10Var.a(Boolean.FALSE);
            this.o1 = null;
            J0();
        }
        for (int i7 = 0; i7 < 4; i7++) {
            try {
                org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.r);
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog
    public final void show() {
        super.show();
        System.currentTimeMillis();
    }
}
