package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
            bw0.F3.c(org.telegram.messenger.d20.s0, str, new vg(6, linkedHashSet, atVar));
        } else {
            atVar.run();
        }
    }
}
