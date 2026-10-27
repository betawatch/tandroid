package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class dt0 extends org.telegram.ui.Components.t81 {
    public final /* synthetic */ PhotoViewer m0;

    public dt0(PhotoViewer photoViewer) {
        this.m0 = photoViewer;
    }

    @Override // org.telegram.ui.Components.t81
    public final void B() {
        super.B();
        PhotoViewer photoViewer = this.m0;
        if (photoViewer.u4 == 0) {
            PhotoViewer.Z(photoViewer, false);
        }
        if (photoViewer.O8) {
            return;
        }
        c5.d.D(n());
        c5.d.x(false);
    }

    @Override // org.telegram.ui.Components.t81
    public final void C() {
        super.C();
        PhotoViewer photoViewer = this.m0;
        PhotoViewer.Z(photoViewer, true);
        if (photoViewer.O8) {
            return;
        }
        c5.d.D(n());
        c5.d.x(true);
    }

    @Override // org.telegram.ui.Components.t81
    public final void K(long j10) {
        L(j10, false);
        PhotoViewer photoViewer = this.m0;
        if (photoViewer.r1) {
            PhotoViewer.a0(photoViewer, j10);
        }
        if (photoViewer.O8) {
            return;
        }
        c5.d.D(j10);
    }

    @Override // org.telegram.ui.Components.t81
    public final void Q(float f7) {
        super.Q(f7);
        if (this.m0.O8) {
            return;
        }
        c5.d.z(f7);
    }

    @Override // org.telegram.ui.Components.t81, b2.e1
    public final void onRenderedFirstFrame() {
        b2.a1 h;
        super.onRenderedFirstFrame();
        PhotoViewer photoViewer = this.m0;
        boolean z10 = true;
        photoViewer.R = true;
        if (photoViewer.D2) {
            photoViewer.e0.invalidate();
        }
        photoViewer.C3();
        if (!c5.d.u() && !photoViewer.r) {
            z10 = false;
        }
        O(z10);
        if (photoViewer.O8) {
            return;
        }
        c5.d.D(n());
        i2.j0 j0Var = this.d;
        float f7 = 1.0f;
        if (j0Var != null && (h = j0Var.h()) != null) {
            f7 = h.a;
        }
        c5.d.z(f7);
    }
}
