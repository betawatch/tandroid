package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class mu extends org.telegram.ui.Components.q71 {
    public final /* synthetic */ pu a;

    public mu(pu puVar) {
        this.a = puVar;
    }

    @Override // org.telegram.ui.Components.q71
    public final void b(View view, int i10, int i11) {
        lu luVar = (lu) view;
        luVar.U2 = i10;
        luVar.b3.clear();
        luVar.i3 = luVar.w1(6) + luVar.y1(6) <= 0;
        luVar.z1();
        luVar.A1(false);
        luVar.u0(0);
    }

    @Override // org.telegram.ui.Components.q71
    public final View d(int i10) {
        pu puVar = this.a;
        return new lu(puVar, puVar.getParentActivity());
    }

    @Override // org.telegram.ui.Components.q71
    public final int e() {
        return 4;
    }

    @Override // org.telegram.ui.Components.q71
    public final CharSequence g(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString(R.string.NetworkUsageRoamingTab) : LocaleController.getString(R.string.NetworkUsageWiFiTab) : LocaleController.getString(R.string.NetworkUsageMobileTab) : LocaleController.getString(R.string.NetworkUsageAllTab);
    }
}
