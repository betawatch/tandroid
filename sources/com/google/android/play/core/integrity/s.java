package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
final class s {
    private final a9.t a;
    private final a9.t b;
    private final a9.t c;
    private final a9.t d;
    private final a9.t e;

    public s(Context context, r rVar) {
        ad adVar;
        m mVar;
        m mVar2;
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        a9.r rVar2 = new a9.r(context);
        this.a = rVar2;
        adVar = ac.a;
        a9.p b10 = a9.p.b(adVar);
        this.b = b10;
        mVar = l.a;
        au auVar = new au(rVar2, mVar);
        this.c = auVar;
        mVar2 = l.a;
        a9.p b11 = a9.p.b(new al(rVar2, b10, auVar, mVar2));
        this.d = b11;
        this.e = a9.p.b(new ab(b11));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.e.a();
    }
}
