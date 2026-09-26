package org.telegram.ui;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class gt0 extends org.telegram.ui.Components.s71 {
    public final /* synthetic */ PhotoViewer m0;

    public gt0(PhotoViewer photoViewer) {
        this.m0 = photoViewer;
    }

    @Override // org.telegram.ui.Components.s71
    public final void B() {
        super.B();
        PhotoViewer photoViewer = this.m0;
        if (photoViewer.u4 == 0) {
            PhotoViewer.Y(photoViewer, false);
        }
        if (photoViewer.O8) {
            return;
        }
        b5.d.D(n());
        b5.d.x(false);
    }

    @Override // org.telegram.ui.Components.s71
    public final void C() {
        super.C();
        PhotoViewer photoViewer = this.m0;
        PhotoViewer.Y(photoViewer, true);
        if (photoViewer.O8) {
            return;
        }
        b5.d.D(n());
        b5.d.x(true);
    }

    @Override // org.telegram.ui.Components.s71
    public final void K(long j3) {
        L(j3, false);
        PhotoViewer photoViewer = this.m0;
        if (photoViewer.r1) {
            PhotoViewer.Z(photoViewer, j3);
        }
        if (photoViewer.O8) {
            return;
        }
        b5.d.D(j3);
    }

    @Override // org.telegram.ui.Components.s71
    public final void Q(float f7) {
        super.Q(f7);
        if (this.m0.O8) {
            return;
        }
        b5.d.z(f7);
    }

    @Override // org.telegram.ui.Components.s71, b2.z0
    public final void onRenderedFirstFrame() {
        b2.v0 h;
        super.onRenderedFirstFrame();
        PhotoViewer photoViewer = this.m0;
        boolean z10 = true;
        photoViewer.R = true;
        if (photoViewer.D2) {
            photoViewer.e0.invalidate();
        }
        photoViewer.y3();
        if (!b5.d.u() && !photoViewer.r) {
            z10 = false;
        }
        O(z10);
        if (photoViewer.O8) {
            return;
        }
        b5.d.D(n());
        i2.f0 f0Var = this.d;
        float f7 = 1.0f;
        if (f0Var != null && (h = f0Var.h()) != null) {
            f7 = h.a;
        }
        b5.d.z(f7);
    }
}
