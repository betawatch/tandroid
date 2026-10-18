package ci;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yj0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class o9 extends jw0 {
    public final Path A0;
    public final RectF B0;
    public final RectF C0;
    public final RectF D0;
    public final RectF E0;
    public final RectF F0;
    public final SparseArray G0;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 H0;
    public final /* synthetic */ aa I0;
    public float w0;
    public float x0;
    public float y0;
    public final float[] z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9(aa aaVar, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null);
        this.I0 = aaVar;
        this.H0 = n2Var;
        this.z0 = new float[8];
        this.A0 = new Path();
        this.B0 = new RectF();
        this.C0 = new RectF();
        this.D0 = new RectF();
        this.E0 = new RectF();
        this.F0 = new RectF();
        this.G0 = new SparseArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v6 */
    @Override // org.telegram.ui.Components.jw0, android.view.ViewGroup, android.view.View
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
        y7 y7Var;
        float f22;
        Paint paint;
        View view;
        y7 y7Var2;
        v9 v9Var;
        u9 u9Var;
        q4 currentPeerView;
        r3 r3Var;
        y7 y7Var3;
        int i12;
        q4 t10;
        yj0 yj0Var;
        boolean z11;
        float f23;
        aa aaVar = this.I0;
        RectF rectF5 = aaVar.T;
        x9 x9Var = aaVar.s0;
        float f24 = 1.0f;
        canvas.drawColor(i0.a.o(-16777216, (int) ((((1.0f - aaVar.V) * 0.5f) + 0.5f) * aaVar.U * 255.0f)));
        int i13 = 0;
        if (aaVar.b) {
            boolean z12 = (1.0f - aaVar.V) * aaVar.U == 1.0f;
            if (aaVar.K0 != z12) {
                aaVar.K0 = z12;
                org.telegram.ui.ActionBar.n2 n2Var = this.H0;
                if (n2Var.getLayoutContainer() != null) {
                    n2Var.getLayoutContainer().invalidate();
                }
            }
        }
        q4 currentPeerView2 = aaVar.n0.getCurrentPeerView();
        RectF rectF6 = this.F0;
        RectF rectF7 = this.E0;
        if (currentPeerView2 != null) {
            m4 m4Var2 = currentPeerView2.o1;
            if (aaVar.V0) {
                m4Var2.a.getImageReceiver().setVisible(aaVar.U == 1.0f, true);
            } else {
                m4Var2.a.getImageReceiver().setVisible(true, false);
            }
            if (aaVar.h1) {
                aaVar.h1 = false;
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
                        if (view2.getParent() != aaVar.n0) {
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
                rectF6.set(0.0f, currentPeerView2.c1.getTop() + currentPeerView2.getTop(), aaVar.v.getMeasuredWidth(), aaVar.v.getMeasuredHeight());
                aaVar.v.getMatrix().mapRect(rectF7);
                aaVar.v.getMatrix().mapRect(rectF6);
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
        aaVar.d1.setAlpha(f7 - aaVar.V);
        if (aaVar.X == 0.0f) {
            float f27 = f7;
            f11 = f27 - Utilities.clamp(Math.abs(aaVar.W / getMeasuredHeight()), f27, 0.0f);
        } else {
            f11 = 1.0f;
        }
        aaVar.n0.setHorizontalProgressToDismiss((aaVar.X / aaVar.v.getMeasuredWidth()) * aaVar.U);
        if (aaVar.N != 0.0f || aaVar.O != 0.0f) {
            float f28 = aaVar.U;
            if (f28 != 1.0f) {
                if (aaVar.H0 && aaVar.V0) {
                    float clamp = 1.0f - Utilities.clamp(((1.0f - f28) - 0.8f) / 0.100000024f, 1.0f, 0.0f);
                    f12 = 0.15f;
                    f13 = Utilities.clamp(com.google.android.gms.internal.play_billing.k3.D(1.0f, clamp, 0.05f, f28), 1.0f, 0.0f);
                    i11 = 2;
                    aaVar.v.setAlpha(clamp);
                } else {
                    f12 = 0.15f;
                    i11 = 2;
                    aaVar.v.setAlpha(1.0f);
                    f13 = f28;
                }
                if (!aaVar.H0 || x9Var == null || x9Var.c == null) {
                    rectF = rectF7;
                } else {
                    p9 p9Var = aaVar.v;
                    rectF = rectF7;
                    p9Var.setAlpha(p9Var.getAlpha() * ((float) Math.pow(f28, 0.20000000298023224d)));
                }
                p9 p9Var2 = aaVar.v;
                float left = (aaVar.N - p9Var2.getLeft()) - (aaVar.v.getMeasuredWidth() / 2.0f);
                float f29 = aaVar.U;
                p9Var2.setTranslationX((aaVar.X * f29) + ((1.0f - f29) * left));
                p9 p9Var3 = aaVar.v;
                float top = (aaVar.O - p9Var3.getTop()) - (aaVar.v.getMeasuredHeight() / 2.0f);
                float f30 = aaVar.U;
                p9Var3.setTranslationY((aaVar.W * f30) + ((1.0f - f30) * top));
                float lerp = AndroidUtilities.lerp(aaVar.R / aaVar.v.getMeasuredWidth(), (f11 * f12) + 0.85f, f13);
                aaVar.v.setScaleX(lerp);
                aaVar.v.setScaleY(lerp);
                Path path = this.A0;
                path.rewind();
                float f31 = aaVar.N;
                float f32 = aaVar.R / 2.0f;
                float f33 = aaVar.O;
                float f34 = aaVar.S / 2.0f;
                float f35 = f34 + f33;
                RectF rectF8 = this.B0;
                rectF8.set(f31 - f32, f33 - f34, f32 + f31, f35);
                boolean z13 = aaVar.H0;
                RectF rectF9 = this.C0;
                if (z13 && aaVar.V0) {
                    rectF9.set(rectF6);
                } else if (currentPeerView2 != null) {
                    rectF9.set(0.0f, currentPeerView2.c1.getTop() + aaVar.b0, getMeasuredWidth(), getMeasuredHeight() + aaVar.b0);
                } else {
                    rectF9.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                if (aaVar.H0 && aaVar.V0) {
                    rectF8.inset(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                }
                float lerp2 = AndroidUtilities.lerp(rectF8.centerX(), rectF9.centerX(), aaVar.U);
                float lerp3 = AndroidUtilities.lerp(rectF8.centerY(), rectF9.centerY(), aaVar.U);
                float lerp4 = AndroidUtilities.lerp(rectF8.height(), rectF9.height(), f13);
                float lerp5 = AndroidUtilities.lerp(rectF8.width(), rectF9.width(), f13);
                if (aaVar.H0 && aaVar.V0) {
                    f14 = lerp2;
                    rectF8.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
                } else {
                    f14 = lerp2;
                }
                RectF rectF10 = AndroidUtilities.rectTmp;
                float f36 = lerp5 / 2.0f;
                float f37 = lerp4 / 2.0f;
                rectF10.set(f14 - f36, lerp3 - f37, f14 + f36, lerp3 + f37);
                boolean z14 = aaVar.V0;
                float[] fArr2 = this.z0;
                if (z14) {
                    float lerp6 = AndroidUtilities.lerp(aaVar.R / 2.0f, 0.0f, f13);
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
                    int[] iArr = aaVar.W0;
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
                        f16 = aaVar.P;
                        if (f16 != f15 && aaVar.Q != f15) {
                            canvas.clipRect(f15, AndroidUtilities.lerp(f15, f16, (float) Math.pow(1.0f - aaVar.U, 0.4000000059604645d)), getMeasuredWidth(), AndroidUtilities.lerp(getMeasuredHeight(), aaVar.Q, 1.0f - aaVar.U));
                        }
                        if (x9Var == null && (y7Var3 = x9Var.m) != null && y7Var3.w && aaVar.V0) {
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
                        RectF rectF11 = this.D0;
                        if (x9Var != null || x9Var.c == null || (currentPeerView = aaVar.n0.getCurrentPeerView()) == null || (r3Var = currentPeerView.c1) == null) {
                            f18 = f17;
                            f19 = f28;
                            rectF4 = rectF3;
                        } else {
                            boolean visible = x9Var.c.getVisible();
                            f18 = f17;
                            rectF9.set(r3Var.getX() + currentPeerView.getX() + aaVar.X + aaVar.v.getLeft(), r3Var.getY() + currentPeerView.getY() + aaVar.W + aaVar.v.getTop(), ((aaVar.X + aaVar.v.getRight()) - (aaVar.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - r3Var.getRight()), ((aaVar.W + aaVar.v.getBottom()) - (aaVar.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - r3Var.getBottom()));
                            AndroidUtilities.lerp(rectF3, rectF9, f28, rectF11);
                            float imageX = x9Var.c.getImageX();
                            float imageY = x9Var.c.getImageY();
                            float imageWidth = x9Var.c.getImageWidth();
                            float imageHeight = x9Var.c.getImageHeight();
                            x9Var.c.setImageCoords(rectF11);
                            float f38 = 1.0f - f28;
                            x9Var.c.setAlpha(f38);
                            f19 = f28;
                            rectF4 = rectF3;
                            x9Var.c.setVisible(z10, false);
                            int saveCount = canvas.getSaveCount();
                            u9 u9Var2 = x9Var.f;
                            if (u9Var2 != null) {
                                u9Var2.e(f38, canvas, rectF11, aaVar.E);
                            }
                            x9Var.c.draw(canvas);
                            v9 v9Var2 = x9Var.e;
                            if (v9Var2 != null) {
                                v9Var2.i(canvas, rectF11, f38);
                            }
                            x9Var.c.setVisible(visible, false);
                            x9Var.c.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                            canvas.restoreToCount(saveCount);
                        }
                        canvas.restore();
                        if (m4Var != null) {
                            k4 k4Var2 = m4Var.a;
                            float f39 = aaVar.X;
                            float f40 = aaVar.W;
                            if (aaVar.H0 && aaVar.V0) {
                                rectF9.set(rectF);
                            } else {
                                for (View view3 = k4Var2; view3 != this && view3 != null; view3 = (View) view3.getParent()) {
                                    if (view3.getParent() == this) {
                                        f39 += view3.getLeft();
                                        f40 += view3.getTop();
                                    } else if (view3.getParent() != aaVar.n0) {
                                        float x10 = view3.getX() + f39;
                                        f40 = view3.getY() + f40;
                                        f39 = x10;
                                    }
                                    if (!(view3.getParent() instanceof View)) {
                                        break;
                                    }
                                }
                                rectF9.set(f39, f40, k4Var2.getMeasuredWidth() + f39, k4Var2.getMeasuredHeight() + f40);
                            }
                            AndroidUtilities.lerp(rectF4, rectF9, aaVar.U, rectF11);
                            int saveCount2 = canvas.getSaveCount();
                            if (x9Var != null && (u9Var = x9Var.f) != null) {
                                u9Var.e(1.0f - f19, canvas, rectF11, aaVar.E);
                            }
                            if (aaVar.V0) {
                                boolean z15 = (x9Var == null || x9Var.l == null) ? false : true;
                                if (z15 && aaVar.U == f18) {
                                    f20 = f19;
                                } else {
                                    if (x9Var != null && (y7Var2 = x9Var.m) != null && y7Var2.w) {
                                        canvas.saveLayerAlpha(rectF11.left - AndroidUtilities.dp(4.0f), rectF11.top - AndroidUtilities.dp(4.0f), rectF11.right + AndroidUtilities.dp(4.0f), rectF11.bottom + AndroidUtilities.dp(4.0f), 255, 31);
                                    }
                                    k4Var2.getImageReceiver().setImageCoords(rectF11);
                                    k4Var2.getImageReceiver().setRoundRadius((int) AndroidUtilities.lerp(rectF11.width() / 2.0f, ((x9Var == null || x9Var.b == null) ? null : Integer.valueOf((int) (x9Var.b.getRoundRadius()[0] * ((!x9Var.n || (view = x9Var.a) == null || view.getParent() == null) ? 1.0f : ((ViewGroup) x9Var.a.getParent()).getScaleY())))) != null ? r4.intValue() : rectF11.width() / 2.0f, 1.0f - aaVar.U));
                                    k4Var2.getImageReceiver().setVisible(true, false);
                                    float f41 = z15 ? aaVar.U : 1.0f;
                                    if (x9Var == null || x9Var.k >= 1.0f || (paint = x9Var.j) == null) {
                                        f20 = f19;
                                        f21 = f41;
                                    } else {
                                        paint.setAlpha((int) ((1.0f - f19) * f10));
                                        canvas.drawCircle(rectF11.centerX(), rectF11.centerY(), rectF11.width() / 2.0f, x9Var.j);
                                        f20 = f19;
                                        f21 = AndroidUtilities.lerp(x9Var.k, f41, f20);
                                    }
                                    k4Var2.getImageReceiver().setAlpha(f21);
                                    m4Var.b(aaVar.U, canvas, rectF11, !aa.A1);
                                    k4Var2.getImageReceiver().draw(canvas);
                                    k4Var2.getImageReceiver().setAlpha(f41);
                                    k4Var2.getImageReceiver().setVisible(false, false);
                                    if (x9Var != null && (y7Var = x9Var.m) != null && y7Var.w) {
                                        RectF rectF12 = AndroidUtilities.rectTmp;
                                        rectF12.set(rectF11);
                                        f22 = 1.0f;
                                        d8.k(1.0f - aaVar.U, f18, canvas, rectF12, true);
                                        canvas.restore();
                                        if (aaVar.U != f22 && z15) {
                                            RectF rectF13 = rectF2;
                                            rectF13.set(x9Var.l.getImageX(), x9Var.l.getImageY(), x9Var.l.getImageX2(), x9Var.l.getImageY2());
                                            int i15 = x9Var.l.getRoundRadius()[0];
                                            boolean visible2 = x9Var.l.getVisible();
                                            x9Var.l.setImageCoords(rectF11);
                                            x9Var.l.setRoundRadius((int) (rectF11.width() / 2.0f));
                                            x9Var.l.setVisible(true, false);
                                            canvas.saveLayerAlpha(rectF11, (int) ((1.0f - aaVar.U) * f10), 31);
                                            x9Var.l.draw(canvas);
                                            canvas.restore();
                                            x9Var.l.setVisible(visible2, false);
                                            x9Var.l.setImageCoords(rectF13);
                                            x9Var.l.setRoundRadius(i15);
                                        }
                                        if (x9Var != null && (v9Var = x9Var.e) != null) {
                                            v9Var.i(canvas, rectF11, 1.0f - f20);
                                        }
                                    }
                                }
                                f22 = 1.0f;
                                if (aaVar.U != f22) {
                                    RectF rectF132 = rectF2;
                                    rectF132.set(x9Var.l.getImageX(), x9Var.l.getImageY(), x9Var.l.getImageX2(), x9Var.l.getImageY2());
                                    int i152 = x9Var.l.getRoundRadius()[0];
                                    boolean visible22 = x9Var.l.getVisible();
                                    x9Var.l.setImageCoords(rectF11);
                                    x9Var.l.setRoundRadius((int) (rectF11.width() / 2.0f));
                                    x9Var.l.setVisible(true, false);
                                    canvas.saveLayerAlpha(rectF11, (int) ((1.0f - aaVar.U) * f10), 31);
                                    x9Var.l.draw(canvas);
                                    canvas.restore();
                                    x9Var.l.setVisible(visible22, false);
                                    x9Var.l.setImageCoords(rectF132);
                                    x9Var.l.setRoundRadius(i152);
                                }
                                if (x9Var != null) {
                                    v9Var.i(canvas, rectF11, 1.0f - f20);
                                }
                            }
                            canvas.restoreToCount(saveCount2);
                        }
                        if (aaVar.M != null) {
                            float clamp2 = Utilities.clamp(aaVar.U / 0.4f, 1.0f, 0.0f);
                            if (clamp2 != 1.0f) {
                                RectF rectF14 = AndroidUtilities.rectTmp;
                                float f42 = aaVar.N;
                                float f43 = aaVar.O;
                                rectF14.set(f42, f43, aaVar.R + f42, aaVar.S + f43);
                                rectF14.inset(-AndroidUtilities.dp(16.0f), -AndroidUtilities.dp(16.0f));
                                if (clamp2 != 0.0f) {
                                    canvas.saveLayerAlpha(rectF14, (int) ((1.0f - clamp2) * f10), 31);
                                } else {
                                    canvas.save();
                                }
                                canvas.translate(aaVar.K, aaVar.L);
                                ((org.telegram.ui.Cells.r2) aaVar.M).B(canvas);
                                canvas.restore();
                            }
                        }
                        canvas.restore();
                        if (aa.A1) {
                            ArrayList arrayList = aaVar.x0;
                            aaVar.Q();
                            aaVar.U = 0.0f;
                            aaVar.M(true);
                            aaVar.d = false;
                            aa.x1 = true;
                            aaVar.b0 = aaVar.W;
                            if (x9Var.d != null && (t10 = aaVar.t()) != null && (yj0Var = t10.o1.d) != null) {
                                yj0 yj0Var2 = x9Var.d;
                                yj0Var.c = yj0Var2.c;
                                yj0Var.f = yj0Var2.f;
                                yj0Var.b = yj0Var2.b;
                                yj0Var.a = System.currentTimeMillis();
                                yj0Var.c();
                            }
                            aaVar.E = true;
                            float[] fArr3 = new float[i11];
                            // fill-array-data instruction
                            fArr3[0] = 0.0f;
                            fArr3[1] = 1.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr3);
                            aaVar.F = ofFloat;
                            ofFloat.addUpdateListener(new i9(aaVar, 1));
                            aaVar.J0.lock();
                            p9 p9Var4 = aaVar.v;
                            if (p9Var4 != null) {
                                w.c = true;
                                i12 = 2;
                                p9Var4.setLayerType(2, null);
                            } else {
                                i12 = 2;
                            }
                            aaVar.F.addListener(new j9(aaVar, i12));
                            aaVar.F.setStartDelay(40L);
                            aaVar.F.setDuration(250L);
                            aaVar.F.setInterpolator(bs.f);
                            aaVar.F.start();
                            if (!arrayList.isEmpty()) {
                                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                    ((Runnable) arrayList.get(i16)).run();
                                }
                                arrayList.clear();
                            }
                            aa.A1 = false;
                            return;
                        }
                        return;
                    }
                    int i17 = i10;
                    float lerp7 = AndroidUtilities.lerp(iArr[i10], i17, f28);
                    fArr[z10] = lerp7;
                    fArr[i17] = lerp7;
                    float lerp8 = AndroidUtilities.lerp(aaVar.W0[z10], i17, f28);
                    fArr[3] = lerp8;
                    fArr[i11] = lerp8;
                    float lerp9 = AndroidUtilities.lerp(aaVar.W0[i11], i17, f28);
                    fArr[5] = lerp9;
                    fArr[4] = lerp9;
                    float lerp10 = AndroidUtilities.lerp(aaVar.W0[3], i17, f28);
                    fArr[7] = lerp10;
                    fArr[6] = lerp10;
                }
                f15 = 0.0f;
                path.addRoundRect(rectF10, fArr, Path.Direction.CCW);
                canvas.save();
                f16 = aaVar.P;
                if (f16 != f15) {
                    canvas.clipRect(f15, AndroidUtilities.lerp(f15, f16, (float) Math.pow(1.0f - aaVar.U, 0.4000000059604645d)), getMeasuredWidth(), AndroidUtilities.lerp(getMeasuredHeight(), aaVar.Q, 1.0f - aaVar.U));
                }
                if (x9Var == null) {
                }
                rectF2 = rectF5;
                f17 = f15;
                rectF3 = rectF8;
                canvas.save();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                RectF rectF112 = this.D0;
                if (x9Var != null) {
                }
                f18 = f17;
                f19 = f28;
                rectF4 = rectF3;
                canvas.restore();
                if (m4Var != null) {
                }
                if (aaVar.M != null) {
                }
                canvas.restore();
                if (aa.A1) {
                }
            }
        }
        aaVar.v.setAlpha(aaVar.U);
        float f44 = (f11 * 0.15f) + (aaVar.U * 0.1f) + 0.75f;
        aaVar.v.setScaleX(f44);
        aaVar.v.setScaleY(f44);
        aaVar.v.setTranslationY(aaVar.W);
        aaVar.v.setTranslationX(aaVar.X);
        super.dispatchDraw(canvas);
        i11 = 2;
        if (aa.A1) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        aa aaVar = this.I0;
        if (keyCode == 24 || keyEvent.getKeyCode() == 25) {
            aaVar.r(keyEvent);
            return true;
        }
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        aaVar.onAttachedBackPressed();
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
        q9 q9Var;
        int i10;
        cl0 cl0Var;
        aa aaVar = this.I0;
        float[] fArr = aaVar.o0;
        q4 currentPeerView = aaVar.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            v3 v3Var = currentPeerView.K0;
            if (v3Var.W.x()) {
                float x10 = currentPeerView.getX();
                float y3 = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x10, -y3);
                if (!v3Var.W.n(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x10, y3);
                }
                return true;
            }
        }
        float f7 = 0.0f;
        int i11 = 0;
        if (aaVar.p1 && currentPeerView != null && (cl0Var = currentPeerView.r3) != null) {
            float f10 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f7 += view.getX();
                f10 += view.getY();
            }
            if (currentPeerView.r3.getReactionsWindow() != null && currentPeerView.r3.getReactionsWindow().c != null) {
                motionEvent.offsetLocation(-f7, (-f10) - currentPeerView.r3.getReactionsWindow().c.getTranslationY());
                currentPeerView.r3.getReactionsWindow().c.dispatchTouchEvent(motionEvent);
                return true;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            cl0Var.getHitRect(rect);
            rect.offset((int) f7, (int) f10);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.b1(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            cl0Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            aaVar.j0 = false;
            AndroidUtilities.cancelRunOnUIThread(aaVar.b1);
            float f11 = aaVar.X;
            if (f11 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                aaVar.G = ofFloat;
                ofFloat.addUpdateListener(new l9(this, i11));
                aaVar.G.addListener(new m9(this, i11));
                aaVar.G.setDuration(250L);
                aaVar.G.setInterpolator(bs.f);
                aaVar.G.start();
            }
            if (aaVar.V >= 0.3f) {
                aaVar.q(true);
            }
            aaVar.K(false);
            aaVar.L(false);
            z10 = true;
        } else {
            z10 = false;
        }
        if (motionEvent.getAction() == 0) {
            aaVar.a0 = false;
            if (currentPeerView != null) {
                i4 i4Var = currentPeerView.y0;
                f9 f9Var = currentPeerView.C0;
                r3 r3Var = currentPeerView.c1;
                ei.x3 x3Var = currentPeerView.F0;
                if (x3Var != null && x3Var.V && f9Var != null && !x3Var.r0.contains(motionEvent.getX() - (currentPeerView.F0.getX() + (r3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.F0.getY() + (r3Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, f9Var)) {
                    currentPeerView.F0.e(true);
                }
                ei.x3 x3Var2 = currentPeerView.G0;
                if (x3Var2 != null && x3Var2.V && i4Var != null && !x3Var2.r0.contains(motionEvent.getX() - (currentPeerView.G0.getX() + (r3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.G0.getY() + (r3Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, i4Var)) {
                    currentPeerView.G0.e(true);
                }
            }
            aaVar.n0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        boolean z12 = (aaVar.x || aaVar.H0 || aaVar.I0) ? false : true;
        float f12 = aaVar.e0;
        SparseArray sparseArray = this.G0;
        if (f12 == 0.0f && !aaVar.j0 && aaVar.n0.F0 == 1 && motionEvent.getAction() == 2 && z12) {
            float floatValue = ((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0);
            if ((floatValue != 0.0f && (((i10 = (q9Var = aaVar.n0).I0) == 0 && q9Var.K0 == 0.0f && floatValue < 0.0f) || (i10 == q9Var.getAdapter().b() - 1 && q9Var.K0 == 0.0f && floatValue > 0.0f))) || aaVar.X != 0.0f) {
                float f13 = aaVar.X;
                if (f13 == 0.0f) {
                    aaVar.Y = -floatValue;
                }
                if ((floatValue < 0.0f && aaVar.Y > 0.0f) || (floatValue > 0.0f && aaVar.Y < 0.0f)) {
                    floatValue *= 0.2f;
                }
                aaVar.X = f13 - floatValue;
                aa.k(aaVar);
                float f14 = aaVar.X;
                if ((f14 > 0.0f && aaVar.Y < 0.0f) || (f14 < 0.0f && aaVar.Y > 0.0f)) {
                    aaVar.X = 0.0f;
                }
                z11 = true;
                if (currentPeerView != null && aaVar.e0 == 0.0f && !aaVar.j0 && !aaVar.L0 && !aaVar.I0 && aaVar.n0.F0 != 1) {
                    AndroidUtilities.getViewPositionInParent(currentPeerView.c1, this, fArr);
                    motionEvent.offsetLocation(-fArr[0], -fArr[1]);
                    q4 currentPeerView2 = aaVar.n0.getCurrentPeerView();
                    currentPeerView2.X2.a(motionEvent, currentPeerView2.c1, null, null, 0);
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
                        if (aaVar.e0 != 0.0f && !aaVar.g1 && aaVar.p0 < AndroidUtilities.dp(20.0f)) {
                            aaVar.n(aaVar.w.f > 0.5f);
                        }
                        q4 t10 = aaVar.t();
                        if (t10 != null) {
                            t10.K0.w0 = false;
                        }
                    }
                    if (z10 && !aaVar.a0) {
                        aaVar.m();
                    }
                    if (!dispatchTouchEvent && (!aa.x1 || !aaVar.q0)) {
                        return false;
                    }
                }
                return true;
            }
        }
        z11 = false;
        if (currentPeerView != null) {
            AndroidUtilities.getViewPositionInParent(currentPeerView.c1, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            q4 currentPeerView22 = aaVar.n0.getCurrentPeerView();
            currentPeerView22.X2.a(motionEvent, currentPeerView22.c1, null, null, 0);
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
        if (view == this.I0.y0) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.jw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        aa aaVar = this.I0;
        if (aaVar.b && !aaVar.c) {
            org.telegram.ui.ActionBar.n2 n2Var = this.H0;
            AndroidUtilities.requestAdjustResize(n2Var.getParentActivity(), n2Var.getClassGuid());
        }
        qc.a(this, new n9(this));
        NotificationCenter.getInstance(aaVar.h).addObserver(aaVar, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(aaVar.h).addObserver(aaVar, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(aaVar.h).addObserver(aaVar, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(aaVar.h).addObserver(aaVar, NotificationCenter.openArticle);
        NotificationCenter.getInstance(aaVar.h).addObserver(aaVar, NotificationCenter.storyDeleted);
    }

    @Override // org.telegram.ui.Components.jw0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc.h(this);
        aa aaVar = this.I0;
        NotificationCenter.getInstance(aaVar.h).removeObserver(aaVar, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(aaVar.h).removeObserver(aaVar, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(aaVar.h).removeObserver(aaVar, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(aaVar.h).removeObserver(aaVar, NotificationCenter.openArticle);
        NotificationCenter.getInstance(aaVar.h).removeObserver(aaVar, NotificationCenter.storyDeleted);
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01e3  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f7;
        n2 n2Var;
        z9 z9Var;
        q4 currentPeerView;
        boolean z10;
        androidx.fragment.app.d dVar;
        p4 p4Var;
        q4 currentPeerView2;
        o4 o4Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        n2 n2Var2;
        aa aaVar = this.I0;
        t3 t3Var = aaVar.b1;
        if (motionEvent.getAction() == 0 && aaVar.U == 1.0f) {
            float x10 = motionEvent.getX();
            this.y0 = x10;
            this.w0 = x10;
            this.x0 = motionEvent.getY();
            aaVar.g0 = false;
            aaVar.f0 = (aaVar.I0 || aa.i(aaVar, aaVar.s, motionEvent.getX(), motionEvent.getY(), false)) ? false : true;
            aaVar.h0 = (aaVar.I0 || aa.i(aaVar, aaVar.s, motionEvent.getX(), motionEvent.getY(), true)) ? false : true;
            aaVar.K(aaVar.f0 && !aaVar.m1);
            q4 t10 = aaVar.t();
            if (aaVar.f0 && t10 != null && (n2Var2 = t10.L0) != null) {
                n2Var2.setAllowTouches(false);
            }
            if (aaVar.f0 && !aaVar.I0 && aaVar.m1) {
                androidx.fragment.app.d dVar2 = new androidx.fragment.app.d(this, 27);
                aaVar.n1 = dVar2;
                AndroidUtilities.runOnUIThread(dVar2, 150L);
            }
            if (aaVar.f0 && !aaVar.x && !aaVar.I0 && !aaVar.j1) {
                AndroidUtilities.runOnUIThread(t3Var, 400L);
            }
            f7 = 1.0f;
        } else if (motionEvent.getAction() == 2) {
            float abs = Math.abs(this.x0 - motionEvent.getY());
            float abs2 = Math.abs(this.w0 - motionEvent.getX());
            if (aaVar.a1 && aaVar.k0 && !aaVar.f1 && !aaVar.j0 && (p4Var = aaVar.G0) != null && ((z9) p4Var.c) != null && (currentPeerView2 = aaVar.n0.getCurrentPeerView()) != null && (o4Var = currentPeerView2.O1) != null && o4Var.b == null && o4Var.e) {
                long j10 = currentPeerView2.R2;
                if (j10 <= 0 && (storyItem = o4Var.a) != null && (messageMedia = storyItem.media) != null && (document = messageMedia.document) != null) {
                    j10 = (long) (MessageObject.getDocumentDuration(document) * 1000.0d);
                }
                if (j10 > 0) {
                    float x11 = motionEvent.getX();
                    z9 z9Var2 = (z9) aaVar.G0.c;
                    f7 = 1.0f;
                    if (((int) (z9Var2.seek((x11 - this.y0) / AndroidUtilities.dp(220.0f), j10) * 10.0f)) != ((int) (z9Var2.currentSeek * 10.0f))) {
                        try {
                            currentPeerView2.performHapticFeedback(9, 1);
                        } catch (Exception unused) {
                        }
                    }
                    currentPeerView2.c1.invalidate();
                    this.y0 = x11;
                    if (abs > abs2 && !aaVar.k0 && !aaVar.g0 && abs > AndroidUtilities.touchSlop * 2.0f) {
                        aaVar.g0 = true;
                    }
                    if (!aaVar.j0 && !aaVar.k0 && !aaVar.x && aaVar.h0) {
                        if (abs > abs2 && abs > AndroidUtilities.touchSlop * 2.0f) {
                            aaVar.j0 = true;
                            currentPeerView = aaVar.n0.getCurrentPeerView();
                            if (currentPeerView != null) {
                                currentPeerView.p0();
                            }
                            boolean z11 = currentPeerView == null && !currentPeerView.O1.f && (currentPeerView.C1 || (currentPeerView.D1 && currentPeerView.B3));
                            aaVar.l0 = (!z11 || currentPeerView == null || currentPeerView.D1 || currentPeerView.F1 || aaVar.u1 != null) ? false : true;
                            z10 = (z11 || currentPeerView.c3 || currentPeerView.O1.a == null || aaVar.u1 != null) ? false : true;
                            aaVar.c0 = z10;
                            if (z10 && this.f != 0) {
                                aaVar.c0 = false;
                            }
                            if (aaVar.c0) {
                                aaVar.p();
                            }
                            aaVar.Z = 0.0f;
                            dVar = aaVar.n1;
                            if (dVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(dVar);
                                aaVar.n1.run();
                                aaVar.n1 = null;
                            }
                            AndroidUtilities.cancelRunOnUIThread(t3Var);
                        }
                        aaVar.y();
                    }
                }
            }
            f7 = 1.0f;
            if (abs > abs2) {
                aaVar.g0 = true;
            }
            if (!aaVar.j0) {
                if (abs > abs2) {
                    aaVar.j0 = true;
                    currentPeerView = aaVar.n0.getCurrentPeerView();
                    if (currentPeerView != null) {
                    }
                    if (currentPeerView == null) {
                    }
                    aaVar.l0 = (!z11 || currentPeerView == null || currentPeerView.D1 || currentPeerView.F1 || aaVar.u1 != null) ? false : true;
                    if (z11) {
                    }
                    aaVar.c0 = z10;
                    if (z10) {
                        aaVar.c0 = false;
                    }
                    if (aaVar.c0) {
                    }
                    aaVar.Z = 0.0f;
                    dVar = aaVar.n1;
                    if (dVar != null) {
                    }
                    AndroidUtilities.cancelRunOnUIThread(t3Var);
                }
                aaVar.y();
            }
        } else {
            f7 = 1.0f;
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                AndroidUtilities.cancelRunOnUIThread(t3Var);
                androidx.fragment.app.d dVar3 = aaVar.n1;
                if (dVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(dVar3);
                    aaVar.n1 = null;
                }
                aaVar.K(false);
                aaVar.g0 = false;
                aaVar.k0 = false;
                p4 p4Var2 = aaVar.G0;
                if (p4Var2 != null && (z9Var = (z9) p4Var2.c) != null) {
                    z9Var.setSeeking(false);
                }
                q4 t11 = aaVar.t();
                if (t11 != null && (n2Var = t11.L0) != null) {
                    n2Var.setAllowTouches(true);
                }
            }
        }
        c6 c6Var = aaVar.w;
        boolean z12 = c6Var != null && c6Var.f == f7;
        if (!aaVar.j0 && !z12) {
            aaVar.i0.onTouchEvent(motionEvent);
        }
        return aaVar.j0 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        aa aaVar = this.I0;
        ((FrameLayout.LayoutParams) aaVar.d1.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(2.0f);
        aaVar.d1.getLayoutParams().height = AndroidUtilities.dp(2.0f);
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        n2 n2Var;
        int action = motionEvent.getAction();
        aa aaVar = this.I0;
        int i10 = 1;
        if (action == 1 || motionEvent.getAction() == 3) {
            aaVar.j0 = false;
            aaVar.K(false);
            if (aaVar.V >= 1.0f) {
                aaVar.q(true);
            } else if (!aaVar.H0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(aaVar.W, 0.0f);
                aaVar.G = ofFloat;
                ofFloat.addUpdateListener(new l9(this, i10));
                aaVar.G.addListener(new m9(this, i10));
                aaVar.G.setDuration(150L);
                aaVar.G.setInterpolator(bs.f);
                aaVar.G.start();
            }
            q4 t10 = aaVar.t();
            if (t10 != null && (n2Var = t10.L0) != null) {
                n2Var.setAllowTouches(true);
            }
        }
        if (!aaVar.j0 && !aaVar.x && aaVar.Z == 0.0f && ((aaVar.e0 == 0.0f || (!aaVar.f0 && !aaVar.g0)) && !aaVar.j1)) {
            return false;
        }
        aaVar.i0.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        this.I0.f0 = false;
    }
}
