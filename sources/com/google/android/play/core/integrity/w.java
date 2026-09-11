package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
final class w implements aw {
    private final a9.s a;
    private final a9.s b;
    private final a9.s c;
    private final a9.s d;
    private final a9.s e;
    private final a9.s f;

    public w(Context context, v vVar) {
        bc bcVar;
        o oVar;
        o oVar2;
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        a4.m mVar = new a4.m(context, 1);
        this.a = mVar;
        bcVar = bb.a;
        a9.p b10 = a9.p.b(bcVar);
        this.b = b10;
        oVar = n.a;
        au auVar = new au(mVar, oVar);
        this.c = auVar;
        oVar2 = n.a;
        a9.p b11 = a9.p.b(new bp(mVar, b10, auVar, oVar2));
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
