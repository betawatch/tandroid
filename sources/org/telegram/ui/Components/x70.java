package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class x70 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e80 b;

    public /* synthetic */ x70(e80 e80Var, int i7) {
        this.a = i7;
        this.b = e80Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        e80 e80Var = this.b;
        int i10 = 1;
        switch (i7) {
            case 0:
                e80Var.r.f();
                break;
            case 1:
                org.telegram.ui.ActionBar.h1 h1Var = e80Var.s;
                if (h1Var != null) {
                    h1Var.d(true);
                }
                e80Var.r.d();
                break;
            case 2:
                e80 e80Var2 = this.b;
                String str = e80Var2.b;
                boolean z10 = str != null && str.endsWith("?direct");
                Context context = e80Var2.getContext();
                String M0 = org.telegram.messenger.gd.M0(2131748978, null);
                String str2 = e80Var2.b;
                String str3 = e80Var2.K;
                if (str3 == null) {
                    str3 = org.telegram.messenger.gd.M0(e80Var2.I ? z10 ? 2131746312 : 2131746313 : 2131746310, null);
                }
                b80 b80Var = new b80(e80Var2, context, M0, str2, str3);
                e80Var2.F = b80Var;
                b80Var.J0();
                e80Var2.F.show();
                org.telegram.ui.ActionBar.h1 h1Var2 = e80Var2.s;
                if (h1Var2 != null) {
                    h1Var2.d(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.h1 h1Var3 = e80Var.s;
                if (h1Var3 != null) {
                    h1Var3.d(true);
                }
                org.telegram.ui.ActionBar.h2 h2Var = e80Var.c;
                if (h2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h2Var.getParentActivity());
                    String M02 = org.telegram.messenger.gd.M0(2131745828, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.S = M02;
                    u1Var.U = org.telegram.messenger.gd.M0(2131745831, null);
                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131745829, null), new w70(e80Var, i10));
                    alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                    TextView textView = (TextView) u1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
                    }
                    alertDialog$Builder.p();
                    break;
                }
                break;
        }
    }
}
