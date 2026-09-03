package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        o2.i iVar = new o2.i(context, 2);
        this.a = iVar;
        adVar = ac.a;
        o8.m b10 = o8.m.b(adVar);
        this.b = b10;
        mVar = l.a;
        au auVar = new au(iVar, mVar);
        this.c = auVar;
        mVar2 = l.a;
        o8.m b11 = o8.m.b(new al(iVar, b10, auVar, mVar2));
        this.d = b11;
        this.e = o8.m.b(new ab(b11));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.e.a();
    }
}
