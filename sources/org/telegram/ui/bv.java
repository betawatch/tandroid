package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class bv extends org.telegram.ui.Components.c91 {
    public final /* synthetic */ ev a;

    public bv(ev evVar) {
        this.a = evVar;
    }

    @Override // org.telegram.ui.Components.c91
    public final void b(View view, int i10, int i11) {
        av avVar = (av) view;
        avVar.W2 = i10;
        avVar.d3.clear();
        avVar.k3 = avVar.x1(6) + avVar.z1(6) <= 0;
        avVar.A1();
        avVar.B1(false);
        avVar.u0(0);
    }

    @Override // org.telegram.ui.Components.c91
    public final View d(int i10) {
        ev evVar = this.a;
        return new av(evVar, evVar.getParentActivity());
    }

    @Override // org.telegram.ui.Components.c91
    public final int e() {
        return 4;
    }

    @Override // org.telegram.ui.Components.c91
    public final CharSequence g(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString(R.string.NetworkUsageRoamingTab) : LocaleController.getString(R.string.NetworkUsageWiFiTab) : LocaleController.getString(R.string.NetworkUsageMobileTab) : LocaleController.getString(R.string.NetworkUsageAllTab);
    }
}
