package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
