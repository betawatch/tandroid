package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ls0 extends org.telegram.ui.Components.k61 {
    public final /* synthetic */ PhotoViewer i0;

    public ls0(PhotoViewer photoViewer) {
        this.i0 = photoViewer;
    }

    @Override // org.telegram.ui.Components.k61
    public final void C() {
        super.C();
        PhotoViewer photoViewer = this.i0;
        if (photoViewer.q4 == 0) {
            PhotoViewer.X(photoViewer, false);
        }
        if (photoViewer.J8) {
            return;
        }
        d1.f.C(o());
        d1.f.w(false);
    }

    @Override // org.telegram.ui.Components.k61
    public final void D() {
        super.D();
        PhotoViewer photoViewer = this.i0;
        PhotoViewer.X(photoViewer, true);
        if (photoViewer.J8) {
            return;
        }
        d1.f.C(o());
        d1.f.w(true);
    }

    @Override // org.telegram.ui.Components.k61
    public final void L(long j10) {
        M(j10, false);
        PhotoViewer photoViewer = this.i0;
        if (photoViewer.n1) {
            PhotoViewer.Y(photoViewer, j10);
        }
        if (photoViewer.J8) {
            return;
        }
        d1.f.C(j10);
    }

    @Override // org.telegram.ui.Components.k61
    public final void R(float f10) {
        super.R(f10);
        if (this.i0.J8) {
            return;
        }
        d1.f.y(f10);
    }

    @Override // org.telegram.ui.Components.k61, h3.a2
    public final void onRenderedFirstFrame() {
        h3.x1 playbackParameters;
        super.onRenderedFirstFrame();
        PhotoViewer photoViewer = this.i0;
        boolean z10 = true;
        photoViewer.N = true;
        if (photoViewer.z2) {
            photoViewer.a0.invalidate();
        }
        photoViewer.z3();
        if (!d1.f.t() && !photoViewer.r) {
            z10 = false;
        }
        P(z10);
        if (photoViewer.J8) {
            return;
        }
        d1.f.C(o());
        h3.k0 k0Var = this.d;
        float f10 = 1.0f;
        if (k0Var != null && (playbackParameters = k0Var.getPlaybackParameters()) != null) {
            f10 = playbackParameters.a;
        }
        d1.f.y(f10);
    }
}
