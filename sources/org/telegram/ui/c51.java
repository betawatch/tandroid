package org.telegram.ui;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class c51 extends org.telegram.ui.Components.g71 {
    public final /* synthetic */ SecretMediaViewer m0;

    public c51(SecretMediaViewer secretMediaViewer) {
        this.m0 = secretMediaViewer;
    }

    @Override // org.telegram.ui.Components.g71
    public final void B() {
        super.B();
        this.m0.W.a(false, true);
    }

    @Override // org.telegram.ui.Components.g71
    public final void C() {
        super.C();
        this.m0.W.a(true, true);
    }

    @Override // org.telegram.ui.Components.g71
    public final void P(boolean z10) {
        super.P(z10);
        this.m0.W.a(z10, true);
    }
}
