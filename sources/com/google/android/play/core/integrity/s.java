package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
final class s {
    private final b9.r a;
    private final b9.r b;
    private final b9.r c;
    private final b9.r d;
    private final b9.r e;

    public s(Context context, r rVar) {
        ad adVar;
        m mVar;
        m mVar2;
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        b9.p pVar = new b9.p(context);
        this.a = pVar;
        adVar = ac.a;
        b9.n b10 = b9.n.b(adVar);
        this.b = b10;
        mVar = l.a;
        au auVar = new au(pVar, mVar);
        this.c = auVar;
        mVar2 = l.a;
        b9.n b11 = b9.n.b(new al(pVar, b10, auVar, mVar2));
        this.d = b11;
        this.e = b9.n.b(new ab(b11));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.e.a();
    }
}
