package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class fg1 extends org.telegram.ui.Components.d91 {
    public final ArrayList a;
    public final /* synthetic */ gg1 b;

    public fg1(gg1 gg1Var) {
        this.b = gg1Var;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(new cg1(0));
        cg1 cg1Var = new cg1(2);
        cg1Var.b = 0;
        arrayList.add(cg1Var);
        cg1 cg1Var2 = new cg1(2);
        cg1Var2.b = 1;
        arrayList.add(cg1Var2);
        cg1 cg1Var3 = new cg1(2);
        cg1Var3.b = 2;
        arrayList.add(cg1Var3);
        cg1 cg1Var4 = new cg1(2);
        cg1Var4.b = 3;
        arrayList.add(cg1Var4);
        cg1 cg1Var5 = new cg1(2);
        cg1Var5.b = 4;
        arrayList.add(cg1Var5);
    }

    @Override // org.telegram.ui.Components.d91
    public final void b(View view, int i10, int i11) {
        gg1 gg1Var = this.b;
        gg1Var.K(view, i10, gg1Var.b0, true);
    }

    @Override // org.telegram.ui.Components.d91
    public final View d(int i10) {
        int i11;
        gg1 gg1Var = this.b;
        kg1 kg1Var = gg1Var.t0;
        if (i10 == 1) {
            return gg1Var.T;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.m2) kg1Var).currentAccount;
            org.telegram.ui.Components.xn0 xn0Var = new org.telegram.ui.Components.xn0(i11, kg1Var);
            xn0Var.b.j(new eg1(0));
            xn0Var.setUiCallback(gg1Var);
            return xn0Var;
        }
        b20 b20Var = new b20(kg1Var);
        b20Var.setChatPreviewDelegate(gg1Var.r0);
        b20Var.setUiCallback(gg1Var);
        b20Var.b.j(new eg1(1));
        return b20Var;
    }

    @Override // org.telegram.ui.Components.d91
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.d91
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.a;
        if (((cg1) arrayList.get(i10)).a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((cg1) arrayList.get(i10)).a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        hg.p0 p0Var = hg.r0.a3[((cg1) arrayList.get(i10)).b];
        String str = p0Var.c;
        return str != null ? str : LocaleController.getString(p0Var.b);
    }

    @Override // org.telegram.ui.Components.d91
    public final int h(int i10) {
        ArrayList arrayList = this.a;
        if (((cg1) arrayList.get(i10)).a == 0) {
            return 1;
        }
        if (((cg1) arrayList.get(i10)).a == 1) {
            return 2;
        }
        return ((cg1) arrayList.get(i10)).a + i10;
    }
}
