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
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class n9 extends ow0 {
    public final Path A0;
    public final RectF B0;
    public final RectF C0;
    public final RectF D0;
    public final RectF E0;
    public final RectF F0;
    public final SparseArray G0;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 H0;
    public final /* synthetic */ z9 I0;
    public float w0;
    public float x0;
    public float y0;
    public final float[] z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(z9 z9Var, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, null);
        this.I0 = z9Var;
        this.H0 = o2Var;
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
    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        boolean z10;
        int i10;
        l4 l4Var;
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
        x7 x7Var;
        float f22;
        Paint paint;
        View view;
        x7 x7Var2;
        u9 u9Var;
        t9 t9Var;
        p4 currentPeerView;
        q3 q3Var;
        x7 x7Var3;
        int i12;
        p4 t10;
        ck0 ck0Var;
        boolean z11;
        float f23;
        z9 z9Var = this.I0;
        RectF rectF5 = z9Var.T;
        w9 w9Var = z9Var.s0;
        float f24 = 1.0f;
        canvas.drawColor(i0.a.o(-16777216, (int) ((((1.0f - z9Var.V) * 0.5f) + 0.5f) * z9Var.U * 255.0f)));
        int i13 = 0;
        if (z9Var.b) {
            boolean z12 = (1.0f - z9Var.V) * z9Var.U == 1.0f;
            if (z9Var.K0 != z12) {
                z9Var.K0 = z12;
                org.telegram.ui.ActionBar.o2 o2Var = this.H0;
                if (o2Var.getLayoutContainer() != null) {
                    o2Var.getLayoutContainer().invalidate();
                }
            }
        }
        p4 currentPeerView2 = z9Var.n0.getCurrentPeerView();
        RectF rectF6 = this.F0;
        RectF rectF7 = this.E0;
        if (currentPeerView2 != null) {
            l4 l4Var2 = currentPeerView2.o1;
            if (z9Var.V0) {
                l4Var2.a.getImageReceiver().setVisible(z9Var.U == 1.0f, true);
            } else {
                l4Var2.a.getImageReceiver().setVisible(true, false);
            }
            if (z9Var.h1) {
                z9Var.h1 = false;
                View view2 = l4Var2.a;
                j4 j4Var = l4Var2.a;
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
                        if (view2.getParent() != z9Var.n0) {
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
                rectF7.set(f25, f26, j4Var.getMeasuredWidth() + f25, j4Var.getMeasuredHeight() + f26);
                rectF6.set(0.0f, currentPeerView2.c1.getTop() + currentPeerView2.getTop(), z9Var.v.getMeasuredWidth(), z9Var.v.getMeasuredHeight());
                z9Var.v.getMatrix().mapRect(rectF7);
                z9Var.v.getMatrix().mapRect(rectF6);
            } else {
                f7 = 1.0f;
                f10 = 255.0f;
                z11 = true;
                i10 = 0;
            }
            l4Var = l4Var2;
            z10 = z11;
        } else {
            f7 = 1.0f;
            f10 = 255.0f;
            z10 = 1;
            i10 = 0;
            l4Var = null;
        }
        z9Var.d1.setAlpha(f7 - z9Var.V);
        if (z9Var.X == 0.0f) {
            float f27 = f7;
            f11 = f27 - Utilities.clamp(Math.abs(z9Var.W / getMeasuredHeight()), f27, 0.0f);
        } else {
            f11 = 1.0f;
        }
        z9Var.n0.setHorizontalProgressToDismiss((z9Var.X / z9Var.v.getMeasuredWidth()) * z9Var.U);
        if (z9Var.N != 0.0f || z9Var.O != 0.0f) {
            float f28 = z9Var.U;
            if (f28 != 1.0f) {
                if (z9Var.H0 && z9Var.V0) {
                    float clamp = 1.0f - Utilities.clamp(((1.0f - f28) - 0.8f) / 0.100000024f, 1.0f, 0.0f);
                    f12 = 0.15f;
                    f13 = Utilities.clamp(com.google.android.gms.internal.play_billing.k3.D(1.0f, clamp, 0.05f, f28), 1.0f, 0.0f);
                    i11 = 2;
                    z9Var.v.setAlpha(clamp);
                } else {
                    f12 = 0.15f;
                    i11 = 2;
                    z9Var.v.setAlpha(1.0f);
                    f13 = f28;
                }
                if (!z9Var.H0 || w9Var == null || w9Var.c == null) {
                    rectF = rectF7;
                } else {
                    o9 o9Var = z9Var.v;
                    rectF = rectF7;
                    o9Var.setAlpha(o9Var.getAlpha() * ((float) Math.pow(f28, 0.20000000298023224d)));
                }
                o9 o9Var2 = z9Var.v;
                float left = (z9Var.N - o9Var2.getLeft()) - (z9Var.v.getMeasuredWidth() / 2.0f);
                float f29 = z9Var.U;
                o9Var2.setTranslationX((z9Var.X * f29) + ((1.0f - f29) * left));
                o9 o9Var3 = z9Var.v;
                float top = (z9Var.O - o9Var3.getTop()) - (z9Var.v.getMeasuredHeight() / 2.0f);
                float f30 = z9Var.U;
                o9Var3.setTranslationY((z9Var.W * f30) + ((1.0f - f30) * top));
                float lerp = AndroidUtilities.lerp(z9Var.R / z9Var.v.getMeasuredWidth(), (f11 * f12) + 0.85f, f13);
                z9Var.v.setScaleX(lerp);
                z9Var.v.setScaleY(lerp);
                Path path = this.A0;
                path.rewind();
                float f31 = z9Var.N;
                float f32 = z9Var.R / 2.0f;
                float f33 = z9Var.O;
                float f34 = z9Var.S / 2.0f;
                float f35 = f34 + f33;
                RectF rectF8 = this.B0;
                rectF8.set(f31 - f32, f33 - f34, f32 + f31, f35);
                boolean z13 = z9Var.H0;
                RectF rectF9 = this.C0;
                if (z13 && z9Var.V0) {
                    rectF9.set(rectF6);
                } else if (currentPeerView2 != null) {
                    rectF9.set(0.0f, currentPeerView2.c1.getTop() + z9Var.b0, getMeasuredWidth(), getMeasuredHeight() + z9Var.b0);
                } else {
                    rectF9.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                if (z9Var.H0 && z9Var.V0) {
                    rectF8.inset(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                }
                float lerp2 = AndroidUtilities.lerp(rectF8.centerX(), rectF9.centerX(), z9Var.U);
                float lerp3 = AndroidUtilities.lerp(rectF8.centerY(), rectF9.centerY(), z9Var.U);
                float lerp4 = AndroidUtilities.lerp(rectF8.height(), rectF9.height(), f13);
                float lerp5 = AndroidUtilities.lerp(rectF8.width(), rectF9.width(), f13);
                if (z9Var.H0 && z9Var.V0) {
                    f14 = lerp2;
                    rectF8.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
                } else {
                    f14 = lerp2;
                }
                RectF rectF10 = AndroidUtilities.rectTmp;
                float f36 = lerp5 / 2.0f;
                float f37 = lerp4 / 2.0f;
                rectF10.set(f14 - f36, lerp3 - f37, f14 + f36, lerp3 + f37);
                boolean z14 = z9Var.V0;
                float[] fArr2 = this.z0;
                if (z14) {
                    float lerp6 = AndroidUtilities.lerp(z9Var.R / 2.0f, 0.0f, f13);
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
                    int[] iArr = z9Var.W0;
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
                        f16 = z9Var.P;
                        if (f16 != f15 && z9Var.Q != f15) {
                            canvas.clipRect(f15, AndroidUtilities.lerp(f15, f16, (float) Math.pow(1.0f - z9Var.U, 0.4000000059604645d)), getMeasuredWidth(), AndroidUtilities.lerp(getMeasuredHeight(), z9Var.Q, 1.0f - z9Var.U));
                        }
                        if (w9Var == null && (x7Var3 = w9Var.m) != null && x7Var3.w && z9Var.V0) {
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
                        if (w9Var != null || w9Var.c == null || (currentPeerView = z9Var.n0.getCurrentPeerView()) == null || (q3Var = currentPeerView.c1) == null) {
                            f18 = f17;
                            f19 = f28;
                            rectF4 = rectF3;
                        } else {
                            boolean visible = w9Var.c.getVisible();
                            f18 = f17;
                            rectF9.set(q3Var.getX() + currentPeerView.getX() + z9Var.X + z9Var.v.getLeft(), q3Var.getY() + currentPeerView.getY() + z9Var.W + z9Var.v.getTop(), ((z9Var.X + z9Var.v.getRight()) - (z9Var.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - q3Var.getRight()), ((z9Var.W + z9Var.v.getBottom()) - (z9Var.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - q3Var.getBottom()));
                            AndroidUtilities.lerp(rectF3, rectF9, f28, rectF11);
                            float imageX = w9Var.c.getImageX();
                            float imageY = w9Var.c.getImageY();
                            float imageWidth = w9Var.c.getImageWidth();
                            float imageHeight = w9Var.c.getImageHeight();
                            w9Var.c.setImageCoords(rectF11);
                            float f38 = 1.0f - f28;
                            w9Var.c.setAlpha(f38);
                            f19 = f28;
                            rectF4 = rectF3;
                            w9Var.c.setVisible(z10, false);
                            int saveCount = canvas.getSaveCount();
                            t9 t9Var2 = w9Var.f;
                            if (t9Var2 != null) {
                                t9Var2.e(f38, canvas, rectF11, z9Var.E);
                            }
                            w9Var.c.draw(canvas);
                            u9 u9Var2 = w9Var.e;
                            if (u9Var2 != null) {
                                u9Var2.j(canvas, rectF11, f38);
                            }
                            w9Var.c.setVisible(visible, false);
                            w9Var.c.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                            canvas.restoreToCount(saveCount);
                        }
                        canvas.restore();
                        if (l4Var != null) {
                            j4 j4Var2 = l4Var.a;
                            float f39 = z9Var.X;
                            float f40 = z9Var.W;
                            if (z9Var.H0 && z9Var.V0) {
                                rectF9.set(rectF);
                            } else {
                                for (View view3 = j4Var2; view3 != this && view3 != null; view3 = (View) view3.getParent()) {
                                    if (view3.getParent() == this) {
                                        f39 += view3.getLeft();
                                        f40 += view3.getTop();
                                    } else if (view3.getParent() != z9Var.n0) {
                                        float x10 = view3.getX() + f39;
                                        f40 = view3.getY() + f40;
                                        f39 = x10;
                                    }
                                    if (!(view3.getParent() instanceof View)) {
                                        break;
                                    }
                                }
                                rectF9.set(f39, f40, j4Var2.getMeasuredWidth() + f39, j4Var2.getMeasuredHeight() + f40);
                            }
                            AndroidUtilities.lerp(rectF4, rectF9, z9Var.U, rectF11);
                            int saveCount2 = canvas.getSaveCount();
                            if (w9Var != null && (t9Var = w9Var.f) != null) {
                                t9Var.e(1.0f - f19, canvas, rectF11, z9Var.E);
                            }
                            if (z9Var.V0) {
                                boolean z15 = (w9Var == null || w9Var.l == null) ? false : true;
                                if (z15 && z9Var.U == f18) {
                                    f20 = f19;
                                } else {
                                    if (w9Var != null && (x7Var2 = w9Var.m) != null && x7Var2.w) {
                                        canvas.saveLayerAlpha(rectF11.left - AndroidUtilities.dp(4.0f), rectF11.top - AndroidUtilities.dp(4.0f), rectF11.right + AndroidUtilities.dp(4.0f), rectF11.bottom + AndroidUtilities.dp(4.0f), 255, 31);
                                    }
                                    j4Var2.getImageReceiver().setImageCoords(rectF11);
                                    j4Var2.getImageReceiver().setRoundRadius((int) AndroidUtilities.lerp(rectF11.width() / 2.0f, ((w9Var == null || w9Var.b == null) ? null : Integer.valueOf((int) (w9Var.b.getRoundRadius()[0] * ((!w9Var.n || (view = w9Var.a) == null || view.getParent() == null) ? 1.0f : ((ViewGroup) w9Var.a.getParent()).getScaleY())))) != null ? r4.intValue() : rectF11.width() / 2.0f, 1.0f - z9Var.U));
                                    j4Var2.getImageReceiver().setVisible(true, false);
                                    float f41 = z15 ? z9Var.U : 1.0f;
                                    if (w9Var == null || w9Var.k >= 1.0f || (paint = w9Var.j) == null) {
                                        f20 = f19;
                                        f21 = f41;
                                    } else {
                                        paint.setAlpha((int) ((1.0f - f19) * f10));
                                        canvas.drawCircle(rectF11.centerX(), rectF11.centerY(), rectF11.width() / 2.0f, w9Var.j);
                                        f20 = f19;
                                        f21 = AndroidUtilities.lerp(w9Var.k, f41, f20);
                                    }
                                    j4Var2.getImageReceiver().setAlpha(f21);
                                    l4Var.b(z9Var.U, canvas, rectF11, !z9.A1);
                                    j4Var2.getImageReceiver().draw(canvas);
                                    j4Var2.getImageReceiver().setAlpha(f41);
                                    j4Var2.getImageReceiver().setVisible(false, false);
                                    if (w9Var != null && (x7Var = w9Var.m) != null && x7Var.w) {
                                        RectF rectF12 = AndroidUtilities.rectTmp;
                                        rectF12.set(rectF11);
                                        f22 = 1.0f;
                                        c8.k(1.0f - z9Var.U, f18, canvas, rectF12, true);
                                        canvas.restore();
                                        if (z9Var.U != f22 && z15) {
                                            RectF rectF13 = rectF2;
                                            rectF13.set(w9Var.l.getImageX(), w9Var.l.getImageY(), w9Var.l.getImageX2(), w9Var.l.getImageY2());
                                            int i15 = w9Var.l.getRoundRadius()[0];
                                            boolean visible2 = w9Var.l.getVisible();
                                            w9Var.l.setImageCoords(rectF11);
                                            w9Var.l.setRoundRadius((int) (rectF11.width() / 2.0f));
                                            w9Var.l.setVisible(true, false);
                                            canvas.saveLayerAlpha(rectF11, (int) ((1.0f - z9Var.U) * f10), 31);
                                            w9Var.l.draw(canvas);
                                            canvas.restore();
                                            w9Var.l.setVisible(visible2, false);
                                            w9Var.l.setImageCoords(rectF13);
                                            w9Var.l.setRoundRadius(i15);
                                        }
                                        if (w9Var != null && (u9Var = w9Var.e) != null) {
                                            u9Var.j(canvas, rectF11, 1.0f - f20);
                                        }
                                    }
                                }
                                f22 = 1.0f;
                                if (z9Var.U != f22) {
                                    RectF rectF132 = rectF2;
                                    rectF132.set(w9Var.l.getImageX(), w9Var.l.getImageY(), w9Var.l.getImageX2(), w9Var.l.getImageY2());
                                    int i152 = w9Var.l.getRoundRadius()[0];
                                    boolean visible22 = w9Var.l.getVisible();
                                    w9Var.l.setImageCoords(rectF11);
                                    w9Var.l.setRoundRadius((int) (rectF11.width() / 2.0f));
                                    w9Var.l.setVisible(true, false);
                                    canvas.saveLayerAlpha(rectF11, (int) ((1.0f - z9Var.U) * f10), 31);
                                    w9Var.l.draw(canvas);
                                    canvas.restore();
                                    w9Var.l.setVisible(visible22, false);
                                    w9Var.l.setImageCoords(rectF132);
                                    w9Var.l.setRoundRadius(i152);
                                }
                                if (w9Var != null) {
                                    u9Var.j(canvas, rectF11, 1.0f - f20);
                                }
                            }
                            canvas.restoreToCount(saveCount2);
                        }
                        if (z9Var.M != null) {
                            float clamp2 = Utilities.clamp(z9Var.U / 0.4f, 1.0f, 0.0f);
                            if (clamp2 != 1.0f) {
                                RectF rectF14 = AndroidUtilities.rectTmp;
                                float f42 = z9Var.N;
                                float f43 = z9Var.O;
                                rectF14.set(f42, f43, z9Var.R + f42, z9Var.S + f43);
                                rectF14.inset(-AndroidUtilities.dp(16.0f), -AndroidUtilities.dp(16.0f));
                                if (clamp2 != 0.0f) {
                                    canvas.saveLayerAlpha(rectF14, (int) ((1.0f - clamp2) * f10), 31);
                                } else {
                                    canvas.save();
                                }
                                canvas.translate(z9Var.K, z9Var.L);
                                ((org.telegram.ui.Cells.q2) z9Var.M).A(canvas);
                                canvas.restore();
                            }
                        }
                        canvas.restore();
                        if (z9.A1) {
                            ArrayList arrayList = z9Var.x0;
                            z9Var.Q();
                            z9Var.U = 0.0f;
                            z9Var.M(true);
                            z9Var.d = false;
                            z9.x1 = true;
                            z9Var.b0 = z9Var.W;
                            if (w9Var.d != null && (t10 = z9Var.t()) != null && (ck0Var = t10.o1.d) != null) {
                                ck0 ck0Var2 = w9Var.d;
                                ck0Var.c = ck0Var2.c;
                                ck0Var.f = ck0Var2.f;
                                ck0Var.b = ck0Var2.b;
                                ck0Var.a = System.currentTimeMillis();
                                ck0Var.c();
                            }
                            z9Var.E = true;
                            float[] fArr3 = new float[i11];
                            // fill-array-data instruction
                            fArr3[0] = 0.0f;
                            fArr3[1] = 1.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr3);
                            z9Var.F = ofFloat;
                            ofFloat.addUpdateListener(new h9(z9Var, 1));
                            z9Var.J0.lock();
                            o9 o9Var4 = z9Var.v;
                            if (o9Var4 != null) {
                                w.c = true;
                                i12 = 2;
                                o9Var4.setLayerType(2, null);
                            } else {
                                i12 = 2;
                            }
                            z9Var.F.addListener(new i9(z9Var, i12));
                            z9Var.F.setStartDelay(40L);
                            z9Var.F.setDuration(250L);
                            z9Var.F.setInterpolator(bs.f);
                            z9Var.F.start();
                            if (!arrayList.isEmpty()) {
                                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                    ((Runnable) arrayList.get(i16)).run();
                                }
                                arrayList.clear();
                            }
                            z9.A1 = false;
                            return;
                        }
                        return;
                    }
                    int i17 = i10;
                    float lerp7 = AndroidUtilities.lerp(iArr[i10], i17, f28);
                    fArr[z10] = lerp7;
                    fArr[i17] = lerp7;
                    float lerp8 = AndroidUtilities.lerp(z9Var.W0[z10], i17, f28);
                    fArr[3] = lerp8;
                    fArr[i11] = lerp8;
                    float lerp9 = AndroidUtilities.lerp(z9Var.W0[i11], i17, f28);
                    fArr[5] = lerp9;
                    fArr[4] = lerp9;
                    float lerp10 = AndroidUtilities.lerp(z9Var.W0[3], i17, f28);
                    fArr[7] = lerp10;
                    fArr[6] = lerp10;
                }
                f15 = 0.0f;
                path.addRoundRect(rectF10, fArr, Path.Direction.CCW);
                canvas.save();
                f16 = z9Var.P;
                if (f16 != f15) {
                    canvas.clipRect(f15, AndroidUtilities.lerp(f15, f16, (float) Math.pow(1.0f - z9Var.U, 0.4000000059604645d)), getMeasuredWidth(), AndroidUtilities.lerp(getMeasuredHeight(), z9Var.Q, 1.0f - z9Var.U));
                }
                if (w9Var == null) {
                }
                rectF2 = rectF5;
                f17 = f15;
                rectF3 = rectF8;
                canvas.save();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                RectF rectF112 = this.D0;
                if (w9Var != null) {
                }
                f18 = f17;
                f19 = f28;
                rectF4 = rectF3;
                canvas.restore();
                if (l4Var != null) {
                }
                if (z9Var.M != null) {
                }
                canvas.restore();
                if (z9.A1) {
                }
            }
        }
        z9Var.v.setAlpha(z9Var.U);
        float f44 = (f11 * 0.15f) + (z9Var.U * 0.1f) + 0.75f;
        z9Var.v.setScaleX(f44);
        z9Var.v.setScaleY(f44);
        z9Var.v.setTranslationY(z9Var.W);
        z9Var.v.setTranslationX(z9Var.X);
        super.dispatchDraw(canvas);
        i11 = 2;
        if (z9.A1) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        z9 z9Var = this.I0;
        if (keyCode == 24 || keyEvent.getKeyCode() == 25) {
            z9Var.r(keyEvent);
            return true;
        }
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        z9Var.onAttachedBackPressed();
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
        p9 p9Var;
        int i10;
        gl0 gl0Var;
        z9 z9Var = this.I0;
        float[] fArr = z9Var.o0;
        p4 currentPeerView = z9Var.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            u3 u3Var = currentPeerView.K0;
            if (u3Var.W.x()) {
                float x10 = currentPeerView.getX();
                float y3 = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x10, -y3);
                if (!u3Var.W.n(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x10, y3);
                }
                return true;
            }
        }
        float f7 = 0.0f;
        int i11 = 0;
        if (z9Var.p1 && currentPeerView != null && (gl0Var = currentPeerView.r3) != null) {
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
            gl0Var.getHitRect(rect);
            rect.offset((int) f7, (int) f10);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.a1(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            gl0Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            z9Var.j0 = false;
            AndroidUtilities.cancelRunOnUIThread(z9Var.b1);
            float f11 = z9Var.X;
            if (f11 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                z9Var.G = ofFloat;
                ofFloat.addUpdateListener(new k9(this, i11));
                z9Var.G.addListener(new l9(this, i11));
                z9Var.G.setDuration(250L);
                z9Var.G.setInterpolator(bs.f);
                z9Var.G.start();
            }
            if (z9Var.V >= 0.3f) {
                z9Var.q(true);
            }
            z9Var.K(false);
            z9Var.L(false);
            z10 = true;
        } else {
            z10 = false;
        }
        if (motionEvent.getAction() == 0) {
            z9Var.a0 = false;
            if (currentPeerView != null) {
                h4 h4Var = currentPeerView.y0;
                e9 e9Var = currentPeerView.C0;
                q3 q3Var = currentPeerView.c1;
                ei.x3 x3Var = currentPeerView.F0;
                if (x3Var != null && x3Var.V && e9Var != null && !x3Var.r0.contains(motionEvent.getX() - (currentPeerView.F0.getX() + (q3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.F0.getY() + (q3Var.getY() + currentPeerView.getY()))) && !currentPeerView.G0(motionEvent, e9Var)) {
                    currentPeerView.F0.e(true);
                }
                ei.x3 x3Var2 = currentPeerView.G0;
                if (x3Var2 != null && x3Var2.V && h4Var != null && !x3Var2.r0.contains(motionEvent.getX() - (currentPeerView.G0.getX() + (q3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.G0.getY() + (q3Var.getY() + currentPeerView.getY()))) && !currentPeerView.G0(motionEvent, h4Var)) {
                    currentPeerView.G0.e(true);
                }
            }
            z9Var.n0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        boolean z12 = (z9Var.x || z9Var.H0 || z9Var.I0) ? false : true;
        float f12 = z9Var.e0;
        SparseArray sparseArray = this.G0;
        if (f12 == 0.0f && !z9Var.j0 && z9Var.n0.F0 == 1 && motionEvent.getAction() == 2 && z12) {
            float floatValue = ((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0);
            if ((floatValue != 0.0f && (((i10 = (p9Var = z9Var.n0).I0) == 0 && p9Var.K0 == 0.0f && floatValue < 0.0f) || (i10 == p9Var.getAdapter().b() - 1 && p9Var.K0 == 0.0f && floatValue > 0.0f))) || z9Var.X != 0.0f) {
                float f13 = z9Var.X;
                if (f13 == 0.0f) {
                    z9Var.Y = -floatValue;
                }
                if ((floatValue < 0.0f && z9Var.Y > 0.0f) || (floatValue > 0.0f && z9Var.Y < 0.0f)) {
                    floatValue *= 0.2f;
                }
                z9Var.X = f13 - floatValue;
                z9.k(z9Var);
                float f14 = z9Var.X;
                if ((f14 > 0.0f && z9Var.Y < 0.0f) || (f14 < 0.0f && z9Var.Y > 0.0f)) {
                    z9Var.X = 0.0f;
                }
                z11 = true;
                if (currentPeerView != null && z9Var.e0 == 0.0f && !z9Var.j0 && !z9Var.L0 && !z9Var.I0 && z9Var.n0.F0 != 1) {
                    AndroidUtilities.getViewPositionInParent(currentPeerView.c1, this, fArr);
                    motionEvent.offsetLocation(-fArr[0], -fArr[1]);
                    p4 currentPeerView2 = z9Var.n0.getCurrentPeerView();
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
                        if (z9Var.e0 != 0.0f && !z9Var.g1 && z9Var.p0 < AndroidUtilities.dp(20.0f)) {
                            z9Var.n(z9Var.w.f > 0.5f);
                        }
                        p4 t10 = z9Var.t();
                        if (t10 != null) {
                            t10.K0.w0 = false;
                        }
                    }
                    if (z10 && !z9Var.a0) {
                        z9Var.m();
                    }
                    if (!dispatchTouchEvent && (!z9.x1 || !z9Var.q0)) {
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
            p4 currentPeerView22 = z9Var.n0.getCurrentPeerView();
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

    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z9 z9Var = this.I0;
        if (z9Var.b && !z9Var.c) {
            org.telegram.ui.ActionBar.o2 o2Var = this.H0;
            AndroidUtilities.requestAdjustResize(o2Var.getParentActivity(), o2Var.getClassGuid());
        }
        qc.a(this, new m9(this));
        NotificationCenter.getInstance(z9Var.h).addObserver(z9Var, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(z9Var.h).addObserver(z9Var, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(z9Var.h).addObserver(z9Var, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(z9Var.h).addObserver(z9Var, NotificationCenter.openArticle);
        NotificationCenter.getInstance(z9Var.h).addObserver(z9Var, NotificationCenter.storyDeleted);
    }

    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc.h(this);
        z9 z9Var = this.I0;
        NotificationCenter.getInstance(z9Var.h).removeObserver(z9Var, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(z9Var.h).removeObserver(z9Var, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(z9Var.h).removeObserver(z9Var, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(z9Var.h).removeObserver(z9Var, NotificationCenter.openArticle);
        NotificationCenter.getInstance(z9Var.h).removeObserver(z9Var, NotificationCenter.storyDeleted);
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
        m2 m2Var;
        y9 y9Var;
        p4 currentPeerView;
        boolean z10;
        androidx.fragment.app.d dVar;
        o4 o4Var;
        p4 currentPeerView2;
        n4 n4Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        m2 m2Var2;
        z9 z9Var = this.I0;
        s3 s3Var = z9Var.b1;
        if (motionEvent.getAction() == 0 && z9Var.U == 1.0f) {
            float x10 = motionEvent.getX();
            this.y0 = x10;
            this.w0 = x10;
            this.x0 = motionEvent.getY();
            z9Var.g0 = false;
            z9Var.f0 = (z9Var.I0 || z9.i(z9Var, z9Var.s, motionEvent.getX(), motionEvent.getY(), false)) ? false : true;
            z9Var.h0 = (z9Var.I0 || z9.i(z9Var, z9Var.s, motionEvent.getX(), motionEvent.getY(), true)) ? false : true;
            z9Var.K(z9Var.f0 && !z9Var.m1);
            p4 t10 = z9Var.t();
            if (z9Var.f0 && t10 != null && (m2Var2 = t10.L0) != null) {
                m2Var2.setAllowTouches(false);
            }
            if (z9Var.f0 && !z9Var.I0 && z9Var.m1) {
                androidx.fragment.app.d dVar2 = new androidx.fragment.app.d(this, 27);
                z9Var.n1 = dVar2;
                AndroidUtilities.runOnUIThread(dVar2, 150L);
            }
            if (z9Var.f0 && !z9Var.x && !z9Var.I0 && !z9Var.j1) {
                AndroidUtilities.runOnUIThread(s3Var, 400L);
            }
            f7 = 1.0f;
        } else if (motionEvent.getAction() == 2) {
            float abs = Math.abs(this.x0 - motionEvent.getY());
            float abs2 = Math.abs(this.w0 - motionEvent.getX());
            if (z9Var.a1 && z9Var.k0 && !z9Var.f1 && !z9Var.j0 && (o4Var = z9Var.G0) != null && ((y9) o4Var.c) != null && (currentPeerView2 = z9Var.n0.getCurrentPeerView()) != null && (n4Var = currentPeerView2.O1) != null && n4Var.b == null && n4Var.e) {
                long j10 = currentPeerView2.R2;
                if (j10 <= 0 && (storyItem = n4Var.a) != null && (messageMedia = storyItem.media) != null && (document = messageMedia.document) != null) {
                    j10 = (long) (MessageObject.getDocumentDuration(document) * 1000.0d);
                }
                if (j10 > 0) {
                    float x11 = motionEvent.getX();
                    y9 y9Var2 = (y9) z9Var.G0.c;
                    f7 = 1.0f;
                    if (((int) (y9Var2.seek((x11 - this.y0) / AndroidUtilities.dp(220.0f), j10) * 10.0f)) != ((int) (y9Var2.currentSeek * 10.0f))) {
                        try {
                            currentPeerView2.performHapticFeedback(9, 1);
                        } catch (Exception unused) {
                        }
                    }
                    currentPeerView2.c1.invalidate();
                    this.y0 = x11;
                    if (abs > abs2 && !z9Var.k0 && !z9Var.g0 && abs > AndroidUtilities.touchSlop * 2.0f) {
                        z9Var.g0 = true;
                    }
                    if (!z9Var.j0 && !z9Var.k0 && !z9Var.x && z9Var.h0) {
                        if (abs > abs2 && abs > AndroidUtilities.touchSlop * 2.0f) {
                            z9Var.j0 = true;
                            currentPeerView = z9Var.n0.getCurrentPeerView();
                            if (currentPeerView != null) {
                                currentPeerView.o0();
                            }
                            boolean z11 = currentPeerView == null && !currentPeerView.O1.f && (currentPeerView.C1 || (currentPeerView.D1 && currentPeerView.B3));
                            z9Var.l0 = (!z11 || currentPeerView == null || currentPeerView.D1 || currentPeerView.F1 || z9Var.u1 != null) ? false : true;
                            z10 = (z11 || currentPeerView.c3 || currentPeerView.O1.a == null || z9Var.u1 != null) ? false : true;
                            z9Var.c0 = z10;
                            if (z10 && this.f != 0) {
                                z9Var.c0 = false;
                            }
                            if (z9Var.c0) {
                                z9Var.p();
                            }
                            z9Var.Z = 0.0f;
                            dVar = z9Var.n1;
                            if (dVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(dVar);
                                z9Var.n1.run();
                                z9Var.n1 = null;
                            }
                            AndroidUtilities.cancelRunOnUIThread(s3Var);
                        }
                        z9Var.y();
                    }
                }
            }
            f7 = 1.0f;
            if (abs > abs2) {
                z9Var.g0 = true;
            }
            if (!z9Var.j0) {
                if (abs > abs2) {
                    z9Var.j0 = true;
                    currentPeerView = z9Var.n0.getCurrentPeerView();
                    if (currentPeerView != null) {
                    }
                    if (currentPeerView == null) {
                    }
                    z9Var.l0 = (!z11 || currentPeerView == null || currentPeerView.D1 || currentPeerView.F1 || z9Var.u1 != null) ? false : true;
                    if (z11) {
                    }
                    z9Var.c0 = z10;
                    if (z10) {
                        z9Var.c0 = false;
                    }
                    if (z9Var.c0) {
                    }
                    z9Var.Z = 0.0f;
                    dVar = z9Var.n1;
                    if (dVar != null) {
                    }
                    AndroidUtilities.cancelRunOnUIThread(s3Var);
                }
                z9Var.y();
            }
        } else {
            f7 = 1.0f;
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                AndroidUtilities.cancelRunOnUIThread(s3Var);
                androidx.fragment.app.d dVar3 = z9Var.n1;
                if (dVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(dVar3);
                    z9Var.n1 = null;
                }
                z9Var.K(false);
                z9Var.g0 = false;
                z9Var.k0 = false;
                o4 o4Var2 = z9Var.G0;
                if (o4Var2 != null && (y9Var = (y9) o4Var2.c) != null) {
                    y9Var.setSeeking(false);
                }
                p4 t11 = z9Var.t();
                if (t11 != null && (m2Var = t11.L0) != null) {
                    m2Var.setAllowTouches(true);
                }
            }
        }
        b6 b6Var = z9Var.w;
        boolean z12 = b6Var != null && b6Var.f == f7;
        if (!z9Var.j0 && !z12) {
            z9Var.i0.onTouchEvent(motionEvent);
        }
        return z9Var.j0 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        z9 z9Var = this.I0;
        ((FrameLayout.LayoutParams) z9Var.d1.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(2.0f);
        z9Var.d1.getLayoutParams().height = AndroidUtilities.dp(2.0f);
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        m2 m2Var;
        int action = motionEvent.getAction();
        z9 z9Var = this.I0;
        int i10 = 1;
        if (action == 1 || motionEvent.getAction() == 3) {
            z9Var.j0 = false;
            z9Var.K(false);
            if (z9Var.V >= 1.0f) {
                z9Var.q(true);
            } else if (!z9Var.H0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(z9Var.W, 0.0f);
                z9Var.G = ofFloat;
                ofFloat.addUpdateListener(new k9(this, i10));
                z9Var.G.addListener(new l9(this, i10));
                z9Var.G.setDuration(150L);
                z9Var.G.setInterpolator(bs.f);
                z9Var.G.start();
            }
            p4 t10 = z9Var.t();
            if (t10 != null && (m2Var = t10.L0) != null) {
                m2Var.setAllowTouches(true);
            }
        }
        if (!z9Var.j0 && !z9Var.x && z9Var.Z == 0.0f && ((z9Var.e0 == 0.0f || (!z9Var.f0 && !z9Var.g0)) && !z9Var.j1)) {
            return false;
        }
        z9Var.i0.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        this.I0.f0 = false;
    }
}
