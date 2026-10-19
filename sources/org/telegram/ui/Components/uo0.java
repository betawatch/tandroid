package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class uo0 extends v81 {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ org.telegram.ui.lx b;

    public uo0(org.telegram.ui.lx lxVar) {
        this.b = lxVar;
        i();
    }

    @Override // org.telegram.ui.Components.v81
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.lx lxVar = this.b;
        lxVar.O(view, i10, lxVar.K0, true);
    }

    @Override // org.telegram.ui.Components.v81
    public final View d(int i10) {
        org.telegram.ui.lx lxVar = this.b;
        org.telegram.ui.cy cyVar = lxVar.J0;
        if (i10 == 1) {
            return lxVar.U;
        }
        if (i10 == 3) {
            return lxVar.f0;
        }
        if (i10 == 4) {
            return lxVar.k0;
        }
        if (i10 == 5) {
            return lxVar.r0;
        }
        if (i10 == 2) {
            tn0 tn0Var = new tn0(lxVar.H0, cyVar);
            lxVar.G0 = tn0Var;
            tn0Var.b(lxVar.U0, lxVar.V0, false);
            lxVar.G0.b.setClipToPadding(false);
            lxVar.G0.b.j(new so0(this, 0));
            lxVar.G0.b.C0(new rc0(lxVar, 23));
            lxVar.G0.setUiCallback(lxVar);
            return lxVar.G0;
        }
        if (i10 == 6) {
            return lxVar.p0;
        }
        org.telegram.ui.e10 e10Var = new org.telegram.ui.e10(cyVar);
        e10Var.setChatPreviewDelegate(lxVar.P0);
        e10Var.setUiCallback(lxVar);
        e10Var.j(lxVar.U0, lxVar.V0, false);
        bh.b bVar = lxVar.X0;
        if (bVar != null) {
            e10Var.setBlurredBackgroundDrawableFactory(bVar);
        }
        ai.u1 u1Var = e10Var.b;
        u1Var.setClipToPadding(false);
        u1Var.j(new so0(this, 1));
        u1Var.C0(new rc0(lxVar, 23));
        return e10Var;
    }

    @Override // org.telegram.ui.Components.v81
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.v81
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

    @Override // org.telegram.ui.Components.v81
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
        org.telegram.ui.lx lxVar = this.b;
        if (lxVar.T0 != 0) {
            return;
        }
        if (lxVar.q0) {
            arrayList.add(new to0(5));
        }
        arrayList.add(new to0(1));
        arrayList.add(new to0(4));
        arrayList.add(new to0(6));
        if (lxVar.O0) {
            return;
        }
        to0 to0Var = new to0(3);
        to0Var.b = 0;
        arrayList.add(to0Var);
        org.telegram.ui.ww wwVar = lxVar.b1.G3;
        if (wwVar == null || !wwVar.c()) {
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
