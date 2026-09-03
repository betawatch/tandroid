package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class at0 extends org.telegram.ui.Components.j71 {
    public final /* synthetic */ PhotoViewer j0;

    public at0(PhotoViewer photoViewer) {
        this.j0 = photoViewer;
    }

    @Override // org.telegram.ui.Components.j71
    public final void B() {
        super.B();
        PhotoViewer photoViewer = this.j0;
        if (photoViewer.r4 == 0) {
            PhotoViewer.Y(photoViewer, false);
        }
        if (photoViewer.K8) {
            return;
        }
        d1.f.D(n());
        d1.f.x(false);
    }

    @Override // org.telegram.ui.Components.j71
    public final void C() {
        super.C();
        PhotoViewer photoViewer = this.j0;
        PhotoViewer.Y(photoViewer, true);
        if (photoViewer.K8) {
            return;
        }
        d1.f.D(n());
        d1.f.x(true);
    }

    @Override // org.telegram.ui.Components.j71
    public final void K(long j10) {
        L(j10, false);
        PhotoViewer photoViewer = this.j0;
        if (photoViewer.o1) {
            PhotoViewer.Z(photoViewer, j10);
        }
        if (photoViewer.K8) {
            return;
        }
        d1.f.D(j10);
    }

    @Override // org.telegram.ui.Components.j71
    public final void Q(float f10) {
        super.Q(f10);
        if (this.j0.K8) {
            return;
        }
        d1.f.z(f10);
    }

    @Override // org.telegram.ui.Components.j71, j3.y1
    public final void onRenderedFirstFrame() {
        j3.v1 d;
        super.onRenderedFirstFrame();
        PhotoViewer photoViewer = this.j0;
        boolean z4 = true;
        photoViewer.O = true;
        if (photoViewer.A2) {
            photoViewer.b0.invalidate();
        }
        photoViewer.z3();
        if (!d1.f.u() && !photoViewer.r) {
            z4 = false;
        }
        O(z4);
        if (photoViewer.K8) {
            return;
        }
        d1.f.D(n());
        j3.f0 f0Var = this.d;
        float f10 = 1.0f;
        if (f0Var != null && (d = f0Var.d()) != null) {
            f10 = d.a;
        }
        d1.f.z(f10);
    }
}
