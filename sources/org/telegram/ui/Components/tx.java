package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class tx implements jy {
    public final /* synthetic */ ux a;

    public tx(ux uxVar) {
        this.a = uxVar;
    }

    @Override // org.telegram.ui.Components.jy
    public final void e() {
        ux uxVar = this.a;
        if (uxVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        uxVar.F.V.e(true);
        ux.E(uxVar, new at(7, this, arrayList), arrayList, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.w;
        at atVar = new at(6, this, str);
        if (org.telegram.messenger.k6.d(str)) {
            cw0.F3.c(org.telegram.messenger.e20.s0, str, new vg(6, linkedHashSet, atVar));
        } else {
            atVar.run();
        }
    }
}
