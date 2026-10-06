package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class po0 extends y81 {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ org.telegram.ui.dy b;

    public po0(org.telegram.ui.dy dyVar) {
        this.b = dyVar;
        i();
    }

    @Override // org.telegram.ui.Components.y81
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.dy dyVar = this.b;
        dyVar.Q(view, i10, dyVar.M0, true);
    }

    @Override // org.telegram.ui.Components.y81
    public final View d(int i10) {
        org.telegram.ui.dy dyVar = this.b;
        org.telegram.ui.uy uyVar = dyVar.L0;
        if (i10 == 1) {
            return dyVar.W;
        }
        if (i10 == 3) {
            return dyVar.h0;
        }
        if (i10 == 4) {
            return dyVar.m0;
        }
        if (i10 == 5) {
            return dyVar.t0;
        }
        if (i10 == 2) {
            on0 on0Var = new on0(dyVar.J0, uyVar);
            dyVar.I0 = on0Var;
            on0Var.b(dyVar.W0, dyVar.X0, false);
            dyVar.I0.b.setClipToPadding(false);
            dyVar.I0.b.j(new no0(this, 0));
            dyVar.I0.b.D0(new lc0(dyVar, 24));
            dyVar.I0.setUiCallback(dyVar);
            return dyVar.I0;
        }
        if (i10 == 6) {
            return dyVar.r0;
        }
        org.telegram.ui.x10 x10Var = new org.telegram.ui.x10(uyVar);
        x10Var.setChatPreviewDelegate(dyVar.R0);
        x10Var.setUiCallback(dyVar);
        x10Var.j(dyVar.W0, dyVar.X0, false);
        ah.c cVar = dyVar.Z0;
        if (cVar != null) {
            x10Var.setBlurredBackgroundDrawableFactory(cVar);
        }
        ai.w0 w0Var = x10Var.b;
        w0Var.setClipToPadding(false);
        w0Var.j(new no0(this, 1));
        w0Var.D0(new lc0(dyVar, 24));
        return x10Var;
    }

    @Override // org.telegram.ui.Components.y81
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.y81
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.a;
        if (((oo0) arrayList.get(i10)).a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((oo0) arrayList.get(i10)).a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((oo0) arrayList.get(i10)).a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((oo0) arrayList.get(i10)).a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((oo0) arrayList.get(i10)).a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((oo0) arrayList.get(i10)).a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        gg.q0 q0Var = gg.s0.j3[((oo0) arrayList.get(i10)).b];
        String str = q0Var.c;
        return str != null ? str : LocaleController.getString(q0Var.b);
    }

    @Override // org.telegram.ui.Components.y81
    public final int h(int i10) {
        ArrayList arrayList = this.a;
        if (((oo0) arrayList.get(i10)).a == 0) {
            return 1;
        }
        if (((oo0) arrayList.get(i10)).a == 1) {
            return 3;
        }
        if (((oo0) arrayList.get(i10)).a == 4) {
            return 4;
        }
        if (((oo0) arrayList.get(i10)).a == 2) {
            return 2;
        }
        if (((oo0) arrayList.get(i10)).a == 5) {
            return 5;
        }
        if (((oo0) arrayList.get(i10)).a == 6) {
            return 6;
        }
        return ((oo0) arrayList.get(i10)).a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        arrayList.add(new oo0(0));
        org.telegram.ui.dy dyVar = this.b;
        if (dyVar.V0 != 0) {
            return;
        }
        if (dyVar.s0) {
            arrayList.add(new oo0(5));
        }
        arrayList.add(new oo0(1));
        arrayList.add(new oo0(4));
        arrayList.add(new oo0(6));
        if (dyVar.Q0) {
            return;
        }
        oo0 oo0Var = new oo0(3);
        oo0Var.b = 0;
        arrayList.add(oo0Var);
        org.telegram.ui.mx mxVar = dyVar.d1.F3;
        if (mxVar == null || !mxVar.c()) {
            arrayList.add(new oo0(2));
        }
        oo0 oo0Var2 = new oo0(3);
        oo0Var2.b = 1;
        arrayList.add(oo0Var2);
        oo0 oo0Var3 = new oo0(3);
        oo0Var3.b = 2;
        arrayList.add(oo0Var3);
        oo0 oo0Var4 = new oo0(3);
        oo0Var4.b = 3;
        arrayList.add(oo0Var4);
        oo0 oo0Var5 = new oo0(3);
        oo0Var5.b = 4;
        arrayList.add(oo0Var5);
    }
}
