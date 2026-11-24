// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.z;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class aa8 extends tc1 {
    public final Path t1;
    public final /* synthetic */ PhotoViewer u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa8(PhotoViewer photoViewer, Context context, z zVar, ela elaVar, FrameLayout frameLayout, ylb ylbVar, sm0 sm0Var, n88 n88Var) {
        super(context, zVar, elaVar, frameLayout, ylbVar, sm0Var, n88Var);
        this.u1 = photoViewer;
        this.t1 = new Path();
    }

    @Override // tc1
    public final void A() {
        Drawable[] drawableArr = PhotoViewer.d9;
        this.u1.v2();
    }

    @Override // tc1
    public final void B() {
        z();
        ba8 ba8Var = this.u1.W1;
        if (ba8Var != null) {
            ba8Var.z();
        }
    }

    @Override // tc1
    public final boolean G() {
        pb8 pb8Var = this.u1.d;
        return pb8Var != null && pb8Var.l();
    }

    public final void I() {
        PhotoViewer photoViewer = this.u1;
        pb8 pb8Var = photoViewer.d;
        D(pb8Var != null && pb8Var.l() && (photoViewer.V1.M.c() || !(photoViewer.s1 || TextUtils.isEmpty(photoViewer.d0().getText()))), true);
    }

    @Override // pc1
    public final boolean e() {
        PhotoViewer photoViewer = this.u1;
        u31 u31Var = photoViewer.s7;
        if (u31Var == null || u31.x != u31Var) {
            return photoViewer.c2(photoViewer.f0);
        }
        return false;
    }

    @Override // pc1
    public final void h(wm0 wm0Var, Canvas canvas, RectF rectF, float f, boolean z, float f2, float f3, boolean z2) {
        canvas.save();
        Path path = this.t1;
        path.rewind();
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.u1;
        if (z2) {
            canvas.translate(((-getX()) - photoViewer.Y1.getX()) + f2, ((-getY()) - photoViewer.Y1.getY()) + f3);
        } else {
            canvas.translate(f2, f3);
        }
        int p1 = cmb.p1(1.0f, z ? -8882056 : -14277082);
        int p12 = cmb.p1(1.0f, z2 ? z ? 0 : 855638016 : 1140850688);
        boolean z3 = false;
        boolean z4 = !z;
        if (!z && z2) {
            z3 = true;
        }
        photoViewer.P(canvas, wm0Var, p1, p12, false, z4, z3);
        canvas.restore();
    }

    @Override // android.view.View
    public final void invalidate() {
        byte b;
        if (gda.Z && ((b = this.u1.m4) == 1 || b == 2 || b == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override // pc1
    public final boolean l(float f, float f2) {
        return (this.p0 || this.u1.t4 == 0) ? false : true;
    }

    @Override // tc1, pc1
    public final void setText(CharSequence charSequence) {
        super.setText(charSequence);
        I();
    }

    @Override // tc1, pc1
    public final void u(float f) {
        super.u(f);
        PhotoViewer photoViewer = this.u1;
        c7 c7Var = photoViewer.f1;
        float f2 = 1.0f - f;
        c7Var.setAlpha((c7Var.getTag() != null ? 1 : 0) * f2);
        o96 o96Var = photoViewer.g1;
        o96Var.setAlpha((o96Var.getTag() != null ? 1 : 0) * f2);
        FrameLayout frameLayout = photoViewer.W7;
        frameLayout.setAlpha(f2 * (frameLayout.getTag() != null ? 1 : 0));
    }

    @Override // pc1
    public final void w() {
        this.N.getAdapter().c = false;
        this.N.getAdapter().d = false;
        this.N.getAdapter().e = false;
        PhotoViewer photoViewer = this.u1;
        yv1 yv1Var = photoViewer.k4;
        lc1 lc1Var = this.N;
        if (yv1Var != null) {
            lc1Var.getAdapter().n0 = false;
            this.N.getAdapter().V(photoViewer.k4.r8);
            this.N.getAdapter().f0 = photoViewer.k4.e != null;
        } else {
            lc1Var.getAdapter().n0 = true;
            this.N.getAdapter().V(null);
            this.N.getAdapter().f0 = false;
        }
        this.N.getAdapter().g0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // tc1, pc1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(int i) {
        float f;
        PhotoViewer photoViewer = this.u1;
        super.x(i - photoViewer.t2.bottom);
        u31 u31Var = u31.x;
        if (u31Var != null) {
            u31Var.l();
        }
        I();
        FrameLayout frameLayout = photoViewer.S0;
        boolean z = false;
        if (frameLayout != null) {
            frameLayout.animate().translationY(-Math.max(0, (i - r1.bottom) - photoViewer.Q0.getHeight())).setDuration(250L).setInterpolator(gb.w).start();
        }
        ViewPropertyAnimator animate = photoViewer.G.animate();
        if (photoViewer.K) {
            tc1 d0 = photoViewer.d0();
            ba8 ba8Var = photoViewer.W1;
            if (d0 != ba8Var || !ba8Var.M.c()) {
                f = 1.0f;
                animate.alpha(f).start();
                if (photoViewer.Q0.getVisibility() != 0) {
                    if (photoViewer.K) {
                        tc1 d02 = photoViewer.d0();
                        ba8 ba8Var2 = photoViewer.W1;
                        if (d02 != ba8Var2 || !ba8Var2.M.c()) {
                            z = true;
                        }
                    }
                    photoViewer.z2(z);
                    return;
                }
                return;
            }
        }
        f = 0.0f;
        animate.alpha(f).start();
        if (photoViewer.Q0.getVisibility() != 0) {
        }
    }

    @Override // pc1
    public final void y() {
        lc1 lc1Var = this.N;
        if (lc1Var != null) {
            lc1Var.setTranslationY(((-getEditTextHeight()) - gm.L(14.0f)) - this.M.l);
        }
    }
}
