package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ky0 implements ly0 {
    public final /* synthetic */ org.telegram.messenger.video.a a;
    public final /* synthetic */ org.telegram.ui.Components.lc b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ fi.h0 d;
    public final /* synthetic */ org.telegram.messenger.video.d e;

    public ky0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.lc lcVar, Context context, fi.h0 h0Var, org.telegram.messenger.video.d dVar) {
        this.a = aVar;
        this.b = lcVar;
        this.c = context;
        this.d = h0Var;
        this.e = dVar;
    }

    @Override // org.telegram.ui.ly0
    public final void a() {
        org.telegram.messenger.g0.h3(new iy0(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.ly0
    public final void d() {
        org.telegram.messenger.g0.h3(new tr0(25, this.a, this.b), 200L);
    }

    @Override // org.telegram.ui.ly0
    public final void h() {
        this.e.run();
    }
}
