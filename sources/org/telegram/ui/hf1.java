package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class hf1 extends org.telegram.ui.Components.e81 {
    public final ArrayList a;
    public final /* synthetic */ if1 b;

    public hf1(if1 if1Var) {
        this.b = if1Var;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(new ef1(0));
        ef1 ef1Var = new ef1(2);
        ef1Var.b = 0;
        arrayList.add(ef1Var);
        ef1 ef1Var2 = new ef1(2);
        ef1Var2.b = 1;
        arrayList.add(ef1Var2);
        ef1 ef1Var3 = new ef1(2);
        ef1Var3.b = 2;
        arrayList.add(ef1Var3);
        ef1 ef1Var4 = new ef1(2);
        ef1Var4.b = 3;
        arrayList.add(ef1Var4);
        ef1 ef1Var5 = new ef1(2);
        ef1Var5.b = 4;
        arrayList.add(ef1Var5);
    }

    @Override // org.telegram.ui.Components.e81
    public final void b(View view, int i10, int i11) {
        if1 if1Var = this.b;
        if1Var.K(view, i10, if1Var.V, true);
    }

    @Override // org.telegram.ui.Components.e81
    public final View d(int i10) {
        int i11;
        if1 if1Var = this.b;
        mf1 mf1Var = if1Var.q0;
        if (i10 == 1) {
            return if1Var.Q;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.p2) mf1Var).currentAccount;
            org.telegram.ui.Components.en0 en0Var = new org.telegram.ui.Components.en0(i11, mf1Var);
            en0Var.b.j(new gf1(0));
            en0Var.setUiCallback(if1Var);
            return en0Var;
        }
        t10 t10Var = new t10(mf1Var);
        t10Var.setChatPreviewDelegate(if1Var.o0);
        t10Var.setUiCallback(if1Var);
        t10Var.b.j(new gf1(1));
        return t10Var;
    }

    @Override // org.telegram.ui.Components.e81
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.e81
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.a;
        if (((ef1) arrayList.get(i10)).a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((ef1) arrayList.get(i10)).a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        uf.e0 e0Var = uf.g0.Z2[((ef1) arrayList.get(i10)).b];
        String str = e0Var.c;
        return str != null ? str : LocaleController.getString(e0Var.b);
    }

    @Override // org.telegram.ui.Components.e81
    public final int h(int i10) {
        ArrayList arrayList = this.a;
        if (((ef1) arrayList.get(i10)).a == 0) {
            return 1;
        }
        if (((ef1) arrayList.get(i10)).a == 1) {
            return 2;
        }
        return ((ef1) arrayList.get(i10)).a + i10;
    }
}
