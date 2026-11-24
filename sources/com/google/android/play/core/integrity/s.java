package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class s {
    private final v1d a;
    private final v1d b;
    private final v1d c;
    private final v1d d;
    private final v1d e;

    public s(Context context, r rVar) {
        ad adVar;
        m mVar;
        m mVar2;
        if (context == null) {
            gxc.d("instance cannot be null");
            throw null;
        }
        uk0 uk0Var = new uk0(context, 0);
        this.a = uk0Var;
        adVar = ac.a;
        r1d b = r1d.b(adVar);
        this.b = b;
        mVar = l.a;
        au auVar = new au(uk0Var, mVar);
        this.c = auVar;
        mVar2 = l.a;
        r1d b2 = r1d.b(new al(uk0Var, b, auVar, mVar2));
        this.d = b2;
        this.e = r1d.b(new ab(b2));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.e.a();
    }
}
