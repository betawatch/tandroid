package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class s {
    private final l4d a;
    private final l4d b;
    private final l4d c;
    private final l4d d;
    private final l4d e;

    public s(Context context, r rVar) {
        ad adVar;
        m mVar;
        m mVar2;
        if (context == null) {
            p3d.h("instance cannot be null");
            throw null;
        }
        ej0 ej0Var = new ej0(context, (byte) 2);
        this.a = ej0Var;
        adVar = ac.a;
        h4d b = h4d.b(adVar);
        this.b = b;
        mVar = l.a;
        au auVar = new au(ej0Var, mVar);
        this.c = auVar;
        mVar2 = l.a;
        h4d b2 = h4d.b(new al(ej0Var, b, auVar, mVar2));
        this.d = b2;
        this.e = h4d.b(new ab(b2));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.e.a();
    }
}
