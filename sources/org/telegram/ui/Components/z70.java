package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z70 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g80 b;

    public /* synthetic */ z70(g80 g80Var, int i7) {
        this.a = i7;
        this.b = g80Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        g80 g80Var = this.b;
        int i10 = 1;
        switch (i7) {
            case 0:
                g80Var.r.f();
                break;
            case 1:
                org.telegram.ui.ActionBar.g1 g1Var = g80Var.s;
                if (g1Var != null) {
                    g1Var.d(true);
                }
                g80Var.r.d();
                break;
            case 2:
                g80 g80Var2 = this.b;
                String str = g80Var2.b;
                boolean z10 = str != null && str.endsWith("?direct");
                Context context = g80Var2.getContext();
                String N0 = org.telegram.messenger.hd.N0(2131748977, null);
                String str2 = g80Var2.b;
                String str3 = g80Var2.K;
                if (str3 == null) {
                    str3 = org.telegram.messenger.hd.N0(g80Var2.I ? z10 ? 2131746311 : 2131746312 : 2131746309, null);
                }
                d80 d80Var = new d80(g80Var2, context, N0, str2, str3);
                g80Var2.F = d80Var;
                d80Var.J0();
                g80Var2.F.show();
                org.telegram.ui.ActionBar.g1 g1Var2 = g80Var2.s;
                if (g1Var2 != null) {
                    g1Var2.d(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.g1 g1Var3 = g80Var.s;
                if (g1Var3 != null) {
                    g1Var3.d(true);
                }
                org.telegram.ui.ActionBar.g2 g2Var = g80Var.c;
                if (g2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g2Var.getParentActivity());
                    String N02 = org.telegram.messenger.hd.N0(2131745827, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.S = N02;
                    t1Var.U = org.telegram.messenger.hd.N0(2131745830, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131745828, null), new y70(g80Var, i10));
                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                    TextView textView = (TextView) t1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, null);
                    }
                    alertDialog$Builder.p();
                    break;
                }
                break;
        }
    }
}
