package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class t8 extends cu0 {
    public float g0;
    public float h0;
    public float i0;
    public final float[] j0;
    public final Path k0;
    public final RectF l0;
    public final RectF m0;
    public final RectF n0;
    public final RectF o0;
    public final RectF p0;
    public final SparseArray q0;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 r0;
    public final /* synthetic */ f9 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(f9 f9Var, Context context, org.telegram.ui.ActionBar.g2 g2Var) {
        super(context, null);
        this.s0 = f9Var;
        this.r0 = g2Var;
        this.j0 = new float[8];
        this.k0 = new Path();
        this.l0 = new RectF();
        this.m0 = new RectF();
        this.n0 = new RectF();
        this.o0 = new RectF();
        this.p0 = new RectF();
        this.q0 = new SparseArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v6 */
    @Override // org.telegram.ui.Components.cu0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        boolean z10;
        int i7;
        v3 v3Var;
        float f12;
        float f13;
        int i10;
        float f14;
        RectF rectF;
        float f15;
        float[] fArr;
        float f16;
        float f17;
        RectF rectF2;
        float f18;
        RectF rectF3;
        float f19;
        float f20;
        RectF rectF4;
        float f21;
        float f22;
        e7 e7Var;
        float f23;
        Paint paint;
        View view;
        e7 e7Var2;
        a9 a9Var;
        z8 z8Var;
        z3 currentPeerView;
        c3 c3Var;
        e7 e7Var3;
        int i11;
        z3 z11;
        rh0 rh0Var;
        boolean z12;
        float f24;
        f9 f9Var = this.s0;
        RectF rectF5 = f9Var.U;
        c9 c9Var = f9Var.t0;
        float f25 = 1.0f;
        canvas.drawColor(i0.a.o(-16777216, (int) ((((1.0f - f9Var.W) * 0.5f) + 0.5f) * f9Var.V * 255.0f)));
        int i12 = 0;
        if (f9Var.b) {
            boolean z13 = (1.0f - f9Var.W) * f9Var.V == 1.0f;
            if (f9Var.K0 != z13) {
                f9Var.K0 = z13;
                org.telegram.ui.ActionBar.g2 g2Var = this.r0;
                if (g2Var.getLayoutContainer() != null) {
                    g2Var.getLayoutContainer().invalidate();
                }
            }
        }
        z3 currentPeerView2 = f9Var.o0.getCurrentPeerView();
        RectF rectF6 = this.p0;
        RectF rectF7 = this.o0;
        if (currentPeerView2 != null) {
            v3 v3Var2 = currentPeerView2.Y0;
            if (f9Var.V0) {
                v3Var2.a.getImageReceiver().P0(f9Var.V == 1.0f, true);
            } else {
                v3Var2.a.getImageReceiver().P0(true, false);
            }
            if (f9Var.h1) {
                f9Var.h1 = false;
                View view2 = v3Var2.a;
                t3 t3Var = v3Var2.a;
                f11 = 255.0f;
                z12 = true;
                float f26 = 0.0f;
                float f27 = 0.0f;
                while (view2 != this) {
                    int i13 = i12;
                    if (view2.getParent() == this) {
                        f26 += view2.getLeft();
                        f27 += view2.getTop();
                        f24 = f25;
                    } else {
                        f24 = f25;
                        if (view2.getParent() != f9Var.o0) {
                            f26 += view2.getX();
                            f27 += view2.getY();
                        }
                    }
                    view2 = (View) view2.getParent();
                    i12 = i13;
                    f25 = f24;
                }
                f10 = f25;
                i7 = i12;
                rectF7.set(f26, f27, t3Var.getMeasuredWidth() + f26, t3Var.getMeasuredHeight() + f27);
                rectF6.set(0.0f, currentPeerView2.M0.getTop() + currentPeerView2.getTop(), f9Var.w.getMeasuredWidth(), f9Var.w.getMeasuredHeight());
                f9Var.w.getMatrix().mapRect(rectF7);
                f9Var.w.getMatrix().mapRect(rectF6);
            } else {
                f10 = 1.0f;
                f11 = 255.0f;
                z12 = true;
                i7 = 0;
            }
            v3Var = v3Var2;
            z10 = z12;
        } else {
            f10 = 1.0f;
            f11 = 255.0f;
            z10 = 1;
            i7 = 0;
            v3Var = null;
        }
        f9Var.d1.setAlpha(f10 - f9Var.W);
        if (f9Var.Y == 0.0f) {
            float f28 = f10;
            f12 = f28 - Utilities.i(Math.abs(f9Var.X / getMeasuredHeight()), f28, 0.0f);
        } else {
            f12 = 1.0f;
        }
        f9Var.o0.setHorizontalProgressToDismiss((f9Var.Y / f9Var.w.getMeasuredWidth()) * f9Var.V);
        if (f9Var.O != 0.0f || f9Var.P != 0.0f) {
            float f29 = f9Var.V;
            if (f29 != 1.0f) {
                if (f9Var.H0 && f9Var.V0) {
                    float i14 = 1.0f - Utilities.i(((1.0f - f29) - 0.8f) / 0.100000024f, 1.0f, 0.0f);
                    f13 = 0.15f;
                    f14 = Utilities.i(com.google.android.gms.internal.vision.e2.t(1.0f, i14, 0.05f, f29), 1.0f, 0.0f);
                    i10 = 2;
                    f9Var.w.setAlpha(i14);
                } else {
                    f13 = 0.15f;
                    i10 = 2;
                    f9Var.w.setAlpha(1.0f);
                    f14 = f29;
                }
                if (!f9Var.H0 || c9Var == null || c9Var.c == null) {
                    rectF = rectF7;
                } else {
                    u8 u8Var = f9Var.w;
                    rectF = rectF7;
                    u8Var.setAlpha(u8Var.getAlpha() * ((float) Math.pow(f29, 0.20000000298023224d)));
                }
                u8 u8Var2 = f9Var.w;
                float left = (f9Var.O - u8Var2.getLeft()) - (f9Var.w.getMeasuredWidth() / 2.0f);
                float f30 = f9Var.V;
                u8Var2.setTranslationX((f9Var.Y * f30) + ((1.0f - f30) * left));
                u8 u8Var3 = f9Var.w;
                float top = (f9Var.P - u8Var3.getTop()) - (f9Var.w.getMeasuredHeight() / 2.0f);
                float f31 = f9Var.V;
                u8Var3.setTranslationY((f9Var.X * f31) + ((1.0f - f31) * top));
                float T1 = org.telegram.messenger.g0.T1(f9Var.S / f9Var.w.getMeasuredWidth(), (f12 * f13) + 0.85f, f14);
                f9Var.w.setScaleX(T1);
                f9Var.w.setScaleY(T1);
                Path path = this.k0;
                path.rewind();
                float f32 = f9Var.O;
                float f33 = f9Var.S / 2.0f;
                float f34 = f9Var.P;
                float f35 = f9Var.T / 2.0f;
                float f36 = f35 + f34;
                RectF rectF8 = this.l0;
                rectF8.set(f32 - f33, f34 - f35, f33 + f32, f36);
                boolean z14 = f9Var.H0;
                RectF rectF9 = this.m0;
                if (z14 && f9Var.V0) {
                    rectF9.set(rectF6);
                } else if (currentPeerView2 != null) {
                    rectF9.set(0.0f, currentPeerView2.M0.getTop() + f9Var.c0, getMeasuredWidth(), getMeasuredHeight() + f9Var.c0);
                } else {
                    rectF9.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                if (f9Var.H0 && f9Var.V0) {
                    rectF8.inset(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
                }
                float T12 = org.telegram.messenger.g0.T1(rectF8.centerX(), rectF9.centerX(), f9Var.V);
                float T13 = org.telegram.messenger.g0.T1(rectF8.centerY(), rectF9.centerY(), f9Var.V);
                float T14 = org.telegram.messenger.g0.T1(rectF8.height(), rectF9.height(), f14);
                float T15 = org.telegram.messenger.g0.T1(rectF8.width(), rectF9.width(), f14);
                if (f9Var.H0 && f9Var.V0) {
                    f15 = T12;
                    rectF8.inset(-org.telegram.messenger.g0.L(12.0f), -org.telegram.messenger.g0.L(12.0f));
                } else {
                    f15 = T12;
                }
                RectF rectF10 = org.telegram.messenger.g0.P;
                float f37 = T15 / 2.0f;
                float f38 = T14 / 2.0f;
                rectF10.set(f15 - f37, T13 - f38, f15 + f37, T13 + f38);
                boolean z15 = f9Var.V0;
                float[] fArr2 = this.j0;
                if (z15) {
                    float T16 = org.telegram.messenger.g0.T1(f9Var.S / 2.0f, 0.0f, f14);
                    fArr = fArr2;
                    fArr[7] = T16;
                    fArr[6] = T16;
                    fArr[5] = T16;
                    fArr[4] = T16;
                    fArr[3] = T16;
                    fArr[i10] = T16;
                    fArr[z10] = T16;
                    fArr[i7] = T16;
                } else {
                    fArr = fArr2;
                    int[] iArr = f9Var.W0;
                    if (iArr == null) {
                        f16 = 0.0f;
                        fArr[7] = 0.0f;
                        fArr[6] = 0.0f;
                        fArr[5] = 0.0f;
                        fArr[4] = 0.0f;
                        fArr[3] = 0.0f;
                        fArr[i10] = 0.0f;
                        fArr[z10] = 0.0f;
                        fArr[0] = 0.0f;
                        path.addRoundRect(rectF10, fArr, Path.Direction.CCW);
                        canvas.save();
                        f17 = f9Var.Q;
                        if (f17 != f16 && f9Var.R != f16) {
                            canvas.clipRect(f16, org.telegram.messenger.g0.T1(f16, f17, (float) Math.pow(1.0f - f9Var.V, 0.4000000059604645d)), getMeasuredWidth(), org.telegram.messenger.g0.T1(getMeasuredHeight(), f9Var.R, 1.0f - f9Var.V));
                        }
                        if (c9Var == null && (e7Var3 = c9Var.m) != null && e7Var3.w && f9Var.V0) {
                            rectF2 = rectF5;
                            f18 = f16;
                            rectF3 = rectF8;
                            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f29 * f11), 31);
                        } else {
                            rectF2 = rectF5;
                            f18 = f16;
                            rectF3 = rectF8;
                            canvas.save();
                        }
                        canvas.clipPath(path);
                        super.dispatchDraw(canvas);
                        RectF rectF11 = this.n0;
                        if (c9Var != null || c9Var.c == null || (currentPeerView = f9Var.o0.getCurrentPeerView()) == null || (c3Var = currentPeerView.M0) == null) {
                            f19 = f18;
                            f20 = f29;
                            rectF4 = rectF3;
                        } else {
                            boolean z16 = c9Var.c.R0;
                            f19 = f18;
                            rectF9.set(c3Var.getX() + currentPeerView.getX() + f9Var.Y + f9Var.w.getLeft(), c3Var.getY() + currentPeerView.getY() + f9Var.X + f9Var.w.getTop(), ((f9Var.Y + f9Var.w.getRight()) - (f9Var.w.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - c3Var.getRight()), ((f9Var.X + f9Var.w.getBottom()) - (f9Var.w.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - c3Var.getBottom()));
                            org.telegram.messenger.g0.Z1(rectF3, rectF9, f29, rectF11);
                            ImageReceiver imageReceiver = c9Var.c;
                            float f39 = imageReceiver.L0;
                            float f40 = imageReceiver.M0;
                            float f41 = imageReceiver.N0;
                            float f42 = imageReceiver.O0;
                            imageReceiver.B0(rectF11);
                            float f43 = 1.0f - f29;
                            c9Var.c.setAlpha(f43);
                            f20 = f29;
                            rectF4 = rectF3;
                            c9Var.c.P0(z10, false);
                            int saveCount = canvas.getSaveCount();
                            z8 z8Var2 = c9Var.f;
                            if (z8Var2 != null) {
                                z8Var2.n(f43, canvas, rectF11, f9Var.F);
                            }
                            c9Var.c.h(canvas, null);
                            a9 a9Var2 = c9Var.e;
                            if (a9Var2 != null) {
                                a9Var2.m(canvas, rectF11, f43);
                            }
                            c9Var.c.P0(z16, false);
                            c9Var.c.z0(f39, f40, f41, f42);
                            canvas.restoreToCount(saveCount);
                        }
                        canvas.restore();
                        if (v3Var != null) {
                            t3 t3Var2 = v3Var.a;
                            float f44 = f9Var.Y;
                            float f45 = f9Var.X;
                            if (f9Var.H0 && f9Var.V0) {
                                rectF9.set(rectF);
                            } else {
                                for (View view3 = t3Var2; view3 != this && view3 != null; view3 = (View) view3.getParent()) {
                                    if (view3.getParent() == this) {
                                        f44 += view3.getLeft();
                                        f45 += view3.getTop();
                                    } else if (view3.getParent() != f9Var.o0) {
                                        float x10 = view3.getX() + f44;
                                        f45 = view3.getY() + f45;
                                        f44 = x10;
                                    }
                                    if (!(view3.getParent() instanceof View)) {
                                        break;
                                    }
                                }
                                rectF9.set(f44, f45, t3Var2.getMeasuredWidth() + f44, t3Var2.getMeasuredHeight() + f45);
                            }
                            org.telegram.messenger.g0.Z1(rectF4, rectF9, f9Var.V, rectF11);
                            int saveCount2 = canvas.getSaveCount();
                            if (c9Var != null && (z8Var = c9Var.f) != null) {
                                z8Var.n(1.0f - f20, canvas, rectF11, f9Var.F);
                            }
                            if (f9Var.V0) {
                                boolean z17 = (c9Var == null || c9Var.l == null) ? false : true;
                                if (z17 && f9Var.V == f19) {
                                    f21 = f20;
                                } else {
                                    if (c9Var != null && (e7Var2 = c9Var.m) != null && e7Var2.w) {
                                        canvas.saveLayerAlpha(rectF11.left - org.telegram.messenger.g0.L(4.0f), rectF11.top - org.telegram.messenger.g0.L(4.0f), rectF11.right + org.telegram.messenger.g0.L(4.0f), rectF11.bottom + org.telegram.messenger.g0.L(4.0f), ks.e4, 31);
                                    }
                                    t3Var2.getImageReceiver().B0(rectF11);
                                    t3Var2.getImageReceiver().K0((int) org.telegram.messenger.g0.T1(rectF11.width() / 2.0f, ((c9Var == null || c9Var.b == null) ? null : Integer.valueOf((int) (c9Var.b.X0[0] * ((!c9Var.n || (view = c9Var.a) == null || view.getParent() == null) ? 1.0f : ((ViewGroup) c9Var.a.getParent()).getScaleY())))) != null ? r4.intValue() : rectF11.width() / 2.0f, 1.0f - f9Var.V));
                                    t3Var2.getImageReceiver().P0(true, false);
                                    float f46 = z17 ? f9Var.V : 1.0f;
                                    if (c9Var == null || c9Var.k >= 1.0f || (paint = c9Var.j) == null) {
                                        f21 = f20;
                                        f22 = f46;
                                    } else {
                                        paint.setAlpha((int) ((1.0f - f20) * f11));
                                        canvas.drawCircle(rectF11.centerX(), rectF11.centerY(), rectF11.width() / 2.0f, c9Var.j);
                                        f21 = f20;
                                        f22 = org.telegram.messenger.g0.T1(c9Var.k, f46, f21);
                                    }
                                    t3Var2.getImageReceiver().setAlpha(f22);
                                    v3Var.b(f9Var.V, canvas, rectF11, !f9.A1);
                                    t3Var2.getImageReceiver().h(canvas, null);
                                    t3Var2.getImageReceiver().setAlpha(f46);
                                    t3Var2.getImageReceiver().P0(false, false);
                                    if (c9Var != null && (e7Var = c9Var.m) != null && e7Var.w) {
                                        RectF rectF12 = org.telegram.messenger.g0.P;
                                        rectF12.set(rectF11);
                                        f23 = 1.0f;
                                        i7.k(1.0f - f9Var.V, f19, canvas, rectF12, true);
                                        canvas.restore();
                                        if (f9Var.V != f23 && z17) {
                                            ImageReceiver imageReceiver2 = c9Var.l;
                                            RectF rectF13 = rectF2;
                                            rectF13.set(imageReceiver2.L0, imageReceiver2.M0, imageReceiver2.z(), c9Var.l.B());
                                            ImageReceiver imageReceiver3 = c9Var.l;
                                            int i15 = imageReceiver3.X0[0];
                                            boolean z18 = imageReceiver3.R0;
                                            imageReceiver3.B0(rectF11);
                                            c9Var.l.K0((int) (rectF11.width() / 2.0f));
                                            c9Var.l.P0(true, false);
                                            canvas.saveLayerAlpha(rectF11, (int) ((1.0f - f9Var.V) * f11), 31);
                                            c9Var.l.h(canvas, null);
                                            canvas.restore();
                                            c9Var.l.P0(z18, false);
                                            c9Var.l.B0(rectF13);
                                            c9Var.l.K0(i15);
                                        }
                                        if (c9Var != null && (a9Var = c9Var.e) != null) {
                                            a9Var.m(canvas, rectF11, 1.0f - f21);
                                        }
                                    }
                                }
                                f23 = 1.0f;
                                if (f9Var.V != f23) {
                                    ImageReceiver imageReceiver22 = c9Var.l;
                                    RectF rectF132 = rectF2;
                                    rectF132.set(imageReceiver22.L0, imageReceiver22.M0, imageReceiver22.z(), c9Var.l.B());
                                    ImageReceiver imageReceiver32 = c9Var.l;
                                    int i152 = imageReceiver32.X0[0];
                                    boolean z182 = imageReceiver32.R0;
                                    imageReceiver32.B0(rectF11);
                                    c9Var.l.K0((int) (rectF11.width() / 2.0f));
                                    c9Var.l.P0(true, false);
                                    canvas.saveLayerAlpha(rectF11, (int) ((1.0f - f9Var.V) * f11), 31);
                                    c9Var.l.h(canvas, null);
                                    canvas.restore();
                                    c9Var.l.P0(z182, false);
                                    c9Var.l.B0(rectF132);
                                    c9Var.l.K0(i152);
                                }
                                if (c9Var != null) {
                                    a9Var.m(canvas, rectF11, 1.0f - f21);
                                }
                            }
                            canvas.restoreToCount(saveCount2);
                        }
                        if (f9Var.N != null) {
                            float i16 = Utilities.i(f9Var.V / 0.4f, 1.0f, 0.0f);
                            if (i16 != 1.0f) {
                                RectF rectF14 = org.telegram.messenger.g0.P;
                                float f47 = f9Var.O;
                                float f48 = f9Var.P;
                                rectF14.set(f47, f48, f9Var.S + f47, f9Var.T + f48);
                                rectF14.inset(-org.telegram.messenger.g0.L(16.0f), -org.telegram.messenger.g0.L(16.0f));
                                if (i16 != 0.0f) {
                                    canvas.saveLayerAlpha(rectF14, (int) ((1.0f - i16) * f11), 31);
                                } else {
                                    canvas.save();
                                }
                                canvas.translate(f9Var.L, f9Var.M);
                                ((org.telegram.ui.Cells.u2) f9Var.N).I(canvas);
                                canvas.restore();
                            }
                        }
                        canvas.restore();
                        if (f9.A1) {
                            ArrayList arrayList = f9Var.y0;
                            f9Var.W();
                            f9Var.V = 0.0f;
                            f9Var.S(true);
                            f9Var.d = false;
                            f9.x1 = true;
                            f9Var.c0 = f9Var.X;
                            if (c9Var.d != null && (z11 = f9Var.z()) != null && (rh0Var = z11.Y0.d) != null) {
                                rh0 rh0Var2 = c9Var.d;
                                rh0Var.c = rh0Var2.c;
                                rh0Var.f = rh0Var2.f;
                                rh0Var.b = rh0Var2.b;
                                rh0Var.a = System.currentTimeMillis();
                                rh0Var.c();
                            }
                            f9Var.F = true;
                            float[] fArr3 = new float[i10];
                            // fill-array-data instruction
                            fArr3[0] = 0.0f;
                            fArr3[1] = 1.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr3);
                            f9Var.G = ofFloat;
                            ofFloat.addUpdateListener(new n8(f9Var, 1));
                            f9Var.J0.d();
                            u8 u8Var4 = f9Var.w;
                            if (u8Var4 != null) {
                                v.c = true;
                                i11 = 2;
                                u8Var4.setLayerType(2, null);
                            } else {
                                i11 = 2;
                            }
                            f9Var.G.addListener(new o8(f9Var, i11));
                            f9Var.G.setStartDelay(40L);
                            f9Var.G.setDuration(250L);
                            f9Var.G.setInterpolator(kr.f);
                            f9Var.G.start();
                            if (!arrayList.isEmpty()) {
                                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                    ((Runnable) arrayList.get(i17)).run();
                                }
                                arrayList.clear();
                            }
                            f9.A1 = false;
                            return;
                        }
                        return;
                    }
                    int i18 = i7;
                    float W1 = org.telegram.messenger.g0.W1(f29, iArr[i7], i18);
                    fArr[z10] = W1;
                    fArr[i18] = W1;
                    float W12 = org.telegram.messenger.g0.W1(f29, f9Var.W0[z10], i18);
                    fArr[3] = W12;
                    fArr[i10] = W12;
                    float W13 = org.telegram.messenger.g0.W1(f29, f9Var.W0[i10], i18);
                    fArr[5] = W13;
                    fArr[4] = W13;
                    float W14 = org.telegram.messenger.g0.W1(f29, f9Var.W0[3], i18);
                    fArr[7] = W14;
                    fArr[6] = W14;
                }
                f16 = 0.0f;
                path.addRoundRect(rectF10, fArr, Path.Direction.CCW);
                canvas.save();
                f17 = f9Var.Q;
                if (f17 != f16) {
                    canvas.clipRect(f16, org.telegram.messenger.g0.T1(f16, f17, (float) Math.pow(1.0f - f9Var.V, 0.4000000059604645d)), getMeasuredWidth(), org.telegram.messenger.g0.T1(getMeasuredHeight(), f9Var.R, 1.0f - f9Var.V));
                }
                if (c9Var == null) {
                }
                rectF2 = rectF5;
                f18 = f16;
                rectF3 = rectF8;
                canvas.save();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                RectF rectF112 = this.n0;
                if (c9Var != null) {
                }
                f19 = f18;
                f20 = f29;
                rectF4 = rectF3;
                canvas.restore();
                if (v3Var != null) {
                }
                if (f9Var.N != null) {
                }
                canvas.restore();
                if (f9.A1) {
                }
            }
        }
        f9Var.w.setAlpha(f9Var.V);
        float f49 = (f12 * 0.15f) + (f9Var.V * 0.1f) + 0.75f;
        f9Var.w.setScaleX(f49);
        f9Var.w.setScaleY(f49);
        f9Var.w.setTranslationY(f9Var.X);
        f9Var.w.setTranslationX(f9Var.Y);
        super.dispatchDraw(canvas);
        i10 = 2;
        if (f9.A1) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        f9 f9Var = this.s0;
        if (keyCode == 24 || keyEvent.getKeyCode() == 25) {
            f9Var.w(keyEvent);
            return true;
        }
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        f9Var.p();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x030f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        v8 v8Var;
        int i7;
        xi0 xi0Var;
        f9 f9Var = this.s0;
        float[] fArr = f9Var.p0;
        z3 currentPeerView = f9Var.o0.getCurrentPeerView();
        if (currentPeerView != null) {
            g3 g3Var = currentPeerView.u0;
            if (g3Var.a0.x()) {
                float x10 = currentPeerView.getX();
                float y10 = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x10, -y10);
                if (!g3Var.a0.n(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x10, y10);
                }
                return true;
            }
        }
        float f10 = 0.0f;
        int i10 = 0;
        if (f9Var.p1 && currentPeerView != null && (xi0Var = currentPeerView.b3) != null) {
            float f11 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f10 += view.getX();
                f11 += view.getY();
            }
            if (currentPeerView.b3.getReactionsWindow() != null && currentPeerView.b3.getReactionsWindow().c != null) {
                motionEvent.offsetLocation(-f10, (-f11) - currentPeerView.b3.getReactionsWindow().c.getTranslationY());
                currentPeerView.b3.getReactionsWindow().c.dispatchTouchEvent(motionEvent);
                return true;
            }
            Rect rect = org.telegram.messenger.g0.Q;
            xi0Var.getHitRect(rect);
            rect.offset((int) f10, (int) f11);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.Z0(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            xi0Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            f9Var.k0 = false;
            org.telegram.messenger.g0.r(f9Var.b1);
            float f12 = f9Var.Y;
            if (f12 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, 0.0f);
                f9Var.H = ofFloat;
                ofFloat.addUpdateListener(new q8(this, i10));
                f9Var.H.addListener(new r8(this, i10));
                f9Var.H.setDuration(250L);
                f9Var.H.setInterpolator(kr.f);
                f9Var.H.start();
            }
            if (f9Var.W >= 0.3f) {
                f9Var.u(true);
            }
            f9Var.Q(false);
            f9Var.R(false);
            z10 = true;
        } else {
            z10 = false;
        }
        if (motionEvent.getAction() == 0) {
            f9Var.b0 = false;
            if (currentPeerView != null) {
                bi.v2 v2Var = currentPeerView.i0;
                k8 k8Var = currentPeerView.m0;
                c3 c3Var = currentPeerView.M0;
                hi.u3 u3Var = currentPeerView.p0;
                if (u3Var != null && u3Var.W && k8Var != null && !u3Var.D0.contains(motionEvent.getX() - (currentPeerView.p0.getX() + (c3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.p0.getY() + (c3Var.getY() + currentPeerView.getY()))) && !currentPeerView.F0(k8Var, motionEvent)) {
                    currentPeerView.p0.f(true);
                }
                hi.u3 u3Var2 = currentPeerView.q0;
                if (u3Var2 != null && u3Var2.W && v2Var != null && !u3Var2.D0.contains(motionEvent.getX() - (currentPeerView.q0.getX() + (c3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.q0.getY() + (c3Var.getY() + currentPeerView.getY()))) && !currentPeerView.F0(v2Var, motionEvent)) {
                    currentPeerView.q0.f(true);
                }
            }
            f9Var.o0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        boolean z12 = (f9Var.y || f9Var.H0 || f9Var.I0) ? false : true;
        float f13 = f9Var.f0;
        SparseArray sparseArray = this.q0;
        if (f13 == 0.0f && !f9Var.k0 && f9Var.o0.G0 == 1 && motionEvent.getAction() == 2 && z12) {
            float floatValue = ((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0);
            if ((floatValue != 0.0f && (((i7 = (v8Var = f9Var.o0).J0) == 0 && v8Var.L0 == 0.0f && floatValue < 0.0f) || (i7 == v8Var.getAdapter().b() - 1 && v8Var.L0 == 0.0f && floatValue > 0.0f))) || f9Var.Y != 0.0f) {
                float f14 = f9Var.Y;
                if (f14 == 0.0f) {
                    f9Var.Z = -floatValue;
                }
                if ((floatValue < 0.0f && f9Var.Z > 0.0f) || (floatValue > 0.0f && f9Var.Z < 0.0f)) {
                    floatValue *= 0.2f;
                }
                f9Var.Y = f14 - floatValue;
                f9.i(f9Var);
                float f15 = f9Var.Y;
                if ((f15 > 0.0f && f9Var.Z < 0.0f) || (f15 < 0.0f && f9Var.Z > 0.0f)) {
                    f9Var.Y = 0.0f;
                }
                z11 = true;
                if (currentPeerView != null && f9Var.f0 == 0.0f && !f9Var.k0 && !f9Var.L0 && !f9Var.I0 && f9Var.o0.G0 != 1) {
                    org.telegram.messenger.g0.r1(currentPeerView.M0, this, fArr);
                    motionEvent.offsetLocation(-fArr[0], -fArr[1]);
                    z3 currentPeerView2 = f9Var.o0.getCurrentPeerView();
                    currentPeerView2.H2.a(motionEvent, currentPeerView2.M0, null, null, 0);
                    motionEvent.offsetLocation(fArr[0], fArr[1]);
                }
                if (motionEvent.getAction() != 1 || motionEvent.getAction() == 3) {
                    sparseArray.clear();
                } else {
                    for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
                        sparseArray.put(motionEvent.getPointerId(i11), Float.valueOf(motionEvent.getX(i11)));
                    }
                }
                if (!z11) {
                    boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        if (f9Var.f0 != 0.0f && !f9Var.g1 && f9Var.q0 < org.telegram.messenger.g0.L(20.0f)) {
                            f9Var.o(f9Var.x.f > 0.5f);
                        }
                        z3 z13 = f9Var.z();
                        if (z13 != null) {
                            z13.u0.x0 = false;
                        }
                    }
                    if (z10 && !f9Var.b0) {
                        f9Var.m();
                    }
                    if (!dispatchTouchEvent && (!f9.x1 || !f9Var.r0)) {
                        return false;
                    }
                }
                return true;
            }
        }
        z11 = false;
        if (currentPeerView != null) {
            org.telegram.messenger.g0.r1(currentPeerView.M0, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            z3 currentPeerView22 = f9Var.o0.getCurrentPeerView();
            currentPeerView22.H2.a(motionEvent, currentPeerView22.M0, null, null, 0);
            motionEvent.offsetLocation(fArr[0], fArr[1]);
        }
        if (motionEvent.getAction() != 1) {
        }
        sparseArray.clear();
        if (!z11) {
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.s0.z0) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.Components.cu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f9 f9Var = this.s0;
        if (f9Var.b && !f9Var.c) {
            org.telegram.ui.ActionBar.g2 g2Var = this.r0;
            org.telegram.messenger.g0.Z2(g2Var.getParentActivity(), g2Var.getClassGuid());
        }
        setTag(R.id.bulletin_delegate_tag, new s8(this));
        ks.f(f9Var.h).c(f9Var, ks.A5);
        ks.f(f9Var.h).c(f9Var, ks.y5);
        ks.f(f9Var.h).c(f9Var, ks.d1);
        ks.f(f9Var.h).c(f9Var, ks.c1);
        ks.f(f9Var.h).c(f9Var, ks.z5);
    }

    @Override // org.telegram.ui.Components.cu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
        f9 f9Var = this.s0;
        ks.f(f9Var.h).n(f9Var, ks.A5);
        ks.f(f9Var.h).n(f9Var, ks.y5);
        ks.f(f9Var.h).n(f9Var, ks.d1);
        ks.f(f9Var.h).n(f9Var, ks.c1);
        ks.f(f9Var.h).n(f9Var, ks.z5);
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01e3  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f10;
        a2 a2Var;
        e9 e9Var;
        z3 currentPeerView;
        boolean z10;
        f2.a aVar;
        y3 y3Var;
        z3 currentPeerView2;
        x3 x3Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        a2 a2Var2;
        f9 f9Var = this.s0;
        e3 e3Var = f9Var.b1;
        if (motionEvent.getAction() == 0 && f9Var.V == 1.0f) {
            float x10 = motionEvent.getX();
            this.i0 = x10;
            this.g0 = x10;
            this.h0 = motionEvent.getY();
            f9Var.h0 = false;
            f9Var.g0 = (f9Var.I0 || f9.c(f9Var, f9Var.s, motionEvent.getX(), motionEvent.getY(), false)) ? false : true;
            f9Var.i0 = (f9Var.I0 || f9.c(f9Var, f9Var.s, motionEvent.getX(), motionEvent.getY(), true)) ? false : true;
            f9Var.Q(f9Var.g0 && !f9Var.m1);
            z3 z11 = f9Var.z();
            if (f9Var.g0 && z11 != null && (a2Var2 = z11.v0) != null) {
                a2Var2.setAllowTouches(false);
            }
            if (f9Var.g0 && !f9Var.I0 && f9Var.m1) {
                f2.a aVar2 = new f2.a(this, 22);
                f9Var.n1 = aVar2;
                org.telegram.messenger.g0.h3(aVar2, 150L);
            }
            if (f9Var.g0 && !f9Var.y && !f9Var.I0 && !f9Var.j1) {
                org.telegram.messenger.g0.h3(e3Var, 400L);
            }
            f10 = 1.0f;
        } else if (motionEvent.getAction() == 2) {
            float abs = Math.abs(this.h0 - motionEvent.getY());
            float abs2 = Math.abs(this.g0 - motionEvent.getX());
            if (f9Var.a1 && f9Var.l0 && !f9Var.f1 && !f9Var.k0 && (y3Var = f9Var.G0) != null && ((e9) y3Var.c) != null && (currentPeerView2 = f9Var.o0.getCurrentPeerView()) != null && (x3Var = currentPeerView2.y1) != null && x3Var.b == null && x3Var.e) {
                long j3 = currentPeerView2.B2;
                if (j3 <= 0 && (storyItem = x3Var.a) != null && (messageMedia = storyItem.media) != null && (document = messageMedia.document) != null) {
                    j3 = (long) (fj.H0(document) * 1000.0d);
                }
                if (j3 > 0) {
                    float x11 = motionEvent.getX();
                    e9 e9Var2 = (e9) f9Var.G0.c;
                    f10 = 1.0f;
                    if (((int) (e9Var2.seek((x11 - this.i0) / org.telegram.messenger.g0.L(220.0f), j3) * 10.0f)) != ((int) (e9Var2.currentSeek * 10.0f))) {
                        try {
                            currentPeerView2.performHapticFeedback(9, 1);
                        } catch (Exception unused) {
                        }
                    }
                    currentPeerView2.M0.invalidate();
                    this.i0 = x11;
                    if (abs > abs2 && !f9Var.l0 && !f9Var.h0 && abs > org.telegram.messenger.g0.e * 2.0f) {
                        f9Var.h0 = true;
                    }
                    if (!f9Var.k0 && !f9Var.l0 && !f9Var.y && f9Var.i0) {
                        if (abs > abs2 && abs > org.telegram.messenger.g0.e * 2.0f) {
                            f9Var.k0 = true;
                            currentPeerView = f9Var.o0.getCurrentPeerView();
                            if (currentPeerView != null) {
                                currentPeerView.n0();
                            }
                            boolean z12 = currentPeerView == null && !currentPeerView.y1.f && (currentPeerView.m1 || (currentPeerView.n1 && currentPeerView.l3));
                            f9Var.m0 = (!z12 || currentPeerView == null || currentPeerView.n1 || currentPeerView.p1 || f9Var.u1 != null) ? false : true;
                            z10 = (z12 || currentPeerView.M2 || currentPeerView.y1.a == null || f9Var.u1 != null) ? false : true;
                            f9Var.d0 = z10;
                            if (z10 && this.f != 0) {
                                f9Var.d0 = false;
                            }
                            if (f9Var.d0) {
                                f9Var.r();
                            }
                            f9Var.a0 = 0.0f;
                            aVar = f9Var.n1;
                            if (aVar != null) {
                                org.telegram.messenger.g0.r(aVar);
                                f9Var.n1.run();
                                f9Var.n1 = null;
                            }
                            org.telegram.messenger.g0.r(e3Var);
                        }
                        f9Var.E();
                    }
                }
            }
            f10 = 1.0f;
            if (abs > abs2) {
                f9Var.h0 = true;
            }
            if (!f9Var.k0) {
                if (abs > abs2) {
                    f9Var.k0 = true;
                    currentPeerView = f9Var.o0.getCurrentPeerView();
                    if (currentPeerView != null) {
                    }
                    if (currentPeerView == null) {
                    }
                    f9Var.m0 = (!z12 || currentPeerView == null || currentPeerView.n1 || currentPeerView.p1 || f9Var.u1 != null) ? false : true;
                    if (z12) {
                    }
                    f9Var.d0 = z10;
                    if (z10) {
                        f9Var.d0 = false;
                    }
                    if (f9Var.d0) {
                    }
                    f9Var.a0 = 0.0f;
                    aVar = f9Var.n1;
                    if (aVar != null) {
                    }
                    org.telegram.messenger.g0.r(e3Var);
                }
                f9Var.E();
            }
        } else {
            f10 = 1.0f;
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                org.telegram.messenger.g0.r(e3Var);
                f2.a aVar3 = f9Var.n1;
                if (aVar3 != null) {
                    org.telegram.messenger.g0.r(aVar3);
                    f9Var.n1 = null;
                }
                f9Var.Q(false);
                f9Var.h0 = false;
                f9Var.l0 = false;
                y3 y3Var2 = f9Var.G0;
                if (y3Var2 != null && (e9Var = (e9) y3Var2.c) != null) {
                    e9Var.setSeeking(false);
                }
                z3 z13 = f9Var.z();
                if (z13 != null && (a2Var = z13.v0) != null) {
                    a2Var.setAllowTouches(true);
                }
            }
        }
        j5 j5Var = f9Var.x;
        boolean z14 = j5Var != null && j5Var.f == f10;
        if (!f9Var.k0 && !z14) {
            f9Var.j0.onTouchEvent(motionEvent);
        }
        return f9Var.k0 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        f9 f9Var = this.s0;
        ((FrameLayout.LayoutParams) f9Var.d1.getLayoutParams()).topMargin = org.telegram.messenger.g0.m - org.telegram.messenger.g0.L(2.0f);
        f9Var.d1.getLayoutParams().height = org.telegram.messenger.g0.L(2.0f);
        super.onMeasure(i7, i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a2 a2Var;
        int action = motionEvent.getAction();
        f9 f9Var = this.s0;
        int i7 = 1;
        if (action == 1 || motionEvent.getAction() == 3) {
            f9Var.k0 = false;
            f9Var.Q(false);
            if (f9Var.W >= 1.0f) {
                f9Var.u(true);
            } else if (!f9Var.H0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f9Var.X, 0.0f);
                f9Var.H = ofFloat;
                ofFloat.addUpdateListener(new q8(this, i7));
                f9Var.H.addListener(new r8(this, i7));
                f9Var.H.setDuration(150L);
                f9Var.H.setInterpolator(kr.f);
                f9Var.H.start();
            }
            z3 z10 = f9Var.z();
            if (z10 != null && (a2Var = z10.v0) != null) {
                a2Var.setAllowTouches(true);
            }
        }
        if (!f9Var.k0 && !f9Var.y && f9Var.a0 == 0.0f && ((f9Var.f0 == 0.0f || (!f9Var.g0 && !f9Var.h0)) && !f9Var.j1)) {
            return false;
        }
        f9Var.j0.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        this.s0.g0 = false;
    }
}
