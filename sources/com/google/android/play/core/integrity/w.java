package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes.dex */
final class w implements aw {
    private final com.google.android.play.integrity.internal.bb a;
    private final com.google.android.play.integrity.internal.bb b;
    private final com.google.android.play.integrity.internal.bb c;
    private final com.google.android.play.integrity.internal.bb d;
    private final com.google.android.play.integrity.internal.bb e;
    private final com.google.android.play.integrity.internal.bb f;

    /* synthetic */ w(Context context, v vVar) {
        bc bcVar;
        o oVar;
        o oVar2;
        com.google.android.play.integrity.internal.ay b = com.google.android.play.integrity.internal.az.b(context);
        this.a = b;
        bcVar = bb.a;
        com.google.android.play.integrity.internal.bb b2 = com.google.android.play.integrity.internal.ax.b(bcVar);
        this.b = b2;
        oVar = n.a;
        au auVar = new au(b, oVar);
        this.c = auVar;
        oVar2 = n.a;
        com.google.android.play.integrity.internal.bb b3 = com.google.android.play.integrity.internal.ax.b(new bp(b, b2, auVar, oVar2));
        this.d = b3;
        com.google.android.play.integrity.internal.bb b4 = com.google.android.play.integrity.internal.ax.b(new bu(b3));
        this.e = b4;
        this.f = com.google.android.play.integrity.internal.ax.b(new ba(b3, b4));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f.a();
    }
}
