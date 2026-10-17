package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class ku extends org.telegram.ui.Components.u81 {
    public final /* synthetic */ nu a;

    public ku(nu nuVar) {
        this.a = nuVar;
    }

    @Override // org.telegram.ui.Components.u81
    public final void b(View view, int i10, int i11) {
        ju juVar = (ju) view;
        juVar.W2 = i10;
        juVar.d3.clear();
        juVar.k3 = juVar.x1(6) + juVar.z1(6) <= 0;
        juVar.A1();
        juVar.B1(false);
        juVar.u0(0);
    }

    @Override // org.telegram.ui.Components.u81
    public final View d(int i10) {
        nu nuVar = this.a;
        return new ju(nuVar, nuVar.getParentActivity());
    }

    @Override // org.telegram.ui.Components.u81
    public final int e() {
        return 4;
    }

    @Override // org.telegram.ui.Components.u81
    public final CharSequence g(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString(R.string.NetworkUsageRoamingTab) : LocaleController.getString(R.string.NetworkUsageWiFiTab) : LocaleController.getString(R.string.NetworkUsageMobileTab) : LocaleController.getString(R.string.NetworkUsageAllTab);
    }
}
