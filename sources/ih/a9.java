package ih;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qi0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.xu0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class a9 extends xu0 {
    public final RectF A0;
    public final RectF B0;
    public final SparseArray C0;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 D0;
    public final /* synthetic */ m9 E0;
    public float s0;
    public float t0;
    public float u0;
    public final float[] v0;
    public final Path w0;
    public final RectF x0;
    public final RectF y0;
    public final RectF z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(m9 m9Var, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, null);
        this.E0 = m9Var;
        this.D0 = o2Var;
        this.v0 = new float[8];
        this.w0 = new Path();
        this.x0 = new RectF();
        this.y0 = new RectF();
        this.z0 = new RectF();
        this.A0 = new RectF();
        this.B0 = new RectF();
        this.C0 = new SparseArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        char c10;
        char c11;
        float f11;
        e4 e4Var;
        float f12;
        char c12;
        float f13;
        RectF rectF;
        float f14;
        float[] fArr;
        float f15;
        float f16;
        RectF rectF2;
        RectF rectF3;
        float f17;
        RectF rectF4;
        float f18;
        float f19;
        float f20;
        l7 l7Var;
        float f21;
        Paint paint;
        View view;
        l7 l7Var2;
        h9 h9Var;
        g9 g9Var;
        i4 currentPeerView;
        l3 l3Var;
        l7 l7Var3;
        int i9;
        i4 t10;
        qi0 qi0Var;
        m9 m9Var = this.E0;
        RectF rectF5 = m9Var.P;
        j9 j9Var = m9Var.o0;
        canvas.drawColor(i0.a.k(-16777216, (int) ((((1.0f - m9Var.R) * 0.5f) + 0.5f) * m9Var.Q * 255.0f)));
        if (m9Var.b) {
            boolean z10 = (1.0f - m9Var.R) * m9Var.Q == 1.0f;
            if (m9Var.G0 != z10) {
                m9Var.G0 = z10;
                org.telegram.ui.ActionBar.o2 o2Var = this.D0;
                if (o2Var.getLayoutContainer() != null) {
                    o2Var.getLayoutContainer().invalidate();
                }
            }
        }
        i4 currentPeerView2 = m9Var.j0.getCurrentPeerView();
        RectF rectF6 = this.B0;
        RectF rectF7 = this.A0;
        if (currentPeerView2 != null) {
            e4 e4Var2 = currentPeerView2.k1;
            if (m9Var.R0) {
                e4Var2.a.getImageReceiver().setVisible(m9Var.Q == 1.0f, true);
            } else {
                e4Var2.a.getImageReceiver().setVisible(true, false);
            }
            if (m9Var.d1) {
                m9Var.d1 = false;
                d4 d4Var = e4Var2.a;
                float f22 = 0.0f;
                float f23 = 0.0f;
                f10 = 255.0f;
                c10 = 1;
                for (View view2 = e4Var2.a; view2 != this; view2 = (View) view2.getParent()) {
                    if (view2.getParent() == this) {
                        f22 += view2.getLeft();
                        f23 += view2.getTop();
                    } else if (view2.getParent() != m9Var.j0) {
                        f22 += view2.getX();
                        f23 += view2.getY();
                    }
                }
                c11 = 0;
                f11 = 1.0f;
                rectF7.set(f22, f23, d4Var.getMeasuredWidth() + f22, d4Var.getMeasuredHeight() + f23);
                rectF6.set(0.0f, currentPeerView2.Y0.getTop() + currentPeerView2.getTop(), m9Var.v.getMeasuredWidth(), m9Var.v.getMeasuredHeight());
                m9Var.v.getMatrix().mapRect(rectF7);
                m9Var.v.getMatrix().mapRect(rectF6);
            } else {
                f10 = 255.0f;
                c10 = 1;
                c11 = 0;
                f11 = 1.0f;
            }
            e4Var = e4Var2;
        } else {
            f10 = 255.0f;
            c10 = 1;
            c11 = 0;
            f11 = 1.0f;
            e4Var = null;
        }
        m9Var.Z0.setAlpha(f11 - m9Var.R);
        float clamp = m9Var.T == 0.0f ? 1.0f - Utilities.clamp(Math.abs(m9Var.S / getMeasuredHeight()), 1.0f, 0.0f) : 1.0f;
        m9Var.j0.setHorizontalProgressToDismiss((m9Var.T / m9Var.v.getMeasuredWidth()) * m9Var.Q);
        if (m9Var.J != 0.0f || m9Var.K != 0.0f) {
            float f24 = m9Var.Q;
            if (f24 != 1.0f) {
                if (m9Var.D0 && m9Var.R0) {
                    float clamp2 = 1.0f - Utilities.clamp(((1.0f - f24) - 0.8f) / 0.100000024f, 1.0f, 0.0f);
                    f12 = 0.15f;
                    f13 = Utilities.clamp(j3.r0.C(1.0f, clamp2, 0.05f, f24), 1.0f, 0.0f);
                    c12 = 2;
                    m9Var.v.setAlpha(clamp2);
                } else {
                    f12 = 0.15f;
                    c12 = 2;
                    m9Var.v.setAlpha(1.0f);
                    f13 = f24;
                }
                if (!m9Var.D0 || j9Var == null || j9Var.c == null) {
                    rectF = rectF7;
                } else {
                    b9 b9Var = m9Var.v;
                    rectF = rectF7;
                    b9Var.setAlpha(b9Var.getAlpha() * ((float) Math.pow(f24, 0.20000000298023224d)));
                }
                b9 b9Var2 = m9Var.v;
                float left = (m9Var.J - b9Var2.getLeft()) - (m9Var.v.getMeasuredWidth() / 2.0f);
                float f25 = m9Var.Q;
                b9Var2.setTranslationX((m9Var.T * f25) + ((1.0f - f25) * left));
                b9 b9Var3 = m9Var.v;
                float top = (m9Var.K - b9Var3.getTop()) - (m9Var.v.getMeasuredHeight() / 2.0f);
                float f26 = m9Var.Q;
                b9Var3.setTranslationY((m9Var.S * f26) + ((1.0f - f26) * top));
                float lerp = AndroidUtilities.lerp(m9Var.N / m9Var.v.getMeasuredWidth(), (clamp * f12) + 0.85f, f13);
                m9Var.v.setScaleX(lerp);
                m9Var.v.setScaleY(lerp);
                Path path = this.w0;
                path.rewind();
                float f27 = m9Var.J;
                float f28 = m9Var.N / 2.0f;
                float f29 = m9Var.K;
                float f30 = m9Var.O / 2.0f;
                float f31 = f30 + f29;
                RectF rectF8 = this.x0;
                rectF8.set(f27 - f28, f29 - f30, f28 + f27, f31);
                boolean z11 = m9Var.D0;
                RectF rectF9 = this.y0;
                if (z11 && m9Var.R0) {
                    rectF9.set(rectF6);
                } else if (currentPeerView2 != null) {
                    rectF9.set(0.0f, currentPeerView2.Y0.getTop() + m9Var.X, getMeasuredWidth(), getMeasuredHeight() + m9Var.X);
                } else {
                    rectF9.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                if (m9Var.D0 && m9Var.R0) {
                    rectF8.inset(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                }
                float lerp2 = AndroidUtilities.lerp(rectF8.centerX(), rectF9.centerX(), m9Var.Q);
                float lerp3 = AndroidUtilities.lerp(rectF8.centerY(), rectF9.centerY(), m9Var.Q);
                float lerp4 = AndroidUtilities.lerp(rectF8.height(), rectF9.height(), f13);
                float lerp5 = AndroidUtilities.lerp(rectF8.width(), rectF9.width(), f13);
                if (m9Var.D0 && m9Var.R0) {
                    f14 = lerp2;
                    rectF8.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
                } else {
                    f14 = lerp2;
                }
                RectF rectF10 = AndroidUtilities.rectTmp;
                float f32 = lerp5 / 2.0f;
                float f33 = lerp4 / 2.0f;
                rectF10.set(f14 - f32, lerp3 - f33, f14 + f32, lerp3 + f33);
                boolean z12 = m9Var.R0;
                float[] fArr2 = this.v0;
                if (z12) {
                    float lerp6 = AndroidUtilities.lerp(m9Var.N / 2.0f, 0.0f, f13);
                    fArr = fArr2;
                    fArr[7] = lerp6;
                    fArr[6] = lerp6;
                    fArr[5] = lerp6;
                    fArr[4] = lerp6;
                    fArr[3] = lerp6;
                    fArr[c12] = lerp6;
                    fArr[c10] = lerp6;
                    fArr[c11] = lerp6;
                } else {
                    fArr = fArr2;
                    int[] iArr = m9Var.S0;
                    if (iArr == null) {
                        f15 = 0.0f;
                        fArr[7] = 0.0f;
                        fArr[6] = 0.0f;
                        fArr[5] = 0.0f;
                        fArr[4] = 0.0f;
                        fArr[3] = 0.0f;
                        fArr[c12] = 0.0f;
                        fArr[c10] = 0.0f;
                        fArr[0] = 0.0f;
                        path.addRoundRect(rectF10, fArr, Path.Direction.CCW);
                        canvas.save();
                        f16 = m9Var.L;
                        if (f16 != f15 && m9Var.M != f15) {
                            canvas.clipRect(f15, AndroidUtilities.lerp(f15, f16, (float) Math.pow(1.0f - m9Var.Q, 0.4000000059604645d)), getMeasuredWidth(), AndroidUtilities.lerp(getMeasuredHeight(), m9Var.M, 1.0f - m9Var.Q));
                        }
                        if (j9Var == null && (l7Var3 = j9Var.m) != null && l7Var3.w && m9Var.R0) {
                            rectF2 = rectF8;
                            rectF3 = rectF5;
                            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f24 * f10), 31);
                        } else {
                            rectF2 = rectF8;
                            rectF3 = rectF5;
                            canvas.save();
                        }
                        canvas.clipPath(path);
                        super.dispatchDraw(canvas);
                        RectF rectF11 = this.z0;
                        if (j9Var != null || j9Var.c == null || (currentPeerView = m9Var.j0.getCurrentPeerView()) == null || (l3Var = currentPeerView.Y0) == null) {
                            f17 = f24;
                            rectF4 = rectF2;
                            f18 = 0.0f;
                        } else {
                            boolean visible = j9Var.c.getVisible();
                            f18 = 0.0f;
                            rectF9.set(l3Var.getX() + currentPeerView.getX() + m9Var.T + m9Var.v.getLeft(), l3Var.getY() + currentPeerView.getY() + m9Var.S + m9Var.v.getTop(), ((m9Var.T + m9Var.v.getRight()) - (m9Var.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - l3Var.getRight()), ((m9Var.S + m9Var.v.getBottom()) - (m9Var.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - l3Var.getBottom()));
                            AndroidUtilities.lerp(rectF2, rectF9, f24, rectF11);
                            float imageX = j9Var.c.getImageX();
                            float imageY = j9Var.c.getImageY();
                            float imageWidth = j9Var.c.getImageWidth();
                            float imageHeight = j9Var.c.getImageHeight();
                            j9Var.c.setImageCoords(rectF11);
                            float f34 = 1.0f - f24;
                            j9Var.c.setAlpha(f34);
                            f17 = f24;
                            rectF4 = rectF2;
                            j9Var.c.setVisible(true, false);
                            int saveCount = canvas.getSaveCount();
                            g9 g9Var2 = j9Var.f;
                            if (g9Var2 != null) {
                                g9Var2.g(f34, canvas, rectF11, m9Var.A);
                            }
                            j9Var.c.draw(canvas);
                            h9 h9Var2 = j9Var.e;
                            if (h9Var2 != null) {
                                h9Var2.d(canvas, rectF11, f34);
                            }
                            j9Var.c.setVisible(visible, false);
                            j9Var.c.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                            canvas.restoreToCount(saveCount);
                        }
                        canvas.restore();
                        if (e4Var != null) {
                            d4 d4Var2 = e4Var.a;
                            float f35 = m9Var.T;
                            float f36 = m9Var.S;
                            if (m9Var.D0 && m9Var.R0) {
                                rectF9.set(rectF);
                            } else {
                                for (View view3 = d4Var2; view3 != this && view3 != null; view3 = (View) view3.getParent()) {
                                    if (view3.getParent() == this) {
                                        f35 += view3.getLeft();
                                        f36 += view3.getTop();
                                    } else if (view3.getParent() != m9Var.j0) {
                                        float x10 = view3.getX() + f35;
                                        f36 = view3.getY() + f36;
                                        f35 = x10;
                                    }
                                    if (!(view3.getParent() instanceof View)) {
                                        break;
                                    }
                                }
                                rectF9.set(f35, f36, d4Var2.getMeasuredWidth() + f35, d4Var2.getMeasuredHeight() + f36);
                            }
                            AndroidUtilities.lerp(rectF4, rectF9, m9Var.Q, rectF11);
                            int saveCount2 = canvas.getSaveCount();
                            if (j9Var != null && (g9Var = j9Var.f) != null) {
                                g9Var.g(1.0f - f17, canvas, rectF11, m9Var.A);
                            }
                            if (m9Var.R0) {
                                boolean z13 = (j9Var == null || j9Var.l == null) ? false : true;
                                if (z13 && m9Var.Q == f18) {
                                    f19 = f17;
                                } else {
                                    if (j9Var != null && (l7Var2 = j9Var.m) != null && l7Var2.w) {
                                        canvas.saveLayerAlpha(rectF11.left - AndroidUtilities.dp(4.0f), rectF11.top - AndroidUtilities.dp(4.0f), rectF11.right + AndroidUtilities.dp(4.0f), rectF11.bottom + AndroidUtilities.dp(4.0f), 255, 31);
                                    }
                                    d4Var2.getImageReceiver().setImageCoords(rectF11);
                                    d4Var2.getImageReceiver().setRoundRadius((int) AndroidUtilities.lerp(rectF11.width() / 2.0f, ((j9Var == null || j9Var.b == null) ? null : Integer.valueOf((int) (j9Var.b.getRoundRadius()[0] * ((!j9Var.n || (view = j9Var.a) == null || view.getParent() == null) ? 1.0f : ((ViewGroup) j9Var.a.getParent()).getScaleY())))) != null ? r4.intValue() : rectF11.width() / 2.0f, 1.0f - m9Var.Q));
                                    d4Var2.getImageReceiver().setVisible(true, false);
                                    float f37 = z13 ? m9Var.Q : 1.0f;
                                    if (j9Var == null || j9Var.k >= 1.0f || (paint = j9Var.j) == null) {
                                        f19 = f17;
                                        f20 = f37;
                                    } else {
                                        paint.setAlpha((int) ((1.0f - f17) * f10));
                                        canvas.drawCircle(rectF11.centerX(), rectF11.centerY(), rectF11.width() / 2.0f, j9Var.j);
                                        f19 = f17;
                                        f20 = AndroidUtilities.lerp(j9Var.k, f37, f19);
                                    }
                                    d4Var2.getImageReceiver().setAlpha(f20);
                                    e4Var.b(m9Var.Q, canvas, rectF11, !m9.w1);
                                    d4Var2.getImageReceiver().draw(canvas);
                                    d4Var2.getImageReceiver().setAlpha(f37);
                                    d4Var2.getImageReceiver().setVisible(false, false);
                                    if (j9Var != null && (l7Var = j9Var.m) != null && l7Var.w) {
                                        RectF rectF12 = AndroidUtilities.rectTmp;
                                        rectF12.set(rectF11);
                                        f21 = 1.0f;
                                        p7.k(canvas, rectF12, 1.0f - m9Var.Q, true, 0.0f);
                                        canvas.restore();
                                        if (m9Var.Q != f21 && z13) {
                                            RectF rectF13 = rectF3;
                                            rectF13.set(j9Var.l.getImageX(), j9Var.l.getImageY(), j9Var.l.getImageX2(), j9Var.l.getImageY2());
                                            int i10 = j9Var.l.getRoundRadius()[0];
                                            boolean visible2 = j9Var.l.getVisible();
                                            j9Var.l.setImageCoords(rectF11);
                                            j9Var.l.setRoundRadius((int) (rectF11.width() / 2.0f));
                                            j9Var.l.setVisible(true, false);
                                            canvas.saveLayerAlpha(rectF11, (int) ((1.0f - m9Var.Q) * f10), 31);
                                            j9Var.l.draw(canvas);
                                            canvas.restore();
                                            j9Var.l.setVisible(visible2, false);
                                            j9Var.l.setImageCoords(rectF13);
                                            j9Var.l.setRoundRadius(i10);
                                        }
                                        if (j9Var != null && (h9Var = j9Var.e) != null) {
                                            h9Var.d(canvas, rectF11, 1.0f - f19);
                                        }
                                    }
                                }
                                f21 = 1.0f;
                                if (m9Var.Q != f21) {
                                    RectF rectF132 = rectF3;
                                    rectF132.set(j9Var.l.getImageX(), j9Var.l.getImageY(), j9Var.l.getImageX2(), j9Var.l.getImageY2());
                                    int i102 = j9Var.l.getRoundRadius()[0];
                                    boolean visible22 = j9Var.l.getVisible();
                                    j9Var.l.setImageCoords(rectF11);
                                    j9Var.l.setRoundRadius((int) (rectF11.width() / 2.0f));
                                    j9Var.l.setVisible(true, false);
                                    canvas.saveLayerAlpha(rectF11, (int) ((1.0f - m9Var.Q) * f10), 31);
                                    j9Var.l.draw(canvas);
                                    canvas.restore();
                                    j9Var.l.setVisible(visible22, false);
                                    j9Var.l.setImageCoords(rectF132);
                                    j9Var.l.setRoundRadius(i102);
                                }
                                if (j9Var != null) {
                                    h9Var.d(canvas, rectF11, 1.0f - f19);
                                }
                            }
                            canvas.restoreToCount(saveCount2);
                        }
                        if (m9Var.I != null) {
                            float clamp3 = Utilities.clamp(m9Var.Q / 0.4f, 1.0f, 0.0f);
                            if (clamp3 != 1.0f) {
                                RectF rectF14 = AndroidUtilities.rectTmp;
                                float f38 = m9Var.J;
                                float f39 = m9Var.K;
                                rectF14.set(f38, f39, m9Var.N + f38, m9Var.O + f39);
                                rectF14.inset(-AndroidUtilities.dp(16.0f), -AndroidUtilities.dp(16.0f));
                                if (clamp3 != 0.0f) {
                                    canvas.saveLayerAlpha(rectF14, (int) ((1.0f - clamp3) * f10), 31);
                                } else {
                                    canvas.save();
                                }
                                canvas.translate(m9Var.G, m9Var.H);
                                ((org.telegram.ui.Cells.r2) m9Var.I).A(canvas);
                                canvas.restore();
                            }
                        }
                        canvas.restore();
                        if (m9.w1) {
                            ArrayList arrayList = m9Var.t0;
                            m9Var.Q();
                            m9Var.Q = 0.0f;
                            m9Var.M(true);
                            m9Var.d = false;
                            m9.t1 = true;
                            m9Var.X = m9Var.S;
                            if (j9Var.d != null && (t10 = m9Var.t()) != null && (qi0Var = t10.k1.d) != null) {
                                qi0 qi0Var2 = j9Var.d;
                                qi0Var.c = qi0Var2.c;
                                qi0Var.f = qi0Var2.f;
                                qi0Var.b = qi0Var2.b;
                                qi0Var.a = System.currentTimeMillis();
                                qi0Var.c();
                            }
                            m9Var.A = true;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            m9Var.B = ofFloat;
                            ofFloat.addUpdateListener(new u8(m9Var, 1));
                            m9Var.F0.lock();
                            b9 b9Var4 = m9Var.v;
                            if (b9Var4 != null) {
                                v.c = true;
                                i9 = 2;
                                b9Var4.setLayerType(2, null);
                            } else {
                                i9 = 2;
                            }
                            m9Var.B.addListener(new v8(m9Var, i9));
                            m9Var.B.setStartDelay(40L);
                            m9Var.B.setDuration(250L);
                            m9Var.B.setInterpolator(gr.f);
                            m9Var.B.start();
                            if (!arrayList.isEmpty()) {
                                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                    ((Runnable) arrayList.get(i11)).run();
                                }
                                arrayList.clear();
                            }
                            m9.w1 = false;
                            return;
                        }
                        return;
                    }
                    float lerp7 = AndroidUtilities.lerp(iArr[c11], 0, f24);
                    fArr[c10] = lerp7;
                    fArr[0] = lerp7;
                    float lerp8 = AndroidUtilities.lerp(m9Var.S0[c10], 0, f24);
                    fArr[3] = lerp8;
                    fArr[c12] = lerp8;
                    float lerp9 = AndroidUtilities.lerp(m9Var.S0[c12], 0, f24);
                    fArr[5] = lerp9;
                    fArr[4] = lerp9;
                    float lerp10 = AndroidUtilities.lerp(m9Var.S0[3], 0, f24);
                    fArr[7] = lerp10;
                    fArr[6] = lerp10;
                }
                f15 = 0.0f;
                path.addRoundRect(rectF10, fArr, Path.Direction.CCW);
                canvas.save();
                f16 = m9Var.L;
                if (f16 != f15) {
                    canvas.clipRect(f15, AndroidUtilities.lerp(f15, f16, (float) Math.pow(1.0f - m9Var.Q, 0.4000000059604645d)), getMeasuredWidth(), AndroidUtilities.lerp(getMeasuredHeight(), m9Var.M, 1.0f - m9Var.Q));
                }
                if (j9Var == null) {
                }
                rectF2 = rectF8;
                rectF3 = rectF5;
                canvas.save();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                RectF rectF112 = this.z0;
                if (j9Var != null) {
                }
                f17 = f24;
                rectF4 = rectF2;
                f18 = 0.0f;
                canvas.restore();
                if (e4Var != null) {
                }
                if (m9Var.I != null) {
                }
                canvas.restore();
                if (m9.w1) {
                }
            }
        }
        m9Var.v.setAlpha(m9Var.Q);
        float f40 = (clamp * 0.15f) + (m9Var.Q * 0.1f) + 0.75f;
        m9Var.v.setScaleX(f40);
        m9Var.v.setScaleY(f40);
        m9Var.v.setTranslationY(m9Var.S);
        m9Var.v.setTranslationX(m9Var.T);
        super.dispatchDraw(canvas);
        if (m9.w1) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        m9 m9Var = this.E0;
        if (keyCode == 24 || keyEvent.getKeyCode() == 25) {
            m9Var.r(keyEvent);
            return true;
        }
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        m9Var.onAttachedBackPressed();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0310  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        c9 c9Var;
        int i9;
        uj0 uj0Var;
        m9 m9Var = this.E0;
        float[] fArr = m9Var.k0;
        i4 currentPeerView = m9Var.j0.getCurrentPeerView();
        if (currentPeerView != null) {
            p3 p3Var = currentPeerView.G0;
            if (p3Var.S.y()) {
                float x10 = currentPeerView.getX();
                float y10 = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x10, -y10);
                if (!p3Var.S.o(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x10, y10);
                }
                return true;
            }
        }
        float f10 = 0.0f;
        int i10 = 0;
        if (m9Var.l1 && currentPeerView != null && (uj0Var = currentPeerView.n3) != null) {
            float f11 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f10 += view.getX();
                f11 += view.getY();
            }
            if (currentPeerView.n3.getReactionsWindow() != null && currentPeerView.n3.getReactionsWindow().c != null) {
                motionEvent.offsetLocation(-f10, (-f11) - currentPeerView.n3.getReactionsWindow().c.getTranslationY());
                currentPeerView.n3.getReactionsWindow().c.dispatchTouchEvent(motionEvent);
                return true;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            uj0Var.getHitRect(rect);
            rect.offset((int) f10, (int) f11);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.b1(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            uj0Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            m9Var.f0 = false;
            AndroidUtilities.cancelRunOnUIThread(m9Var.X0);
            float f12 = m9Var.T;
            if (f12 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, 0.0f);
                m9Var.C = ofFloat;
                ofFloat.addUpdateListener(new x8(this, i10));
                m9Var.C.addListener(new y8(this, i10));
                m9Var.C.setDuration(250L);
                m9Var.C.setInterpolator(gr.f);
                m9Var.C.start();
            }
            if (m9Var.R >= 0.3f) {
                m9Var.q(true);
            }
            m9Var.K(false);
            m9Var.L(false);
            z10 = true;
        } else {
            z10 = false;
        }
        if (motionEvent.getAction() == 0) {
            m9Var.W = false;
            if (currentPeerView != null) {
                dh.g gVar = currentPeerView.u0;
                r8 r8Var = currentPeerView.y0;
                l3 l3Var = currentPeerView.Y0;
                kh.x3 x3Var = currentPeerView.B0;
                if (x3Var != null && x3Var.R && r8Var != null && !x3Var.n0.contains(motionEvent.getX() - (currentPeerView.B0.getX() + (l3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.B0.getY() + (l3Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, r8Var)) {
                    currentPeerView.B0.e(true);
                }
                kh.x3 x3Var2 = currentPeerView.C0;
                if (x3Var2 != null && x3Var2.R && gVar != null && !x3Var2.n0.contains(motionEvent.getX() - (currentPeerView.C0.getX() + (l3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.C0.getY() + (l3Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, gVar)) {
                    currentPeerView.C0.e(true);
                }
            }
            m9Var.j0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        boolean z12 = (m9Var.x || m9Var.D0 || m9Var.E0) ? false : true;
        float f13 = m9Var.a0;
        SparseArray sparseArray = this.C0;
        if (f13 == 0.0f && !m9Var.f0 && m9Var.j0.B0 == 1 && motionEvent.getAction() == 2 && z12) {
            float floatValue = ((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0);
            if ((floatValue != 0.0f && (((i9 = (c9Var = m9Var.j0).E0) == 0 && c9Var.G0 == 0.0f && floatValue < 0.0f) || (i9 == c9Var.getAdapter().b() - 1 && c9Var.G0 == 0.0f && floatValue > 0.0f))) || m9Var.T != 0.0f) {
                float f14 = m9Var.T;
                if (f14 == 0.0f) {
                    m9Var.U = -floatValue;
                }
                if ((floatValue < 0.0f && m9Var.U > 0.0f) || (floatValue > 0.0f && m9Var.U < 0.0f)) {
                    floatValue *= 0.2f;
                }
                m9Var.T = f14 - floatValue;
                m9.k(m9Var);
                float f15 = m9Var.T;
                if ((f15 > 0.0f && m9Var.U < 0.0f) || (f15 < 0.0f && m9Var.U > 0.0f)) {
                    m9Var.T = 0.0f;
                }
                z11 = true;
                if (currentPeerView != null && m9Var.a0 == 0.0f && !m9Var.f0 && !m9Var.H0 && !m9Var.E0 && m9Var.j0.B0 != 1) {
                    AndroidUtilities.getViewPositionInParent(currentPeerView.Y0, this, fArr);
                    motionEvent.offsetLocation(-fArr[0], -fArr[1]);
                    i4 currentPeerView2 = m9Var.j0.getCurrentPeerView();
                    currentPeerView2.T2.a(motionEvent, currentPeerView2.Y0, null, null, 0);
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
                        if (m9Var.a0 != 0.0f && !m9Var.c1 && m9Var.l0 < AndroidUtilities.dp(20.0f)) {
                            m9Var.n(m9Var.w.f > 0.5f);
                        }
                        i4 t10 = m9Var.t();
                        if (t10 != null) {
                            t10.G0.s0 = false;
                        }
                    }
                    if (z10 && !m9Var.W) {
                        m9Var.m();
                    }
                    if (!dispatchTouchEvent && (!m9.t1 || !m9Var.m0)) {
                        return false;
                    }
                }
                return true;
            }
        }
        z11 = false;
        if (currentPeerView != null) {
            AndroidUtilities.getViewPositionInParent(currentPeerView.Y0, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            i4 currentPeerView22 = m9Var.j0.getCurrentPeerView();
            currentPeerView22.T2.a(motionEvent, currentPeerView22.Y0, null, null, 0);
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
        if (view == this.E0.u0) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m9 m9Var = this.E0;
        if (m9Var.b && !m9Var.c) {
            org.telegram.ui.ActionBar.o2 o2Var = this.D0;
            AndroidUtilities.requestAdjustResize(o2Var.getParentActivity(), o2Var.getClassGuid());
        }
        gc.a(this, new z8(this));
        NotificationCenter.getInstance(m9Var.h).addObserver(m9Var, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(m9Var.h).addObserver(m9Var, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(m9Var.h).addObserver(m9Var, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(m9Var.h).addObserver(m9Var, NotificationCenter.openArticle);
        NotificationCenter.getInstance(m9Var.h).addObserver(m9Var, NotificationCenter.storyDeleted);
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gc.h(this);
        m9 m9Var = this.E0;
        NotificationCenter.getInstance(m9Var.h).removeObserver(m9Var, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(m9Var.h).removeObserver(m9Var, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(m9Var.h).removeObserver(m9Var, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(m9Var.h).removeObserver(m9Var, NotificationCenter.openArticle);
        NotificationCenter.getInstance(m9Var.h).removeObserver(m9Var, NotificationCenter.storyDeleted);
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01e4  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f10;
        h2 h2Var;
        l9 l9Var;
        i4 currentPeerView;
        boolean z10;
        g gVar;
        h4 h4Var;
        i4 currentPeerView2;
        g4 g4Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        h2 h2Var2;
        m9 m9Var = this.E0;
        n3 n3Var = m9Var.X0;
        if (motionEvent.getAction() == 0 && m9Var.Q == 1.0f) {
            float x10 = motionEvent.getX();
            this.u0 = x10;
            this.s0 = x10;
            this.t0 = motionEvent.getY();
            m9Var.c0 = false;
            m9Var.b0 = (m9Var.E0 || m9.i(m9Var, m9Var.s, motionEvent.getX(), motionEvent.getY(), false)) ? false : true;
            m9Var.d0 = (m9Var.E0 || m9.i(m9Var, m9Var.s, motionEvent.getX(), motionEvent.getY(), true)) ? false : true;
            m9Var.K(m9Var.b0 && !m9Var.i1);
            i4 t10 = m9Var.t();
            if (m9Var.b0 && t10 != null && (h2Var2 = t10.H0) != null) {
                h2Var2.setAllowTouches(false);
            }
            if (m9Var.b0 && !m9Var.E0 && m9Var.i1) {
                g gVar2 = new g(this, 21);
                m9Var.j1 = gVar2;
                AndroidUtilities.runOnUIThread(gVar2, 150L);
            }
            if (m9Var.b0 && !m9Var.x && !m9Var.E0 && !m9Var.f1) {
                AndroidUtilities.runOnUIThread(n3Var, 400L);
            }
            f10 = 1.0f;
        } else if (motionEvent.getAction() == 2) {
            float abs = Math.abs(this.t0 - motionEvent.getY());
            float abs2 = Math.abs(this.s0 - motionEvent.getX());
            if (m9Var.W0 && m9Var.g0 && !m9Var.b1 && !m9Var.f0 && (h4Var = m9Var.C0) != null && h4Var.b != null && (currentPeerView2 = m9Var.j0.getCurrentPeerView()) != null && (g4Var = currentPeerView2.K1) != null && g4Var.b == null && g4Var.e) {
                long j10 = currentPeerView2.N2;
                if (j10 <= 0 && (storyItem = g4Var.a) != null && (messageMedia = storyItem.media) != null && (document = messageMedia.document) != null) {
                    j10 = (long) (MessageObject.getDocumentDuration(document) * 1000.0d);
                }
                if (j10 > 0) {
                    float x11 = motionEvent.getX();
                    l9 l9Var2 = m9Var.C0.b;
                    f10 = 1.0f;
                    if (((int) (l9Var2.seek((x11 - this.u0) / AndroidUtilities.dp(220.0f), j10) * 10.0f)) != ((int) (l9Var2.currentSeek * 10.0f))) {
                        try {
                            currentPeerView2.performHapticFeedback(9, 1);
                        } catch (Exception unused) {
                        }
                    }
                    currentPeerView2.Y0.invalidate();
                    this.u0 = x11;
                    if (abs > abs2 && !m9Var.g0 && !m9Var.c0 && abs > AndroidUtilities.touchSlop * 2.0f) {
                        m9Var.c0 = true;
                    }
                    if (!m9Var.f0 && !m9Var.g0 && !m9Var.x && m9Var.d0) {
                        if (abs > abs2 && abs > AndroidUtilities.touchSlop * 2.0f) {
                            m9Var.f0 = true;
                            currentPeerView = m9Var.j0.getCurrentPeerView();
                            if (currentPeerView != null) {
                                currentPeerView.p0();
                            }
                            boolean z11 = currentPeerView == null && !currentPeerView.K1.f && (currentPeerView.y1 || (currentPeerView.z1 && currentPeerView.x3));
                            m9Var.h0 = (!z11 || currentPeerView == null || currentPeerView.z1 || currentPeerView.B1 || m9Var.q1 != null) ? false : true;
                            z10 = (z11 || currentPeerView.Y2 || currentPeerView.K1.a == null || m9Var.q1 != null) ? false : true;
                            m9Var.Y = z10;
                            if (z10 && this.f != 0) {
                                m9Var.Y = false;
                            }
                            if (m9Var.Y) {
                                m9Var.p();
                            }
                            m9Var.V = 0.0f;
                            gVar = m9Var.j1;
                            if (gVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(gVar);
                                m9Var.j1.run();
                                m9Var.j1 = null;
                            }
                            AndroidUtilities.cancelRunOnUIThread(n3Var);
                        }
                        m9Var.y();
                    }
                }
            }
            f10 = 1.0f;
            if (abs > abs2) {
                m9Var.c0 = true;
            }
            if (!m9Var.f0) {
                if (abs > abs2) {
                    m9Var.f0 = true;
                    currentPeerView = m9Var.j0.getCurrentPeerView();
                    if (currentPeerView != null) {
                    }
                    if (currentPeerView == null) {
                    }
                    m9Var.h0 = (!z11 || currentPeerView == null || currentPeerView.z1 || currentPeerView.B1 || m9Var.q1 != null) ? false : true;
                    if (z11) {
                    }
                    m9Var.Y = z10;
                    if (z10) {
                        m9Var.Y = false;
                    }
                    if (m9Var.Y) {
                    }
                    m9Var.V = 0.0f;
                    gVar = m9Var.j1;
                    if (gVar != null) {
                    }
                    AndroidUtilities.cancelRunOnUIThread(n3Var);
                }
                m9Var.y();
            }
        } else {
            f10 = 1.0f;
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                AndroidUtilities.cancelRunOnUIThread(n3Var);
                g gVar3 = m9Var.j1;
                if (gVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(gVar3);
                    m9Var.j1 = null;
                }
                m9Var.K(false);
                m9Var.c0 = false;
                m9Var.g0 = false;
                h4 h4Var2 = m9Var.C0;
                if (h4Var2 != null && (l9Var = h4Var2.b) != null) {
                    l9Var.setSeeking(false);
                }
                i4 t11 = m9Var.t();
                if (t11 != null && (h2Var = t11.H0) != null) {
                    h2Var.setAllowTouches(true);
                }
            }
        }
        o5 o5Var = m9Var.w;
        boolean z12 = o5Var != null && o5Var.f == f10;
        if (!m9Var.f0 && !z12) {
            m9Var.e0.onTouchEvent(motionEvent);
        }
        return m9Var.f0 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        m9 m9Var = this.E0;
        ((FrameLayout.LayoutParams) m9Var.Z0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(2.0f);
        m9Var.Z0.getLayoutParams().height = AndroidUtilities.dp(2.0f);
        super.onMeasure(i9, i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        h2 h2Var;
        int action = motionEvent.getAction();
        m9 m9Var = this.E0;
        int i9 = 1;
        if (action == 1 || motionEvent.getAction() == 3) {
            m9Var.f0 = false;
            m9Var.K(false);
            if (m9Var.R >= 1.0f) {
                m9Var.q(true);
            } else if (!m9Var.D0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(m9Var.S, 0.0f);
                m9Var.C = ofFloat;
                ofFloat.addUpdateListener(new x8(this, i9));
                m9Var.C.addListener(new y8(this, i9));
                m9Var.C.setDuration(150L);
                m9Var.C.setInterpolator(gr.f);
                m9Var.C.start();
            }
            i4 t10 = m9Var.t();
            if (t10 != null && (h2Var = t10.H0) != null) {
                h2Var.setAllowTouches(true);
            }
        }
        if (!m9Var.f0 && !m9Var.x && m9Var.V == 0.0f && ((m9Var.a0 == 0.0f || (!m9Var.b0 && !m9Var.c0)) && !m9Var.f1)) {
            return false;
        }
        m9Var.e0.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        this.E0.b0 = false;
    }
}
