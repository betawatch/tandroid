package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class dg1 extends org.telegram.ui.Components.n81 {
    public final ArrayList a;
    public final /* synthetic */ eg1 b;

    public dg1(eg1 eg1Var) {
        this.b = eg1Var;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(new ag1(0));
        ag1 ag1Var = new ag1(2);
        ag1Var.b = 0;
        arrayList.add(ag1Var);
        ag1 ag1Var2 = new ag1(2);
        ag1Var2.b = 1;
        arrayList.add(ag1Var2);
        ag1 ag1Var3 = new ag1(2);
        ag1Var3.b = 2;
        arrayList.add(ag1Var3);
        ag1 ag1Var4 = new ag1(2);
        ag1Var4.b = 3;
        arrayList.add(ag1Var4);
        ag1 ag1Var5 = new ag1(2);
        ag1Var5.b = 4;
        arrayList.add(ag1Var5);
    }

    @Override // org.telegram.ui.Components.n81
    public final void b(View view, int i10, int i11) {
        eg1 eg1Var = this.b;
        eg1Var.K(view, i10, eg1Var.b0, true);
    }

    @Override // org.telegram.ui.Components.n81
    public final View d(int i10) {
        int i11;
        eg1 eg1Var = this.b;
        ig1 ig1Var = eg1Var.t0;
        if (i10 == 1) {
            return eg1Var.T;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.p2) ig1Var).currentAccount;
            org.telegram.ui.Components.fn0 fn0Var = new org.telegram.ui.Components.fn0(i11, ig1Var);
            fn0Var.b.j(new cg1(0));
            fn0Var.setUiCallback(eg1Var);
            return fn0Var;
        }
        z10 z10Var = new z10(ig1Var);
        z10Var.setChatPreviewDelegate(eg1Var.r0);
        z10Var.setUiCallback(eg1Var);
        z10Var.b.j(new cg1(1));
        return z10Var;
    }

    @Override // org.telegram.ui.Components.n81
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.n81
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.a;
        if (((ag1) arrayList.get(i10)).a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((ag1) arrayList.get(i10)).a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        fg.q0 q0Var = fg.s0.c3[((ag1) arrayList.get(i10)).b];
        String str = q0Var.c;
        return str != null ? str : LocaleController.getString(q0Var.b);
    }

    @Override // org.telegram.ui.Components.n81
    public final int h(int i10) {
        ArrayList arrayList = this.a;
        if (((ag1) arrayList.get(i10)).a == 0) {
            return 1;
        }
        if (((ag1) arrayList.get(i10)).a == 1) {
            return 2;
        }
        return ((ag1) arrayList.get(i10)).a + i10;
    }
}
