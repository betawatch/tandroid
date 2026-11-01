package org.telegram.ui.Wallet;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.k20;
import org.telegram.messenger.m20;
import org.telegram.messenger.r20;
import org.telegram.messenger.s20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.z90;
import org.telegram.ui.zj0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public abstract class i3 {
    public static void a(final int i10, final s20 s20Var, final k20 k20Var, final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, final TwoStepVerificationActivity twoStepVerificationActivity, final m20 m20Var, final boolean z10, final boolean z11, final z90 z90Var) {
        if (z90Var.b) {
            return;
        }
        final org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (T == null || T.getContext() == null) {
            z90Var.a();
            return;
        }
        final Activity parentActivity = T.getParentActivity();
        TLRPC.User f7 = e20.i(i10).f();
        if (parentActivity == null || f7 == null) {
            z90Var.a();
            return;
        }
        final org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, T.getContext(), null);
        if (z11) {
            x1Var.r(250L);
        }
        r20 r20Var = new r20() { // from class: org.telegram.ui.Wallet.f3
            @Override // org.telegram.messenger.r20
            public final void a(Object obj) {
                TLMethod tLMethod = (TLMethod) obj;
                final z90 z90Var2 = z90Var;
                boolean z12 = z90Var2.b;
                final org.telegram.ui.ActionBar.x1 x1Var2 = x1Var;
                if (z12 || tLMethod == null) {
                    x1Var2.dismiss();
                    z90Var2.a();
                    return;
                }
                final int i11 = i10;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                a3.b bVar = new a3.b(1);
                final Activity activity = parentActivity;
                final k20 k20Var2 = k20Var;
                final m20 m20Var2 = m20Var;
                final s20 s20Var2 = s20Var;
                final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP2 = inputCheckPasswordSRP;
                final org.telegram.ui.ActionBar.k2 k2Var = T;
                final TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                final boolean z13 = z10;
                final boolean z14 = z11;
                connectionsManager.sendRequestTyped(tLMethod, bVar, new k20() { // from class: org.telegram.ui.Wallet.g3
                    @Override // org.telegram.messenger.k20
                    public final void a(Object obj2, Object obj3) {
                        TLObject tLObject = (TLObject) obj2;
                        final TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                        x1Var2.dismiss();
                        final z90 z90Var3 = z90Var2;
                        if (z90Var3.b) {
                            return;
                        }
                        final TwoStepVerificationActivity twoStepVerificationActivity3 = twoStepVerificationActivity2;
                        final m20 m20Var3 = m20Var2;
                        TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP3 = inputCheckPasswordSRP2;
                        if (tL_error == null) {
                            z90Var3.c = true;
                            if (twoStepVerificationActivity3 != null) {
                                try {
                                    twoStepVerificationActivity3.t0();
                                    twoStepVerificationActivity3.finishFragment();
                                } finally {
                                }
                            }
                            m20Var3.a(tLObject, tL_error, inputCheckPasswordSRP3);
                            z90Var3.a();
                            return;
                        }
                        boolean equals = "PASSWORD_MISSING".equals(tL_error.text);
                        final int i12 = i11;
                        final s20 s20Var3 = s20Var2;
                        final k20 k20Var3 = k20Var2;
                        final boolean z15 = z13;
                        final boolean z16 = z14;
                        if (equals || tL_error.text.startsWith("PASSWORD_TOO_FRESH_") || tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                            if (twoStepVerificationActivity3 != null) {
                                twoStepVerificationActivity3.t0();
                            }
                            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(i12);
                            TL_account.getPassword getpassword = new TL_account.getPassword();
                            a3.b bVar2 = new a3.b(1);
                            final Activity activity2 = activity;
                            final org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                            connectionsManager2.sendRequestTyped(getpassword, bVar2, new k20() { // from class: org.telegram.ui.Wallet.b3
                                @Override // org.telegram.messenger.k20
                                public final void a(Object obj4, Object obj5) {
                                    int i13;
                                    TL_account.Password password = (TL_account.Password) obj4;
                                    TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj5;
                                    z90 z90Var4 = z90.this;
                                    if (z90Var4.b) {
                                        return;
                                    }
                                    if (tL_error2 == null) {
                                        h3 h3Var = new h3(z90Var4);
                                        int i14 = i12;
                                        h3Var.setCurrentAccount(i14);
                                        s20 s20Var4 = s20Var3;
                                        k20 k20Var4 = k20Var3;
                                        m20 m20Var4 = m20Var3;
                                        boolean z17 = z15;
                                        d3 d3Var = new d3(i14, s20Var4, k20Var4, h3Var, m20Var4, z17, z16, z90Var4, 0);
                                        h3Var.Z = 1;
                                        h3Var.b0 = d3Var;
                                        h3Var.I = password;
                                        h3Var.J = false;
                                        org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                                        if (T2 == null || T2.getContext() == null) {
                                            z90Var4.a();
                                            return;
                                        } else {
                                            if (!z17) {
                                                T2.presentFragment(h3Var);
                                                return;
                                            }
                                            org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
                                            i2Var.a = true;
                                            T2.showAsSheet(h3Var, i2Var);
                                            return;
                                        }
                                    }
                                    z90Var4.a();
                                    Activity activity3 = activity2;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity3);
                                    String L0 = dd.L0(2131751298, null);
                                    org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder.a;
                                    x1Var3.R = L0;
                                    LinearLayout linearLayout = new LinearLayout(activity3);
                                    linearLayout.setPadding(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(24.0f), 0);
                                    linearLayout.setOrientation(1);
                                    alertDialog$Builder.o(linearLayout);
                                    TextView textView = new TextView(activity3);
                                    int i15 = org.telegram.ui.ActionBar.t6.j5;
                                    org.telegram.ui.ActionBar.a7.V(textView, i15, null);
                                    textView.setTextSize(1, 16.0f);
                                    textView.setGravity((dd.X ? 5 : 3) | 48);
                                    textView.setText(org.telegram.messenger.i0.W2(dd.L0(2131742889, null)));
                                    linearLayout.addView(textView, w7.b6.o(-1, -2));
                                    LinearLayout linearLayout2 = new LinearLayout(activity3);
                                    linearLayout2.setOrientation(0);
                                    linearLayout.addView(linearLayout2, w7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                    ImageView imageView = new ImageView(activity3);
                                    imageView.setImageResource(R.drawable.list_circle);
                                    imageView.setPadding(dd.X ? org.telegram.messenger.i0.L(11.0f) : 0, org.telegram.messenger.i0.L(9.0f), dd.X ? 0 : org.telegram.messenger.i0.L(11.0f), 0);
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    org.telegram.ui.ActionBar.a7.t(imageView, i15, null, mode);
                                    TextView textView2 = new TextView(activity3);
                                    org.telegram.ui.ActionBar.a7.V(textView2, i15, null);
                                    textView2.setTextSize(1, 16.0f);
                                    textView2.setGravity((dd.X ? 5 : 3) | 48);
                                    textView2.setText(org.telegram.messenger.i0.W2(dd.L0(2131751301, null)));
                                    if (dd.X) {
                                        linearLayout2.addView(textView2, w7.b6.o(-1, -2));
                                        linearLayout2.addView(imageView, w7.b6.r(-2, -2, 5));
                                    } else {
                                        linearLayout2.addView(imageView, w7.b6.o(-2, -2));
                                        linearLayout2.addView(textView2, w7.b6.o(-1, -2));
                                    }
                                    LinearLayout e = org.telegram.messenger.m5.e(activity3, 0);
                                    linearLayout.addView(e, w7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                    ImageView imageView2 = new ImageView(activity3);
                                    imageView2.setImageResource(R.drawable.list_circle);
                                    imageView2.setPadding(dd.X ? org.telegram.messenger.i0.L(11.0f) : 0, org.telegram.messenger.i0.L(9.0f), dd.X ? 0 : org.telegram.messenger.i0.L(11.0f), 0);
                                    org.telegram.ui.ActionBar.a7.t(imageView2, i15, null, mode);
                                    TextView textView3 = new TextView(activity3);
                                    org.telegram.ui.ActionBar.a7.V(textView3, i15, null);
                                    textView3.setTextSize(1, 16.0f);
                                    textView3.setGravity((dd.X ? 5 : 3) | 48);
                                    textView3.setText(org.telegram.messenger.i0.W2(dd.L0(2131751300, null)));
                                    if (dd.X) {
                                        e.addView(textView3, w7.b6.o(-1, -2));
                                        i13 = 5;
                                        e.addView(imageView2, w7.b6.r(-2, -2, 5));
                                    } else {
                                        i13 = 5;
                                        e.addView(imageView2, w7.b6.o(-2, -2));
                                        e.addView(textView3, w7.b6.o(-1, -2));
                                    }
                                    boolean equals2 = "PASSWORD_MISSING".equals(tL_error.text);
                                    org.telegram.ui.ActionBar.k2 k2Var3 = k2Var2;
                                    if (equals2) {
                                        alertDialog$Builder.k(dd.L0(2131751292, null), new e3(k2Var3, 0));
                                        alertDialog$Builder.h(dd.L0(2131752589, null), null);
                                    } else {
                                        TextView textView4 = new TextView(activity3);
                                        org.telegram.ui.ActionBar.a7.V(textView4, i15, null);
                                        textView4.setTextSize(1, 16.0f);
                                        if (!dd.X) {
                                            i13 = 3;
                                        }
                                        org.telegram.messenger.m5.l(textView4, i13 | 48, null, 2131751299);
                                        linearLayout.addView(textView4, w7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                        alertDialog$Builder.h(dd.L0(2131747847, null), null);
                                    }
                                    TwoStepVerificationActivity twoStepVerificationActivity4 = twoStepVerificationActivity3;
                                    if (twoStepVerificationActivity4 != null) {
                                        twoStepVerificationActivity4.showDialog(x1Var3);
                                    } else {
                                        k2Var3.showDialog(x1Var3);
                                    }
                                }
                            }, 8);
                            return;
                        }
                        if ("SRP_ID_INVALID".equals(tL_error.text)) {
                            ConnectionsManager.getInstance(i12).sendRequestTyped(new TL_account.getPassword(), new a3.b(1), new k20() { // from class: org.telegram.ui.Wallet.c3
                                @Override // org.telegram.messenger.k20
                                public final void a(Object obj4, Object obj5) {
                                    k20 k20Var4;
                                    s20 s20Var4;
                                    int i13;
                                    TwoStepVerificationActivity twoStepVerificationActivity4;
                                    TL_account.Password password = (TL_account.Password) obj4;
                                    TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj5;
                                    z90 z90Var4 = z90.this;
                                    if (z90Var4.b) {
                                        return;
                                    }
                                    if (tL_error2 != null) {
                                        z90Var4.a();
                                        return;
                                    }
                                    TwoStepVerificationActivity twoStepVerificationActivity5 = twoStepVerificationActivity3;
                                    int i14 = i12;
                                    s20 s20Var5 = s20Var3;
                                    k20 k20Var5 = k20Var3;
                                    m20 m20Var4 = m20Var3;
                                    boolean z17 = z15;
                                    boolean z18 = z16;
                                    if (twoStepVerificationActivity5 == null) {
                                        h3 h3Var = new h3(z90Var4);
                                        h3Var.setCurrentAccount(i14);
                                        k20Var4 = k20Var5;
                                        s20Var4 = s20Var5;
                                        i13 = i14;
                                        d3 d3Var = new d3(i13, s20Var4, k20Var4, h3Var, m20Var4, z17, z18, z90Var4, 1);
                                        h3Var.Z = 1;
                                        h3Var.b0 = d3Var;
                                        h3Var.x0(new zj0(z90Var4, z17, h3Var, 10));
                                        twoStepVerificationActivity4 = h3Var;
                                    } else {
                                        k20Var4 = k20Var5;
                                        s20Var4 = s20Var5;
                                        i13 = i14;
                                        twoStepVerificationActivity4 = twoStepVerificationActivity5;
                                    }
                                    twoStepVerificationActivity4.I = password;
                                    TwoStepVerificationActivity.r0(password);
                                    i3.a(i13, s20Var4, k20Var4, twoStepVerificationActivity4.q0(), twoStepVerificationActivity4, m20Var4, z17, z18, z90Var4);
                                }
                            }, 8);
                            return;
                        }
                        z90Var3.c = true;
                        if (twoStepVerificationActivity3 != null) {
                            try {
                                twoStepVerificationActivity3.t0();
                                twoStepVerificationActivity3.finishFragment();
                            } finally {
                            }
                        }
                        m20Var3.a(tLObject, tL_error, inputCheckPasswordSRP3);
                        z90Var3.a();
                    }
                });
            }
        };
        if (s20Var != null) {
            r20Var.a((TLMethod) s20Var.a(inputCheckPasswordSRP));
        } else if (k20Var != null) {
            k20Var.a(inputCheckPasswordSRP, r20Var);
        }
    }
}
