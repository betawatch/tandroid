package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f70 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m70 b;

    public /* synthetic */ f70(m70 m70Var, int i3) {
        this.a = i3;
        this.b = m70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i3 = this.a;
        m70 m70Var = this.b;
        int i10 = 1;
        switch (i3) {
            case 0:
                m70Var.r.h();
                break;
            case 1:
                org.telegram.ui.ActionBar.f1 f1Var = m70Var.s;
                if (f1Var != null) {
                    f1Var.d(true);
                }
                m70Var.r.b();
                break;
            case 2:
                m70 m70Var2 = this.b;
                String str = m70Var2.b;
                boolean z10 = str != null && str.endsWith("?direct");
                Context context = m70Var2.getContext();
                String M0 = org.telegram.messenger.bd.M0(2131749178, null);
                String str2 = m70Var2.b;
                String str3 = m70Var2.K;
                if (str3 == null) {
                    str3 = org.telegram.messenger.bd.M0(m70Var2.I ? z10 ? 2131746515 : 2131746516 : 2131746513, null);
                }
                j70 j70Var = new j70(m70Var2, context, M0, str2, str3);
                m70Var2.F = j70Var;
                j70Var.I0();
                m70Var2.F.show();
                org.telegram.ui.ActionBar.f1 f1Var2 = m70Var2.s;
                if (f1Var2 != null) {
                    f1Var2.d(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.f1 f1Var3 = m70Var.s;
                if (f1Var3 != null) {
                    f1Var3.d(true);
                }
                org.telegram.ui.ActionBar.d2 d2Var = m70Var.c;
                if (d2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d2Var.getParentActivity());
                    String M02 = org.telegram.messenger.bd.M0(2131746033, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                    s1Var.S = M02;
                    s1Var.U = org.telegram.messenger.bd.M0(2131746036, null);
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746034, null), new e70(m70Var, i10));
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                    TextView textView = (TextView) s1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                    }
                    alertDialog$Builder.p();
                    break;
                }
                break;
        }
    }
}
