package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        e.a aVar = new e.a(context);
        this.a = aVar;
        adVar = ac.a;
        o8.m b10 = o8.m.b(adVar);
        this.b = b10;
        mVar = l.a;
        au auVar = new au(aVar, mVar);
        this.c = auVar;
        mVar2 = l.a;
        o8.m b11 = o8.m.b(new al(aVar, b10, auVar, mVar2));
        this.d = b11;
        this.e = o8.m.b(new ab(b11));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.e.a();
    }
}
