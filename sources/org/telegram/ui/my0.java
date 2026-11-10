package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class my0 implements ny0 {
    public final /* synthetic */ org.telegram.messenger.video.a a;
    public final /* synthetic */ org.telegram.ui.Components.gc b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ di.i0 d;
    public final /* synthetic */ org.telegram.messenger.video.d e;

    public my0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.gc gcVar, Context context, di.i0 i0Var, org.telegram.messenger.video.d dVar) {
        this.a = aVar;
        this.b = gcVar;
        this.c = context;
        this.d = i0Var;
        this.e = dVar;
    }

    @Override // org.telegram.ui.ny0
    public final void a() {
        org.telegram.messenger.g0.i3(new jy0(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.ny0
    public final void d() {
        org.telegram.messenger.g0.i3(new rw0(5, this.a, this.b), 200L);
    }

    @Override // org.telegram.ui.ny0
    public final void g() {
        this.e.run();
    }
}
