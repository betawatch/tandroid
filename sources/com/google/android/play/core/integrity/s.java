package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
final class s {
    private final l8.p a;
    private final l8.p b;
    private final l8.p c;
    private final l8.p d;
    private final l8.p e;

    public s(Context context, r rVar) {
        ad adVar;
        m mVar;
        m mVar2;
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        l3.b bVar = new l3.b(context);
        this.a = bVar;
        adVar = ac.a;
        l8.m b10 = l8.m.b(adVar);
        this.b = b10;
        mVar = l.a;
        au auVar = new au(bVar, mVar);
        this.c = auVar;
        mVar2 = l.a;
        l8.m b11 = l8.m.b(new al(bVar, b10, auVar, mVar2));
        this.d = b11;
        this.e = l8.m.b(new ab(b11));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.e.a();
    }
}
