package org.telegram.ui;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class j41 extends org.telegram.ui.Components.k71 {
    public final /* synthetic */ SecretMediaViewer j0;

    public j41(SecretMediaViewer secretMediaViewer) {
        this.j0 = secretMediaViewer;
    }

    @Override // org.telegram.ui.Components.k71
    public final void B() {
        super.B();
        this.j0.T.a(false, true);
    }

    @Override // org.telegram.ui.Components.k71
    public final void C() {
        super.C();
        this.j0.T.a(true, true);
    }

    @Override // org.telegram.ui.Components.k71
    public final void P(boolean z4) {
        super.P(z4);
        this.j0.T.a(z4, true);
    }
}
