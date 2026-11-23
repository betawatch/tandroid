package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public abstract class mu extends au implements y5 {
    public static Paint p0;
    public static ColorMatrixColorFilter q0;
    public final boolean X;
    public final ImageReceiver Y;
    public final ImageReceiver Z;
    public Bitmap a0;
    public RadialProgress2 b0;
    public int c0;
    public int d0;
    public boolean e0;
    public final int f0;
    public int g0;
    public boolean h0;
    public boolean i0;
    public int j0;
    public int k0;
    public final int l0;
    public boolean m0;
    public final Path n0;
    public final av o0;

    public mu(fv fvVar, Rect rect, int i7, boolean z10) {
        super(fvVar, rect, i7);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.Y = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.Z = imageReceiver2;
        this.g0 = -1;
        this.l0 = g0.L(48.0f);
        this.n0 = new Path();
        this.o0 = new av();
        this.X = z10;
        this.f0 = a6.q(fvVar.a).k();
        imageReceiver.A1 = true;
        imageReceiver2.A1 = true;
        imageReceiver.h1 = new hi.w4(this, 25);
    }

    @Override // org.telegram.messenger.au
    public final void A(int i7, Rect rect) {
        Rect rect2 = this.b;
        int i10 = rect2.left;
        int i11 = (this.a.C - i10) - rect2.right;
        int i12 = this.c0;
        int i13 = (i11 > i12 ? (i11 - i12) / 2 : 0) + i10;
        int i14 = ((int) this.N) + rect2.top;
        rect.set(i13, i14, i12 + i13, this.d0 + i14);
    }

    @Override // org.telegram.messenger.au
    public final int B() {
        return 1;
    }

    @Override // org.telegram.messenger.y5
    public final void C(boolean z10) {
        t0(false);
    }

    @Override // org.telegram.messenger.au
    public final CharSequence E(int i7) {
        String N0 = hd.N0(q0() ? 2131753930 : 2131753945, null);
        return (!r0() || this.o0.b()) ? N0 : TextUtils.concat(N0, ", ", hd.N0(2131745019, null));
    }

    @Override // org.telegram.messenger.au
    public final int I() {
        Rect rect = this.b;
        return rect.top + this.d0 + rect.bottom;
    }

    @Override // org.telegram.messenger.au
    public final int J() {
        return K();
    }

    @Override // org.telegram.messenger.au
    public final int K() {
        Rect rect = this.b;
        return rect.left + this.c0 + rect.right;
    }

    @Override // org.telegram.messenger.y5
    public final void N(String str) {
        RadialProgress2 radialProgress2 = this.b0;
        if (radialProgress2 != null) {
            radialProgress2.p(true, 1.0f);
        }
        if (p0() && (i0() || this.m0)) {
            j0(true);
        }
        t0(true);
    }

    @Override // org.telegram.messenger.au
    public final void T() {
        View view = this.W;
        ImageReceiver imageReceiver = this.Y;
        imageReceiver.H0(view);
        imageReceiver.P();
        View view2 = this.W;
        ImageReceiver imageReceiver2 = this.Z;
        imageReceiver2.H0(view2);
        imageReceiver2.P();
        t0(false);
    }

    @Override // org.telegram.messenger.au
    public final boolean U(int i7, View view) {
        if (r0()) {
            av avVar = this.o0;
            if (!avVar.b && avVar.f == null) {
                ImageReceiver imageReceiver = this.Y;
                float f10 = imageReceiver.N0;
                float f11 = imageReceiver.O0;
                avVar.c(this.W, imageReceiver.L0 + (f10 / 2.0f), (f11 / 2.0f) + imageReceiver.M0, f10, f11);
                return true;
            }
        }
        fv fvVar = this.a;
        org.telegram.ui.Cells.m1 m1Var = fvVar.F;
        if (m1Var == null) {
            return false;
        }
        m1Var.p2(fvVar.E, n0());
        return true;
    }

    @Override // org.telegram.messenger.au
    public final void V() {
        this.Y.R();
        this.Z.R();
        this.a0 = null;
        a6.q(this.a.a).v(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.messenger.au
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(Canvas canvas) {
        ImageReceiver imageReceiver;
        ImageReceiver imageReceiver2;
        Canvas canvas2 = canvas;
        if (p0 == null) {
            Paint paint = new Paint(1);
            p0 = paint;
            paint.setColor(251658240);
        }
        fv fvVar = this.a;
        int i7 = fvVar.C;
        Rect rect = this.b;
        int i10 = (i7 - rect.left) - rect.right;
        boolean R = R();
        int L = g0.L(2.0f);
        int i11 = (R || fvVar.D()) ? 0 : fvVar.S - L;
        int i12 = (R || fvVar.D()) ? 0 : fvVar.T - L;
        boolean z10 = (fvVar.C - rect.left) - rect.right > this.c0;
        if (R) {
            canvas2.save();
            Path path = this.n0;
            path.rewind();
            path.addRoundRect(0.0f, 0.0f, i10, this.d0, g0.L(8.0f), g0.L(8.0f), Path.Direction.CW);
            canvas2.clipPath(path);
        }
        ImageReceiver imageReceiver3 = this.Y;
        if (imageReceiver3.I() && imageReceiver3.i1 == 1.0f) {
            imageReceiver = imageReceiver3;
        } else {
            imageReceiver = imageReceiver3;
            canvas2.drawRect(-i11, 0.0f, i10 + i12, this.d0, p0);
        }
        xh.e eVar = null;
        ImageReceiver imageReceiver4 = this.Z;
        if (z10) {
            s0();
            u0(imageReceiver4, false);
            imageReceiver2 = imageReceiver;
            u0(imageReceiver2, true);
            if (imageReceiver4.n() != null) {
                imageReceiver4.y0(-i11, 0.0f, i11 + i10 + i12, this.d0);
                imageReceiver4.setAlpha(imageReceiver2.i1);
                imageReceiver4.h(canvas2, null);
            }
            imageReceiver2.S0 = true;
            imageReceiver2.y0(0.0f, 0.0f, (fvVar.C - rect.left) - rect.right, this.d0);
        } else {
            imageReceiver2 = imageReceiver;
            u0(imageReceiver2, false);
            imageReceiver2.S0 = false;
            imageReceiver2.y0(-i11, 0.0f, i11 + i10 + i12, this.d0);
        }
        imageReceiver2.h(canvas2, null);
        if (r0()) {
            av avVar = this.o0;
            if (!avVar.b()) {
                if (!avVar.b()) {
                    s0();
                    float f10 = imageReceiver2.L0;
                    float f11 = imageReceiver2.M0;
                    float f12 = imageReceiver2.N0;
                    float f13 = imageReceiver2.O0;
                    if (f12 > 0.0f && f13 > 0.0f) {
                        canvas2.save();
                        canvas2.clipRect(f10, f11, f10 + f12, f11 + f13);
                        avVar.a(canvas2);
                        if (imageReceiver4.n() != null) {
                            u0(imageReceiver4, false);
                            imageReceiver4.y0(f10, f11, f12, f13);
                            imageReceiver4.setAlpha(imageReceiver2.i1);
                            imageReceiver4.h(canvas2, null);
                        }
                        View view = fvVar.Q;
                        if (view != null) {
                            xh.e eVar2 = fvVar.R;
                            if (eVar2 != null && eVar2.i) {
                                fvVar.R = null;
                            }
                            if (fvVar.R == null) {
                                fvVar.R = xh.e.e(view);
                            }
                            eVar = fvVar.R;
                        }
                        if (eVar != null) {
                            canvas2.translate(f10, f11);
                            eVar.c(canvas2, this.W, Math.round(f12), Math.round(f13), imageReceiver2.i1, false);
                            canvas2 = canvas2;
                        }
                        canvas2.restore();
                        View view2 = this.W;
                        if (view2 != null) {
                            view2.invalidate();
                        }
                    }
                }
                if (R) {
                    return;
                }
                canvas2.restore();
                return;
            }
        }
        RadialProgress2 radialProgress2 = this.b0;
        if (radialProgress2 != null && this.g0 != -1) {
            int i13 = (fvVar.C - rect.left) - rect.right;
            int i14 = this.c0;
            int i15 = (i13 > i14 ? (i13 - i14) / 2 : 0) + this.j0;
            int i16 = this.k0;
            int i17 = this.l0;
            radialProgress2.r(i15, i16, i15 + i17, i17 + i16);
            this.b0.draw(canvas2);
        }
        if (R) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    @Override // org.telegram.messenger.au
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Y(MotionEvent motionEvent) {
        boolean z10;
        org.telegram.ui.Cells.m1 m1Var;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        Rect rect = this.b;
        int i7 = rect.left;
        float f10 = x10 - i7;
        fv fvVar = this.a;
        float f11 = f10 - ((fvVar.C - i7) - rect.right > this.c0 ? (r5 - r3) / 2 : 0);
        float y10 = motionEvent.getY() - rect.top;
        boolean z11 = f11 >= 0.0f && f11 <= ((float) this.c0) && y10 >= 0.0f && y10 <= ((float) this.d0);
        int i10 = this.g0;
        if (i10 != -1) {
            if (f11 >= this.j0) {
                int i11 = this.l0;
                if (f11 <= r10 + i11) {
                    if (y10 >= this.k0 && y10 <= r1 + i11) {
                        z10 = true;
                        if (actionMasked != 0) {
                            if (!z11 || (!z10 && i10 != 0 && i10 != 2)) {
                                if (z11) {
                                    this.i0 = true;
                                    return true;
                                }
                            }
                            this.h0 = true;
                            View view = this.W;
                            if (view != null) {
                                view.invalidate();
                                return true;
                            }
                        }
                        if (actionMasked != 1) {
                            if (actionMasked != 3) {
                                return this.i0 || this.h0;
                            }
                            this.i0 = false;
                            this.h0 = false;
                            return false;
                        }
                        boolean z12 = this.h0;
                        ImageReceiver imageReceiver = this.Y;
                        if (!z12) {
                            if (this.i0) {
                                this.i0 = false;
                                if (z11) {
                                    View view2 = this.W;
                                    if (view2 != null) {
                                        view2.playSoundEffect(0);
                                    }
                                    if (r0()) {
                                        av avVar = this.o0;
                                        if (!avVar.b && avVar.f == null) {
                                            float f12 = imageReceiver.N0;
                                            float f13 = imageReceiver.O0;
                                            avVar.c(this.W, (f12 / 2.0f) + imageReceiver.L0, (f13 / 2.0f) + imageReceiver.M0, f12, f13);
                                            return true;
                                        }
                                    }
                                    org.telegram.ui.Cells.m1 m1Var2 = fvVar.F;
                                    if (m1Var2 != null) {
                                        m1Var2.p2(fvVar.E, n0());
                                        return true;
                                    }
                                }
                            }
                        }
                        this.h0 = false;
                        View view3 = this.W;
                        if (view3 != null) {
                            view3.playSoundEffect(0);
                            this.W.invalidate();
                        }
                        int i12 = this.g0;
                        if (i12 == 0) {
                            this.m0 = true;
                            RadialProgress2 radialProgress2 = this.b0;
                            if (radialProgress2 != null) {
                                radialProgress2.p(true, 0.0f);
                            }
                            j0(true);
                            this.g0 = 1;
                            RadialProgress2 radialProgress22 = this.b0;
                            if (radialProgress22 != null) {
                                radialProgress22.setIcon(3, true, true);
                            }
                            View view4 = this.W;
                            if (view4 != null) {
                                view4.invalidate();
                                return true;
                            }
                        } else if (i12 == 1) {
                            this.m0 = false;
                            imageReceiver.c();
                            this.g0 = 0;
                            RadialProgress2 radialProgress23 = this.b0;
                            if (radialProgress23 != null) {
                                radialProgress23.setIcon(2, false, true);
                            }
                            View view5 = this.W;
                            if (view5 != null) {
                                view5.invalidate();
                                return true;
                            }
                        } else if (i12 == 2) {
                            this.m0 = true;
                            imageReceiver.u0 = true;
                            j0(true);
                            imageReceiver.P0(false);
                            this.g0 = -1;
                            RadialProgress2 radialProgress24 = this.b0;
                            if (radialProgress24 != null) {
                                radialProgress24.setIcon(4, false, true);
                            }
                            View view6 = this.W;
                            if (view6 != null) {
                                view6.invalidate();
                                return true;
                            }
                        } else if (i12 == 3 && (m1Var = fvVar.F) != null) {
                            m1Var.p2(fvVar.E, n0());
                            return true;
                        }
                    }
                }
            }
        }
        z10 = false;
        if (actionMasked != 0) {
        }
    }

    @Override // org.telegram.messenger.y5
    public final int getObserverTag() {
        return this.f0;
    }

    @Override // org.telegram.messenger.y5
    public final void i(long j3, long j10) {
        RadialProgress2 radialProgress2 = this.b0;
        if (radialProgress2 != null) {
            radialProgress2.p(true, Math.min(1.0f, j10 <= 0 ? 0.0f : j3 / j10));
        }
        if (this.g0 != 1) {
            t0(true);
        }
    }

    public boolean i0() {
        return true;
    }

    public abstract void j0(boolean z10);

    public boolean k0() {
        return (a6.q(this.a.a).m() & 1) != 0;
    }

    public abstract boolean l0();

    public final void m0() {
        this.Y.y0(0.0f, 0.0f, this.c0, this.d0);
        int i7 = this.c0;
        int i10 = this.l0;
        this.j0 = (i7 - i10) / 2;
        this.k0 = (this.d0 - i10) / 2;
        boolean k02 = k0();
        this.e0 = k02;
        j0(k02 || l0());
    }

    public abstract TL_iv.PageBlock n0();

    public abstract String o0();

    public boolean p0() {
        return false;
    }

    public boolean q0() {
        return false;
    }

    public abstract boolean r0();

    public final void s0() {
        Bitmap n10;
        ImageReceiver imageReceiver = this.Z;
        Bitmap n11 = imageReceiver.n();
        ImageReceiver imageReceiver2 = this.Y;
        if ((n11 != null && imageReceiver2.m() != null) || (n10 = imageReceiver2.n()) == null || n10.isRecycled()) {
            return;
        }
        if (n10 != this.a0 || imageReceiver.n() == null) {
            this.a0 = n10;
            imageReceiver.v0(Utilities.D(n10, false));
            if (q0 == null) {
                ColorMatrix colorMatrix = new ColorMatrix();
                g0.n2(colorMatrix, 0.9f);
                g0.i(colorMatrix, 0.6f);
                q0 = new ColorMatrixColorFilter(colorMatrix);
            }
            imageReceiver.p1 = q0;
        }
    }

    public final void t0(boolean z10) {
        View view;
        View view2;
        RadialProgress2 radialProgress2 = this.b0;
        int i7 = this.l0;
        if (radialProgress2 == null && (view2 = this.W) != null) {
            RadialProgress2 radialProgress22 = new RadialProgress2(view2, null);
            this.b0 = radialProgress22;
            radialProgress22.d = -1;
            radialProgress22.setColors(1711276032, 2130706432, -1, -2500135);
            RadialProgress2 radialProgress23 = this.b0;
            int i10 = this.j0;
            int i11 = this.k0;
            radialProgress23.r(i10, i11, i10 + i7, i7 + i11);
        } else if (radialProgress2 != null && (view = this.W) != null) {
            radialProgress2.n(view);
            RadialProgress2 radialProgress24 = this.b0;
            int i12 = this.j0;
            int i13 = this.k0;
            radialProgress24.r(i12, i13, i12 + i7, i7 + i13);
        }
        String o02 = o0();
        if (TextUtils.isEmpty(o02)) {
            this.g0 = -1;
            RadialProgress2 radialProgress25 = this.b0;
            if (radialProgress25 != null) {
                radialProgress25.setIcon(4, false, false);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver = this.Y;
        org.telegram.ui.Components.c6 m10 = imageReceiver.m();
        boolean z11 = m10 != null && (m10.s() || imageReceiver.M());
        boolean l02 = l0();
        fv fvVar = this.a;
        if (l02 || (p0() && z11)) {
            a6.q(fvVar.a).v(this);
            if (q0() && !z11) {
                this.g0 = 3;
                RadialProgress2 radialProgress26 = this.b0;
                if (radialProgress26 != null) {
                    radialProgress26.setIcon(0, false, z10);
                }
            } else if (!p0() || z11 || i0() || this.m0) {
                this.g0 = -1;
                RadialProgress2 radialProgress27 = this.b0;
                if (radialProgress27 != null) {
                    radialProgress27.setIcon(4, false, z10);
                }
            } else {
                this.g0 = 2;
                RadialProgress2 radialProgress28 = this.b0;
                if (radialProgress28 != null) {
                    radialProgress28.setIcon(8, false, z10);
                }
            }
        } else {
            a6.q(fvVar.a).a(o02, null, this);
            if (this.e0 || this.m0 || w7.G(fvVar.a).S(o02)) {
                this.g0 = 1;
                Float w10 = fc.D().w(o02);
                r2 = w10 != null ? w10.floatValue() : 0.0f;
                RadialProgress2 radialProgress29 = this.b0;
                if (radialProgress29 != null) {
                    radialProgress29.setIcon(3, true, z10);
                }
            } else if (q0()) {
                this.g0 = 3;
                RadialProgress2 radialProgress210 = this.b0;
                if (radialProgress210 != null) {
                    radialProgress210.setIcon(0, true, z10);
                }
            } else {
                this.g0 = 0;
                RadialProgress2 radialProgress211 = this.b0;
                if (radialProgress211 != null) {
                    radialProgress211.setIcon(2, true, z10);
                }
            }
            RadialProgress2 radialProgress212 = this.b0;
            if (radialProgress212 != null) {
                radialProgress212.p(false, r2);
            }
        }
        View view3 = this.W;
        if (view3 != null) {
            view3.invalidate();
        }
    }

    public final void u0(ImageReceiver imageReceiver, boolean z10) {
        if (z10) {
            imageReceiver.J0(0);
            return;
        }
        int i7 = cz.Y0;
        int L = i7 > 2 ? g0.L(i7 - 2) : g0.L(i7);
        int min = Math.min(g0.L(3.0f), L);
        fv fvVar = this.a;
        if (fvVar.D()) {
            imageReceiver.J0(g0.L(12.0f));
            return;
        }
        boolean z11 = this.X;
        int i10 = (!z11 || fvVar.B() || (!fvVar.E() && fvVar.G())) ? min : L;
        if (!z11 || (fvVar.E() && fvVar.G())) {
            L = min;
        }
        imageReceiver.K0(i10, L, min, min);
    }

    @Override // org.telegram.messenger.y5
    public final void o(long j3, long j10) {
    }
}
