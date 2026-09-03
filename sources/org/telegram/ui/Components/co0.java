package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class co0 extends d81 {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ org.telegram.ui.yx b;

    public co0(org.telegram.ui.yx yxVar) {
        this.b = yxVar;
        i();
    }

    @Override // org.telegram.ui.Components.d81
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.yx yxVar = this.b;
        yxVar.O(view, i10, yxVar.H0, true);
    }

    @Override // org.telegram.ui.Components.d81
    public final View d(int i10) {
        org.telegram.ui.yx yxVar = this.b;
        org.telegram.ui.py pyVar = yxVar.G0;
        if (i10 == 1) {
            return yxVar.R;
        }
        if (i10 == 3) {
            return yxVar.c0;
        }
        if (i10 == 4) {
            return yxVar.h0;
        }
        if (i10 == 5) {
            return yxVar.o0;
        }
        if (i10 == 2) {
            dn0 dn0Var = new dn0(yxVar.E0, pyVar);
            yxVar.D0 = dn0Var;
            dn0Var.b(yxVar.R0, yxVar.S0, false);
            yxVar.D0.b.setClipToPadding(false);
            yxVar.D0.b.j(new ao0(this, 0));
            yxVar.D0.b.C0(new ec0(yxVar, 23));
            yxVar.D0.setUiCallback(yxVar);
            return yxVar.D0;
        }
        if (i10 == 6) {
            return yxVar.m0;
        }
        org.telegram.ui.t10 t10Var = new org.telegram.ui.t10(pyVar);
        t10Var.setChatPreviewDelegate(yxVar.M0);
        t10Var.setUiCallback(yxVar);
        t10Var.j(yxVar.R0, yxVar.S0, false);
        og.a aVar = yxVar.T0;
        if (aVar != null) {
            t10Var.setBlurredBackgroundDrawableFactory(aVar);
        }
        mh.d1 d1Var = t10Var.b;
        d1Var.setClipToPadding(false);
        d1Var.j(new ao0(this, 1));
        d1Var.C0(new ec0(yxVar, 23));
        return t10Var;
    }

    @Override // org.telegram.ui.Components.d81
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.d81
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
        uf.e0 e0Var = uf.g0.Z2[((bo0) arrayList.get(i10)).b];
        String str = e0Var.c;
        return str != null ? str : LocaleController.getString(e0Var.b);
    }

    @Override // org.telegram.ui.Components.d81
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
        org.telegram.ui.yx yxVar = this.b;
        if (yxVar.Q0 != 0) {
            return;
        }
        if (yxVar.n0) {
            arrayList.add(new bo0(5));
        }
        arrayList.add(new bo0(1));
        arrayList.add(new bo0(4));
        arrayList.add(new bo0(6));
        if (yxVar.L0) {
            return;
        }
        bo0 bo0Var = new bo0(3);
        bo0Var.b = 0;
        arrayList.add(bo0Var);
        org.telegram.ui.kx kxVar = yxVar.X0.C3;
        if (kxVar == null || !kxVar.c()) {
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
