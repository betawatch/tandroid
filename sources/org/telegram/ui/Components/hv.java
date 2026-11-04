package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class hv implements View.OnFocusChangeListener {
    public final /* synthetic */ ey a;

    public hv(ey eyVar) {
        this.a = eyVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] G0 = org.telegram.messenger.g0.G0();
            ey eyVar = this.a;
            eyVar.X0 = G0;
            org.telegram.messenger.li.b0(eyVar.d1).M(eyVar.X0, false);
        }
    }
}
