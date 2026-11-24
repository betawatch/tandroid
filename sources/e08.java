// default package

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public abstract class e08 {
    public static void a(final int i, final rac racVar, final nv0 nv0Var, final TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, final d08 d08Var, final lac lacVar, final boolean z, final boolean z2, final s34 s34Var) {
        if (s34Var.a) {
            return;
        }
        final d S = LaunchActivity.S();
        if (S == null || S.getContext() == null) {
            s34Var.f();
            return;
        }
        final Activity parentActivity = S.getParentActivity();
        TLRPC.User f = z8c.h(i).f();
        if (parentActivity == null || f == null) {
            s34Var.f();
            return;
        }
        final he heVar = new he(3, null, S.getContext());
        if (z2) {
            heVar.q(250L);
        }
        qac qacVar = new qac() { // from class: zz7
            @Override // qac
            public final void a(Object obj) {
                TLMethod tLMethod = (TLMethod) obj;
                final s34 s34Var2 = s34Var;
                boolean z3 = s34Var2.a;
                final he heVar2 = heVar;
                if (z3 || tLMethod == null) {
                    heVar2.dismiss();
                    s34Var2.f();
                    return;
                }
                final int i2 = i;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i2);
                kc kcVar = new kc((byte) 0);
                final nv0 nv0Var2 = nv0Var;
                final d08 d08Var2 = d08Var;
                final lac lacVar2 = lacVar;
                final rac racVar2 = racVar;
                final Activity activity = parentActivity;
                final TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP2 = tL_inputCheckPasswordSRP;
                final d dVar = S;
                final boolean z4 = z;
                final boolean z5 = z2;
                connectionsManager.sendRequestTyped(tLMethod, kcVar, new jac() { // from class: a08
                    @Override // jac
                    public final void a(Object obj2, Object obj3) {
                        TLObject tLObject = (TLObject) obj2;
                        final TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                        heVar2.dismiss();
                        final s34 s34Var3 = s34Var2;
                        if (s34Var3.a) {
                            return;
                        }
                        final d08 d08Var3 = d08Var2;
                        final lac lacVar3 = lacVar2;
                        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP3 = tL_inputCheckPasswordSRP2;
                        if (tL_error == null) {
                            s34Var3.b = true;
                            if (d08Var3 != null) {
                                try {
                                    d08Var3.t0();
                                    d08Var3.finishFragment();
                                } finally {
                                }
                            }
                            lacVar3.a(tLObject, tL_error, tL_inputCheckPasswordSRP3);
                            return;
                        }
                        boolean equals = "PASSWORD_MISSING".equals(tL_error.text);
                        final int i3 = i2;
                        final rac racVar3 = racVar2;
                        final nv0 nv0Var3 = nv0Var2;
                        final boolean z6 = z4;
                        final boolean z7 = z5;
                        if (equals || tL_error.text.startsWith("PASSWORD_TOO_FRESH_") || tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                            if (d08Var3 != null) {
                                d08Var3.t0();
                            }
                            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(i3);
                            TL_account.getPassword getpassword = new TL_account.getPassword();
                            kc kcVar2 = new kc((byte) 0);
                            final Activity activity2 = activity;
                            final d dVar2 = dVar;
                            connectionsManager2.sendRequestTyped(getpassword, kcVar2, new jac() { // from class: b08
                                @Override // jac
                                public final void a(Object obj4, Object obj5) {
                                    TL_account.Password password = (TL_account.Password) obj4;
                                    TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj5;
                                    s34 s34Var4 = s34.this;
                                    if (s34Var4.a) {
                                        return;
                                    }
                                    if (tL_error2 == null) {
                                        d08 d08Var4 = new d08(s34Var4);
                                        int i4 = i3;
                                        d08Var4.setCurrentAccount(i4);
                                        rac racVar4 = racVar3;
                                        nv0 nv0Var4 = nv0Var3;
                                        lac lacVar4 = lacVar3;
                                        boolean z8 = z6;
                                        yz7 yz7Var = new yz7(i4, racVar4, nv0Var4, d08Var4, lacVar4, z8, z7, s34Var4, (byte) 0);
                                        d08Var4.a0 = (byte) 1;
                                        d08Var4.c0 = yz7Var;
                                        d08Var4.J = password;
                                        d08Var4.K = false;
                                        d S2 = LaunchActivity.S();
                                        if (S2 == null || S2.getContext() == null) {
                                            s34Var4.f();
                                            return;
                                        } else {
                                            if (!z8) {
                                                S2.presentFragment(d08Var4);
                                                return;
                                            }
                                            bh0 bh0Var = new bh0();
                                            bh0Var.a = true;
                                            S2.showAsSheet(d08Var4, bh0Var);
                                            return;
                                        }
                                    }
                                    s34Var4.f();
                                    Activity activity3 = activity2;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity3);
                                    String M0 = jb6.M0(2131751234, null);
                                    he heVar3 = alertDialog$Builder.a;
                                    heVar3.S = M0;
                                    LinearLayout linearLayout = new LinearLayout(activity3);
                                    linearLayout.setPadding(gm.L(24.0f), gm.L(2.0f), gm.L(24.0f), 0);
                                    linearLayout.setOrientation(1);
                                    alertDialog$Builder.n(linearLayout);
                                    TextView textView = new TextView(activity3);
                                    int i5 = cmb.i5;
                                    anb.X(textView, i5, null);
                                    textView.setTextSize(1, 16.0f);
                                    textView.setGravity((jb6.a0 ? 5 : 3) | 48);
                                    textView.setText(gm.S2(jb6.M0(2131742527, null)));
                                    linearLayout.addView(textView, qoe.o(-1, -2));
                                    LinearLayout linearLayout2 = new LinearLayout(activity3);
                                    linearLayout2.setOrientation(0);
                                    linearLayout.addView(linearLayout2, qoe.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                    ImageView imageView = new ImageView(activity3);
                                    imageView.setImageResource(R.drawable.list_circle);
                                    imageView.setPadding(jb6.a0 ? gm.L(11.0f) : 0, gm.L(9.0f), jb6.a0 ? 0 : gm.L(11.0f), 0);
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    anb.s(imageView, i5, null, mode);
                                    TextView textView2 = new TextView(activity3);
                                    anb.X(textView2, i5, null);
                                    textView2.setTextSize(1, 16.0f);
                                    textView2.setGravity((jb6.a0 ? 5 : 3) | 48);
                                    textView2.setText(gm.S2(jb6.M0(2131751237, null)));
                                    if (jb6.a0) {
                                        linearLayout2.addView(textView2, qoe.o(-1, -2));
                                        linearLayout2.addView(imageView, qoe.r(-2, -2, 5));
                                    } else {
                                        linearLayout2.addView(imageView, qoe.o(-2, -2));
                                        linearLayout2.addView(textView2, qoe.o(-1, -2));
                                    }
                                    LinearLayout l = td4.l(activity3, 0);
                                    linearLayout.addView(l, qoe.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                    ImageView imageView2 = new ImageView(activity3);
                                    imageView2.setImageResource(R.drawable.list_circle);
                                    imageView2.setPadding(jb6.a0 ? gm.L(11.0f) : 0, gm.L(9.0f), jb6.a0 ? 0 : gm.L(11.0f), 0);
                                    anb.s(imageView2, i5, null, mode);
                                    TextView textView3 = new TextView(activity3);
                                    anb.X(textView3, i5, null);
                                    textView3.setTextSize(1, 16.0f);
                                    textView3.setGravity((jb6.a0 ? 5 : 3) | 48);
                                    textView3.setText(gm.S2(jb6.M0(2131751236, null)));
                                    if (jb6.a0) {
                                        l.addView(textView3, qoe.o(-1, -2));
                                        l.addView(imageView2, qoe.r(-2, -2, 5));
                                    } else {
                                        l.addView(imageView2, qoe.o(-2, -2));
                                        l.addView(textView3, qoe.o(-1, -2));
                                    }
                                    boolean equals2 = "PASSWORD_MISSING".equals(tL_error.text);
                                    d dVar3 = dVar2;
                                    if (equals2) {
                                        alertDialog$Builder.j(jb6.M0(2131751228, null), new h6(dVar3, (byte) 5));
                                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                    } else {
                                        TextView textView4 = new TextView(activity3);
                                        anb.X(textView4, i5, null);
                                        textView4.setTextSize(1, 16.0f);
                                        hg9.p(textView4, (jb6.a0 ? 5 : 3) | 48, null, 2131751235);
                                        linearLayout.addView(textView4, qoe.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                        alertDialog$Builder.g(jb6.M0(2131747564, null), null);
                                    }
                                    d08 d08Var5 = d08Var3;
                                    if (d08Var5 != null) {
                                        d08Var5.showDialog(heVar3);
                                    } else {
                                        dVar3.showDialog(heVar3);
                                    }
                                }
                            }, 8);
                            return;
                        }
                        if ("SRP_ID_INVALID".equals(tL_error.text)) {
                            ConnectionsManager.getInstance(i3).sendRequestTyped(new TL_account.getPassword(), new kc((byte) 0), new jac() { // from class: c08
                                @Override // jac
                                public final void a(Object obj4, Object obj5) {
                                    nv0 nv0Var4;
                                    rac racVar4;
                                    int i4;
                                    d08 d08Var4;
                                    TL_account.Password password = (TL_account.Password) obj4;
                                    TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj5;
                                    s34 s34Var4 = s34.this;
                                    if (s34Var4.a) {
                                        return;
                                    }
                                    if (tL_error2 != null) {
                                        s34Var4.f();
                                        return;
                                    }
                                    d08 d08Var5 = d08Var3;
                                    int i5 = i3;
                                    rac racVar5 = racVar3;
                                    nv0 nv0Var5 = nv0Var3;
                                    lac lacVar4 = lacVar3;
                                    boolean z8 = z6;
                                    boolean z9 = z7;
                                    if (d08Var5 == null) {
                                        d08Var4 = new d08(s34Var4);
                                        d08Var4.setCurrentAccount(i5);
                                        nv0Var4 = nv0Var5;
                                        racVar4 = racVar5;
                                        i4 = i5;
                                        yz7 yz7Var = new yz7(i4, racVar4, nv0Var4, d08Var4, lacVar4, z8, z9, s34Var4, (byte) 1);
                                        d08Var4.a0 = (byte) 1;
                                        d08Var4.c0 = yz7Var;
                                        d08Var4.x0(new yl6((Object) s34Var4, z8, (Object) d08Var4, (byte) 11));
                                    } else {
                                        nv0Var4 = nv0Var5;
                                        racVar4 = racVar5;
                                        i4 = i5;
                                        d08Var4 = d08Var5;
                                    }
                                    d08Var4.J = password;
                                    TwoStepVerificationActivity.f0(password);
                                    e08.a(i4, racVar4, nv0Var4, d08Var4.e0(), d08Var4, lacVar4, z8, z9, s34Var4);
                                }
                            }, 8);
                            return;
                        }
                        s34Var3.b = true;
                        if (d08Var3 != null) {
                            try {
                                d08Var3.t0();
                                d08Var3.finishFragment();
                            } finally {
                            }
                        }
                        lacVar3.a(tLObject, tL_error, tL_inputCheckPasswordSRP3);
                    }
                });
            }
        };
        if (racVar != null) {
            qacVar.a((TLMethod) racVar.a(tL_inputCheckPasswordSRP));
        } else if (nv0Var != null) {
            nv0Var.a(tL_inputCheckPasswordSRP, qacVar);
        }
    }
}
