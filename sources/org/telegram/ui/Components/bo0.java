package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class bo0 extends c81 {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ org.telegram.ui.zx b;

    public bo0(org.telegram.ui.zx zxVar) {
        this.b = zxVar;
        i();
    }

    @Override // org.telegram.ui.Components.c81
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.zx zxVar = this.b;
        zxVar.O(view, i10, zxVar.H0, true);
    }

    @Override // org.telegram.ui.Components.c81
    public final View d(int i10) {
        org.telegram.ui.zx zxVar = this.b;
        org.telegram.ui.qy qyVar = zxVar.G0;
        if (i10 == 1) {
            return zxVar.R;
        }
        if (i10 == 3) {
            return zxVar.c0;
        }
        if (i10 == 4) {
            return zxVar.h0;
        }
        if (i10 == 5) {
            return zxVar.o0;
        }
        if (i10 == 2) {
            cn0 cn0Var = new cn0(zxVar.E0, qyVar);
            zxVar.D0 = cn0Var;
            cn0Var.b(zxVar.R0, zxVar.S0, false);
            zxVar.D0.b.setClipToPadding(false);
            zxVar.D0.b.j(new zn0(this, 0));
            zxVar.D0.b.C0(new dc0(zxVar, 23));
            zxVar.D0.setUiCallback(zxVar);
            return zxVar.D0;
        }
        if (i10 == 6) {
            return zxVar.m0;
        }
        org.telegram.ui.u10 u10Var = new org.telegram.ui.u10(qyVar);
        u10Var.setChatPreviewDelegate(zxVar.M0);
        u10Var.setUiCallback(zxVar);
        u10Var.j(zxVar.R0, zxVar.S0, false);
        ng.a aVar = zxVar.T0;
        if (aVar != null) {
            u10Var.setBlurredBackgroundDrawableFactory(aVar);
        }
        lh.e1 e1Var = u10Var.b;
        e1Var.setClipToPadding(false);
        e1Var.j(new zn0(this, 1));
        e1Var.C0(new dc0(zxVar, 23));
        return u10Var;
    }

    @Override // org.telegram.ui.Components.c81
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.c81
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.a;
        if (((ao0) arrayList.get(i10)).a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((ao0) arrayList.get(i10)).a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((ao0) arrayList.get(i10)).a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((ao0) arrayList.get(i10)).a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((ao0) arrayList.get(i10)).a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((ao0) arrayList.get(i10)).a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        tf.e0 e0Var = tf.g0.Z2[((ao0) arrayList.get(i10)).b];
        String str = e0Var.c;
        return str != null ? str : LocaleController.getString(e0Var.b);
    }

    @Override // org.telegram.ui.Components.c81
    public final int h(int i10) {
        ArrayList arrayList = this.a;
        if (((ao0) arrayList.get(i10)).a == 0) {
            return 1;
        }
        if (((ao0) arrayList.get(i10)).a == 1) {
            return 3;
        }
        if (((ao0) arrayList.get(i10)).a == 4) {
            return 4;
        }
        if (((ao0) arrayList.get(i10)).a == 2) {
            return 2;
        }
        if (((ao0) arrayList.get(i10)).a == 5) {
            return 5;
        }
        if (((ao0) arrayList.get(i10)).a == 6) {
            return 6;
        }
        return ((ao0) arrayList.get(i10)).a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        arrayList.add(new ao0(0));
        org.telegram.ui.zx zxVar = this.b;
        if (zxVar.Q0 != 0) {
            return;
        }
        if (zxVar.n0) {
            arrayList.add(new ao0(5));
        }
        arrayList.add(new ao0(1));
        arrayList.add(new ao0(4));
        arrayList.add(new ao0(6));
        if (zxVar.L0) {
            return;
        }
        ao0 ao0Var = new ao0(3);
        ao0Var.b = 0;
        arrayList.add(ao0Var);
        org.telegram.ui.lx lxVar = zxVar.X0.C3;
        if (lxVar == null || !lxVar.c()) {
            arrayList.add(new ao0(2));
        }
        ao0 ao0Var2 = new ao0(3);
        ao0Var2.b = 1;
        arrayList.add(ao0Var2);
        ao0 ao0Var3 = new ao0(3);
        ao0Var3.b = 2;
        arrayList.add(ao0Var3);
        ao0 ao0Var4 = new ao0(3);
        ao0Var4.b = 3;
        arrayList.add(ao0Var4);
        ao0 ao0Var5 = new ao0(3);
        ao0Var5.b = 4;
        arrayList.add(ao0Var5);
    }
}
