package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class s {
    private final k8.q a;
    private final k8.q b;
    private final k8.q c;
    private final k8.q d;
    private final k8.q e;

    public s(Context context, r rVar) {
        ad adVar;
        m mVar;
        m mVar2;
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        k8.o oVar = new k8.o(context);
        this.a = oVar;
        adVar = ac.a;
        k8.m b10 = k8.m.b(adVar);
        this.b = b10;
        mVar = l.a;
        au auVar = new au(oVar, mVar);
        this.c = auVar;
        mVar2 = l.a;
        k8.m b11 = k8.m.b(new al(oVar, b10, auVar, mVar2));
        this.d = b11;
        this.e = k8.m.b(new ab(b11));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.e.a();
    }
}
