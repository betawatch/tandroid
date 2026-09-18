package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class c51 extends org.telegram.ui.Components.h71 {
    public final /* synthetic */ SecretMediaViewer m0;

    public c51(SecretMediaViewer secretMediaViewer) {
        this.m0 = secretMediaViewer;
    }

    @Override // org.telegram.ui.Components.h71
    public final void B() {
        super.B();
        this.m0.W.a(false, true);
    }

    @Override // org.telegram.ui.Components.h71
    public final void C() {
        super.C();
        this.m0.W.a(true, true);
    }

    @Override // org.telegram.ui.Components.h71
    public final void P(boolean z10) {
        super.P(z10);
        this.m0.W.a(z10, true);
    }
}
