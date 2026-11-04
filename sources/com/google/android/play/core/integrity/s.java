package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
final class s {
    private final c9.q a;
    private final c9.q b;
    private final c9.q c;
    private final c9.q d;
    private final c9.q e;

    public s(Context context, r rVar) {
        ad adVar;
        m mVar;
        m mVar2;
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        c9.o oVar = new c9.o(context);
        this.a = oVar;
        adVar = ac.a;
        c9.m b10 = c9.m.b(adVar);
        this.b = b10;
        mVar = l.a;
        au auVar = new au(oVar, mVar);
        this.c = auVar;
        mVar2 = l.a;
        c9.m b11 = c9.m.b(new al(oVar, b10, auVar, mVar2));
        this.d = b11;
        this.e = c9.m.b(new ab(b11));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.e.a();
    }
}
