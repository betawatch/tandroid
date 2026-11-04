package ei;

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
import org.telegram.messenger.hs;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e9 extends qt0 {
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
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 r0;
    public final /* synthetic */ r9 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9(r9 r9Var, Context context, org.telegram.ui.ActionBar.d2 d2Var) {
        super(context, null);
        this.s0 = r9Var;
        this.r0 = d2Var;
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
    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        boolean z10;
        int i3;
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
        m9 m9Var;
        l9 l9Var;
        j4 currentPeerView;
        m3 m3Var;
        o7 o7Var3;
        int i11;
        j4 H;
        gh0 gh0Var;
        boolean z11;
        float f24;
        r9 r9Var = this.s0;
        RectF rectF5 = r9Var.U;
        o9 o9Var = r9Var.t0;
        float f25 = 1.0f;
        canvas.drawColor(i0.a.o(-16777216, (int) ((((1.0f - r9Var.W) * 0.5f) + 0.5f) * r9Var.V * 255.0f)));
        int i12 = 0;
        if (r9Var.b) {
            boolean z12 = (1.0f - r9Var.W) * r9Var.V == 1.0f;
            if (r9Var.L0 != z12) {
                r9Var.L0 = z12;
                org.telegram.ui.ActionBar.d2 d2Var = this.r0;
                if (d2Var.getLayoutContainer() != null) {
                    d2Var.getLayoutContainer().invalidate();
                }
            }
        }
        j4 currentPeerView2 = r9Var.o0.getCurrentPeerView();
        RectF rectF6 = this.p0;
        RectF rectF7 = this.o0;
        if (currentPeerView2 != null) {
            f4 f4Var2 = currentPeerView2.Y0;
            if (r9Var.W0) {
                f4Var2.a.getImageReceiver().O0(r9Var.V == 1.0f, true);
            } else {
                f4Var2.a.getImageReceiver().O0(true, false);
            }
            if (r9Var.i1) {
                r9Var.i1 = false;
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
                        if (view2.getParent() != r9Var.o0) {
                            f26 += view2.getX();
                            f27 += view2.getY();
                        }
                    }
                    view2 = (View) view2.getParent();
                    i12 = i13;
                    f25 = f24;
                }
                f10 = f25;
                i3 = i12;
                rectF7.set(f26, f27, d4Var.getMeasuredWidth() + f26, d4Var.getMeasuredHeight() + f27);
                rectF6.set(0.0f, currentPeerView2.M0.getTop() + currentPeerView2.getTop(), r9Var.w.getMeasuredWidth(), r9Var.w.getMeasuredHeight());
                r9Var.w.getMatrix().mapRect(rectF7);
                r9Var.w.getMatrix().mapRect(rectF6);
            } else {
                f10 = 1.0f;
                f11 = 255.0f;
                z11 = true;
                i3 = 0;
            }
            f4Var = f4Var2;
            z10 = z11;
        } else {
            f10 = 1.0f;
            f11 = 255.0f;
            z10 = 1;
            i3 = 0;
            f4Var = null;
        }
        r9Var.e1.setAlpha(f10 - r9Var.W);
        if (r9Var.Y == 0.0f) {
            float f28 = f10;
            f12 = f28 - Utilities.i(Math.abs(r9Var.X / getMeasuredHeight()), f28, 0.0f);
        } else {
            f12 = 1.0f;
        }
        r9Var.o0.setHorizontalProgressToDismiss((r9Var.Y / r9Var.w.getMeasuredWidth()) * r9Var.V);
        if (r9Var.O != 0.0f || r9Var.P != 0.0f) {
            float f29 = r9Var.V;
            if (f29 != 1.0f) {
                if (r9Var.I0 && r9Var.W0) {
                    float i14 = 1.0f - Utilities.i(((1.0f - f29) - 0.8f) / 0.100000024f, 1.0f, 0.0f);
                    f13 = 0.15f;
                    f14 = Utilities.i(a1.g.D(1.0f, i14, 0.05f, f29), 1.0f, 0.0f);
                    i10 = 2;
                    r9Var.w.setAlpha(i14);
                } else {
                    f13 = 0.15f;
                    i10 = 2;
                    r9Var.w.setAlpha(1.0f);
                    f14 = f29;
                }
                if (!r9Var.I0 || o9Var == null || o9Var.c == null) {
                    rectF = rectF7;
                } else {
                    f9 f9Var = r9Var.w;
                    rectF = rectF7;
                    f9Var.setAlpha(f9Var.getAlpha() * ((float) Math.pow(f29, 0.20000000298023224d)));
                }
                f9 f9Var2 = r9Var.w;
                float left = (r9Var.O - f9Var2.getLeft()) - (r9Var.w.getMeasuredWidth() / 2.0f);
                float f30 = r9Var.V;
                f9Var2.setTranslationX((r9Var.Y * f30) + ((1.0f - f30) * left));
                f9 f9Var3 = r9Var.w;
                float top = (r9Var.P - f9Var3.getTop()) - (r9Var.w.getMeasuredHeight() / 2.0f);
                float f31 = r9Var.V;
                f9Var3.setTranslationY((r9Var.X * f31) + ((1.0f - f31) * top));
                float T1 = org.telegram.messenger.g0.T1(r9Var.S / r9Var.w.getMeasuredWidth(), (f12 * f13) + 0.85f, f14);
                r9Var.w.setScaleX(T1);
                r9Var.w.setScaleY(T1);
                Path path = this.k0;
                path.rewind();
                float f32 = r9Var.O;
                float f33 = r9Var.S / 2.0f;
                float f34 = r9Var.P;
                float f35 = r9Var.T / 2.0f;
                float f36 = f35 + f34;
                RectF rectF8 = this.l0;
                rectF8.set(f32 - f33, f34 - f35, f33 + f32, f36);
                boolean z13 = r9Var.I0;
                RectF rectF9 = this.m0;
                if (z13 && r9Var.W0) {
                    rectF9.set(rectF6);
                } else if (currentPeerView2 != null) {
                    rectF9.set(0.0f, currentPeerView2.M0.getTop() + r9Var.c0, getMeasuredWidth(), getMeasuredHeight() + r9Var.c0);
                } else {
                    rectF9.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                if (r9Var.I0 && r9Var.W0) {
                    rectF8.inset(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
                }
                float T12 = org.telegram.messenger.g0.T1(rectF8.centerX(), rectF9.centerX(), r9Var.V);
                float T13 = org.telegram.messenger.g0.T1(rectF8.centerY(), rectF9.centerY(), r9Var.V);
                float T14 = org.telegram.messenger.g0.T1(rectF8.height(), rectF9.height(), f14);
                float T15 = org.telegram.messenger.g0.T1(rectF8.width(), rectF9.width(), f14);
                if (r9Var.I0 && r9Var.W0) {
                    f15 = T12;
                    rectF8.inset(-org.telegram.messenger.g0.L(12.0f), -org.telegram.messenger.g0.L(12.0f));
                } else {
                    f15 = T12;
                }
                RectF rectF10 = org.telegram.messenger.g0.P;
                float f37 = T15 / 2.0f;
                float f38 = T14 / 2.0f;
                rectF10.set(f15 - f37, T13 - f38, f15 + f37, T13 + f38);
                boolean z14 = r9Var.W0;
                float[] fArr2 = this.j0;
                if (z14) {
                    float T16 = org.telegram.messenger.g0.T1(r9Var.S / 2.0f, 0.0f, f14);
                    fArr = fArr2;
                    fArr[7] = T16;
                    fArr[6] = T16;
                    fArr[5] = T16;
                    fArr[4] = T16;
                    fArr[3] = T16;
                    fArr[i10] = T16;
                    fArr[z10] = T16;
                    fArr[i3] = T16;
                } else {
                    fArr = fArr2;
                    int[] iArr = r9Var.X0;
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
                        f17 = r9Var.Q;
                        if (f17 != f16 && r9Var.R != f16) {
                            canvas.clipRect(f16, org.telegram.messenger.g0.T1(f16, f17, (float) Math.pow(1.0f - r9Var.V, 0.4000000059604645d)), getMeasuredWidth(), org.telegram.messenger.g0.T1(getMeasuredHeight(), r9Var.R, 1.0f - r9Var.V));
                        }
                        if (o9Var == null && (o7Var3 = o9Var.m) != null && o7Var3.w && r9Var.W0) {
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
                        if (o9Var != null || o9Var.c == null || (currentPeerView = r9Var.o0.getCurrentPeerView()) == null || (m3Var = currentPeerView.M0) == null) {
                            f19 = f18;
                            f20 = f29;
                            rectF4 = rectF3;
                        } else {
                            boolean z15 = o9Var.c.R0;
                            f19 = f18;
                            rectF9.set(m3Var.getX() + currentPeerView.getX() + r9Var.Y + r9Var.w.getLeft(), m3Var.getY() + currentPeerView.getY() + r9Var.X + r9Var.w.getTop(), ((r9Var.Y + r9Var.w.getRight()) - (r9Var.w.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - m3Var.getRight()), ((r9Var.X + r9Var.w.getBottom()) - (r9Var.w.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - m3Var.getBottom()));
                            org.telegram.messenger.g0.Z1(rectF3, rectF9, f29, rectF11);
                            ImageReceiver imageReceiver = o9Var.c;
                            float f39 = imageReceiver.L0;
                            float f40 = imageReceiver.M0;
                            float f41 = imageReceiver.N0;
                            float f42 = imageReceiver.O0;
                            imageReceiver.A0(rectF11);
                            float f43 = 1.0f - f29;
                            o9Var.c.setAlpha(f43);
                            f20 = f29;
                            rectF4 = rectF3;
                            o9Var.c.O0(z10, false);
                            int saveCount = canvas.getSaveCount();
                            l9 l9Var2 = o9Var.f;
                            if (l9Var2 != null) {
                                l9Var2.i(f43, canvas, rectF11, r9Var.F);
                            }
                            o9Var.c.h(canvas, null);
                            m9 m9Var2 = o9Var.e;
                            if (m9Var2 != null) {
                                m9Var2.f(canvas, rectF11, f43);
                            }
                            o9Var.c.O0(z15, false);
                            o9Var.c.y0(f39, f40, f41, f42);
                            canvas.restoreToCount(saveCount);
                        }
                        canvas.restore();
                        if (f4Var != null) {
                            d4 d4Var2 = f4Var.a;
                            float f44 = r9Var.Y;
                            float f45 = r9Var.X;
                            if (r9Var.I0 && r9Var.W0) {
                                rectF9.set(rectF);
                            } else {
                                for (View view3 = d4Var2; view3 != this && view3 != null; view3 = (View) view3.getParent()) {
                                    if (view3.getParent() == this) {
                                        f44 += view3.getLeft();
                                        f45 += view3.getTop();
                                    } else if (view3.getParent() != r9Var.o0) {
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
                            org.telegram.messenger.g0.Z1(rectF4, rectF9, r9Var.V, rectF11);
                            int saveCount2 = canvas.getSaveCount();
                            if (o9Var != null && (l9Var = o9Var.f) != null) {
                                l9Var.i(1.0f - f20, canvas, rectF11, r9Var.F);
                            }
                            if (r9Var.W0) {
                                boolean z16 = (o9Var == null || o9Var.l == null) ? false : true;
                                if (z16 && r9Var.V == f19) {
                                    f21 = f20;
                                } else {
                                    if (o9Var != null && (o7Var2 = o9Var.m) != null && o7Var2.w) {
                                        canvas.saveLayerAlpha(rectF11.left - org.telegram.messenger.g0.L(4.0f), rectF11.top - org.telegram.messenger.g0.L(4.0f), rectF11.right + org.telegram.messenger.g0.L(4.0f), rectF11.bottom + org.telegram.messenger.g0.L(4.0f), hs.e4, 31);
                                    }
                                    d4Var2.getImageReceiver().A0(rectF11);
                                    d4Var2.getImageReceiver().J0((int) org.telegram.messenger.g0.T1(rectF11.width() / 2.0f, ((o9Var == null || o9Var.b == null) ? null : Integer.valueOf((int) (o9Var.b.X0[0] * ((!o9Var.n || (view = o9Var.a) == null || view.getParent() == null) ? 1.0f : ((ViewGroup) o9Var.a.getParent()).getScaleY())))) != null ? r4.intValue() : rectF11.width() / 2.0f, 1.0f - r9Var.V));
                                    d4Var2.getImageReceiver().O0(true, false);
                                    float f46 = z16 ? r9Var.V : 1.0f;
                                    if (o9Var == null || o9Var.k >= 1.0f || (paint = o9Var.j) == null) {
                                        f21 = f20;
                                        f22 = f46;
                                    } else {
                                        paint.setAlpha((int) ((1.0f - f20) * f11));
                                        canvas.drawCircle(rectF11.centerX(), rectF11.centerY(), rectF11.width() / 2.0f, o9Var.j);
                                        f21 = f20;
                                        f22 = org.telegram.messenger.g0.T1(o9Var.k, f46, f21);
                                    }
                                    d4Var2.getImageReceiver().setAlpha(f22);
                                    f4Var.b(r9Var.V, canvas, rectF11, !r9.B1);
                                    d4Var2.getImageReceiver().h(canvas, null);
                                    d4Var2.getImageReceiver().setAlpha(f46);
                                    d4Var2.getImageReceiver().O0(false, false);
                                    if (o9Var != null && (o7Var = o9Var.m) != null && o7Var.w) {
                                        RectF rectF12 = org.telegram.messenger.g0.P;
                                        rectF12.set(rectF11);
                                        f23 = 1.0f;
                                        s7.k(1.0f - r9Var.V, f19, canvas, rectF12, true);
                                        canvas.restore();
                                        if (r9Var.V != f23 && z16) {
                                            ImageReceiver imageReceiver2 = o9Var.l;
                                            RectF rectF13 = rectF2;
                                            rectF13.set(imageReceiver2.L0, imageReceiver2.M0, imageReceiver2.y(), o9Var.l.A());
                                            ImageReceiver imageReceiver3 = o9Var.l;
                                            int i15 = imageReceiver3.X0[0];
                                            boolean z17 = imageReceiver3.R0;
                                            imageReceiver3.A0(rectF11);
                                            o9Var.l.J0((int) (rectF11.width() / 2.0f));
                                            o9Var.l.O0(true, false);
                                            canvas.saveLayerAlpha(rectF11, (int) ((1.0f - r9Var.V) * f11), 31);
                                            o9Var.l.h(canvas, null);
                                            canvas.restore();
                                            o9Var.l.O0(z17, false);
                                            o9Var.l.A0(rectF13);
                                            o9Var.l.J0(i15);
                                        }
                                        if (o9Var != null && (m9Var = o9Var.e) != null) {
                                            m9Var.f(canvas, rectF11, 1.0f - f21);
                                        }
                                    }
                                }
                                f23 = 1.0f;
                                if (r9Var.V != f23) {
                                    ImageReceiver imageReceiver22 = o9Var.l;
                                    RectF rectF132 = rectF2;
                                    rectF132.set(imageReceiver22.L0, imageReceiver22.M0, imageReceiver22.y(), o9Var.l.A());
                                    ImageReceiver imageReceiver32 = o9Var.l;
                                    int i152 = imageReceiver32.X0[0];
                                    boolean z172 = imageReceiver32.R0;
                                    imageReceiver32.A0(rectF11);
                                    o9Var.l.J0((int) (rectF11.width() / 2.0f));
                                    o9Var.l.O0(true, false);
                                    canvas.saveLayerAlpha(rectF11, (int) ((1.0f - r9Var.V) * f11), 31);
                                    o9Var.l.h(canvas, null);
                                    canvas.restore();
                                    o9Var.l.O0(z172, false);
                                    o9Var.l.A0(rectF132);
                                    o9Var.l.J0(i152);
                                }
                                if (o9Var != null) {
                                    m9Var.f(canvas, rectF11, 1.0f - f21);
                                }
                            }
                            canvas.restoreToCount(saveCount2);
                        }
                        if (r9Var.N != null) {
                            float i16 = Utilities.i(r9Var.V / 0.4f, 1.0f, 0.0f);
                            if (i16 != 1.0f) {
                                RectF rectF14 = org.telegram.messenger.g0.P;
                                float f47 = r9Var.O;
                                float f48 = r9Var.P;
                                rectF14.set(f47, f48, r9Var.S + f47, r9Var.T + f48);
                                rectF14.inset(-org.telegram.messenger.g0.L(16.0f), -org.telegram.messenger.g0.L(16.0f));
                                if (i16 != 0.0f) {
                                    canvas.saveLayerAlpha(rectF14, (int) ((1.0f - i16) * f11), 31);
                                } else {
                                    canvas.save();
                                }
                                canvas.translate(r9Var.L, r9Var.M);
                                ((org.telegram.ui.Cells.t2) r9Var.N).H(canvas);
                                canvas.restore();
                            }
                        }
                        canvas.restore();
                        if (r9.B1) {
                            ArrayList arrayList = r9Var.y0;
                            r9Var.e0();
                            r9Var.V = 0.0f;
                            r9Var.a0(true);
                            r9Var.d = false;
                            r9.y1 = true;
                            r9Var.c0 = r9Var.X;
                            if (o9Var.d != null && (H = r9Var.H()) != null && (gh0Var = H.Y0.d) != null) {
                                gh0 gh0Var2 = o9Var.d;
                                gh0Var.c = gh0Var2.c;
                                gh0Var.f = gh0Var2.f;
                                gh0Var.b = gh0Var2.b;
                                gh0Var.a = System.currentTimeMillis();
                                gh0Var.c();
                            }
                            r9Var.F = true;
                            float[] fArr3 = new float[i10];
                            // fill-array-data instruction
                            fArr3[0] = 0.0f;
                            fArr3[1] = 1.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr3);
                            r9Var.G = ofFloat;
                            ofFloat.addUpdateListener(new x8(r9Var, 1));
                            r9Var.K0.d();
                            f9 f9Var4 = r9Var.w;
                            if (f9Var4 != null) {
                                w.c = true;
                                i11 = 2;
                                f9Var4.setLayerType(2, null);
                            } else {
                                i11 = 2;
                            }
                            r9Var.G.addListener(new z8(r9Var, i11));
                            r9Var.G.setStartDelay(40L);
                            r9Var.G.setDuration(250L);
                            r9Var.G.setInterpolator(xq.f);
                            r9Var.G.start();
                            if (!arrayList.isEmpty()) {
                                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                    ((Runnable) arrayList.get(i17)).run();
                                }
                                arrayList.clear();
                            }
                            r9.B1 = false;
                            return;
                        }
                        return;
                    }
                    int i18 = i3;
                    float W1 = org.telegram.messenger.g0.W1(f29, iArr[i3], i18);
                    fArr[z10] = W1;
                    fArr[i18] = W1;
                    float W12 = org.telegram.messenger.g0.W1(f29, r9Var.X0[z10], i18);
                    fArr[3] = W12;
                    fArr[i10] = W12;
                    float W13 = org.telegram.messenger.g0.W1(f29, r9Var.X0[i10], i18);
                    fArr[5] = W13;
                    fArr[4] = W13;
                    float W14 = org.telegram.messenger.g0.W1(f29, r9Var.X0[3], i18);
                    fArr[7] = W14;
                    fArr[6] = W14;
                }
                f16 = 0.0f;
                path.addRoundRect(rectF10, fArr, Path.Direction.CCW);
                canvas.save();
                f17 = r9Var.Q;
                if (f17 != f16) {
                    canvas.clipRect(f16, org.telegram.messenger.g0.T1(f16, f17, (float) Math.pow(1.0f - r9Var.V, 0.4000000059604645d)), getMeasuredWidth(), org.telegram.messenger.g0.T1(getMeasuredHeight(), r9Var.R, 1.0f - r9Var.V));
                }
                if (o9Var == null) {
                }
                rectF2 = rectF5;
                f18 = f16;
                rectF3 = rectF8;
                canvas.save();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                RectF rectF112 = this.n0;
                if (o9Var != null) {
                }
                f19 = f18;
                f20 = f29;
                rectF4 = rectF3;
                canvas.restore();
                if (f4Var != null) {
                }
                if (r9Var.N != null) {
                }
                canvas.restore();
                if (r9.B1) {
                }
            }
        }
        r9Var.w.setAlpha(r9Var.V);
        float f49 = (f12 * 0.15f) + (r9Var.V * 0.1f) + 0.75f;
        r9Var.w.setScaleX(f49);
        r9Var.w.setScaleY(f49);
        r9Var.w.setTranslationY(r9Var.X);
        r9Var.w.setTranslationX(r9Var.Y);
        super.dispatchDraw(canvas);
        i10 = 2;
        if (r9.B1) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        r9 r9Var = this.s0;
        if (keyCode == 24 || keyEvent.getKeyCode() == 25) {
            r9Var.F(keyEvent);
            return true;
        }
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        r9Var.p();
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
        g9 g9Var;
        int i3;
        li0 li0Var;
        r9 r9Var = this.s0;
        float[] fArr = r9Var.p0;
        j4 currentPeerView = r9Var.o0.getCurrentPeerView();
        if (currentPeerView != null) {
            q3 q3Var = currentPeerView.u0;
            if (q3Var.a0.x()) {
                float x10 = currentPeerView.getX();
                float y9 = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x10, -y9);
                if (!q3Var.a0.n(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x10, y9);
                }
                return true;
            }
        }
        float f10 = 0.0f;
        int i10 = 0;
        if (r9Var.q1 && currentPeerView != null && (li0Var = currentPeerView.b3) != null) {
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
            li0Var.getHitRect(rect);
            rect.offset((int) f10, (int) f11);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.Z0(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            li0Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            r9Var.k0 = false;
            org.telegram.messenger.g0.r(r9Var.c1);
            float f12 = r9Var.Y;
            if (f12 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, 0.0f);
                r9Var.H = ofFloat;
                ofFloat.addUpdateListener(new b9(this, i10));
                r9Var.H.addListener(new c9(this, i10));
                r9Var.H.setDuration(250L);
                r9Var.H.setInterpolator(xq.f);
                r9Var.H.start();
            }
            if (r9Var.W >= 0.3f) {
                r9Var.D(true);
            }
            r9Var.Y(false);
            r9Var.Z(false);
            z10 = true;
        } else {
            z10 = false;
        }
        if (motionEvent.getAction() == 0) {
            r9Var.b0 = false;
            if (currentPeerView != null) {
                ai.d2 d2Var = currentPeerView.i0;
                u8 u8Var = currentPeerView.m0;
                m3 m3Var = currentPeerView.M0;
                gi.l3 l3Var = currentPeerView.p0;
                if (l3Var != null && l3Var.W && u8Var != null && !l3Var.D0.contains(motionEvent.getX() - (currentPeerView.p0.getX() + (m3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.p0.getY() + (m3Var.getY() + currentPeerView.getY()))) && !currentPeerView.F0(u8Var, motionEvent)) {
                    currentPeerView.p0.f(true);
                }
                gi.l3 l3Var2 = currentPeerView.q0;
                if (l3Var2 != null && l3Var2.W && d2Var != null && !l3Var2.D0.contains(motionEvent.getX() - (currentPeerView.q0.getX() + (m3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.q0.getY() + (m3Var.getY() + currentPeerView.getY()))) && !currentPeerView.F0(d2Var, motionEvent)) {
                    currentPeerView.q0.f(true);
                }
            }
            r9Var.o0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        boolean z12 = (r9Var.y || r9Var.I0 || r9Var.J0) ? false : true;
        float f13 = r9Var.f0;
        SparseArray sparseArray = this.q0;
        if (f13 == 0.0f && !r9Var.k0 && r9Var.o0.G0 == 1 && motionEvent.getAction() == 2 && z12) {
            float floatValue = ((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0);
            if ((floatValue != 0.0f && (((i3 = (g9Var = r9Var.o0).J0) == 0 && g9Var.L0 == 0.0f && floatValue < 0.0f) || (i3 == g9Var.getAdapter().b() - 1 && g9Var.L0 == 0.0f && floatValue > 0.0f))) || r9Var.Y != 0.0f) {
                float f14 = r9Var.Y;
                if (f14 == 0.0f) {
                    r9Var.Z = -floatValue;
                }
                if ((floatValue < 0.0f && r9Var.Z > 0.0f) || (floatValue > 0.0f && r9Var.Z < 0.0f)) {
                    floatValue *= 0.2f;
                }
                r9Var.Y = f14 - floatValue;
                r9.w(r9Var);
                float f15 = r9Var.Y;
                if ((f15 > 0.0f && r9Var.Z < 0.0f) || (f15 < 0.0f && r9Var.Z > 0.0f)) {
                    r9Var.Y = 0.0f;
                }
                z11 = true;
                if (currentPeerView != null && r9Var.f0 == 0.0f && !r9Var.k0 && !r9Var.M0 && !r9Var.J0 && r9Var.o0.G0 != 1) {
                    org.telegram.messenger.g0.r1(currentPeerView.M0, this, fArr);
                    motionEvent.offsetLocation(-fArr[0], -fArr[1]);
                    j4 currentPeerView2 = r9Var.o0.getCurrentPeerView();
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
                        if (r9Var.f0 != 0.0f && !r9Var.h1 && r9Var.q0 < org.telegram.messenger.g0.L(20.0f)) {
                            r9Var.A(r9Var.x.f > 0.5f);
                        }
                        j4 H = r9Var.H();
                        if (H != null) {
                            H.u0.x0 = false;
                        }
                    }
                    if (z10 && !r9Var.b0) {
                        r9Var.z();
                    }
                    if (!dispatchTouchEvent && (!r9.y1 || !r9Var.r0)) {
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
            j4 currentPeerView22 = r9Var.o0.getCurrentPeerView();
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.s0.z0) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        r9 r9Var = this.s0;
        if (r9Var.b && !r9Var.c) {
            org.telegram.ui.ActionBar.d2 d2Var = this.r0;
            org.telegram.messenger.g0.a3(d2Var.getParentActivity(), d2Var.getClassGuid());
        }
        setTag(R.id.bulletin_delegate_tag, new d9(this));
        hs.f(r9Var.h).c(r9Var, hs.x5);
        hs.f(r9Var.h).c(r9Var, hs.v5);
        hs.f(r9Var.h).c(r9Var, hs.d1);
        hs.f(r9Var.h).c(r9Var, hs.c1);
        hs.f(r9Var.h).c(r9Var, hs.w5);
    }

    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
        r9 r9Var = this.s0;
        hs.f(r9Var.h).n(r9Var, hs.x5);
        hs.f(r9Var.h).n(r9Var, hs.v5);
        hs.f(r9Var.h).n(r9Var, hs.d1);
        hs.f(r9Var.h).n(r9Var, hs.c1);
        hs.f(r9Var.h).n(r9Var, hs.w5);
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
        k2 k2Var;
        q9 q9Var;
        j4 currentPeerView;
        boolean z10;
        z5 z5Var;
        i4 i4Var;
        j4 currentPeerView2;
        h4 h4Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        k2 k2Var2;
        r9 r9Var = this.s0;
        o3 o3Var = r9Var.c1;
        if (motionEvent.getAction() == 0 && r9Var.V == 1.0f) {
            float x10 = motionEvent.getX();
            this.i0 = x10;
            this.g0 = x10;
            this.h0 = motionEvent.getY();
            r9Var.h0 = false;
            r9Var.g0 = (r9Var.J0 || r9.u(r9Var, r9Var.s, motionEvent.getX(), motionEvent.getY(), false)) ? false : true;
            r9Var.i0 = (r9Var.J0 || r9.u(r9Var, r9Var.s, motionEvent.getX(), motionEvent.getY(), true)) ? false : true;
            r9Var.Y(r9Var.g0 && !r9Var.n1);
            j4 H = r9Var.H();
            if (r9Var.g0 && H != null && (k2Var2 = H.v0) != null) {
                k2Var2.setAllowTouches(false);
            }
            if (r9Var.g0 && !r9Var.J0 && r9Var.n1) {
                z5 z5Var2 = new z5(this, 11);
                r9Var.o1 = z5Var2;
                org.telegram.messenger.g0.i3(z5Var2, 150L);
            }
            if (r9Var.g0 && !r9Var.y && !r9Var.J0 && !r9Var.k1) {
                org.telegram.messenger.g0.i3(o3Var, 400L);
            }
            f10 = 1.0f;
        } else if (motionEvent.getAction() == 2) {
            float abs = Math.abs(this.h0 - motionEvent.getY());
            float abs2 = Math.abs(this.g0 - motionEvent.getX());
            if (r9Var.b1 && r9Var.l0 && !r9Var.g1 && !r9Var.k0 && (i4Var = r9Var.H0) != null && ((q9) i4Var.c) != null && (currentPeerView2 = r9Var.o0.getCurrentPeerView()) != null && (h4Var = currentPeerView2.y1) != null && h4Var.b == null && h4Var.e) {
                long j10 = currentPeerView2.B2;
                if (j10 <= 0 && (storyItem = h4Var.a) != null && (messageMedia = storyItem.media) != null && (document = messageMedia.document) != null) {
                    j10 = (long) (zi.H0(document) * 1000.0d);
                }
                if (j10 > 0) {
                    float x11 = motionEvent.getX();
                    q9 q9Var2 = (q9) r9Var.H0.c;
                    f10 = 1.0f;
                    if (((int) (q9Var2.seek((x11 - this.i0) / org.telegram.messenger.g0.L(220.0f), j10) * 10.0f)) != ((int) (q9Var2.currentSeek * 10.0f))) {
                        try {
                            currentPeerView2.performHapticFeedback(9, 1);
                        } catch (Exception unused) {
                        }
                    }
                    currentPeerView2.M0.invalidate();
                    this.i0 = x11;
                    if (abs > abs2 && !r9Var.l0 && !r9Var.h0 && abs > org.telegram.messenger.g0.e * 2.0f) {
                        r9Var.h0 = true;
                    }
                    if (!r9Var.k0 && !r9Var.l0 && !r9Var.y && r9Var.i0) {
                        if (abs > abs2 && abs > org.telegram.messenger.g0.e * 2.0f) {
                            r9Var.k0 = true;
                            currentPeerView = r9Var.o0.getCurrentPeerView();
                            if (currentPeerView != null) {
                                currentPeerView.n0();
                            }
                            boolean z11 = currentPeerView == null && !currentPeerView.y1.f && (currentPeerView.m1 || (currentPeerView.n1 && currentPeerView.l3));
                            r9Var.m0 = (!z11 || currentPeerView == null || currentPeerView.n1 || currentPeerView.p1 || r9Var.v1 != null) ? false : true;
                            z10 = (z11 || currentPeerView.M2 || currentPeerView.y1.a == null || r9Var.v1 != null) ? false : true;
                            r9Var.d0 = z10;
                            if (z10 && this.f != 0) {
                                r9Var.d0 = false;
                            }
                            if (r9Var.d0) {
                                r9Var.C();
                            }
                            r9Var.a0 = 0.0f;
                            z5Var = r9Var.o1;
                            if (z5Var != null) {
                                org.telegram.messenger.g0.r(z5Var);
                                r9Var.o1.run();
                                r9Var.o1 = null;
                            }
                            org.telegram.messenger.g0.r(o3Var);
                        }
                        r9Var.M();
                    }
                }
            }
            f10 = 1.0f;
            if (abs > abs2) {
                r9Var.h0 = true;
            }
            if (!r9Var.k0) {
                if (abs > abs2) {
                    r9Var.k0 = true;
                    currentPeerView = r9Var.o0.getCurrentPeerView();
                    if (currentPeerView != null) {
                    }
                    if (currentPeerView == null) {
                    }
                    r9Var.m0 = (!z11 || currentPeerView == null || currentPeerView.n1 || currentPeerView.p1 || r9Var.v1 != null) ? false : true;
                    if (z11) {
                    }
                    r9Var.d0 = z10;
                    if (z10) {
                        r9Var.d0 = false;
                    }
                    if (r9Var.d0) {
                    }
                    r9Var.a0 = 0.0f;
                    z5Var = r9Var.o1;
                    if (z5Var != null) {
                    }
                    org.telegram.messenger.g0.r(o3Var);
                }
                r9Var.M();
            }
        } else {
            f10 = 1.0f;
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                org.telegram.messenger.g0.r(o3Var);
                z5 z5Var3 = r9Var.o1;
                if (z5Var3 != null) {
                    org.telegram.messenger.g0.r(z5Var3);
                    r9Var.o1 = null;
                }
                r9Var.Y(false);
                r9Var.h0 = false;
                r9Var.l0 = false;
                i4 i4Var2 = r9Var.H0;
                if (i4Var2 != null && (q9Var = (q9) i4Var2.c) != null) {
                    q9Var.setSeeking(false);
                }
                j4 H2 = r9Var.H();
                if (H2 != null && (k2Var = H2.v0) != null) {
                    k2Var.setAllowTouches(true);
                }
            }
        }
        s5 s5Var = r9Var.x;
        boolean z12 = s5Var != null && s5Var.f == f10;
        if (!r9Var.k0 && !z12) {
            r9Var.j0.onTouchEvent(motionEvent);
        }
        return r9Var.k0 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        r9 r9Var = this.s0;
        ((FrameLayout.LayoutParams) r9Var.e1.getLayoutParams()).topMargin = org.telegram.messenger.g0.m - org.telegram.messenger.g0.L(2.0f);
        r9Var.e1.getLayoutParams().height = org.telegram.messenger.g0.L(2.0f);
        super.onMeasure(i3, i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        k2 k2Var;
        int action = motionEvent.getAction();
        r9 r9Var = this.s0;
        int i3 = 1;
        if (action == 1 || motionEvent.getAction() == 3) {
            r9Var.k0 = false;
            r9Var.Y(false);
            if (r9Var.W >= 1.0f) {
                r9Var.D(true);
            } else if (!r9Var.I0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(r9Var.X, 0.0f);
                r9Var.H = ofFloat;
                ofFloat.addUpdateListener(new b9(this, i3));
                r9Var.H.addListener(new c9(this, i3));
                r9Var.H.setDuration(150L);
                r9Var.H.setInterpolator(xq.f);
                r9Var.H.start();
            }
            j4 H = r9Var.H();
            if (H != null && (k2Var = H.v0) != null) {
                k2Var.setAllowTouches(true);
            }
        }
        if (!r9Var.k0 && !r9Var.y && r9Var.a0 == 0.0f && ((r9Var.f0 == 0.0f || (!r9Var.g0 && !r9Var.h0)) && !r9Var.k1)) {
            return false;
        }
        r9Var.j0.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        this.s0.g0 = false;
    }
}
