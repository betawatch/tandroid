package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class gg1 extends org.telegram.ui.Components.c91 {
    public final ArrayList a;
    public final /* synthetic */ hg1 b;

    public gg1(hg1 hg1Var) {
        this.b = hg1Var;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(new dg1(0));
        dg1 dg1Var = new dg1(2);
        dg1Var.b = 0;
        arrayList.add(dg1Var);
        dg1 dg1Var2 = new dg1(2);
        dg1Var2.b = 1;
        arrayList.add(dg1Var2);
        dg1 dg1Var3 = new dg1(2);
        dg1Var3.b = 2;
        arrayList.add(dg1Var3);
        dg1 dg1Var4 = new dg1(2);
        dg1Var4.b = 3;
        arrayList.add(dg1Var4);
        dg1 dg1Var5 = new dg1(2);
        dg1Var5.b = 4;
        arrayList.add(dg1Var5);
    }

    @Override // org.telegram.ui.Components.c91
    public final void b(View view, int i10, int i11) {
        hg1 hg1Var = this.b;
        hg1Var.K(view, i10, hg1Var.b0, true);
    }

    @Override // org.telegram.ui.Components.c91
    public final View d(int i10) {
        int i11;
        hg1 hg1Var = this.b;
        lg1 lg1Var = hg1Var.t0;
        if (i10 == 1) {
            return hg1Var.T;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.m2) lg1Var).currentAccount;
            org.telegram.ui.Components.yn0 yn0Var = new org.telegram.ui.Components.yn0(i11, lg1Var);
            yn0Var.b.j(new fg1(0));
            yn0Var.setUiCallback(hg1Var);
            return yn0Var;
        }
        c20 c20Var = new c20(lg1Var);
        c20Var.setChatPreviewDelegate(hg1Var.r0);
        c20Var.setUiCallback(hg1Var);
        c20Var.b.j(new fg1(1));
        return c20Var;
    }

    @Override // org.telegram.ui.Components.c91
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.c91
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.a;
        if (((dg1) arrayList.get(i10)).a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((dg1) arrayList.get(i10)).a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        hg.p0 p0Var = hg.r0.a3[((dg1) arrayList.get(i10)).b];
        String str = p0Var.c;
        return str != null ? str : LocaleController.getString(p0Var.b);
    }

    @Override // org.telegram.ui.Components.c91
    public final int h(int i10) {
        ArrayList arrayList = this.a;
        if (((dg1) arrayList.get(i10)).a == 0) {
            return 1;
        }
        if (((dg1) arrayList.get(i10)).a == 1) {
            return 2;
        }
        return ((dg1) arrayList.get(i10)).a + i10;
    }
}
