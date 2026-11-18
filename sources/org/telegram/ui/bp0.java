package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class bp0 extends org.telegram.ui.Components.yc {
    public final Path t1;
    public final /* synthetic */ PhotoViewer u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp0(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, vq0 vq0Var, org.telegram.ui.Components.au0 au0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.Components.ca caVar, hn0 hn0Var) {
        super(contextThemeWrapper, vq0Var, au0Var, frameLayout, i6Var, caVar, hn0Var);
        this.u1 = photoViewer;
        this.t1 = new Path();
    }

    @Override // org.telegram.ui.Components.yc
    public final void A() {
        PhotoViewer.P(this.u1);
    }

    @Override // org.telegram.ui.Components.yc
    public final void B() {
        z();
        ap0 ap0Var = this.u1.V1;
        if (ap0Var != null) {
            ap0Var.z();
        }
    }

    @Override // org.telegram.ui.Components.yc
    public final boolean G() {
        uq0 uq0Var = this.u1.d;
        return uq0Var != null && uq0Var.l();
    }

    @Override // hi.n
    public final boolean e() {
        PhotoViewer photoViewer = this.u1;
        org.telegram.ui.Components.gc gcVar = photoViewer.n7;
        if (gcVar == null || org.telegram.ui.Components.gc.w != gcVar) {
            return photoViewer.R2(photoViewer.f0);
        }
        return false;
    }

    @Override // hi.n
    public final boolean g() {
        return true;
    }

    @Override // hi.n
    public final void h(org.telegram.ui.Components.ga gaVar, Canvas canvas, RectF rectF, float f10, boolean z10, float f11, float f12, boolean z11) {
        canvas.save();
        Path path = this.t1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.u1;
        if (z11) {
            canvas.translate(((-getX()) - photoViewer.Z1.getX()) + f11, ((-getY()) - photoViewer.Z1.getY()) + f12);
        } else {
            canvas.translate(f11, f12);
        }
        photoViewer.N0(canvas, gaVar, org.telegram.ui.ActionBar.n6.r1(1.0f, z10 ? -8882056 : -14277082), org.telegram.ui.ActionBar.n6.r1(1.0f, z11 ? z10 ? 0 : 855638016 : 1140850688), false, !z10, !z10 && z11);
        canvas.restore();
    }

    @Override // android.view.View
    public final void invalidate() {
        int i7;
        if (org.telegram.messenger.bz.c0 && ((i7 = this.u1.n4) == 1 || i7 == 2 || i7 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override // hi.n
    public final boolean l(float f10, float f11) {
        return (this.p0 || this.u1.u4 == 0) ? false : true;
    }

    @Override // hi.n
    public final void w() {
        this.N.setReversed(true);
        this.N.getAdapter().c = false;
        this.N.getAdapter().d = false;
        this.N.getAdapter().e = false;
        PhotoViewer photoViewer = this.u1;
        if (photoViewer.l4 != null) {
            this.N.getAdapter().n0 = false;
            this.N.getAdapter().W(photoViewer.l4.r8);
            this.N.getAdapter().f0 = photoViewer.l4.e != null;
        } else {
            this.N.getAdapter().n0 = true;
            this.N.getAdapter().W(null);
            this.N.getAdapter().f0 = false;
        }
        this.N.getAdapter().g0 = false;
        this.N.setLayoutParams(c8.ma.e(-1, -1, 51));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.yc, hi.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(int i7) {
        float f10;
        boolean z10;
        PhotoViewer photoViewer = this.u1;
        super.x(i7 - photoViewer.t2.bottom);
        ViewPropertyAnimator animate = photoViewer.G.animate();
        if (photoViewer.K) {
            org.telegram.ui.Components.yc b12 = photoViewer.b1();
            bp0 bp0Var = photoViewer.W1;
            if (b12 != bp0Var || !bp0Var.M.c()) {
                f10 = 1.0f;
                animate.alpha(f10).start();
                if (photoViewer.Q0.getVisibility() != 0) {
                    if (photoViewer.K) {
                        org.telegram.ui.Components.yc b13 = photoViewer.b1();
                        bp0 bp0Var2 = photoViewer.W1;
                        if (b13 != bp0Var2 || !bp0Var2.M.c()) {
                            z10 = true;
                            photoViewer.m3(z10);
                            return;
                        }
                    }
                    z10 = false;
                    photoViewer.m3(z10);
                    return;
                }
                return;
            }
        }
        f10 = 0.0f;
        animate.alpha(f10).start();
        if (photoViewer.Q0.getVisibility() != 0) {
        }
    }

    @Override // hi.n
    public final void y() {
        hi.i iVar = this.N;
        if (iVar != null) {
            iVar.setTranslationY(getEditTextHeight());
        }
    }
}
