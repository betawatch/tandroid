package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.q10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.z70;
import org.telegram.ui.x21;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class i8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i8(hi.d dVar, z10 z10Var, org.telegram.ui.ActionBar.u2 u2Var, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        this.a = i7;
        this.d = dVar;
        this.e = z10Var;
        this.b = u2Var;
        this.c = e6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        float f10;
        int i7 = this.a;
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        Object obj = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        int i10 = 0;
        int i11 = 1;
        switch (i7) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj3, e6Var);
                String M0 = hd.M0(2131743138, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = M0;
                t1Var.U = hd.M0(2131743139, null);
                alertDialog$Builder.h(hd.M0(2131752589, null), null);
                alertDialog$Builder.k(hd.M0(2131751598, null), new k8(i10, (Runnable) obj2, (org.telegram.ui.ActionBar.u2) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
            case 1:
                hi.d dVar = (hi.d) obj3;
                dVar.setLoading(true);
                ((z10) obj2).a(new o4(dVar, (org.telegram.ui.ActionBar.u2) obj, e6Var, i11));
                break;
            case 2:
                s8 s8Var = (s8) obj3;
                Runnable runnable = (Runnable) obj2;
                Runnable runnable2 = (Runnable) obj;
                org.telegram.ui.ActionBar.e6 e6Var2 = s8Var.a;
                if (!TextUtils.isEmpty(s8Var.s) && s8Var.r != null) {
                    org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
                    LinearLayout linearLayout = new LinearLayout(s8Var.getContext());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                    TLRPC.User user = s8Var.r;
                    if (user != null) {
                        String k10 = q10.k(user);
                        LinearLayout linearLayout2 = new LinearLayout(s8Var.getContext());
                        linearLayout2.setOrientation(0);
                        f10 = 4.0f;
                        linearLayout2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(s8Var.getContext());
                        i9Var.setRoundRadius(org.telegram.messenger.g0.L(15.0f));
                        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
                        t8Var.r(s8Var.r);
                        i9Var.f(s8Var.r, t8Var);
                        linearLayout2.addView(i9Var, c8.ja.r(30, 30, 16));
                        TextView textView = new TextView(s8Var.getContext());
                        int i12 = org.telegram.ui.ActionBar.j6.G6;
                        org.telegram.ui.ActionBar.q6.U(textView, i12, e6Var);
                        textView.setTextSize(1, 20.0f);
                        textView.setText(hd.a0(null, null, 2131742964, k10));
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        linearLayout2.addView(textView, c8.ja.t(-1, -2, 16, 9, 0, 0, 0));
                        linearLayout.addView(linearLayout2, c8.ja.r(-1, -2, 55));
                        z70 z70Var = new z70(s8Var.getContext(), null);
                        org.telegram.ui.ActionBar.q6.U(z70Var, i12, e6Var);
                        org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.Xc, e6Var);
                        z70Var.setTextSize(1, 16.0f);
                        z70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        z70Var.setText(org.telegram.messenger.g0.U2(hd.a0(null, null, 2131743199, q10.p(s8Var.r)), new r(19, t1VarArr, runnable)));
                        linearLayout.addView(z70Var, c8.ja.t(-1, -2, 55, 0, 14, 0, 0));
                    } else {
                        f10 = 4.0f;
                    }
                    FrameLayout frameLayout = new FrameLayout(s8Var.getContext());
                    frameLayout.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
                    TextView textView2 = new TextView(s8Var.getContext());
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.G6, e6Var);
                    textView2.setText(f8.c0(s8Var.s));
                    textView2.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f));
                    textView2.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
                    int i13 = org.telegram.ui.ActionBar.j6.a7;
                    int w02 = org.telegram.ui.ActionBar.j6.w0(i13, e6Var2);
                    int w03 = org.telegram.ui.ActionBar.j6.w0(i13, e6Var2);
                    int i14 = org.telegram.ui.ActionBar.j6.i6;
                    org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.j6.b0(w02, org.telegram.ui.ActionBar.j6.w(w03, org.telegram.ui.ActionBar.j6.w0(i14, e6Var2)), 10, 10);
                    org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i13);
                    org.telegram.ui.ActionBar.m6 p10 = org.telegram.ui.ActionBar.q6.p(i13, i14);
                    textView2.setBackground(b02);
                    org.telegram.ui.ActionBar.q6.j(textView2, b02, M, p10, e6Var);
                    textView2.setGravity(17);
                    frameLayout.addView(textView2, c8.ja.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 0.0f));
                    linearLayout.addView(frameLayout, c8.ja.t(-1, -2, 55, 0, 14, 0, 0));
                    c8.na.b(textView2, 0.02f, 1.2f);
                    textView2.setOnClickListener(new i1(s8Var, t1VarArr, runnable2, 2));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, s8Var.getContext(), e6Var);
                    alertDialog$Builder2.o(linearLayout);
                    alertDialog$Builder2.k(hd.M0(2131747831, null), null);
                    t1VarArr[0] = alertDialog$Builder2.p();
                    break;
                }
                break;
            default:
                hi.d dVar2 = (hi.d) obj3;
                x21 x21Var = (x21) obj2;
                x2 x2Var = (x2) obj;
                if (!dVar2.R) {
                    dVar2.setLoading(true);
                    x21Var.a(new m(dVar2, x2Var, e6Var, 9));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ i8(Object obj, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable, Object obj2, int i7) {
        this.a = i7;
        this.d = obj;
        this.c = e6Var;
        this.e = runnable;
        this.b = obj2;
    }
}
