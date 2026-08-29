package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ks0 extends org.telegram.ui.Components.x61 {
    public final /* synthetic */ PhotoViewer i0;

    public ks0(PhotoViewer photoViewer) {
        this.i0 = photoViewer;
    }

    @Override // org.telegram.ui.Components.x61
    public final void C() {
        super.C();
        PhotoViewer photoViewer = this.i0;
        if (photoViewer.q4 == 0) {
            PhotoViewer.Y(photoViewer, false);
        }
        if (photoViewer.J8) {
            return;
        }
        d1.f.D(o());
        d1.f.x(false);
    }

    @Override // org.telegram.ui.Components.x61
    public final void D() {
        super.D();
        PhotoViewer photoViewer = this.i0;
        PhotoViewer.Y(photoViewer, true);
        if (photoViewer.J8) {
            return;
        }
        d1.f.D(o());
        d1.f.x(true);
    }

    @Override // org.telegram.ui.Components.x61
    public final void L(long j10) {
        M(j10, false);
        PhotoViewer photoViewer = this.i0;
        if (photoViewer.n1) {
            PhotoViewer.Z(photoViewer, j10);
        }
        if (photoViewer.J8) {
            return;
        }
        d1.f.D(j10);
    }

    @Override // org.telegram.ui.Components.x61
    public final void R(float f9) {
        super.R(f9);
        if (this.i0.J8) {
            return;
        }
        d1.f.z(f9);
    }

    @Override // org.telegram.ui.Components.x61, j3.a2
    public final void onRenderedFirstFrame() {
        j3.x1 playbackParameters;
        super.onRenderedFirstFrame();
        PhotoViewer photoViewer = this.i0;
        boolean z10 = true;
        photoViewer.N = true;
        if (photoViewer.z2) {
            photoViewer.a0.invalidate();
        }
        photoViewer.z3();
        if (!d1.f.u() && !photoViewer.r) {
            z10 = false;
        }
        P(z10);
        if (photoViewer.J8) {
            return;
        }
        d1.f.D(o());
        j3.k0 k0Var = this.d;
        float f9 = 1.0f;
        if (k0Var != null && (playbackParameters = k0Var.getPlaybackParameters()) != null) {
            f9 = playbackParameters.a;
        }
        d1.f.z(f9);
    }
}
