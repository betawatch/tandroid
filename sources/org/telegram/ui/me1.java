package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class me1 extends org.telegram.ui.Components.v81 {
    public final ArrayList a;
    public final /* synthetic */ ne1 b;

    public me1(ne1 ne1Var) {
        this.b = ne1Var;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(new je1(0));
        je1 je1Var = new je1(2);
        je1Var.b = 0;
        arrayList.add(je1Var);
        je1 je1Var2 = new je1(2);
        je1Var2.b = 1;
        arrayList.add(je1Var2);
        je1 je1Var3 = new je1(2);
        je1Var3.b = 2;
        arrayList.add(je1Var3);
        je1 je1Var4 = new je1(2);
        je1Var4.b = 3;
        arrayList.add(je1Var4);
        je1 je1Var5 = new je1(2);
        je1Var5.b = 4;
        arrayList.add(je1Var5);
    }

    @Override // org.telegram.ui.Components.v81
    public final void b(View view, int i10, int i11) {
        ne1 ne1Var = this.b;
        ne1Var.K(view, i10, ne1Var.b0, true);
    }

    @Override // org.telegram.ui.Components.v81
    public final View d(int i10) {
        int i11;
        ne1 ne1Var = this.b;
        re1 re1Var = ne1Var.t0;
        if (i10 == 1) {
            return ne1Var.T;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.n2) re1Var).currentAccount;
            org.telegram.ui.Components.tn0 tn0Var = new org.telegram.ui.Components.tn0(i11, re1Var);
            tn0Var.b.j(new le1(0));
            tn0Var.setUiCallback(ne1Var);
            return tn0Var;
        }
        e10 e10Var = new e10(re1Var);
        e10Var.setChatPreviewDelegate(ne1Var.r0);
        e10Var.setUiCallback(ne1Var);
        e10Var.b.j(new le1(1));
        return e10Var;
    }

    @Override // org.telegram.ui.Components.v81
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.v81
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.a;
        if (((je1) arrayList.get(i10)).a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((je1) arrayList.get(i10)).a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        hg.o0 o0Var = hg.q0.a3[((je1) arrayList.get(i10)).b];
        String str = o0Var.c;
        return str != null ? str : LocaleController.getString(o0Var.b);
    }

    @Override // org.telegram.ui.Components.v81
    public final int h(int i10) {
        ArrayList arrayList = this.a;
        if (((je1) arrayList.get(i10)).a == 0) {
            return 1;
        }
        if (((je1) arrayList.get(i10)).a == 1) {
            return 2;
        }
        return ((je1) arrayList.get(i10)).a + i10;
    }
}
