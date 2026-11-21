package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.o10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.m80;
import org.telegram.ui.aj0;
import org.telegram.ui.p51;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w8(hi.e eVar, x10 x10Var, org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        this.a = i7;
        this.d = eVar;
        this.e = x10Var;
        this.b = w2Var;
        this.c = h6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        float f10;
        int i7 = this.a;
        int i10 = 10;
        org.telegram.ui.ActionBar.h6 h6Var = this.c;
        Object obj = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        int i11 = 1;
        switch (i7) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj3, h6Var);
                String N0 = gd.N0(2131742894, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = N0;
                t1Var.U = gd.N0(2131742895, null);
                alertDialog$Builder.h(gd.N0(2131752577, null), null);
                alertDialog$Builder.k(gd.N0(2131751586, null), new aj0(28, (Runnable) obj2, (org.telegram.ui.ActionBar.w2) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
            case 1:
                hi.e eVar = (hi.e) obj3;
                eVar.setLoading(true);
                ((x10) obj2).a(new x4(eVar, (org.telegram.ui.ActionBar.w2) obj, h6Var, i11));
                break;
            case 2:
                g9 g9Var = (g9) obj3;
                Runnable runnable = (Runnable) obj2;
                Runnable runnable2 = (Runnable) obj;
                org.telegram.ui.ActionBar.h6 h6Var2 = g9Var.a;
                if (!TextUtils.isEmpty(g9Var.s) && g9Var.r != null) {
                    org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
                    LinearLayout linearLayout = new LinearLayout(g9Var.getContext());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                    TLRPC.User user = g9Var.r;
                    if (user != null) {
                        String l10 = o10.l(user);
                        f10 = 4.0f;
                        LinearLayout linearLayout2 = new LinearLayout(g9Var.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(g9Var.getContext());
                        q9Var.setRoundRadius(org.telegram.messenger.g0.L(15.0f));
                        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
                        b9Var.r(g9Var.r);
                        q9Var.f(g9Var.r, b9Var);
                        linearLayout2.addView(q9Var, c8.ma.r(30, 30, 16));
                        TextView textView = new TextView(g9Var.getContext());
                        int i12 = org.telegram.ui.ActionBar.m6.G6;
                        org.telegram.ui.ActionBar.t6.U(textView, i12, h6Var);
                        textView.setTextSize(1, 20.0f);
                        textView.setText(gd.a0(null, null, 2131742700, l10));
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        linearLayout2.addView(textView, c8.ma.t(-1, -2, 16, 9, 0, 0, 0));
                        linearLayout.addView(linearLayout2, c8.ma.r(-1, -2, 55));
                        m80 m80Var = new m80(g9Var.getContext(), null);
                        org.telegram.ui.ActionBar.t6.U(m80Var, i12, h6Var);
                        org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.Xc, h6Var);
                        m80Var.setTextSize(1, 16.0f);
                        m80Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        m80Var.setText(org.telegram.messenger.g0.T2(gd.a0(null, null, 2131742955, o10.q(g9Var.r)), new u4(13, t1VarArr, runnable)));
                        linearLayout.addView(m80Var, c8.ma.t(-1, -2, 55, 0, 14, 0, 0));
                    } else {
                        f10 = 4.0f;
                    }
                    FrameLayout frameLayout = new FrameLayout(g9Var.getContext());
                    frameLayout.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
                    TextView textView2 = new TextView(g9Var.getContext());
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.G6, h6Var);
                    textView2.setText(u8.c0(g9Var.s));
                    textView2.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f));
                    textView2.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
                    int i13 = org.telegram.ui.ActionBar.m6.a7;
                    int w02 = org.telegram.ui.ActionBar.m6.w0(i13, h6Var2);
                    int w03 = org.telegram.ui.ActionBar.m6.w0(i13, h6Var2);
                    int i14 = org.telegram.ui.ActionBar.m6.i6;
                    org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.m6.b0(w02, org.telegram.ui.ActionBar.m6.w(w03, org.telegram.ui.ActionBar.m6.w0(i14, h6Var2)), 10, 10);
                    org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i13);
                    org.telegram.ui.ActionBar.p6 p10 = org.telegram.ui.ActionBar.t6.p(i13, i14);
                    textView2.setBackground(b02);
                    org.telegram.ui.ActionBar.t6.j(textView2, b02, M, p10, h6Var);
                    textView2.setGravity(17);
                    frameLayout.addView(textView2, c8.ma.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 0.0f));
                    linearLayout.addView(frameLayout, c8.ma.t(-1, -2, 55, 0, 14, 0, 0));
                    c8.ra.b(textView2, 0.02f, 1.2f);
                    textView2.setOnClickListener(new r1(g9Var, t1VarArr, runnable2, 3));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, g9Var.getContext(), h6Var);
                    alertDialog$Builder2.o(linearLayout);
                    alertDialog$Builder2.k(gd.N0(2131747637, null), null);
                    t1VarArr[0] = alertDialog$Builder2.p();
                    break;
                }
                break;
            default:
                hi.e eVar2 = (hi.e) obj3;
                p51 p51Var = (p51) obj2;
                e3 e3Var = (e3) obj;
                if (!eVar2.R) {
                    eVar2.setLoading(true);
                    p51Var.a(new o(eVar2, e3Var, h6Var, i10));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ w8(Object obj, org.telegram.ui.ActionBar.h6 h6Var, Runnable runnable, Object obj2, int i7) {
        this.a = i7;
        this.d = obj;
        this.c = h6Var;
        this.e = runnable;
        this.b = obj2;
    }
}
