package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class ko0 extends o81 {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ org.telegram.ui.ey b;

    public ko0(org.telegram.ui.ey eyVar) {
        this.b = eyVar;
        i();
    }

    @Override // org.telegram.ui.Components.o81
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.ey eyVar = this.b;
        eyVar.P(view, i10, eyVar.L0, true);
    }

    @Override // org.telegram.ui.Components.o81
    public final View d(int i10) {
        org.telegram.ui.ey eyVar = this.b;
        org.telegram.ui.uy uyVar = eyVar.K0;
        if (i10 == 1) {
            return eyVar.V;
        }
        if (i10 == 3) {
            return eyVar.g0;
        }
        if (i10 == 4) {
            return eyVar.l0;
        }
        if (i10 == 5) {
            return eyVar.s0;
        }
        if (i10 == 2) {
            jn0 jn0Var = new jn0(eyVar.I0, uyVar);
            eyVar.H0 = jn0Var;
            jn0Var.b(eyVar.V0, eyVar.W0, false);
            eyVar.H0.b.setClipToPadding(false);
            eyVar.H0.b.j(new io0(this, 0));
            eyVar.H0.b.D0(new kc0(eyVar, 23));
            eyVar.H0.setUiCallback(eyVar);
            return eyVar.H0;
        }
        if (i10 == 6) {
            return eyVar.q0;
        }
        org.telegram.ui.x10 x10Var = new org.telegram.ui.x10(uyVar);
        x10Var.setChatPreviewDelegate(eyVar.Q0);
        x10Var.setUiCallback(eyVar);
        x10Var.j(eyVar.V0, eyVar.W0, false);
        ah.c cVar = eyVar.Y0;
        if (cVar != null) {
            x10Var.setBlurredBackgroundDrawableFactory(cVar);
        }
        ai.w0 w0Var = x10Var.b;
        w0Var.setClipToPadding(false);
        w0Var.j(new io0(this, 1));
        w0Var.D0(new kc0(eyVar, 23));
        return x10Var;
    }

    @Override // org.telegram.ui.Components.o81
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.o81
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.a;
        if (((jo0) arrayList.get(i10)).a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((jo0) arrayList.get(i10)).a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((jo0) arrayList.get(i10)).a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((jo0) arrayList.get(i10)).a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((jo0) arrayList.get(i10)).a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((jo0) arrayList.get(i10)).a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        gg.q0 q0Var = gg.s0.c3[((jo0) arrayList.get(i10)).b];
        String str = q0Var.c;
        return str != null ? str : LocaleController.getString(q0Var.b);
    }

    @Override // org.telegram.ui.Components.o81
    public final int h(int i10) {
        ArrayList arrayList = this.a;
        if (((jo0) arrayList.get(i10)).a == 0) {
            return 1;
        }
        if (((jo0) arrayList.get(i10)).a == 1) {
            return 3;
        }
        if (((jo0) arrayList.get(i10)).a == 4) {
            return 4;
        }
        if (((jo0) arrayList.get(i10)).a == 2) {
            return 2;
        }
        if (((jo0) arrayList.get(i10)).a == 5) {
            return 5;
        }
        if (((jo0) arrayList.get(i10)).a == 6) {
            return 6;
        }
        return ((jo0) arrayList.get(i10)).a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        arrayList.add(new jo0(0));
        org.telegram.ui.ey eyVar = this.b;
        if (eyVar.U0 != 0) {
            return;
        }
        if (eyVar.r0) {
            arrayList.add(new jo0(5));
        }
        arrayList.add(new jo0(1));
        arrayList.add(new jo0(4));
        arrayList.add(new jo0(6));
        if (eyVar.P0) {
            return;
        }
        jo0 jo0Var = new jo0(3);
        jo0Var.b = 0;
        arrayList.add(jo0Var);
        org.telegram.ui.ox oxVar = eyVar.c1.F3;
        if (oxVar == null || !oxVar.c()) {
            arrayList.add(new jo0(2));
        }
        jo0 jo0Var2 = new jo0(3);
        jo0Var2.b = 1;
        arrayList.add(jo0Var2);
        jo0 jo0Var3 = new jo0(3);
        jo0Var3.b = 2;
        arrayList.add(jo0Var3);
        jo0 jo0Var4 = new jo0(3);
        jo0Var4.b = 3;
        arrayList.add(jo0Var4);
        jo0 jo0Var5 = new jo0(3);
        jo0Var5.b = 4;
        arrayList.add(jo0Var5);
    }
}
