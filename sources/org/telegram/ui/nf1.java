package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class nf1 extends org.telegram.ui.Components.c81 {
    public final ArrayList a;
    public final /* synthetic */ of1 b;

    public nf1(of1 of1Var) {
        this.b = of1Var;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(new kf1(0));
        kf1 kf1Var = new kf1(2);
        kf1Var.b = 0;
        arrayList.add(kf1Var);
        kf1 kf1Var2 = new kf1(2);
        kf1Var2.b = 1;
        arrayList.add(kf1Var2);
        kf1 kf1Var3 = new kf1(2);
        kf1Var3.b = 2;
        arrayList.add(kf1Var3);
        kf1 kf1Var4 = new kf1(2);
        kf1Var4.b = 3;
        arrayList.add(kf1Var4);
        kf1 kf1Var5 = new kf1(2);
        kf1Var5.b = 4;
        arrayList.add(kf1Var5);
    }

    @Override // org.telegram.ui.Components.c81
    public final void b(View view, int i10, int i11) {
        of1 of1Var = this.b;
        of1Var.K(view, i10, of1Var.V, true);
    }

    @Override // org.telegram.ui.Components.c81
    public final View d(int i10) {
        int i11;
        of1 of1Var = this.b;
        sf1 sf1Var = of1Var.q0;
        if (i10 == 1) {
            return of1Var.Q;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.p2) sf1Var).currentAccount;
            org.telegram.ui.Components.cn0 cn0Var = new org.telegram.ui.Components.cn0(i11, sf1Var);
            cn0Var.b.j(new mf1(0));
            cn0Var.setUiCallback(of1Var);
            return cn0Var;
        }
        u10 u10Var = new u10(sf1Var);
        u10Var.setChatPreviewDelegate(of1Var.o0);
        u10Var.setUiCallback(of1Var);
        u10Var.b.j(new mf1(1));
        return u10Var;
    }

    @Override // org.telegram.ui.Components.c81
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.c81
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.a;
        if (((kf1) arrayList.get(i10)).a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((kf1) arrayList.get(i10)).a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        tf.e0 e0Var = tf.g0.Z2[((kf1) arrayList.get(i10)).b];
        String str = e0Var.c;
        return str != null ? str : LocaleController.getString(e0Var.b);
    }

    @Override // org.telegram.ui.Components.c81
    public final int h(int i10) {
        ArrayList arrayList = this.a;
        if (((kf1) arrayList.get(i10)).a == 0) {
            return 1;
        }
        if (((kf1) arrayList.get(i10)).a == 1) {
            return 2;
        }
        return ((kf1) arrayList.get(i10)).a + i10;
    }
}
