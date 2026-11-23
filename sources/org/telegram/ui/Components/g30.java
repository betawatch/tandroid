package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g30 implements org.telegram.messenger.w10, org.telegram.messenger.x10 {
    public final /* synthetic */ h30 a;

    public /* synthetic */ g30(h30 h30Var) {
        this.a = h30Var;
    }

    @Override // org.telegram.messenger.x10
    public Boolean a(o41 o41Var, View view, Integer num, Float f10, Float f11) {
        int i7 = o41Var.d;
        boolean z10 = false;
        if (i7 != 0) {
            h30 h30Var = this.a;
            String str = (String) h30Var.c.get(i7 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, h30Var.getContext(), h30Var.b);
            String N0 = org.telegram.messenger.hd.N0(2131752042, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131752040, str);
            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131752043, null), new h2(18, h30Var, str));
            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
            t1Var.show();
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // org.telegram.messenger.w10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i7 = ((o41) obj).d;
        h30 h30Var = this.a;
        if (i7 == 0) {
            org.telegram.messenger.na a10 = org.telegram.messenger.na.a(h30Var.a);
            a10.f.clear();
            a10.d();
            h30Var.f.O(true);
            return;
        }
        org.telegram.messenger.y10 y10Var = h30Var.h;
        if (y10Var != null) {
            y10Var.a((String) h30Var.c.get(i7 - 1));
        }
    }
}
