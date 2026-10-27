package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ep0 extends n91 {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ org.telegram.ui.mx b;

    public ep0(org.telegram.ui.mx mxVar) {
        this.b = mxVar;
        i();
    }

    @Override // org.telegram.ui.Components.n91
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.mx mxVar = this.b;
        mxVar.P(view, i10, mxVar.M0, true);
    }

    @Override // org.telegram.ui.Components.n91
    public final View d(int i10) {
        org.telegram.ui.mx mxVar = this.b;
        org.telegram.ui.ey eyVar = mxVar.L0;
        if (i10 == 1) {
            return mxVar.W;
        }
        if (i10 == 3) {
            return mxVar.h0;
        }
        if (i10 == 4) {
            return mxVar.m0;
        }
        if (i10 == 5) {
            return mxVar.t0;
        }
        if (i10 == 2) {
            do0 do0Var = new do0(mxVar.J0, eyVar);
            mxVar.I0 = do0Var;
            do0Var.b(mxVar.W0, mxVar.X0, false);
            mxVar.I0.b.setClipToPadding(false);
            mxVar.I0.b.j(new cp0(this, 0));
            mxVar.I0.b.D0(new xa0(mxVar, 26));
            mxVar.I0.setUiCallback(mxVar);
            return mxVar.I0;
        }
        if (i10 == 6) {
            return mxVar.r0;
        }
        org.telegram.ui.j10 j10Var = new org.telegram.ui.j10(eyVar);
        j10Var.setChatPreviewDelegate(mxVar.R0);
        j10Var.setUiCallback(mxVar);
        j10Var.j(mxVar.W0, mxVar.X0, false);
        ch.b bVar = mxVar.Z0;
        if (bVar != null) {
            j10Var.setBlurredBackgroundDrawableFactory(bVar);
        }
        bi.r1 r1Var = j10Var.b;
        r1Var.setClipToPadding(false);
        r1Var.j(new cp0(this, 1));
        r1Var.D0(new xa0(mxVar, 26));
        return j10Var;
    }

    @Override // org.telegram.ui.Components.n91
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.n91
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.a;
        if (((dp0) arrayList.get(i10)).a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((dp0) arrayList.get(i10)).a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((dp0) arrayList.get(i10)).a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((dp0) arrayList.get(i10)).a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((dp0) arrayList.get(i10)).a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((dp0) arrayList.get(i10)).a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        ig.p0 p0Var = ig.r0.k3[((dp0) arrayList.get(i10)).b];
        String str = p0Var.c;
        return str != null ? str : LocaleController.getString(p0Var.b);
    }

    @Override // org.telegram.ui.Components.n91
    public final int h(int i10) {
        ArrayList arrayList = this.a;
        if (((dp0) arrayList.get(i10)).a == 0) {
            return 1;
        }
        if (((dp0) arrayList.get(i10)).a == 1) {
            return 3;
        }
        if (((dp0) arrayList.get(i10)).a == 4) {
            return 4;
        }
        if (((dp0) arrayList.get(i10)).a == 2) {
            return 2;
        }
        if (((dp0) arrayList.get(i10)).a == 5) {
            return 5;
        }
        if (((dp0) arrayList.get(i10)).a == 6) {
            return 6;
        }
        return ((dp0) arrayList.get(i10)).a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        arrayList.add(new dp0(0));
        org.telegram.ui.mx mxVar = this.b;
        if (mxVar.V0 != 0) {
            return;
        }
        if (mxVar.s0) {
            arrayList.add(new dp0(5));
        }
        arrayList.add(new dp0(1));
        arrayList.add(new dp0(4));
        arrayList.add(new dp0(6));
        if (mxVar.Q0) {
            return;
        }
        dp0 dp0Var = new dp0(3);
        dp0Var.b = 0;
        arrayList.add(dp0Var);
        org.telegram.ui.vw vwVar = mxVar.d1.G3;
        if (vwVar == null || !vwVar.c()) {
            arrayList.add(new dp0(2));
        }
        dp0 dp0Var2 = new dp0(3);
        dp0Var2.b = 1;
        arrayList.add(dp0Var2);
        dp0 dp0Var3 = new dp0(3);
        dp0Var3.b = 2;
        arrayList.add(dp0Var3);
        dp0 dp0Var4 = new dp0(3);
        dp0Var4.b = 3;
        arrayList.add(dp0Var4);
        dp0 dp0Var5 = new dp0(3);
        dp0Var5.b = 4;
        arrayList.add(dp0Var5);
    }
}
