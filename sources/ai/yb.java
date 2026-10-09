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
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.sw0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class yb extends sw0 {
    public final Path A0;
    public final RectF B0;
    public final RectF C0;
    public final RectF D0;
    public final RectF E0;
    public final RectF F0;
    public final SparseArray G0;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 H0;
    public final /* synthetic */ kc I0;
    public float w0;
    public float x0;
    public float y0;
    public final float[] z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(kc kcVar, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null);
        this.I0 = kcVar;
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
    @Override // org.telegram.ui.Components.sw0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        boolean z10;
        int i10;
        b6 b6Var;
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
        da daVar;
        float f22;
        Paint paint;
        View view;
        da daVar2;
        fc fcVar;
        ec ecVar;
        f6 currentPeerView;
        b5 b5Var;
        da daVar3;
        int i12;
        f6 t10;
        gk0 gk0Var;
        boolean z11;
        float f23;
        kc kcVar = this.I0;
        RectF rectF5 = kcVar.T;
        hc hcVar = kcVar.s0;
        float f24 = 1.0f;
        canvas.drawColor(i0.a.k(-16777216, (int) ((((1.0f - kcVar.V) * 0.5f) + 0.5f) * kcVar.U * 255.0f)));
        int i13 = 0;
        if (kcVar.b) {
            boolean z12 = (1.0f - kcVar.V) * kcVar.U == 1.0f;
            if (kcVar.K0 != z12) {
                kcVar.K0 = z12;
                org.telegram.ui.ActionBar.n2 n2Var = this.H0;
                if (n2Var.getLayoutContainer() != null) {
                    n2Var.getLayoutContainer().invalidate();
                }
            }
        }
        f6 currentPeerView2 = kcVar.n0.getCurrentPeerView();
        RectF rectF6 = this.F0;
        RectF rectF7 = this.E0;
        if (currentPeerView2 != null) {
            b6 b6Var2 = currentPeerView2.o1;
            if (kcVar.V0) {
                b6Var2.a.getImageReceiver().setVisible(kcVar.U == 1.0f, true);
            } else {
                b6Var2.a.getImageReceiver().setVisible(true, false);
            }
            if (kcVar.h1) {
                kcVar.h1 = false;
                View view2 = b6Var2.a;
                z5 z5Var = b6Var2.a;
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
                        if (view2.getParent() != kcVar.n0) {
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
                rectF7.set(f25, f26, z5Var.getMeasuredWidth() + f25, z5Var.getMeasuredHeight() + f26);
                rectF6.set(0.0f, currentPeerView2.c1.getTop() + currentPeerView2.getTop(), kcVar.v.getMeasuredWidth(), kcVar.v.getMeasuredHeight());
                kcVar.v.getMatrix().mapRect(rectF7);
                kcVar.v.getMatrix().mapRect(rectF6);
            } else {
                f7 = 1.0f;
                f10 = 255.0f;
                z11 = true;
                i10 = 0;
            }
            b6Var = b6Var2;
            z10 = z11;
        } else {
            f7 = 1.0f;
            f10 = 255.0f;
            z10 = 1;
            i10 = 0;
            b6Var = null;
        }
        kcVar.d1.setAlpha(f7 - kcVar.V);
        if (kcVar.X == 0.0f) {
            float f27 = f7;
            f11 = f27 - Utilities.clamp(Math.abs(kcVar.W / getMeasuredHeight()), f27, 0.0f);
        } else {
            f11 = 1.0f;
        }
        kcVar.n0.setHorizontalProgressToDismiss((kcVar.X / kcVar.v.getMeasuredWidth()) * kcVar.U);
        if (kcVar.N != 0.0f || kcVar.O != 0.0f) {
            float f28 = kcVar.U;
            if (f28 != 1.0f) {
                if (kcVar.H0 && kcVar.V0) {
                    float clamp = 1.0f - Utilities.clamp(((1.0f - f28) - 0.8f) / 0.100000024f, 1.0f, 0.0f);
                    f12 = 0.15f;
                    f13 = Utilities.clamp(com.google.android.gms.internal.vision.e2.b(1.0f, clamp, 0.05f, f28), 1.0f, 0.0f);
                    i11 = 2;
                    kcVar.v.setAlpha(clamp);
                } else {
                    f12 = 0.15f;
                    i11 = 2;
                    kcVar.v.setAlpha(1.0f);
                    f13 = f28;
                }
                if (!kcVar.H0 || hcVar == null || hcVar.c == null) {
                    rectF = rectF7;
                } else {
                    zb zbVar = kcVar.v;
                    rectF = rectF7;
                    zbVar.setAlpha(zbVar.getAlpha() * ((float) Math.pow(f28, 0.20000000298023224d)));
                }
                zb zbVar2 = kcVar.v;
                float left = (kcVar.N - zbVar2.getLeft()) - (kcVar.v.getMeasuredWidth() / 2.0f);
                float f29 = kcVar.U;
                zbVar2.setTranslationX((kcVar.X * f29) + ((1.0f - f29) * left));
                zb zbVar3 = kcVar.v;
                float top = (kcVar.O - zbVar3.getTop()) - (kcVar.v.getMeasuredHeight() / 2.0f);
                float f30 = kcVar.U;
                zbVar3.setTranslationY((kcVar.W * f30) + ((1.0f - f30) * top));
                float lerp = AndroidUtilities.lerp(kcVar.R / kcVar.v.getMeasuredWidth(), (f11 * f12) + 0.85f, f13);
                kcVar.v.setScaleX(lerp);
                kcVar.v.setScaleY(lerp);
                Path path = this.A0;
                path.rewind();
                float f31 = kcVar.N;
                float f32 = kcVar.R / 2.0f;
                float f33 = kcVar.O;
                float f34 = kcVar.S / 2.0f;
                float f35 = f34 + f33;
                RectF rectF8 = this.B0;
                rectF8.set(f31 - f32, f33 - f34, f32 + f31, f35);
                boolean z13 = kcVar.H0;
                RectF rectF9 = this.C0;
                if (z13 && kcVar.V0) {
                    rectF9.set(rectF6);
                } else if (currentPeerView2 != null) {
                    rectF9.set(0.0f, currentPeerView2.c1.getTop() + kcVar.b0, getMeasuredWidth(), getMeasuredHeight() + kcVar.b0);
                } else {
                    rectF9.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                if (kcVar.H0 && kcVar.V0) {
                    rectF8.inset(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                }
                float lerp2 = AndroidUtilities.lerp(rectF8.centerX(), rectF9.centerX(), kcVar.U);
                float lerp3 = AndroidUtilities.lerp(rectF8.centerY(), rectF9.centerY(), kcVar.U);
                float lerp4 = AndroidUtilities.lerp(rectF8.height(), rectF9.height(), f13);
                float lerp5 = AndroidUtilities.lerp(rectF8.width(), rectF9.width(), f13);
                if (kcVar.H0 && kcVar.V0) {
                    f14 = lerp2;
                    rectF8.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
                } else {
                    f14 = lerp2;
                }
                RectF rectF10 = AndroidUtilities.rectTmp;
                float f36 = lerp5 / 2.0f;
                float f37 = lerp4 / 2.0f;
                rectF10.set(f14 - f36, lerp3 - f37, f14 + f36, lerp3 + f37);
                boolean z14 = kcVar.V0;
                float[] fArr2 = this.z0;
                if (z14) {
                    float lerp6 = AndroidUtilities.lerp(kcVar.R / 2.0f, 0.0f, f13);
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
                    int[] iArr = kcVar.W0;
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
                        f16 = kcVar.P;
                        if (f16 != f15 && kcVar.Q != f15) {
                            canvas.clipRect(f15, AndroidUtilities.lerp(f15, f16, (float) Math.pow(1.0f - kcVar.U, 0.4000000059604645d)), getMeasuredWidth(), AndroidUtilities.lerp(getMeasuredHeight(), kcVar.Q, 1.0f - kcVar.U));
                        }
                        if (hcVar == null && (daVar3 = hcVar.m) != null && daVar3.w && kcVar.V0) {
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
                        if (hcVar != null || hcVar.c == null || (currentPeerView = kcVar.n0.getCurrentPeerView()) == null || (b5Var = currentPeerView.c1) == null) {
                            f18 = f17;
                            f19 = f28;
                            rectF4 = rectF3;
                        } else {
                            boolean visible = hcVar.c.getVisible();
                            f18 = f17;
                            rectF9.set(b5Var.getX() + currentPeerView.getX() + kcVar.X + kcVar.v.getLeft(), b5Var.getY() + currentPeerView.getY() + kcVar.W + kcVar.v.getTop(), ((kcVar.X + kcVar.v.getRight()) - (kcVar.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - b5Var.getRight()), ((kcVar.W + kcVar.v.getBottom()) - (kcVar.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - b5Var.getBottom()));
                            AndroidUtilities.lerp(rectF3, rectF9, f28, rectF11);
                            float imageX = hcVar.c.getImageX();
                            float imageY = hcVar.c.getImageY();
                            float imageWidth = hcVar.c.getImageWidth();
                            float imageHeight = hcVar.c.getImageHeight();
                            hcVar.c.setImageCoords(rectF11);
                            float f38 = 1.0f - f28;
                            hcVar.c.setAlpha(f38);
                            f19 = f28;
                            rectF4 = rectF3;
                            hcVar.c.setVisible(z10, false);
                            int saveCount = canvas.getSaveCount();
                            ec ecVar2 = hcVar.f;
                            if (ecVar2 != null) {
                                ecVar2.g(f38, canvas, rectF11, kcVar.E);
                            }
                            hcVar.c.draw(canvas);
                            fc fcVar2 = hcVar.e;
                            if (fcVar2 != null) {
                                fcVar2.h(canvas, rectF11, f38);
                            }
                            hcVar.c.setVisible(visible, false);
                            hcVar.c.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                            canvas.restoreToCount(saveCount);
                        }
                        canvas.restore();
                        if (b6Var != null) {
                            z5 z5Var2 = b6Var.a;
                            float f39 = kcVar.X;
                            float f40 = kcVar.W;
                            if (kcVar.H0 && kcVar.V0) {
                                rectF9.set(rectF);
                            } else {
                                for (View view3 = z5Var2; view3 != this && view3 != null; view3 = (View) view3.getParent()) {
                                    if (view3.getParent() == this) {
                                        f39 += view3.getLeft();
                                        f40 += view3.getTop();
                                    } else if (view3.getParent() != kcVar.n0) {
                                        float x10 = view3.getX() + f39;
                                        f40 = view3.getY() + f40;
                                        f39 = x10;
                                    }
                                    if (!(view3.getParent() instanceof View)) {
                                        break;
                                    }
                                }
                                rectF9.set(f39, f40, z5Var2.getMeasuredWidth() + f39, z5Var2.getMeasuredHeight() + f40);
                            }
                            AndroidUtilities.lerp(rectF4, rectF9, kcVar.U, rectF11);
                            int saveCount2 = canvas.getSaveCount();
                            if (hcVar != null && (ecVar = hcVar.f) != null) {
                                ecVar.g(1.0f - f19, canvas, rectF11, kcVar.E);
                            }
                            if (kcVar.V0) {
                                boolean z15 = (hcVar == null || hcVar.l == null) ? false : true;
                                if (z15 && kcVar.U == f18) {
                                    f20 = f19;
                                } else {
                                    if (hcVar != null && (daVar2 = hcVar.m) != null && daVar2.w) {
                                        canvas.saveLayerAlpha(rectF11.left - AndroidUtilities.dp(4.0f), rectF11.top - AndroidUtilities.dp(4.0f), rectF11.right + AndroidUtilities.dp(4.0f), rectF11.bottom + AndroidUtilities.dp(4.0f), 255, 31);
                                    }
                                    z5Var2.getImageReceiver().setImageCoords(rectF11);
                                    z5Var2.getImageReceiver().setRoundRadius((int) AndroidUtilities.lerp(rectF11.width() / 2.0f, ((hcVar == null || hcVar.b == null) ? null : Integer.valueOf((int) (hcVar.b.getRoundRadius()[0] * ((!hcVar.n || (view = hcVar.a) == null || view.getParent() == null) ? 1.0f : ((ViewGroup) hcVar.a.getParent()).getScaleY())))) != null ? r4.intValue() : rectF11.width() / 2.0f, 1.0f - kcVar.U));
                                    z5Var2.getImageReceiver().setVisible(true, false);
                                    float f41 = z15 ? kcVar.U : 1.0f;
                                    if (hcVar == null || hcVar.k >= 1.0f || (paint = hcVar.j) == null) {
                                        f20 = f19;
                                        f21 = f41;
                                    } else {
                                        paint.setAlpha((int) ((1.0f - f19) * f10));
                                        canvas.drawCircle(rectF11.centerX(), rectF11.centerY(), rectF11.width() / 2.0f, hcVar.j);
                                        f20 = f19;
                                        f21 = AndroidUtilities.lerp(hcVar.k, f41, f20);
                                    }
                                    z5Var2.getImageReceiver().setAlpha(f21);
                                    b6Var.b(kcVar.U, canvas, rectF11, !kc.A1);
                                    z5Var2.getImageReceiver().draw(canvas);
                                    z5Var2.getImageReceiver().setAlpha(f41);
                                    z5Var2.getImageReceiver().setVisible(false, false);
                                    if (hcVar != null && (daVar = hcVar.m) != null && daVar.w) {
                                        RectF rectF12 = AndroidUtilities.rectTmp;
                                        rectF12.set(rectF11);
                                        f22 = 1.0f;
                                        ja.k(canvas, rectF12, 1.0f - kcVar.U, true, f18);
                                        canvas.restore();
                                        if (kcVar.U != f22 && z15) {
                                            RectF rectF13 = rectF2;
                                            rectF13.set(hcVar.l.getImageX(), hcVar.l.getImageY(), hcVar.l.getImageX2(), hcVar.l.getImageY2());
                                            int i15 = hcVar.l.getRoundRadius()[0];
                                            boolean visible2 = hcVar.l.getVisible();
                                            hcVar.l.setImageCoords(rectF11);
                                            hcVar.l.setRoundRadius((int) (rectF11.width() / 2.0f));
                                            hcVar.l.setVisible(true, false);
                                            canvas.saveLayerAlpha(rectF11, (int) ((1.0f - kcVar.U) * f10), 31);
                                            hcVar.l.draw(canvas);
                                            canvas.restore();
                                            hcVar.l.setVisible(visible2, false);
                                            hcVar.l.setImageCoords(rectF13);
                                            hcVar.l.setRoundRadius(i15);
                                        }
                                        if (hcVar != null && (fcVar = hcVar.e) != null) {
                                            fcVar.h(canvas, rectF11, 1.0f - f20);
                                        }
                                    }
                                }
                                f22 = 1.0f;
                                if (kcVar.U != f22) {
                                    RectF rectF132 = rectF2;
                                    rectF132.set(hcVar.l.getImageX(), hcVar.l.getImageY(), hcVar.l.getImageX2(), hcVar.l.getImageY2());
                                    int i152 = hcVar.l.getRoundRadius()[0];
                                    boolean visible22 = hcVar.l.getVisible();
                                    hcVar.l.setImageCoords(rectF11);
                                    hcVar.l.setRoundRadius((int) (rectF11.width() / 2.0f));
                                    hcVar.l.setVisible(true, false);
                                    canvas.saveLayerAlpha(rectF11, (int) ((1.0f - kcVar.U) * f10), 31);
                                    hcVar.l.draw(canvas);
                                    canvas.restore();
                                    hcVar.l.setVisible(visible22, false);
                                    hcVar.l.setImageCoords(rectF132);
                                    hcVar.l.setRoundRadius(i152);
                                }
                                if (hcVar != null) {
                                    fcVar.h(canvas, rectF11, 1.0f - f20);
                                }
                            }
                            canvas.restoreToCount(saveCount2);
                        }
                        if (kcVar.M != null) {
                            float clamp2 = Utilities.clamp(kcVar.U / 0.4f, 1.0f, 0.0f);
                            if (clamp2 != 1.0f) {
                                RectF rectF14 = AndroidUtilities.rectTmp;
                                float f42 = kcVar.N;
                                float f43 = kcVar.O;
                                rectF14.set(f42, f43, kcVar.R + f42, kcVar.S + f43);
                                rectF14.inset(-AndroidUtilities.dp(16.0f), -AndroidUtilities.dp(16.0f));
                                if (clamp2 != 0.0f) {
                                    canvas.saveLayerAlpha(rectF14, (int) ((1.0f - clamp2) * f10), 31);
                                } else {
                                    canvas.save();
                                }
                                canvas.translate(kcVar.K, kcVar.L);
                                ((org.telegram.ui.Cells.s2) kcVar.M).C(canvas);
                                canvas.restore();
                            }
                        }
                        canvas.restore();
                        if (kc.A1) {
                            ArrayList arrayList = kcVar.x0;
                            kcVar.Q();
                            kcVar.U = 0.0f;
                            kcVar.M(true);
                            kcVar.d = false;
                            kc.x1 = true;
                            kcVar.b0 = kcVar.W;
                            if (hcVar.d != null && (t10 = kcVar.t()) != null && (gk0Var = t10.o1.d) != null) {
                                gk0 gk0Var2 = hcVar.d;
                                gk0Var.c = gk0Var2.c;
                                gk0Var.f = gk0Var2.f;
                                gk0Var.b = gk0Var2.b;
                                gk0Var.a = System.currentTimeMillis();
                                gk0Var.c();
                            }
                            kcVar.E = true;
                            float[] fArr3 = new float[i11];
                            // fill-array-data instruction
                            fArr3[0] = 0.0f;
                            fArr3[1] = 1.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr3);
                            kcVar.F = ofFloat;
                            ofFloat.addUpdateListener(new rb(kcVar, 1));
                            kcVar.J0.lock();
                            zb zbVar4 = kcVar.v;
                            if (zbVar4 != null) {
                                i0.c = true;
                                i12 = 2;
                                zbVar4.setLayerType(2, null);
                            } else {
                                i12 = 2;
                            }
                            kcVar.F.addListener(new tb(kcVar, i12));
                            kcVar.F.setStartDelay(40L);
                            kcVar.F.setDuration(250L);
                            kcVar.F.setInterpolator(hs.f);
                            kcVar.F.start();
                            if (!arrayList.isEmpty()) {
                                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                    ((Runnable) arrayList.get(i16)).run();
                                }
                                arrayList.clear();
                            }
                            kc.A1 = false;
                            return;
                        }
                        return;
                    }
                    int i17 = i10;
                    float lerp7 = AndroidUtilities.lerp(iArr[i10], i17, f28);
                    fArr[z10] = lerp7;
                    fArr[i17] = lerp7;
                    float lerp8 = AndroidUtilities.lerp(kcVar.W0[z10], i17, f28);
                    fArr[3] = lerp8;
                    fArr[i11] = lerp8;
                    float lerp9 = AndroidUtilities.lerp(kcVar.W0[i11], i17, f28);
                    fArr[5] = lerp9;
                    fArr[4] = lerp9;
                    float lerp10 = AndroidUtilities.lerp(kcVar.W0[3], i17, f28);
                    fArr[7] = lerp10;
                    fArr[6] = lerp10;
                }
                f15 = 0.0f;
                path.addRoundRect(rectF10, fArr, Path.Direction.CCW);
                canvas.save();
                f16 = kcVar.P;
                if (f16 != f15) {
                    canvas.clipRect(f15, AndroidUtilities.lerp(f15, f16, (float) Math.pow(1.0f - kcVar.U, 0.4000000059604645d)), getMeasuredWidth(), AndroidUtilities.lerp(getMeasuredHeight(), kcVar.Q, 1.0f - kcVar.U));
                }
                if (hcVar == null) {
                }
                rectF2 = rectF5;
                f17 = f15;
                rectF3 = rectF8;
                canvas.save();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                RectF rectF112 = this.D0;
                if (hcVar != null) {
                }
                f18 = f17;
                f19 = f28;
                rectF4 = rectF3;
                canvas.restore();
                if (b6Var != null) {
                }
                if (kcVar.M != null) {
                }
                canvas.restore();
                if (kc.A1) {
                }
            }
        }
        kcVar.v.setAlpha(kcVar.U);
        float f44 = (f11 * 0.15f) + (kcVar.U * 0.1f) + 0.75f;
        kcVar.v.setScaleX(f44);
        kcVar.v.setScaleY(f44);
        kcVar.v.setTranslationY(kcVar.W);
        kcVar.v.setTranslationX(kcVar.X);
        super.dispatchDraw(canvas);
        i11 = 2;
        if (kc.A1) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        kc kcVar = this.I0;
        if (keyCode == 24 || keyEvent.getKeyCode() == 25) {
            kcVar.r(keyEvent);
            return true;
        }
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        kcVar.onAttachedBackPressed();
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
        ac acVar;
        int i10;
        kl0 kl0Var;
        kc kcVar = this.I0;
        float[] fArr = kcVar.o0;
        f6 currentPeerView = kcVar.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            h5 h5Var = currentPeerView.K0;
            if (h5Var.W.x()) {
                float x10 = currentPeerView.getX();
                float y3 = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x10, -y3);
                if (!h5Var.W.n(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x10, y3);
                }
                return true;
            }
        }
        float f7 = 0.0f;
        int i11 = 0;
        if (kcVar.p1 && currentPeerView != null && (kl0Var = currentPeerView.r3) != null) {
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
            kl0Var.getHitRect(rect);
            rect.offset((int) f7, (int) f10);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.b1(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            kl0Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            kcVar.j0 = false;
            AndroidUtilities.cancelRunOnUIThread(kcVar.b1);
            float f11 = kcVar.X;
            if (f11 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                kcVar.G = ofFloat;
                ofFloat.addUpdateListener(new vb(this, i11));
                kcVar.G.addListener(new wb(this, i11));
                kcVar.G.setDuration(250L);
                kcVar.G.setInterpolator(hs.f);
                kcVar.G.start();
            }
            if (kcVar.V >= 0.3f) {
                kcVar.q(true);
            }
            kcVar.K(false);
            kcVar.L(false);
            z10 = true;
        } else {
            z10 = false;
        }
        if (motionEvent.getAction() == 0) {
            kcVar.a0 = false;
            if (currentPeerView != null) {
                x5 x5Var = currentPeerView.y0;
                ob obVar = currentPeerView.C0;
                b5 b5Var = currentPeerView.c1;
                ci.d4 d4Var = currentPeerView.F0;
                if (d4Var != null && d4Var.V && obVar != null && !d4Var.r0.contains(motionEvent.getX() - (currentPeerView.F0.getX() + (b5Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.F0.getY() + (b5Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, obVar)) {
                    currentPeerView.F0.e(true);
                }
                ci.d4 d4Var2 = currentPeerView.G0;
                if (d4Var2 != null && d4Var2.V && x5Var != null && !d4Var2.r0.contains(motionEvent.getX() - (currentPeerView.G0.getX() + (b5Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.G0.getY() + (b5Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, x5Var)) {
                    currentPeerView.G0.e(true);
                }
            }
            kcVar.n0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        boolean z12 = (kcVar.x || kcVar.H0 || kcVar.I0) ? false : true;
        float f12 = kcVar.e0;
        SparseArray sparseArray = this.G0;
        if (f12 == 0.0f && !kcVar.j0 && kcVar.n0.F0 == 1 && motionEvent.getAction() == 2 && z12) {
            float floatValue = ((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0);
            if ((floatValue != 0.0f && (((i10 = (acVar = kcVar.n0).I0) == 0 && acVar.K0 == 0.0f && floatValue < 0.0f) || (i10 == acVar.getAdapter().b() - 1 && acVar.K0 == 0.0f && floatValue > 0.0f))) || kcVar.X != 0.0f) {
                float f13 = kcVar.X;
                if (f13 == 0.0f) {
                    kcVar.Y = -floatValue;
                }
                if ((floatValue < 0.0f && kcVar.Y > 0.0f) || (floatValue > 0.0f && kcVar.Y < 0.0f)) {
                    floatValue *= 0.2f;
                }
                kcVar.X = f13 - floatValue;
                kc.k(kcVar);
                float f14 = kcVar.X;
                if ((f14 > 0.0f && kcVar.Y < 0.0f) || (f14 < 0.0f && kcVar.Y > 0.0f)) {
                    kcVar.X = 0.0f;
                }
                z11 = true;
                if (currentPeerView != null && kcVar.e0 == 0.0f && !kcVar.j0 && !kcVar.L0 && !kcVar.I0 && kcVar.n0.F0 != 1) {
                    AndroidUtilities.getViewPositionInParent(currentPeerView.c1, this, fArr);
                    motionEvent.offsetLocation(-fArr[0], -fArr[1]);
                    f6 currentPeerView2 = kcVar.n0.getCurrentPeerView();
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
                        if (kcVar.e0 != 0.0f && !kcVar.g1 && kcVar.p0 < AndroidUtilities.dp(20.0f)) {
                            kcVar.n(kcVar.w.f > 0.5f);
                        }
                        f6 t10 = kcVar.t();
                        if (t10 != null) {
                            t10.K0.w0 = false;
                        }
                    }
                    if (z10 && !kcVar.a0) {
                        kcVar.m();
                    }
                    if (!dispatchTouchEvent && (!kc.x1 || !kcVar.q0)) {
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
            f6 currentPeerView22 = kcVar.n0.getCurrentPeerView();
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

    @Override // org.telegram.ui.Components.sw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kc kcVar = this.I0;
        if (kcVar.b && !kcVar.c) {
            org.telegram.ui.ActionBar.n2 n2Var = this.H0;
            AndroidUtilities.requestAdjustResize(n2Var.getParentActivity(), n2Var.getClassGuid());
        }
        org.telegram.ui.Components.tc.a(this, new xb(this));
        NotificationCenter.getInstance(kcVar.h).addObserver(kcVar, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(kcVar.h).addObserver(kcVar, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(kcVar.h).addObserver(kcVar, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(kcVar.h).addObserver(kcVar, NotificationCenter.openArticle);
        NotificationCenter.getInstance(kcVar.h).addObserver(kcVar, NotificationCenter.storyDeleted);
    }

    @Override // org.telegram.ui.Components.sw0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.tc.h(this);
        kc kcVar = this.I0;
        NotificationCenter.getInstance(kcVar.h).removeObserver(kcVar, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(kcVar.h).removeObserver(kcVar, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(kcVar.h).removeObserver(kcVar, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(kcVar.h).removeObserver(kcVar, NotificationCenter.openArticle);
        NotificationCenter.getInstance(kcVar.h).removeObserver(kcVar, NotificationCenter.storyDeleted);
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
        s3 s3Var;
        jc jcVar;
        f6 currentPeerView;
        boolean z10;
        a3.d dVar;
        e6 e6Var;
        f6 currentPeerView2;
        d6 d6Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        s3 s3Var2;
        kc kcVar = this.I0;
        e5 e5Var = kcVar.b1;
        if (motionEvent.getAction() == 0 && kcVar.U == 1.0f) {
            float x10 = motionEvent.getX();
            this.y0 = x10;
            this.w0 = x10;
            this.x0 = motionEvent.getY();
            kcVar.g0 = false;
            kcVar.f0 = (kcVar.I0 || kc.i(kcVar, kcVar.s, motionEvent.getX(), motionEvent.getY(), false)) ? false : true;
            kcVar.h0 = (kcVar.I0 || kc.i(kcVar, kcVar.s, motionEvent.getX(), motionEvent.getY(), true)) ? false : true;
            kcVar.K(kcVar.f0 && !kcVar.m1);
            f6 t10 = kcVar.t();
            if (kcVar.f0 && t10 != null && (s3Var2 = t10.L0) != null) {
                s3Var2.setAllowTouches(false);
            }
            if (kcVar.f0 && !kcVar.I0 && kcVar.m1) {
                a3.d dVar2 = new a3.d(this, 23);
                kcVar.n1 = dVar2;
                AndroidUtilities.runOnUIThread(dVar2, 150L);
            }
            if (kcVar.f0 && !kcVar.x && !kcVar.I0 && !kcVar.j1) {
                AndroidUtilities.runOnUIThread(e5Var, 400L);
            }
            f7 = 1.0f;
        } else if (motionEvent.getAction() == 2) {
            float abs = Math.abs(this.x0 - motionEvent.getY());
            float abs2 = Math.abs(this.w0 - motionEvent.getX());
            if (kcVar.a1 && kcVar.k0 && !kcVar.f1 && !kcVar.j0 && (e6Var = kcVar.G0) != null && ((jc) e6Var.c) != null && (currentPeerView2 = kcVar.n0.getCurrentPeerView()) != null && (d6Var = currentPeerView2.O1) != null && d6Var.b == null && d6Var.e) {
                long j3 = currentPeerView2.R2;
                if (j3 <= 0 && (storyItem = d6Var.a) != null && (messageMedia = storyItem.media) != null && (document = messageMedia.document) != null) {
                    j3 = (long) (MessageObject.getDocumentDuration(document) * 1000.0d);
                }
                if (j3 > 0) {
                    float x11 = motionEvent.getX();
                    jc jcVar2 = (jc) kcVar.G0.c;
                    f7 = 1.0f;
                    if (((int) (jcVar2.seek((x11 - this.y0) / AndroidUtilities.dp(220.0f), j3) * 10.0f)) != ((int) (jcVar2.currentSeek * 10.0f))) {
                        try {
                            currentPeerView2.performHapticFeedback(9, 1);
                        } catch (Exception unused) {
                        }
                    }
                    currentPeerView2.c1.invalidate();
                    this.y0 = x11;
                    if (abs > abs2 && !kcVar.k0 && !kcVar.g0 && abs > AndroidUtilities.touchSlop * 2.0f) {
                        kcVar.g0 = true;
                    }
                    if (!kcVar.j0 && !kcVar.k0 && !kcVar.x && kcVar.h0) {
                        if (abs > abs2 && abs > AndroidUtilities.touchSlop * 2.0f) {
                            kcVar.j0 = true;
                            currentPeerView = kcVar.n0.getCurrentPeerView();
                            if (currentPeerView != null) {
                                currentPeerView.p0();
                            }
                            boolean z11 = currentPeerView == null && !currentPeerView.O1.f && (currentPeerView.C1 || (currentPeerView.D1 && currentPeerView.B3));
                            kcVar.l0 = (!z11 || currentPeerView == null || currentPeerView.D1 || currentPeerView.F1 || kcVar.u1 != null) ? false : true;
                            z10 = (z11 || currentPeerView.c3 || currentPeerView.O1.a == null || kcVar.u1 != null) ? false : true;
                            kcVar.c0 = z10;
                            if (z10 && this.f != 0) {
                                kcVar.c0 = false;
                            }
                            if (kcVar.c0) {
                                kcVar.p();
                            }
                            kcVar.Z = 0.0f;
                            dVar = kcVar.n1;
                            if (dVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(dVar);
                                kcVar.n1.run();
                                kcVar.n1 = null;
                            }
                            AndroidUtilities.cancelRunOnUIThread(e5Var);
                        }
                        kcVar.y();
                    }
                }
            }
            f7 = 1.0f;
            if (abs > abs2) {
                kcVar.g0 = true;
            }
            if (!kcVar.j0) {
                if (abs > abs2) {
                    kcVar.j0 = true;
                    currentPeerView = kcVar.n0.getCurrentPeerView();
                    if (currentPeerView != null) {
                    }
                    if (currentPeerView == null) {
                    }
                    kcVar.l0 = (!z11 || currentPeerView == null || currentPeerView.D1 || currentPeerView.F1 || kcVar.u1 != null) ? false : true;
                    if (z11) {
                    }
                    kcVar.c0 = z10;
                    if (z10) {
                        kcVar.c0 = false;
                    }
                    if (kcVar.c0) {
                    }
                    kcVar.Z = 0.0f;
                    dVar = kcVar.n1;
                    if (dVar != null) {
                    }
                    AndroidUtilities.cancelRunOnUIThread(e5Var);
                }
                kcVar.y();
            }
        } else {
            f7 = 1.0f;
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                AndroidUtilities.cancelRunOnUIThread(e5Var);
                a3.d dVar3 = kcVar.n1;
                if (dVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(dVar3);
                    kcVar.n1 = null;
                }
                kcVar.K(false);
                kcVar.g0 = false;
                kcVar.k0 = false;
                e6 e6Var2 = kcVar.G0;
                if (e6Var2 != null && (jcVar = (jc) e6Var2.c) != null) {
                    jcVar.setSeeking(false);
                }
                f6 t11 = kcVar.t();
                if (t11 != null && (s3Var = t11.L0) != null) {
                    s3Var.setAllowTouches(true);
                }
            }
        }
        t7 t7Var = kcVar.w;
        boolean z12 = t7Var != null && t7Var.f == f7;
        if (!kcVar.j0 && !z12) {
            kcVar.i0.onTouchEvent(motionEvent);
        }
        return kcVar.j0 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        kc kcVar = this.I0;
        ((FrameLayout.LayoutParams) kcVar.d1.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(2.0f);
        kcVar.d1.getLayoutParams().height = AndroidUtilities.dp(2.0f);
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s3 s3Var;
        int action = motionEvent.getAction();
        kc kcVar = this.I0;
        int i10 = 1;
        if (action == 1 || motionEvent.getAction() == 3) {
            kcVar.j0 = false;
            kcVar.K(false);
            if (kcVar.V >= 1.0f) {
                kcVar.q(true);
            } else if (!kcVar.H0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(kcVar.W, 0.0f);
                kcVar.G = ofFloat;
                ofFloat.addUpdateListener(new vb(this, i10));
                kcVar.G.addListener(new wb(this, i10));
                kcVar.G.setDuration(150L);
                kcVar.G.setInterpolator(hs.f);
                kcVar.G.start();
            }
            f6 t10 = kcVar.t();
            if (t10 != null && (s3Var = t10.L0) != null) {
                s3Var.setAllowTouches(true);
            }
        }
        if (!kcVar.j0 && !kcVar.x && kcVar.Z == 0.0f && ((kcVar.e0 == 0.0f || (!kcVar.f0 && !kcVar.g0)) && !kcVar.j1)) {
            return false;
        }
        kcVar.i0.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        this.I0.f0 = false;
    }
}
