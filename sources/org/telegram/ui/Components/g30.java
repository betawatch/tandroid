package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g30 implements org.telegram.messenger.v10, org.telegram.messenger.w10 {
    public final /* synthetic */ h30 a;

    public /* synthetic */ g30(h30 h30Var) {
        this.a = h30Var;
    }

    @Override // org.telegram.messenger.w10
    public Boolean a(o41 o41Var, View view, Integer num, Float f10, Float f11) {
        int i7 = o41Var.d;
        boolean z10 = false;
        if (i7 != 0) {
            h30 h30Var = this.a;
            String str = (String) h30Var.c.get(i7 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, h30Var.getContext(), h30Var.b);
            String N0 = org.telegram.messenger.gd.N0(2131752042, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.gd.a0(null, null, 2131752040, str);
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752043, null), new h2(18, h30Var, str));
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            t1Var.show();
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // org.telegram.messenger.v10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i7 = ((o41) obj).d;
        h30 h30Var = this.a;
        if (i7 == 0) {
            org.telegram.messenger.ma a10 = org.telegram.messenger.ma.a(h30Var.a);
            a10.f.clear();
            a10.d();
            h30Var.f.O(true);
            return;
        }
        org.telegram.messenger.x10 x10Var = h30Var.h;
        if (x10Var != null) {
            x10Var.a((String) h30Var.c.get(i7 - 1));
        }
    }
}
