package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class k70 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r70 b;

    public /* synthetic */ k70(r70 r70Var, int i7) {
        this.a = i7;
        this.b = r70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        r70 r70Var = this.b;
        int i10 = 1;
        switch (i7) {
            case 0:
                r70Var.r.f();
                break;
            case 1:
                org.telegram.ui.ActionBar.g1 g1Var = r70Var.s;
                if (g1Var != null) {
                    g1Var.d(true);
                }
                r70Var.r.d();
                break;
            case 2:
                r70 r70Var2 = this.b;
                String str = r70Var2.b;
                boolean z9 = str != null && str.endsWith("?direct");
                Context context = r70Var2.getContext();
                String M0 = org.telegram.messenger.id.M0(2131749170, null);
                String str2 = r70Var2.b;
                String str3 = r70Var2.J;
                if (str3 == null) {
                    str3 = org.telegram.messenger.id.M0(r70Var2.H ? z9 ? 2131746507 : 2131746508 : 2131746505, null);
                }
                o70 o70Var = new o70(r70Var2, context, M0, str2, str3);
                r70Var2.E = o70Var;
                o70Var.I0();
                r70Var2.E.show();
                org.telegram.ui.ActionBar.g1 g1Var2 = r70Var2.s;
                if (g1Var2 != null) {
                    g1Var2.d(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.g1 g1Var3 = r70Var.s;
                if (g1Var3 != null) {
                    g1Var3.d(true);
                }
                org.telegram.ui.ActionBar.f2 f2Var = r70Var.c;
                if (f2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f2Var.getParentActivity());
                    String M02 = org.telegram.messenger.id.M0(2131746023, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.R = M02;
                    u1Var.T = org.telegram.messenger.id.M0(2131746026, null);
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746024, null), new j70(r70Var, i10));
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    TextView textView = (TextView) u1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.q7, null);
                    }
                    alertDialog$Builder.p();
                    break;
                }
                break;
        }
    }
}
