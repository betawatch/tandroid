package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class h41 extends org.telegram.ui.Components.i71 {
    public final /* synthetic */ SecretMediaViewer j0;

    public h41(SecretMediaViewer secretMediaViewer) {
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
