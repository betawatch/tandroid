package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class rx implements hy {
    public final /* synthetic */ sx a;

    public rx(sx sxVar) {
        this.a = sxVar;
    }

    @Override // org.telegram.ui.Components.hy
    public final void e() {
        sx sxVar = this.a;
        if (sxVar.G.W.G) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        sxVar.G.W.e(true);
        sx.E(sxVar, new ou(5, this, arrayList), arrayList, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.w;
        ou ouVar = new ou(4, this, str);
        if (org.telegram.messenger.j6.d(str)) {
            lv0.G3.c(org.telegram.messenger.k10.t0, str, new rh(3, linkedHashSet, ouVar));
        } else {
            ouVar.run();
        }
    }
}
