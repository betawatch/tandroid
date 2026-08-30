package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ff1 extends org.telegram.ui.Components.c81 {
    public final ArrayList a;
    public final /* synthetic */ gf1 b;

    public ff1(gf1 gf1Var) {
        this.b = gf1Var;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(new cf1(0));
        cf1 cf1Var = new cf1(2);
        cf1Var.b = 0;
        arrayList.add(cf1Var);
        cf1 cf1Var2 = new cf1(2);
        cf1Var2.b = 1;
        arrayList.add(cf1Var2);
        cf1 cf1Var3 = new cf1(2);
        cf1Var3.b = 2;
        arrayList.add(cf1Var3);
        cf1 cf1Var4 = new cf1(2);
        cf1Var4.b = 3;
        arrayList.add(cf1Var4);
        cf1 cf1Var5 = new cf1(2);
        cf1Var5.b = 4;
        arrayList.add(cf1Var5);
    }

    @Override // org.telegram.ui.Components.c81
    public final void b(View view, int i10, int i11) {
        gf1 gf1Var = this.b;
        gf1Var.K(view, i10, gf1Var.V, true);
    }

    @Override // org.telegram.ui.Components.c81
    public final View d(int i10) {
        int i11;
        gf1 gf1Var = this.b;
        kf1 kf1Var = gf1Var.q0;
        if (i10 == 1) {
            return gf1Var.Q;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.p2) kf1Var).currentAccount;
            org.telegram.ui.Components.dn0 dn0Var = new org.telegram.ui.Components.dn0(i11, kf1Var);
            dn0Var.b.j(new ef1(0));
            dn0Var.setUiCallback(gf1Var);
            return dn0Var;
        }
        t10 t10Var = new t10(kf1Var);
        t10Var.setChatPreviewDelegate(gf1Var.o0);
        t10Var.setUiCallback(gf1Var);
        t10Var.b.j(new ef1(1));
        return t10Var;
    }

    @Override // org.telegram.ui.Components.c81
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.c81
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.a;
        if (((cf1) arrayList.get(i10)).a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((cf1) arrayList.get(i10)).a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        tf.e0 e0Var = tf.g0.Z2[((cf1) arrayList.get(i10)).b];
        String str = e0Var.c;
        return str != null ? str : LocaleController.getString(e0Var.b);
    }

    @Override // org.telegram.ui.Components.c81
    public final int h(int i10) {
        ArrayList arrayList = this.a;
        if (((cf1) arrayList.get(i10)).a == 0) {
            return 1;
        }
        if (((cf1) arrayList.get(i10)).a == 1) {
            return 2;
        }
        return ((cf1) arrayList.get(i10)).a + i10;
    }
}
