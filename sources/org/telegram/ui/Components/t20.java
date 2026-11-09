package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t20 implements org.telegram.messenger.a20, org.telegram.messenger.b20 {
    public final /* synthetic */ u20 a;

    public /* synthetic */ t20(u20 u20Var) {
        this.a = u20Var;
    }

    @Override // org.telegram.messenger.b20
    public Boolean a(y31 y31Var, View view, Integer num, Float f10, Float f11) {
        int i7 = y31Var.d;
        boolean z9 = false;
        if (i7 != 0) {
            u20 u20Var = this.a;
            String str = (String) u20Var.c.get(i7 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, u20Var.getContext(), u20Var.b);
            String M0 = org.telegram.messenger.id.M0(2131752054, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.a0(null, null, 2131752052, str);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752055, null), new f2(15, u20Var, str));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            u1Var.show();
            z9 = true;
        }
        return Boolean.valueOf(z9);
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i7 = ((y31) obj).d;
        u20 u20Var = this.a;
        if (i7 == 0) {
            org.telegram.messenger.oa a10 = org.telegram.messenger.oa.a(u20Var.a);
            a10.f.clear();
            a10.d();
            u20Var.f.O(true);
            return;
        }
        org.telegram.messenger.c20 c20Var = u20Var.h;
        if (c20Var != null) {
            c20Var.a((String) u20Var.c.get(i7 - 1));
        }
    }
}
