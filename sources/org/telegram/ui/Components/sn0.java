package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class sn0 extends q71 {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ org.telegram.ui.ox b;

    public sn0(org.telegram.ui.ox oxVar) {
        this.b = oxVar;
        i();
    }

    @Override // org.telegram.ui.Components.q71
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.ox oxVar = this.b;
        oxVar.O(view, i10, oxVar.G0, true);
    }

    @Override // org.telegram.ui.Components.q71
    public final View d(int i10) {
        org.telegram.ui.ox oxVar = this.b;
        org.telegram.ui.fy fyVar = oxVar.F0;
        if (i10 == 1) {
            return oxVar.Q;
        }
        if (i10 == 3) {
            return oxVar.b0;
        }
        if (i10 == 4) {
            return oxVar.g0;
        }
        if (i10 == 5) {
            return oxVar.n0;
        }
        if (i10 == 2) {
            tm0 tm0Var = new tm0(oxVar.D0, fyVar);
            oxVar.C0 = tm0Var;
            tm0Var.b(oxVar.Q0, oxVar.R0, false);
            oxVar.C0.b.setClipToPadding(false);
            oxVar.C0.b.j(new qn0(this, 0));
            oxVar.C0.b.C0(new xb0(oxVar, 23));
            oxVar.C0.setUiCallback(oxVar);
            return oxVar.C0;
        }
        if (i10 == 6) {
            return oxVar.l0;
        }
        org.telegram.ui.h10 h10Var = new org.telegram.ui.h10(fyVar);
        h10Var.setChatPreviewDelegate(oxVar.L0);
        h10Var.setUiCallback(oxVar);
        h10Var.j(oxVar.Q0, oxVar.R0, false);
        lg.a aVar = oxVar.S0;
        if (aVar != null) {
            h10Var.setBlurredBackgroundDrawableFactory(aVar);
        }
        jh.e1 e1Var = h10Var.b;
        e1Var.setClipToPadding(false);
        e1Var.j(new qn0(this, 1));
        e1Var.C0(new xb0(oxVar, 23));
        return h10Var;
    }

    @Override // org.telegram.ui.Components.q71
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.q71
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.a;
        if (((rn0) arrayList.get(i10)).a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((rn0) arrayList.get(i10)).a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((rn0) arrayList.get(i10)).a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((rn0) arrayList.get(i10)).a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((rn0) arrayList.get(i10)).a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((rn0) arrayList.get(i10)).a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        rf.f0 f0Var = rf.h0.Y2[((rn0) arrayList.get(i10)).b];
        String str = f0Var.c;
        return str != null ? str : LocaleController.getString(f0Var.b);
    }

    @Override // org.telegram.ui.Components.q71
    public final int h(int i10) {
        ArrayList arrayList = this.a;
        if (((rn0) arrayList.get(i10)).a == 0) {
            return 1;
        }
        if (((rn0) arrayList.get(i10)).a == 1) {
            return 3;
        }
        if (((rn0) arrayList.get(i10)).a == 4) {
            return 4;
        }
        if (((rn0) arrayList.get(i10)).a == 2) {
            return 2;
        }
        if (((rn0) arrayList.get(i10)).a == 5) {
            return 5;
        }
        if (((rn0) arrayList.get(i10)).a == 6) {
            return 6;
        }
        return ((rn0) arrayList.get(i10)).a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        arrayList.add(new rn0(0));
        org.telegram.ui.ox oxVar = this.b;
        if (oxVar.P0 != 0) {
            return;
        }
        if (oxVar.m0) {
            arrayList.add(new rn0(5));
        }
        arrayList.add(new rn0(1));
        arrayList.add(new rn0(4));
        arrayList.add(new rn0(6));
        if (oxVar.K0) {
            return;
        }
        rn0 rn0Var = new rn0(3);
        rn0Var.b = 0;
        arrayList.add(rn0Var);
        org.telegram.ui.ax axVar = oxVar.W0.B3;
        if (axVar == null || !axVar.c()) {
            arrayList.add(new rn0(2));
        }
        rn0 rn0Var2 = new rn0(3);
        rn0Var2.b = 1;
        arrayList.add(rn0Var2);
        rn0 rn0Var3 = new rn0(3);
        rn0Var3.b = 2;
        arrayList.add(rn0Var3);
        rn0 rn0Var4 = new rn0(3);
        rn0Var4.b = 3;
        arrayList.add(rn0Var4);
        rn0 rn0Var5 = new rn0(3);
        rn0Var5.b = 4;
        arrayList.add(rn0Var5);
    }
}
