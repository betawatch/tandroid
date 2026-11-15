package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class v20 implements org.telegram.messenger.x10, org.telegram.messenger.y10 {
    public final /* synthetic */ w20 a;

    public /* synthetic */ v20(w20 w20Var) {
        this.a = w20Var;
    }

    @Override // org.telegram.messenger.y10
    public Boolean a(b41 b41Var, View view, Integer num, Float f10, Float f11) {
        int i7 = b41Var.d;
        boolean z10 = false;
        if (i7 != 0) {
            w20 w20Var = this.a;
            String str = (String) w20Var.c.get(i7 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, w20Var.getContext(), w20Var.b);
            String M0 = org.telegram.messenger.hd.M0(2131752054, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = M0;
            t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131752052, str);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752055, null), new f1(19, w20Var, str));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            t1Var.show();
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // org.telegram.messenger.x10
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i7 = ((b41) obj).d;
        w20 w20Var = this.a;
        if (i7 == 0) {
            org.telegram.messenger.na a10 = org.telegram.messenger.na.a(w20Var.a);
            a10.f.clear();
            a10.d();
            w20Var.f.O(true);
            return;
        }
        org.telegram.messenger.z10 z10Var = w20Var.h;
        if (z10Var != null) {
            z10Var.a((String) w20Var.c.get(i7 - 1));
        }
    }
}
