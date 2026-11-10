package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.w70;
import org.telegram.ui.ok0;
import org.telegram.ui.sb1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j8(fi.d dVar, c20 c20Var, org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        this.a = i7;
        this.d = dVar;
        this.e = c20Var;
        this.b = w2Var;
        this.c = h6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        float f10;
        int i7 = this.a;
        org.telegram.ui.ActionBar.h6 h6Var = this.c;
        Object obj = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        int i10 = 1;
        switch (i7) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj3, h6Var);
                String M0 = id.M0(2131743138, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = id.M0(2131743139, null);
                alertDialog$Builder.h(id.M0(2131752589, null), null);
                alertDialog$Builder.k(id.M0(2131751598, null), new ok0(26, (Runnable) obj2, (org.telegram.ui.ActionBar.w2) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
            case 1:
                fi.d dVar = (fi.d) obj3;
                dVar.setLoading(true);
                ((c20) obj2).a(new p4(dVar, (org.telegram.ui.ActionBar.w2) obj, h6Var, i10));
                break;
            case 2:
                s8 s8Var = (s8) obj3;
                Runnable runnable = (Runnable) obj2;
                Runnable runnable2 = (Runnable) obj;
                org.telegram.ui.ActionBar.h6 h6Var2 = s8Var.a;
                if (!TextUtils.isEmpty(s8Var.s) && s8Var.r != null) {
                    org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
                    LinearLayout linearLayout = new LinearLayout(s8Var.getContext());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                    TLRPC.User user = s8Var.r;
                    if (user != null) {
                        String k10 = t10.k(user);
                        LinearLayout linearLayout2 = new LinearLayout(s8Var.getContext());
                        linearLayout2.setOrientation(0);
                        f10 = 4.0f;
                        linearLayout2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(s8Var.getContext());
                        k9Var.setRoundRadius(org.telegram.messenger.g0.L(15.0f));
                        org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
                        v8Var.r(s8Var.r);
                        k9Var.e(s8Var.r, v8Var);
                        linearLayout2.addView(k9Var, c8.ha.r(30, 30, 16));
                        TextView textView = new TextView(s8Var.getContext());
                        int i11 = org.telegram.ui.ActionBar.m6.G6;
                        org.telegram.ui.ActionBar.t6.U(textView, i11, h6Var);
                        textView.setTextSize(1, 20.0f);
                        textView.setText(id.a0(null, null, 2131742964, k10));
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        linearLayout2.addView(textView, c8.ha.t(-1, -2, 16, 9, 0, 0, 0));
                        linearLayout.addView(linearLayout2, c8.ha.r(-1, -2, 55));
                        w70 w70Var = new w70(s8Var.getContext(), null);
                        org.telegram.ui.ActionBar.t6.U(w70Var, i11, h6Var);
                        org.telegram.ui.ActionBar.t6.G(w70Var, org.telegram.ui.ActionBar.m6.Uc, h6Var);
                        w70Var.setTextSize(1, 16.0f);
                        w70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        w70Var.setText(org.telegram.messenger.g0.U2(id.a0(null, null, 2131743199, t10.p(s8Var.r)), new sb1(24, u1VarArr, runnable)));
                        linearLayout.addView(w70Var, c8.ha.t(-1, -2, 55, 0, 14, 0, 0));
                    } else {
                        f10 = 4.0f;
                    }
                    FrameLayout frameLayout = new FrameLayout(s8Var.getContext());
                    frameLayout.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
                    TextView textView2 = new TextView(s8Var.getContext());
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.G6, h6Var);
                    textView2.setText(g8.c0(s8Var.s));
                    textView2.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f));
                    textView2.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
                    int i12 = org.telegram.ui.ActionBar.m6.a7;
                    int w02 = org.telegram.ui.ActionBar.m6.w0(i12, h6Var2);
                    int w03 = org.telegram.ui.ActionBar.m6.w0(i12, h6Var2);
                    int i13 = org.telegram.ui.ActionBar.m6.i6;
                    org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.m6.b0(w02, org.telegram.ui.ActionBar.m6.w(w03, org.telegram.ui.ActionBar.m6.w0(i13, h6Var2)), 10, 10);
                    org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i12);
                    org.telegram.ui.ActionBar.p6 p10 = org.telegram.ui.ActionBar.t6.p(i12, i13);
                    textView2.setBackground(b02);
                    org.telegram.ui.ActionBar.t6.j(textView2, b02, M, p10, h6Var);
                    textView2.setGravity(17);
                    frameLayout.addView(textView2, c8.ha.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 0.0f));
                    linearLayout.addView(frameLayout, c8.ha.t(-1, -2, 55, 0, 14, 0, 0));
                    c8.ka.b(textView2, 0.02f, 1.2f);
                    textView2.setOnClickListener(new i1(s8Var, u1VarArr, runnable2, 2));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, s8Var.getContext(), h6Var);
                    alertDialog$Builder2.o(linearLayout);
                    alertDialog$Builder2.k(id.M0(2131747831, null), null);
                    u1VarArr[0] = alertDialog$Builder2.p();
                    break;
                }
                break;
            default:
                fi.d dVar2 = (fi.d) obj3;
                s sVar = (s) obj2;
                y2 y2Var = (y2) obj;
                if (!dVar2.Q) {
                    dVar2.setLoading(true);
                    sVar.a(new m(dVar2, y2Var, h6Var, 9));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ j8(Object obj, org.telegram.ui.ActionBar.h6 h6Var, Runnable runnable, Object obj2, int i7) {
        this.a = i7;
        this.d = obj;
        this.c = h6Var;
        this.e = runnable;
        this.b = obj2;
    }
}
