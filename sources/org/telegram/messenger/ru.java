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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public abstract class ru extends fu implements x5 {
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
    public final fv n0;

    public ru(kv kvVar, Rect rect, int i7, boolean z9) {
        super(kvVar, rect, i7);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.X = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.Y = imageReceiver2;
        this.f0 = -1;
        this.k0 = g0.L(48.0f);
        this.m0 = new Path();
        this.n0 = new fv();
        this.W = z9;
        this.e0 = z5.q(kvVar.a).k();
        imageReceiver.z1 = true;
        imageReceiver2.z1 = true;
        imageReceiver.g1 = new h9.f1(this, 24);
    }

    @Override // org.telegram.messenger.fu
    public final void A(int i7, Rect rect) {
        Rect rect2 = this.b;
        int i10 = rect2.left;
        int i11 = (this.a.C - i10) - rect2.right;
        int i12 = this.b0;
        int i13 = (i11 > i12 ? (i11 - i12) / 2 : 0) + i10;
        int i14 = ((int) this.M) + rect2.top;
        rect.set(i13, i14, i12 + i13, this.c0 + i14);
    }

    @Override // org.telegram.messenger.fu
    public final int B() {
        return 1;
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z9) {
        t0(false);
    }

    @Override // org.telegram.messenger.fu
    public final CharSequence E(int i7) {
        String M0 = id.M0(q0() ? 2131753933 : 2131753948, null);
        return (!r0() || this.n0.b()) ? M0 : TextUtils.concat(M0, ", ", id.M0(2131745262, null));
    }

    @Override // org.telegram.messenger.fu
    public final int I() {
        Rect rect = this.b;
        return rect.top + this.c0 + rect.bottom;
    }

    @Override // org.telegram.messenger.fu
    public final int J() {
        return K();
    }

    @Override // org.telegram.messenger.fu
    public final int K() {
        Rect rect = this.b;
        return rect.left + this.b0 + rect.right;
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
        RadialProgress2 radialProgress2 = this.a0;
        if (radialProgress2 != null) {
            radialProgress2.p(true, 1.0f);
        }
        if (p0() && (i0() || this.l0)) {
            j0(true);
        }
        t0(true);
    }

    @Override // org.telegram.messenger.fu
    public final void T() {
        View view = this.V;
        ImageReceiver imageReceiver = this.X;
        imageReceiver.H0(view);
        imageReceiver.P();
        View view2 = this.V;
        ImageReceiver imageReceiver2 = this.Y;
        imageReceiver2.H0(view2);
        imageReceiver2.P();
        t0(false);
    }

    @Override // org.telegram.messenger.fu
    public final boolean U(int i7, View view) {
        if (r0()) {
            fv fvVar = this.n0;
            if (!fvVar.b && fvVar.f == null) {
                ImageReceiver imageReceiver = this.X;
                float f10 = imageReceiver.M0;
                float f11 = imageReceiver.N0;
                fvVar.c(this.V, imageReceiver.K0 + (f10 / 2.0f), (f11 / 2.0f) + imageReceiver.L0, f10, f11);
                return true;
            }
        }
        kv kvVar = this.a;
        org.telegram.ui.Cells.l1 l1Var = kvVar.F;
        if (l1Var == null) {
            return false;
        }
        l1Var.b2(kvVar.E, n0());
        return true;
    }

    @Override // org.telegram.messenger.fu
    public final void V() {
        this.X.R();
        this.Y.R();
        this.Z = null;
        z5.q(this.a.a).v(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.messenger.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(Canvas canvas) {
        ImageReceiver imageReceiver;
        ImageReceiver imageReceiver2;
        Canvas canvas2 = canvas;
        if (o0 == null) {
            Paint paint = new Paint(1);
            o0 = paint;
            paint.setColor(251658240);
        }
        kv kvVar = this.a;
        int i7 = kvVar.C;
        Rect rect = this.b;
        int i10 = (i7 - rect.left) - rect.right;
        boolean R = R();
        int L = g0.L(2.0f);
        int i11 = (R || kvVar.D()) ? 0 : kvVar.S - L;
        int i12 = (R || kvVar.D()) ? 0 : kvVar.T - L;
        boolean z9 = (kvVar.C - rect.left) - rect.right > this.b0;
        if (R) {
            canvas2.save();
            Path path = this.m0;
            path.rewind();
            path.addRoundRect(0.0f, 0.0f, i10, this.c0, g0.L(8.0f), g0.L(8.0f), Path.Direction.CW);
            canvas2.clipPath(path);
        }
        ImageReceiver imageReceiver3 = this.X;
        if (imageReceiver3.I() && imageReceiver3.h1 == 1.0f) {
            imageReceiver = imageReceiver3;
        } else {
            imageReceiver = imageReceiver3;
            canvas2.drawRect(-i11, 0.0f, i10 + i12, this.c0, o0);
        }
        xh.e eVar = null;
        ImageReceiver imageReceiver4 = this.Y;
        if (z9) {
            s0();
            u0(imageReceiver4, false);
            imageReceiver2 = imageReceiver;
            u0(imageReceiver2, true);
            if (imageReceiver4.n() != null) {
                imageReceiver4.y0(-i11, 0.0f, i11 + i10 + i12, this.c0);
                imageReceiver4.setAlpha(imageReceiver2.h1);
                imageReceiver4.h(canvas2, null);
            }
            imageReceiver2.R0 = true;
            imageReceiver2.y0(0.0f, 0.0f, (kvVar.C - rect.left) - rect.right, this.c0);
        } else {
            imageReceiver2 = imageReceiver;
            u0(imageReceiver2, false);
            imageReceiver2.R0 = false;
            imageReceiver2.y0(-i11, 0.0f, i11 + i10 + i12, this.c0);
        }
        imageReceiver2.h(canvas2, null);
        if (r0()) {
            fv fvVar = this.n0;
            if (!fvVar.b()) {
                if (!fvVar.b()) {
                    s0();
                    float f10 = imageReceiver2.K0;
                    float f11 = imageReceiver2.L0;
                    float f12 = imageReceiver2.M0;
                    float f13 = imageReceiver2.N0;
                    if (f12 > 0.0f && f13 > 0.0f) {
                        canvas2.save();
                        canvas2.clipRect(f10, f11, f10 + f12, f11 + f13);
                        fvVar.a(canvas2);
                        if (imageReceiver4.n() != null) {
                            u0(imageReceiver4, false);
                            imageReceiver4.y0(f10, f11, f12, f13);
                            imageReceiver4.setAlpha(imageReceiver2.h1);
                            imageReceiver4.h(canvas2, null);
                        }
                        View view = kvVar.Q;
                        if (view != null) {
                            xh.e eVar2 = kvVar.R;
                            if (eVar2 != null && eVar2.i) {
                                kvVar.R = null;
                            }
                            if (kvVar.R == null) {
                                kvVar.R = xh.e.e(view);
                            }
                            eVar = kvVar.R;
                        }
                        if (eVar != null) {
                            canvas2.translate(f10, f11);
                            eVar.c(canvas2, this.V, Math.round(f12), Math.round(f13), imageReceiver2.h1, false);
                            canvas2 = canvas2;
                        }
                        canvas2.restore();
                        View view2 = this.V;
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
        RadialProgress2 radialProgress2 = this.a0;
        if (radialProgress2 != null && this.f0 != -1) {
            int i13 = (kvVar.C - rect.left) - rect.right;
            int i14 = this.b0;
            int i15 = (i13 > i14 ? (i13 - i14) / 2 : 0) + this.i0;
            int i16 = this.j0;
            int i17 = this.k0;
            radialProgress2.r(i15, i16, i15 + i17, i17 + i16);
            this.a0.draw(canvas2);
        }
        if (R) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    @Override // org.telegram.messenger.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Y(MotionEvent motionEvent) {
        boolean z9;
        org.telegram.ui.Cells.l1 l1Var;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        Rect rect = this.b;
        int i7 = rect.left;
        float f10 = x10 - i7;
        kv kvVar = this.a;
        float f11 = f10 - ((kvVar.C - i7) - rect.right > this.b0 ? (r5 - r3) / 2 : 0);
        float y10 = motionEvent.getY() - rect.top;
        boolean z10 = f11 >= 0.0f && f11 <= ((float) this.b0) && y10 >= 0.0f && y10 <= ((float) this.c0);
        int i10 = this.f0;
        if (i10 != -1) {
            if (f11 >= this.i0) {
                int i11 = this.k0;
                if (f11 <= r10 + i11) {
                    if (y10 >= this.j0 && y10 <= r1 + i11) {
                        z9 = true;
                        if (actionMasked != 0) {
                            if (!z10 || (!z9 && i10 != 0 && i10 != 2)) {
                                if (z10) {
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
                        boolean z11 = this.g0;
                        ImageReceiver imageReceiver = this.X;
                        if (!z11) {
                            if (this.h0) {
                                this.h0 = false;
                                if (z10) {
                                    View view2 = this.V;
                                    if (view2 != null) {
                                        view2.playSoundEffect(0);
                                    }
                                    if (r0()) {
                                        fv fvVar = this.n0;
                                        if (!fvVar.b && fvVar.f == null) {
                                            float f12 = imageReceiver.M0;
                                            float f13 = imageReceiver.N0;
                                            fvVar.c(this.V, (f12 / 2.0f) + imageReceiver.K0, (f13 / 2.0f) + imageReceiver.L0, f12, f13);
                                            return true;
                                        }
                                    }
                                    org.telegram.ui.Cells.l1 l1Var2 = kvVar.F;
                                    if (l1Var2 != null) {
                                        l1Var2.b2(kvVar.E, n0());
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
                        int i12 = this.f0;
                        if (i12 == 0) {
                            this.l0 = true;
                            RadialProgress2 radialProgress2 = this.a0;
                            if (radialProgress2 != null) {
                                radialProgress2.p(true, 0.0f);
                            }
                            j0(true);
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
                        } else if (i12 == 1) {
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
                        } else if (i12 == 2) {
                            this.l0 = true;
                            imageReceiver.t0 = true;
                            j0(true);
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
                        } else if (i12 == 3 && (l1Var = kvVar.F) != null) {
                            l1Var.b2(kvVar.E, n0());
                            return true;
                        }
                    }
                }
            }
        }
        z9 = false;
        if (actionMasked != 0) {
        }
    }

    @Override // org.telegram.messenger.x5
    public final int getObserverTag() {
        return this.e0;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j3, long j10) {
        RadialProgress2 radialProgress2 = this.a0;
        if (radialProgress2 != null) {
            radialProgress2.p(true, Math.min(1.0f, j10 <= 0 ? 0.0f : j3 / j10));
        }
        if (this.f0 != 1) {
            t0(true);
        }
    }

    public boolean i0() {
        return true;
    }

    public abstract void j0(boolean z9);

    public boolean k0() {
        return (z5.q(this.a.a).m() & 1) != 0;
    }

    public abstract boolean l0();

    public final void m0() {
        this.X.y0(0.0f, 0.0f, this.b0, this.c0);
        int i7 = this.b0;
        int i10 = this.k0;
        this.i0 = (i7 - i10) / 2;
        this.j0 = (this.c0 - i10) / 2;
        boolean k02 = k0();
        this.d0 = k02;
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
                g0.n2(colorMatrix, 0.9f);
                g0.i(colorMatrix, 0.6f);
                p0 = new ColorMatrixColorFilter(colorMatrix);
            }
            imageReceiver.o1 = p0;
        }
    }

    public final void t0(boolean z9) {
        View view;
        View view2;
        RadialProgress2 radialProgress2 = this.a0;
        int i7 = this.k0;
        if (radialProgress2 == null && (view2 = this.V) != null) {
            RadialProgress2 radialProgress22 = new RadialProgress2(view2, null);
            this.a0 = radialProgress22;
            radialProgress22.d = -1;
            radialProgress22.setColors(1711276032, 2130706432, -1, -2500135);
            RadialProgress2 radialProgress23 = this.a0;
            int i10 = this.i0;
            int i11 = this.j0;
            radialProgress23.r(i10, i11, i10 + i7, i7 + i11);
        } else if (radialProgress2 != null && (view = this.V) != null) {
            radialProgress2.n(view);
            RadialProgress2 radialProgress24 = this.a0;
            int i12 = this.i0;
            int i13 = this.j0;
            radialProgress24.r(i12, i13, i12 + i7, i7 + i13);
        }
        String o02 = o0();
        if (TextUtils.isEmpty(o02)) {
            this.f0 = -1;
            RadialProgress2 radialProgress25 = this.a0;
            if (radialProgress25 != null) {
                radialProgress25.setIcon(4, false, false);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver = this.X;
        org.telegram.ui.Components.v5 m10 = imageReceiver.m();
        boolean z10 = m10 != null && (m10.s() || imageReceiver.M());
        boolean l02 = l0();
        kv kvVar = this.a;
        if (l02 || (p0() && z10)) {
            z5.q(kvVar.a).v(this);
            if (q0() && !z10) {
                this.f0 = 3;
                RadialProgress2 radialProgress26 = this.a0;
                if (radialProgress26 != null) {
                    radialProgress26.setIcon(0, false, z9);
                }
            } else if (!p0() || z10 || i0() || this.l0) {
                this.f0 = -1;
                RadialProgress2 radialProgress27 = this.a0;
                if (radialProgress27 != null) {
                    radialProgress27.setIcon(4, false, z9);
                }
            } else {
                this.f0 = 2;
                RadialProgress2 radialProgress28 = this.a0;
                if (radialProgress28 != null) {
                    radialProgress28.setIcon(8, false, z9);
                }
            }
        } else {
            z5.q(kvVar.a).a(o02, null, this);
            if (this.d0 || this.l0 || w7.G(kvVar.a).S(o02)) {
                this.f0 = 1;
                Float w10 = gc.D().w(o02);
                r2 = w10 != null ? w10.floatValue() : 0.0f;
                RadialProgress2 radialProgress29 = this.a0;
                if (radialProgress29 != null) {
                    radialProgress29.setIcon(3, true, z9);
                }
            } else if (q0()) {
                this.f0 = 3;
                RadialProgress2 radialProgress210 = this.a0;
                if (radialProgress210 != null) {
                    radialProgress210.setIcon(0, true, z9);
                }
            } else {
                this.f0 = 0;
                RadialProgress2 radialProgress211 = this.a0;
                if (radialProgress211 != null) {
                    radialProgress211.setIcon(2, true, z9);
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

    public final void u0(ImageReceiver imageReceiver, boolean z9) {
        if (z9) {
            imageReceiver.J0(0);
            return;
        }
        int i7 = iz.Y0;
        int L = i7 > 2 ? g0.L(i7 - 2) : g0.L(i7);
        int min = Math.min(g0.L(3.0f), L);
        kv kvVar = this.a;
        if (kvVar.D()) {
            imageReceiver.J0(g0.L(12.0f));
            return;
        }
        boolean z10 = this.W;
        int i10 = (!z10 || kvVar.B() || (!kvVar.E() && kvVar.G())) ? min : L;
        if (!z10 || (kvVar.E() && kvVar.G())) {
            L = min;
        }
        imageReceiver.K0(i10, L, min, min);
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j3, long j10) {
    }
}
