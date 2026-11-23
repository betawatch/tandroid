package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class jy0 implements ky0 {
    public final /* synthetic */ org.telegram.messenger.video.a a;
    public final /* synthetic */ org.telegram.ui.Components.kc b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ fi.h0 d;
    public final /* synthetic */ org.telegram.messenger.video.d e;

    public jy0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.kc kcVar, Context context, fi.h0 h0Var, org.telegram.messenger.video.d dVar) {
        this.a = aVar;
        this.b = kcVar;
        this.c = context;
        this.d = h0Var;
        this.e = dVar;
    }

    @Override // org.telegram.ui.ky0
    public final void a() {
        org.telegram.messenger.g0.h3(new gy0(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.ky0
    public final void d() {
        org.telegram.messenger.g0.h3(new iy0(1, this.a, this.b), 200L);
    }

    @Override // org.telegram.ui.ky0
    public final void i() {
        this.e.run();
    }
}
