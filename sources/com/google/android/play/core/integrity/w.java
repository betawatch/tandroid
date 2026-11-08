package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
final class w implements aw {
    private final d9.q a;
    private final d9.q b;
    private final d9.q c;
    private final d9.q d;
    private final d9.q e;
    private final d9.q f;

    public w(Context context, v vVar) {
        bc bcVar;
        o oVar;
        o oVar2;
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        d9.o oVar3 = new d9.o(context);
        this.a = oVar3;
        bcVar = bb.a;
        d9.m b10 = d9.m.b(bcVar);
        this.b = b10;
        oVar = n.a;
        au auVar = new au(oVar3, oVar);
        this.c = auVar;
        oVar2 = n.a;
        d9.m b11 = d9.m.b(new bp(oVar3, b10, auVar, oVar2));
        this.d = b11;
        d9.m b12 = d9.m.b(new bu(b11));
        this.e = b12;
        this.f = d9.m.b(new ba(b11, b12));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f.a();
    }
}
