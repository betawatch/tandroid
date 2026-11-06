package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j70 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q70 b;

    public /* synthetic */ j70(q70 q70Var, int i7) {
        this.a = i7;
        this.b = q70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        q70 q70Var = this.b;
        int i10 = 1;
        switch (i7) {
            case 0:
                q70Var.r.f();
                break;
            case 1:
                org.telegram.ui.ActionBar.g1 g1Var = q70Var.s;
                if (g1Var != null) {
                    g1Var.d(true);
                }
                q70Var.r.d();
                break;
            case 2:
                q70 q70Var2 = this.b;
                String str = q70Var2.b;
                boolean z9 = str != null && str.endsWith("?direct");
                Context context = q70Var2.getContext();
                String M0 = org.telegram.messenger.hd.M0(2131749169, null);
                String str2 = q70Var2.b;
                String str3 = q70Var2.J;
                if (str3 == null) {
                    str3 = org.telegram.messenger.hd.M0(q70Var2.H ? z9 ? 2131746506 : 2131746507 : 2131746504, null);
                }
                n70 n70Var = new n70(q70Var2, context, M0, str2, str3);
                q70Var2.E = n70Var;
                n70Var.I0();
                q70Var2.E.show();
                org.telegram.ui.ActionBar.g1 g1Var2 = q70Var2.s;
                if (g1Var2 != null) {
                    g1Var2.d(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.g1 g1Var3 = q70Var.s;
                if (g1Var3 != null) {
                    g1Var3.d(true);
                }
                org.telegram.ui.ActionBar.f2 f2Var = q70Var.c;
                if (f2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f2Var.getParentActivity());
                    String M02 = org.telegram.messenger.hd.M0(2131746024, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.R = M02;
                    u1Var.T = org.telegram.messenger.hd.M0(2131746027, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746025, null), new i70(q70Var, i10));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    TextView textView = (TextView) u1Var.d(-1);
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
