package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
final class s {
    private final m8.q a;
    private final m8.q b;
    private final m8.q c;
    private final m8.q d;
    private final m8.q e;

    public s(Context context, r rVar) {
        ad adVar;
        m mVar;
        m mVar2;
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        m8.o oVar = new m8.o(context);
        this.a = oVar;
        adVar = ac.a;
        m8.m b10 = m8.m.b(adVar);
        this.b = b10;
        mVar = l.a;
        au auVar = new au(oVar, mVar);
        this.c = auVar;
        mVar2 = l.a;
        m8.m b11 = m8.m.b(new al(oVar, b10, auVar, mVar2));
        this.d = b11;
        this.e = m8.m.b(new ab(b11));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.e.a();
    }
}
