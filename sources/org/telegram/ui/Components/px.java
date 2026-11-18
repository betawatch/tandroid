package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class px implements fy {
    public final /* synthetic */ qx a;

    public px(qx qxVar) {
        this.a = qxVar;
    }

    @Override // org.telegram.ui.Components.fy
    public final void e() {
        qx qxVar = this.a;
        if (qxVar.G.W.G) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        qxVar.G.W.e(true);
        qx.E(qxVar, new dw(3, this, arrayList), arrayList, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.w;
        dw dwVar = new dw(2, this, str);
        if (org.telegram.messenger.j6.d(str)) {
            iv0.G3.c(org.telegram.messenger.j10.t0, str, new ph(3, linkedHashSet, dwVar));
        } else {
            dwVar.run();
        }
    }
}
