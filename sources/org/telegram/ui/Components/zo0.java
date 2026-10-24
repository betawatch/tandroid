package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class zo0 extends d91 {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ org.telegram.ui.nx b;

    public zo0(org.telegram.ui.nx nxVar) {
        this.b = nxVar;
        i();
    }

    @Override // org.telegram.ui.Components.d91
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.nx nxVar = this.b;
        nxVar.N(view, i10, nxVar.K0, true);
    }

    @Override // org.telegram.ui.Components.d91
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
            xn0 xn0Var = new xn0(nxVar.H0, eyVar);
            nxVar.G0 = xn0Var;
            xn0Var.b(nxVar.U0, nxVar.V0, false);
            nxVar.G0.b.setClipToPadding(false);
            nxVar.G0.b.j(new xo0(this, 0));
            nxVar.G0.b.C0(new yb0(nxVar, 24));
            nxVar.G0.setUiCallback(nxVar);
            return nxVar.G0;
        }
        if (i10 == 6) {
            return nxVar.p0;
        }
        org.telegram.ui.i10 i10Var = new org.telegram.ui.i10(eyVar);
        i10Var.setChatPreviewDelegate(nxVar.P0);
        i10Var.setUiCallback(nxVar);
        i10Var.j(nxVar.U0, nxVar.V0, false);
        bh.b bVar = nxVar.X0;
        if (bVar != null) {
            i10Var.setBlurredBackgroundDrawableFactory(bVar);
        }
        ai.u1 u1Var = i10Var.b;
        u1Var.setClipToPadding(false);
        u1Var.j(new xo0(this, 1));
        u1Var.C0(new yb0(nxVar, 24));
        return i10Var;
    }

    @Override // org.telegram.ui.Components.d91
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.d91
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.a;
        if (((yo0) arrayList.get(i10)).a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((yo0) arrayList.get(i10)).a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((yo0) arrayList.get(i10)).a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((yo0) arrayList.get(i10)).a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((yo0) arrayList.get(i10)).a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((yo0) arrayList.get(i10)).a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        hg.o0 o0Var = hg.q0.d3[((yo0) arrayList.get(i10)).b];
        String str = o0Var.c;
        return str != null ? str : LocaleController.getString(o0Var.b);
    }

    @Override // org.telegram.ui.Components.d91
    public final int h(int i10) {
        ArrayList arrayList = this.a;
        if (((yo0) arrayList.get(i10)).a == 0) {
            return 1;
        }
        if (((yo0) arrayList.get(i10)).a == 1) {
            return 3;
        }
        if (((yo0) arrayList.get(i10)).a == 4) {
            return 4;
        }
        if (((yo0) arrayList.get(i10)).a == 2) {
            return 2;
        }
        if (((yo0) arrayList.get(i10)).a == 5) {
            return 5;
        }
        if (((yo0) arrayList.get(i10)).a == 6) {
            return 6;
        }
        return ((yo0) arrayList.get(i10)).a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        arrayList.add(new yo0(0));
        org.telegram.ui.nx nxVar = this.b;
        if (nxVar.T0 != 0) {
            return;
        }
        if (nxVar.q0) {
            arrayList.add(new yo0(5));
        }
        arrayList.add(new yo0(1));
        arrayList.add(new yo0(4));
        arrayList.add(new yo0(6));
        if (nxVar.O0) {
            return;
        }
        yo0 yo0Var = new yo0(3);
        yo0Var.b = 0;
        arrayList.add(yo0Var);
        org.telegram.ui.yw ywVar = nxVar.b1.G3;
        if (ywVar == null || !ywVar.c()) {
            arrayList.add(new yo0(2));
        }
        yo0 yo0Var2 = new yo0(3);
        yo0Var2.b = 1;
        arrayList.add(yo0Var2);
        yo0 yo0Var3 = new yo0(3);
        yo0Var3.b = 2;
        arrayList.add(yo0Var3);
        yo0 yo0Var4 = new yo0(3);
        yo0Var4.b = 3;
        arrayList.add(yo0Var4);
        yo0 yo0Var5 = new yo0(3);
        yo0Var5.b = 4;
        arrayList.add(yo0Var5);
    }
}
