package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k30 implements org.telegram.messenger.p20, org.telegram.messenger.q20 {
    public final /* synthetic */ l30 a;

    public /* synthetic */ k30(l30 l30Var) {
        this.a = l30Var;
    }

    @Override // org.telegram.messenger.q20
    public Boolean a(b51 b51Var, View view, Integer num, Float f7, Float f10) {
        int i10 = b51Var.d;
        boolean z10 = false;
        if (i10 != 0) {
            l30 l30Var = this.a;
            String str = (String) l30Var.c.get(i10 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, l30Var.getContext(), l30Var.b);
            String L0 = org.telegram.messenger.dd.L0(2131752054, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.dd.a0(null, null, 2131752052, str);
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131752055, null), new f2(16, l30Var, str));
            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
            x1Var.show();
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // org.telegram.messenger.p20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i10 = ((b51) obj).d;
        l30 l30Var = this.a;
        if (i10 == 0) {
            org.telegram.messenger.pa a2 = org.telegram.messenger.pa.a(l30Var.a);
            a2.f.clear();
            a2.d();
            l30Var.f.O(true);
            return;
        }
        org.telegram.messenger.r20 r20Var = l30Var.h;
        if (r20Var != null) {
            r20Var.a((String) l30Var.c.get(i10 - 1));
        }
    }
}
