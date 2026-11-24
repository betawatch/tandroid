// default package

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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class a8b extends cja {
    public float m0;
    public float n0;
    public float o0;
    public final float[] p0;
    public final Path q0;
    public final RectF r0;
    public final RectF s0;
    public final RectF t0;
    public final RectF u0;
    public final RectF v0;
    public final SparseArray w0;
    public final /* synthetic */ d x0;
    public final /* synthetic */ m8b y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8b(m8b m8bVar, Context context, d dVar) {
        super(context, null);
        this.y0 = m8bVar;
        this.x0 = dVar;
        this.p0 = new float[8];
        this.q0 = new Path();
        this.r0 = new RectF();
        this.s0 = new RectF();
        this.t0 = new RectF();
        this.u0 = new RectF();
        this.v0 = new RectF();
        this.w0 = new SparseArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v6 */
    @Override // cja, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        boolean z;
        int i;
        v28 v28Var;
        float f3;
        float f4;
        int i2;
        float f5;
        RectF rectF;
        float f6;
        float[] fArr;
        float f7;
        float f8;
        RectF rectF2;
        float f9;
        RectF rectF3;
        float f10;
        float f11;
        RectF rectF4;
        float f12;
        float f13;
        u2b u2bVar;
        float f14;
        Paint paint;
        View view;
        u2b u2bVar2;
        h8b h8bVar;
        g8b g8bVar;
        y28 currentPeerView;
        d28 d28Var;
        u2b u2bVar3;
        byte b;
        y28 w;
        ty8 ty8Var;
        boolean z2;
        float f15;
        Canvas canvas2 = canvas;
        m8b m8bVar = this.y0;
        RectF rectF5 = m8bVar.U;
        j8b j8bVar = m8bVar.t0;
        float f16 = 1.0f;
        canvas2.drawColor(bm2.o(-16777216, (int) ((((1.0f - m8bVar.W) * 0.5f) + 0.5f) * m8bVar.V * 255.0f)));
        int i3 = 0;
        if (m8bVar.b) {
            boolean z3 = (1.0f - m8bVar.W) * m8bVar.V == 1.0f;
            if (m8bVar.K0 != z3) {
                m8bVar.K0 = z3;
                d dVar = this.x0;
                if (dVar.getLayoutContainer() != null) {
                    dVar.getLayoutContainer().invalidate();
                }
            }
        }
        y28 currentPeerView2 = m8bVar.o0.getCurrentPeerView();
        RectF rectF6 = this.v0;
        RectF rectF7 = this.u0;
        if (currentPeerView2 != null) {
            v28 v28Var2 = currentPeerView2.e1;
            if (m8bVar.V0) {
                v28Var2.a.getImageReceiver().v0(m8bVar.V == 1.0f, true);
            } else {
                v28Var2.a.getImageReceiver().v0(true, false);
            }
            if (m8bVar.h1) {
                m8bVar.h1 = false;
                View view2 = v28Var2.a;
                kb0 kb0Var = v28Var2.a;
                f2 = 255.0f;
                z2 = true;
                float f17 = 0.0f;
                float f18 = 0.0f;
                while (view2 != this) {
                    int i4 = i3;
                    if (view2.getParent() == this) {
                        f17 += view2.getLeft();
                        f18 += view2.getTop();
                        f15 = f16;
                    } else {
                        f15 = f16;
                        if (view2.getParent() != m8bVar.o0) {
                            f17 += view2.getX();
                            f18 += view2.getY();
                        }
                    }
                    view2 = (View) view2.getParent();
                    i3 = i4;
                    f16 = f15;
                }
                f = f16;
                i = i3;
                rectF7.set(f17, f18, kb0Var.getMeasuredWidth() + f17, kb0Var.getMeasuredHeight() + f18);
                rectF6.set(0.0f, currentPeerView2.S0.getTop() + currentPeerView2.getTop(), m8bVar.w.getMeasuredWidth(), m8bVar.w.getMeasuredHeight());
                m8bVar.w.getMatrix().mapRect(rectF7);
                m8bVar.w.getMatrix().mapRect(rectF6);
            } else {
                f = 1.0f;
                f2 = 255.0f;
                z2 = true;
                i = 0;
            }
            v28Var = v28Var2;
            z = z2;
        } else {
            f = 1.0f;
            f2 = 255.0f;
            z = 1;
            i = 0;
            v28Var = null;
        }
        m8bVar.d1.setAlpha(f - m8bVar.W);
        if (m8bVar.Y == 0.0f) {
            float f19 = f;
            f3 = f19 - Utilities.i(Math.abs(m8bVar.X / getMeasuredHeight()), f19, 0.0f);
        } else {
            f3 = 1.0f;
        }
        m8bVar.o0.setHorizontalProgressToDismiss((m8bVar.Y / m8bVar.w.getMeasuredWidth()) * m8bVar.V);
        if (m8bVar.O != 0.0f || m8bVar.P != 0.0f) {
            float f20 = m8bVar.V;
            if (f20 != 1.0f) {
                if (m8bVar.H0 && m8bVar.V0) {
                    float i5 = 1.0f - Utilities.i(((1.0f - f20) - 0.8f) / 0.100000024f, 1.0f, 0.0f);
                    f4 = 0.15f;
                    f5 = Utilities.i(ls6.B(1.0f, i5, 0.05f, f20), 1.0f, 0.0f);
                    i2 = 2;
                    m8bVar.w.setAlpha(i5);
                } else {
                    f4 = 0.15f;
                    i2 = 2;
                    m8bVar.w.setAlpha(1.0f);
                    f5 = f20;
                }
                if (!m8bVar.H0 || j8bVar == null || j8bVar.c == null) {
                    rectF = rectF7;
                } else {
                    b8b b8bVar = m8bVar.w;
                    rectF = rectF7;
                    b8bVar.setAlpha(b8bVar.getAlpha() * ((float) Math.pow(f20, 0.20000000298023224d)));
                }
                b8b b8bVar2 = m8bVar.w;
                float left = (m8bVar.O - b8bVar2.getLeft()) - (m8bVar.w.getMeasuredWidth() / 2.0f);
                float f21 = m8bVar.V;
                b8bVar2.setTranslationX((m8bVar.Y * f21) + ((1.0f - f21) * left));
                b8b b8bVar3 = m8bVar.w;
                float top = (m8bVar.P - b8bVar3.getTop()) - (m8bVar.w.getMeasuredHeight() / 2.0f);
                float f22 = m8bVar.V;
                b8bVar3.setTranslationY((m8bVar.X * f22) + ((1.0f - f22) * top));
                float R1 = gl.R1(m8bVar.S / m8bVar.w.getMeasuredWidth(), (f3 * f4) + 0.85f, f5);
                m8bVar.w.setScaleX(R1);
                m8bVar.w.setScaleY(R1);
                Path path = this.q0;
                path.rewind();
                float f23 = m8bVar.O;
                float f24 = m8bVar.S / 2.0f;
                float f25 = m8bVar.P;
                float f26 = m8bVar.T / 2.0f;
                float f27 = f26 + f25;
                RectF rectF8 = this.r0;
                rectF8.set(f23 - f24, f25 - f26, f24 + f23, f27);
                boolean z4 = m8bVar.H0;
                RectF rectF9 = this.s0;
                if (z4 && m8bVar.V0) {
                    rectF9.set(rectF6);
                } else if (currentPeerView2 != null) {
                    rectF9.set(0.0f, currentPeerView2.S0.getTop() + m8bVar.c0, getMeasuredWidth(), getMeasuredHeight() + m8bVar.c0);
                } else {
                    rectF9.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                if (m8bVar.H0 && m8bVar.V0) {
                    rectF8.inset(gl.L(12.0f), gl.L(12.0f));
                }
                float R12 = gl.R1(rectF8.centerX(), rectF9.centerX(), m8bVar.V);
                float R13 = gl.R1(rectF8.centerY(), rectF9.centerY(), m8bVar.V);
                float R14 = gl.R1(rectF8.height(), rectF9.height(), f5);
                float R15 = gl.R1(rectF8.width(), rectF9.width(), f5);
                if (m8bVar.H0 && m8bVar.V0) {
                    f6 = R12;
                    rectF8.inset(-gl.L(12.0f), -gl.L(12.0f));
                } else {
                    f6 = R12;
                }
                RectF rectF10 = gl.P;
                float f28 = R15 / 2.0f;
                float f29 = R14 / 2.0f;
                rectF10.set(f6 - f28, R13 - f29, f6 + f28, R13 + f29);
                boolean z5 = m8bVar.V0;
                float[] fArr2 = this.p0;
                if (z5) {
                    float R16 = gl.R1(m8bVar.S / 2.0f, 0.0f, f5);
                    fArr = fArr2;
                    fArr[7] = R16;
                    fArr[6] = R16;
                    fArr[5] = R16;
                    fArr[4] = R16;
                    fArr[3] = R16;
                    fArr[i2] = R16;
                    fArr[z] = R16;
                    fArr[i] = R16;
                } else {
                    fArr = fArr2;
                    int[] iArr = m8bVar.W0;
                    if (iArr == null) {
                        f7 = 0.0f;
                        fArr[7] = 0.0f;
                        fArr[6] = 0.0f;
                        fArr[5] = 0.0f;
                        fArr[4] = 0.0f;
                        fArr[3] = 0.0f;
                        fArr[i2] = 0.0f;
                        fArr[z] = 0.0f;
                        fArr[0] = 0.0f;
                        path.addRoundRect(rectF10, fArr, Path.Direction.CCW);
                        canvas2.save();
                        f8 = m8bVar.Q;
                        if (f8 != f7 && m8bVar.R != f7) {
                            canvas2.clipRect(f7, gl.R1(f7, f8, (float) Math.pow(1.0f - m8bVar.V, 0.4000000059604645d)), getMeasuredWidth(), gl.R1(getMeasuredHeight(), m8bVar.R, 1.0f - m8bVar.V));
                        }
                        if (j8bVar == null && (u2bVar3 = j8bVar.m) != null && u2bVar3.w && m8bVar.V0) {
                            rectF2 = rectF5;
                            f9 = f7;
                            rectF3 = rectF8;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f20 * f2), 31);
                        } else {
                            rectF2 = rectF5;
                            f9 = f7;
                            rectF3 = rectF8;
                            canvas2.save();
                        }
                        canvas2.clipPath(path);
                        super.dispatchDraw(canvas);
                        RectF rectF11 = this.t0;
                        if (j8bVar != null || j8bVar.c == null || (currentPeerView = m8bVar.o0.getCurrentPeerView()) == null || (d28Var = currentPeerView.S0) == null) {
                            f10 = f9;
                            f11 = f20;
                            rectF4 = rectF3;
                        } else {
                            boolean z6 = j8bVar.c.R0;
                            f10 = f9;
                            rectF9.set(d28Var.getX() + currentPeerView.getX() + m8bVar.Y + m8bVar.w.getLeft(), d28Var.getY() + currentPeerView.getY() + m8bVar.X + m8bVar.w.getTop(), ((m8bVar.Y + m8bVar.w.getRight()) - (m8bVar.w.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - d28Var.getRight()), ((m8bVar.X + m8bVar.w.getBottom()) - (m8bVar.w.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - d28Var.getBottom()));
                            gl.X1(rectF3, rectF9, f20, rectF11);
                            ImageReceiver imageReceiver = j8bVar.c;
                            float f30 = imageReceiver.L0;
                            float f31 = imageReceiver.M0;
                            float f32 = imageReceiver.N0;
                            float f33 = imageReceiver.O0;
                            imageReceiver.k0(rectF11);
                            float f34 = 1.0f - f20;
                            j8bVar.c.setAlpha(f34);
                            f11 = f20;
                            rectF4 = rectF3;
                            j8bVar.c.v0(z, false);
                            int saveCount = canvas2.getSaveCount();
                            g8b g8bVar2 = j8bVar.f;
                            if (g8bVar2 != null) {
                                g8bVar2.g(f34, canvas2, rectF11, m8bVar.F);
                            }
                            j8bVar.c.h(canvas2, null);
                            h8b h8bVar2 = j8bVar.e;
                            if (h8bVar2 != null) {
                                h8bVar2.o(canvas2, rectF11, f34);
                            }
                            j8bVar.c.v0(z6, false);
                            j8bVar.c.i0(f30, f31, f32, f33);
                            canvas2.restoreToCount(saveCount);
                        }
                        canvas2.restore();
                        if (v28Var != null) {
                            kb0 kb0Var2 = v28Var.a;
                            float f35 = m8bVar.Y;
                            float f36 = m8bVar.X;
                            if (m8bVar.H0 && m8bVar.V0) {
                                rectF9.set(rectF);
                            } else {
                                for (View view3 = kb0Var2; view3 != this && view3 != null; view3 = (View) view3.getParent()) {
                                    if (view3.getParent() == this) {
                                        f35 += view3.getLeft();
                                        f36 += view3.getTop();
                                    } else if (view3.getParent() != m8bVar.o0) {
                                        float x = view3.getX() + f35;
                                        f36 = view3.getY() + f36;
                                        f35 = x;
                                    }
                                    if (!(view3.getParent() instanceof View)) {
                                        break;
                                    }
                                }
                                rectF9.set(f35, f36, kb0Var2.getMeasuredWidth() + f35, kb0Var2.getMeasuredHeight() + f36);
                            }
                            gl.X1(rectF4, rectF9, m8bVar.V, rectF11);
                            int saveCount2 = canvas2.getSaveCount();
                            if (j8bVar != null && (g8bVar = j8bVar.f) != null) {
                                g8bVar.g(1.0f - f11, canvas2, rectF11, m8bVar.F);
                            }
                            if (m8bVar.V0) {
                                boolean z7 = (j8bVar == null || j8bVar.l == null) ? false : true;
                                if (z7 && m8bVar.V == f10) {
                                    f12 = f11;
                                } else {
                                    if (j8bVar != null && (u2bVar2 = j8bVar.m) != null && u2bVar2.w) {
                                        canvas2.saveLayerAlpha(rectF11.left - gl.L(4.0f), rectF11.top - gl.L(4.0f), rectF11.right + gl.L(4.0f), rectF11.bottom + gl.L(4.0f), kk7.d4, 31);
                                        canvas2 = canvas2;
                                    }
                                    kb0Var2.getImageReceiver().k0(rectF11);
                                    kb0Var2.getImageReceiver().q0((int) gl.R1(rectF11.width() / 2.0f, ((j8bVar == null || j8bVar.b == null) ? null : Integer.valueOf((int) (j8bVar.b.X0[0] * ((!j8bVar.n || (view = j8bVar.a) == null || view.getParent() == null) ? 1.0f : ((ViewGroup) j8bVar.a.getParent()).getScaleY())))) != null ? r4.intValue() : rectF11.width() / 2.0f, 1.0f - m8bVar.V));
                                    kb0Var2.getImageReceiver().v0(true, false);
                                    float f37 = z7 ? m8bVar.V : 1.0f;
                                    if (j8bVar == null || j8bVar.k >= 1.0f || (paint = j8bVar.j) == null) {
                                        f12 = f11;
                                        f13 = f37;
                                    } else {
                                        paint.setAlpha((int) ((1.0f - f11) * f2));
                                        canvas2.drawCircle(rectF11.centerX(), rectF11.centerY(), rectF11.width() / 2.0f, j8bVar.j);
                                        f12 = f11;
                                        f13 = gl.R1(j8bVar.k, f37, f12);
                                    }
                                    kb0Var2.getImageReceiver().setAlpha(f13);
                                    v28Var.a(m8bVar.V, canvas2, rectF11, !m8b.A1);
                                    kb0Var2.getImageReceiver().h(canvas2, null);
                                    kb0Var2.getImageReceiver().setAlpha(f37);
                                    kb0Var2.getImageReceiver().v0(false, false);
                                    if (j8bVar != null && (u2bVar = j8bVar.m) != null && u2bVar.w) {
                                        RectF rectF12 = gl.P;
                                        rectF12.set(rectF11);
                                        f14 = 1.0f;
                                        x2b.k(1.0f - m8bVar.V, f10, canvas2, rectF12, true);
                                        canvas2.restore();
                                        if (m8bVar.V != f14 && z7) {
                                            ImageReceiver imageReceiver2 = j8bVar.l;
                                            RectF rectF13 = rectF2;
                                            rectF13.set(imageReceiver2.L0, imageReceiver2.M0, imageReceiver2.w(), j8bVar.l.x());
                                            ImageReceiver imageReceiver3 = j8bVar.l;
                                            int i6 = imageReceiver3.X0[0];
                                            boolean z8 = imageReceiver3.R0;
                                            imageReceiver3.k0(rectF11);
                                            j8bVar.l.q0((int) (rectF11.width() / 2.0f));
                                            j8bVar.l.v0(true, false);
                                            canvas2.saveLayerAlpha(rectF11, (int) ((1.0f - m8bVar.V) * f2), 31);
                                            j8bVar.l.h(canvas2, null);
                                            canvas2.restore();
                                            j8bVar.l.v0(z8, false);
                                            j8bVar.l.k0(rectF13);
                                            j8bVar.l.q0(i6);
                                        }
                                        if (j8bVar != null && (h8bVar = j8bVar.e) != null) {
                                            h8bVar.o(canvas2, rectF11, 1.0f - f12);
                                        }
                                    }
                                }
                                f14 = 1.0f;
                                if (m8bVar.V != f14) {
                                    ImageReceiver imageReceiver22 = j8bVar.l;
                                    RectF rectF132 = rectF2;
                                    rectF132.set(imageReceiver22.L0, imageReceiver22.M0, imageReceiver22.w(), j8bVar.l.x());
                                    ImageReceiver imageReceiver32 = j8bVar.l;
                                    int i62 = imageReceiver32.X0[0];
                                    boolean z82 = imageReceiver32.R0;
                                    imageReceiver32.k0(rectF11);
                                    j8bVar.l.q0((int) (rectF11.width() / 2.0f));
                                    j8bVar.l.v0(true, false);
                                    canvas2.saveLayerAlpha(rectF11, (int) ((1.0f - m8bVar.V) * f2), 31);
                                    j8bVar.l.h(canvas2, null);
                                    canvas2.restore();
                                    j8bVar.l.v0(z82, false);
                                    j8bVar.l.k0(rectF132);
                                    j8bVar.l.q0(i62);
                                }
                                if (j8bVar != null) {
                                    h8bVar.o(canvas2, rectF11, 1.0f - f12);
                                }
                            }
                            canvas2.restoreToCount(saveCount2);
                        }
                        if (m8bVar.N != null) {
                            float i7 = Utilities.i(m8bVar.V / 0.4f, 1.0f, 0.0f);
                            if (i7 != 1.0f) {
                                RectF rectF14 = gl.P;
                                float f38 = m8bVar.O;
                                float f39 = m8bVar.P;
                                rectF14.set(f38, f39, m8bVar.S + f38, m8bVar.T + f39);
                                rectF14.inset(-gl.L(16.0f), -gl.L(16.0f));
                                if (i7 != 0.0f) {
                                    canvas2.saveLayerAlpha(rectF14, (int) ((1.0f - i7) * f2), 31);
                                } else {
                                    canvas2.save();
                                }
                                canvas2.translate(m8bVar.L, m8bVar.M);
                                ((ue3) m8bVar.N).K(canvas2);
                                canvas2.restore();
                            }
                        }
                        canvas2.restore();
                        if (m8b.A1) {
                            ArrayList arrayList = m8bVar.y0;
                            m8bVar.W();
                            m8bVar.V = 0.0f;
                            m8bVar.Q(true);
                            m8bVar.d = false;
                            m8b.x1 = true;
                            m8bVar.c0 = m8bVar.X;
                            if (j8bVar.d != null && (w = m8bVar.w()) != null && (ty8Var = w.e1.d) != null) {
                                ty8 ty8Var2 = j8bVar.d;
                                ty8Var.c = ty8Var2.c;
                                ty8Var.f = ty8Var2.f;
                                ty8Var.b = ty8Var2.b;
                                ty8Var.a = System.currentTimeMillis();
                                ty8Var.c();
                            }
                            m8bVar.F = true;
                            float[] fArr3 = new float[i2];
                            // fill-array-data instruction
                            fArr3[0] = 0.0f;
                            fArr3[1] = 1.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr3);
                            m8bVar.G = ofFloat;
                            ofFloat.addUpdateListener(new u7b(m8bVar, (byte) 1));
                            m8bVar.J0.d();
                            b8b b8bVar4 = m8bVar.w;
                            if (b8bVar4 != null) {
                                qg5.c = true;
                                b = 2;
                                b8bVar4.setLayerType(2, null);
                            } else {
                                b = 2;
                            }
                            m8bVar.G.addListener(new v7b(m8bVar, b));
                            m8bVar.G.setStartDelay(40L);
                            m8bVar.G.setDuration(250L);
                            m8bVar.G.setInterpolator(s33.f);
                            m8bVar.G.start();
                            if (!arrayList.isEmpty()) {
                                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                                    ((Runnable) arrayList.get(i8)).run();
                                }
                                arrayList.clear();
                            }
                            m8b.A1 = false;
                            return;
                        }
                        return;
                    }
                    int i9 = i;
                    float U1 = gl.U1(f20, iArr[i], i9);
                    fArr[z] = U1;
                    fArr[i9] = U1;
                    float U12 = gl.U1(f20, m8bVar.W0[z], i9);
                    fArr[3] = U12;
                    fArr[i2] = U12;
                    float U13 = gl.U1(f20, m8bVar.W0[i2], i9);
                    fArr[5] = U13;
                    fArr[4] = U13;
                    float U14 = gl.U1(f20, m8bVar.W0[3], i9);
                    fArr[7] = U14;
                    fArr[6] = U14;
                }
                f7 = 0.0f;
                path.addRoundRect(rectF10, fArr, Path.Direction.CCW);
                canvas2.save();
                f8 = m8bVar.Q;
                if (f8 != f7) {
                    canvas2.clipRect(f7, gl.R1(f7, f8, (float) Math.pow(1.0f - m8bVar.V, 0.4000000059604645d)), getMeasuredWidth(), gl.R1(getMeasuredHeight(), m8bVar.R, 1.0f - m8bVar.V));
                }
                if (j8bVar == null) {
                }
                rectF2 = rectF5;
                f9 = f7;
                rectF3 = rectF8;
                canvas2.save();
                canvas2.clipPath(path);
                super.dispatchDraw(canvas);
                RectF rectF112 = this.t0;
                if (j8bVar != null) {
                }
                f10 = f9;
                f11 = f20;
                rectF4 = rectF3;
                canvas2.restore();
                if (v28Var != null) {
                }
                if (m8bVar.N != null) {
                }
                canvas2.restore();
                if (m8b.A1) {
                }
            }
        }
        m8bVar.w.setAlpha(m8bVar.V);
        float f40 = (f3 * 0.15f) + (m8bVar.V * 0.1f) + 0.75f;
        m8bVar.w.setScaleX(f40);
        m8bVar.w.setScaleY(f40);
        m8bVar.w.setTranslationY(m8bVar.X);
        m8bVar.w.setTranslationX(m8bVar.Y);
        super.dispatchDraw(canvas);
        i2 = 2;
        if (m8b.A1) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        m8b m8bVar = this.y0;
        if (keyCode == 24 || keyEvent.getKeyCode() == 25) {
            m8bVar.r(keyEvent);
            return true;
        }
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        m8bVar.q();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0308  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        c8b c8bVar;
        int i;
        t09 t09Var;
        m8b m8bVar = this.y0;
        float[] fArr = m8bVar.p0;
        y28 currentPeerView = m8bVar.o0.getCurrentPeerView();
        if (currentPeerView != null) {
            i28 i28Var = currentPeerView.A0;
            if (i28Var.W.w()) {
                float x = currentPeerView.getX();
                float y = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x, -y);
                if (!i28Var.W.m(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x, y);
                }
                return true;
            }
        }
        float f = 0.0f;
        byte b = 0;
        if (m8bVar.p1 && currentPeerView != null && (t09Var = currentPeerView.h3) != null) {
            float f2 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f += view.getX();
                f2 += view.getY();
            }
            if (currentPeerView.h3.getReactionsWindow() != null && currentPeerView.h3.getReactionsWindow().c != null) {
                motionEvent.offsetLocation(-f, (-f2) - currentPeerView.h3.getReactionsWindow().c.getTranslationY());
                currentPeerView.h3.getReactionsWindow().c.dispatchTouchEvent(motionEvent);
                return true;
            }
            Rect rect = gl.Q;
            t09Var.getHitRect(rect);
            rect.offset((int) f, (int) f2);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.W0(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            t09Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            m8bVar.k0 = false;
            gl.r(m8bVar.b1);
            float f3 = m8bVar.Y;
            if (f3 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f3, 0.0f);
                m8bVar.H = ofFloat;
                ofFloat.addUpdateListener(new x7b(this, b));
                m8bVar.H.addListener(new y7b(this, b));
                m8bVar.H.setDuration(250L);
                m8bVar.H.setInterpolator(s33.f);
                m8bVar.H.start();
            }
            if (m8bVar.W >= 0.3f) {
                m8bVar.o(true);
            }
            m8bVar.O(false);
            m8bVar.P(false);
            z = true;
        } else {
            z = false;
        }
        if (motionEvent.getAction() == 0) {
            m8bVar.b0 = false;
            if (currentPeerView != null) {
                a6 a6Var = currentPeerView.o0;
                z5b z5bVar = currentPeerView.s0;
                d28 d28Var = currentPeerView.S0;
                je5 je5Var = currentPeerView.v0;
                if (je5Var != null && je5Var.W && z5bVar != null && !je5Var.D0.contains(motionEvent.getX() - (currentPeerView.v0.getX() + (d28Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.v0.getY() + (d28Var.getY() + currentPeerView.getY()))) && !currentPeerView.z0(z5bVar, motionEvent)) {
                    currentPeerView.v0.f(true);
                }
                je5 je5Var2 = currentPeerView.w0;
                if (je5Var2 != null && je5Var2.W && a6Var != null && !je5Var2.D0.contains(motionEvent.getX() - (currentPeerView.w0.getX() + (d28Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.w0.getY() + (d28Var.getY() + currentPeerView.getY()))) && !currentPeerView.z0(a6Var, motionEvent)) {
                    currentPeerView.w0.f(true);
                }
            }
            m8bVar.o0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        boolean z3 = (m8bVar.y || m8bVar.H0 || m8bVar.I0) ? false : true;
        float f4 = m8bVar.f0;
        SparseArray sparseArray = this.w0;
        if (f4 == 0.0f && !m8bVar.k0 && m8bVar.o0.G0 == 1 && motionEvent.getAction() == 2 && z3) {
            float floatValue = ((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0);
            if ((floatValue != 0.0f && (((i = (c8bVar = m8bVar.o0).J0) == 0 && c8bVar.L0 == 0.0f && floatValue < 0.0f) || (i == c8bVar.getAdapter().b() - 1 && c8bVar.L0 == 0.0f && floatValue > 0.0f))) || m8bVar.Y != 0.0f) {
                float f5 = m8bVar.Y;
                if (f5 == 0.0f) {
                    m8bVar.Z = -floatValue;
                }
                if ((floatValue < 0.0f && m8bVar.Z > 0.0f) || (floatValue > 0.0f && m8bVar.Z < 0.0f)) {
                    floatValue *= 0.2f;
                }
                m8bVar.Y = f5 - floatValue;
                m8bVar.V();
                float f6 = m8bVar.Y;
                if ((f6 > 0.0f && m8bVar.Z < 0.0f) || (f6 < 0.0f && m8bVar.Z > 0.0f)) {
                    m8bVar.Y = 0.0f;
                }
                z2 = true;
                if (currentPeerView != null && m8bVar.f0 == 0.0f && !m8bVar.k0 && !m8bVar.L0 && !m8bVar.I0 && m8bVar.o0.G0 != 1) {
                    gl.p1(currentPeerView.S0, this, fArr);
                    motionEvent.offsetLocation(-fArr[0], -fArr[1]);
                    y28 currentPeerView2 = m8bVar.o0.getCurrentPeerView();
                    currentPeerView2.N2.a(motionEvent, currentPeerView2.S0, null, null, 0);
                    motionEvent.offsetLocation(fArr[0], fArr[1]);
                }
                if (motionEvent.getAction() != 1 || motionEvent.getAction() == 3) {
                    sparseArray.clear();
                } else {
                    for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
                        sparseArray.put(motionEvent.getPointerId(i2), Float.valueOf(motionEvent.getX(i2)));
                    }
                }
                if (!z2) {
                    boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        if (m8bVar.f0 != 0.0f && !m8bVar.g1 && m8bVar.q0 < gl.L(20.0f)) {
                            m8bVar.k(m8bVar.x.f > 0.5f);
                        }
                        y28 w = m8bVar.w();
                        if (w != null) {
                            w.A0.w0 = false;
                        }
                    }
                    if (z && !m8bVar.b0) {
                        m8bVar.i();
                    }
                    if (!dispatchTouchEvent && (!m8b.x1 || !m8bVar.r0)) {
                        return false;
                    }
                }
                return true;
            }
        }
        z2 = false;
        if (currentPeerView != null) {
            gl.p1(currentPeerView.S0, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            y28 currentPeerView22 = m8bVar.o0.getCurrentPeerView();
            currentPeerView22.N2.a(motionEvent, currentPeerView22.S0, null, null, 0);
            motionEvent.offsetLocation(fArr[0], fArr[1]);
        }
        if (motionEvent.getAction() != 1) {
        }
        sparseArray.clear();
        if (!z2) {
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.y0.z0) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m8b m8bVar = this.y0;
        if (m8bVar.b && !m8bVar.c) {
            d dVar = this.x0;
            gl.V2(dVar.getParentActivity(), dVar.getClassGuid());
        }
        setTag(R.id.bulletin_delegate_tag, new z7b(this));
        kk7.f(m8bVar.h).b(m8bVar, kk7.z5);
        kk7.f(m8bVar.h).b(m8bVar, kk7.x5);
        kk7.f(m8bVar.h).b(m8bVar, kk7.c1);
        kk7.f(m8bVar.h).b(m8bVar, kk7.b1);
        kk7.f(m8bVar.h).b(m8bVar, kk7.y5);
    }

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
        m8b m8bVar = this.y0;
        kk7.f(m8bVar.h).n(m8bVar, kk7.z5);
        kk7.f(m8bVar.h).n(m8bVar, kk7.x5);
        kk7.f(m8bVar.h).n(m8bVar, kk7.c1);
        kk7.f(m8bVar.h).n(m8bVar, kk7.b1);
        kk7.f(m8bVar.h).n(m8bVar, kk7.y5);
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01df  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        l18 l18Var;
        l8b l8bVar;
        y28 currentPeerView;
        boolean z;
        boolean z2;
        kya kyaVar;
        c30 c30Var;
        y28 currentPeerView2;
        x28 x28Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        l18 l18Var2;
        m8b m8bVar = this.y0;
        g28 g28Var = m8bVar.b1;
        if (motionEvent.getAction() == 0 && m8bVar.V == 1.0f) {
            float x = motionEvent.getX();
            this.o0 = x;
            this.m0 = x;
            this.n0 = motionEvent.getY();
            m8bVar.h0 = false;
            m8bVar.g0 = (m8bVar.I0 || m8bVar.v(m8bVar.s, motionEvent.getX(), motionEvent.getY(), false)) ? false : true;
            m8bVar.i0 = (m8bVar.I0 || m8bVar.v(m8bVar.s, motionEvent.getX(), motionEvent.getY(), true)) ? false : true;
            m8bVar.O(m8bVar.g0 && !m8bVar.m1);
            y28 w = m8bVar.w();
            if (m8bVar.g0 && w != null && (l18Var2 = w.B0) != null) {
                l18Var2.setAllowTouches(false);
            }
            if (m8bVar.g0 && !m8bVar.I0 && m8bVar.m1) {
                kya kyaVar2 = new kya((Object) this, (byte) 21);
                m8bVar.n1 = kyaVar2;
                gl.d3(kyaVar2, 150L);
            }
            if (m8bVar.g0 && !m8bVar.y && !m8bVar.I0 && !m8bVar.j1) {
                gl.d3(g28Var, 400L);
            }
            f = 1.0f;
        } else if (motionEvent.getAction() == 2) {
            float abs = Math.abs(this.n0 - motionEvent.getY());
            float abs2 = Math.abs(this.m0 - motionEvent.getX());
            if (m8bVar.a1 && m8bVar.l0 && !m8bVar.f1 && !m8bVar.k0 && (c30Var = m8bVar.G0) != null && ((l8b) c30Var.c) != null && (currentPeerView2 = m8bVar.o0.getCurrentPeerView()) != null && (x28Var = currentPeerView2.E1) != null && x28Var.b == null && x28Var.e) {
                long j = currentPeerView2.H2;
                if (j <= 0 && (storyItem = x28Var.a) != null && (messageMedia = storyItem.media) != null && (document = messageMedia.document) != null) {
                    j = (long) (k27.H0(document) * 1000.0d);
                }
                if (j > 0) {
                    float x2 = motionEvent.getX();
                    l8b l8bVar2 = (l8b) m8bVar.G0.c;
                    f = 1.0f;
                    if (((int) (l8bVar2.seek((x2 - this.o0) / gl.L(220.0f), j) * 10.0f)) != ((int) (l8bVar2.currentSeek * 10.0f))) {
                        try {
                            currentPeerView2.performHapticFeedback(9, 1);
                        } catch (Exception unused) {
                        }
                    }
                    currentPeerView2.S0.invalidate();
                    this.o0 = x2;
                    if (abs > abs2 && !m8bVar.l0 && !m8bVar.h0 && abs > gl.e * 2.0f) {
                        m8bVar.h0 = true;
                    }
                    if (!m8bVar.k0 && !m8bVar.l0 && !m8bVar.y && m8bVar.i0) {
                        if (abs > abs2 && abs > gl.e * 2.0f) {
                            m8bVar.k0 = true;
                            currentPeerView = m8bVar.o0.getCurrentPeerView();
                            if (currentPeerView != null) {
                                currentPeerView.f0();
                                if (!currentPeerView.E1.f && (currentPeerView.s1 || (currentPeerView.t1 && currentPeerView.r3))) {
                                    z = true;
                                    m8bVar.m0 = (!z || currentPeerView == null || currentPeerView.t1 || currentPeerView.v1 || m8bVar.u1 != null) ? false : true;
                                    z2 = (z || currentPeerView.S2 || currentPeerView.E1.a == null || m8bVar.u1 != null) ? false : true;
                                    m8bVar.d0 = z2;
                                    if (z2 && this.f != 0) {
                                        m8bVar.d0 = false;
                                        z2 = false;
                                    }
                                    if (z2) {
                                        m8bVar.m();
                                    }
                                    m8bVar.a0 = 0.0f;
                                    kyaVar = m8bVar.n1;
                                    if (kyaVar != null) {
                                        gl.r(kyaVar);
                                        m8bVar.n1.run();
                                        m8bVar.n1 = null;
                                    }
                                    gl.r(g28Var);
                                }
                            }
                            z = false;
                            m8bVar.m0 = (!z || currentPeerView == null || currentPeerView.t1 || currentPeerView.v1 || m8bVar.u1 != null) ? false : true;
                            if (z) {
                            }
                            m8bVar.d0 = z2;
                            if (z2) {
                                m8bVar.d0 = false;
                                z2 = false;
                            }
                            if (z2) {
                            }
                            m8bVar.a0 = 0.0f;
                            kyaVar = m8bVar.n1;
                            if (kyaVar != null) {
                            }
                            gl.r(g28Var);
                        }
                        m8bVar.C();
                    }
                }
            }
            f = 1.0f;
            if (abs > abs2) {
                m8bVar.h0 = true;
            }
            if (!m8bVar.k0) {
                if (abs > abs2) {
                    m8bVar.k0 = true;
                    currentPeerView = m8bVar.o0.getCurrentPeerView();
                    if (currentPeerView != null) {
                    }
                    z = false;
                    m8bVar.m0 = (!z || currentPeerView == null || currentPeerView.t1 || currentPeerView.v1 || m8bVar.u1 != null) ? false : true;
                    if (z) {
                    }
                    m8bVar.d0 = z2;
                    if (z2) {
                    }
                    if (z2) {
                    }
                    m8bVar.a0 = 0.0f;
                    kyaVar = m8bVar.n1;
                    if (kyaVar != null) {
                    }
                    gl.r(g28Var);
                }
                m8bVar.C();
            }
        } else {
            f = 1.0f;
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                gl.r(g28Var);
                kya kyaVar3 = m8bVar.n1;
                if (kyaVar3 != null) {
                    gl.r(kyaVar3);
                    m8bVar.n1 = null;
                }
                m8bVar.O(false);
                m8bVar.h0 = false;
                m8bVar.l0 = false;
                c30 c30Var2 = m8bVar.G0;
                if (c30Var2 != null && (l8bVar = (l8b) c30Var2.c) != null) {
                    l8bVar.setSeeking(false);
                }
                y28 w2 = m8bVar.w();
                if (w2 != null && (l18Var = w2.B0) != null) {
                    l18Var.setAllowTouches(true);
                }
            }
        }
        n0a n0aVar = m8bVar.x;
        boolean z3 = n0aVar != null && n0aVar.f == f;
        if (!m8bVar.k0 && !z3) {
            m8bVar.j0.onTouchEvent(motionEvent);
        }
        return m8bVar.k0 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        m8b m8bVar = this.y0;
        ((FrameLayout.LayoutParams) m8bVar.d1.getLayoutParams()).topMargin = gl.m - gl.L(2.0f);
        m8bVar.d1.getLayoutParams().height = gl.L(2.0f);
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        l18 l18Var;
        int action = motionEvent.getAction();
        m8b m8bVar = this.y0;
        byte b = 1;
        if (action == 1 || motionEvent.getAction() == 3) {
            m8bVar.k0 = false;
            m8bVar.O(false);
            if (m8bVar.W >= 1.0f) {
                m8bVar.o(true);
            } else if (!m8bVar.H0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(m8bVar.X, 0.0f);
                m8bVar.H = ofFloat;
                ofFloat.addUpdateListener(new x7b(this, b));
                m8bVar.H.addListener(new y7b(this, b));
                m8bVar.H.setDuration(150L);
                m8bVar.H.setInterpolator(s33.f);
                m8bVar.H.start();
            }
            y28 w = m8bVar.w();
            if (w != null && (l18Var = w.B0) != null) {
                l18Var.setAllowTouches(true);
            }
        }
        if (!m8bVar.k0 && !m8bVar.y && m8bVar.a0 == 0.0f && ((m8bVar.f0 == 0.0f || (!m8bVar.g0 && !m8bVar.h0)) && !m8bVar.j1)) {
            return false;
        }
        m8bVar.j0.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.y0.g0 = false;
    }
}
