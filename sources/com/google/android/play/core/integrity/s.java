package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
final class s {
    private final a9.s a;
    private final a9.s b;
    private final a9.s c;
    private final a9.s d;
    private final a9.s e;

    public s(Context context, r rVar) {
        ad adVar;
        m mVar;
        m mVar2;
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        a4.m mVar3 = new a4.m(context, 1);
        this.a = mVar3;
        adVar = ac.a;
        a9.p b10 = a9.p.b(adVar);
        this.b = b10;
        mVar = l.a;
        au auVar = new au(mVar3, mVar);
        this.c = auVar;
        mVar2 = l.a;
        a9.p b11 = a9.p.b(new al(mVar3, b10, auVar, mVar2));
        this.d = b11;
        this.e = a9.p.b(new ab(b11));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.e.a();
    }
}
