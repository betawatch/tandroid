package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
        gx.E(gxVar, new fq(13, this, arrayList), arrayList, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.w;
        fq fqVar = new fq(12, this, str);
        if (org.telegram.messenger.i6.d(str)) {
            yu0.F3.c(org.telegram.messenger.p10.s0, str, new org.telegram.messenger.voip.k(28, linkedHashSet, fqVar));
        } else {
            fqVar.run();
        }
    }
}
