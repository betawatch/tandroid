package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k30 implements org.telegram.messenger.o20, org.telegram.messenger.p20 {
    public final /* synthetic */ l30 a;

    public /* synthetic */ k30(l30 l30Var) {
        this.a = l30Var;
    }

    @Override // org.telegram.messenger.p20
    public Boolean a(a51 a51Var, View view, Integer num, Float f7, Float f10) {
        int i10 = a51Var.d;
        boolean z10 = false;
        if (i10 != 0) {
            l30 l30Var = this.a;
            String str = (String) l30Var.c.get(i10 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, l30Var.getContext(), l30Var.b);
            String L0 = org.telegram.messenger.cd.L0(2131752054, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.cd.a0(null, null, 2131752052, str);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752055, null), new f2(16, l30Var, str));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            x1Var.show();
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // org.telegram.messenger.o20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i10 = ((a51) obj).d;
        l30 l30Var = this.a;
        if (i10 == 0) {
            org.telegram.messenger.oa a2 = org.telegram.messenger.oa.a(l30Var.a);
            a2.f.clear();
            a2.d();
            l30Var.f.O(true);
            return;
        }
        org.telegram.messenger.q20 q20Var = l30Var.h;
        if (q20Var != null) {
            q20Var.a((String) l30Var.c.get(i10 - 1));
        }
    }
}
