package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ly0 implements my0 {
    public final /* synthetic */ org.telegram.messenger.video.a a;
    public final /* synthetic */ org.telegram.ui.Components.hc b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ di.i0 d;
    public final /* synthetic */ org.telegram.messenger.video.d e;

    public ly0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.hc hcVar, Context context, di.i0 i0Var, org.telegram.messenger.video.d dVar) {
        this.a = aVar;
        this.b = hcVar;
        this.c = context;
        this.d = i0Var;
        this.e = dVar;
    }

    @Override // org.telegram.ui.my0
    public final void a() {
        org.telegram.messenger.g0.i3(new iy0(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.my0
    public final void d() {
        org.telegram.messenger.g0.i3(new ax0(4, this.a, this.b), 200L);
    }

    @Override // org.telegram.ui.my0
    public final void g() {
        this.e.run();
    }
}
