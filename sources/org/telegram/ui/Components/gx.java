package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class gx implements vx {
    public final /* synthetic */ hx a;

    public gx(hx hxVar) {
        this.a = hxVar;
    }

    @Override // org.telegram.ui.Components.vx
    public final void e() {
        hx hxVar = this.a;
        if (hxVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        hxVar.F.V.e(true);
        hx.E(hxVar, new fq(13, this, arrayList), arrayList, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.w;
        fq fqVar = new fq(12, this, str);
        if (org.telegram.messenger.i6.d(str)) {
            av0.F3.c(org.telegram.messenger.p10.s0, str, new org.telegram.messenger.voip.k(28, linkedHashSet, fqVar));
        } else {
            fqVar.run();
        }
    }
}
