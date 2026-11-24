package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class w implements aw {
    private final uzc a;
    private final uzc b;
    private final uzc c;
    private final uzc d;
    private final uzc e;
    private final uzc f;

    public w(Context context, v vVar) {
        bc bcVar;
        o oVar;
        o oVar2;
        if (context == null) {
            fvc.f("instance cannot be null");
            throw null;
        }
        uj0 uj0Var = new uj0(context, (char) 0);
        this.a = uj0Var;
        bcVar = bb.a;
        qzc b = qzc.b(bcVar);
        this.b = b;
        oVar = n.a;
        au auVar = new au(uj0Var, oVar);
        this.c = auVar;
        oVar2 = n.a;
        qzc b2 = qzc.b(new bp(uj0Var, b, auVar, oVar2));
        this.d = b2;
        qzc b3 = qzc.b(new bu(b2));
        this.e = b3;
        this.f = qzc.b(new ba(b2, b3));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f.a();
    }
}
