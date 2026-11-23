package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ox implements ey {
    public final /* synthetic */ px a;

    public ox(px pxVar) {
        this.a = pxVar;
    }

    @Override // org.telegram.ui.Components.ey
    public final void e() {
        px pxVar = this.a;
        if (pxVar.G.W.G) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        pxVar.G.W.e(true);
        px.E(pxVar, new bt(7, this, arrayList), arrayList, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.w;
        bt btVar = new bt(6, this, str);
        if (org.telegram.messenger.j6.d(str)) {
            kv0.G3.c(org.telegram.messenger.i10.t0, str, new ph(4, linkedHashSet, btVar));
        } else {
            btVar.run();
        }
    }
}
