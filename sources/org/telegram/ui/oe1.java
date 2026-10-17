package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class oe1 extends org.telegram.ui.Components.u81 {
    public final ArrayList a;
    public final /* synthetic */ pe1 b;

    public oe1(pe1 pe1Var) {
        this.b = pe1Var;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(new le1(0));
        le1 le1Var = new le1(2);
        le1Var.b = 0;
        arrayList.add(le1Var);
        le1 le1Var2 = new le1(2);
        le1Var2.b = 1;
        arrayList.add(le1Var2);
        le1 le1Var3 = new le1(2);
        le1Var3.b = 2;
        arrayList.add(le1Var3);
        le1 le1Var4 = new le1(2);
        le1Var4.b = 3;
        arrayList.add(le1Var4);
        le1 le1Var5 = new le1(2);
        le1Var5.b = 4;
        arrayList.add(le1Var5);
    }

    @Override // org.telegram.ui.Components.u81
    public final void b(View view, int i10, int i11) {
        pe1 pe1Var = this.b;
        pe1Var.K(view, i10, pe1Var.b0, true);
    }

    @Override // org.telegram.ui.Components.u81
    public final View d(int i10) {
        int i11;
        pe1 pe1Var = this.b;
        te1 te1Var = pe1Var.t0;
        if (i10 == 1) {
            return pe1Var.T;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.n2) te1Var).currentAccount;
            org.telegram.ui.Components.tn0 tn0Var = new org.telegram.ui.Components.tn0(i11, te1Var);
            tn0Var.b.j(new ne1(0));
            tn0Var.setUiCallback(pe1Var);
            return tn0Var;
        }
        g10 g10Var = new g10(te1Var);
        g10Var.setChatPreviewDelegate(pe1Var.r0);
        g10Var.setUiCallback(pe1Var);
        g10Var.b.j(new ne1(1));
        return g10Var;
    }

    @Override // org.telegram.ui.Components.u81
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.u81
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.a;
        if (((le1) arrayList.get(i10)).a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((le1) arrayList.get(i10)).a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        hg.o0 o0Var = hg.q0.a3[((le1) arrayList.get(i10)).b];
        String str = o0Var.c;
        return str != null ? str : LocaleController.getString(o0Var.b);
    }

    @Override // org.telegram.ui.Components.u81
    public final int h(int i10) {
        ArrayList arrayList = this.a;
        if (((le1) arrayList.get(i10)).a == 0) {
            return 1;
        }
        if (((le1) arrayList.get(i10)).a == 1) {
            return 2;
        }
        return ((le1) arrayList.get(i10)).a + i10;
    }
}
