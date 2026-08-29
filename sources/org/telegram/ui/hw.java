package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hw extends org.telegram.ui.Components.us {
    public final /* synthetic */ ey E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw(ay ayVar, ey eyVar) {
        super(ayVar);
        this.E = eyVar;
    }

    @Override // f2.q1
    public final void y() {
        ey eyVar = this.E;
        if (eyVar.c.L0() == 0) {
            View m10 = eyVar.c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (eyVar.v == 2) {
                eyVar.v = 1;
            }
            mw mwVar = eyVar.n;
            if (mwVar != null) {
                mwVar.b();
            }
        }
    }
}
