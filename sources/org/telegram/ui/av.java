package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class av extends org.telegram.ui.Components.es {
    public final /* synthetic */ vw E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av(sw swVar, vw vwVar) {
        super(swVar);
        this.E = vwVar;
    }

    @Override // v4.f1
    public final void y() {
        vw vwVar = this.E;
        if (vwVar.c.L0() == 0) {
            View m10 = vwVar.c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (vwVar.w == 2) {
                vwVar.w = 1;
            }
            fv fvVar = vwVar.n;
            if (fvVar != null) {
                fvVar.b();
            }
        }
    }
}
