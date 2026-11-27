package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class w implements aw {
    private final l4d a;
    private final l4d b;
    private final l4d c;
    private final l4d d;
    private final l4d e;
    private final l4d f;

    public w(Context context, v vVar) {
        bc bcVar;
        o oVar;
        o oVar2;
        if (context == null) {
            p3d.h("instance cannot be null");
            throw null;
        }
        ej0 ej0Var = new ej0(context, (byte) 2);
        this.a = ej0Var;
        bcVar = bb.a;
        h4d b = h4d.b(bcVar);
        this.b = b;
        oVar = n.a;
        au auVar = new au(ej0Var, oVar);
        this.c = auVar;
        oVar2 = n.a;
        h4d b2 = h4d.b(new bp(ej0Var, b, auVar, oVar2));
        this.d = b2;
        h4d b3 = h4d.b(new bu(b2));
        this.e = b3;
        this.f = h4d.b(new ba(b2, b3));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f.a();
    }
}
