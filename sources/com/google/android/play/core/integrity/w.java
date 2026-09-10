package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
final class w implements aw {
    private final a9.t a;
    private final a9.t b;
    private final a9.t c;
    private final a9.t d;
    private final a9.t e;
    private final a9.t f;

    public w(Context context, v vVar) {
        bc bcVar;
        o oVar;
        o oVar2;
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        a9.r rVar = new a9.r(context);
        this.a = rVar;
        bcVar = bb.a;
        a9.p b10 = a9.p.b(bcVar);
        this.b = b10;
        oVar = n.a;
        au auVar = new au(rVar, oVar);
        this.c = auVar;
        oVar2 = n.a;
        a9.p b11 = a9.p.b(new bp(rVar, b10, auVar, oVar2));
        this.d = b11;
        a9.p b12 = a9.p.b(new bu(b11));
        this.e = b12;
        this.f = a9.p.b(new ba(b11, b12));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f.a();
    }
}
