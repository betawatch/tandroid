package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class fx implements ux {
    public final /* synthetic */ gx a;

    public fx(gx gxVar) {
        this.a = gxVar;
    }

    @Override // org.telegram.ui.Components.ux
    public final void e() {
        gx gxVar = this.a;
        if (gxVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        gxVar.F.V.e(true);
        gx.E(gxVar, new ro(14, this, arrayList), arrayList, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.w;
        ro roVar = new ro(13, this, str);
        if (org.telegram.messenger.i6.d(str)) {
            zu0.F3.c(org.telegram.messenger.p10.s0, str, new org.telegram.messenger.voip.k(28, linkedHashSet, roVar));
        } else {
            roVar.run();
        }
    }
}
