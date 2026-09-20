package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ag1 extends org.telegram.ui.Components.o81 {
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

    @Override // org.telegram.ui.Components.o81
    public final void b(View view, int i10, int i11) {
        bg1 bg1Var = this.b;
        bg1Var.L(view, i10, bg1Var.c0, true);
    }

    @Override // org.telegram.ui.Components.o81
    public final View d(int i10) {
        int i11;
        bg1 bg1Var = this.b;
        fg1 fg1Var = bg1Var.u0;
        if (i10 == 1) {
            return bg1Var.U;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.n2) fg1Var).currentAccount;
            org.telegram.ui.Components.in0 in0Var = new org.telegram.ui.Components.in0(i11, fg1Var);
            in0Var.b.j(new zf1(0));
            in0Var.setUiCallback(bg1Var);
            return in0Var;
        }
        x10 x10Var = new x10(fg1Var);
        x10Var.setChatPreviewDelegate(bg1Var.s0);
        x10Var.setUiCallback(bg1Var);
        x10Var.b.j(new zf1(1));
        return x10Var;
    }

    @Override // org.telegram.ui.Components.o81
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.o81
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.a;
        if (((xf1) arrayList.get(i10)).a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((xf1) arrayList.get(i10)).a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        gg.q0 q0Var = gg.s0.c3[((xf1) arrayList.get(i10)).b];
        String str = q0Var.c;
        return str != null ? str : LocaleController.getString(q0Var.b);
    }

    @Override // org.telegram.ui.Components.o81
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
