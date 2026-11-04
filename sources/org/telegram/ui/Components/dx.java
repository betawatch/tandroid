package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class dx implements sx {
    public final /* synthetic */ ex a;

    public dx(ex exVar) {
        this.a = exVar;
    }

    @Override // org.telegram.ui.Components.sx
    public final void d() {
        ex exVar = this.a;
        if (exVar.G.W.G) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        exVar.G.W.e(true);
        ex.E(exVar, new cl(18, this, arrayList), arrayList, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.w;
        cl clVar = new cl(17, this, str);
        if (org.telegram.messenger.i6.d(str)) {
            xu0.G3.c(org.telegram.messenger.h10.t0, str, new ei(2, linkedHashSet, clVar));
        } else {
            clVar.run();
        }
    }
}
