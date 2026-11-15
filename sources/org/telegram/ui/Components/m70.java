package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class m70 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t70 b;

    public /* synthetic */ m70(t70 t70Var, int i7) {
        this.a = i7;
        this.b = t70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        t70 t70Var = this.b;
        int i10 = 1;
        switch (i7) {
            case 0:
                t70Var.r.f();
                break;
            case 1:
                org.telegram.ui.ActionBar.g1 g1Var = t70Var.s;
                if (g1Var != null) {
                    g1Var.d(true);
                }
                t70Var.r.d();
                break;
            case 2:
                t70 t70Var2 = this.b;
                String str = t70Var2.b;
                boolean z10 = str != null && str.endsWith("?direct");
                Context context = t70Var2.getContext();
                String M0 = org.telegram.messenger.hd.M0(2131749170, null);
                String str2 = t70Var2.b;
                String str3 = t70Var2.K;
                if (str3 == null) {
                    str3 = org.telegram.messenger.hd.M0(t70Var2.I ? z10 ? 2131746507 : 2131746508 : 2131746505, null);
                }
                q70 q70Var = new q70(t70Var2, context, M0, str2, str3);
                t70Var2.F = q70Var;
                q70Var.I0();
                t70Var2.F.show();
                org.telegram.ui.ActionBar.g1 g1Var2 = t70Var2.s;
                if (g1Var2 != null) {
                    g1Var2.d(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.g1 g1Var3 = t70Var.s;
                if (g1Var3 != null) {
                    g1Var3.d(true);
                }
                org.telegram.ui.ActionBar.e2 e2Var = t70Var.c;
                if (e2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e2Var.getParentActivity());
                    String M02 = org.telegram.messenger.hd.M0(2131746023, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.S = M02;
                    t1Var.U = org.telegram.messenger.hd.M0(2131746026, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746024, null), new l70(t70Var, i10));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    TextView textView = (TextView) t1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, null);
                    }
                    alertDialog$Builder.p();
                    break;
                }
                break;
        }
    }
}
