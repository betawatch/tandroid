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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class cv extends qu implements z5 {
    public static Paint o0;
    public static ColorMatrixColorFilter p0;
    public final boolean W;
    public final ImageReceiver X;
    public final ImageReceiver Y;
    public Bitmap Z;
    public RadialProgress2 a0;
    public int b0;
    public int c0;
    public boolean d0;
    public final int e0;
    public int f0;
    public boolean g0;
    public boolean h0;
    public int i0;
    public int j0;
    public final int k0;
    public boolean l0;
    public final Path m0;
    public final qv n0;

    public cv(vv vvVar, Rect rect, int i10, boolean z10) {
        super(vvVar, rect, i10);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.X = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.Y = imageReceiver2;
        this.f0 = -1;
        this.k0 = i0.L(48.0f);
        this.m0 = new Path();
        this.n0 = new qv();
        this.W = z10;
        this.e0 = b6.q(vvVar.a).k();
        imageReceiver.z1 = true;
        imageReceiver2.z1 = true;
        imageReceiver.g1 = new n2.u(this, 6);
    }

    @Override // org.telegram.messenger.qu
    public final void A(int i10, Rect rect) {
        Rect rect2 = this.b;
        int i11 = rect2.left;
        int i12 = (this.a.C - i11) - rect2.right;
        int i13 = this.b0;
        int i14 = (i12 > i13 ? (i12 - i13) / 2 : 0) + i11;
        int i15 = ((int) this.M) + rect2.top;
        rect.set(i14, i15, i13 + i14, this.c0 + i15);
    }

    @Override // org.telegram.messenger.qu
    public final int B() {
        return 1;
    }

    @Override // org.telegram.messenger.z5
    public final void C(boolean z10) {
        s0(false);
    }

    @Override // org.telegram.messenger.qu
    public final CharSequence E(int i10) {
        String L0 = cd.L0(p0() ? 2131753933 : 2131753948, null);
        return (!q0() || this.n0.b()) ? L0 : TextUtils.concat(L0, ", ", cd.L0(2131745280, null));
    }

    @Override // org.telegram.messenger.qu
    public final int H() {
        Rect rect = this.b;
        return rect.top + this.c0 + rect.bottom;
    }

    @Override // org.telegram.messenger.qu
    public final int I() {
        return J();
    }

    @Override // org.telegram.messenger.qu
    public final int J() {
        Rect rect = this.b;
        return rect.left + this.b0 + rect.right;
    }

    @Override // org.telegram.messenger.z5
    public final void M(String str) {
        RadialProgress2 radialProgress2 = this.a0;
        if (radialProgress2 != null) {
            radialProgress2.p(true, 1.0f);
        }
        if (o0() && (h0() || this.l0)) {
            i0(true);
        }
        s0(true);
    }

    @Override // org.telegram.messenger.qu
    public final void S() {
        View view = this.V;
        ImageReceiver imageReceiver = this.X;
        imageReceiver.H0(view);
        imageReceiver.P();
        View view2 = this.V;
        ImageReceiver imageReceiver2 = this.Y;
        imageReceiver2.H0(view2);
        imageReceiver2.P();
        s0(false);
    }

    @Override // org.telegram.messenger.qu
    public final boolean T(int i10, View view) {
        if (q0()) {
            qv qvVar = this.n0;
            if (!qvVar.b && qvVar.f == null) {
                ImageReceiver imageReceiver = this.X;
                float f7 = imageReceiver.M0;
                float f10 = imageReceiver.N0;
                qvVar.c(this.V, imageReceiver.K0 + (f7 / 2.0f), (f10 / 2.0f) + imageReceiver.L0, f7, f10);
                return true;
            }
        }
        vv vvVar = this.a;
        org.telegram.ui.Cells.l1 l1Var = vvVar.F;
        if (l1Var == null) {
            return false;
        }
        l1Var.W1(vvVar.E, m0());
        return true;
    }

    @Override // org.telegram.messenger.qu
    public final void U() {
        this.X.R();
        this.Y.R();
        this.Z = null;
        b6.q(this.a.a).v(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.messenger.qu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(Canvas canvas) {
        ImageReceiver imageReceiver;
        ImageReceiver imageReceiver2;
        Canvas canvas2 = canvas;
        if (o0 == null) {
            Paint paint = new Paint(1);
            o0 = paint;
            paint.setColor(251658240);
        }
        vv vvVar = this.a;
        int i10 = vvVar.C;
        Rect rect = this.b;
        int i11 = (i10 - rect.left) - rect.right;
        boolean Q = Q();
        int L = i0.L(2.0f);
        int i12 = (Q || vvVar.D()) ? 0 : vvVar.S - L;
        int i13 = (Q || vvVar.D()) ? 0 : vvVar.T - L;
        boolean z10 = (vvVar.C - rect.left) - rect.right > this.b0;
        if (Q) {
            canvas2.save();
            Path path = this.m0;
            path.rewind();
            path.addRoundRect(0.0f, 0.0f, i11, this.c0, i0.L(8.0f), i0.L(8.0f), Path.Direction.CW);
            canvas2.clipPath(path);
        }
        ImageReceiver imageReceiver3 = this.X;
        if (imageReceiver3.I() && imageReceiver3.h1 == 1.0f) {
            imageReceiver = imageReceiver3;
        } else {
            imageReceiver = imageReceiver3;
            canvas2.drawRect(-i12, 0.0f, i11 + i13, this.c0, o0);
        }
        nh.h hVar = null;
        ImageReceiver imageReceiver4 = this.Y;
        if (z10) {
            r0();
            t0(imageReceiver4, false);
            imageReceiver2 = imageReceiver;
            t0(imageReceiver2, true);
            if (imageReceiver4.n() != null) {
                imageReceiver4.y0(-i12, 0.0f, i12 + i11 + i13, this.c0);
                imageReceiver4.setAlpha(imageReceiver2.h1);
                imageReceiver4.h(canvas2, null);
            }
            imageReceiver2.R0 = true;
            imageReceiver2.y0(0.0f, 0.0f, (vvVar.C - rect.left) - rect.right, this.c0);
        } else {
            imageReceiver2 = imageReceiver;
            t0(imageReceiver2, false);
            imageReceiver2.R0 = false;
            imageReceiver2.y0(-i12, 0.0f, i12 + i11 + i13, this.c0);
        }
        imageReceiver2.h(canvas2, null);
        if (q0()) {
            qv qvVar = this.n0;
            if (!qvVar.b()) {
                if (!qvVar.b()) {
                    r0();
                    float f7 = imageReceiver2.K0;
                    float f10 = imageReceiver2.L0;
                    float f11 = imageReceiver2.M0;
                    float f12 = imageReceiver2.N0;
                    if (f11 > 0.0f && f12 > 0.0f) {
                        canvas2.save();
                        canvas2.clipRect(f7, f10, f7 + f11, f10 + f12);
                        qvVar.a(canvas2);
                        if (imageReceiver4.n() != null) {
                            t0(imageReceiver4, false);
                            imageReceiver4.y0(f7, f10, f11, f12);
                            imageReceiver4.setAlpha(imageReceiver2.h1);
                            imageReceiver4.h(canvas2, null);
                        }
                        View view = vvVar.Q;
                        if (view != null) {
                            nh.h hVar2 = vvVar.R;
                            if (hVar2 != null && hVar2.i) {
                                vvVar.R = null;
                            }
                            if (vvVar.R == null) {
                                vvVar.R = nh.h.e(view);
                            }
                            hVar = vvVar.R;
                        }
                        if (hVar != null) {
                            canvas2.translate(f7, f10);
                            hVar.c(canvas2, this.V, Math.round(f11), Math.round(f12), imageReceiver2.h1, false);
                            canvas2 = canvas2;
                        }
                        canvas2.restore();
                        View view2 = this.V;
                        if (view2 != null) {
                            view2.invalidate();
                        }
                    }
                }
                if (Q) {
                    return;
                }
                canvas2.restore();
                return;
            }
        }
        RadialProgress2 radialProgress2 = this.a0;
        if (radialProgress2 != null && this.f0 != -1) {
            int i14 = (vvVar.C - rect.left) - rect.right;
            int i15 = this.b0;
            int i16 = (i14 > i15 ? (i14 - i15) / 2 : 0) + this.i0;
            int i17 = this.j0;
            int i18 = this.k0;
            radialProgress2.r(i16, i17, i16 + i18, i18 + i17);
            this.a0.draw(canvas2);
        }
        if (Q) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    @Override // org.telegram.messenger.qu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X(MotionEvent motionEvent) {
        boolean z10;
        org.telegram.ui.Cells.l1 l1Var;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        Rect rect = this.b;
        int i10 = rect.left;
        float f7 = x10 - i10;
        vv vvVar = this.a;
        float f10 = f7 - ((vvVar.C - i10) - rect.right > this.b0 ? (r5 - r3) / 2 : 0);
        float y3 = motionEvent.getY() - rect.top;
        boolean z11 = f10 >= 0.0f && f10 <= ((float) this.b0) && y3 >= 0.0f && y3 <= ((float) this.c0);
        int i11 = this.f0;
        if (i11 != -1) {
            if (f10 >= this.i0) {
                int i12 = this.k0;
                if (f10 <= r10 + i12) {
                    if (y3 >= this.j0 && y3 <= r1 + i12) {
                        z10 = true;
                        if (actionMasked != 0) {
                            if (!z11 || (!z10 && i11 != 0 && i11 != 2)) {
                                if (z11) {
                                    this.h0 = true;
                                    return true;
                                }
                            }
                            this.g0 = true;
                            View view = this.V;
                            if (view != null) {
                                view.invalidate();
                                return true;
                            }
                        }
                        if (actionMasked != 1) {
                            if (actionMasked != 3) {
                                return this.h0 || this.g0;
                            }
                            this.h0 = false;
                            this.g0 = false;
                            return false;
                        }
                        boolean z12 = this.g0;
                        ImageReceiver imageReceiver = this.X;
                        if (!z12) {
                            if (this.h0) {
                                this.h0 = false;
                                if (z11) {
                                    View view2 = this.V;
                                    if (view2 != null) {
                                        view2.playSoundEffect(0);
                                    }
                                    if (q0()) {
                                        qv qvVar = this.n0;
                                        if (!qvVar.b && qvVar.f == null) {
                                            float f11 = imageReceiver.M0;
                                            float f12 = imageReceiver.N0;
                                            qvVar.c(this.V, (f11 / 2.0f) + imageReceiver.K0, (f12 / 2.0f) + imageReceiver.L0, f11, f12);
                                            return true;
                                        }
                                    }
                                    org.telegram.ui.Cells.l1 l1Var2 = vvVar.F;
                                    if (l1Var2 != null) {
                                        l1Var2.W1(vvVar.E, m0());
                                        return true;
                                    }
                                }
                            }
                        }
                        this.g0 = false;
                        View view3 = this.V;
                        if (view3 != null) {
                            view3.playSoundEffect(0);
                            this.V.invalidate();
                        }
                        int i13 = this.f0;
                        if (i13 == 0) {
                            this.l0 = true;
                            RadialProgress2 radialProgress2 = this.a0;
                            if (radialProgress2 != null) {
                                radialProgress2.p(true, 0.0f);
                            }
                            i0(true);
                            this.f0 = 1;
                            RadialProgress2 radialProgress22 = this.a0;
                            if (radialProgress22 != null) {
                                radialProgress22.setIcon(3, true, true);
                            }
                            View view4 = this.V;
                            if (view4 != null) {
                                view4.invalidate();
                                return true;
                            }
                        } else if (i13 == 1) {
                            this.l0 = false;
                            imageReceiver.c();
                            this.f0 = 0;
                            RadialProgress2 radialProgress23 = this.a0;
                            if (radialProgress23 != null) {
                                radialProgress23.setIcon(2, false, true);
                            }
                            View view5 = this.V;
                            if (view5 != null) {
                                view5.invalidate();
                                return true;
                            }
                        } else if (i13 == 2) {
                            this.l0 = true;
                            imageReceiver.t0 = true;
                            i0(true);
                            imageReceiver.P0(false);
                            this.f0 = -1;
                            RadialProgress2 radialProgress24 = this.a0;
                            if (radialProgress24 != null) {
                                radialProgress24.setIcon(4, false, true);
                            }
                            View view6 = this.V;
                            if (view6 != null) {
                                view6.invalidate();
                                return true;
                            }
                        } else if (i13 == 3 && (l1Var = vvVar.F) != null) {
                            l1Var.W1(vvVar.E, m0());
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

    @Override // org.telegram.messenger.z5
    public final int getObserverTag() {
        return this.e0;
    }

    public boolean h0() {
        return true;
    }

    @Override // org.telegram.messenger.z5
    public final void i(long j10, long j11) {
        RadialProgress2 radialProgress2 = this.a0;
        if (radialProgress2 != null) {
            radialProgress2.p(true, Math.min(1.0f, j11 <= 0 ? 0.0f : j10 / j11));
        }
        if (this.f0 != 1) {
            s0(true);
        }
    }

    public abstract void i0(boolean z10);

    public boolean j0() {
        return (b6.q(this.a.a).m() & 1) != 0;
    }

    public abstract boolean k0();

    public final void l0() {
        this.X.y0(0.0f, 0.0f, this.b0, this.c0);
        int i10 = this.b0;
        int i11 = this.k0;
        this.i0 = (i10 - i11) / 2;
        this.j0 = (this.c0 - i11) / 2;
        boolean j02 = j0();
        this.d0 = j02;
        i0(j02 || k0());
    }

    public abstract TL_iv.PageBlock m0();

    public abstract String n0();

    public boolean o0() {
        return false;
    }

    public boolean p0() {
        return false;
    }

    public abstract boolean q0();

    public final void r0() {
        Bitmap n10;
        ImageReceiver imageReceiver = this.Y;
        Bitmap n11 = imageReceiver.n();
        ImageReceiver imageReceiver2 = this.X;
        if ((n11 != null && imageReceiver2.m() != null) || (n10 = imageReceiver2.n()) == null || n10.isRecycled()) {
            return;
        }
        if (n10 != this.Z || imageReceiver.n() == null) {
            this.Z = n10;
            imageReceiver.v0(Utilities.D(n10, false));
            if (p0 == null) {
                ColorMatrix colorMatrix = new ColorMatrix();
                i0.n2(colorMatrix, 0.9f);
                i0.i(colorMatrix, 0.6f);
                p0 = new ColorMatrixColorFilter(colorMatrix);
            }
            imageReceiver.o1 = p0;
        }
    }

    public final void s0(boolean z10) {
        View view;
        View view2;
        RadialProgress2 radialProgress2 = this.a0;
        int i10 = this.k0;
        if (radialProgress2 == null && (view2 = this.V) != null) {
            RadialProgress2 radialProgress22 = new RadialProgress2(view2, null);
            this.a0 = radialProgress22;
            radialProgress22.d = -1;
            radialProgress22.setColors(1711276032, 2130706432, -1, -2500135);
            RadialProgress2 radialProgress23 = this.a0;
            int i11 = this.i0;
            int i12 = this.j0;
            radialProgress23.r(i11, i12, i11 + i10, i10 + i12);
        } else if (radialProgress2 != null && (view = this.V) != null) {
            radialProgress2.n(view);
            RadialProgress2 radialProgress24 = this.a0;
            int i13 = this.i0;
            int i14 = this.j0;
            radialProgress24.r(i13, i14, i13 + i10, i10 + i14);
        }
        String n02 = n0();
        if (TextUtils.isEmpty(n02)) {
            this.f0 = -1;
            RadialProgress2 radialProgress25 = this.a0;
            if (radialProgress25 != null) {
                radialProgress25.setIcon(4, false, false);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver = this.X;
        org.telegram.ui.Components.s5 m10 = imageReceiver.m();
        boolean z11 = m10 != null && (m10.s() || imageReceiver.M());
        boolean k02 = k0();
        vv vvVar = this.a;
        if (k02 || (o0() && z11)) {
            b6.q(vvVar.a).v(this);
            if (p0() && !z11) {
                this.f0 = 3;
                RadialProgress2 radialProgress26 = this.a0;
                if (radialProgress26 != null) {
                    radialProgress26.setIcon(0, false, z10);
                }
            } else if (!o0() || z11 || h0() || this.l0) {
                this.f0 = -1;
                RadialProgress2 radialProgress27 = this.a0;
                if (radialProgress27 != null) {
                    radialProgress27.setIcon(4, false, z10);
                }
            } else {
                this.f0 = 2;
                RadialProgress2 radialProgress28 = this.a0;
                if (radialProgress28 != null) {
                    radialProgress28.setIcon(8, false, z10);
                }
            }
        } else {
            b6.q(vvVar.a).a(n02, null, this);
            if (this.d0 || this.l0 || b8.G(vvVar.a).T(n02)) {
                this.f0 = 1;
                Float w9 = hc.D().w(n02);
                r2 = w9 != null ? w9.floatValue() : 0.0f;
                RadialProgress2 radialProgress29 = this.a0;
                if (radialProgress29 != null) {
                    radialProgress29.setIcon(3, true, z10);
                }
            } else if (p0()) {
                this.f0 = 3;
                RadialProgress2 radialProgress210 = this.a0;
                if (radialProgress210 != null) {
                    radialProgress210.setIcon(0, true, z10);
                }
            } else {
                this.f0 = 0;
                RadialProgress2 radialProgress211 = this.a0;
                if (radialProgress211 != null) {
                    radialProgress211.setIcon(2, true, z10);
                }
            }
            RadialProgress2 radialProgress212 = this.a0;
            if (radialProgress212 != null) {
                radialProgress212.p(false, r2);
            }
        }
        View view3 = this.V;
        if (view3 != null) {
            view3.invalidate();
        }
    }

    public final void t0(ImageReceiver imageReceiver, boolean z10) {
        if (z10) {
            imageReceiver.J0(0);
            return;
        }
        int i10 = tz.Y0;
        int L = i10 > 2 ? i0.L(i10 - 2) : i0.L(i10);
        int min = Math.min(i0.L(3.0f), L);
        vv vvVar = this.a;
        if (vvVar.D()) {
            imageReceiver.J0(i0.L(12.0f));
            return;
        }
        boolean z11 = this.W;
        int i11 = (!z11 || vvVar.B() || (!vvVar.E() && vvVar.G())) ? min : L;
        if (!z11 || (vvVar.E() && vvVar.G())) {
            L = min;
        }
        imageReceiver.K0(i11, L, min, min);
    }

    @Override // org.telegram.messenger.z5
    public final void n(long j10, long j11) {
    }
}
