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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class fh0 extends org.telegram.ui.ActionBar.u2 implements org.telegram.messenger.is {
    public final dh0 m1;
    public final org.telegram.ui.Components.fh0 n1;
    public org.telegram.messenger.z10 o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh0(Context context, boolean z10, org.telegram.messenger.z10 z10Var) {
        super(context, false);
        final int i7 = 0;
        this.o1 = z10Var;
        final int i10 = 1;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(context);
        this.n1 = fh0Var;
        fh0Var.setScaleType(ImageView.ScaleType.CENTER);
        fh0Var.f(R.raw.silent_unmute, 46, 46, null);
        fh0Var.d();
        int L = org.telegram.messenger.g0.L(72.0f);
        int i11 = org.telegram.ui.ActionBar.j6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.j6.L(L, org.telegram.ui.ActionBar.j6.x0(null, i11, false));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
        fh0Var.setBackground(L2);
        org.telegram.ui.ActionBar.q6.j(fh0Var, L2, M, null, null);
        frameLayout.addView(fh0Var, c8.ja.e(72, 72, 17));
        dh0 dh0Var = new dh0(context);
        this.m1 = dh0Var;
        frameLayout.addView(dh0Var, c8.ja.d(64, 32.0f, 49, 29.0f, 16.0f, 0.0f, 0.0f));
        dh0Var.a(0);
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ch0
            public final /* synthetic */ fh0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        org.telegram.ui.Components.fh0 fh0Var2 = this.b.n1;
                        if (!fh0Var2.b()) {
                            fh0Var2.setProgress(0.0f);
                            fh0Var2.d();
                            break;
                        }
                        break;
                    default:
                        fh0 fh0Var3 = this.b;
                        org.telegram.messenger.z10 z10Var2 = fh0Var3.o1;
                        if (z10Var2 != null) {
                            z10Var2.a(Boolean.TRUE);
                            fh0Var3.o1 = null;
                        }
                        fh0Var3.dismiss();
                        break;
                }
            }
        });
        f10.addView(frameLayout, c8.ja.o(-1, org.telegram.messenger.ns.v1));
        TextView textView = new TextView(context);
        int i12 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.q6.U(textView, i12, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setText(org.telegram.messenger.hd.M0(2131747886, null));
        textView.setPadding(org.telegram.messenger.g0.L(30.0f), 0, org.telegram.messenger.g0.L(30.0f), 0);
        f10.addView(textView, c8.ja.o(-1, -2));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.q6.U(textView2, i12, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setText(org.telegram.messenger.hd.M0(2131747887, null));
        textView2.setPadding(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(21.0f));
        f10.addView(textView2, c8.ja.o(-1, -2));
        f10.addView(new eh0(R.drawable.msg_message_s, context, org.telegram.messenger.hd.M0(2131747890, null)), c8.ja.o(-1, -2));
        f10.addView(new eh0(R.drawable.msg_members_list2, context, org.telegram.messenger.hd.M0(2131747889, null)), c8.ja.o(-1, -2));
        f10.addView(new eh0(R.drawable.msg_customize_s, context, org.telegram.messenger.hd.M0(2131747888, null)), c8.ja.o(-1, -2));
        this.O = f10;
        Q(org.telegram.ui.ActionBar.j6.h5);
        TextView textView3 = new TextView(context);
        textView3.setText(org.telegram.messenger.hd.M0(z10 ? 2131747884 : 2131747885, null));
        textView3.setGravity(17);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(textView3, org.telegram.ui.ActionBar.j6.Ji, null);
        org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.y5.e(org.telegram.ui.ActionBar.j6.x0(null, i11, false), 24.0f);
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i11);
        org.telegram.ui.ActionBar.m6 e11 = org.telegram.ui.ActionBar.q6.e(i11);
        textView3.setBackground(e10);
        org.telegram.ui.ActionBar.q6.j(textView3, e10, M2, e11, null);
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ch0
            public final /* synthetic */ fh0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        org.telegram.ui.Components.fh0 fh0Var2 = this.b.n1;
                        if (!fh0Var2.b()) {
                            fh0Var2.setProgress(0.0f);
                            fh0Var2.d();
                            break;
                        }
                        break;
                    default:
                        fh0 fh0Var3 = this.b;
                        org.telegram.messenger.z10 z10Var2 = fh0Var3.o1;
                        if (z10Var2 != null) {
                            z10Var2.a(Boolean.TRUE);
                            fh0Var3.o1 = null;
                        }
                        fh0Var3.dismiss();
                        break;
                }
            }
        });
        f10.addView(textView3, c8.ja.k(14.0f, 14.0f, 14.0f, 10.0f, -1, 48));
        while (i7 < 4) {
            try {
                org.telegram.messenger.ns.f(i7).c(this, org.telegram.messenger.ns.r);
            } catch (Exception unused) {
            }
            i7++;
        }
    }

    public static void I0() {
        long j3 = org.telegram.messenger.np.e1().getLong("askNotificationsDuration", 86400000L);
        long currentTimeMillis = System.currentTimeMillis() + j3;
        long j10 = 259200000;
        if (j3 >= 259200000) {
            j10 = 604800000;
            if (j3 >= 604800000) {
                j10 = 2592000000L;
            }
        }
        org.telegram.messenger.np.e1().edit().putLong("askNotificationsAfter", currentTimeMillis).putLong("askNotificationsDuration", j10).apply();
    }

    public static boolean J0(Activity activity) {
        if (activity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
            return false;
        }
        long j3 = org.telegram.messenger.np.e1().getLong("askNotificationsAfter", -1L);
        if (j3 != -2) {
            return j3 < 0 || System.currentTimeMillis() >= j3;
        }
        return false;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.np.D8;
            if ((intValue & 256) >= 0) {
                int i12 = 0;
                for (int i13 = 0; i13 < 4; i13++) {
                    i12 += org.telegram.messenger.vr.a0(i13).L;
                }
                if (this.m1.a(i12)) {
                    org.telegram.ui.Components.fh0 fh0Var = this.n1;
                    if (fh0Var.b()) {
                        return;
                    }
                    fh0Var.setProgress(0.0f);
                    fh0Var.d();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.z10 z10Var = this.o1;
        if (z10Var != null) {
            z10Var.a(Boolean.FALSE);
            this.o1 = null;
            I0();
        }
        for (int i7 = 0; i7 < 4; i7++) {
            try {
                org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.r);
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void show() {
        super.show();
        System.currentTimeMillis();
    }
}
