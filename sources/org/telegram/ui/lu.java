package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class lu extends org.telegram.ui.Components.d91 {
    public final /* synthetic */ ou a;

    public lu(ou ouVar) {
        this.a = ouVar;
    }

    @Override // org.telegram.ui.Components.d91
    public final void b(View view, int i10, int i11) {
        ku kuVar = (ku) view;
        kuVar.Z2 = i10;
        kuVar.g3.clear();
        kuVar.n3 = kuVar.C1(6) + kuVar.E1(6) <= 0;
        kuVar.F1();
        kuVar.G1(false);
        kuVar.u0(0);
    }

    @Override // org.telegram.ui.Components.d91
    public final View d(int i10) {
        ou ouVar = this.a;
        return new ku(ouVar, ouVar.getParentActivity());
    }

    @Override // org.telegram.ui.Components.d91
    public final int e() {
        return 4;
    }

    @Override // org.telegram.ui.Components.d91
    public final CharSequence g(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString(R.string.NetworkUsageRoamingTab) : LocaleController.getString(R.string.NetworkUsageWiFiTab) : LocaleController.getString(R.string.NetworkUsageMobileTab) : LocaleController.getString(R.string.NetworkUsageAllTab);
    }
}
