package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
final class s {
    private final uzc a;
    private final uzc b;
    private final uzc c;
    private final uzc d;
    private final uzc e;

    public s(Context context, r rVar) {
        ad adVar;
        m mVar;
        m mVar2;
        if (context == null) {
            fvc.f("instance cannot be null");
            throw null;
        }
        uj0 uj0Var = new uj0(context, (char) 0);
        this.a = uj0Var;
        adVar = ac.a;
        qzc b = qzc.b(adVar);
        this.b = b;
        mVar = l.a;
        au auVar = new au(uj0Var, mVar);
        this.c = auVar;
        mVar2 = l.a;
        qzc b2 = qzc.b(new al(uj0Var, b, auVar, mVar2));
        this.d = b2;
        this.e = qzc.b(new ab(b2));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.e.a();
    }
}
