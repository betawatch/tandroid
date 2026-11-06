package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s20 implements org.telegram.messenger.a20, org.telegram.messenger.b20 {
    public final /* synthetic */ t20 a;

    public /* synthetic */ s20(t20 t20Var) {
        this.a = t20Var;
    }

    @Override // org.telegram.messenger.b20
    public Boolean a(r31 r31Var, View view, Integer num, Float f10, Float f11) {
        int i7 = r31Var.d;
        boolean z9 = false;
        if (i7 != 0) {
            t20 t20Var = this.a;
            String str = (String) t20Var.c.get(i7 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, t20Var.getContext(), t20Var.b);
            String M0 = org.telegram.messenger.hd.M0(2131752054, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.hd.a0(null, null, 2131752052, str);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752055, null), new f2(15, t20Var, str));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            u1Var.show();
            z9 = true;
        }
        return Boolean.valueOf(z9);
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i7 = ((r31) obj).d;
        t20 t20Var = this.a;
        if (i7 == 0) {
            org.telegram.messenger.oa a10 = org.telegram.messenger.oa.a(t20Var.a);
            a10.f.clear();
            a10.d();
            t20Var.f.O(true);
            return;
        }
        org.telegram.messenger.c20 c20Var = t20Var.h;
        if (c20Var != null) {
            c20Var.a((String) t20Var.c.get(i7 - 1));
        }
    }
}
