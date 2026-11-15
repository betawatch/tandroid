package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class kx implements zx {
    public final /* synthetic */ lx a;

    public kx(lx lxVar) {
        this.a = lxVar;
    }

    @Override // org.telegram.ui.Components.zx
    public final void e() {
        lx lxVar = this.a;
        if (lxVar.G.W.G) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        lxVar.G.W.e(true);
        lx.E(lxVar, new vs(7, this, arrayList), arrayList, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.w;
        vs vsVar = new vs(6, this, str);
        if (org.telegram.messenger.j6.d(str)) {
            av0.G3.c(org.telegram.messenger.m10.t0, str, new gh(3, linkedHashSet, vsVar));
        } else {
            vsVar.run();
        }
    }
}
