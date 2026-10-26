package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class dp0 extends m91 {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ org.telegram.ui.jx b;

    public dp0(org.telegram.ui.jx jxVar) {
        this.b = jxVar;
        i();
    }

    @Override // org.telegram.ui.Components.m91
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.jx jxVar = this.b;
        jxVar.P(view, i10, jxVar.M0, true);
    }

    @Override // org.telegram.ui.Components.m91
    public final View d(int i10) {
        org.telegram.ui.jx jxVar = this.b;
        org.telegram.ui.cy cyVar = jxVar.L0;
        if (i10 == 1) {
            return jxVar.W;
        }
        if (i10 == 3) {
            return jxVar.h0;
        }
        if (i10 == 4) {
            return jxVar.m0;
        }
        if (i10 == 5) {
            return jxVar.t0;
        }
        if (i10 == 2) {
            co0 co0Var = new co0(jxVar.J0, cyVar);
            jxVar.I0 = co0Var;
            co0Var.b(jxVar.W0, jxVar.X0, false);
            jxVar.I0.b.setClipToPadding(false);
            jxVar.I0.b.j(new bp0(this, 0));
            jxVar.I0.b.D0(new wa0(jxVar, 26));
            jxVar.I0.setUiCallback(jxVar);
            return jxVar.I0;
        }
        if (i10 == 6) {
            return jxVar.r0;
        }
        org.telegram.ui.h10 h10Var = new org.telegram.ui.h10(cyVar);
        h10Var.setChatPreviewDelegate(jxVar.R0);
        h10Var.setUiCallback(jxVar);
        h10Var.j(jxVar.W0, jxVar.X0, false);
        ch.b bVar = jxVar.Z0;
        if (bVar != null) {
            h10Var.setBlurredBackgroundDrawableFactory(bVar);
        }
        bi.r1 r1Var = h10Var.b;
        r1Var.setClipToPadding(false);
        r1Var.j(new bp0(this, 1));
        r1Var.D0(new wa0(jxVar, 26));
        return h10Var;
    }

    @Override // org.telegram.ui.Components.m91
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.m91
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.a;
        if (((cp0) arrayList.get(i10)).a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((cp0) arrayList.get(i10)).a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((cp0) arrayList.get(i10)).a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((cp0) arrayList.get(i10)).a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((cp0) arrayList.get(i10)).a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((cp0) arrayList.get(i10)).a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        ig.p0 p0Var = ig.r0.k3[((cp0) arrayList.get(i10)).b];
        String str = p0Var.c;
        return str != null ? str : LocaleController.getString(p0Var.b);
    }

    @Override // org.telegram.ui.Components.m91
    public final int h(int i10) {
        ArrayList arrayList = this.a;
        if (((cp0) arrayList.get(i10)).a == 0) {
            return 1;
        }
        if (((cp0) arrayList.get(i10)).a == 1) {
            return 3;
        }
        if (((cp0) arrayList.get(i10)).a == 4) {
            return 4;
        }
        if (((cp0) arrayList.get(i10)).a == 2) {
            return 2;
        }
        if (((cp0) arrayList.get(i10)).a == 5) {
            return 5;
        }
        if (((cp0) arrayList.get(i10)).a == 6) {
            return 6;
        }
        return ((cp0) arrayList.get(i10)).a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        arrayList.add(new cp0(0));
        org.telegram.ui.jx jxVar = this.b;
        if (jxVar.V0 != 0) {
            return;
        }
        if (jxVar.s0) {
            arrayList.add(new cp0(5));
        }
        arrayList.add(new cp0(1));
        arrayList.add(new cp0(4));
        arrayList.add(new cp0(6));
        if (jxVar.Q0) {
            return;
        }
        cp0 cp0Var = new cp0(3);
        cp0Var.b = 0;
        arrayList.add(cp0Var);
        org.telegram.ui.tw twVar = jxVar.d1.G3;
        if (twVar == null || !twVar.c()) {
            arrayList.add(new cp0(2));
        }
        cp0 cp0Var2 = new cp0(3);
        cp0Var2.b = 1;
        arrayList.add(cp0Var2);
        cp0 cp0Var3 = new cp0(3);
        cp0Var3.b = 2;
        arrayList.add(cp0Var3);
        cp0 cp0Var4 = new cp0(3);
        cp0Var4.b = 3;
        arrayList.add(cp0Var4);
        cp0 cp0Var5 = new cp0(3);
        cp0Var5.b = 4;
        arrayList.add(cp0Var5);
    }
}
