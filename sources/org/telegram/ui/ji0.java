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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ji0 extends org.telegram.ui.ActionBar.z2 implements org.telegram.messenger.us {
    public final ii0 i1;
    public final org.telegram.ui.Components.ei0 j1;
    public org.telegram.messenger.q20 k1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji0(Context context, boolean z10, org.telegram.messenger.q20 q20Var) {
        super(context, false);
        final int i10 = 0;
        this.k1 = q20Var;
        final int i11 = 1;
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(context);
        this.j1 = ei0Var;
        ei0Var.setScaleType(ImageView.ScaleType.CENTER);
        ei0Var.f(R.raw.silent_unmute, 46, 46, null);
        ei0Var.d();
        int L = org.telegram.messenger.i0.L(72.0f);
        int i12 = org.telegram.ui.ActionBar.t6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.t6.L(L, org.telegram.ui.ActionBar.t6.x0(null, i12, false));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        ei0Var.setBackground(L2);
        org.telegram.ui.ActionBar.a7.k(ei0Var, L2, N, null, null);
        frameLayout.addView(ei0Var, w7.b6.e(72, 72, 17));
        ii0 ii0Var = new ii0(context);
        this.i1 = ii0Var;
        frameLayout.addView(ii0Var, w7.b6.d(64, 32.0f, 49, 29.0f, 16.0f, 0.0f, 0.0f));
        ii0Var.a(0);
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.hi0
            public final /* synthetic */ ji0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        org.telegram.ui.Components.ei0 ei0Var2 = this.b.j1;
                        if (!ei0Var2.b()) {
                            ei0Var2.setProgress(0.0f);
                            ei0Var2.d();
                            break;
                        }
                        break;
                    default:
                        ji0 ji0Var = this.b;
                        org.telegram.messenger.q20 q20Var2 = ji0Var.k1;
                        if (q20Var2 != null) {
                            q20Var2.a(Boolean.TRUE);
                            ji0Var.k1 = null;
                        }
                        ji0Var.dismiss();
                        break;
                }
            }
        });
        f7.addView(frameLayout, w7.b6.o(-1, org.telegram.messenger.zs.v1));
        TextView textView = new TextView(context);
        int i13 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.ActionBar.a7.V(textView, i13, null);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setText(org.telegram.messenger.cd.L0(2131747902, null));
        textView.setPadding(org.telegram.messenger.i0.L(30.0f), 0, org.telegram.messenger.i0.L(30.0f), 0);
        f7.addView(textView, w7.b6.o(-1, -2));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.a7.V(textView2, i13, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setText(org.telegram.messenger.cd.L0(2131747903, null));
        textView2.setPadding(org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(21.0f));
        f7.addView(textView2, w7.b6.o(-1, -2));
        f7.addView(new dg0(R.drawable.msg_message_s, context, org.telegram.messenger.cd.L0(2131747906, null)), w7.b6.o(-1, -2));
        f7.addView(new dg0(R.drawable.msg_members_list2, context, org.telegram.messenger.cd.L0(2131747905, null)), w7.b6.o(-1, -2));
        f7.addView(new dg0(R.drawable.msg_customize_s, context, org.telegram.messenger.cd.L0(2131747904, null)), w7.b6.o(-1, -2));
        this.N = f7;
        Q(org.telegram.ui.ActionBar.t6.h5);
        TextView textView3 = new TextView(context);
        textView3.setText(org.telegram.messenger.cd.L0(z10 ? 2131747900 : 2131747901, null));
        textView3.setGravity(17);
        textView3.setTypeface(org.telegram.messenger.i0.o());
        textView3.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.Gi, null);
        org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.j6.e(org.telegram.ui.ActionBar.t6.x0(null, i12, false), 24.0f);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i12);
        org.telegram.ui.ActionBar.w6 f10 = org.telegram.ui.ActionBar.a7.f(i12);
        textView3.setBackground(e);
        org.telegram.ui.ActionBar.a7.k(textView3, e, N2, f10, null);
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.hi0
            public final /* synthetic */ ji0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        org.telegram.ui.Components.ei0 ei0Var2 = this.b.j1;
                        if (!ei0Var2.b()) {
                            ei0Var2.setProgress(0.0f);
                            ei0Var2.d();
                            break;
                        }
                        break;
                    default:
                        ji0 ji0Var = this.b;
                        org.telegram.messenger.q20 q20Var2 = ji0Var.k1;
                        if (q20Var2 != null) {
                            q20Var2.a(Boolean.TRUE);
                            ji0Var.k1 = null;
                        }
                        ji0Var.dismiss();
                        break;
                }
            }
        });
        f7.addView(textView3, w7.b6.k(14.0f, 14.0f, 14.0f, 10.0f, -1, 48));
        while (i10 < 4) {
            try {
                org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.r);
            } catch (Exception unused) {
            }
            i10++;
        }
    }

    public static void I0() {
        long j10 = org.telegram.messenger.vp.d1().getLong("askNotificationsDuration", 86400000L);
        long currentTimeMillis = System.currentTimeMillis() + j10;
        long j11 = 259200000;
        if (j10 >= 259200000) {
            j11 = 604800000;
            if (j10 >= 604800000) {
                j11 = 2592000000L;
            }
        }
        org.telegram.messenger.vp.d1().edit().putLong("askNotificationsAfter", currentTimeMillis).putLong("askNotificationsDuration", j11).apply();
    }

    public static boolean J0(Activity activity) {
        if (activity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
            return false;
        }
        long j10 = org.telegram.messenger.vp.d1().getLong("askNotificationsAfter", -1L);
        if (j10 != -2) {
            return j10 < 0 || System.currentTimeMillis() >= j10;
        }
        return false;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i12 = org.telegram.messenger.vp.D8;
            if ((intValue & 256) >= 0) {
                int i13 = 0;
                for (int i14 = 0; i14 < 4; i14++) {
                    i13 += org.telegram.messenger.hs.a0(i14).K;
                }
                if (this.i1.a(i13)) {
                    org.telegram.ui.Components.ei0 ei0Var = this.j1;
                    if (ei0Var.b()) {
                        return;
                    }
                    ei0Var.setProgress(0.0f);
                    ei0Var.d();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.q20 q20Var = this.k1;
        if (q20Var != null) {
            q20Var.a(Boolean.FALSE);
            this.k1 = null;
            I0();
        }
        for (int i10 = 0; i10 < 4; i10++) {
            try {
                org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.r);
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void show() {
        super.show();
        System.currentTimeMillis();
    }
}
