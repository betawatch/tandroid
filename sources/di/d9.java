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
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class d9 extends rt0 {
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
    public final /* synthetic */ p9 r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(p9 p9Var, Context context, org.telegram.ui.ActionBar.f2 f2Var) {
        super(context, null);
        this.r0 = p9Var;
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
    @Override // org.telegram.ui.Components.rt0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        boolean z9;
        int i7;
        e4 e4Var;
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
        n7 n7Var;
        float f23;
        Paint paint;
        View view;
        n7 n7Var2;
        k9 k9Var;
        j9 j9Var;
        i4 currentPeerView;
        j3 j3Var;
        n7 n7Var3;
        int i11;
        i4 z10;
        dh0 dh0Var;
        boolean z11;
        float f24;
        p9 p9Var = this.r0;
        RectF rectF5 = p9Var.T;
        m9 m9Var = p9Var.s0;
        float f25 = 1.0f;
        canvas.drawColor(i0.a.o(-16777216, (int) ((((1.0f - p9Var.V) * 0.5f) + 0.5f) * p9Var.U * 255.0f)));
        int i12 = 0;
        if (p9Var.b) {
            boolean z12 = (1.0f - p9Var.V) * p9Var.U == 1.0f;
            if (p9Var.J0 != z12) {
                p9Var.J0 = z12;
                org.telegram.ui.ActionBar.f2 f2Var = this.q0;
                if (f2Var.getLayoutContainer() != null) {
                    f2Var.getLayoutContainer().invalidate();
                }
            }
        }
        i4 currentPeerView2 = p9Var.n0.getCurrentPeerView();
        RectF rectF6 = this.o0;
        RectF rectF7 = this.n0;
        if (currentPeerView2 != null) {
            e4 e4Var2 = currentPeerView2.X0;
            if (p9Var.U0) {
                e4Var2.a.getImageReceiver().O0(p9Var.U == 1.0f, true);
            } else {
                e4Var2.a.getImageReceiver().O0(true, false);
            }
            if (p9Var.g1) {
                p9Var.g1 = false;
                View view2 = e4Var2.a;
                c4 c4Var = e4Var2.a;
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
                        if (view2.getParent() != p9Var.n0) {
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
                rectF7.set(f26, f27, c4Var.getMeasuredWidth() + f26, c4Var.getMeasuredHeight() + f27);
                rectF6.set(0.0f, currentPeerView2.L0.getTop() + currentPeerView2.getTop(), p9Var.w.getMeasuredWidth(), p9Var.w.getMeasuredHeight());
                p9Var.w.getMatrix().mapRect(rectF7);
                p9Var.w.getMatrix().mapRect(rectF6);
            } else {
                f10 = 1.0f;
                f11 = 255.0f;
                z11 = true;
                i7 = 0;
            }
            e4Var = e4Var2;
            z9 = z11;
        } else {
            f10 = 1.0f;
            f11 = 255.0f;
            z9 = 1;
            i7 = 0;
            e4Var = null;
        }
        p9Var.c1.setAlpha(f10 - p9Var.V);
        if (p9Var.X == 0.0f) {
            float f28 = f10;
            f12 = f28 - Utilities.i(Math.abs(p9Var.W / getMeasuredHeight()), f28, 0.0f);
        } else {
            f12 = 1.0f;
        }
        p9Var.n0.setHorizontalProgressToDismiss((p9Var.X / p9Var.w.getMeasuredWidth()) * p9Var.U);
        if (p9Var.N != 0.0f || p9Var.O != 0.0f) {
            float f29 = p9Var.U;
            if (f29 != 1.0f) {
                if (p9Var.G0 && p9Var.U0) {
                    float i14 = 1.0f - Utilities.i(((1.0f - f29) - 0.8f) / 0.100000024f, 1.0f, 0.0f);
                    f13 = 0.15f;
                    f14 = Utilities.i(com.google.android.recaptcha.internal.a.v(1.0f, i14, 0.05f, f29), 1.0f, 0.0f);
                    i10 = 2;
                    p9Var.w.setAlpha(i14);
                } else {
                    f13 = 0.15f;
                    i10 = 2;
                    p9Var.w.setAlpha(1.0f);
                    f14 = f29;
                }
                if (!p9Var.G0 || m9Var == null || m9Var.c == null) {
                    rectF = rectF7;
                } else {
                    e9 e9Var = p9Var.w;
                    rectF = rectF7;
                    e9Var.setAlpha(e9Var.getAlpha() * ((float) Math.pow(f29, 0.20000000298023224d)));
                }
                e9 e9Var2 = p9Var.w;
                float left = (p9Var.N - e9Var2.getLeft()) - (p9Var.w.getMeasuredWidth() / 2.0f);
                float f30 = p9Var.U;
                e9Var2.setTranslationX((p9Var.X * f30) + ((1.0f - f30) * left));
                e9 e9Var3 = p9Var.w;
                float top = (p9Var.O - e9Var3.getTop()) - (p9Var.w.getMeasuredHeight() / 2.0f);
                float f31 = p9Var.U;
                e9Var3.setTranslationY((p9Var.W * f31) + ((1.0f - f31) * top));
                float T1 = org.telegram.messenger.g0.T1(p9Var.R / p9Var.w.getMeasuredWidth(), (f12 * f13) + 0.85f, f14);
                p9Var.w.setScaleX(T1);
                p9Var.w.setScaleY(T1);
                Path path = this.j0;
                path.rewind();
                float f32 = p9Var.N;
                float f33 = p9Var.R / 2.0f;
                float f34 = p9Var.O;
                float f35 = p9Var.S / 2.0f;
                float f36 = f35 + f34;
                RectF rectF8 = this.k0;
                rectF8.set(f32 - f33, f34 - f35, f33 + f32, f36);
                boolean z13 = p9Var.G0;
                RectF rectF9 = this.l0;
                if (z13 && p9Var.U0) {
                    rectF9.set(rectF6);
                } else if (currentPeerView2 != null) {
                    rectF9.set(0.0f, currentPeerView2.L0.getTop() + p9Var.b0, getMeasuredWidth(), getMeasuredHeight() + p9Var.b0);
                } else {
                    rectF9.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                if (p9Var.G0 && p9Var.U0) {
                    rectF8.inset(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
                }
                float T12 = org.telegram.messenger.g0.T1(rectF8.centerX(), rectF9.centerX(), p9Var.U);
                float T13 = org.telegram.messenger.g0.T1(rectF8.centerY(), rectF9.centerY(), p9Var.U);
                float T14 = org.telegram.messenger.g0.T1(rectF8.height(), rectF9.height(), f14);
                float T15 = org.telegram.messenger.g0.T1(rectF8.width(), rectF9.width(), f14);
                if (p9Var.G0 && p9Var.U0) {
                    f15 = T12;
                    rectF8.inset(-org.telegram.messenger.g0.L(12.0f), -org.telegram.messenger.g0.L(12.0f));
                } else {
                    f15 = T12;
                }
                RectF rectF10 = org.telegram.messenger.g0.P;
                float f37 = T15 / 2.0f;
                float f38 = T14 / 2.0f;
                rectF10.set(f15 - f37, T13 - f38, f15 + f37, T13 + f38);
                boolean z14 = p9Var.U0;
                float[] fArr2 = this.i0;
                if (z14) {
                    float T16 = org.telegram.messenger.g0.T1(p9Var.R / 2.0f, 0.0f, f14);
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
                    int[] iArr = p9Var.V0;
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
                        f17 = p9Var.P;
                        if (f17 != f16 && p9Var.Q != f16) {
                            canvas.clipRect(f16, org.telegram.messenger.g0.T1(f16, f17, (float) Math.pow(1.0f - p9Var.U, 0.4000000059604645d)), getMeasuredWidth(), org.telegram.messenger.g0.T1(getMeasuredHeight(), p9Var.Q, 1.0f - p9Var.U));
                        }
                        if (m9Var == null && (n7Var3 = m9Var.m) != null && n7Var3.w && p9Var.U0) {
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
                        if (m9Var != null || m9Var.c == null || (currentPeerView = p9Var.n0.getCurrentPeerView()) == null || (j3Var = currentPeerView.L0) == null) {
                            f19 = f18;
                            f20 = f29;
                            rectF4 = rectF3;
                        } else {
                            boolean z15 = m9Var.c.Q0;
                            f19 = f18;
                            rectF9.set(j3Var.getX() + currentPeerView.getX() + p9Var.X + p9Var.w.getLeft(), j3Var.getY() + currentPeerView.getY() + p9Var.W + p9Var.w.getTop(), ((p9Var.X + p9Var.w.getRight()) - (p9Var.w.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - j3Var.getRight()), ((p9Var.W + p9Var.w.getBottom()) - (p9Var.w.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - j3Var.getBottom()));
                            org.telegram.messenger.g0.Z1(rectF3, rectF9, f29, rectF11);
                            ImageReceiver imageReceiver = m9Var.c;
                            float f39 = imageReceiver.K0;
                            float f40 = imageReceiver.L0;
                            float f41 = imageReceiver.M0;
                            float f42 = imageReceiver.N0;
                            imageReceiver.A0(rectF11);
                            float f43 = 1.0f - f29;
                            m9Var.c.setAlpha(f43);
                            f20 = f29;
                            rectF4 = rectF3;
                            m9Var.c.O0(z9, false);
                            int saveCount = canvas.getSaveCount();
                            j9 j9Var2 = m9Var.f;
                            if (j9Var2 != null) {
                                j9Var2.k(f43, canvas, rectF11, p9Var.E);
                            }
                            m9Var.c.h(canvas, null);
                            k9 k9Var2 = m9Var.e;
                            if (k9Var2 != null) {
                                k9Var2.o(canvas, rectF11, f43);
                            }
                            m9Var.c.O0(z15, false);
                            m9Var.c.y0(f39, f40, f41, f42);
                            canvas.restoreToCount(saveCount);
                        }
                        canvas.restore();
                        if (e4Var != null) {
                            c4 c4Var2 = e4Var.a;
                            float f44 = p9Var.X;
                            float f45 = p9Var.W;
                            if (p9Var.G0 && p9Var.U0) {
                                rectF9.set(rectF);
                            } else {
                                for (View view3 = c4Var2; view3 != this && view3 != null; view3 = (View) view3.getParent()) {
                                    if (view3.getParent() == this) {
                                        f44 += view3.getLeft();
                                        f45 += view3.getTop();
                                    } else if (view3.getParent() != p9Var.n0) {
                                        float x10 = view3.getX() + f44;
                                        f45 = view3.getY() + f45;
                                        f44 = x10;
                                    }
                                    if (!(view3.getParent() instanceof View)) {
                                        break;
                                    }
                                }
                                rectF9.set(f44, f45, c4Var2.getMeasuredWidth() + f44, c4Var2.getMeasuredHeight() + f45);
                            }
                            org.telegram.messenger.g0.Z1(rectF4, rectF9, p9Var.U, rectF11);
                            int saveCount2 = canvas.getSaveCount();
                            if (m9Var != null && (j9Var = m9Var.f) != null) {
                                j9Var.k(1.0f - f20, canvas, rectF11, p9Var.E);
                            }
                            if (p9Var.U0) {
                                boolean z16 = (m9Var == null || m9Var.l == null) ? false : true;
                                if (z16 && p9Var.U == f19) {
                                    f21 = f20;
                                } else {
                                    if (m9Var != null && (n7Var2 = m9Var.m) != null && n7Var2.w) {
                                        canvas.saveLayerAlpha(rectF11.left - org.telegram.messenger.g0.L(4.0f), rectF11.top - org.telegram.messenger.g0.L(4.0f), rectF11.right + org.telegram.messenger.g0.L(4.0f), rectF11.bottom + org.telegram.messenger.g0.L(4.0f), qs.e4, 31);
                                    }
                                    c4Var2.getImageReceiver().A0(rectF11);
                                    c4Var2.getImageReceiver().J0((int) org.telegram.messenger.g0.T1(rectF11.width() / 2.0f, ((m9Var == null || m9Var.b == null) ? null : Integer.valueOf((int) (m9Var.b.W0[0] * ((!m9Var.n || (view = m9Var.a) == null || view.getParent() == null) ? 1.0f : ((ViewGroup) m9Var.a.getParent()).getScaleY())))) != null ? r4.intValue() : rectF11.width() / 2.0f, 1.0f - p9Var.U));
                                    c4Var2.getImageReceiver().O0(true, false);
                                    float f46 = z16 ? p9Var.U : 1.0f;
                                    if (m9Var == null || m9Var.k >= 1.0f || (paint = m9Var.j) == null) {
                                        f21 = f20;
                                        f22 = f46;
                                    } else {
                                        paint.setAlpha((int) ((1.0f - f20) * f11));
                                        canvas.drawCircle(rectF11.centerX(), rectF11.centerY(), rectF11.width() / 2.0f, m9Var.j);
                                        f21 = f20;
                                        f22 = org.telegram.messenger.g0.T1(m9Var.k, f46, f21);
                                    }
                                    c4Var2.getImageReceiver().setAlpha(f22);
                                    e4Var.b(p9Var.U, canvas, rectF11, !p9.z1);
                                    c4Var2.getImageReceiver().h(canvas, null);
                                    c4Var2.getImageReceiver().setAlpha(f46);
                                    c4Var2.getImageReceiver().O0(false, false);
                                    if (m9Var != null && (n7Var = m9Var.m) != null && n7Var.w) {
                                        RectF rectF12 = org.telegram.messenger.g0.P;
                                        rectF12.set(rectF11);
                                        f23 = 1.0f;
                                        r7.k(1.0f - p9Var.U, f19, canvas, rectF12, true);
                                        canvas.restore();
                                        if (p9Var.U != f23 && z16) {
                                            ImageReceiver imageReceiver2 = m9Var.l;
                                            RectF rectF13 = rectF2;
                                            rectF13.set(imageReceiver2.K0, imageReceiver2.L0, imageReceiver2.y(), m9Var.l.A());
                                            ImageReceiver imageReceiver3 = m9Var.l;
                                            int i15 = imageReceiver3.W0[0];
                                            boolean z17 = imageReceiver3.Q0;
                                            imageReceiver3.A0(rectF11);
                                            m9Var.l.J0((int) (rectF11.width() / 2.0f));
                                            m9Var.l.O0(true, false);
                                            canvas.saveLayerAlpha(rectF11, (int) ((1.0f - p9Var.U) * f11), 31);
                                            m9Var.l.h(canvas, null);
                                            canvas.restore();
                                            m9Var.l.O0(z17, false);
                                            m9Var.l.A0(rectF13);
                                            m9Var.l.J0(i15);
                                        }
                                        if (m9Var != null && (k9Var = m9Var.e) != null) {
                                            k9Var.o(canvas, rectF11, 1.0f - f21);
                                        }
                                    }
                                }
                                f23 = 1.0f;
                                if (p9Var.U != f23) {
                                    ImageReceiver imageReceiver22 = m9Var.l;
                                    RectF rectF132 = rectF2;
                                    rectF132.set(imageReceiver22.K0, imageReceiver22.L0, imageReceiver22.y(), m9Var.l.A());
                                    ImageReceiver imageReceiver32 = m9Var.l;
                                    int i152 = imageReceiver32.W0[0];
                                    boolean z172 = imageReceiver32.Q0;
                                    imageReceiver32.A0(rectF11);
                                    m9Var.l.J0((int) (rectF11.width() / 2.0f));
                                    m9Var.l.O0(true, false);
                                    canvas.saveLayerAlpha(rectF11, (int) ((1.0f - p9Var.U) * f11), 31);
                                    m9Var.l.h(canvas, null);
                                    canvas.restore();
                                    m9Var.l.O0(z172, false);
                                    m9Var.l.A0(rectF132);
                                    m9Var.l.J0(i152);
                                }
                                if (m9Var != null) {
                                    k9Var.o(canvas, rectF11, 1.0f - f21);
                                }
                            }
                            canvas.restoreToCount(saveCount2);
                        }
                        if (p9Var.M != null) {
                            float i16 = Utilities.i(p9Var.U / 0.4f, 1.0f, 0.0f);
                            if (i16 != 1.0f) {
                                RectF rectF14 = org.telegram.messenger.g0.P;
                                float f47 = p9Var.N;
                                float f48 = p9Var.O;
                                rectF14.set(f47, f48, p9Var.R + f47, p9Var.S + f48);
                                rectF14.inset(-org.telegram.messenger.g0.L(16.0f), -org.telegram.messenger.g0.L(16.0f));
                                if (i16 != 0.0f) {
                                    canvas.saveLayerAlpha(rectF14, (int) ((1.0f - i16) * f11), 31);
                                } else {
                                    canvas.save();
                                }
                                canvas.translate(p9Var.K, p9Var.L);
                                ((org.telegram.ui.Cells.t2) p9Var.M).G(canvas);
                                canvas.restore();
                            }
                        }
                        canvas.restore();
                        if (p9.z1) {
                            ArrayList arrayList = p9Var.x0;
                            p9Var.W();
                            p9Var.U = 0.0f;
                            p9Var.S(true);
                            p9Var.d = false;
                            p9.w1 = true;
                            p9Var.b0 = p9Var.W;
                            if (m9Var.d != null && (z10 = p9Var.z()) != null && (dh0Var = z10.X0.d) != null) {
                                dh0 dh0Var2 = m9Var.d;
                                dh0Var.c = dh0Var2.c;
                                dh0Var.f = dh0Var2.f;
                                dh0Var.b = dh0Var2.b;
                                dh0Var.a = System.currentTimeMillis();
                                dh0Var.c();
                            }
                            p9Var.E = true;
                            float[] fArr3 = new float[i10];
                            // fill-array-data instruction
                            fArr3[0] = 0.0f;
                            fArr3[1] = 1.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr3);
                            p9Var.F = ofFloat;
                            ofFloat.addUpdateListener(new x8(p9Var, 1));
                            p9Var.I0.d();
                            e9 e9Var4 = p9Var.w;
                            if (e9Var4 != null) {
                                v.c = true;
                                i11 = 2;
                                e9Var4.setLayerType(2, null);
                            } else {
                                i11 = 2;
                            }
                            p9Var.F.addListener(new y8(p9Var, i11));
                            p9Var.F.setStartDelay(40L);
                            p9Var.F.setDuration(250L);
                            p9Var.F.setInterpolator(xq.f);
                            p9Var.F.start();
                            if (!arrayList.isEmpty()) {
                                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                    ((Runnable) arrayList.get(i17)).run();
                                }
                                arrayList.clear();
                            }
                            p9.z1 = false;
                            return;
                        }
                        return;
                    }
                    int i18 = i7;
                    float W1 = org.telegram.messenger.g0.W1(f29, iArr[i7], i18);
                    fArr[z9] = W1;
                    fArr[i18] = W1;
                    float W12 = org.telegram.messenger.g0.W1(f29, p9Var.V0[z9], i18);
                    fArr[3] = W12;
                    fArr[i10] = W12;
                    float W13 = org.telegram.messenger.g0.W1(f29, p9Var.V0[i10], i18);
                    fArr[5] = W13;
                    fArr[4] = W13;
                    float W14 = org.telegram.messenger.g0.W1(f29, p9Var.V0[3], i18);
                    fArr[7] = W14;
                    fArr[6] = W14;
                }
                f16 = 0.0f;
                path.addRoundRect(rectF10, fArr, Path.Direction.CCW);
                canvas.save();
                f17 = p9Var.P;
                if (f17 != f16) {
                    canvas.clipRect(f16, org.telegram.messenger.g0.T1(f16, f17, (float) Math.pow(1.0f - p9Var.U, 0.4000000059604645d)), getMeasuredWidth(), org.telegram.messenger.g0.T1(getMeasuredHeight(), p9Var.Q, 1.0f - p9Var.U));
                }
                if (m9Var == null) {
                }
                rectF2 = rectF5;
                f18 = f16;
                rectF3 = rectF8;
                canvas.save();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                RectF rectF112 = this.m0;
                if (m9Var != null) {
                }
                f19 = f18;
                f20 = f29;
                rectF4 = rectF3;
                canvas.restore();
                if (e4Var != null) {
                }
                if (p9Var.M != null) {
                }
                canvas.restore();
                if (p9.z1) {
                }
            }
        }
        p9Var.w.setAlpha(p9Var.U);
        float f49 = (f12 * 0.15f) + (p9Var.U * 0.1f) + 0.75f;
        p9Var.w.setScaleX(f49);
        p9Var.w.setScaleY(f49);
        p9Var.w.setTranslationY(p9Var.W);
        p9Var.w.setTranslationX(p9Var.X);
        super.dispatchDraw(canvas);
        i10 = 2;
        if (p9.z1) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        p9 p9Var = this.r0;
        if (keyCode == 24 || keyEvent.getKeyCode() == 25) {
            p9Var.w(keyEvent);
            return true;
        }
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        p9Var.p();
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
        f9 f9Var;
        int i7;
        ii0 ii0Var;
        p9 p9Var = this.r0;
        float[] fArr = p9Var.o0;
        i4 currentPeerView = p9Var.n0.getCurrentPeerView();
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
        if (p9Var.o1 && currentPeerView != null && (ii0Var = currentPeerView.a3) != null) {
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
            ii0Var.getHitRect(rect);
            rect.offset((int) f10, (int) f11);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.Z0(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            ii0Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            p9Var.j0 = false;
            org.telegram.messenger.g0.r(p9Var.a1);
            float f12 = p9Var.X;
            if (f12 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, 0.0f);
                p9Var.G = ofFloat;
                ofFloat.addUpdateListener(new a9(this, i10));
                p9Var.G.addListener(new b9(this, i10));
                p9Var.G.setDuration(250L);
                p9Var.G.setInterpolator(xq.f);
                p9Var.G.start();
            }
            if (p9Var.V >= 0.3f) {
                p9Var.u(true);
            }
            p9Var.Q(false);
            p9Var.R(false);
            z9 = true;
        } else {
            z9 = false;
        }
        if (motionEvent.getAction() == 0) {
            p9Var.a0 = false;
            if (currentPeerView != null) {
                a4 a4Var = currentPeerView.h0;
                u8 u8Var = currentPeerView.l0;
                j3 j3Var = currentPeerView.L0;
                fi.m3 m3Var = currentPeerView.o0;
                if (m3Var != null && m3Var.V && u8Var != null && !m3Var.C0.contains(motionEvent.getX() - (currentPeerView.o0.getX() + (j3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.o0.getY() + (j3Var.getY() + currentPeerView.getY()))) && !currentPeerView.F0(u8Var, motionEvent)) {
                    currentPeerView.o0.f(true);
                }
                fi.m3 m3Var2 = currentPeerView.p0;
                if (m3Var2 != null && m3Var2.V && a4Var != null && !m3Var2.C0.contains(motionEvent.getX() - (currentPeerView.p0.getX() + (j3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.p0.getY() + (j3Var.getY() + currentPeerView.getY()))) && !currentPeerView.F0(a4Var, motionEvent)) {
                    currentPeerView.p0.f(true);
                }
            }
            p9Var.n0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        boolean z11 = (p9Var.y || p9Var.G0 || p9Var.H0) ? false : true;
        float f13 = p9Var.e0;
        SparseArray sparseArray = this.p0;
        if (f13 == 0.0f && !p9Var.j0 && p9Var.n0.F0 == 1 && motionEvent.getAction() == 2 && z11) {
            float floatValue = ((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0);
            if ((floatValue != 0.0f && (((i7 = (f9Var = p9Var.n0).I0) == 0 && f9Var.K0 == 0.0f && floatValue < 0.0f) || (i7 == f9Var.getAdapter().b() - 1 && f9Var.K0 == 0.0f && floatValue > 0.0f))) || p9Var.X != 0.0f) {
                float f14 = p9Var.X;
                if (f14 == 0.0f) {
                    p9Var.Y = -floatValue;
                }
                if ((floatValue < 0.0f && p9Var.Y > 0.0f) || (floatValue > 0.0f && p9Var.Y < 0.0f)) {
                    floatValue *= 0.2f;
                }
                p9Var.X = f14 - floatValue;
                p9.i(p9Var);
                float f15 = p9Var.X;
                if ((f15 > 0.0f && p9Var.Y < 0.0f) || (f15 < 0.0f && p9Var.Y > 0.0f)) {
                    p9Var.X = 0.0f;
                }
                z10 = true;
                if (currentPeerView != null && p9Var.e0 == 0.0f && !p9Var.j0 && !p9Var.K0 && !p9Var.H0 && p9Var.n0.F0 != 1) {
                    org.telegram.messenger.g0.r1(currentPeerView.L0, this, fArr);
                    motionEvent.offsetLocation(-fArr[0], -fArr[1]);
                    i4 currentPeerView2 = p9Var.n0.getCurrentPeerView();
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
                        if (p9Var.e0 != 0.0f && !p9Var.f1 && p9Var.p0 < org.telegram.messenger.g0.L(20.0f)) {
                            p9Var.o(p9Var.x.f > 0.5f);
                        }
                        i4 z12 = p9Var.z();
                        if (z12 != null) {
                            z12.t0.w0 = false;
                        }
                    }
                    if (z9 && !p9Var.a0) {
                        p9Var.m();
                    }
                    if (!dispatchTouchEvent && (!p9.w1 || !p9Var.q0)) {
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
            i4 currentPeerView22 = p9Var.n0.getCurrentPeerView();
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

    @Override // org.telegram.ui.Components.rt0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p9 p9Var = this.r0;
        if (p9Var.b && !p9Var.c) {
            org.telegram.ui.ActionBar.f2 f2Var = this.q0;
            org.telegram.messenger.g0.a3(f2Var.getParentActivity(), f2Var.getClassGuid());
        }
        setTag(R.id.bulletin_delegate_tag, new c9(this));
        qs.f(p9Var.h).c(p9Var, qs.x5);
        qs.f(p9Var.h).c(p9Var, qs.v5);
        qs.f(p9Var.h).c(p9Var, qs.d1);
        qs.f(p9Var.h).c(p9Var, qs.c1);
        qs.f(p9Var.h).c(p9Var, qs.w5);
    }

    @Override // org.telegram.ui.Components.rt0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
        p9 p9Var = this.r0;
        qs.f(p9Var.h).n(p9Var, qs.x5);
        qs.f(p9Var.h).n(p9Var, qs.v5);
        qs.f(p9Var.h).n(p9Var, qs.d1);
        qs.f(p9Var.h).n(p9Var, qs.c1);
        qs.f(p9Var.h).n(p9Var, qs.w5);
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
        o9 o9Var;
        i4 currentPeerView;
        boolean z9;
        s7 s7Var;
        h4 h4Var;
        i4 currentPeerView2;
        g4 g4Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        g2 g2Var2;
        p9 p9Var = this.r0;
        l3 l3Var = p9Var.a1;
        if (motionEvent.getAction() == 0 && p9Var.U == 1.0f) {
            float x10 = motionEvent.getX();
            this.h0 = x10;
            this.f0 = x10;
            this.g0 = motionEvent.getY();
            p9Var.g0 = false;
            p9Var.f0 = (p9Var.H0 || p9.c(p9Var, p9Var.s, motionEvent.getX(), motionEvent.getY(), false)) ? false : true;
            p9Var.h0 = (p9Var.H0 || p9.c(p9Var, p9Var.s, motionEvent.getX(), motionEvent.getY(), true)) ? false : true;
            p9Var.Q(p9Var.f0 && !p9Var.l1);
            i4 z10 = p9Var.z();
            if (p9Var.f0 && z10 != null && (g2Var2 = z10.u0) != null) {
                g2Var2.setAllowTouches(false);
            }
            if (p9Var.f0 && !p9Var.H0 && p9Var.l1) {
                s7 s7Var2 = new s7(this, 6);
                p9Var.m1 = s7Var2;
                org.telegram.messenger.g0.i3(s7Var2, 150L);
            }
            if (p9Var.f0 && !p9Var.y && !p9Var.H0 && !p9Var.i1) {
                org.telegram.messenger.g0.i3(l3Var, 400L);
            }
            f10 = 1.0f;
        } else if (motionEvent.getAction() == 2) {
            float abs = Math.abs(this.g0 - motionEvent.getY());
            float abs2 = Math.abs(this.f0 - motionEvent.getX());
            if (p9Var.Z0 && p9Var.k0 && !p9Var.e1 && !p9Var.j0 && (h4Var = p9Var.F0) != null && ((o9) h4Var.c) != null && (currentPeerView2 = p9Var.n0.getCurrentPeerView()) != null && (g4Var = currentPeerView2.x1) != null && g4Var.b == null && g4Var.e) {
                long j3 = currentPeerView2.A2;
                if (j3 <= 0 && (storyItem = g4Var.a) != null && (messageMedia = storyItem.media) != null && (document = messageMedia.document) != null) {
                    j3 = (long) (ij.H0(document) * 1000.0d);
                }
                if (j3 > 0) {
                    float x11 = motionEvent.getX();
                    o9 o9Var2 = (o9) p9Var.F0.c;
                    f10 = 1.0f;
                    if (((int) (o9Var2.seek((x11 - this.h0) / org.telegram.messenger.g0.L(220.0f), j3) * 10.0f)) != ((int) (o9Var2.currentSeek * 10.0f))) {
                        try {
                            currentPeerView2.performHapticFeedback(9, 1);
                        } catch (Exception unused) {
                        }
                    }
                    currentPeerView2.L0.invalidate();
                    this.h0 = x11;
                    if (abs > abs2 && !p9Var.k0 && !p9Var.g0 && abs > org.telegram.messenger.g0.e * 2.0f) {
                        p9Var.g0 = true;
                    }
                    if (!p9Var.j0 && !p9Var.k0 && !p9Var.y && p9Var.h0) {
                        if (abs > abs2 && abs > org.telegram.messenger.g0.e * 2.0f) {
                            p9Var.j0 = true;
                            currentPeerView = p9Var.n0.getCurrentPeerView();
                            if (currentPeerView != null) {
                                currentPeerView.n0();
                            }
                            boolean z11 = currentPeerView == null && !currentPeerView.x1.f && (currentPeerView.l1 || (currentPeerView.m1 && currentPeerView.k3));
                            p9Var.l0 = (!z11 || currentPeerView == null || currentPeerView.m1 || currentPeerView.o1 || p9Var.t1 != null) ? false : true;
                            z9 = (z11 || currentPeerView.L2 || currentPeerView.x1.a == null || p9Var.t1 != null) ? false : true;
                            p9Var.c0 = z9;
                            if (z9 && this.f != 0) {
                                p9Var.c0 = false;
                            }
                            if (p9Var.c0) {
                                p9Var.r();
                            }
                            p9Var.Z = 0.0f;
                            s7Var = p9Var.m1;
                            if (s7Var != null) {
                                org.telegram.messenger.g0.r(s7Var);
                                p9Var.m1.run();
                                p9Var.m1 = null;
                            }
                            org.telegram.messenger.g0.r(l3Var);
                        }
                        p9Var.E();
                    }
                }
            }
            f10 = 1.0f;
            if (abs > abs2) {
                p9Var.g0 = true;
            }
            if (!p9Var.j0) {
                if (abs > abs2) {
                    p9Var.j0 = true;
                    currentPeerView = p9Var.n0.getCurrentPeerView();
                    if (currentPeerView != null) {
                    }
                    if (currentPeerView == null) {
                    }
                    p9Var.l0 = (!z11 || currentPeerView == null || currentPeerView.m1 || currentPeerView.o1 || p9Var.t1 != null) ? false : true;
                    if (z11) {
                    }
                    p9Var.c0 = z9;
                    if (z9) {
                        p9Var.c0 = false;
                    }
                    if (p9Var.c0) {
                    }
                    p9Var.Z = 0.0f;
                    s7Var = p9Var.m1;
                    if (s7Var != null) {
                    }
                    org.telegram.messenger.g0.r(l3Var);
                }
                p9Var.E();
            }
        } else {
            f10 = 1.0f;
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                org.telegram.messenger.g0.r(l3Var);
                s7 s7Var3 = p9Var.m1;
                if (s7Var3 != null) {
                    org.telegram.messenger.g0.r(s7Var3);
                    p9Var.m1 = null;
                }
                p9Var.Q(false);
                p9Var.g0 = false;
                p9Var.k0 = false;
                h4 h4Var2 = p9Var.F0;
                if (h4Var2 != null && (o9Var = (o9) h4Var2.c) != null) {
                    o9Var.setSeeking(false);
                }
                i4 z12 = p9Var.z();
                if (z12 != null && (g2Var = z12.u0) != null) {
                    g2Var.setAllowTouches(true);
                }
            }
        }
        s5 s5Var = p9Var.x;
        boolean z13 = s5Var != null && s5Var.f == f10;
        if (!p9Var.j0 && !z13) {
            p9Var.i0.onTouchEvent(motionEvent);
        }
        return p9Var.j0 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        p9 p9Var = this.r0;
        ((FrameLayout.LayoutParams) p9Var.c1.getLayoutParams()).topMargin = org.telegram.messenger.g0.m - org.telegram.messenger.g0.L(2.0f);
        p9Var.c1.getLayoutParams().height = org.telegram.messenger.g0.L(2.0f);
        super.onMeasure(i7, i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        g2 g2Var;
        int action = motionEvent.getAction();
        p9 p9Var = this.r0;
        int i7 = 1;
        if (action == 1 || motionEvent.getAction() == 3) {
            p9Var.j0 = false;
            p9Var.Q(false);
            if (p9Var.V >= 1.0f) {
                p9Var.u(true);
            } else if (!p9Var.G0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(p9Var.W, 0.0f);
                p9Var.G = ofFloat;
                ofFloat.addUpdateListener(new a9(this, i7));
                p9Var.G.addListener(new b9(this, i7));
                p9Var.G.setDuration(150L);
                p9Var.G.setInterpolator(xq.f);
                p9Var.G.start();
            }
            i4 z9 = p9Var.z();
            if (z9 != null && (g2Var = z9.u0) != null) {
                g2Var.setAllowTouches(true);
            }
        }
        if (!p9Var.j0 && !p9Var.y && p9Var.Z == 0.0f && ((p9Var.e0 == 0.0f || (!p9Var.f0 && !p9Var.g0)) && !p9Var.i1)) {
            return false;
        }
        p9Var.i0.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        super.requestDisallowInterceptTouchEvent(z9);
        this.r0.f0 = false;
    }
}
