package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d30 implements org.telegram.messenger.u10, org.telegram.messenger.v10 {
    public final /* synthetic */ e30 a;

    public /* synthetic */ d30(e30 e30Var) {
        this.a = e30Var;
    }

    @Override // org.telegram.messenger.v10
    public Boolean a(n41 n41Var, View view, Integer num, Float f10, Float f11) {
        int i7 = n41Var.d;
        boolean z10 = false;
        if (i7 != 0) {
            e30 e30Var = this.a;
            String str = (String) e30Var.c.get(i7 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e30Var.getContext(), e30Var.b);
            String N0 = org.telegram.messenger.gd.N0(2131752042, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.gd.a0(null, null, 2131752040, str);
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752043, null), new g2(18, e30Var, str));
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            t1Var.show();
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // org.telegram.messenger.u10
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i7 = ((n41) obj).d;
        e30 e30Var = this.a;
        if (i7 == 0) {
            org.telegram.messenger.ma a10 = org.telegram.messenger.ma.a(e30Var.a);
            a10.f.clear();
            a10.d();
            e30Var.f.O(true);
            return;
        }
        org.telegram.messenger.w10 w10Var = e30Var.h;
        if (w10Var != null) {
            w10Var.a((String) e30Var.c.get(i7 - 1));
        }
    }
}
