package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ag1 extends org.telegram.ui.Components.f91 {
    public final ArrayList a;
    public final /* synthetic */ bg1 b;

    public ag1(bg1 bg1Var) {
        this.b = bg1Var;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(new xf1(0));
        xf1 xf1Var = new xf1(2);
        xf1Var.b = 0;
        arrayList.add(xf1Var);
        xf1 xf1Var2 = new xf1(2);
        xf1Var2.b = 1;
        arrayList.add(xf1Var2);
        xf1 xf1Var3 = new xf1(2);
        xf1Var3.b = 2;
        arrayList.add(xf1Var3);
        xf1 xf1Var4 = new xf1(2);
        xf1Var4.b = 3;
        arrayList.add(xf1Var4);
        xf1 xf1Var5 = new xf1(2);
        xf1Var5.b = 4;
        arrayList.add(xf1Var5);
    }

    @Override // org.telegram.ui.Components.f91
    public final void b(View view, int i10, int i11) {
        bg1 bg1Var = this.b;
        bg1Var.K(view, i10, bg1Var.b0, true);
    }

    @Override // org.telegram.ui.Components.f91
    public final View d(int i10) {
        int i11;
        bg1 bg1Var = this.b;
        fg1 fg1Var = bg1Var.t0;
        if (i10 == 1) {
            return bg1Var.T;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.n2) fg1Var).currentAccount;
            org.telegram.ui.Components.bo0 bo0Var = new org.telegram.ui.Components.bo0(i11, fg1Var);
            bo0Var.b.j(new zf1(0));
            bo0Var.setUiCallback(bg1Var);
            return bo0Var;
        }
        w10 w10Var = new w10(fg1Var);
        w10Var.setChatPreviewDelegate(bg1Var.r0);
        w10Var.setUiCallback(bg1Var);
        w10Var.b.j(new zf1(1));
        return w10Var;
    }

    @Override // org.telegram.ui.Components.f91
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.f91
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.a;
        if (((xf1) arrayList.get(i10)).a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((xf1) arrayList.get(i10)).a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        gg.p0 p0Var = gg.r0.a3[((xf1) arrayList.get(i10)).b];
        String str = p0Var.c;
        return str != null ? str : LocaleController.getString(p0Var.b);
    }

    @Override // org.telegram.ui.Components.f91
    public final int h(int i10) {
        ArrayList arrayList = this.a;
        if (((xf1) arrayList.get(i10)).a == 0) {
            return 1;
        }
        if (((xf1) arrayList.get(i10)).a == 1) {
            return 2;
        }
        return ((xf1) arrayList.get(i10)).a + i10;
    }
}
