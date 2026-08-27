package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ou extends org.telegram.ui.Components.g71 {
    public final /* synthetic */ ru a;

    public ou(ru ruVar) {
        this.a = ruVar;
    }

    @Override // org.telegram.ui.Components.g71
    public final void b(View view, int i10, int i11) {
        nu nuVar = (nu) view;
        nuVar.U2 = i10;
        nuVar.b3.clear();
        nuVar.i3 = nuVar.w1(6) + nuVar.y1(6) <= 0;
        nuVar.z1();
        nuVar.A1(false);
        nuVar.u0(0);
    }

    @Override // org.telegram.ui.Components.g71
    public final View d(int i10) {
        ru ruVar = this.a;
        return new nu(ruVar, ruVar.getParentActivity());
    }

    @Override // org.telegram.ui.Components.g71
    public final int e() {
        return 4;
    }

    @Override // org.telegram.ui.Components.g71
    public final CharSequence g(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString(R.string.NetworkUsageRoamingTab) : LocaleController.getString(R.string.NetworkUsageWiFiTab) : LocaleController.getString(R.string.NetworkUsageMobileTab) : LocaleController.getString(R.string.NetworkUsageAllTab);
    }
}
