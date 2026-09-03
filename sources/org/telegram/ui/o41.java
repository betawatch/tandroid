package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class o41 extends org.telegram.ui.Components.j71 {
    public final /* synthetic */ SecretMediaViewer j0;

    public o41(SecretMediaViewer secretMediaViewer) {
        this.j0 = secretMediaViewer;
    }

    @Override // org.telegram.ui.Components.j71
    public final void B() {
        super.B();
        this.j0.T.a(false, true);
    }

    @Override // org.telegram.ui.Components.j71
    public final void C() {
        super.C();
        this.j0.T.a(true, true);
    }

    @Override // org.telegram.ui.Components.j71
    public final void P(boolean z4) {
        super.P(z4);
        this.j0.T.a(z4, true);
    }
}
