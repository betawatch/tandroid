package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
final class s {
    private final d9.q a;
    private final d9.q b;
    private final d9.q c;
    private final d9.q d;
    private final d9.q e;

    public s(Context context, r rVar) {
        ad adVar;
        m mVar;
        m mVar2;
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        d9.o oVar = new d9.o(context);
        this.a = oVar;
        adVar = ac.a;
        d9.m b10 = d9.m.b(adVar);
        this.b = b10;
        mVar = l.a;
        au auVar = new au(oVar, mVar);
        this.c = auVar;
        mVar2 = l.a;
        d9.m b11 = d9.m.b(new al(oVar, b10, auVar, mVar2));
        this.d = b11;
        this.e = d9.m.b(new ab(b11));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.e.a();
    }
}
