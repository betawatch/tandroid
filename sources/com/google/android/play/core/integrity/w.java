package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class w implements aw {
    private final v1d a;
    private final v1d b;
    private final v1d c;
    private final v1d d;
    private final v1d e;
    private final v1d f;

    public w(Context context, v vVar) {
        bc bcVar;
        o oVar;
        o oVar2;
        if (context == null) {
            gxc.d("instance cannot be null");
            throw null;
        }
        uk0 uk0Var = new uk0(context, 0);
        this.a = uk0Var;
        bcVar = bb.a;
        r1d b = r1d.b(bcVar);
        this.b = b;
        oVar = n.a;
        au auVar = new au(uk0Var, oVar);
        this.c = auVar;
        oVar2 = n.a;
        r1d b2 = r1d.b(new bp(uk0Var, b, auVar, oVar2));
        this.d = b2;
        r1d b3 = r1d.b(new bu(b2));
        this.e = b3;
        this.f = r1d.b(new ba(b2, b3));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f.a();
    }
}
