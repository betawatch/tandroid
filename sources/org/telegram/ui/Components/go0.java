package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class go0 extends n81 {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ org.telegram.ui.gy b;

    public go0(org.telegram.ui.gy gyVar) {
        this.b = gyVar;
        i();
    }

    @Override // org.telegram.ui.Components.n81
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.gy gyVar = this.b;
        gyVar.O(view, i10, gyVar.K0, true);
    }

    @Override // org.telegram.ui.Components.n81
    public final View d(int i10) {
        org.telegram.ui.gy gyVar = this.b;
        org.telegram.ui.wy wyVar = gyVar.J0;
        if (i10 == 1) {
            return gyVar.U;
        }
        if (i10 == 3) {
            return gyVar.f0;
        }
        if (i10 == 4) {
            return gyVar.k0;
        }
        if (i10 == 5) {
            return gyVar.r0;
        }
        if (i10 == 2) {
            fn0 fn0Var = new fn0(gyVar.H0, wyVar);
            gyVar.G0 = fn0Var;
            fn0Var.b(gyVar.U0, gyVar.V0, false);
            gyVar.G0.b.setClipToPadding(false);
            gyVar.G0.b.j(new eo0(this, 0));
            gyVar.G0.b.C0(new kc0(gyVar, 23));
            gyVar.G0.setUiCallback(gyVar);
            return gyVar.G0;
        }
        if (i10 == 6) {
            return gyVar.p0;
        }
        org.telegram.ui.z10 z10Var = new org.telegram.ui.z10(wyVar);
        z10Var.setChatPreviewDelegate(gyVar.P0);
        z10Var.setUiCallback(gyVar);
        z10Var.j(gyVar.U0, gyVar.V0, false);
        zg.a aVar = gyVar.W0;
        if (aVar != null) {
            z10Var.setBlurredBackgroundDrawableFactory(aVar);
        }
        bi.y1 y1Var = z10Var.b;
        y1Var.setClipToPadding(false);
        y1Var.j(new eo0(this, 1));
        y1Var.C0(new kc0(gyVar, 23));
        return z10Var;
    }

    @Override // org.telegram.ui.Components.n81
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.n81
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.a;
        if (((fo0) arrayList.get(i10)).a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((fo0) arrayList.get(i10)).a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((fo0) arrayList.get(i10)).a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((fo0) arrayList.get(i10)).a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((fo0) arrayList.get(i10)).a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((fo0) arrayList.get(i10)).a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        fg.q0 q0Var = fg.s0.c3[((fo0) arrayList.get(i10)).b];
        String str = q0Var.c;
        return str != null ? str : LocaleController.getString(q0Var.b);
    }

    @Override // org.telegram.ui.Components.n81
    public final int h(int i10) {
        ArrayList arrayList = this.a;
        if (((fo0) arrayList.get(i10)).a == 0) {
            return 1;
        }
        if (((fo0) arrayList.get(i10)).a == 1) {
            return 3;
        }
        if (((fo0) arrayList.get(i10)).a == 4) {
            return 4;
        }
        if (((fo0) arrayList.get(i10)).a == 2) {
            return 2;
        }
        if (((fo0) arrayList.get(i10)).a == 5) {
            return 5;
        }
        if (((fo0) arrayList.get(i10)).a == 6) {
            return 6;
        }
        return ((fo0) arrayList.get(i10)).a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        arrayList.add(new fo0(0));
        org.telegram.ui.gy gyVar = this.b;
        if (gyVar.T0 != 0) {
            return;
        }
        if (gyVar.q0) {
            arrayList.add(new fo0(5));
        }
        arrayList.add(new fo0(1));
        arrayList.add(new fo0(4));
        arrayList.add(new fo0(6));
        if (gyVar.O0) {
            return;
        }
        fo0 fo0Var = new fo0(3);
        fo0Var.b = 0;
        arrayList.add(fo0Var);
        org.telegram.ui.qx qxVar = gyVar.a1.F3;
        if (qxVar == null || !qxVar.c()) {
            arrayList.add(new fo0(2));
        }
        fo0 fo0Var2 = new fo0(3);
        fo0Var2.b = 1;
        arrayList.add(fo0Var2);
        fo0 fo0Var3 = new fo0(3);
        fo0Var3.b = 2;
        arrayList.add(fo0Var3);
        fo0 fo0Var4 = new fo0(3);
        fo0Var4.b = 3;
        arrayList.add(fo0Var4);
        fo0 fo0Var5 = new fo0(3);
        fo0Var5.b = 4;
        arrayList.add(fo0Var5);
    }
}
