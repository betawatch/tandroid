package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
final class w implements aw {
    private final m8.q a;
    private final m8.q b;
    private final m8.q c;
    private final m8.q d;
    private final m8.q e;
    private final m8.q f;

    public w(Context context, v vVar) {
        bc bcVar;
        o oVar;
        o oVar2;
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        m8.o oVar3 = new m8.o(context);
        this.a = oVar3;
        bcVar = bb.a;
        m8.m b10 = m8.m.b(bcVar);
        this.b = b10;
        oVar = n.a;
        au auVar = new au(oVar3, oVar);
        this.c = auVar;
        oVar2 = n.a;
        m8.m b11 = m8.m.b(new bp(oVar3, b10, auVar, oVar2));
        this.d = b11;
        m8.m b12 = m8.m.b(new bu(b11));
        this.e = b12;
        this.f = m8.m.b(new ba(b11, b12));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f.a();
    }
}
