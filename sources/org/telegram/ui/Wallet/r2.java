package org.telegram.ui.Wallet;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ta0;
import org.telegram.ui.v90;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public abstract class r2 {
    public static void a(final int i10, final Utilities.CallbackReturn callbackReturn, final Utilities.Callback2 callback2, final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, final TwoStepVerificationActivity twoStepVerificationActivity, final Utilities.Callback3 callback3, final boolean z10, final boolean z11, final ta0 ta0Var) {
        if (ta0Var.b) {
            return;
        }
        final org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null || U.getContext() == null) {
            ta0Var.b();
            return;
        }
        final Activity parentActivity = U.getParentActivity();
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        if (parentActivity == null || currentUser == null) {
            ta0Var.b();
            return;
        }
        final org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(U.getContext(), 3, null);
        if (z11) {
            c2Var.r(250L);
        }
        Utilities.Callback callback = new Utilities.Callback() { // from class: org.telegram.ui.Wallet.o2
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                TLMethod tLMethod = (TLMethod) obj;
                final ta0 ta0Var2 = ta0Var;
                boolean z12 = ta0Var2.b;
                final org.telegram.ui.ActionBar.c2 c2Var2 = c2Var;
                if (z12 || tLMethod == null) {
                    c2Var2.dismiss();
                    ta0Var2.b();
                    return;
                }
                final int i11 = i10;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                final Activity activity = parentActivity;
                final Utilities.Callback2 callback22 = callback2;
                final Utilities.Callback3 callback32 = callback3;
                final Utilities.CallbackReturn callbackReturn2 = callbackReturn;
                final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP2 = inputCheckPasswordSRP;
                final org.telegram.ui.ActionBar.o2 o2Var = U;
                final TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                final boolean z13 = z10;
                final boolean z14 = z11;
                connectionsManager.sendRequestTyped(tLMethod, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Wallet.p2
                    @Override // org.telegram.messenger.Utilities.Callback2
                    public final void run(Object obj2, Object obj3) {
                        TLObject tLObject = (TLObject) obj2;
                        final TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                        c2Var2.dismiss();
                        final ta0 ta0Var3 = ta0Var2;
                        if (ta0Var3.b) {
                            return;
                        }
                        final TwoStepVerificationActivity twoStepVerificationActivity3 = twoStepVerificationActivity2;
                        final Utilities.Callback3 callback33 = callback32;
                        TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP3 = inputCheckPasswordSRP2;
                        if (tL_error == null) {
                            ta0Var3.c = true;
                            if (twoStepVerificationActivity3 != null) {
                                try {
                                    twoStepVerificationActivity3.o0();
                                    twoStepVerificationActivity3.finishFragment();
                                } finally {
                                }
                            }
                            callback33.run(tLObject, tL_error, inputCheckPasswordSRP3);
                            ta0Var3.b();
                            return;
                        }
                        boolean equals = "PASSWORD_MISSING".equals(tL_error.text);
                        final int i12 = i11;
                        final Utilities.CallbackReturn callbackReturn3 = callbackReturn2;
                        final Utilities.Callback2 callback23 = callback22;
                        final boolean z15 = z13;
                        final boolean z16 = z14;
                        if (equals || tL_error.text.startsWith("PASSWORD_TOO_FRESH_") || tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                            if (twoStepVerificationActivity3 != null) {
                                twoStepVerificationActivity3.o0();
                            }
                            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(i12);
                            TL_account.getPassword getpassword = new TL_account.getPassword();
                            org.telegram.messenger.a aVar2 = new org.telegram.messenger.a();
                            final Activity activity2 = activity;
                            final org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            connectionsManager2.sendRequestTyped(getpassword, aVar2, new Utilities.Callback2() { // from class: org.telegram.ui.Wallet.k2
                                @Override // org.telegram.messenger.Utilities.Callback2
                                public final void run(Object obj4, Object obj5) {
                                    int i13;
                                    TL_account.Password password = (TL_account.Password) obj4;
                                    TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj5;
                                    ta0 ta0Var4 = ta0.this;
                                    if (ta0Var4.b) {
                                        return;
                                    }
                                    if (tL_error2 == null) {
                                        q2 q2Var = new q2(ta0Var4);
                                        int i14 = i12;
                                        q2Var.setCurrentAccount(i14);
                                        Utilities.CallbackReturn callbackReturn4 = callbackReturn3;
                                        Utilities.Callback2 callback24 = callback23;
                                        Utilities.Callback3 callback34 = callback33;
                                        boolean z17 = z15;
                                        m2 m2Var = new m2(i14, callbackReturn4, callback24, q2Var, callback34, z17, z16, ta0Var4, 0);
                                        q2Var.Z = 1;
                                        q2Var.b0 = m2Var;
                                        q2Var.I = password;
                                        q2Var.J = false;
                                        org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                        if (U2 == null || U2.getContext() == null) {
                                            ta0Var4.b();
                                            return;
                                        } else {
                                            if (!z17) {
                                                U2.presentFragment(q2Var);
                                                return;
                                            }
                                            org.telegram.ui.ActionBar.m2 m2Var2 = new org.telegram.ui.ActionBar.m2();
                                            m2Var2.a = true;
                                            U2.showAsSheet(q2Var, m2Var2);
                                            return;
                                        }
                                    }
                                    ta0Var4.b();
                                    Activity activity3 = activity2;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity3);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                                    LinearLayout linearLayout = new LinearLayout(activity3);
                                    linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                                    linearLayout.setOrientation(1);
                                    alertDialog$Builder.o(linearLayout);
                                    TextView textView = new TextView(activity3);
                                    int i15 = org.telegram.ui.ActionBar.k6.j5;
                                    org.telegram.ui.ActionBar.r6.W(textView, i15, null);
                                    textView.setTextSize(1, 16.0f);
                                    textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                                    textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
                                    linearLayout.addView(textView, w7.z5.n(-1, -2));
                                    LinearLayout linearLayout2 = new LinearLayout(activity3);
                                    linearLayout2.setOrientation(0);
                                    linearLayout.addView(linearLayout2, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                    ImageView imageView = new ImageView(activity3);
                                    imageView.setImageResource(R.drawable.list_circle);
                                    imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    org.telegram.ui.ActionBar.r6.t(imageView, i15, null, mode);
                                    TextView textView2 = new TextView(activity3);
                                    org.telegram.ui.ActionBar.r6.W(textView2, i15, null);
                                    textView2.setTextSize(1, 16.0f);
                                    textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                                    org.telegram.messenger.v0.m(R.string.EditAdminTransferAlertText1, textView2);
                                    if (LocaleController.isRTL) {
                                        linearLayout2.addView(textView2, w7.z5.n(-1, -2));
                                        linearLayout2.addView(imageView, w7.z5.q(-2, -2, 5));
                                    } else {
                                        linearLayout2.addView(imageView, w7.z5.n(-2, -2));
                                        linearLayout2.addView(textView2, w7.z5.n(-1, -2));
                                    }
                                    LinearLayout f7 = org.telegram.messenger.v0.f(activity3, 0);
                                    linearLayout.addView(f7, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                    ImageView imageView2 = new ImageView(activity3);
                                    imageView2.setImageResource(R.drawable.list_circle);
                                    imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
                                    org.telegram.ui.ActionBar.r6.t(imageView2, i15, null, mode);
                                    TextView textView3 = new TextView(activity3);
                                    org.telegram.ui.ActionBar.r6.W(textView3, i15, null);
                                    textView3.setTextSize(1, 16.0f);
                                    textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                                    org.telegram.messenger.v0.m(R.string.EditAdminTransferAlertText2, textView3);
                                    if (LocaleController.isRTL) {
                                        f7.addView(textView3, w7.z5.n(-1, -2));
                                        i13 = 5;
                                        f7.addView(imageView2, w7.z5.q(-2, -2, 5));
                                    } else {
                                        i13 = 5;
                                        f7.addView(imageView2, w7.z5.n(-2, -2));
                                        f7.addView(textView3, w7.z5.n(-1, -2));
                                    }
                                    boolean equals2 = "PASSWORD_MISSING".equals(tL_error.text);
                                    org.telegram.ui.ActionBar.o2 o2Var3 = o2Var2;
                                    if (equals2) {
                                        alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new n2(o2Var3, 0));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    } else {
                                        TextView textView4 = new TextView(activity3);
                                        org.telegram.ui.ActionBar.r6.W(textView4, i15, null);
                                        textView4.setTextSize(1, 16.0f);
                                        textView4.setGravity((LocaleController.isRTL ? i13 : 3) | 48);
                                        textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                                        linearLayout.addView(textView4, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                                    }
                                    TwoStepVerificationActivity twoStepVerificationActivity4 = twoStepVerificationActivity3;
                                    if (twoStepVerificationActivity4 != null) {
                                        twoStepVerificationActivity4.showDialog(alertDialog$Builder.a);
                                    } else {
                                        o2Var3.showDialog(alertDialog$Builder.a);
                                    }
                                }
                            }, 8);
                            return;
                        }
                        if ("SRP_ID_INVALID".equals(tL_error.text)) {
                            ConnectionsManager.getInstance(i12).sendRequestTyped(new TL_account.getPassword(), new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.Wallet.l2
                                @Override // org.telegram.messenger.Utilities.Callback2
                                public final void run(Object obj4, Object obj5) {
                                    Utilities.Callback2 callback24;
                                    Utilities.CallbackReturn callbackReturn4;
                                    int i13;
                                    TwoStepVerificationActivity twoStepVerificationActivity4;
                                    TL_account.Password password = (TL_account.Password) obj4;
                                    TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj5;
                                    ta0 ta0Var4 = ta0.this;
                                    if (ta0Var4.b) {
                                        return;
                                    }
                                    if (tL_error2 != null) {
                                        ta0Var4.b();
                                        return;
                                    }
                                    TwoStepVerificationActivity twoStepVerificationActivity5 = twoStepVerificationActivity3;
                                    int i14 = i12;
                                    Utilities.CallbackReturn callbackReturn5 = callbackReturn3;
                                    Utilities.Callback2 callback25 = callback23;
                                    Utilities.Callback3 callback34 = callback33;
                                    boolean z17 = z15;
                                    boolean z18 = z16;
                                    if (twoStepVerificationActivity5 == null) {
                                        q2 q2Var = new q2(ta0Var4);
                                        q2Var.setCurrentAccount(i14);
                                        callback24 = callback25;
                                        callbackReturn4 = callbackReturn5;
                                        i13 = i14;
                                        m2 m2Var = new m2(i13, callbackReturn4, callback24, q2Var, callback34, z17, z18, ta0Var4, 1);
                                        q2Var.Z = 1;
                                        q2Var.b0 = m2Var;
                                        q2Var.s0(new v90(ta0Var4, z17, q2Var, 12));
                                        twoStepVerificationActivity4 = q2Var;
                                    } else {
                                        callback24 = callback25;
                                        callbackReturn4 = callbackReturn5;
                                        i13 = i14;
                                        twoStepVerificationActivity4 = twoStepVerificationActivity5;
                                    }
                                    twoStepVerificationActivity4.I = password;
                                    TwoStepVerificationActivity.m0(password);
                                    r2.a(i13, callbackReturn4, callback24, twoStepVerificationActivity4.l0(), twoStepVerificationActivity4, callback34, z17, z18, ta0Var4);
                                }
                            }, 8);
                            return;
                        }
                        ta0Var3.c = true;
                        if (twoStepVerificationActivity3 != null) {
                            try {
                                twoStepVerificationActivity3.o0();
                                twoStepVerificationActivity3.finishFragment();
                            } finally {
                            }
                        }
                        callback33.run(tLObject, tL_error, inputCheckPasswordSRP3);
                        ta0Var3.b();
                    }
                });
            }
        };
        if (callbackReturn != null) {
            callback.run((TLMethod) callbackReturn.run(inputCheckPasswordSRP));
        } else if (callback2 != null) {
            callback2.run(inputCheckPasswordSRP, callback);
        }
    }
}
