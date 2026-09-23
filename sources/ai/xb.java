package ai;

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
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.rr;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class xb extends pv0 {
    public final Path A0;
    public final RectF B0;
    public final RectF C0;
    public final RectF D0;
    public final RectF E0;
    public final RectF F0;
    public final SparseArray G0;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 H0;
    public final /* synthetic */ jc I0;
    public float w0;
    public float x0;
    public float y0;
    public final float[] z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(jc jcVar, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null);
        this.I0 = jcVar;
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

    /* JADX WARN: Removed duplicated region for block: B:133:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.pv0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        char c10;
        char c11;
        float f10;
        a6 a6Var;
        float f11;
        char c12;
        float f12;
        RectF rectF;
        float f13;
        float[] fArr;
        float f14;
        float f15;
        RectF rectF2;
        RectF rectF3;
        float f16;
        RectF rectF4;
        float f17;
        float f18;
        float f19;
        ca caVar;
        float f20;
        Paint paint;
        View view;
        ca caVar2;
        ec ecVar;
        dc dcVar;
        e6 currentPeerView;
        a5 a5Var;
        ca caVar3;
        int i10;
        e6 t10;
        cj0 cj0Var;
        jc jcVar = this.I0;
        RectF rectF5 = jcVar.T;
        gc gcVar = jcVar.s0;
        canvas.drawColor(i0.a.k(-16777216, (int) ((((1.0f - jcVar.V) * 0.5f) + 0.5f) * jcVar.U * 255.0f)));
        if (jcVar.b) {
            boolean z10 = (1.0f - jcVar.V) * jcVar.U == 1.0f;
            if (jcVar.K0 != z10) {
                jcVar.K0 = z10;
                org.telegram.ui.ActionBar.n2 n2Var = this.H0;
                if (n2Var.getLayoutContainer() != null) {
                    n2Var.getLayoutContainer().invalidate();
                }
            }
        }
        e6 currentPeerView2 = jcVar.n0.getCurrentPeerView();
        RectF rectF6 = this.F0;
        RectF rectF7 = this.E0;
        if (currentPeerView2 != null) {
            a6 a6Var2 = currentPeerView2.o1;
            if (jcVar.V0) {
                a6Var2.a.getImageReceiver().setVisible(jcVar.U == 1.0f, true);
            } else {
                a6Var2.a.getImageReceiver().setVisible(true, false);
            }
            if (jcVar.h1) {
                jcVar.h1 = false;
                y5 y5Var = a6Var2.a;
                float f21 = 0.0f;
                float f22 = 0.0f;
                f7 = 255.0f;
                c10 = 1;
                for (View view2 = a6Var2.a; view2 != this; view2 = (View) view2.getParent()) {
                    if (view2.getParent() == this) {
                        f21 += view2.getLeft();
                        f22 += view2.getTop();
                    } else if (view2.getParent() != jcVar.n0) {
                        f21 += view2.getX();
                        f22 += view2.getY();
                    }
                }
                c11 = 0;
                f10 = 1.0f;
                rectF7.set(f21, f22, y5Var.getMeasuredWidth() + f21, y5Var.getMeasuredHeight() + f22);
                rectF6.set(0.0f, currentPeerView2.c1.getTop() + currentPeerView2.getTop(), jcVar.v.getMeasuredWidth(), jcVar.v.getMeasuredHeight());
                jcVar.v.getMatrix().mapRect(rectF7);
                jcVar.v.getMatrix().mapRect(rectF6);
            } else {
                f7 = 255.0f;
                c10 = 1;
                c11 = 0;
                f10 = 1.0f;
            }
            a6Var = a6Var2;
        } else {
            f7 = 255.0f;
            c10 = 1;
            c11 = 0;
            f10 = 1.0f;
            a6Var = null;
        }
        jcVar.d1.setAlpha(f10 - jcVar.V);
        float clamp = jcVar.X == 0.0f ? 1.0f - Utilities.clamp(Math.abs(jcVar.W / getMeasuredHeight()), 1.0f, 0.0f) : 1.0f;
        jcVar.n0.setHorizontalProgressToDismiss((jcVar.X / jcVar.v.getMeasuredWidth()) * jcVar.U);
        if (jcVar.N != 0.0f || jcVar.O != 0.0f) {
            float f23 = jcVar.U;
            if (f23 != 1.0f) {
                if (jcVar.H0 && jcVar.V0) {
                    float clamp2 = 1.0f - Utilities.clamp(((1.0f - f23) - 0.8f) / 0.100000024f, 1.0f, 0.0f);
                    f11 = 0.15f;
                    f12 = Utilities.clamp(com.google.android.gms.internal.vision.e2.b(1.0f, clamp2, 0.05f, f23), 1.0f, 0.0f);
                    c12 = 2;
                    jcVar.v.setAlpha(clamp2);
                } else {
                    f11 = 0.15f;
                    c12 = 2;
                    jcVar.v.setAlpha(1.0f);
                    f12 = f23;
                }
                if (!jcVar.H0 || gcVar == null || gcVar.c == null) {
                    rectF = rectF7;
                } else {
                    yb ybVar = jcVar.v;
                    rectF = rectF7;
                    ybVar.setAlpha(ybVar.getAlpha() * ((float) Math.pow(f23, 0.20000000298023224d)));
                }
                yb ybVar2 = jcVar.v;
                float left = (jcVar.N - ybVar2.getLeft()) - (jcVar.v.getMeasuredWidth() / 2.0f);
                float f24 = jcVar.U;
                ybVar2.setTranslationX((jcVar.X * f24) + ((1.0f - f24) * left));
                yb ybVar3 = jcVar.v;
                float top = (jcVar.O - ybVar3.getTop()) - (jcVar.v.getMeasuredHeight() / 2.0f);
                float f25 = jcVar.U;
                ybVar3.setTranslationY((jcVar.W * f25) + ((1.0f - f25) * top));
                float lerp = AndroidUtilities.lerp(jcVar.R / jcVar.v.getMeasuredWidth(), (clamp * f11) + 0.85f, f12);
                jcVar.v.setScaleX(lerp);
                jcVar.v.setScaleY(lerp);
                Path path = this.A0;
                path.rewind();
                float f26 = jcVar.N;
                float f27 = jcVar.R / 2.0f;
                float f28 = jcVar.O;
                float f29 = jcVar.S / 2.0f;
                float f30 = f29 + f28;
                RectF rectF8 = this.B0;
                rectF8.set(f26 - f27, f28 - f29, f27 + f26, f30);
                boolean z11 = jcVar.H0;
                RectF rectF9 = this.C0;
                if (z11 && jcVar.V0) {
                    rectF9.set(rectF6);
                } else if (currentPeerView2 != null) {
                    rectF9.set(0.0f, currentPeerView2.c1.getTop() + jcVar.b0, getMeasuredWidth(), getMeasuredHeight() + jcVar.b0);
                } else {
                    rectF9.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                if (jcVar.H0 && jcVar.V0) {
                    rectF8.inset(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                }
                float lerp2 = AndroidUtilities.lerp(rectF8.centerX(), rectF9.centerX(), jcVar.U);
                float lerp3 = AndroidUtilities.lerp(rectF8.centerY(), rectF9.centerY(), jcVar.U);
                float lerp4 = AndroidUtilities.lerp(rectF8.height(), rectF9.height(), f12);
                float lerp5 = AndroidUtilities.lerp(rectF8.width(), rectF9.width(), f12);
                if (jcVar.H0 && jcVar.V0) {
                    f13 = lerp2;
                    rectF8.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
                } else {
                    f13 = lerp2;
                }
                RectF rectF10 = AndroidUtilities.rectTmp;
                float f31 = lerp5 / 2.0f;
                float f32 = lerp4 / 2.0f;
                rectF10.set(f13 - f31, lerp3 - f32, f13 + f31, lerp3 + f32);
                boolean z12 = jcVar.V0;
                float[] fArr2 = this.z0;
                if (z12) {
                    float lerp6 = AndroidUtilities.lerp(jcVar.R / 2.0f, 0.0f, f12);
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
                    int[] iArr = jcVar.W0;
                    if (iArr == null) {
                        f14 = 0.0f;
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
                        f15 = jcVar.P;
                        if (f15 != f14 && jcVar.Q != f14) {
                            canvas.clipRect(f14, AndroidUtilities.lerp(f14, f15, (float) Math.pow(1.0f - jcVar.U, 0.4000000059604645d)), getMeasuredWidth(), AndroidUtilities.lerp(getMeasuredHeight(), jcVar.Q, 1.0f - jcVar.U));
                        }
                        if (gcVar == null && (caVar3 = gcVar.m) != null && caVar3.w && jcVar.V0) {
                            rectF2 = rectF8;
                            rectF3 = rectF5;
                            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f23 * f7), 31);
                        } else {
                            rectF2 = rectF8;
                            rectF3 = rectF5;
                            canvas.save();
                        }
                        canvas.clipPath(path);
                        super.dispatchDraw(canvas);
                        RectF rectF11 = this.D0;
                        if (gcVar != null || gcVar.c == null || (currentPeerView = jcVar.n0.getCurrentPeerView()) == null || (a5Var = currentPeerView.c1) == null) {
                            f16 = f23;
                            rectF4 = rectF2;
                            f17 = 0.0f;
                        } else {
                            boolean visible = gcVar.c.getVisible();
                            f17 = 0.0f;
                            rectF9.set(a5Var.getX() + currentPeerView.getX() + jcVar.X + jcVar.v.getLeft(), a5Var.getY() + currentPeerView.getY() + jcVar.W + jcVar.v.getTop(), ((jcVar.X + jcVar.v.getRight()) - (jcVar.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - a5Var.getRight()), ((jcVar.W + jcVar.v.getBottom()) - (jcVar.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - a5Var.getBottom()));
                            AndroidUtilities.lerp(rectF2, rectF9, f23, rectF11);
                            float imageX = gcVar.c.getImageX();
                            float imageY = gcVar.c.getImageY();
                            float imageWidth = gcVar.c.getImageWidth();
                            float imageHeight = gcVar.c.getImageHeight();
                            gcVar.c.setImageCoords(rectF11);
                            float f33 = 1.0f - f23;
                            gcVar.c.setAlpha(f33);
                            f16 = f23;
                            rectF4 = rectF2;
                            gcVar.c.setVisible(true, false);
                            int saveCount = canvas.getSaveCount();
                            dc dcVar2 = gcVar.f;
                            if (dcVar2 != null) {
                                dcVar2.g(f33, canvas, rectF11, jcVar.E);
                            }
                            gcVar.c.draw(canvas);
                            ec ecVar2 = gcVar.e;
                            if (ecVar2 != null) {
                                ecVar2.h(canvas, rectF11, f33);
                            }
                            gcVar.c.setVisible(visible, false);
                            gcVar.c.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                            canvas.restoreToCount(saveCount);
                        }
                        canvas.restore();
                        if (a6Var != null) {
                            y5 y5Var2 = a6Var.a;
                            float f34 = jcVar.X;
                            float f35 = jcVar.W;
                            if (jcVar.H0 && jcVar.V0) {
                                rectF9.set(rectF);
                            } else {
                                for (View view3 = y5Var2; view3 != this && view3 != null; view3 = (View) view3.getParent()) {
                                    if (view3.getParent() == this) {
                                        f34 += view3.getLeft();
                                        f35 += view3.getTop();
                                    } else if (view3.getParent() != jcVar.n0) {
                                        float x10 = view3.getX() + f34;
                                        f35 = view3.getY() + f35;
                                        f34 = x10;
                                    }
                                    if (!(view3.getParent() instanceof View)) {
                                        break;
                                    }
                                }
                                rectF9.set(f34, f35, y5Var2.getMeasuredWidth() + f34, y5Var2.getMeasuredHeight() + f35);
                            }
                            AndroidUtilities.lerp(rectF4, rectF9, jcVar.U, rectF11);
                            int saveCount2 = canvas.getSaveCount();
                            if (gcVar != null && (dcVar = gcVar.f) != null) {
                                dcVar.g(1.0f - f16, canvas, rectF11, jcVar.E);
                            }
                            if (jcVar.V0) {
                                boolean z13 = (gcVar == null || gcVar.l == null) ? false : true;
                                if (z13 && jcVar.U == f17) {
                                    f18 = f16;
                                } else {
                                    if (gcVar != null && (caVar2 = gcVar.m) != null && caVar2.w) {
                                        canvas.saveLayerAlpha(rectF11.left - AndroidUtilities.dp(4.0f), rectF11.top - AndroidUtilities.dp(4.0f), rectF11.right + AndroidUtilities.dp(4.0f), rectF11.bottom + AndroidUtilities.dp(4.0f), 255, 31);
                                    }
                                    y5Var2.getImageReceiver().setImageCoords(rectF11);
                                    y5Var2.getImageReceiver().setRoundRadius((int) AndroidUtilities.lerp(rectF11.width() / 2.0f, ((gcVar == null || gcVar.b == null) ? null : Integer.valueOf((int) (gcVar.b.getRoundRadius()[0] * ((!gcVar.n || (view = gcVar.a) == null || view.getParent() == null) ? 1.0f : ((ViewGroup) gcVar.a.getParent()).getScaleY())))) != null ? r4.intValue() : rectF11.width() / 2.0f, 1.0f - jcVar.U));
                                    y5Var2.getImageReceiver().setVisible(true, false);
                                    float f36 = z13 ? jcVar.U : 1.0f;
                                    if (gcVar == null || gcVar.k >= 1.0f || (paint = gcVar.j) == null) {
                                        f18 = f16;
                                        f19 = f36;
                                    } else {
                                        paint.setAlpha((int) ((1.0f - f16) * f7));
                                        canvas.drawCircle(rectF11.centerX(), rectF11.centerY(), rectF11.width() / 2.0f, gcVar.j);
                                        f18 = f16;
                                        f19 = AndroidUtilities.lerp(gcVar.k, f36, f18);
                                    }
                                    y5Var2.getImageReceiver().setAlpha(f19);
                                    a6Var.b(jcVar.U, canvas, rectF11, !jc.A1);
                                    y5Var2.getImageReceiver().draw(canvas);
                                    y5Var2.getImageReceiver().setAlpha(f36);
                                    y5Var2.getImageReceiver().setVisible(false, false);
                                    if (gcVar != null && (caVar = gcVar.m) != null && caVar.w) {
                                        RectF rectF12 = AndroidUtilities.rectTmp;
                                        rectF12.set(rectF11);
                                        f20 = 1.0f;
                                        ia.k(canvas, rectF12, 1.0f - jcVar.U, true, 0.0f);
                                        canvas.restore();
                                        if (jcVar.U != f20 && z13) {
                                            RectF rectF13 = rectF3;
                                            rectF13.set(gcVar.l.getImageX(), gcVar.l.getImageY(), gcVar.l.getImageX2(), gcVar.l.getImageY2());
                                            int i11 = gcVar.l.getRoundRadius()[0];
                                            boolean visible2 = gcVar.l.getVisible();
                                            gcVar.l.setImageCoords(rectF11);
                                            gcVar.l.setRoundRadius((int) (rectF11.width() / 2.0f));
                                            gcVar.l.setVisible(true, false);
                                            canvas.saveLayerAlpha(rectF11, (int) ((1.0f - jcVar.U) * f7), 31);
                                            gcVar.l.draw(canvas);
                                            canvas.restore();
                                            gcVar.l.setVisible(visible2, false);
                                            gcVar.l.setImageCoords(rectF13);
                                            gcVar.l.setRoundRadius(i11);
                                        }
                                        if (gcVar != null && (ecVar = gcVar.e) != null) {
                                            ecVar.h(canvas, rectF11, 1.0f - f18);
                                        }
                                    }
                                }
                                f20 = 1.0f;
                                if (jcVar.U != f20) {
                                    RectF rectF132 = rectF3;
                                    rectF132.set(gcVar.l.getImageX(), gcVar.l.getImageY(), gcVar.l.getImageX2(), gcVar.l.getImageY2());
                                    int i112 = gcVar.l.getRoundRadius()[0];
                                    boolean visible22 = gcVar.l.getVisible();
                                    gcVar.l.setImageCoords(rectF11);
                                    gcVar.l.setRoundRadius((int) (rectF11.width() / 2.0f));
                                    gcVar.l.setVisible(true, false);
                                    canvas.saveLayerAlpha(rectF11, (int) ((1.0f - jcVar.U) * f7), 31);
                                    gcVar.l.draw(canvas);
                                    canvas.restore();
                                    gcVar.l.setVisible(visible22, false);
                                    gcVar.l.setImageCoords(rectF132);
                                    gcVar.l.setRoundRadius(i112);
                                }
                                if (gcVar != null) {
                                    ecVar.h(canvas, rectF11, 1.0f - f18);
                                }
                            }
                            canvas.restoreToCount(saveCount2);
                        }
                        if (jcVar.M != null) {
                            float clamp3 = Utilities.clamp(jcVar.U / 0.4f, 1.0f, 0.0f);
                            if (clamp3 != 1.0f) {
                                RectF rectF14 = AndroidUtilities.rectTmp;
                                float f37 = jcVar.N;
                                float f38 = jcVar.O;
                                rectF14.set(f37, f38, jcVar.R + f37, jcVar.S + f38);
                                rectF14.inset(-AndroidUtilities.dp(16.0f), -AndroidUtilities.dp(16.0f));
                                if (clamp3 != 0.0f) {
                                    canvas.saveLayerAlpha(rectF14, (int) ((1.0f - clamp3) * f7), 31);
                                } else {
                                    canvas.save();
                                }
                                canvas.translate(jcVar.K, jcVar.L);
                                ((org.telegram.ui.Cells.r2) jcVar.M).A(canvas);
                                canvas.restore();
                            }
                        }
                        canvas.restore();
                        if (jc.A1) {
                            ArrayList arrayList = jcVar.x0;
                            jcVar.Q();
                            jcVar.U = 0.0f;
                            jcVar.M(true);
                            jcVar.d = false;
                            jc.x1 = true;
                            jcVar.b0 = jcVar.W;
                            if (gcVar.d != null && (t10 = jcVar.t()) != null && (cj0Var = t10.o1.d) != null) {
                                cj0 cj0Var2 = gcVar.d;
                                cj0Var.c = cj0Var2.c;
                                cj0Var.f = cj0Var2.f;
                                cj0Var.b = cj0Var2.b;
                                cj0Var.a = System.currentTimeMillis();
                                cj0Var.c();
                            }
                            jcVar.E = true;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            jcVar.F = ofFloat;
                            ofFloat.addUpdateListener(new qb(jcVar, 1));
                            jcVar.J0.lock();
                            yb ybVar4 = jcVar.v;
                            if (ybVar4 != null) {
                                i0.c = true;
                                i10 = 2;
                                ybVar4.setLayerType(2, null);
                            } else {
                                i10 = 2;
                            }
                            jcVar.F.addListener(new sb(jcVar, i10));
                            jcVar.F.setStartDelay(40L);
                            jcVar.F.setDuration(250L);
                            jcVar.F.setInterpolator(rr.f);
                            jcVar.F.start();
                            if (!arrayList.isEmpty()) {
                                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                    ((Runnable) arrayList.get(i12)).run();
                                }
                                arrayList.clear();
                            }
                            jc.A1 = false;
                            return;
                        }
                        return;
                    }
                    float lerp7 = AndroidUtilities.lerp(iArr[c11], 0, f23);
                    fArr[c10] = lerp7;
                    fArr[0] = lerp7;
                    float lerp8 = AndroidUtilities.lerp(jcVar.W0[c10], 0, f23);
                    fArr[3] = lerp8;
                    fArr[c12] = lerp8;
                    float lerp9 = AndroidUtilities.lerp(jcVar.W0[c12], 0, f23);
                    fArr[5] = lerp9;
                    fArr[4] = lerp9;
                    float lerp10 = AndroidUtilities.lerp(jcVar.W0[3], 0, f23);
                    fArr[7] = lerp10;
                    fArr[6] = lerp10;
                }
                f14 = 0.0f;
                path.addRoundRect(rectF10, fArr, Path.Direction.CCW);
                canvas.save();
                f15 = jcVar.P;
                if (f15 != f14) {
                    canvas.clipRect(f14, AndroidUtilities.lerp(f14, f15, (float) Math.pow(1.0f - jcVar.U, 0.4000000059604645d)), getMeasuredWidth(), AndroidUtilities.lerp(getMeasuredHeight(), jcVar.Q, 1.0f - jcVar.U));
                }
                if (gcVar == null) {
                }
                rectF2 = rectF8;
                rectF3 = rectF5;
                canvas.save();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                RectF rectF112 = this.D0;
                if (gcVar != null) {
                }
                f16 = f23;
                rectF4 = rectF2;
                f17 = 0.0f;
                canvas.restore();
                if (a6Var != null) {
                }
                if (jcVar.M != null) {
                }
                canvas.restore();
                if (jc.A1) {
                }
            }
        }
        jcVar.v.setAlpha(jcVar.U);
        float f39 = (clamp * 0.15f) + (jcVar.U * 0.1f) + 0.75f;
        jcVar.v.setScaleX(f39);
        jcVar.v.setScaleY(f39);
        jcVar.v.setTranslationY(jcVar.W);
        jcVar.v.setTranslationX(jcVar.X);
        super.dispatchDraw(canvas);
        if (jc.A1) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        jc jcVar = this.I0;
        if (keyCode == 24 || keyEvent.getKeyCode() == 25) {
            jcVar.r(keyEvent);
            return true;
        }
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        jcVar.onAttachedBackPressed();
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
        zb zbVar;
        int i10;
        gk0 gk0Var;
        jc jcVar = this.I0;
        float[] fArr = jcVar.o0;
        e6 currentPeerView = jcVar.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            g5 g5Var = currentPeerView.K0;
            if (g5Var.W.y()) {
                float x10 = currentPeerView.getX();
                float y3 = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x10, -y3);
                if (!g5Var.W.o(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x10, y3);
                }
                return true;
            }
        }
        float f7 = 0.0f;
        int i11 = 0;
        if (jcVar.p1 && currentPeerView != null && (gk0Var = currentPeerView.r3) != null) {
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
            gk0Var.getHitRect(rect);
            rect.offset((int) f7, (int) f10);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.b1(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            gk0Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            jcVar.j0 = false;
            AndroidUtilities.cancelRunOnUIThread(jcVar.b1);
            float f11 = jcVar.X;
            if (f11 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                jcVar.G = ofFloat;
                ofFloat.addUpdateListener(new ub(this, i11));
                jcVar.G.addListener(new vb(this, i11));
                jcVar.G.setDuration(250L);
                jcVar.G.setInterpolator(rr.f);
                jcVar.G.start();
            }
            if (jcVar.V >= 0.3f) {
                jcVar.q(true);
            }
            jcVar.K(false);
            jcVar.L(false);
            z10 = true;
        } else {
            z10 = false;
        }
        if (motionEvent.getAction() == 0) {
            jcVar.a0 = false;
            if (currentPeerView != null) {
                w5 w5Var = currentPeerView.y0;
                nb nbVar = currentPeerView.C0;
                a5 a5Var = currentPeerView.c1;
                ci.e4 e4Var = currentPeerView.F0;
                if (e4Var != null && e4Var.V && nbVar != null && !e4Var.r0.contains(motionEvent.getX() - (currentPeerView.F0.getX() + (a5Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.F0.getY() + (a5Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, nbVar)) {
                    currentPeerView.F0.e(true);
                }
                ci.e4 e4Var2 = currentPeerView.G0;
                if (e4Var2 != null && e4Var2.V && w5Var != null && !e4Var2.r0.contains(motionEvent.getX() - (currentPeerView.G0.getX() + (a5Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.G0.getY() + (a5Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, w5Var)) {
                    currentPeerView.G0.e(true);
                }
            }
            jcVar.n0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        boolean z12 = (jcVar.x || jcVar.H0 || jcVar.I0) ? false : true;
        float f12 = jcVar.e0;
        SparseArray sparseArray = this.G0;
        if (f12 == 0.0f && !jcVar.j0 && jcVar.n0.F0 == 1 && motionEvent.getAction() == 2 && z12) {
            float floatValue = ((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0);
            if ((floatValue != 0.0f && (((i10 = (zbVar = jcVar.n0).I0) == 0 && zbVar.K0 == 0.0f && floatValue < 0.0f) || (i10 == zbVar.getAdapter().b() - 1 && zbVar.K0 == 0.0f && floatValue > 0.0f))) || jcVar.X != 0.0f) {
                float f13 = jcVar.X;
                if (f13 == 0.0f) {
                    jcVar.Y = -floatValue;
                }
                if ((floatValue < 0.0f && jcVar.Y > 0.0f) || (floatValue > 0.0f && jcVar.Y < 0.0f)) {
                    floatValue *= 0.2f;
                }
                jcVar.X = f13 - floatValue;
                jc.k(jcVar);
                float f14 = jcVar.X;
                if ((f14 > 0.0f && jcVar.Y < 0.0f) || (f14 < 0.0f && jcVar.Y > 0.0f)) {
                    jcVar.X = 0.0f;
                }
                z11 = true;
                if (currentPeerView != null && jcVar.e0 == 0.0f && !jcVar.j0 && !jcVar.L0 && !jcVar.I0 && jcVar.n0.F0 != 1) {
                    AndroidUtilities.getViewPositionInParent(currentPeerView.c1, this, fArr);
                    motionEvent.offsetLocation(-fArr[0], -fArr[1]);
                    e6 currentPeerView2 = jcVar.n0.getCurrentPeerView();
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
                        if (jcVar.e0 != 0.0f && !jcVar.g1 && jcVar.p0 < AndroidUtilities.dp(20.0f)) {
                            jcVar.n(jcVar.w.f > 0.5f);
                        }
                        e6 t10 = jcVar.t();
                        if (t10 != null) {
                            t10.K0.w0 = false;
                        }
                    }
                    if (z10 && !jcVar.a0) {
                        jcVar.m();
                    }
                    if (!dispatchTouchEvent && (!jc.x1 || !jcVar.q0)) {
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
            e6 currentPeerView22 = jcVar.n0.getCurrentPeerView();
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.I0.y0) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.Components.pv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jc jcVar = this.I0;
        if (jcVar.b && !jcVar.c) {
            org.telegram.ui.ActionBar.n2 n2Var = this.H0;
            AndroidUtilities.requestAdjustResize(n2Var.getParentActivity(), n2Var.getClassGuid());
        }
        org.telegram.ui.Components.qc.a(this, new wb(this));
        NotificationCenter.getInstance(jcVar.h).addObserver(jcVar, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(jcVar.h).addObserver(jcVar, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(jcVar.h).addObserver(jcVar, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(jcVar.h).addObserver(jcVar, NotificationCenter.openArticle);
        NotificationCenter.getInstance(jcVar.h).addObserver(jcVar, NotificationCenter.storyDeleted);
    }

    @Override // org.telegram.ui.Components.pv0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.qc.h(this);
        jc jcVar = this.I0;
        NotificationCenter.getInstance(jcVar.h).removeObserver(jcVar, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(jcVar.h).removeObserver(jcVar, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(jcVar.h).removeObserver(jcVar, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(jcVar.h).removeObserver(jcVar, NotificationCenter.openArticle);
        NotificationCenter.getInstance(jcVar.h).removeObserver(jcVar, NotificationCenter.storyDeleted);
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01e8  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f7;
        r3 r3Var;
        ic icVar;
        e6 currentPeerView;
        boolean z10;
        a3.d dVar;
        d6 d6Var;
        e6 currentPeerView2;
        c6 c6Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        r3 r3Var2;
        jc jcVar = this.I0;
        d5 d5Var = jcVar.b1;
        if (motionEvent.getAction() == 0 && jcVar.U == 1.0f) {
            float x10 = motionEvent.getX();
            this.y0 = x10;
            this.w0 = x10;
            this.x0 = motionEvent.getY();
            jcVar.g0 = false;
            jcVar.f0 = (jcVar.I0 || jc.i(jcVar, jcVar.s, motionEvent.getX(), motionEvent.getY(), false)) ? false : true;
            jcVar.h0 = (jcVar.I0 || jc.i(jcVar, jcVar.s, motionEvent.getX(), motionEvent.getY(), true)) ? false : true;
            jcVar.K(jcVar.f0 && !jcVar.m1);
            e6 t10 = jcVar.t();
            if (jcVar.f0 && t10 != null && (r3Var2 = t10.L0) != null) {
                r3Var2.setAllowTouches(false);
            }
            if (jcVar.f0 && !jcVar.I0 && jcVar.m1) {
                a3.d dVar2 = new a3.d(this, 23);
                jcVar.n1 = dVar2;
                AndroidUtilities.runOnUIThread(dVar2, 150L);
            }
            if (jcVar.f0 && !jcVar.x && !jcVar.I0 && !jcVar.j1) {
                AndroidUtilities.runOnUIThread(d5Var, 400L);
            }
            f7 = 1.0f;
        } else if (motionEvent.getAction() == 2) {
            float abs = Math.abs(this.x0 - motionEvent.getY());
            float abs2 = Math.abs(this.w0 - motionEvent.getX());
            if (jcVar.a1 && jcVar.k0 && !jcVar.f1 && !jcVar.j0 && (d6Var = jcVar.G0) != null && ((ic) d6Var.c) != null && (currentPeerView2 = jcVar.n0.getCurrentPeerView()) != null && (c6Var = currentPeerView2.O1) != null && c6Var.b == null && c6Var.e) {
                long j3 = currentPeerView2.R2;
                if (j3 <= 0 && (storyItem = c6Var.a) != null && (messageMedia = storyItem.media) != null && (document = messageMedia.document) != null) {
                    j3 = (long) (MessageObject.getDocumentDuration(document) * 1000.0d);
                }
                if (j3 > 0) {
                    float x11 = motionEvent.getX();
                    ic icVar2 = (ic) jcVar.G0.c;
                    f7 = 1.0f;
                    if (((int) (icVar2.seek((x11 - this.y0) / AndroidUtilities.dp(220.0f), j3) * 10.0f)) != ((int) (icVar2.currentSeek * 10.0f))) {
                        try {
                            currentPeerView2.performHapticFeedback(9, 1);
                        } catch (Exception unused) {
                        }
                    }
                    currentPeerView2.c1.invalidate();
                    this.y0 = x11;
                    if (abs > abs2 && !jcVar.k0 && !jcVar.g0 && abs > AndroidUtilities.touchSlop * 2.0f) {
                        jcVar.g0 = true;
                    }
                    if (!jcVar.j0 && !jcVar.k0 && !jcVar.x && jcVar.h0) {
                        if (abs > abs2 && abs > AndroidUtilities.touchSlop * 2.0f) {
                            jcVar.j0 = true;
                            currentPeerView = jcVar.n0.getCurrentPeerView();
                            if (currentPeerView != null) {
                                currentPeerView.p0();
                            }
                            boolean z11 = currentPeerView == null && !currentPeerView.O1.f && (currentPeerView.C1 || (currentPeerView.D1 && currentPeerView.B3));
                            jcVar.l0 = (!z11 || currentPeerView == null || currentPeerView.D1 || currentPeerView.F1 || jcVar.u1 != null) ? false : true;
                            z10 = (z11 || currentPeerView.c3 || currentPeerView.O1.a == null || jcVar.u1 != null) ? false : true;
                            jcVar.c0 = z10;
                            if (z10 && this.f != 0) {
                                jcVar.c0 = false;
                            }
                            if (jcVar.c0) {
                                jcVar.p();
                            }
                            jcVar.Z = 0.0f;
                            dVar = jcVar.n1;
                            if (dVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(dVar);
                                jcVar.n1.run();
                                jcVar.n1 = null;
                            }
                            AndroidUtilities.cancelRunOnUIThread(d5Var);
                        }
                        jcVar.y();
                    }
                }
            }
            f7 = 1.0f;
            if (abs > abs2) {
                jcVar.g0 = true;
            }
            if (!jcVar.j0) {
                if (abs > abs2) {
                    jcVar.j0 = true;
                    currentPeerView = jcVar.n0.getCurrentPeerView();
                    if (currentPeerView != null) {
                    }
                    if (currentPeerView == null) {
                    }
                    jcVar.l0 = (!z11 || currentPeerView == null || currentPeerView.D1 || currentPeerView.F1 || jcVar.u1 != null) ? false : true;
                    if (z11) {
                    }
                    jcVar.c0 = z10;
                    if (z10) {
                        jcVar.c0 = false;
                    }
                    if (jcVar.c0) {
                    }
                    jcVar.Z = 0.0f;
                    dVar = jcVar.n1;
                    if (dVar != null) {
                    }
                    AndroidUtilities.cancelRunOnUIThread(d5Var);
                }
                jcVar.y();
            }
        } else {
            f7 = 1.0f;
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                AndroidUtilities.cancelRunOnUIThread(d5Var);
                a3.d dVar3 = jcVar.n1;
                if (dVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(dVar3);
                    jcVar.n1 = null;
                }
                jcVar.K(false);
                jcVar.g0 = false;
                jcVar.k0 = false;
                d6 d6Var2 = jcVar.G0;
                if (d6Var2 != null && (icVar = (ic) d6Var2.c) != null) {
                    icVar.setSeeking(false);
                }
                e6 t11 = jcVar.t();
                if (t11 != null && (r3Var = t11.L0) != null) {
                    r3Var.setAllowTouches(true);
                }
            }
        }
        s7 s7Var = jcVar.w;
        boolean z12 = s7Var != null && s7Var.f == f7;
        if (!jcVar.j0 && !z12) {
            jcVar.i0.onTouchEvent(motionEvent);
        }
        return jcVar.j0 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        jc jcVar = this.I0;
        ((FrameLayout.LayoutParams) jcVar.d1.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(2.0f);
        jcVar.d1.getLayoutParams().height = AndroidUtilities.dp(2.0f);
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        r3 r3Var;
        int action = motionEvent.getAction();
        jc jcVar = this.I0;
        int i10 = 1;
        if (action == 1 || motionEvent.getAction() == 3) {
            jcVar.j0 = false;
            jcVar.K(false);
            if (jcVar.V >= 1.0f) {
                jcVar.q(true);
            } else if (!jcVar.H0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(jcVar.W, 0.0f);
                jcVar.G = ofFloat;
                ofFloat.addUpdateListener(new ub(this, i10));
                jcVar.G.addListener(new vb(this, i10));
                jcVar.G.setDuration(150L);
                jcVar.G.setInterpolator(rr.f);
                jcVar.G.start();
            }
            e6 t10 = jcVar.t();
            if (t10 != null && (r3Var = t10.L0) != null) {
                r3Var.setAllowTouches(true);
            }
        }
        if (!jcVar.j0 && !jcVar.x && jcVar.Z == 0.0f && ((jcVar.e0 == 0.0f || (!jcVar.f0 && !jcVar.g0)) && !jcVar.j1)) {
            return false;
        }
        jcVar.i0.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        this.I0.f0 = false;
    }
}
