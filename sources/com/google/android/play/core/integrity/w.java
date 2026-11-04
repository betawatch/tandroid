package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
final class w implements aw {
    private final c9.q a;
    private final c9.q b;
    private final c9.q c;
    private final c9.q d;
    private final c9.q e;
    private final c9.q f;

    public w(Context context, v vVar) {
        bc bcVar;
        o oVar;
        o oVar2;
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        c9.o oVar3 = new c9.o(context);
        this.a = oVar3;
        bcVar = bb.a;
        c9.m b10 = c9.m.b(bcVar);
        this.b = b10;
        oVar = n.a;
        au auVar = new au(oVar3, oVar);
        this.c = auVar;
        oVar2 = n.a;
        c9.m b11 = c9.m.b(new bp(oVar3, b10, auVar, oVar2));
        this.d = b11;
        c9.m b12 = c9.m.b(new bu(b11));
        this.e = b12;
        this.f = c9.m.b(new ba(b11, b12));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f.a();
    }
}
