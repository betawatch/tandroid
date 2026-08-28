package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gn0 extends e71 {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ org.telegram.ui.mx b;

    public gn0(org.telegram.ui.mx mxVar) {
        this.b = mxVar;
        i();
    }

    @Override // org.telegram.ui.Components.e71
    public final void b(View view, int i9, int i10) {
        org.telegram.ui.mx mxVar = this.b;
        mxVar.O(view, i9, mxVar.G0, true);
    }

    @Override // org.telegram.ui.Components.e71
    public final View d(int i9) {
        org.telegram.ui.mx mxVar = this.b;
        org.telegram.ui.dy dyVar = mxVar.F0;
        if (i9 == 1) {
            return mxVar.Q;
        }
        if (i9 == 3) {
            return mxVar.b0;
        }
        if (i9 == 4) {
            return mxVar.g0;
        }
        if (i9 == 5) {
            return mxVar.n0;
        }
        if (i9 == 2) {
            gm0 gm0Var = new gm0(mxVar.D0, dyVar);
            mxVar.C0 = gm0Var;
            gm0Var.b(mxVar.Q0, mxVar.R0, false);
            mxVar.C0.b.setClipToPadding(false);
            mxVar.C0.b.j(new en0(this, 0));
            mxVar.C0.b.C0(new ib0(mxVar, 23));
            mxVar.C0.setUiCallback(mxVar);
            return mxVar.C0;
        }
        if (i9 == 6) {
            return mxVar.l0;
        }
        org.telegram.ui.f10 f10Var = new org.telegram.ui.f10(dyVar);
        f10Var.setChatPreviewDelegate(mxVar.L0);
        f10Var.setUiCallback(mxVar);
        f10Var.j(mxVar.Q0, mxVar.R0, false);
        ig.a aVar = mxVar.S0;
        if (aVar != null) {
            f10Var.setBlurredBackgroundDrawableFactory(aVar);
        }
        gh.f1 f1Var = f10Var.b;
        f1Var.setClipToPadding(false);
        f1Var.j(new en0(this, 1));
        f1Var.C0(new ib0(mxVar, 23));
        return f10Var;
    }

    @Override // org.telegram.ui.Components.e71
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.e71
    public final CharSequence g(int i9) {
        ArrayList arrayList = this.a;
        if (((fn0) arrayList.get(i9)).a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((fn0) arrayList.get(i9)).a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((fn0) arrayList.get(i9)).a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((fn0) arrayList.get(i9)).a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((fn0) arrayList.get(i9)).a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((fn0) arrayList.get(i9)).a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        of.m0 m0Var = of.o0.Y2[((fn0) arrayList.get(i9)).b];
        String str = m0Var.c;
        return str != null ? str : LocaleController.getString(m0Var.b);
    }

    @Override // org.telegram.ui.Components.e71
    public final int h(int i9) {
        ArrayList arrayList = this.a;
        if (((fn0) arrayList.get(i9)).a == 0) {
            return 1;
        }
        if (((fn0) arrayList.get(i9)).a == 1) {
            return 3;
        }
        if (((fn0) arrayList.get(i9)).a == 4) {
            return 4;
        }
        if (((fn0) arrayList.get(i9)).a == 2) {
            return 2;
        }
        if (((fn0) arrayList.get(i9)).a == 5) {
            return 5;
        }
        if (((fn0) arrayList.get(i9)).a == 6) {
            return 6;
        }
        return ((fn0) arrayList.get(i9)).a + i9;
    }

    public final void i() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        arrayList.add(new fn0(0));
        org.telegram.ui.mx mxVar = this.b;
        if (mxVar.P0 != 0) {
            return;
        }
        if (mxVar.m0) {
            arrayList.add(new fn0(5));
        }
        arrayList.add(new fn0(1));
        arrayList.add(new fn0(4));
        arrayList.add(new fn0(6));
        if (mxVar.K0) {
            return;
        }
        fn0 fn0Var = new fn0(3);
        fn0Var.b = 0;
        arrayList.add(fn0Var);
        org.telegram.ui.yw ywVar = mxVar.W0.B3;
        if (ywVar == null || !ywVar.c()) {
            arrayList.add(new fn0(2));
        }
        fn0 fn0Var2 = new fn0(3);
        fn0Var2.b = 1;
        arrayList.add(fn0Var2);
        fn0 fn0Var3 = new fn0(3);
        fn0Var3.b = 2;
        arrayList.add(fn0Var3);
        fn0 fn0Var4 = new fn0(3);
        fn0Var4.b = 3;
        arrayList.add(fn0Var4);
        fn0 fn0Var5 = new fn0(3);
        fn0Var5.b = 4;
        arrayList.add(fn0Var5);
    }
}
