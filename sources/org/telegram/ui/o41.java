package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class o41 extends org.telegram.ui.Components.i71 {
    public final /* synthetic */ SecretMediaViewer j0;

    public o41(SecretMediaViewer secretMediaViewer) {
        this.j0 = secretMediaViewer;
    }

    @Override // org.telegram.ui.Components.i71
    public final void B() {
        super.B();
        this.j0.T.a(false, true);
    }

    @Override // org.telegram.ui.Components.i71
    public final void C() {
        super.C();
        this.j0.T.a(true, true);
    }

    @Override // org.telegram.ui.Components.i71
    public final void P(boolean z4) {
        super.P(z4);
        this.j0.T.a(z4, true);
    }
}
