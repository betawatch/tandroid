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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ww0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class m9 extends ww0 {
    public float l0;
    public float m0;
    public float n0;
    public final float[] o0;
    public final Path p0;
    public final RectF q0;
    public final RectF r0;
    public final RectF s0;
    public final RectF t0;
    public final RectF u0;
    public final SparseArray v0;
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 w0;
    public final /* synthetic */ y9 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9(y9 y9Var, Context context, org.telegram.ui.ActionBar.r2 r2Var) {
        super(context, null);
        this.x0 = y9Var;
        this.w0 = r2Var;
        this.o0 = new float[8];
        this.p0 = new Path();
        this.q0 = new RectF();
        this.r0 = new RectF();
        this.s0 = new RectF();
        this.t0 = new RectF();
        this.u0 = new RectF();
        this.v0 = new SparseArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v6 */
    @Override // org.telegram.ui.Components.ww0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        boolean z10;
        int i10;
        m4 m4Var;
        float f11;
        float f12;
        int i11;
        float f13;
        RectF rectF;
        float f14;
        float[] fArr;
        float f15;
        float f16;
        RectF rectF2;
        float f17;
        RectF rectF3;
        float f18;
        float f19;
        RectF rectF4;
        float f20;
        float f21;
        w7 w7Var;
        float f22;
        Paint paint;
        View view;
        w7 w7Var2;
        t9 t9Var;
        s9 s9Var;
        q4 currentPeerView;
        q3 q3Var;
        w7 w7Var3;
        int i12;
        q4 u10;
        ck0 ck0Var;
        boolean z11;
        float f23;
        y9 y9Var = this.x0;
        RectF rectF5 = y9Var.T;
        v9 v9Var = y9Var.s0;
        float f24 = 1.0f;
        canvas.drawColor(i0.a.o(-16777216, (int) ((((1.0f - y9Var.V) * 0.5f) + 0.5f) * y9Var.U * 255.0f)));
        int i13 = 0;
        if (y9Var.b) {
            boolean z12 = (1.0f - y9Var.V) * y9Var.U == 1.0f;
            if (y9Var.K0 != z12) {
                y9Var.K0 = z12;
                org.telegram.ui.ActionBar.r2 r2Var = this.w0;
                if (r2Var.getLayoutContainer() != null) {
                    r2Var.getLayoutContainer().invalidate();
                }
            }
        }
        q4 currentPeerView2 = y9Var.n0.getCurrentPeerView();
        RectF rectF6 = this.u0;
        RectF rectF7 = this.t0;
        if (currentPeerView2 != null) {
            m4 m4Var2 = currentPeerView2.d1;
            if (y9Var.V0) {
                m4Var2.a.getImageReceiver().setVisible(y9Var.U == 1.0f, true);
            } else {
                m4Var2.a.getImageReceiver().setVisible(true, false);
            }
            if (y9Var.h1) {
                y9Var.h1 = false;
                View view2 = m4Var2.a;
                k4 k4Var = m4Var2.a;
                f10 = 255.0f;
                z11 = true;
                float f25 = 0.0f;
                float f26 = 0.0f;
                while (view2 != this) {
                    int i14 = i13;
                    if (view2.getParent() == this) {
                        f25 += view2.getLeft();
                        f26 += view2.getTop();
                        f23 = f24;
                    } else {
                        f23 = f24;
                        if (view2.getParent() != y9Var.n0) {
                            f25 += view2.getX();
                            f26 += view2.getY();
                        }
                    }
                    view2 = (View) view2.getParent();
                    i13 = i14;
                    f24 = f23;
                }
                f7 = f24;
                i10 = i13;
                rectF7.set(f25, f26, k4Var.getMeasuredWidth() + f25, k4Var.getMeasuredHeight() + f26);
                rectF6.set(0.0f, currentPeerView2.R0.getTop() + currentPeerView2.getTop(), y9Var.v.getMeasuredWidth(), y9Var.v.getMeasuredHeight());
                y9Var.v.getMatrix().mapRect(rectF7);
                y9Var.v.getMatrix().mapRect(rectF6);
            } else {
                f7 = 1.0f;
                f10 = 255.0f;
                z11 = true;
                i10 = 0;
            }
            m4Var = m4Var2;
            z10 = z11;
        } else {
            f7 = 1.0f;
            f10 = 255.0f;
            z10 = 1;
            i10 = 0;
            m4Var = null;
        }
        y9Var.d1.setAlpha(f7 - y9Var.V);
        if (y9Var.X == 0.0f) {
            float f27 = f7;
            f11 = f27 - Utilities.clamp(Math.abs(y9Var.W / getMeasuredHeight()), f27, 0.0f);
        } else {
            f11 = 1.0f;
        }
        y9Var.n0.setHorizontalProgressToDismiss((y9Var.X / y9Var.v.getMeasuredWidth()) * y9Var.U);
        if (y9Var.N != 0.0f || y9Var.O != 0.0f) {
            float f28 = y9Var.U;
            if (f28 != 1.0f) {
                if (y9Var.H0 && y9Var.V0) {
                    float clamp = 1.0f - Utilities.clamp(((1.0f - f28) - 0.8f) / 0.100000024f, 1.0f, 0.0f);
                    f12 = 0.15f;
                    f13 = Utilities.clamp(ic.a.d(1.0f, clamp, 0.05f, f28), 1.0f, 0.0f);
                    i11 = 2;
                    y9Var.v.setAlpha(clamp);
                } else {
                    f12 = 0.15f;
                    i11 = 2;
                    y9Var.v.setAlpha(1.0f);
                    f13 = f28;
                }
                if (!y9Var.H0 || v9Var == null || v9Var.c == null) {
                    rectF = rectF7;
                } else {
                    n9 n9Var = y9Var.v;
                    rectF = rectF7;
                    n9Var.setAlpha(n9Var.getAlpha() * ((float) Math.pow(f28, 0.20000000298023224d)));
                }
                n9 n9Var2 = y9Var.v;
                float left = (y9Var.N - n9Var2.getLeft()) - (y9Var.v.getMeasuredWidth() / 2.0f);
                float f29 = y9Var.U;
                n9Var2.setTranslationX((y9Var.X * f29) + ((1.0f - f29) * left));
                n9 n9Var3 = y9Var.v;
                float top = (y9Var.O - n9Var3.getTop()) - (y9Var.v.getMeasuredHeight() / 2.0f);
                float f30 = y9Var.U;
                n9Var3.setTranslationY((y9Var.W * f30) + ((1.0f - f30) * top));
                float lerp = AndroidUtilities.lerp(y9Var.R / y9Var.v.getMeasuredWidth(), (f11 * f12) + 0.85f, f13);
                y9Var.v.setScaleX(lerp);
                y9Var.v.setScaleY(lerp);
                Path path = this.p0;
                path.rewind();
                float f31 = y9Var.N;
                float f32 = y9Var.R / 2.0f;
                float f33 = y9Var.O;
                float f34 = y9Var.S / 2.0f;
                float f35 = f34 + f33;
                RectF rectF8 = this.q0;
                rectF8.set(f31 - f32, f33 - f34, f32 + f31, f35);
                boolean z13 = y9Var.H0;
                RectF rectF9 = this.r0;
                if (z13 && y9Var.V0) {
                    rectF9.set(rectF6);
                } else if (currentPeerView2 != null) {
                    rectF9.set(0.0f, currentPeerView2.R0.getTop() + y9Var.b0, getMeasuredWidth(), getMeasuredHeight() + y9Var.b0);
                } else {
                    rectF9.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                if (y9Var.H0 && y9Var.V0) {
                    rectF8.inset(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                }
                float lerp2 = AndroidUtilities.lerp(rectF8.centerX(), rectF9.centerX(), y9Var.U);
                float lerp3 = AndroidUtilities.lerp(rectF8.centerY(), rectF9.centerY(), y9Var.U);
                float lerp4 = AndroidUtilities.lerp(rectF8.height(), rectF9.height(), f13);
                float lerp5 = AndroidUtilities.lerp(rectF8.width(), rectF9.width(), f13);
                if (y9Var.H0 && y9Var.V0) {
                    f14 = lerp2;
                    rectF8.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
                } else {
                    f14 = lerp2;
                }
                RectF rectF10 = AndroidUtilities.rectTmp;
                float f36 = lerp5 / 2.0f;
                float f37 = lerp4 / 2.0f;
                rectF10.set(f14 - f36, lerp3 - f37, f14 + f36, lerp3 + f37);
                boolean z14 = y9Var.V0;
                float[] fArr2 = this.o0;
                if (z14) {
                    float lerp6 = AndroidUtilities.lerp(y9Var.R / 2.0f, 0.0f, f13);
                    fArr = fArr2;
                    fArr[7] = lerp6;
                    fArr[6] = lerp6;
                    fArr[5] = lerp6;
                    fArr[4] = lerp6;
                    fArr[3] = lerp6;
                    fArr[i11] = lerp6;
                    fArr[z10] = lerp6;
                    fArr[i10] = lerp6;
                } else {
                    fArr = fArr2;
                    int[] iArr = y9Var.W0;
                    if (iArr == null) {
                        f15 = 0.0f;
                        fArr[7] = 0.0f;
                        fArr[6] = 0.0f;
                        fArr[5] = 0.0f;
                        fArr[4] = 0.0f;
                        fArr[3] = 0.0f;
                        fArr[i11] = 0.0f;
                        fArr[z10] = 0.0f;
                        fArr[0] = 0.0f;
                        path.addRoundRect(rectF10, fArr, Path.Direction.CCW);
                        canvas.save();
                        f16 = y9Var.P;
                        if (f16 != f15 && y9Var.Q != f15) {
                            canvas.clipRect(f15, AndroidUtilities.lerp(f15, f16, (float) Math.pow(1.0f - y9Var.U, 0.4000000059604645d)), getMeasuredWidth(), AndroidUtilities.lerp(getMeasuredHeight(), y9Var.Q, 1.0f - y9Var.U));
                        }
                        if (v9Var == null && (w7Var3 = v9Var.m) != null && w7Var3.w && y9Var.V0) {
                            rectF2 = rectF5;
                            f17 = f15;
                            rectF3 = rectF8;
                            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f28 * f10), 31);
                        } else {
                            rectF2 = rectF5;
                            f17 = f15;
                            rectF3 = rectF8;
                            canvas.save();
                        }
                        canvas.clipPath(path);
                        super.dispatchDraw(canvas);
                        RectF rectF11 = this.s0;
                        if (v9Var != null || v9Var.c == null || (currentPeerView = y9Var.n0.getCurrentPeerView()) == null || (q3Var = currentPeerView.R0) == null) {
                            f18 = f17;
                            f19 = f28;
                            rectF4 = rectF3;
                        } else {
                            boolean visible = v9Var.c.getVisible();
                            f18 = f17;
                            rectF9.set(q3Var.getX() + currentPeerView.getX() + y9Var.X + y9Var.v.getLeft(), q3Var.getY() + currentPeerView.getY() + y9Var.W + y9Var.v.getTop(), ((y9Var.X + y9Var.v.getRight()) - (y9Var.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - q3Var.getRight()), ((y9Var.W + y9Var.v.getBottom()) - (y9Var.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - q3Var.getBottom()));
                            AndroidUtilities.lerp(rectF3, rectF9, f28, rectF11);
                            float imageX = v9Var.c.getImageX();
                            float imageY = v9Var.c.getImageY();
                            float imageWidth = v9Var.c.getImageWidth();
                            float imageHeight = v9Var.c.getImageHeight();
                            v9Var.c.setImageCoords(rectF11);
                            float f38 = 1.0f - f28;
                            v9Var.c.setAlpha(f38);
                            f19 = f28;
                            rectF4 = rectF3;
                            v9Var.c.setVisible(z10, false);
                            int saveCount = canvas.getSaveCount();
                            s9 s9Var2 = v9Var.f;
                            if (s9Var2 != null) {
                                s9Var2.d(f38, canvas, rectF11, y9Var.E);
                            }
                            v9Var.c.draw(canvas);
                            t9 t9Var2 = v9Var.e;
                            if (t9Var2 != null) {
                                t9Var2.k(canvas, rectF11, f38);
                            }
                            v9Var.c.setVisible(visible, false);
                            v9Var.c.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                            canvas.restoreToCount(saveCount);
                        }
                        canvas.restore();
                        if (m4Var != null) {
                            k4 k4Var2 = m4Var.a;
                            float f39 = y9Var.X;
                            float f40 = y9Var.W;
                            if (y9Var.H0 && y9Var.V0) {
                                rectF9.set(rectF);
                            } else {
                                for (View view3 = k4Var2; view3 != this && view3 != null; view3 = (View) view3.getParent()) {
                                    if (view3.getParent() == this) {
                                        f39 += view3.getLeft();
                                        f40 += view3.getTop();
                                    } else if (view3.getParent() != y9Var.n0) {
                                        float x9 = view3.getX() + f39;
                                        f40 = view3.getY() + f40;
                                        f39 = x9;
                                    }
                                    if (!(view3.getParent() instanceof View)) {
                                        break;
                                    }
                                }
                                rectF9.set(f39, f40, k4Var2.getMeasuredWidth() + f39, k4Var2.getMeasuredHeight() + f40);
                            }
                            AndroidUtilities.lerp(rectF4, rectF9, y9Var.U, rectF11);
                            int saveCount2 = canvas.getSaveCount();
                            if (v9Var != null && (s9Var = v9Var.f) != null) {
                                s9Var.d(1.0f - f19, canvas, rectF11, y9Var.E);
                            }
                            if (y9Var.V0) {
                                boolean z15 = (v9Var == null || v9Var.l == null) ? false : true;
                                if (z15 && y9Var.U == f18) {
                                    f20 = f19;
                                } else {
                                    if (v9Var != null && (w7Var2 = v9Var.m) != null && w7Var2.w) {
                                        canvas.saveLayerAlpha(rectF11.left - AndroidUtilities.dp(4.0f), rectF11.top - AndroidUtilities.dp(4.0f), rectF11.right + AndroidUtilities.dp(4.0f), rectF11.bottom + AndroidUtilities.dp(4.0f), 255, 31);
                                    }
                                    k4Var2.getImageReceiver().setImageCoords(rectF11);
                                    k4Var2.getImageReceiver().setRoundRadius((int) AndroidUtilities.lerp(rectF11.width() / 2.0f, ((v9Var == null || v9Var.b == null) ? null : Integer.valueOf((int) (v9Var.b.getRoundRadius()[0] * ((!v9Var.n || (view = v9Var.a) == null || view.getParent() == null) ? 1.0f : ((ViewGroup) v9Var.a.getParent()).getScaleY())))) != null ? r4.intValue() : rectF11.width() / 2.0f, 1.0f - y9Var.U));
                                    k4Var2.getImageReceiver().setVisible(true, false);
                                    float f41 = z15 ? y9Var.U : 1.0f;
                                    if (v9Var == null || v9Var.k >= 1.0f || (paint = v9Var.j) == null) {
                                        f20 = f19;
                                        f21 = f41;
                                    } else {
                                        paint.setAlpha((int) ((1.0f - f19) * f10));
                                        canvas.drawCircle(rectF11.centerX(), rectF11.centerY(), rectF11.width() / 2.0f, v9Var.j);
                                        f20 = f19;
                                        f21 = AndroidUtilities.lerp(v9Var.k, f41, f20);
                                    }
                                    k4Var2.getImageReceiver().setAlpha(f21);
                                    m4Var.b(y9Var.U, canvas, rectF11, !y9.A1);
                                    k4Var2.getImageReceiver().draw(canvas);
                                    k4Var2.getImageReceiver().setAlpha(f41);
                                    k4Var2.getImageReceiver().setVisible(false, false);
                                    if (v9Var != null && (w7Var = v9Var.m) != null && w7Var.w) {
                                        RectF rectF12 = AndroidUtilities.rectTmp;
                                        rectF12.set(rectF11);
                                        f22 = 1.0f;
                                        a8.k(1.0f - y9Var.U, f18, canvas, rectF12, true);
                                        canvas.restore();
                                        if (y9Var.U != f22 && z15) {
                                            RectF rectF13 = rectF2;
                                            rectF13.set(v9Var.l.getImageX(), v9Var.l.getImageY(), v9Var.l.getImageX2(), v9Var.l.getImageY2());
                                            int i15 = v9Var.l.getRoundRadius()[0];
                                            boolean visible2 = v9Var.l.getVisible();
                                            v9Var.l.setImageCoords(rectF11);
                                            v9Var.l.setRoundRadius((int) (rectF11.width() / 2.0f));
                                            v9Var.l.setVisible(true, false);
                                            canvas.saveLayerAlpha(rectF11, (int) ((1.0f - y9Var.U) * f10), 31);
                                            v9Var.l.draw(canvas);
                                            canvas.restore();
                                            v9Var.l.setVisible(visible2, false);
                                            v9Var.l.setImageCoords(rectF13);
                                            v9Var.l.setRoundRadius(i15);
                                        }
                                        if (v9Var != null && (t9Var = v9Var.e) != null) {
                                            t9Var.k(canvas, rectF11, 1.0f - f20);
                                        }
                                    }
                                }
                                f22 = 1.0f;
                                if (y9Var.U != f22) {
                                    RectF rectF132 = rectF2;
                                    rectF132.set(v9Var.l.getImageX(), v9Var.l.getImageY(), v9Var.l.getImageX2(), v9Var.l.getImageY2());
                                    int i152 = v9Var.l.getRoundRadius()[0];
                                    boolean visible22 = v9Var.l.getVisible();
                                    v9Var.l.setImageCoords(rectF11);
                                    v9Var.l.setRoundRadius((int) (rectF11.width() / 2.0f));
                                    v9Var.l.setVisible(true, false);
                                    canvas.saveLayerAlpha(rectF11, (int) ((1.0f - y9Var.U) * f10), 31);
                                    v9Var.l.draw(canvas);
                                    canvas.restore();
                                    v9Var.l.setVisible(visible22, false);
                                    v9Var.l.setImageCoords(rectF132);
                                    v9Var.l.setRoundRadius(i152);
                                }
                                if (v9Var != null) {
                                    t9Var.k(canvas, rectF11, 1.0f - f20);
                                }
                            }
                            canvas.restoreToCount(saveCount2);
                        }
                        if (y9Var.M != null) {
                            float clamp2 = Utilities.clamp(y9Var.U / 0.4f, 1.0f, 0.0f);
                            if (clamp2 != 1.0f) {
                                RectF rectF14 = AndroidUtilities.rectTmp;
                                float f42 = y9Var.N;
                                float f43 = y9Var.O;
                                rectF14.set(f42, f43, y9Var.R + f42, y9Var.S + f43);
                                rectF14.inset(-AndroidUtilities.dp(16.0f), -AndroidUtilities.dp(16.0f));
                                if (clamp2 != 0.0f) {
                                    canvas.saveLayerAlpha(rectF14, (int) ((1.0f - clamp2) * f10), 31);
                                } else {
                                    canvas.save();
                                }
                                canvas.translate(y9Var.K, y9Var.L);
                                ((org.telegram.ui.Cells.p2) y9Var.M).A(canvas);
                                canvas.restore();
                            }
                        }
                        canvas.restore();
                        if (y9.A1) {
                            ArrayList arrayList = y9Var.x0;
                            y9Var.R();
                            y9Var.U = 0.0f;
                            y9Var.N(true);
                            y9Var.d = false;
                            y9.x1 = true;
                            y9Var.b0 = y9Var.W;
                            if (v9Var.d != null && (u10 = y9Var.u()) != null && (ck0Var = u10.d1.d) != null) {
                                ck0 ck0Var2 = v9Var.d;
                                ck0Var.c = ck0Var2.c;
                                ck0Var.f = ck0Var2.f;
                                ck0Var.b = ck0Var2.b;
                                ck0Var.a = System.currentTimeMillis();
                                ck0Var.c();
                            }
                            y9Var.E = true;
                            float[] fArr3 = new float[i11];
                            // fill-array-data instruction
                            fArr3[0] = 0.0f;
                            fArr3[1] = 1.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr3);
                            y9Var.F = ofFloat;
                            ofFloat.addUpdateListener(new g9(y9Var, 1));
                            y9Var.J0.lock();
                            n9 n9Var4 = y9Var.v;
                            if (n9Var4 != null) {
                                w.c = true;
                                i12 = 2;
                                n9Var4.setLayerType(2, null);
                            } else {
                                i12 = 2;
                            }
                            y9Var.F.addListener(new h9(y9Var, i12));
                            y9Var.F.setStartDelay(40L);
                            y9Var.F.setDuration(250L);
                            y9Var.F.setInterpolator(ds.f);
                            y9Var.F.start();
                            if (!arrayList.isEmpty()) {
                                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                    ((Runnable) arrayList.get(i16)).run();
                                }
                                arrayList.clear();
                            }
                            y9.A1 = false;
                            return;
                        }
                        return;
                    }
                    int i17 = i10;
                    float lerp7 = AndroidUtilities.lerp(iArr[i10], i17, f28);
                    fArr[z10] = lerp7;
                    fArr[i17] = lerp7;
                    float lerp8 = AndroidUtilities.lerp(y9Var.W0[z10], i17, f28);
                    fArr[3] = lerp8;
                    fArr[i11] = lerp8;
                    float lerp9 = AndroidUtilities.lerp(y9Var.W0[i11], i17, f28);
                    fArr[5] = lerp9;
                    fArr[4] = lerp9;
                    float lerp10 = AndroidUtilities.lerp(y9Var.W0[3], i17, f28);
                    fArr[7] = lerp10;
                    fArr[6] = lerp10;
                }
                f15 = 0.0f;
                path.addRoundRect(rectF10, fArr, Path.Direction.CCW);
                canvas.save();
                f16 = y9Var.P;
                if (f16 != f15) {
                    canvas.clipRect(f15, AndroidUtilities.lerp(f15, f16, (float) Math.pow(1.0f - y9Var.U, 0.4000000059604645d)), getMeasuredWidth(), AndroidUtilities.lerp(getMeasuredHeight(), y9Var.Q, 1.0f - y9Var.U));
                }
                if (v9Var == null) {
                }
                rectF2 = rectF5;
                f17 = f15;
                rectF3 = rectF8;
                canvas.save();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                RectF rectF112 = this.s0;
                if (v9Var != null) {
                }
                f18 = f17;
                f19 = f28;
                rectF4 = rectF3;
                canvas.restore();
                if (m4Var != null) {
                }
                if (y9Var.M != null) {
                }
                canvas.restore();
                if (y9.A1) {
                }
            }
        }
        y9Var.v.setAlpha(y9Var.U);
        float f44 = (f11 * 0.15f) + (y9Var.U * 0.1f) + 0.75f;
        y9Var.v.setScaleX(f44);
        y9Var.v.setScaleY(f44);
        y9Var.v.setTranslationY(y9Var.W);
        y9Var.v.setTranslationX(y9Var.X);
        super.dispatchDraw(canvas);
        i11 = 2;
        if (y9.A1) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        y9 y9Var = this.x0;
        if (keyCode == 24 || keyEvent.getKeyCode() == 25) {
            y9Var.s(keyEvent);
            return true;
        }
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        y9Var.onAttachedBackPressed();
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
        o9 o9Var;
        int i10;
        gl0 gl0Var;
        y9 y9Var = this.x0;
        float[] fArr = y9Var.o0;
        q4 currentPeerView = y9Var.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            u3 u3Var = currentPeerView.z0;
            if (u3Var.W.x()) {
                float x9 = currentPeerView.getX();
                float y3 = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x9, -y3);
                if (!u3Var.W.n(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x9, y3);
                }
                return true;
            }
        }
        float f7 = 0.0f;
        int i11 = 0;
        if (y9Var.p1 && currentPeerView != null && (gl0Var = currentPeerView.g3) != null) {
            float f10 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f7 += view.getX();
                f10 += view.getY();
            }
            if (currentPeerView.g3.getReactionsWindow() != null && currentPeerView.g3.getReactionsWindow().c != null) {
                motionEvent.offsetLocation(-f7, (-f10) - currentPeerView.g3.getReactionsWindow().c.getTranslationY());
                currentPeerView.g3.getReactionsWindow().c.dispatchTouchEvent(motionEvent);
                return true;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            gl0Var.getHitRect(rect);
            rect.offset((int) f7, (int) f10);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.Z0(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            gl0Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            y9Var.j0 = false;
            AndroidUtilities.cancelRunOnUIThread(y9Var.b1);
            float f11 = y9Var.X;
            if (f11 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                y9Var.G = ofFloat;
                ofFloat.addUpdateListener(new j9(this, i11));
                y9Var.G.addListener(new k9(this, i11));
                y9Var.G.setDuration(250L);
                y9Var.G.setInterpolator(ds.f);
                y9Var.G.start();
            }
            if (y9Var.V >= 0.3f) {
                y9Var.q(true);
            }
            y9Var.L(false);
            y9Var.M(false);
            z10 = true;
        } else {
            z10 = false;
        }
        if (motionEvent.getAction() == 0) {
            y9Var.a0 = false;
            if (currentPeerView != null) {
                i4 i4Var = currentPeerView.n0;
                d9 d9Var = currentPeerView.r0;
                q3 q3Var = currentPeerView.R0;
                fi.v3 v3Var = currentPeerView.u0;
                if (v3Var != null && v3Var.V && d9Var != null && !v3Var.r0.contains(motionEvent.getX() - (currentPeerView.u0.getX() + (q3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.u0.getY() + (q3Var.getY() + currentPeerView.getY()))) && !currentPeerView.F0(motionEvent, d9Var)) {
                    currentPeerView.u0.e(true);
                }
                fi.v3 v3Var2 = currentPeerView.v0;
                if (v3Var2 != null && v3Var2.V && i4Var != null && !v3Var2.r0.contains(motionEvent.getX() - (currentPeerView.v0.getX() + (q3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.v0.getY() + (q3Var.getY() + currentPeerView.getY()))) && !currentPeerView.F0(motionEvent, i4Var)) {
                    currentPeerView.v0.e(true);
                }
            }
            y9Var.n0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        boolean z12 = (y9Var.x || y9Var.H0 || y9Var.I0) ? false : true;
        float f12 = y9Var.e0;
        SparseArray sparseArray = this.v0;
        if (f12 == 0.0f && !y9Var.j0 && y9Var.n0.F0 == 1 && motionEvent.getAction() == 2 && z12) {
            float floatValue = ((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0);
            if ((floatValue != 0.0f && (((i10 = (o9Var = y9Var.n0).I0) == 0 && o9Var.K0 == 0.0f && floatValue < 0.0f) || (i10 == o9Var.getAdapter().b() - 1 && o9Var.K0 == 0.0f && floatValue > 0.0f))) || y9Var.X != 0.0f) {
                float f13 = y9Var.X;
                if (f13 == 0.0f) {
                    y9Var.Y = -floatValue;
                }
                if ((floatValue < 0.0f && y9Var.Y > 0.0f) || (floatValue > 0.0f && y9Var.Y < 0.0f)) {
                    floatValue *= 0.2f;
                }
                y9Var.X = f13 - floatValue;
                y9.k(y9Var);
                float f14 = y9Var.X;
                if ((f14 > 0.0f && y9Var.Y < 0.0f) || (f14 < 0.0f && y9Var.Y > 0.0f)) {
                    y9Var.X = 0.0f;
                }
                z11 = true;
                if (currentPeerView != null && y9Var.e0 == 0.0f && !y9Var.j0 && !y9Var.L0 && !y9Var.I0 && y9Var.n0.F0 != 1) {
                    AndroidUtilities.getViewPositionInParent(currentPeerView.R0, this, fArr);
                    motionEvent.offsetLocation(-fArr[0], -fArr[1]);
                    q4 currentPeerView2 = y9Var.n0.getCurrentPeerView();
                    currentPeerView2.M2.a(motionEvent, currentPeerView2.R0, null, null, 0);
                    motionEvent.offsetLocation(fArr[0], fArr[1]);
                }
                if (motionEvent.getAction() != 1 || motionEvent.getAction() == 3) {
                    sparseArray.clear();
                } else {
                    for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                        sparseArray.put(motionEvent.getPointerId(i12), Float.valueOf(motionEvent.getX(i12)));
                    }
                }
                if (!z11) {
                    boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        if (y9Var.e0 != 0.0f && !y9Var.g1 && y9Var.p0 < AndroidUtilities.dp(20.0f)) {
                            y9Var.n(y9Var.w.f > 0.5f);
                        }
                        q4 u10 = y9Var.u();
                        if (u10 != null) {
                            u10.z0.w0 = false;
                        }
                    }
                    if (z10 && !y9Var.a0) {
                        y9Var.m();
                    }
                    if (!dispatchTouchEvent && (!y9.x1 || !y9Var.q0)) {
                        return false;
                    }
                }
                return true;
            }
        }
        z11 = false;
        if (currentPeerView != null) {
            AndroidUtilities.getViewPositionInParent(currentPeerView.R0, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            q4 currentPeerView22 = y9Var.n0.getCurrentPeerView();
            currentPeerView22.M2.a(motionEvent, currentPeerView22.R0, null, null, 0);
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
        if (view == this.x0.y0) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.ww0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        y9 y9Var = this.x0;
        if (y9Var.b && !y9Var.c) {
            org.telegram.ui.ActionBar.r2 r2Var = this.w0;
            AndroidUtilities.requestAdjustResize(r2Var.getParentActivity(), r2Var.getClassGuid());
        }
        qc.a(this, new l9(this));
        NotificationCenter.getInstance(y9Var.h).addWeakObserver(y9Var, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(y9Var.h).addWeakObserver(y9Var, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(y9Var.h).addWeakObserver(y9Var, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(y9Var.h).addWeakObserver(y9Var, NotificationCenter.openArticle);
        NotificationCenter.getInstance(y9Var.h).addWeakObserver(y9Var, NotificationCenter.storyDeleted);
    }

    @Override // org.telegram.ui.Components.ww0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc.h(this);
        y9 y9Var = this.x0;
        NotificationCenter.getInstance(y9Var.h).removeObserver(y9Var, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(y9Var.h).removeObserver(y9Var, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(y9Var.h).removeObserver(y9Var, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(y9Var.h).removeObserver(y9Var, NotificationCenter.openArticle);
        NotificationCenter.getInstance(y9Var.h).removeObserver(y9Var, NotificationCenter.storyDeleted);
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01e2  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f7;
        m2 m2Var;
        x9 x9Var;
        q4 currentPeerView;
        boolean z10;
        s8 s8Var;
        p4 p4Var;
        q4 currentPeerView2;
        o4 o4Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        m2 m2Var2;
        y9 y9Var = this.x0;
        s3 s3Var = y9Var.b1;
        if (motionEvent.getAction() == 0 && y9Var.U == 1.0f) {
            float x9 = motionEvent.getX();
            this.n0 = x9;
            this.l0 = x9;
            this.m0 = motionEvent.getY();
            y9Var.g0 = false;
            y9Var.f0 = (y9Var.I0 || y9.i(y9Var, y9Var.s, motionEvent.getX(), motionEvent.getY(), false)) ? false : true;
            y9Var.h0 = (y9Var.I0 || y9.i(y9Var, y9Var.s, motionEvent.getX(), motionEvent.getY(), true)) ? false : true;
            y9Var.L(y9Var.f0 && !y9Var.m1);
            q4 u10 = y9Var.u();
            if (y9Var.f0 && u10 != null && (m2Var2 = u10.A0) != null) {
                m2Var2.setAllowTouches(false);
            }
            if (y9Var.f0 && !y9Var.I0 && y9Var.m1) {
                s8 s8Var2 = new s8(this, 4);
                y9Var.n1 = s8Var2;
                AndroidUtilities.runOnUIThread(s8Var2, 150L);
            }
            if (y9Var.f0 && !y9Var.x && !y9Var.I0 && !y9Var.j1) {
                AndroidUtilities.runOnUIThread(s3Var, 400L);
            }
            f7 = 1.0f;
        } else if (motionEvent.getAction() == 2) {
            float abs = Math.abs(this.m0 - motionEvent.getY());
            float abs2 = Math.abs(this.l0 - motionEvent.getX());
            if (y9Var.a1 && y9Var.k0 && !y9Var.f1 && !y9Var.j0 && (p4Var = y9Var.G0) != null && ((x9) p4Var.c) != null && (currentPeerView2 = y9Var.n0.getCurrentPeerView()) != null && (o4Var = currentPeerView2.D1) != null && o4Var.b == null && o4Var.e) {
                long j10 = currentPeerView2.G2;
                if (j10 <= 0 && (storyItem = o4Var.a) != null && (messageMedia = storyItem.media) != null && (document = messageMedia.document) != null) {
                    j10 = (long) (MessageObject.getDocumentDuration(document) * 1000.0d);
                }
                if (j10 > 0) {
                    float x10 = motionEvent.getX();
                    x9 x9Var2 = (x9) y9Var.G0.c;
                    f7 = 1.0f;
                    if (((int) (x9Var2.seek((x10 - this.n0) / AndroidUtilities.dp(220.0f), j10) * 10.0f)) != ((int) (x9Var2.currentSeek * 10.0f))) {
                        try {
                            currentPeerView2.performHapticFeedback(9, 1);
                        } catch (Exception unused) {
                        }
                    }
                    currentPeerView2.R0.invalidate();
                    this.n0 = x10;
                    if (abs > abs2 && !y9Var.k0 && !y9Var.g0 && abs > AndroidUtilities.touchSlop * 2.0f) {
                        y9Var.g0 = true;
                    }
                    if (!y9Var.j0 && !y9Var.k0 && !y9Var.x && y9Var.h0) {
                        if (abs > abs2 && abs > AndroidUtilities.touchSlop * 2.0f) {
                            y9Var.j0 = true;
                            currentPeerView = y9Var.n0.getCurrentPeerView();
                            if (currentPeerView != null) {
                                currentPeerView.n0();
                            }
                            boolean z11 = currentPeerView == null && !currentPeerView.D1.f && (currentPeerView.r1 || (currentPeerView.s1 && currentPeerView.q3));
                            y9Var.l0 = (!z11 || currentPeerView == null || currentPeerView.s1 || currentPeerView.u1 || y9Var.u1 != null) ? false : true;
                            z10 = (z11 || currentPeerView.R2 || currentPeerView.D1.a == null || y9Var.u1 != null) ? false : true;
                            y9Var.c0 = z10;
                            if (z10 && this.f != 0) {
                                y9Var.c0 = false;
                            }
                            if (y9Var.c0) {
                                y9Var.p();
                            }
                            y9Var.Z = 0.0f;
                            s8Var = y9Var.n1;
                            if (s8Var != null) {
                                AndroidUtilities.cancelRunOnUIThread(s8Var);
                                y9Var.n1.run();
                                y9Var.n1 = null;
                            }
                            AndroidUtilities.cancelRunOnUIThread(s3Var);
                        }
                        y9Var.z();
                    }
                }
            }
            f7 = 1.0f;
            if (abs > abs2) {
                y9Var.g0 = true;
            }
            if (!y9Var.j0) {
                if (abs > abs2) {
                    y9Var.j0 = true;
                    currentPeerView = y9Var.n0.getCurrentPeerView();
                    if (currentPeerView != null) {
                    }
                    if (currentPeerView == null) {
                    }
                    y9Var.l0 = (!z11 || currentPeerView == null || currentPeerView.s1 || currentPeerView.u1 || y9Var.u1 != null) ? false : true;
                    if (z11) {
                    }
                    y9Var.c0 = z10;
                    if (z10) {
                        y9Var.c0 = false;
                    }
                    if (y9Var.c0) {
                    }
                    y9Var.Z = 0.0f;
                    s8Var = y9Var.n1;
                    if (s8Var != null) {
                    }
                    AndroidUtilities.cancelRunOnUIThread(s3Var);
                }
                y9Var.z();
            }
        } else {
            f7 = 1.0f;
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                AndroidUtilities.cancelRunOnUIThread(s3Var);
                s8 s8Var3 = y9Var.n1;
                if (s8Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(s8Var3);
                    y9Var.n1 = null;
                }
                y9Var.L(false);
                y9Var.g0 = false;
                y9Var.k0 = false;
                p4 p4Var2 = y9Var.G0;
                if (p4Var2 != null && (x9Var = (x9) p4Var2.c) != null) {
                    x9Var.setSeeking(false);
                }
                q4 u11 = y9Var.u();
                if (u11 != null && (m2Var = u11.A0) != null) {
                    m2Var.setAllowTouches(true);
                }
            }
        }
        b6 b6Var = y9Var.w;
        boolean z12 = b6Var != null && b6Var.f == f7;
        if (!y9Var.j0 && !z12) {
            y9Var.i0.onTouchEvent(motionEvent);
        }
        return y9Var.j0 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        y9 y9Var = this.x0;
        ((FrameLayout.LayoutParams) y9Var.d1.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(2.0f);
        y9Var.d1.getLayoutParams().height = AndroidUtilities.dp(2.0f);
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        m2 m2Var;
        int action = motionEvent.getAction();
        y9 y9Var = this.x0;
        int i10 = 1;
        if (action == 1 || motionEvent.getAction() == 3) {
            y9Var.j0 = false;
            y9Var.L(false);
            if (y9Var.V >= 1.0f) {
                y9Var.q(true);
            } else if (!y9Var.H0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(y9Var.W, 0.0f);
                y9Var.G = ofFloat;
                ofFloat.addUpdateListener(new j9(this, i10));
                y9Var.G.addListener(new k9(this, i10));
                y9Var.G.setDuration(150L);
                y9Var.G.setInterpolator(ds.f);
                y9Var.G.start();
            }
            q4 u10 = y9Var.u();
            if (u10 != null && (m2Var = u10.A0) != null) {
                m2Var.setAllowTouches(true);
            }
        }
        if (!y9Var.j0 && !y9Var.x && y9Var.Z == 0.0f && ((y9Var.e0 == 0.0f || (!y9Var.f0 && !y9Var.g0)) && !y9Var.j1)) {
            return false;
        }
        y9Var.i0.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        this.x0.f0 = false;
    }
}
