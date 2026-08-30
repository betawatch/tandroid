package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
final class s {
    private final o8.p a;
    private final o8.p b;
    private final o8.p c;
    private final o8.p d;
    private final o8.p e;

    public s(Context context, r rVar) {
        ad adVar;
        m mVar;
        m mVar2;
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        b7.c cVar = new b7.c(context);
        this.a = cVar;
        adVar = ac.a;
        o8.m b10 = o8.m.b(adVar);
        this.b = b10;
        mVar = l.a;
        au auVar = new au(cVar, mVar);
        this.c = auVar;
        mVar2 = l.a;
        o8.m b11 = o8.m.b(new al(cVar, b10, auVar, mVar2));
        this.d = b11;
        this.e = o8.m.b(new ab(b11));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.e.a();
    }
}
