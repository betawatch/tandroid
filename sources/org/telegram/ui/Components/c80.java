package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j80 b;

    public /* synthetic */ c80(j80 j80Var, int i10) {
        this.a = i10;
        this.b = j80Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        j80 j80Var = this.b;
        int i11 = 1;
        switch (i10) {
            case 0:
                j80Var.r.g();
                break;
            case 1:
                org.telegram.ui.ActionBar.k1 k1Var = j80Var.s;
                if (k1Var != null) {
                    k1Var.d(true);
                }
                j80Var.r.b();
                break;
            case 2:
                j80 j80Var2 = this.b;
                String str = j80Var2.b;
                boolean z10 = str != null && str.endsWith("?direct");
                Context context = j80Var2.getContext();
                String L0 = org.telegram.messenger.cd.L0(2131749180, null);
                String str2 = j80Var2.b;
                String str3 = j80Var2.J;
                if (str3 == null) {
                    str3 = org.telegram.messenger.cd.L0(j80Var2.H ? z10 ? 2131746522 : 2131746523 : 2131746520, null);
                }
                g80 g80Var = new g80(j80Var2, context, L0, str2, str3);
                j80Var2.E = g80Var;
                g80Var.I0();
                j80Var2.E.show();
                org.telegram.ui.ActionBar.k1 k1Var2 = j80Var2.s;
                if (k1Var2 != null) {
                    k1Var2.d(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.k1 k1Var3 = j80Var.s;
                if (k1Var3 != null) {
                    k1Var3.d(true);
                }
                org.telegram.ui.ActionBar.k2 k2Var = j80Var.c;
                if (k2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k2Var.getParentActivity());
                    String L02 = org.telegram.messenger.cd.L0(2131746040, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                    x1Var.R = L02;
                    x1Var.T = org.telegram.messenger.cd.L0(2131746043, null);
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746041, null), new b80(j80Var, i11));
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                    TextView textView = (TextView) x1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                    }
                    alertDialog$Builder.p();
                    break;
                }
                break;
        }
    }
}
