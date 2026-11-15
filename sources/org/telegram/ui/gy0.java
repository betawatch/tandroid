package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class gy0 implements hy0 {
    public final /* synthetic */ org.telegram.messenger.video.a a;
    public final /* synthetic */ org.telegram.ui.Components.cc b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ fi.i0 d;
    public final /* synthetic */ org.telegram.messenger.video.d e;

    public gy0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.cc ccVar, Context context, fi.i0 i0Var, org.telegram.messenger.video.d dVar) {
        this.a = aVar;
        this.b = ccVar;
        this.c = context;
        this.d = i0Var;
        this.e = dVar;
    }

    @Override // org.telegram.ui.hy0
    public final void a() {
        org.telegram.messenger.g0.i3(new dy0(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.hy0
    public final void d() {
        org.telegram.messenger.g0.i3(new fy0(0, this.a, this.b), 200L);
    }

    @Override // org.telegram.ui.hy0
    public final void g() {
        this.e.run();
    }
}
