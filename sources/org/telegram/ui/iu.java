package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class iu extends org.telegram.ui.Components.v81 {
    public final /* synthetic */ lu a;

    public iu(lu luVar) {
        this.a = luVar;
    }

    @Override // org.telegram.ui.Components.v81
    public final void b(View view, int i10, int i11) {
        hu huVar = (hu) view;
        huVar.W2 = i10;
        huVar.d3.clear();
        huVar.k3 = huVar.x1(6) + huVar.z1(6) <= 0;
        huVar.A1();
        huVar.B1(false);
        huVar.u0(0);
    }

    @Override // org.telegram.ui.Components.v81
    public final View d(int i10) {
        lu luVar = this.a;
        return new hu(luVar, luVar.getParentActivity());
    }

    @Override // org.telegram.ui.Components.v81
    public final int e() {
        return 4;
    }

    @Override // org.telegram.ui.Components.v81
    public final CharSequence g(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString(R.string.NetworkUsageRoamingTab) : LocaleController.getString(R.string.NetworkUsageWiFiTab) : LocaleController.getString(R.string.NetworkUsageMobileTab) : LocaleController.getString(R.string.NetworkUsageAllTab);
    }
}
