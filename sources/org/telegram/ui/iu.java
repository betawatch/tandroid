package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class iu extends org.telegram.ui.Components.m91 {
    public final /* synthetic */ lu a;

    public iu(lu luVar) {
        this.a = luVar;
    }

    @Override // org.telegram.ui.Components.m91
    public final void b(View view, int i10, int i11) {
        hu huVar = (hu) view;
        huVar.g3 = i10;
        huVar.n3.clear();
        huVar.u3 = huVar.C1(6) + huVar.E1(6) <= 0;
        huVar.F1();
        huVar.G1(false);
        huVar.v0(0);
    }

    @Override // org.telegram.ui.Components.m91
    public final View d(int i10) {
        lu luVar = this.a;
        hu huVar = new hu(luVar, luVar.getParentActivity());
        luVar.e.add(huVar);
        return huVar;
    }

    @Override // org.telegram.ui.Components.m91
    public final int e() {
        return 4;
    }

    @Override // org.telegram.ui.Components.m91
    public final CharSequence g(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString(R.string.NetworkUsageRoamingTab) : LocaleController.getString(R.string.NetworkUsageWiFiTab) : LocaleController.getString(R.string.NetworkUsageMobileTab) : LocaleController.getString(R.string.NetworkUsageAllTab);
    }
}
