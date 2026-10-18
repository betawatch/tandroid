package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class uo0 extends u81 {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ org.telegram.ui.nx b;

    public uo0(org.telegram.ui.nx nxVar) {
        this.b = nxVar;
        i();
    }

    @Override // org.telegram.ui.Components.u81
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.nx nxVar = this.b;
        nxVar.O(view, i10, nxVar.K0, true);
    }

    @Override // org.telegram.ui.Components.u81
    public final View d(int i10) {
        org.telegram.ui.nx nxVar = this.b;
        org.telegram.ui.ey eyVar = nxVar.J0;
        if (i10 == 1) {
            return nxVar.U;
        }
        if (i10 == 3) {
            return nxVar.f0;
        }
        if (i10 == 4) {
            return nxVar.k0;
        }
        if (i10 == 5) {
            return nxVar.r0;
        }
        if (i10 == 2) {
            tn0 tn0Var = new tn0(nxVar.H0, eyVar);
            nxVar.G0 = tn0Var;
            tn0Var.b(nxVar.U0, nxVar.V0, false);
            nxVar.G0.b.setClipToPadding(false);
            nxVar.G0.b.j(new so0(this, 0));
            nxVar.G0.b.C0(new rc0(nxVar, 23));
            nxVar.G0.setUiCallback(nxVar);
            return nxVar.G0;
        }
        if (i10 == 6) {
            return nxVar.p0;
        }
        org.telegram.ui.g10 g10Var = new org.telegram.ui.g10(eyVar);
        g10Var.setChatPreviewDelegate(nxVar.P0);
        g10Var.setUiCallback(nxVar);
        g10Var.j(nxVar.U0, nxVar.V0, false);
        bh.b bVar = nxVar.X0;
        if (bVar != null) {
            g10Var.setBlurredBackgroundDrawableFactory(bVar);
        }
        ai.u1 u1Var = g10Var.b;
        u1Var.setClipToPadding(false);
        u1Var.j(new so0(this, 1));
        u1Var.C0(new rc0(nxVar, 23));
        return g10Var;
    }

    @Override // org.telegram.ui.Components.u81
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.u81
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.a;
        if (((to0) arrayList.get(i10)).a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((to0) arrayList.get(i10)).a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((to0) arrayList.get(i10)).a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((to0) arrayList.get(i10)).a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((to0) arrayList.get(i10)).a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((to0) arrayList.get(i10)).a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        hg.o0 o0Var = hg.q0.a3[((to0) arrayList.get(i10)).b];
        String str = o0Var.c;
        return str != null ? str : LocaleController.getString(o0Var.b);
    }

    @Override // org.telegram.ui.Components.u81
    public final int h(int i10) {
        ArrayList arrayList = this.a;
        if (((to0) arrayList.get(i10)).a == 0) {
            return 1;
        }
        if (((to0) arrayList.get(i10)).a == 1) {
            return 3;
        }
        if (((to0) arrayList.get(i10)).a == 4) {
            return 4;
        }
        if (((to0) arrayList.get(i10)).a == 2) {
            return 2;
        }
        if (((to0) arrayList.get(i10)).a == 5) {
            return 5;
        }
        if (((to0) arrayList.get(i10)).a == 6) {
            return 6;
        }
        return ((to0) arrayList.get(i10)).a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        arrayList.add(new to0(0));
        org.telegram.ui.nx nxVar = this.b;
        if (nxVar.T0 != 0) {
            return;
        }
        if (nxVar.q0) {
            arrayList.add(new to0(5));
        }
        arrayList.add(new to0(1));
        arrayList.add(new to0(4));
        arrayList.add(new to0(6));
        if (nxVar.O0) {
            return;
        }
        to0 to0Var = new to0(3);
        to0Var.b = 0;
        arrayList.add(to0Var);
        org.telegram.ui.yw ywVar = nxVar.b1.G3;
        if (ywVar == null || !ywVar.c()) {
            arrayList.add(new to0(2));
        }
        to0 to0Var2 = new to0(3);
        to0Var2.b = 1;
        arrayList.add(to0Var2);
        to0 to0Var3 = new to0(3);
        to0Var3.b = 2;
        arrayList.add(to0Var3);
        to0 to0Var4 = new to0(3);
        to0Var4.b = 3;
        arrayList.add(to0Var4);
        to0 to0Var5 = new to0(3);
        to0Var5.b = 4;
        arrayList.add(to0Var5);
    }
}
