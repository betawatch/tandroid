package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ku extends org.telegram.ui.Components.n91 {
    public final /* synthetic */ nu a;

    public ku(nu nuVar) {
        this.a = nuVar;
    }

    @Override // org.telegram.ui.Components.n91
    public final void b(View view, int i10, int i11) {
        ju juVar = (ju) view;
        juVar.g3 = i10;
        juVar.n3.clear();
        juVar.u3 = juVar.C1(6) + juVar.E1(6) <= 0;
        juVar.F1();
        juVar.G1(false);
        juVar.v0(0);
    }

    @Override // org.telegram.ui.Components.n91
    public final View d(int i10) {
        nu nuVar = this.a;
        ju juVar = new ju(nuVar, nuVar.getParentActivity());
        nuVar.e.add(juVar);
        return juVar;
    }

    @Override // org.telegram.ui.Components.n91
    public final int e() {
        return 4;
    }

    @Override // org.telegram.ui.Components.n91
    public final CharSequence g(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString(R.string.NetworkUsageRoamingTab) : LocaleController.getString(R.string.NetworkUsageWiFiTab) : LocaleController.getString(R.string.NetworkUsageMobileTab) : LocaleController.getString(R.string.NetworkUsageAllTab);
    }
}
