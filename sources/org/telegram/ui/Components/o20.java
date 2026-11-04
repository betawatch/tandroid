package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o20 implements org.telegram.messenger.s10, org.telegram.messenger.t10 {
    public final /* synthetic */ p20 a;

    public /* synthetic */ o20(p20 p20Var) {
        this.a = p20Var;
    }

    @Override // org.telegram.messenger.t10
    public Boolean a(r31 r31Var, View view, Integer num, Float f10, Float f11) {
        int i3 = r31Var.d;
        boolean z10 = false;
        if (i3 != 0) {
            p20 p20Var = this.a;
            String str = (String) p20Var.c.get(i3 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, p20Var.getContext(), p20Var.b);
            String M0 = org.telegram.messenger.bd.M0(2131752054, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.a0(null, null, 2131752052, str);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752055, null), new org.telegram.ui.jo(25, p20Var, str));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            s1Var.show();
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // org.telegram.messenger.s10
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i3 = ((r31) obj).d;
        p20 p20Var = this.a;
        if (i3 == 0) {
            org.telegram.messenger.ha a10 = org.telegram.messenger.ha.a(p20Var.a);
            a10.f.clear();
            a10.d();
            p20Var.f.O(true);
            return;
        }
        org.telegram.messenger.u10 u10Var = p20Var.h;
        if (u10Var != null) {
            u10Var.a((String) p20Var.c.get(i3 - 1));
        }
    }
}
