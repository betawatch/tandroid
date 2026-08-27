package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
final class w implements aw {
    private final l8.p a;
    private final l8.p b;
    private final l8.p c;
    private final l8.p d;
    private final l8.p e;
    private final l8.p f;

    public w(Context context, v vVar) {
        bc bcVar;
        o oVar;
        o oVar2;
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        l3.b bVar = new l3.b(context);
        this.a = bVar;
        bcVar = bb.a;
        l8.m b10 = l8.m.b(bcVar);
        this.b = b10;
        oVar = n.a;
        au auVar = new au(bVar, oVar);
        this.c = auVar;
        oVar2 = n.a;
        l8.m b11 = l8.m.b(new bp(bVar, b10, auVar, oVar2));
        this.d = b11;
        l8.m b12 = l8.m.b(new bu(b11));
        this.e = b12;
        this.f = l8.m.b(new ba(b11, b12));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f.a();
    }
}
