package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class vo0 extends w81 {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ org.telegram.ui.lx b;

    public vo0(org.telegram.ui.lx lxVar) {
        this.b = lxVar;
        i();
    }

    @Override // org.telegram.ui.Components.w81
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.lx lxVar = this.b;
        lxVar.O(view, i10, lxVar.K0, true);
    }

    @Override // org.telegram.ui.Components.w81
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
            un0 un0Var = new un0(lxVar.H0, cyVar);
            lxVar.G0 = un0Var;
            un0Var.b(lxVar.U0, lxVar.V0, false);
            lxVar.G0.b.setClipToPadding(false);
            lxVar.G0.b.j(new to0(this, 0));
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
        u1Var.j(new to0(this, 1));
        u1Var.C0(new rc0(lxVar, 23));
        return e10Var;
    }

    @Override // org.telegram.ui.Components.w81
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.w81
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.a;
        if (((uo0) arrayList.get(i10)).a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((uo0) arrayList.get(i10)).a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((uo0) arrayList.get(i10)).a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((uo0) arrayList.get(i10)).a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((uo0) arrayList.get(i10)).a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((uo0) arrayList.get(i10)).a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        hg.o0 o0Var = hg.q0.a3[((uo0) arrayList.get(i10)).b];
        String str = o0Var.c;
        return str != null ? str : LocaleController.getString(o0Var.b);
    }

    @Override // org.telegram.ui.Components.w81
    public final int h(int i10) {
        ArrayList arrayList = this.a;
        if (((uo0) arrayList.get(i10)).a == 0) {
            return 1;
        }
        if (((uo0) arrayList.get(i10)).a == 1) {
            return 3;
        }
        if (((uo0) arrayList.get(i10)).a == 4) {
            return 4;
        }
        if (((uo0) arrayList.get(i10)).a == 2) {
            return 2;
        }
        if (((uo0) arrayList.get(i10)).a == 5) {
            return 5;
        }
        if (((uo0) arrayList.get(i10)).a == 6) {
            return 6;
        }
        return ((uo0) arrayList.get(i10)).a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        arrayList.add(new uo0(0));
        org.telegram.ui.lx lxVar = this.b;
        if (lxVar.T0 != 0) {
            return;
        }
        if (lxVar.q0) {
            arrayList.add(new uo0(5));
        }
        arrayList.add(new uo0(1));
        arrayList.add(new uo0(4));
        arrayList.add(new uo0(6));
        if (lxVar.O0) {
            return;
        }
        uo0 uo0Var = new uo0(3);
        uo0Var.b = 0;
        arrayList.add(uo0Var);
        org.telegram.ui.ww wwVar = lxVar.b1.G3;
        if (wwVar == null || !wwVar.c()) {
            arrayList.add(new uo0(2));
        }
        uo0 uo0Var2 = new uo0(3);
        uo0Var2.b = 1;
        arrayList.add(uo0Var2);
        uo0 uo0Var3 = new uo0(3);
        uo0Var3.b = 2;
        arrayList.add(uo0Var3);
        uo0 uo0Var4 = new uo0(3);
        uo0Var4.b = 3;
        arrayList.add(uo0Var4);
        uo0 uo0Var5 = new uo0(3);
        uo0Var5.b = 4;
        arrayList.add(uo0Var5);
    }
}
