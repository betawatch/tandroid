package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class w implements aw {
    private final k8.q a;
    private final k8.q b;
    private final k8.q c;
    private final k8.q d;
    private final k8.q e;
    private final k8.q f;

    public w(Context context, v vVar) {
        bc bcVar;
        o oVar;
        o oVar2;
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        k8.o oVar3 = new k8.o(context);
        this.a = oVar3;
        bcVar = bb.a;
        k8.m b10 = k8.m.b(bcVar);
        this.b = b10;
        oVar = n.a;
        au auVar = new au(oVar3, oVar);
        this.c = auVar;
        oVar2 = n.a;
        k8.m b11 = k8.m.b(new bp(oVar3, b10, auVar, oVar2));
        this.d = b11;
        k8.m b12 = k8.m.b(new bu(b11));
        this.e = b12;
        this.f = k8.m.b(new ba(b11, b12));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f.a();
    }
}
