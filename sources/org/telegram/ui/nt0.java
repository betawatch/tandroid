package org.telegram.ui;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class nt0 extends org.telegram.ui.Components.g71 {
    public final /* synthetic */ PhotoViewer m0;

    public nt0(PhotoViewer photoViewer) {
        this.m0 = photoViewer;
    }

    @Override // org.telegram.ui.Components.g71
    public final void B() {
        super.B();
        PhotoViewer photoViewer = this.m0;
        if (photoViewer.u4 == 0) {
            PhotoViewer.Y(photoViewer, false);
        }
        if (photoViewer.N8) {
            return;
        }
        b5.d.D(n());
        b5.d.x(false);
    }

    @Override // org.telegram.ui.Components.g71
    public final void C() {
        super.C();
        PhotoViewer photoViewer = this.m0;
        PhotoViewer.Y(photoViewer, true);
        if (photoViewer.N8) {
            return;
        }
        b5.d.D(n());
        b5.d.x(true);
    }

    @Override // org.telegram.ui.Components.g71
    public final void K(long j3) {
        L(j3, false);
        PhotoViewer photoViewer = this.m0;
        if (photoViewer.r1) {
            PhotoViewer.Z(photoViewer, j3);
        }
        if (photoViewer.N8) {
            return;
        }
        b5.d.D(j3);
    }

    @Override // org.telegram.ui.Components.g71
    public final void Q(float f7) {
        super.Q(f7);
        if (this.m0.N8) {
            return;
        }
        b5.d.z(f7);
    }

    @Override // org.telegram.ui.Components.g71, b2.z0
    public final void onRenderedFirstFrame() {
        b2.v0 h;
        super.onRenderedFirstFrame();
        PhotoViewer photoViewer = this.m0;
        boolean z10 = true;
        photoViewer.R = true;
        if (photoViewer.D2) {
            photoViewer.e0.invalidate();
        }
        photoViewer.z3();
        if (!b5.d.u() && !photoViewer.r) {
            z10 = false;
        }
        O(z10);
        if (photoViewer.N8) {
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
