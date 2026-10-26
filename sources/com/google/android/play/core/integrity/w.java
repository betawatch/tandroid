package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
final class w implements aw {
    private final b9.r a;
    private final b9.r b;
    private final b9.r c;
    private final b9.r d;
    private final b9.r e;
    private final b9.r f;

    public w(Context context, v vVar) {
        bc bcVar;
        o oVar;
        o oVar2;
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        b9.p pVar = new b9.p(context);
        this.a = pVar;
        bcVar = bb.a;
        b9.n b10 = b9.n.b(bcVar);
        this.b = b10;
        oVar = n.a;
        au auVar = new au(pVar, oVar);
        this.c = auVar;
        oVar2 = n.a;
        b9.n b11 = b9.n.b(new bp(pVar, b10, auVar, oVar2));
        this.d = b11;
        b9.n b12 = b9.n.b(new bu(b11));
        this.e = b12;
        this.f = b9.n.b(new ba(b11, b12));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f.a();
    }
}
