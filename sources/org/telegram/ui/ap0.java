package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ap0 extends org.telegram.ui.Components.uc {
    public final Path s1;
    public final /* synthetic */ PhotoViewer t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap0(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, vq0 vq0Var, org.telegram.ui.Components.rt0 rt0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.y9 y9Var, cn0 cn0Var) {
        super(contextThemeWrapper, vq0Var, rt0Var, frameLayout, f6Var, y9Var, cn0Var);
        this.t1 = photoViewer;
        this.s1 = new Path();
    }

    @Override // org.telegram.ui.Components.uc
    public final void A() {
        PhotoViewer.O(this.t1);
    }

    @Override // org.telegram.ui.Components.uc
    public final void B() {
        z();
        zo0 zo0Var = this.t1.U1;
        if (zo0Var != null) {
            zo0Var.z();
        }
    }

    @Override // org.telegram.ui.Components.uc
    public final boolean G() {
        uq0 uq0Var = this.t1.d;
        return uq0Var != null && uq0Var.l();
    }

    @Override // fi.m
    public final boolean e() {
        PhotoViewer photoViewer = this.t1;
        org.telegram.ui.Components.cc ccVar = photoViewer.m7;
        if (ccVar == null || org.telegram.ui.Components.cc.w != ccVar) {
            return photoViewer.Q2(photoViewer.e0);
        }
        return false;
    }

    @Override // fi.m
    public final boolean g() {
        return true;
    }

    @Override // fi.m
    public final void h(org.telegram.ui.Components.ca caVar, Canvas canvas, RectF rectF, float f10, boolean z9, float f11, float f12, boolean z10) {
        canvas.save();
        Path path = this.s1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.t1;
        if (z10) {
            canvas.translate(((-getX()) - photoViewer.Y1.getX()) + f11, ((-getY()) - photoViewer.Y1.getY()) + f12);
        } else {
            canvas.translate(f11, f12);
        }
        photoViewer.N0(canvas, caVar, org.telegram.ui.ActionBar.k6.r1(1.0f, z9 ? -8882056 : -14277082), org.telegram.ui.ActionBar.k6.r1(1.0f, z10 ? z9 ? 0 : 855638016 : 1140850688), false, !z9, !z9 && z10);
        canvas.restore();
    }

    @Override // android.view.View
    public final void invalidate() {
        int i7;
        if (org.telegram.messenger.iz.c0 && ((i7 = this.t1.m4) == 1 || i7 == 2 || i7 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override // fi.m
    public final boolean l(float f10, float f11) {
        return (this.o0 || this.t1.t4 == 0) ? false : true;
    }

    @Override // fi.m
    public final void w() {
        this.M.setReversed(true);
        this.M.getAdapter().c = false;
        this.M.getAdapter().d = false;
        this.M.getAdapter().e = false;
        PhotoViewer photoViewer = this.t1;
        if (photoViewer.k4 != null) {
            this.M.getAdapter().m0 = false;
            this.M.getAdapter().W(photoViewer.k4.p8);
            this.M.getAdapter().e0 = photoViewer.k4.e != null;
        } else {
            this.M.getAdapter().m0 = true;
            this.M.getAdapter().W(null);
            this.M.getAdapter().e0 = false;
        }
        this.M.getAdapter().f0 = false;
        this.M.setLayoutParams(c8.ha.e(-1, -1, 51));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.uc, fi.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(int i7) {
        float f10;
        boolean z9;
        PhotoViewer photoViewer = this.t1;
        super.x(i7 - photoViewer.s2.bottom);
        ViewPropertyAnimator animate = photoViewer.F.animate();
        if (photoViewer.J) {
            org.telegram.ui.Components.uc a12 = photoViewer.a1();
            ap0 ap0Var = photoViewer.V1;
            if (a12 != ap0Var || !ap0Var.L.c()) {
                f10 = 1.0f;
                animate.alpha(f10).start();
                if (photoViewer.P0.getVisibility() != 0) {
                    if (photoViewer.J) {
                        org.telegram.ui.Components.uc a13 = photoViewer.a1();
                        ap0 ap0Var2 = photoViewer.V1;
                        if (a13 != ap0Var2 || !ap0Var2.L.c()) {
                            z9 = true;
                            photoViewer.l3(z9);
                            return;
                        }
                    }
                    z9 = false;
                    photoViewer.l3(z9);
                    return;
                }
                return;
            }
        }
        f10 = 0.0f;
        animate.alpha(f10).start();
        if (photoViewer.P0.getVisibility() != 0) {
        }
    }

    @Override // fi.m
    public final void y() {
        fi.i iVar = this.M;
        if (iVar != null) {
            iVar.setTranslationY(getEditTextHeight());
        }
    }
}
