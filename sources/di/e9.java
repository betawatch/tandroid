package di;

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
import org.telegram.messenger.ij;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.eh0;
import org.telegram.ui.Components.ji0;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class e9 extends tt0 {
    public float f0;
    public float g0;
    public float h0;
    public final float[] i0;
    public final Path j0;
    public final RectF k0;
    public final RectF l0;
    public final RectF m0;
    public final RectF n0;
    public final RectF o0;
    public final SparseArray p0;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 q0;
    public final /* synthetic */ q9 r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9(q9 q9Var, Context context, org.telegram.ui.ActionBar.f2 f2Var) {
        super(context, null);
        this.r0 = q9Var;
        this.q0 = f2Var;
        this.i0 = new float[8];
        this.j0 = new Path();
        this.k0 = new RectF();
        this.l0 = new RectF();
        this.m0 = new RectF();
        this.n0 = new RectF();
        this.o0 = new RectF();
        this.p0 = new SparseArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v6 */
    @Override // org.telegram.ui.Components.tt0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        boolean z9;
        int i7;
        f4 f4Var;
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
        o7 o7Var;
        float f23;
        Paint paint;
        View view;
        o7 o7Var2;
        l9 l9Var;
        k9 k9Var;
        j4 currentPeerView;
        j3 j3Var;
        o7 o7Var3;
        int i11;
        j4 z10;
        eh0 eh0Var;
        boolean z11;
        float f24;
        q9 q9Var = this.r0;
        RectF rectF5 = q9Var.T;
        n9 n9Var = q9Var.s0;
        float f25 = 1.0f;
        canvas.drawColor(i0.a.o(-16777216, (int) ((((1.0f - q9Var.V) * 0.5f) + 0.5f) * q9Var.U * 255.0f)));
        int i12 = 0;
        if (q9Var.b) {
            boolean z12 = (1.0f - q9Var.V) * q9Var.U == 1.0f;
            if (q9Var.J0 != z12) {
                q9Var.J0 = z12;
                org.telegram.ui.ActionBar.f2 f2Var = this.q0;
                if (f2Var.getLayoutContainer() != null) {
                    f2Var.getLayoutContainer().invalidate();
                }
            }
        }
        j4 currentPeerView2 = q9Var.n0.getCurrentPeerView();
        RectF rectF6 = this.o0;
        RectF rectF7 = this.n0;
        if (currentPeerView2 != null) {
            f4 f4Var2 = currentPeerView2.X0;
            if (q9Var.U0) {
                f4Var2.a.getImageReceiver().O0(q9Var.U == 1.0f, true);
            } else {
                f4Var2.a.getImageReceiver().O0(true, false);
            }
            if (q9Var.g1) {
                q9Var.g1 = false;
                View view2 = f4Var2.a;
                d4 d4Var = f4Var2.a;
                f11 = 255.0f;
                z11 = true;
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
                        if (view2.getParent() != q9Var.n0) {
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
                rectF7.set(f26, f27, d4Var.getMeasuredWidth() + f26, d4Var.getMeasuredHeight() + f27);
                rectF6.set(0.0f, currentPeerView2.L0.getTop() + currentPeerView2.getTop(), q9Var.w.getMeasuredWidth(), q9Var.w.getMeasuredHeight());
                q9Var.w.getMatrix().mapRect(rectF7);
                q9Var.w.getMatrix().mapRect(rectF6);
            } else {
                f10 = 1.0f;
                f11 = 255.0f;
                z11 = true;
                i7 = 0;
            }
            f4Var = f4Var2;
            z9 = z11;
        } else {
            f10 = 1.0f;
            f11 = 255.0f;
            z9 = 1;
            i7 = 0;
            f4Var = null;
        }
        q9Var.c1.setAlpha(f10 - q9Var.V);
        if (q9Var.X == 0.0f) {
            float f28 = f10;
            f12 = f28 - Utilities.i(Math.abs(q9Var.W / getMeasuredHeight()), f28, 0.0f);
        } else {
            f12 = 1.0f;
        }
        q9Var.n0.setHorizontalProgressToDismiss((q9Var.X / q9Var.w.getMeasuredWidth()) * q9Var.U);
        if (q9Var.N != 0.0f || q9Var.O != 0.0f) {
            float f29 = q9Var.U;
            if (f29 != 1.0f) {
                if (q9Var.G0 && q9Var.U0) {
                    float i14 = 1.0f - Utilities.i(((1.0f - f29) - 0.8f) / 0.100000024f, 1.0f, 0.0f);
                    f13 = 0.15f;
                    f14 = Utilities.i(com.google.android.recaptcha.internal.a.v(1.0f, i14, 0.05f, f29), 1.0f, 0.0f);
                    i10 = 2;
                    q9Var.w.setAlpha(i14);
                } else {
                    f13 = 0.15f;
                    i10 = 2;
                    q9Var.w.setAlpha(1.0f);
                    f14 = f29;
                }
                if (!q9Var.G0 || n9Var == null || n9Var.c == null) {
                    rectF = rectF7;
                } else {
                    f9 f9Var = q9Var.w;
                    rectF = rectF7;
                    f9Var.setAlpha(f9Var.getAlpha() * ((float) Math.pow(f29, 0.20000000298023224d)));
                }
                f9 f9Var2 = q9Var.w;
                float left = (q9Var.N - f9Var2.getLeft()) - (q9Var.w.getMeasuredWidth() / 2.0f);
                float f30 = q9Var.U;
                f9Var2.setTranslationX((q9Var.X * f30) + ((1.0f - f30) * left));
                f9 f9Var3 = q9Var.w;
                float top = (q9Var.O - f9Var3.getTop()) - (q9Var.w.getMeasuredHeight() / 2.0f);
                float f31 = q9Var.U;
                f9Var3.setTranslationY((q9Var.W * f31) + ((1.0f - f31) * top));
                float T1 = org.telegram.messenger.g0.T1(q9Var.R / q9Var.w.getMeasuredWidth(), (f12 * f13) + 0.85f, f14);
                q9Var.w.setScaleX(T1);
                q9Var.w.setScaleY(T1);
                Path path = this.j0;
                path.rewind();
                float f32 = q9Var.N;
                float f33 = q9Var.R / 2.0f;
                float f34 = q9Var.O;
                float f35 = q9Var.S / 2.0f;
                float f36 = f35 + f34;
                RectF rectF8 = this.k0;
                rectF8.set(f32 - f33, f34 - f35, f33 + f32, f36);
                boolean z13 = q9Var.G0;
                RectF rectF9 = this.l0;
                if (z13 && q9Var.U0) {
                    rectF9.set(rectF6);
                } else if (currentPeerView2 != null) {
                    rectF9.set(0.0f, currentPeerView2.L0.getTop() + q9Var.b0, getMeasuredWidth(), getMeasuredHeight() + q9Var.b0);
                } else {
                    rectF9.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                if (q9Var.G0 && q9Var.U0) {
                    rectF8.inset(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
                }
                float T12 = org.telegram.messenger.g0.T1(rectF8.centerX(), rectF9.centerX(), q9Var.U);
                float T13 = org.telegram.messenger.g0.T1(rectF8.centerY(), rectF9.centerY(), q9Var.U);
                float T14 = org.telegram.messenger.g0.T1(rectF8.height(), rectF9.height(), f14);
                float T15 = org.telegram.messenger.g0.T1(rectF8.width(), rectF9.width(), f14);
                if (q9Var.G0 && q9Var.U0) {
                    f15 = T12;
                    rectF8.inset(-org.telegram.messenger.g0.L(12.0f), -org.telegram.messenger.g0.L(12.0f));
                } else {
                    f15 = T12;
                }
                RectF rectF10 = org.telegram.messenger.g0.P;
                float f37 = T15 / 2.0f;
                float f38 = T14 / 2.0f;
                rectF10.set(f15 - f37, T13 - f38, f15 + f37, T13 + f38);
                boolean z14 = q9Var.U0;
                float[] fArr2 = this.i0;
                if (z14) {
                    float T16 = org.telegram.messenger.g0.T1(q9Var.R / 2.0f, 0.0f, f14);
                    fArr = fArr2;
                    fArr[7] = T16;
                    fArr[6] = T16;
                    fArr[5] = T16;
                    fArr[4] = T16;
                    fArr[3] = T16;
                    fArr[i10] = T16;
                    fArr[z9] = T16;
                    fArr[i7] = T16;
                } else {
                    fArr = fArr2;
                    int[] iArr = q9Var.V0;
                    if (iArr == null) {
                        f16 = 0.0f;
                        fArr[7] = 0.0f;
                        fArr[6] = 0.0f;
                        fArr[5] = 0.0f;
                        fArr[4] = 0.0f;
                        fArr[3] = 0.0f;
                        fArr[i10] = 0.0f;
                        fArr[z9] = 0.0f;
                        fArr[0] = 0.0f;
                        path.addRoundRect(rectF10, fArr, Path.Direction.CCW);
                        canvas.save();
                        f17 = q9Var.P;
                        if (f17 != f16 && q9Var.Q != f16) {
                            canvas.clipRect(f16, org.telegram.messenger.g0.T1(f16, f17, (float) Math.pow(1.0f - q9Var.U, 0.4000000059604645d)), getMeasuredWidth(), org.telegram.messenger.g0.T1(getMeasuredHeight(), q9Var.Q, 1.0f - q9Var.U));
                        }
                        if (n9Var == null && (o7Var3 = n9Var.m) != null && o7Var3.w && q9Var.U0) {
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
                        RectF rectF11 = this.m0;
                        if (n9Var != null || n9Var.c == null || (currentPeerView = q9Var.n0.getCurrentPeerView()) == null || (j3Var = currentPeerView.L0) == null) {
                            f19 = f18;
                            f20 = f29;
                            rectF4 = rectF3;
                        } else {
                            boolean z15 = n9Var.c.Q0;
                            f19 = f18;
                            rectF9.set(j3Var.getX() + currentPeerView.getX() + q9Var.X + q9Var.w.getLeft(), j3Var.getY() + currentPeerView.getY() + q9Var.W + q9Var.w.getTop(), ((q9Var.X + q9Var.w.getRight()) - (q9Var.w.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - j3Var.getRight()), ((q9Var.W + q9Var.w.getBottom()) - (q9Var.w.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - j3Var.getBottom()));
                            org.telegram.messenger.g0.Z1(rectF3, rectF9, f29, rectF11);
                            ImageReceiver imageReceiver = n9Var.c;
                            float f39 = imageReceiver.K0;
                            float f40 = imageReceiver.L0;
                            float f41 = imageReceiver.M0;
                            float f42 = imageReceiver.N0;
                            imageReceiver.A0(rectF11);
                            float f43 = 1.0f - f29;
                            n9Var.c.setAlpha(f43);
                            f20 = f29;
                            rectF4 = rectF3;
                            n9Var.c.O0(z9, false);
                            int saveCount = canvas.getSaveCount();
                            k9 k9Var2 = n9Var.f;
                            if (k9Var2 != null) {
                                k9Var2.k(f43, canvas, rectF11, q9Var.E);
                            }
                            n9Var.c.h(canvas, null);
                            l9 l9Var2 = n9Var.e;
                            if (l9Var2 != null) {
                                l9Var2.o(canvas, rectF11, f43);
                            }
                            n9Var.c.O0(z15, false);
                            n9Var.c.y0(f39, f40, f41, f42);
                            canvas.restoreToCount(saveCount);
                        }
                        canvas.restore();
                        if (f4Var != null) {
                            d4 d4Var2 = f4Var.a;
                            float f44 = q9Var.X;
                            float f45 = q9Var.W;
                            if (q9Var.G0 && q9Var.U0) {
                                rectF9.set(rectF);
                            } else {
                                for (View view3 = d4Var2; view3 != this && view3 != null; view3 = (View) view3.getParent()) {
                                    if (view3.getParent() == this) {
                                        f44 += view3.getLeft();
                                        f45 += view3.getTop();
                                    } else if (view3.getParent() != q9Var.n0) {
                                        float x10 = view3.getX() + f44;
                                        f45 = view3.getY() + f45;
                                        f44 = x10;
                                    }
                                    if (!(view3.getParent() instanceof View)) {
                                        break;
                                    }
                                }
                                rectF9.set(f44, f45, d4Var2.getMeasuredWidth() + f44, d4Var2.getMeasuredHeight() + f45);
                            }
                            org.telegram.messenger.g0.Z1(rectF4, rectF9, q9Var.U, rectF11);
                            int saveCount2 = canvas.getSaveCount();
                            if (n9Var != null && (k9Var = n9Var.f) != null) {
                                k9Var.k(1.0f - f20, canvas, rectF11, q9Var.E);
                            }
                            if (q9Var.U0) {
                                boolean z16 = (n9Var == null || n9Var.l == null) ? false : true;
                                if (z16 && q9Var.U == f19) {
                                    f21 = f20;
                                } else {
                                    if (n9Var != null && (o7Var2 = n9Var.m) != null && o7Var2.w) {
                                        canvas.saveLayerAlpha(rectF11.left - org.telegram.messenger.g0.L(4.0f), rectF11.top - org.telegram.messenger.g0.L(4.0f), rectF11.right + org.telegram.messenger.g0.L(4.0f), rectF11.bottom + org.telegram.messenger.g0.L(4.0f), qs.e4, 31);
                                    }
                                    d4Var2.getImageReceiver().A0(rectF11);
                                    d4Var2.getImageReceiver().J0((int) org.telegram.messenger.g0.T1(rectF11.width() / 2.0f, ((n9Var == null || n9Var.b == null) ? null : Integer.valueOf((int) (n9Var.b.W0[0] * ((!n9Var.n || (view = n9Var.a) == null || view.getParent() == null) ? 1.0f : ((ViewGroup) n9Var.a.getParent()).getScaleY())))) != null ? r4.intValue() : rectF11.width() / 2.0f, 1.0f - q9Var.U));
                                    d4Var2.getImageReceiver().O0(true, false);
                                    float f46 = z16 ? q9Var.U : 1.0f;
                                    if (n9Var == null || n9Var.k >= 1.0f || (paint = n9Var.j) == null) {
                                        f21 = f20;
                                        f22 = f46;
                                    } else {
                                        paint.setAlpha((int) ((1.0f - f20) * f11));
                                        canvas.drawCircle(rectF11.centerX(), rectF11.centerY(), rectF11.width() / 2.0f, n9Var.j);
                                        f21 = f20;
                                        f22 = org.telegram.messenger.g0.T1(n9Var.k, f46, f21);
                                    }
                                    d4Var2.getImageReceiver().setAlpha(f22);
                                    f4Var.b(q9Var.U, canvas, rectF11, !q9.z1);
                                    d4Var2.getImageReceiver().h(canvas, null);
                                    d4Var2.getImageReceiver().setAlpha(f46);
                                    d4Var2.getImageReceiver().O0(false, false);
                                    if (n9Var != null && (o7Var = n9Var.m) != null && o7Var.w) {
                                        RectF rectF12 = org.telegram.messenger.g0.P;
                                        rectF12.set(rectF11);
                                        f23 = 1.0f;
                                        s7.k(1.0f - q9Var.U, f19, canvas, rectF12, true);
                                        canvas.restore();
                                        if (q9Var.U != f23 && z16) {
                                            ImageReceiver imageReceiver2 = n9Var.l;
                                            RectF rectF13 = rectF2;
                                            rectF13.set(imageReceiver2.K0, imageReceiver2.L0, imageReceiver2.y(), n9Var.l.A());
                                            ImageReceiver imageReceiver3 = n9Var.l;
                                            int i15 = imageReceiver3.W0[0];
                                            boolean z17 = imageReceiver3.Q0;
                                            imageReceiver3.A0(rectF11);
                                            n9Var.l.J0((int) (rectF11.width() / 2.0f));
                                            n9Var.l.O0(true, false);
                                            canvas.saveLayerAlpha(rectF11, (int) ((1.0f - q9Var.U) * f11), 31);
                                            n9Var.l.h(canvas, null);
                                            canvas.restore();
                                            n9Var.l.O0(z17, false);
                                            n9Var.l.A0(rectF13);
                                            n9Var.l.J0(i15);
                                        }
                                        if (n9Var != null && (l9Var = n9Var.e) != null) {
                                            l9Var.o(canvas, rectF11, 1.0f - f21);
                                        }
                                    }
                                }
                                f23 = 1.0f;
                                if (q9Var.U != f23) {
                                    ImageReceiver imageReceiver22 = n9Var.l;
                                    RectF rectF132 = rectF2;
                                    rectF132.set(imageReceiver22.K0, imageReceiver22.L0, imageReceiver22.y(), n9Var.l.A());
                                    ImageReceiver imageReceiver32 = n9Var.l;
                                    int i152 = imageReceiver32.W0[0];
                                    boolean z172 = imageReceiver32.Q0;
                                    imageReceiver32.A0(rectF11);
                                    n9Var.l.J0((int) (rectF11.width() / 2.0f));
                                    n9Var.l.O0(true, false);
                                    canvas.saveLayerAlpha(rectF11, (int) ((1.0f - q9Var.U) * f11), 31);
                                    n9Var.l.h(canvas, null);
                                    canvas.restore();
                                    n9Var.l.O0(z172, false);
                                    n9Var.l.A0(rectF132);
                                    n9Var.l.J0(i152);
                                }
                                if (n9Var != null) {
                                    l9Var.o(canvas, rectF11, 1.0f - f21);
                                }
                            }
                            canvas.restoreToCount(saveCount2);
                        }
                        if (q9Var.M != null) {
                            float i16 = Utilities.i(q9Var.U / 0.4f, 1.0f, 0.0f);
                            if (i16 != 1.0f) {
                                RectF rectF14 = org.telegram.messenger.g0.P;
                                float f47 = q9Var.N;
                                float f48 = q9Var.O;
                                rectF14.set(f47, f48, q9Var.R + f47, q9Var.S + f48);
                                rectF14.inset(-org.telegram.messenger.g0.L(16.0f), -org.telegram.messenger.g0.L(16.0f));
                                if (i16 != 0.0f) {
                                    canvas.saveLayerAlpha(rectF14, (int) ((1.0f - i16) * f11), 31);
                                } else {
                                    canvas.save();
                                }
                                canvas.translate(q9Var.K, q9Var.L);
                                ((org.telegram.ui.Cells.t2) q9Var.M).G(canvas);
                                canvas.restore();
                            }
                        }
                        canvas.restore();
                        if (q9.z1) {
                            ArrayList arrayList = q9Var.x0;
                            q9Var.W();
                            q9Var.U = 0.0f;
                            q9Var.S(true);
                            q9Var.d = false;
                            q9.w1 = true;
                            q9Var.b0 = q9Var.W;
                            if (n9Var.d != null && (z10 = q9Var.z()) != null && (eh0Var = z10.X0.d) != null) {
                                eh0 eh0Var2 = n9Var.d;
                                eh0Var.c = eh0Var2.c;
                                eh0Var.f = eh0Var2.f;
                                eh0Var.b = eh0Var2.b;
                                eh0Var.a = System.currentTimeMillis();
                                eh0Var.c();
                            }
                            q9Var.E = true;
                            float[] fArr3 = new float[i10];
                            // fill-array-data instruction
                            fArr3[0] = 0.0f;
                            fArr3[1] = 1.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr3);
                            q9Var.F = ofFloat;
                            ofFloat.addUpdateListener(new y8(q9Var, 1));
                            q9Var.I0.d();
                            f9 f9Var4 = q9Var.w;
                            if (f9Var4 != null) {
                                v.c = true;
                                i11 = 2;
                                f9Var4.setLayerType(2, null);
                            } else {
                                i11 = 2;
                            }
                            q9Var.F.addListener(new z8(q9Var, i11));
                            q9Var.F.setStartDelay(40L);
                            q9Var.F.setDuration(250L);
                            q9Var.F.setInterpolator(xq.f);
                            q9Var.F.start();
                            if (!arrayList.isEmpty()) {
                                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                    ((Runnable) arrayList.get(i17)).run();
                                }
                                arrayList.clear();
                            }
                            q9.z1 = false;
                            return;
                        }
                        return;
                    }
                    int i18 = i7;
                    float W1 = org.telegram.messenger.g0.W1(f29, iArr[i7], i18);
                    fArr[z9] = W1;
                    fArr[i18] = W1;
                    float W12 = org.telegram.messenger.g0.W1(f29, q9Var.V0[z9], i18);
                    fArr[3] = W12;
                    fArr[i10] = W12;
                    float W13 = org.telegram.messenger.g0.W1(f29, q9Var.V0[i10], i18);
                    fArr[5] = W13;
                    fArr[4] = W13;
                    float W14 = org.telegram.messenger.g0.W1(f29, q9Var.V0[3], i18);
                    fArr[7] = W14;
                    fArr[6] = W14;
                }
                f16 = 0.0f;
                path.addRoundRect(rectF10, fArr, Path.Direction.CCW);
                canvas.save();
                f17 = q9Var.P;
                if (f17 != f16) {
                    canvas.clipRect(f16, org.telegram.messenger.g0.T1(f16, f17, (float) Math.pow(1.0f - q9Var.U, 0.4000000059604645d)), getMeasuredWidth(), org.telegram.messenger.g0.T1(getMeasuredHeight(), q9Var.Q, 1.0f - q9Var.U));
                }
                if (n9Var == null) {
                }
                rectF2 = rectF5;
                f18 = f16;
                rectF3 = rectF8;
                canvas.save();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                RectF rectF112 = this.m0;
                if (n9Var != null) {
                }
                f19 = f18;
                f20 = f29;
                rectF4 = rectF3;
                canvas.restore();
                if (f4Var != null) {
                }
                if (q9Var.M != null) {
                }
                canvas.restore();
                if (q9.z1) {
                }
            }
        }
        q9Var.w.setAlpha(q9Var.U);
        float f49 = (f12 * 0.15f) + (q9Var.U * 0.1f) + 0.75f;
        q9Var.w.setScaleX(f49);
        q9Var.w.setScaleY(f49);
        q9Var.w.setTranslationY(q9Var.W);
        q9Var.w.setTranslationX(q9Var.X);
        super.dispatchDraw(canvas);
        i10 = 2;
        if (q9.z1) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        q9 q9Var = this.r0;
        if (keyCode == 24 || keyEvent.getKeyCode() == 25) {
            q9Var.w(keyEvent);
            return true;
        }
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        q9Var.p();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x030f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        boolean z10;
        g9 g9Var;
        int i7;
        ji0 ji0Var;
        q9 q9Var = this.r0;
        float[] fArr = q9Var.o0;
        j4 currentPeerView = q9Var.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            n3 n3Var = currentPeerView.t0;
            if (n3Var.W.x()) {
                float x10 = currentPeerView.getX();
                float y10 = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x10, -y10);
                if (!n3Var.W.n(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x10, y10);
                }
                return true;
            }
        }
        float f10 = 0.0f;
        int i10 = 0;
        if (q9Var.o1 && currentPeerView != null && (ji0Var = currentPeerView.a3) != null) {
            float f11 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f10 += view.getX();
                f11 += view.getY();
            }
            if (currentPeerView.a3.getReactionsWindow() != null && currentPeerView.a3.getReactionsWindow().c != null) {
                motionEvent.offsetLocation(-f10, (-f11) - currentPeerView.a3.getReactionsWindow().c.getTranslationY());
                currentPeerView.a3.getReactionsWindow().c.dispatchTouchEvent(motionEvent);
                return true;
            }
            Rect rect = org.telegram.messenger.g0.Q;
            ji0Var.getHitRect(rect);
            rect.offset((int) f10, (int) f11);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.Z0(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            ji0Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            q9Var.j0 = false;
            org.telegram.messenger.g0.r(q9Var.a1);
            float f12 = q9Var.X;
            if (f12 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, 0.0f);
                q9Var.G = ofFloat;
                ofFloat.addUpdateListener(new b9(this, i10));
                q9Var.G.addListener(new c9(this, i10));
                q9Var.G.setDuration(250L);
                q9Var.G.setInterpolator(xq.f);
                q9Var.G.start();
            }
            if (q9Var.V >= 0.3f) {
                q9Var.u(true);
            }
            q9Var.Q(false);
            q9Var.R(false);
            z9 = true;
        } else {
            z9 = false;
        }
        if (motionEvent.getAction() == 0) {
            q9Var.a0 = false;
            if (currentPeerView != null) {
                b4 b4Var = currentPeerView.h0;
                v8 v8Var = currentPeerView.l0;
                j3 j3Var = currentPeerView.L0;
                fi.m3 m3Var = currentPeerView.o0;
                if (m3Var != null && m3Var.V && v8Var != null && !m3Var.C0.contains(motionEvent.getX() - (currentPeerView.o0.getX() + (j3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.o0.getY() + (j3Var.getY() + currentPeerView.getY()))) && !currentPeerView.F0(v8Var, motionEvent)) {
                    currentPeerView.o0.f(true);
                }
                fi.m3 m3Var2 = currentPeerView.p0;
                if (m3Var2 != null && m3Var2.V && b4Var != null && !m3Var2.C0.contains(motionEvent.getX() - (currentPeerView.p0.getX() + (j3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.p0.getY() + (j3Var.getY() + currentPeerView.getY()))) && !currentPeerView.F0(b4Var, motionEvent)) {
                    currentPeerView.p0.f(true);
                }
            }
            q9Var.n0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        boolean z11 = (q9Var.y || q9Var.G0 || q9Var.H0) ? false : true;
        float f13 = q9Var.e0;
        SparseArray sparseArray = this.p0;
        if (f13 == 0.0f && !q9Var.j0 && q9Var.n0.F0 == 1 && motionEvent.getAction() == 2 && z11) {
            float floatValue = ((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0);
            if ((floatValue != 0.0f && (((i7 = (g9Var = q9Var.n0).I0) == 0 && g9Var.K0 == 0.0f && floatValue < 0.0f) || (i7 == g9Var.getAdapter().b() - 1 && g9Var.K0 == 0.0f && floatValue > 0.0f))) || q9Var.X != 0.0f) {
                float f14 = q9Var.X;
                if (f14 == 0.0f) {
                    q9Var.Y = -floatValue;
                }
                if ((floatValue < 0.0f && q9Var.Y > 0.0f) || (floatValue > 0.0f && q9Var.Y < 0.0f)) {
                    floatValue *= 0.2f;
                }
                q9Var.X = f14 - floatValue;
                q9.i(q9Var);
                float f15 = q9Var.X;
                if ((f15 > 0.0f && q9Var.Y < 0.0f) || (f15 < 0.0f && q9Var.Y > 0.0f)) {
                    q9Var.X = 0.0f;
                }
                z10 = true;
                if (currentPeerView != null && q9Var.e0 == 0.0f && !q9Var.j0 && !q9Var.K0 && !q9Var.H0 && q9Var.n0.F0 != 1) {
                    org.telegram.messenger.g0.r1(currentPeerView.L0, this, fArr);
                    motionEvent.offsetLocation(-fArr[0], -fArr[1]);
                    j4 currentPeerView2 = q9Var.n0.getCurrentPeerView();
                    currentPeerView2.G2.a(motionEvent, currentPeerView2.L0, null, null, 0);
                    motionEvent.offsetLocation(fArr[0], fArr[1]);
                }
                if (motionEvent.getAction() != 1 || motionEvent.getAction() == 3) {
                    sparseArray.clear();
                } else {
                    for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
                        sparseArray.put(motionEvent.getPointerId(i11), Float.valueOf(motionEvent.getX(i11)));
                    }
                }
                if (!z10) {
                    boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        if (q9Var.e0 != 0.0f && !q9Var.f1 && q9Var.p0 < org.telegram.messenger.g0.L(20.0f)) {
                            q9Var.o(q9Var.x.f > 0.5f);
                        }
                        j4 z12 = q9Var.z();
                        if (z12 != null) {
                            z12.t0.w0 = false;
                        }
                    }
                    if (z9 && !q9Var.a0) {
                        q9Var.m();
                    }
                    if (!dispatchTouchEvent && (!q9.w1 || !q9Var.q0)) {
                        return false;
                    }
                }
                return true;
            }
        }
        z10 = false;
        if (currentPeerView != null) {
            org.telegram.messenger.g0.r1(currentPeerView.L0, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            j4 currentPeerView22 = q9Var.n0.getCurrentPeerView();
            currentPeerView22.G2.a(motionEvent, currentPeerView22.L0, null, null, 0);
            motionEvent.offsetLocation(fArr[0], fArr[1]);
        }
        if (motionEvent.getAction() != 1) {
        }
        sparseArray.clear();
        if (!z10) {
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.r0.y0) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.Components.tt0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q9 q9Var = this.r0;
        if (q9Var.b && !q9Var.c) {
            org.telegram.ui.ActionBar.f2 f2Var = this.q0;
            org.telegram.messenger.g0.a3(f2Var.getParentActivity(), f2Var.getClassGuid());
        }
        setTag(R.id.bulletin_delegate_tag, new d9(this));
        qs.f(q9Var.h).c(q9Var, qs.x5);
        qs.f(q9Var.h).c(q9Var, qs.v5);
        qs.f(q9Var.h).c(q9Var, qs.d1);
        qs.f(q9Var.h).c(q9Var, qs.c1);
        qs.f(q9Var.h).c(q9Var, qs.w5);
    }

    @Override // org.telegram.ui.Components.tt0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
        q9 q9Var = this.r0;
        qs.f(q9Var.h).n(q9Var, qs.x5);
        qs.f(q9Var.h).n(q9Var, qs.v5);
        qs.f(q9Var.h).n(q9Var, qs.d1);
        qs.f(q9Var.h).n(q9Var, qs.c1);
        qs.f(q9Var.h).n(q9Var, qs.w5);
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01e2  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f10;
        g2 g2Var;
        p9 p9Var;
        j4 currentPeerView;
        boolean z9;
        f8 f8Var;
        i4 i4Var;
        j4 currentPeerView2;
        h4 h4Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        g2 g2Var2;
        q9 q9Var = this.r0;
        l3 l3Var = q9Var.a1;
        if (motionEvent.getAction() == 0 && q9Var.U == 1.0f) {
            float x10 = motionEvent.getX();
            this.h0 = x10;
            this.f0 = x10;
            this.g0 = motionEvent.getY();
            q9Var.g0 = false;
            q9Var.f0 = (q9Var.H0 || q9.c(q9Var, q9Var.s, motionEvent.getX(), motionEvent.getY(), false)) ? false : true;
            q9Var.h0 = (q9Var.H0 || q9.c(q9Var, q9Var.s, motionEvent.getX(), motionEvent.getY(), true)) ? false : true;
            q9Var.Q(q9Var.f0 && !q9Var.l1);
            j4 z10 = q9Var.z();
            if (q9Var.f0 && z10 != null && (g2Var2 = z10.u0) != null) {
                g2Var2.setAllowTouches(false);
            }
            if (q9Var.f0 && !q9Var.H0 && q9Var.l1) {
                f8 f8Var2 = new f8(this, 5);
                q9Var.m1 = f8Var2;
                org.telegram.messenger.g0.i3(f8Var2, 150L);
            }
            if (q9Var.f0 && !q9Var.y && !q9Var.H0 && !q9Var.i1) {
                org.telegram.messenger.g0.i3(l3Var, 400L);
            }
            f10 = 1.0f;
        } else if (motionEvent.getAction() == 2) {
            float abs = Math.abs(this.g0 - motionEvent.getY());
            float abs2 = Math.abs(this.f0 - motionEvent.getX());
            if (q9Var.Z0 && q9Var.k0 && !q9Var.e1 && !q9Var.j0 && (i4Var = q9Var.F0) != null && ((p9) i4Var.c) != null && (currentPeerView2 = q9Var.n0.getCurrentPeerView()) != null && (h4Var = currentPeerView2.x1) != null && h4Var.b == null && h4Var.e) {
                long j3 = currentPeerView2.A2;
                if (j3 <= 0 && (storyItem = h4Var.a) != null && (messageMedia = storyItem.media) != null && (document = messageMedia.document) != null) {
                    j3 = (long) (ij.H0(document) * 1000.0d);
                }
                if (j3 > 0) {
                    float x11 = motionEvent.getX();
                    p9 p9Var2 = (p9) q9Var.F0.c;
                    f10 = 1.0f;
                    if (((int) (p9Var2.seek((x11 - this.h0) / org.telegram.messenger.g0.L(220.0f), j3) * 10.0f)) != ((int) (p9Var2.currentSeek * 10.0f))) {
                        try {
                            currentPeerView2.performHapticFeedback(9, 1);
                        } catch (Exception unused) {
                        }
                    }
                    currentPeerView2.L0.invalidate();
                    this.h0 = x11;
                    if (abs > abs2 && !q9Var.k0 && !q9Var.g0 && abs > org.telegram.messenger.g0.e * 2.0f) {
                        q9Var.g0 = true;
                    }
                    if (!q9Var.j0 && !q9Var.k0 && !q9Var.y && q9Var.h0) {
                        if (abs > abs2 && abs > org.telegram.messenger.g0.e * 2.0f) {
                            q9Var.j0 = true;
                            currentPeerView = q9Var.n0.getCurrentPeerView();
                            if (currentPeerView != null) {
                                currentPeerView.n0();
                            }
                            boolean z11 = currentPeerView == null && !currentPeerView.x1.f && (currentPeerView.l1 || (currentPeerView.m1 && currentPeerView.k3));
                            q9Var.l0 = (!z11 || currentPeerView == null || currentPeerView.m1 || currentPeerView.o1 || q9Var.t1 != null) ? false : true;
                            z9 = (z11 || currentPeerView.L2 || currentPeerView.x1.a == null || q9Var.t1 != null) ? false : true;
                            q9Var.c0 = z9;
                            if (z9 && this.f != 0) {
                                q9Var.c0 = false;
                            }
                            if (q9Var.c0) {
                                q9Var.r();
                            }
                            q9Var.Z = 0.0f;
                            f8Var = q9Var.m1;
                            if (f8Var != null) {
                                org.telegram.messenger.g0.r(f8Var);
                                q9Var.m1.run();
                                q9Var.m1 = null;
                            }
                            org.telegram.messenger.g0.r(l3Var);
                        }
                        q9Var.E();
                    }
                }
            }
            f10 = 1.0f;
            if (abs > abs2) {
                q9Var.g0 = true;
            }
            if (!q9Var.j0) {
                if (abs > abs2) {
                    q9Var.j0 = true;
                    currentPeerView = q9Var.n0.getCurrentPeerView();
                    if (currentPeerView != null) {
                    }
                    if (currentPeerView == null) {
                    }
                    q9Var.l0 = (!z11 || currentPeerView == null || currentPeerView.m1 || currentPeerView.o1 || q9Var.t1 != null) ? false : true;
                    if (z11) {
                    }
                    q9Var.c0 = z9;
                    if (z9) {
                        q9Var.c0 = false;
                    }
                    if (q9Var.c0) {
                    }
                    q9Var.Z = 0.0f;
                    f8Var = q9Var.m1;
                    if (f8Var != null) {
                    }
                    org.telegram.messenger.g0.r(l3Var);
                }
                q9Var.E();
            }
        } else {
            f10 = 1.0f;
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                org.telegram.messenger.g0.r(l3Var);
                f8 f8Var3 = q9Var.m1;
                if (f8Var3 != null) {
                    org.telegram.messenger.g0.r(f8Var3);
                    q9Var.m1 = null;
                }
                q9Var.Q(false);
                q9Var.g0 = false;
                q9Var.k0 = false;
                i4 i4Var2 = q9Var.F0;
                if (i4Var2 != null && (p9Var = (p9) i4Var2.c) != null) {
                    p9Var.setSeeking(false);
                }
                j4 z12 = q9Var.z();
                if (z12 != null && (g2Var = z12.u0) != null) {
                    g2Var.setAllowTouches(true);
                }
            }
        }
        t5 t5Var = q9Var.x;
        boolean z13 = t5Var != null && t5Var.f == f10;
        if (!q9Var.j0 && !z13) {
            q9Var.i0.onTouchEvent(motionEvent);
        }
        return q9Var.j0 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        q9 q9Var = this.r0;
        ((FrameLayout.LayoutParams) q9Var.c1.getLayoutParams()).topMargin = org.telegram.messenger.g0.m - org.telegram.messenger.g0.L(2.0f);
        q9Var.c1.getLayoutParams().height = org.telegram.messenger.g0.L(2.0f);
        super.onMeasure(i7, i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        g2 g2Var;
        int action = motionEvent.getAction();
        q9 q9Var = this.r0;
        int i7 = 1;
        if (action == 1 || motionEvent.getAction() == 3) {
            q9Var.j0 = false;
            q9Var.Q(false);
            if (q9Var.V >= 1.0f) {
                q9Var.u(true);
            } else if (!q9Var.G0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(q9Var.W, 0.0f);
                q9Var.G = ofFloat;
                ofFloat.addUpdateListener(new b9(this, i7));
                q9Var.G.addListener(new c9(this, i7));
                q9Var.G.setDuration(150L);
                q9Var.G.setInterpolator(xq.f);
                q9Var.G.start();
            }
            j4 z9 = q9Var.z();
            if (z9 != null && (g2Var = z9.u0) != null) {
                g2Var.setAllowTouches(true);
            }
        }
        if (!q9Var.j0 && !q9Var.y && q9Var.Z == 0.0f && ((q9Var.e0 == 0.0f || (!q9Var.f0 && !q9Var.g0)) && !q9Var.i1)) {
            return false;
        }
        q9Var.i0.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        super.requestDisallowInterceptTouchEvent(z9);
        this.r0.f0 = false;
    }
}
