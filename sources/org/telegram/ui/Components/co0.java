package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class co0 extends c81 {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ org.telegram.ui.xx b;

    public co0(org.telegram.ui.xx xxVar) {
        this.b = xxVar;
        i();
    }

    @Override // org.telegram.ui.Components.c81
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.xx xxVar = this.b;
        xxVar.O(view, i10, xxVar.H0, true);
    }

    @Override // org.telegram.ui.Components.c81
    public final View d(int i10) {
        org.telegram.ui.xx xxVar = this.b;
        org.telegram.ui.oy oyVar = xxVar.G0;
        if (i10 == 1) {
            return xxVar.R;
        }
        if (i10 == 3) {
            return xxVar.c0;
        }
        if (i10 == 4) {
            return xxVar.h0;
        }
        if (i10 == 5) {
            return xxVar.o0;
        }
        if (i10 == 2) {
            dn0 dn0Var = new dn0(xxVar.E0, oyVar);
            xxVar.D0 = dn0Var;
            dn0Var.b(xxVar.R0, xxVar.S0, false);
            xxVar.D0.b.setClipToPadding(false);
            xxVar.D0.b.j(new ao0(this, 0));
            xxVar.D0.b.C0(new cc0(xxVar, 23));
            xxVar.D0.setUiCallback(xxVar);
            return xxVar.D0;
        }
        if (i10 == 6) {
            return xxVar.m0;
        }
        org.telegram.ui.t10 t10Var = new org.telegram.ui.t10(oyVar);
        t10Var.setChatPreviewDelegate(xxVar.M0);
        t10Var.setUiCallback(xxVar);
        t10Var.j(xxVar.R0, xxVar.S0, false);
        ng.a aVar = xxVar.T0;
        if (aVar != null) {
            t10Var.setBlurredBackgroundDrawableFactory(aVar);
        }
        lh.e1 e1Var = t10Var.b;
        e1Var.setClipToPadding(false);
        e1Var.j(new ao0(this, 1));
        e1Var.C0(new cc0(xxVar, 23));
        return t10Var;
    }

    @Override // org.telegram.ui.Components.c81
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.c81
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.a;
        if (((bo0) arrayList.get(i10)).a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((bo0) arrayList.get(i10)).a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((bo0) arrayList.get(i10)).a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((bo0) arrayList.get(i10)).a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((bo0) arrayList.get(i10)).a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((bo0) arrayList.get(i10)).a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        tf.e0 e0Var = tf.g0.Z2[((bo0) arrayList.get(i10)).b];
        String str = e0Var.c;
        return str != null ? str : LocaleController.getString(e0Var.b);
    }

    @Override // org.telegram.ui.Components.c81
    public final int h(int i10) {
        ArrayList arrayList = this.a;
        if (((bo0) arrayList.get(i10)).a == 0) {
            return 1;
        }
        if (((bo0) arrayList.get(i10)).a == 1) {
            return 3;
        }
        if (((bo0) arrayList.get(i10)).a == 4) {
            return 4;
        }
        if (((bo0) arrayList.get(i10)).a == 2) {
            return 2;
        }
        if (((bo0) arrayList.get(i10)).a == 5) {
            return 5;
        }
        if (((bo0) arrayList.get(i10)).a == 6) {
            return 6;
        }
        return ((bo0) arrayList.get(i10)).a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        arrayList.add(new bo0(0));
        org.telegram.ui.xx xxVar = this.b;
        if (xxVar.Q0 != 0) {
            return;
        }
        if (xxVar.n0) {
            arrayList.add(new bo0(5));
        }
        arrayList.add(new bo0(1));
        arrayList.add(new bo0(4));
        arrayList.add(new bo0(6));
        if (xxVar.L0) {
            return;
        }
        bo0 bo0Var = new bo0(3);
        bo0Var.b = 0;
        arrayList.add(bo0Var);
        org.telegram.ui.jx jxVar = xxVar.X0.C3;
        if (jxVar == null || !jxVar.c()) {
            arrayList.add(new bo0(2));
        }
        bo0 bo0Var2 = new bo0(3);
        bo0Var2.b = 1;
        arrayList.add(bo0Var2);
        bo0 bo0Var3 = new bo0(3);
        bo0Var3.b = 2;
        arrayList.add(bo0Var3);
        bo0 bo0Var4 = new bo0(3);
        bo0Var4.b = 3;
        arrayList.add(bo0Var4);
        bo0 bo0Var5 = new bo0(3);
        bo0Var5.b = 4;
        arrayList.add(bo0Var5);
    }
}
