package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class lu extends org.telegram.ui.Components.e71 {
    public final /* synthetic */ ou a;

    public lu(ou ouVar) {
        this.a = ouVar;
    }

    @Override // org.telegram.ui.Components.e71
    public final void b(View view, int i9, int i10) {
        ku kuVar = (ku) view;
        kuVar.U2 = i9;
        kuVar.b3.clear();
        kuVar.i3 = kuVar.w1(6) + kuVar.y1(6) <= 0;
        kuVar.z1();
        kuVar.A1(false);
        kuVar.u0(0);
    }

    @Override // org.telegram.ui.Components.e71
    public final View d(int i9) {
        ou ouVar = this.a;
        return new ku(ouVar, ouVar.getParentActivity());
    }

    @Override // org.telegram.ui.Components.e71
    public final int e() {
        return 4;
    }

    @Override // org.telegram.ui.Components.e71
    public final CharSequence g(int i9) {
        return i9 != 0 ? i9 != 1 ? i9 != 2 ? i9 != 3 ? "" : LocaleController.getString(R.string.NetworkUsageRoamingTab) : LocaleController.getString(R.string.NetworkUsageWiFiTab) : LocaleController.getString(R.string.NetworkUsageMobileTab) : LocaleController.getString(R.string.NetworkUsageAllTab);
    }
}
