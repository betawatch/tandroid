package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        e.a aVar = new e.a(context);
        this.a = aVar;
        bcVar = bb.a;
        o8.m b10 = o8.m.b(bcVar);
        this.b = b10;
        oVar = n.a;
        au auVar = new au(aVar, oVar);
        this.c = auVar;
        oVar2 = n.a;
        o8.m b11 = o8.m.b(new bp(aVar, b10, auVar, oVar2));
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
