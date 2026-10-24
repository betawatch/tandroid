package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class fw extends org.telegram.ui.Components.kt {
    public final /* synthetic */ dy E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw(zx zxVar, dy dyVar) {
        super(zxVar);
        this.E = dyVar;
    }

    @Override // s4.e1
    public final void y() {
        dy dyVar = this.E;
        if (dyVar.c.L0() == 0) {
            View m10 = dyVar.c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (dyVar.v == 2) {
                dyVar.v = 1;
            }
            kw kwVar = dyVar.n;
            if (kwVar != null) {
                kwVar.b();
            }
        }
    }
}
