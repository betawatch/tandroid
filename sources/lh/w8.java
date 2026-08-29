package lh;

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
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.mc;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class w8 extends hv0 {
    public final RectF A0;
    public final RectF B0;
    public final SparseArray C0;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 D0;
    public final /* synthetic */ i9 E0;
    public float s0;
    public float t0;
    public float u0;
    public final float[] v0;
    public final Path w0;
    public final RectF x0;
    public final RectF y0;
    public final RectF z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(i9 i9Var, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, null);
        this.E0 = i9Var;
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
    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        char c3;
        char c6;
        float f10;
        z3 z3Var;
        float f11;
        char c10;
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
        h7 h7Var;
        float f20;
        Paint paint;
        View view;
        h7 h7Var2;
        d9 d9Var;
        c9 c9Var;
        d4 currentPeerView;
        h3 h3Var;
        h7 h7Var3;
        int i10;
        d4 t10;
        bj0 bj0Var;
        i9 i9Var = this.E0;
        RectF rectF5 = i9Var.P;
        f9 f9Var = i9Var.o0;
        canvas.drawColor(i0.a.k(-16777216, (int) ((((1.0f - i9Var.R) * 0.5f) + 0.5f) * i9Var.Q * 255.0f)));
        if (i9Var.b) {
            boolean z10 = (1.0f - i9Var.R) * i9Var.Q == 1.0f;
            if (i9Var.G0 != z10) {
                i9Var.G0 = z10;
                org.telegram.ui.ActionBar.o2 o2Var = this.D0;
                if (o2Var.getLayoutContainer() != null) {
                    o2Var.getLayoutContainer().invalidate();
                }
            }
        }
        d4 currentPeerView2 = i9Var.j0.getCurrentPeerView();
        RectF rectF6 = this.B0;
        RectF rectF7 = this.A0;
        if (currentPeerView2 != null) {
            z3 z3Var2 = currentPeerView2.k1;
            if (i9Var.R0) {
                z3Var2.a.getImageReceiver().setVisible(i9Var.Q == 1.0f, true);
            } else {
                z3Var2.a.getImageReceiver().setVisible(true, false);
            }
            if (i9Var.d1) {
                i9Var.d1 = false;
                y3 y3Var = z3Var2.a;
                float f21 = 0.0f;
                float f22 = 0.0f;
                f9 = 255.0f;
                c3 = 1;
                for (View view2 = z3Var2.a; view2 != this; view2 = (View) view2.getParent()) {
                    if (view2.getParent() == this) {
                        f21 += view2.getLeft();
                        f22 += view2.getTop();
                    } else if (view2.getParent() != i9Var.j0) {
                        f21 += view2.getX();
                        f22 += view2.getY();
                    }
                }
                c6 = 0;
                f10 = 1.0f;
                rectF7.set(f21, f22, y3Var.getMeasuredWidth() + f21, y3Var.getMeasuredHeight() + f22);
                rectF6.set(0.0f, currentPeerView2.Y0.getTop() + currentPeerView2.getTop(), i9Var.v.getMeasuredWidth(), i9Var.v.getMeasuredHeight());
                i9Var.v.getMatrix().mapRect(rectF7);
                i9Var.v.getMatrix().mapRect(rectF6);
            } else {
                f9 = 255.0f;
                c3 = 1;
                c6 = 0;
                f10 = 1.0f;
            }
            z3Var = z3Var2;
        } else {
            f9 = 255.0f;
            c3 = 1;
            c6 = 0;
            f10 = 1.0f;
            z3Var = null;
        }
        i9Var.Z0.setAlpha(f10 - i9Var.R);
        float clamp = i9Var.T == 0.0f ? 1.0f - Utilities.clamp(Math.abs(i9Var.S / getMeasuredHeight()), 1.0f, 0.0f) : 1.0f;
        i9Var.j0.setHorizontalProgressToDismiss((i9Var.T / i9Var.v.getMeasuredWidth()) * i9Var.Q);
        if (i9Var.J != 0.0f || i9Var.K != 0.0f) {
            float f23 = i9Var.Q;
            if (f23 != 1.0f) {
                if (i9Var.D0 && i9Var.R0) {
                    float clamp2 = 1.0f - Utilities.clamp(((1.0f - f23) - 0.8f) / 0.100000024f, 1.0f, 0.0f);
                    f11 = 0.15f;
                    f12 = Utilities.clamp(th.b(1.0f, clamp2, 0.05f, f23), 1.0f, 0.0f);
                    c10 = 2;
                    i9Var.v.setAlpha(clamp2);
                } else {
                    f11 = 0.15f;
                    c10 = 2;
                    i9Var.v.setAlpha(1.0f);
                    f12 = f23;
                }
                if (!i9Var.D0 || f9Var == null || f9Var.c == null) {
                    rectF = rectF7;
                } else {
                    x8 x8Var = i9Var.v;
                    rectF = rectF7;
                    x8Var.setAlpha(x8Var.getAlpha() * ((float) Math.pow(f23, 0.20000000298023224d)));
                }
                x8 x8Var2 = i9Var.v;
                float left = (i9Var.J - x8Var2.getLeft()) - (i9Var.v.getMeasuredWidth() / 2.0f);
                float f24 = i9Var.Q;
                x8Var2.setTranslationX((i9Var.T * f24) + ((1.0f - f24) * left));
                x8 x8Var3 = i9Var.v;
                float top = (i9Var.K - x8Var3.getTop()) - (i9Var.v.getMeasuredHeight() / 2.0f);
                float f25 = i9Var.Q;
                x8Var3.setTranslationY((i9Var.S * f25) + ((1.0f - f25) * top));
                float lerp = AndroidUtilities.lerp(i9Var.N / i9Var.v.getMeasuredWidth(), (clamp * f11) + 0.85f, f12);
                i9Var.v.setScaleX(lerp);
                i9Var.v.setScaleY(lerp);
                Path path = this.w0;
                path.rewind();
                float f26 = i9Var.J;
                float f27 = i9Var.N / 2.0f;
                float f28 = i9Var.K;
                float f29 = i9Var.O / 2.0f;
                float f30 = f29 + f28;
                RectF rectF8 = this.x0;
                rectF8.set(f26 - f27, f28 - f29, f27 + f26, f30);
                boolean z11 = i9Var.D0;
                RectF rectF9 = this.y0;
                if (z11 && i9Var.R0) {
                    rectF9.set(rectF6);
                } else if (currentPeerView2 != null) {
                    rectF9.set(0.0f, currentPeerView2.Y0.getTop() + i9Var.X, getMeasuredWidth(), getMeasuredHeight() + i9Var.X);
                } else {
                    rectF9.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                if (i9Var.D0 && i9Var.R0) {
                    rectF8.inset(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                }
                float lerp2 = AndroidUtilities.lerp(rectF8.centerX(), rectF9.centerX(), i9Var.Q);
                float lerp3 = AndroidUtilities.lerp(rectF8.centerY(), rectF9.centerY(), i9Var.Q);
                float lerp4 = AndroidUtilities.lerp(rectF8.height(), rectF9.height(), f12);
                float lerp5 = AndroidUtilities.lerp(rectF8.width(), rectF9.width(), f12);
                if (i9Var.D0 && i9Var.R0) {
                    f13 = lerp2;
                    rectF8.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
                } else {
                    f13 = lerp2;
                }
                RectF rectF10 = AndroidUtilities.rectTmp;
                float f31 = lerp5 / 2.0f;
                float f32 = lerp4 / 2.0f;
                rectF10.set(f13 - f31, lerp3 - f32, f13 + f31, lerp3 + f32);
                boolean z12 = i9Var.R0;
                float[] fArr2 = this.v0;
                if (z12) {
                    float lerp6 = AndroidUtilities.lerp(i9Var.N / 2.0f, 0.0f, f12);
                    fArr = fArr2;
                    fArr[7] = lerp6;
                    fArr[6] = lerp6;
                    fArr[5] = lerp6;
                    fArr[4] = lerp6;
                    fArr[3] = lerp6;
                    fArr[c10] = lerp6;
                    fArr[c3] = lerp6;
                    fArr[c6] = lerp6;
                } else {
                    fArr = fArr2;
                    int[] iArr = i9Var.S0;
                    if (iArr == null) {
                        f14 = 0.0f;
                        fArr[7] = 0.0f;
                        fArr[6] = 0.0f;
                        fArr[5] = 0.0f;
                        fArr[4] = 0.0f;
                        fArr[3] = 0.0f;
                        fArr[c10] = 0.0f;
                        fArr[c3] = 0.0f;
                        fArr[0] = 0.0f;
                        path.addRoundRect(rectF10, fArr, Path.Direction.CCW);
                        canvas.save();
                        f15 = i9Var.L;
                        if (f15 != f14 && i9Var.M != f14) {
                            canvas.clipRect(f14, AndroidUtilities.lerp(f14, f15, (float) Math.pow(1.0f - i9Var.Q, 0.4000000059604645d)), getMeasuredWidth(), AndroidUtilities.lerp(getMeasuredHeight(), i9Var.M, 1.0f - i9Var.Q));
                        }
                        if (f9Var == null && (h7Var3 = f9Var.m) != null && h7Var3.w && i9Var.R0) {
                            rectF2 = rectF8;
                            rectF3 = rectF5;
                            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f23 * f9), 31);
                        } else {
                            rectF2 = rectF8;
                            rectF3 = rectF5;
                            canvas.save();
                        }
                        canvas.clipPath(path);
                        super.dispatchDraw(canvas);
                        RectF rectF11 = this.z0;
                        if (f9Var != null || f9Var.c == null || (currentPeerView = i9Var.j0.getCurrentPeerView()) == null || (h3Var = currentPeerView.Y0) == null) {
                            f16 = f23;
                            rectF4 = rectF2;
                            f17 = 0.0f;
                        } else {
                            boolean visible = f9Var.c.getVisible();
                            f17 = 0.0f;
                            rectF9.set(h3Var.getX() + currentPeerView.getX() + i9Var.T + i9Var.v.getLeft(), h3Var.getY() + currentPeerView.getY() + i9Var.S + i9Var.v.getTop(), ((i9Var.T + i9Var.v.getRight()) - (i9Var.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - h3Var.getRight()), ((i9Var.S + i9Var.v.getBottom()) - (i9Var.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - h3Var.getBottom()));
                            AndroidUtilities.lerp(rectF2, rectF9, f23, rectF11);
                            float imageX = f9Var.c.getImageX();
                            float imageY = f9Var.c.getImageY();
                            float imageWidth = f9Var.c.getImageWidth();
                            float imageHeight = f9Var.c.getImageHeight();
                            f9Var.c.setImageCoords(rectF11);
                            float f33 = 1.0f - f23;
                            f9Var.c.setAlpha(f33);
                            f16 = f23;
                            rectF4 = rectF2;
                            f9Var.c.setVisible(true, false);
                            int saveCount = canvas.getSaveCount();
                            c9 c9Var2 = f9Var.f;
                            if (c9Var2 != null) {
                                c9Var2.f(f33, canvas, rectF11, i9Var.A);
                            }
                            f9Var.c.draw(canvas);
                            d9 d9Var2 = f9Var.e;
                            if (d9Var2 != null) {
                                d9Var2.j(canvas, rectF11, f33);
                            }
                            f9Var.c.setVisible(visible, false);
                            f9Var.c.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                            canvas.restoreToCount(saveCount);
                        }
                        canvas.restore();
                        if (z3Var != null) {
                            y3 y3Var2 = z3Var.a;
                            float f34 = i9Var.T;
                            float f35 = i9Var.S;
                            if (i9Var.D0 && i9Var.R0) {
                                rectF9.set(rectF);
                            } else {
                                for (View view3 = y3Var2; view3 != this && view3 != null; view3 = (View) view3.getParent()) {
                                    if (view3.getParent() == this) {
                                        f34 += view3.getLeft();
                                        f35 += view3.getTop();
                                    } else if (view3.getParent() != i9Var.j0) {
                                        float x4 = view3.getX() + f34;
                                        f35 = view3.getY() + f35;
                                        f34 = x4;
                                    }
                                    if (!(view3.getParent() instanceof View)) {
                                        break;
                                    }
                                }
                                rectF9.set(f34, f35, y3Var2.getMeasuredWidth() + f34, y3Var2.getMeasuredHeight() + f35);
                            }
                            AndroidUtilities.lerp(rectF4, rectF9, i9Var.Q, rectF11);
                            int saveCount2 = canvas.getSaveCount();
                            if (f9Var != null && (c9Var = f9Var.f) != null) {
                                c9Var.f(1.0f - f16, canvas, rectF11, i9Var.A);
                            }
                            if (i9Var.R0) {
                                boolean z13 = (f9Var == null || f9Var.l == null) ? false : true;
                                if (z13 && i9Var.Q == f17) {
                                    f18 = f16;
                                } else {
                                    if (f9Var != null && (h7Var2 = f9Var.m) != null && h7Var2.w) {
                                        canvas.saveLayerAlpha(rectF11.left - AndroidUtilities.dp(4.0f), rectF11.top - AndroidUtilities.dp(4.0f), rectF11.right + AndroidUtilities.dp(4.0f), rectF11.bottom + AndroidUtilities.dp(4.0f), 255, 31);
                                    }
                                    y3Var2.getImageReceiver().setImageCoords(rectF11);
                                    y3Var2.getImageReceiver().setRoundRadius((int) AndroidUtilities.lerp(rectF11.width() / 2.0f, ((f9Var == null || f9Var.b == null) ? null : Integer.valueOf((int) (f9Var.b.getRoundRadius()[0] * ((!f9Var.n || (view = f9Var.a) == null || view.getParent() == null) ? 1.0f : ((ViewGroup) f9Var.a.getParent()).getScaleY())))) != null ? r4.intValue() : rectF11.width() / 2.0f, 1.0f - i9Var.Q));
                                    y3Var2.getImageReceiver().setVisible(true, false);
                                    float f36 = z13 ? i9Var.Q : 1.0f;
                                    if (f9Var == null || f9Var.k >= 1.0f || (paint = f9Var.j) == null) {
                                        f18 = f16;
                                        f19 = f36;
                                    } else {
                                        paint.setAlpha((int) ((1.0f - f16) * f9));
                                        canvas.drawCircle(rectF11.centerX(), rectF11.centerY(), rectF11.width() / 2.0f, f9Var.j);
                                        f18 = f16;
                                        f19 = AndroidUtilities.lerp(f9Var.k, f36, f18);
                                    }
                                    y3Var2.getImageReceiver().setAlpha(f19);
                                    z3Var.b(i9Var.Q, canvas, rectF11, !i9.w1);
                                    y3Var2.getImageReceiver().draw(canvas);
                                    y3Var2.getImageReceiver().setAlpha(f36);
                                    y3Var2.getImageReceiver().setVisible(false, false);
                                    if (f9Var != null && (h7Var = f9Var.m) != null && h7Var.w) {
                                        RectF rectF12 = AndroidUtilities.rectTmp;
                                        rectF12.set(rectF11);
                                        f20 = 1.0f;
                                        l7.k(canvas, rectF12, 1.0f - i9Var.Q, true, 0.0f);
                                        canvas.restore();
                                        if (i9Var.Q != f20 && z13) {
                                            RectF rectF13 = rectF3;
                                            rectF13.set(f9Var.l.getImageX(), f9Var.l.getImageY(), f9Var.l.getImageX2(), f9Var.l.getImageY2());
                                            int i11 = f9Var.l.getRoundRadius()[0];
                                            boolean visible2 = f9Var.l.getVisible();
                                            f9Var.l.setImageCoords(rectF11);
                                            f9Var.l.setRoundRadius((int) (rectF11.width() / 2.0f));
                                            f9Var.l.setVisible(true, false);
                                            canvas.saveLayerAlpha(rectF11, (int) ((1.0f - i9Var.Q) * f9), 31);
                                            f9Var.l.draw(canvas);
                                            canvas.restore();
                                            f9Var.l.setVisible(visible2, false);
                                            f9Var.l.setImageCoords(rectF13);
                                            f9Var.l.setRoundRadius(i11);
                                        }
                                        if (f9Var != null && (d9Var = f9Var.e) != null) {
                                            d9Var.j(canvas, rectF11, 1.0f - f18);
                                        }
                                    }
                                }
                                f20 = 1.0f;
                                if (i9Var.Q != f20) {
                                    RectF rectF132 = rectF3;
                                    rectF132.set(f9Var.l.getImageX(), f9Var.l.getImageY(), f9Var.l.getImageX2(), f9Var.l.getImageY2());
                                    int i112 = f9Var.l.getRoundRadius()[0];
                                    boolean visible22 = f9Var.l.getVisible();
                                    f9Var.l.setImageCoords(rectF11);
                                    f9Var.l.setRoundRadius((int) (rectF11.width() / 2.0f));
                                    f9Var.l.setVisible(true, false);
                                    canvas.saveLayerAlpha(rectF11, (int) ((1.0f - i9Var.Q) * f9), 31);
                                    f9Var.l.draw(canvas);
                                    canvas.restore();
                                    f9Var.l.setVisible(visible22, false);
                                    f9Var.l.setImageCoords(rectF132);
                                    f9Var.l.setRoundRadius(i112);
                                }
                                if (f9Var != null) {
                                    d9Var.j(canvas, rectF11, 1.0f - f18);
                                }
                            }
                            canvas.restoreToCount(saveCount2);
                        }
                        if (i9Var.I != null) {
                            float clamp3 = Utilities.clamp(i9Var.Q / 0.4f, 1.0f, 0.0f);
                            if (clamp3 != 1.0f) {
                                RectF rectF14 = AndroidUtilities.rectTmp;
                                float f37 = i9Var.J;
                                float f38 = i9Var.K;
                                rectF14.set(f37, f38, i9Var.N + f37, i9Var.O + f38);
                                rectF14.inset(-AndroidUtilities.dp(16.0f), -AndroidUtilities.dp(16.0f));
                                if (clamp3 != 0.0f) {
                                    canvas.saveLayerAlpha(rectF14, (int) ((1.0f - clamp3) * f9), 31);
                                } else {
                                    canvas.save();
                                }
                                canvas.translate(i9Var.G, i9Var.H);
                                ((org.telegram.ui.Cells.p2) i9Var.I).B(canvas);
                                canvas.restore();
                            }
                        }
                        canvas.restore();
                        if (i9.w1) {
                            ArrayList arrayList = i9Var.t0;
                            i9Var.Q();
                            i9Var.Q = 0.0f;
                            i9Var.M(true);
                            i9Var.d = false;
                            i9.t1 = true;
                            i9Var.X = i9Var.S;
                            if (f9Var.d != null && (t10 = i9Var.t()) != null && (bj0Var = t10.k1.d) != null) {
                                bj0 bj0Var2 = f9Var.d;
                                bj0Var.c = bj0Var2.c;
                                bj0Var.f = bj0Var2.f;
                                bj0Var.b = bj0Var2.b;
                                bj0Var.a = System.currentTimeMillis();
                                bj0Var.c();
                            }
                            i9Var.A = true;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            i9Var.B = ofFloat;
                            ofFloat.addUpdateListener(new q8(i9Var, 1));
                            i9Var.F0.lock();
                            x8 x8Var4 = i9Var.v;
                            if (x8Var4 != null) {
                                t.c = true;
                                i10 = 2;
                                x8Var4.setLayerType(2, null);
                            } else {
                                i10 = 2;
                            }
                            i9Var.B.addListener(new r8(i9Var, i10));
                            i9Var.B.setStartDelay(40L);
                            i9Var.B.setDuration(250L);
                            i9Var.B.setInterpolator(jr.f);
                            i9Var.B.start();
                            if (!arrayList.isEmpty()) {
                                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                    ((Runnable) arrayList.get(i12)).run();
                                }
                                arrayList.clear();
                            }
                            i9.w1 = false;
                            return;
                        }
                        return;
                    }
                    float lerp7 = AndroidUtilities.lerp(iArr[c6], 0, f23);
                    fArr[c3] = lerp7;
                    fArr[0] = lerp7;
                    float lerp8 = AndroidUtilities.lerp(i9Var.S0[c3], 0, f23);
                    fArr[3] = lerp8;
                    fArr[c10] = lerp8;
                    float lerp9 = AndroidUtilities.lerp(i9Var.S0[c10], 0, f23);
                    fArr[5] = lerp9;
                    fArr[4] = lerp9;
                    float lerp10 = AndroidUtilities.lerp(i9Var.S0[3], 0, f23);
                    fArr[7] = lerp10;
                    fArr[6] = lerp10;
                }
                f14 = 0.0f;
                path.addRoundRect(rectF10, fArr, Path.Direction.CCW);
                canvas.save();
                f15 = i9Var.L;
                if (f15 != f14) {
                    canvas.clipRect(f14, AndroidUtilities.lerp(f14, f15, (float) Math.pow(1.0f - i9Var.Q, 0.4000000059604645d)), getMeasuredWidth(), AndroidUtilities.lerp(getMeasuredHeight(), i9Var.M, 1.0f - i9Var.Q));
                }
                if (f9Var == null) {
                }
                rectF2 = rectF8;
                rectF3 = rectF5;
                canvas.save();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                RectF rectF112 = this.z0;
                if (f9Var != null) {
                }
                f16 = f23;
                rectF4 = rectF2;
                f17 = 0.0f;
                canvas.restore();
                if (z3Var != null) {
                }
                if (i9Var.I != null) {
                }
                canvas.restore();
                if (i9.w1) {
                }
            }
        }
        i9Var.v.setAlpha(i9Var.Q);
        float f39 = (clamp * 0.15f) + (i9Var.Q * 0.1f) + 0.75f;
        i9Var.v.setScaleX(f39);
        i9Var.v.setScaleY(f39);
        i9Var.v.setTranslationY(i9Var.S);
        i9Var.v.setTranslationX(i9Var.T);
        super.dispatchDraw(canvas);
        if (i9.w1) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        i9 i9Var = this.E0;
        if (keyCode == 24 || keyEvent.getKeyCode() == 25) {
            i9Var.r(keyEvent);
            return true;
        }
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        i9Var.onAttachedBackPressed();
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
        y8 y8Var;
        int i10;
        fk0 fk0Var;
        i9 i9Var = this.E0;
        float[] fArr = i9Var.k0;
        d4 currentPeerView = i9Var.j0.getCurrentPeerView();
        if (currentPeerView != null) {
            l3 l3Var = currentPeerView.G0;
            if (l3Var.S.y()) {
                float x4 = currentPeerView.getX();
                float y8 = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x4, -y8);
                if (!l3Var.S.o(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x4, y8);
                }
                return true;
            }
        }
        float f9 = 0.0f;
        int i11 = 0;
        if (i9Var.l1 && currentPeerView != null && (fk0Var = currentPeerView.n3) != null) {
            float f10 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f9 += view.getX();
                f10 += view.getY();
            }
            if (currentPeerView.n3.getReactionsWindow() != null && currentPeerView.n3.getReactionsWindow().c != null) {
                motionEvent.offsetLocation(-f9, (-f10) - currentPeerView.n3.getReactionsWindow().c.getTranslationY());
                currentPeerView.n3.getReactionsWindow().c.dispatchTouchEvent(motionEvent);
                return true;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            fk0Var.getHitRect(rect);
            rect.offset((int) f9, (int) f10);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.b1(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            fk0Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            i9Var.f0 = false;
            AndroidUtilities.cancelRunOnUIThread(i9Var.X0);
            float f11 = i9Var.T;
            if (f11 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                i9Var.C = ofFloat;
                ofFloat.addUpdateListener(new t8(this, i11));
                i9Var.C.addListener(new u8(this, i11));
                i9Var.C.setDuration(250L);
                i9Var.C.setInterpolator(jr.f);
                i9Var.C.start();
            }
            if (i9Var.R >= 0.3f) {
                i9Var.q(true);
            }
            i9Var.K(false);
            i9Var.L(false);
            z10 = true;
        } else {
            z10 = false;
        }
        if (motionEvent.getAction() == 0) {
            i9Var.W = false;
            if (currentPeerView != null) {
                bh.d dVar = currentPeerView.u0;
                n8 n8Var = currentPeerView.y0;
                h3 h3Var = currentPeerView.Y0;
                nh.t3 t3Var = currentPeerView.B0;
                if (t3Var != null && t3Var.R && n8Var != null && !t3Var.n0.contains(motionEvent.getX() - (currentPeerView.B0.getX() + (h3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.B0.getY() + (h3Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, n8Var)) {
                    currentPeerView.B0.e(true);
                }
                nh.t3 t3Var2 = currentPeerView.C0;
                if (t3Var2 != null && t3Var2.R && dVar != null && !t3Var2.n0.contains(motionEvent.getX() - (currentPeerView.C0.getX() + (h3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.C0.getY() + (h3Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, dVar)) {
                    currentPeerView.C0.e(true);
                }
            }
            i9Var.j0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        boolean z12 = (i9Var.x || i9Var.D0 || i9Var.E0) ? false : true;
        float f12 = i9Var.a0;
        SparseArray sparseArray = this.C0;
        if (f12 == 0.0f && !i9Var.f0 && i9Var.j0.B0 == 1 && motionEvent.getAction() == 2 && z12) {
            float floatValue = ((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0);
            if ((floatValue != 0.0f && (((i10 = (y8Var = i9Var.j0).E0) == 0 && y8Var.G0 == 0.0f && floatValue < 0.0f) || (i10 == y8Var.getAdapter().b() - 1 && y8Var.G0 == 0.0f && floatValue > 0.0f))) || i9Var.T != 0.0f) {
                float f13 = i9Var.T;
                if (f13 == 0.0f) {
                    i9Var.U = -floatValue;
                }
                if ((floatValue < 0.0f && i9Var.U > 0.0f) || (floatValue > 0.0f && i9Var.U < 0.0f)) {
                    floatValue *= 0.2f;
                }
                i9Var.T = f13 - floatValue;
                i9.k(i9Var);
                float f14 = i9Var.T;
                if ((f14 > 0.0f && i9Var.U < 0.0f) || (f14 < 0.0f && i9Var.U > 0.0f)) {
                    i9Var.T = 0.0f;
                }
                z11 = true;
                if (currentPeerView != null && i9Var.a0 == 0.0f && !i9Var.f0 && !i9Var.H0 && !i9Var.E0 && i9Var.j0.B0 != 1) {
                    AndroidUtilities.getViewPositionInParent(currentPeerView.Y0, this, fArr);
                    motionEvent.offsetLocation(-fArr[0], -fArr[1]);
                    d4 currentPeerView2 = i9Var.j0.getCurrentPeerView();
                    currentPeerView2.T2.a(motionEvent, currentPeerView2.Y0, null, null, 0);
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
                        if (i9Var.a0 != 0.0f && !i9Var.c1 && i9Var.l0 < AndroidUtilities.dp(20.0f)) {
                            i9Var.n(i9Var.w.f > 0.5f);
                        }
                        d4 t10 = i9Var.t();
                        if (t10 != null) {
                            t10.G0.s0 = false;
                        }
                    }
                    if (z10 && !i9Var.W) {
                        i9Var.m();
                    }
                    if (!dispatchTouchEvent && (!i9.t1 || !i9Var.m0)) {
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
            d4 currentPeerView22 = i9Var.j0.getCurrentPeerView();
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

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i9 i9Var = this.E0;
        if (i9Var.b && !i9Var.c) {
            org.telegram.ui.ActionBar.o2 o2Var = this.D0;
            AndroidUtilities.requestAdjustResize(o2Var.getParentActivity(), o2Var.getClassGuid());
        }
        mc.a(this, new v8(this));
        NotificationCenter.getInstance(i9Var.h).addObserver(i9Var, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(i9Var.h).addObserver(i9Var, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i9Var.h).addObserver(i9Var, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(i9Var.h).addObserver(i9Var, NotificationCenter.openArticle);
        NotificationCenter.getInstance(i9Var.h).addObserver(i9Var, NotificationCenter.storyDeleted);
    }

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mc.h(this);
        i9 i9Var = this.E0;
        NotificationCenter.getInstance(i9Var.h).removeObserver(i9Var, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(i9Var.h).removeObserver(i9Var, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i9Var.h).removeObserver(i9Var, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(i9Var.h).removeObserver(i9Var, NotificationCenter.openArticle);
        NotificationCenter.getInstance(i9Var.h).removeObserver(i9Var, NotificationCenter.storyDeleted);
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01e4  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f9;
        f2 f2Var;
        h9 h9Var;
        d4 currentPeerView;
        boolean z10;
        m5 m5Var;
        c4 c4Var;
        d4 currentPeerView2;
        b4 b4Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        f2 f2Var2;
        i9 i9Var = this.E0;
        j3 j3Var = i9Var.X0;
        if (motionEvent.getAction() == 0 && i9Var.Q == 1.0f) {
            float x4 = motionEvent.getX();
            this.u0 = x4;
            this.s0 = x4;
            this.t0 = motionEvent.getY();
            i9Var.c0 = false;
            i9Var.b0 = (i9Var.E0 || i9.i(i9Var, i9Var.s, motionEvent.getX(), motionEvent.getY(), false)) ? false : true;
            i9Var.d0 = (i9Var.E0 || i9.i(i9Var, i9Var.s, motionEvent.getX(), motionEvent.getY(), true)) ? false : true;
            i9Var.K(i9Var.b0 && !i9Var.i1);
            d4 t10 = i9Var.t();
            if (i9Var.b0 && t10 != null && (f2Var2 = t10.H0) != null) {
                f2Var2.setAllowTouches(false);
            }
            if (i9Var.b0 && !i9Var.E0 && i9Var.i1) {
                m5 m5Var2 = new m5(this, 12);
                i9Var.j1 = m5Var2;
                AndroidUtilities.runOnUIThread(m5Var2, 150L);
            }
            if (i9Var.b0 && !i9Var.x && !i9Var.E0 && !i9Var.f1) {
                AndroidUtilities.runOnUIThread(j3Var, 400L);
            }
            f9 = 1.0f;
        } else if (motionEvent.getAction() == 2) {
            float abs = Math.abs(this.t0 - motionEvent.getY());
            float abs2 = Math.abs(this.s0 - motionEvent.getX());
            if (i9Var.W0 && i9Var.g0 && !i9Var.b1 && !i9Var.f0 && (c4Var = i9Var.C0) != null && c4Var.b != null && (currentPeerView2 = i9Var.j0.getCurrentPeerView()) != null && (b4Var = currentPeerView2.K1) != null && b4Var.b == null && b4Var.e) {
                long j10 = currentPeerView2.N2;
                if (j10 <= 0 && (storyItem = b4Var.a) != null && (messageMedia = storyItem.media) != null && (document = messageMedia.document) != null) {
                    j10 = (long) (MessageObject.getDocumentDuration(document) * 1000.0d);
                }
                if (j10 > 0) {
                    float x10 = motionEvent.getX();
                    h9 h9Var2 = i9Var.C0.b;
                    f9 = 1.0f;
                    if (((int) (h9Var2.seek((x10 - this.u0) / AndroidUtilities.dp(220.0f), j10) * 10.0f)) != ((int) (h9Var2.currentSeek * 10.0f))) {
                        try {
                            currentPeerView2.performHapticFeedback(9, 1);
                        } catch (Exception unused) {
                        }
                    }
                    currentPeerView2.Y0.invalidate();
                    this.u0 = x10;
                    if (abs > abs2 && !i9Var.g0 && !i9Var.c0 && abs > AndroidUtilities.touchSlop * 2.0f) {
                        i9Var.c0 = true;
                    }
                    if (!i9Var.f0 && !i9Var.g0 && !i9Var.x && i9Var.d0) {
                        if (abs > abs2 && abs > AndroidUtilities.touchSlop * 2.0f) {
                            i9Var.f0 = true;
                            currentPeerView = i9Var.j0.getCurrentPeerView();
                            if (currentPeerView != null) {
                                currentPeerView.p0();
                            }
                            boolean z11 = currentPeerView == null && !currentPeerView.K1.f && (currentPeerView.y1 || (currentPeerView.z1 && currentPeerView.x3));
                            i9Var.h0 = (!z11 || currentPeerView == null || currentPeerView.z1 || currentPeerView.B1 || i9Var.q1 != null) ? false : true;
                            z10 = (z11 || currentPeerView.Y2 || currentPeerView.K1.a == null || i9Var.q1 != null) ? false : true;
                            i9Var.Y = z10;
                            if (z10 && this.f != 0) {
                                i9Var.Y = false;
                            }
                            if (i9Var.Y) {
                                i9Var.p();
                            }
                            i9Var.V = 0.0f;
                            m5Var = i9Var.j1;
                            if (m5Var != null) {
                                AndroidUtilities.cancelRunOnUIThread(m5Var);
                                i9Var.j1.run();
                                i9Var.j1 = null;
                            }
                            AndroidUtilities.cancelRunOnUIThread(j3Var);
                        }
                        i9Var.y();
                    }
                }
            }
            f9 = 1.0f;
            if (abs > abs2) {
                i9Var.c0 = true;
            }
            if (!i9Var.f0) {
                if (abs > abs2) {
                    i9Var.f0 = true;
                    currentPeerView = i9Var.j0.getCurrentPeerView();
                    if (currentPeerView != null) {
                    }
                    if (currentPeerView == null) {
                    }
                    i9Var.h0 = (!z11 || currentPeerView == null || currentPeerView.z1 || currentPeerView.B1 || i9Var.q1 != null) ? false : true;
                    if (z11) {
                    }
                    i9Var.Y = z10;
                    if (z10) {
                        i9Var.Y = false;
                    }
                    if (i9Var.Y) {
                    }
                    i9Var.V = 0.0f;
                    m5Var = i9Var.j1;
                    if (m5Var != null) {
                    }
                    AndroidUtilities.cancelRunOnUIThread(j3Var);
                }
                i9Var.y();
            }
        } else {
            f9 = 1.0f;
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                AndroidUtilities.cancelRunOnUIThread(j3Var);
                m5 m5Var3 = i9Var.j1;
                if (m5Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(m5Var3);
                    i9Var.j1 = null;
                }
                i9Var.K(false);
                i9Var.c0 = false;
                i9Var.g0 = false;
                c4 c4Var2 = i9Var.C0;
                if (c4Var2 != null && (h9Var = c4Var2.b) != null) {
                    h9Var.setSeeking(false);
                }
                d4 t11 = i9Var.t();
                if (t11 != null && (f2Var = t11.H0) != null) {
                    f2Var.setAllowTouches(true);
                }
            }
        }
        l5 l5Var = i9Var.w;
        boolean z12 = l5Var != null && l5Var.f == f9;
        if (!i9Var.f0 && !z12) {
            i9Var.e0.onTouchEvent(motionEvent);
        }
        return i9Var.f0 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        i9 i9Var = this.E0;
        ((FrameLayout.LayoutParams) i9Var.Z0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(2.0f);
        i9Var.Z0.getLayoutParams().height = AndroidUtilities.dp(2.0f);
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f2 f2Var;
        int action = motionEvent.getAction();
        i9 i9Var = this.E0;
        int i10 = 1;
        if (action == 1 || motionEvent.getAction() == 3) {
            i9Var.f0 = false;
            i9Var.K(false);
            if (i9Var.R >= 1.0f) {
                i9Var.q(true);
            } else if (!i9Var.D0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i9Var.S, 0.0f);
                i9Var.C = ofFloat;
                ofFloat.addUpdateListener(new t8(this, i10));
                i9Var.C.addListener(new u8(this, i10));
                i9Var.C.setDuration(150L);
                i9Var.C.setInterpolator(jr.f);
                i9Var.C.start();
            }
            d4 t10 = i9Var.t();
            if (t10 != null && (f2Var = t10.H0) != null) {
                f2Var.setAllowTouches(true);
            }
        }
        if (!i9Var.f0 && !i9Var.x && i9Var.V == 0.0f && ((i9Var.a0 == 0.0f || (!i9Var.b0 && !i9Var.c0)) && !i9Var.f1)) {
            return false;
        }
        i9Var.e0.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        this.E0.b0 = false;
    }
}
