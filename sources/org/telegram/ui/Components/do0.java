package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class do0 implements gb {
    public final /* synthetic */ ec a;
    public final /* synthetic */ re b;

    public do0(re reVar, ec ecVar) {
        this.b = reVar;
        this.a = ecVar;
    }

    @Override // org.telegram.ui.Components.gb
    public final void c() {
        this.b.G.remove(this.a);
    }

    @Override // org.telegram.ui.Components.gb
    public final void d() {
        this.b.G.add(this.a);
    }

    @Override // org.telegram.ui.Components.gb
    public final /* synthetic */ void a(ec ecVar) {
    }

    @Override // org.telegram.ui.Components.gb
    public final /* synthetic */ void b() {
    }
}
