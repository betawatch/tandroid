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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class jh0 extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.gs {
    public final hh0 m1;
    public final org.telegram.ui.Components.rh0 n1;
    public org.telegram.messenger.y10 o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh0(Context context, boolean z10, org.telegram.messenger.y10 y10Var) {
        super(context, false);
        final int i7 = 0;
        this.o1 = y10Var;
        final int i10 = 1;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.rh0 rh0Var = new org.telegram.ui.Components.rh0(context);
        this.n1 = rh0Var;
        rh0Var.setScaleType(ImageView.ScaleType.CENTER);
        rh0Var.f(R.raw.silent_unmute, 46, 46, null);
        rh0Var.d();
        int L = org.telegram.messenger.g0.L(72.0f);
        int i11 = org.telegram.ui.ActionBar.m6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.m6.L(L, org.telegram.ui.ActionBar.m6.x0(null, i11, false));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
        rh0Var.setBackground(L2);
        org.telegram.ui.ActionBar.t6.j(rh0Var, L2, M, null, null);
        frameLayout.addView(rh0Var, c8.ma.e(72, 72, 17));
        hh0 hh0Var = new hh0(context);
        this.m1 = hh0Var;
        frameLayout.addView(hh0Var, c8.ma.d(64, 32.0f, 49, 29.0f, 16.0f, 0.0f, 0.0f));
        hh0Var.a(0);
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.gh0
            public final /* synthetic */ jh0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        org.telegram.ui.Components.rh0 rh0Var2 = this.b.n1;
                        if (!rh0Var2.b()) {
                            rh0Var2.setProgress(0.0f);
                            rh0Var2.d();
                            break;
                        }
                        break;
                    default:
                        jh0 jh0Var = this.b;
                        org.telegram.messenger.y10 y10Var2 = jh0Var.o1;
                        if (y10Var2 != null) {
                            y10Var2.a(Boolean.TRUE);
                            jh0Var.o1 = null;
                        }
                        jh0Var.dismiss();
                        break;
                }
            }
        });
        g10.addView(frameLayout, c8.ma.o(-1, org.telegram.messenger.ls.v1));
        TextView textView = new TextView(context);
        int i12 = org.telegram.ui.ActionBar.m6.j5;
        org.telegram.ui.ActionBar.t6.U(textView, i12, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setText(org.telegram.messenger.hd.N0(2131747692, null));
        textView.setPadding(org.telegram.messenger.g0.L(30.0f), 0, org.telegram.messenger.g0.L(30.0f), 0);
        g10.addView(textView, c8.ma.o(-1, -2));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.t6.U(textView2, i12, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setText(org.telegram.messenger.hd.N0(2131747693, null));
        textView2.setPadding(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(21.0f));
        g10.addView(textView2, c8.ma.o(-1, -2));
        g10.addView(new ih0(R.drawable.msg_message_s, context, org.telegram.messenger.hd.N0(2131747696, null)), c8.ma.o(-1, -2));
        g10.addView(new ih0(R.drawable.msg_members_list2, context, org.telegram.messenger.hd.N0(2131747695, null)), c8.ma.o(-1, -2));
        g10.addView(new ih0(R.drawable.msg_customize_s, context, org.telegram.messenger.hd.N0(2131747694, null)), c8.ma.o(-1, -2));
        this.O = g10;
        Q(org.telegram.ui.ActionBar.m6.h5);
        TextView textView3 = new TextView(context);
        textView3.setText(org.telegram.messenger.hd.N0(z10 ? 2131747690 : 2131747691, null));
        textView3.setGravity(17);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.Ji, null);
        org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.a6.e(org.telegram.ui.ActionBar.m6.x0(null, i11, false), 24.0f);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i11);
        org.telegram.ui.ActionBar.p6 e11 = org.telegram.ui.ActionBar.t6.e(i11);
        textView3.setBackground(e10);
        org.telegram.ui.ActionBar.t6.j(textView3, e10, M2, e11, null);
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.gh0
            public final /* synthetic */ jh0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        org.telegram.ui.Components.rh0 rh0Var2 = this.b.n1;
                        if (!rh0Var2.b()) {
                            rh0Var2.setProgress(0.0f);
                            rh0Var2.d();
                            break;
                        }
                        break;
                    default:
                        jh0 jh0Var = this.b;
                        org.telegram.messenger.y10 y10Var2 = jh0Var.o1;
                        if (y10Var2 != null) {
                            y10Var2.a(Boolean.TRUE);
                            jh0Var.o1 = null;
                        }
                        jh0Var.dismiss();
                        break;
                }
            }
        });
        g10.addView(textView3, c8.ma.k(14.0f, 14.0f, 14.0f, 10.0f, -1, 48));
        while (i7 < 4) {
            try {
                org.telegram.messenger.ls.f(i7).c(this, org.telegram.messenger.ls.r);
            } catch (Exception unused) {
            }
            i7++;
        }
    }

    public static void J0() {
        long j3 = org.telegram.messenger.np.g1().getLong("askNotificationsDuration", 86400000L);
        long currentTimeMillis = System.currentTimeMillis() + j3;
        long j10 = 259200000;
        if (j3 >= 259200000) {
            j10 = 604800000;
            if (j3 >= 604800000) {
                j10 = 2592000000L;
            }
        }
        org.telegram.messenger.np.g1().edit().putLong("askNotificationsAfter", currentTimeMillis).putLong("askNotificationsDuration", j10).apply();
    }

    public static boolean K0(Activity activity) {
        if (activity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
            return false;
        }
        long j3 = org.telegram.messenger.np.g1().getLong("askNotificationsAfter", -1L);
        if (j3 != -2) {
            return j3 < 0 || System.currentTimeMillis() >= j3;
        }
        return false;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.np.I8;
            if ((intValue & 256) >= 0) {
                int i12 = 0;
                for (int i13 = 0; i13 < 4; i13++) {
                    i12 += org.telegram.messenger.ur.a0(i13).L;
                }
                if (this.m1.a(i12)) {
                    org.telegram.ui.Components.rh0 rh0Var = this.n1;
                    if (rh0Var.b()) {
                        return;
                    }
                    rh0Var.setProgress(0.0f);
                    rh0Var.d();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.y10 y10Var = this.o1;
        if (y10Var != null) {
            y10Var.a(Boolean.FALSE);
            this.o1 = null;
            J0();
        }
        for (int i7 = 0; i7 < 4; i7++) {
            try {
                org.telegram.messenger.ls.f(i7).n(this, org.telegram.messenger.ls.r);
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        System.currentTimeMillis();
    }
}
