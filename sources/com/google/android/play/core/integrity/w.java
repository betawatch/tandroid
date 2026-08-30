package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
final class w implements aw {
    private final o8.p a;
    private final o8.p b;
    private final o8.p c;
    private final o8.p d;
    private final o8.p e;
    private final o8.p f;

    public w(Context context, v vVar) {
        bc bcVar;
        o oVar;
        o oVar2;
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        b7.c cVar = new b7.c(context);
        this.a = cVar;
        bcVar = bb.a;
        o8.m b10 = o8.m.b(bcVar);
        this.b = b10;
        oVar = n.a;
        au auVar = new au(cVar, oVar);
        this.c = auVar;
        oVar2 = n.a;
        o8.m b11 = o8.m.b(new bp(cVar, b10, auVar, oVar2));
        this.d = b11;
        o8.m b12 = o8.m.b(new bu(b11));
        this.e = b12;
        this.f = o8.m.b(new ba(b11, b12));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f.a();
    }
}
