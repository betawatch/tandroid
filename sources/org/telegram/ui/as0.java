package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class as0 extends org.telegram.ui.Components.xc {
    public final Path p1;
    public final /* synthetic */ PhotoViewer q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as0(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, bu0 bu0Var, org.telegram.ui.Components.zu0 zu0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.z9 z9Var, hq0 hq0Var) {
        super(contextThemeWrapper, bu0Var, zu0Var, frameLayout, c6Var, z9Var, hq0Var);
        this.q1 = photoViewer;
        this.p1 = new Path();
    }

    @Override // org.telegram.ui.Components.xc
    public final void A() {
        PhotoViewer.W(this.q1);
    }

    @Override // org.telegram.ui.Components.xc
    public final void B() {
        z();
        zr0 zr0Var = this.q1.Q1;
        if (zr0Var != null) {
            zr0Var.z();
        }
    }

    @Override // org.telegram.ui.Components.xc
    public final boolean G() {
        au0 au0Var = this.q1.d;
        return au0Var != null && au0Var.l();
    }

    @Override // lh.m
    public final boolean e() {
        PhotoViewer photoViewer = this.q1;
        org.telegram.ui.Components.ec ecVar = photoViewer.j7;
        if (ecVar == null || org.telegram.ui.Components.ec.w != ecVar) {
            return photoViewer.T2(photoViewer.a0);
        }
        return false;
    }

    @Override // lh.m
    public final boolean g() {
        return true;
    }

    @Override // lh.m
    public final void h(org.telegram.ui.Components.da daVar, Canvas canvas, RectF rectF, float f10, boolean z10, float f11, float f12, boolean z11) {
        canvas.save();
        Path path = this.p1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.q1;
        if (z11) {
            canvas.translate(((-getX()) - photoViewer.U1.getX()) + f11, ((-getY()) - photoViewer.U1.getY()) + f12);
        } else {
            canvas.translate(f11, f12);
        }
        photoViewer.T0(canvas, daVar, org.telegram.ui.ActionBar.g6.l1(1.0f, z10 ? -8882056 : -14277082), org.telegram.ui.ActionBar.g6.l1(1.0f, z11 ? z10 ? 0 : 855638016 : 1140850688), false, !z10, !z10 && z11);
        canvas.restore();
    }

    @Override // android.view.View
    public final void invalidate() {
        int i10;
        if (SharedConfig.photoViewerBlur && ((i10 = this.q1.j4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override // lh.m
    public final boolean l(float f10, float f11) {
        return (this.l0 || this.q1.q4 == 0) ? false : true;
    }

    @Override // lh.m
    public final void w() {
        this.I.setReversed(true);
        this.I.getAdapter().c = false;
        this.I.getAdapter().d = false;
        this.I.getAdapter().e = false;
        PhotoViewer photoViewer = this.q1;
        if (photoViewer.h4 != null) {
            this.I.getAdapter().i0 = false;
            this.I.getAdapter().W(photoViewer.h4.V7);
            this.I.getAdapter().a0 = photoViewer.h4.e != null;
        } else {
            this.I.getAdapter().i0 = true;
            this.I.getAdapter().W(null);
            this.I.getAdapter().a0 = false;
        }
        this.I.getAdapter().b0 = false;
        this.I.setLayoutParams(h7.z5.e(-1, -1, 51));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.xc, lh.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(int i10) {
        float f10;
        boolean z10;
        PhotoViewer photoViewer = this.q1;
        super.x(i10 - photoViewer.o2.bottom);
        ViewPropertyAnimator animate = photoViewer.B.animate();
        if (photoViewer.F) {
            org.telegram.ui.Components.xc f12 = photoViewer.f1();
            as0 as0Var = photoViewer.R1;
            if (f12 != as0Var || !as0Var.H.c()) {
                f10 = 1.0f;
                animate.alpha(f10).start();
                if (photoViewer.L0.getVisibility() != 0) {
                    if (photoViewer.F) {
                        org.telegram.ui.Components.xc f13 = photoViewer.f1();
                        as0 as0Var2 = photoViewer.R1;
                        if (f13 != as0Var2 || !as0Var2.H.c()) {
                            z10 = true;
                            photoViewer.o3(z10);
                            return;
                        }
                    }
                    z10 = false;
                    photoViewer.o3(z10);
                    return;
                }
                return;
            }
        }
        f10 = 0.0f;
        animate.alpha(f10).start();
        if (photoViewer.L0.getVisibility() != 0) {
        }
    }

    @Override // lh.m
    public final void y() {
        lh.i iVar = this.I;
        if (iVar != null) {
            iVar.setTranslationY(getEditTextHeight());
        }
    }
}
