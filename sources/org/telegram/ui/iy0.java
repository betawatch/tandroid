package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class iy0 implements jy0 {
    public final /* synthetic */ org.telegram.messenger.video.a a;
    public final /* synthetic */ org.telegram.ui.Components.hc b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ di.i0 d;
    public final /* synthetic */ org.telegram.messenger.video.d e;

    public iy0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.hc hcVar, Context context, di.i0 i0Var, org.telegram.messenger.video.d dVar) {
        this.a = aVar;
        this.b = hcVar;
        this.c = context;
        this.d = i0Var;
        this.e = dVar;
    }

    @Override // org.telegram.ui.jy0
    public final void a() {
        org.telegram.messenger.g0.i3(new fy0(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.jy0
    public final void d() {
        org.telegram.messenger.g0.i3(new by0(3, this.a, this.b), 200L);
    }

    @Override // org.telegram.ui.jy0
    public final void g() {
        this.e.run();
    }
}
