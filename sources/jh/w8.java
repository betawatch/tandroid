package jh;

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
import hh.y9;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.si0;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.zu0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class w8 extends zu0 {
    public final RectF A0;
    public final RectF B0;
    public final SparseArray C0;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 D0;
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
    public w8(i9 i9Var, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null);
        this.E0 = i9Var;
        this.D0 = n2Var;
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
    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        char c10;
        char c11;
        float f11;
        a4 a4Var;
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
        h7 h7Var;
        float f21;
        Paint paint;
        View view;
        h7 h7Var2;
        d9 d9Var;
        c9 c9Var;
        e4 currentPeerView;
        j3 j3Var;
        h7 h7Var3;
        int i10;
        e4 t10;
        si0 si0Var;
        i9 i9Var = this.E0;
        RectF rectF5 = i9Var.P;
        f9 f9Var = i9Var.o0;
        canvas.drawColor(i0.b.k(-16777216, (int) ((((1.0f - i9Var.R) * 0.5f) + 0.5f) * i9Var.Q * 255.0f)));
        if (i9Var.b) {
            boolean z10 = (1.0f - i9Var.R) * i9Var.Q == 1.0f;
            if (i9Var.G0 != z10) {
                i9Var.G0 = z10;
                org.telegram.ui.ActionBar.n2 n2Var = this.D0;
                if (n2Var.getLayoutContainer() != null) {
                    n2Var.getLayoutContainer().invalidate();
                }
            }
        }
        e4 currentPeerView2 = i9Var.j0.getCurrentPeerView();
        RectF rectF6 = this.B0;
        RectF rectF7 = this.A0;
        if (currentPeerView2 != null) {
            a4 a4Var2 = currentPeerView2.k1;
            if (i9Var.R0) {
                a4Var2.a.getImageReceiver().setVisible(i9Var.Q == 1.0f, true);
            } else {
                a4Var2.a.getImageReceiver().setVisible(true, false);
            }
            if (i9Var.d1) {
                i9Var.d1 = false;
                z3 z3Var = a4Var2.a;
                float f22 = 0.0f;
                float f23 = 0.0f;
                f10 = 255.0f;
                c10 = 1;
                for (View view2 = a4Var2.a; view2 != this; view2 = (View) view2.getParent()) {
                    if (view2.getParent() == this) {
                        f22 += view2.getLeft();
                        f23 += view2.getTop();
                    } else if (view2.getParent() != i9Var.j0) {
                        f22 += view2.getX();
                        f23 += view2.getY();
                    }
                }
                c11 = 0;
                f11 = 1.0f;
                rectF7.set(f22, f23, z3Var.getMeasuredWidth() + f22, z3Var.getMeasuredHeight() + f23);
                rectF6.set(0.0f, currentPeerView2.Y0.getTop() + currentPeerView2.getTop(), i9Var.v.getMeasuredWidth(), i9Var.v.getMeasuredHeight());
                i9Var.v.getMatrix().mapRect(rectF7);
                i9Var.v.getMatrix().mapRect(rectF6);
            } else {
                f10 = 255.0f;
                c10 = 1;
                c11 = 0;
                f11 = 1.0f;
            }
            a4Var = a4Var2;
        } else {
            f10 = 255.0f;
            c10 = 1;
            c11 = 0;
            f11 = 1.0f;
            a4Var = null;
        }
        i9Var.Z0.setAlpha(f11 - i9Var.R);
        float clamp = i9Var.T == 0.0f ? 1.0f - Utilities.clamp(Math.abs(i9Var.S / getMeasuredHeight()), 1.0f, 0.0f) : 1.0f;
        i9Var.j0.setHorizontalProgressToDismiss((i9Var.T / i9Var.v.getMeasuredWidth()) * i9Var.Q);
        if (i9Var.J != 0.0f || i9Var.K != 0.0f) {
            float f24 = i9Var.Q;
            if (f24 != 1.0f) {
                if (i9Var.D0 && i9Var.R0) {
                    float clamp2 = 1.0f - Utilities.clamp(((1.0f - f24) - 0.8f) / 0.100000024f, 1.0f, 0.0f);
                    f12 = 0.15f;
                    f13 = Utilities.clamp(pa.b(1.0f, clamp2, 0.05f, f24), 1.0f, 0.0f);
                    c12 = 2;
                    i9Var.v.setAlpha(clamp2);
                } else {
                    f12 = 0.15f;
                    c12 = 2;
                    i9Var.v.setAlpha(1.0f);
                    f13 = f24;
                }
                if (!i9Var.D0 || f9Var == null || f9Var.c == null) {
                    rectF = rectF7;
                } else {
                    x8 x8Var = i9Var.v;
                    rectF = rectF7;
                    x8Var.setAlpha(x8Var.getAlpha() * ((float) Math.pow(f24, 0.20000000298023224d)));
                }
                x8 x8Var2 = i9Var.v;
                float left = (i9Var.J - x8Var2.getLeft()) - (i9Var.v.getMeasuredWidth() / 2.0f);
                float f25 = i9Var.Q;
                x8Var2.setTranslationX((i9Var.T * f25) + ((1.0f - f25) * left));
                x8 x8Var3 = i9Var.v;
                float top = (i9Var.K - x8Var3.getTop()) - (i9Var.v.getMeasuredHeight() / 2.0f);
                float f26 = i9Var.Q;
                x8Var3.setTranslationY((i9Var.S * f26) + ((1.0f - f26) * top));
                float lerp = AndroidUtilities.lerp(i9Var.N / i9Var.v.getMeasuredWidth(), (clamp * f12) + 0.85f, f13);
                i9Var.v.setScaleX(lerp);
                i9Var.v.setScaleY(lerp);
                Path path = this.w0;
                path.rewind();
                float f27 = i9Var.J;
                float f28 = i9Var.N / 2.0f;
                float f29 = i9Var.K;
                float f30 = i9Var.O / 2.0f;
                float f31 = f30 + f29;
                RectF rectF8 = this.x0;
                rectF8.set(f27 - f28, f29 - f30, f28 + f27, f31);
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
                float lerp4 = AndroidUtilities.lerp(rectF8.height(), rectF9.height(), f13);
                float lerp5 = AndroidUtilities.lerp(rectF8.width(), rectF9.width(), f13);
                if (i9Var.D0 && i9Var.R0) {
                    f14 = lerp2;
                    rectF8.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
                } else {
                    f14 = lerp2;
                }
                RectF rectF10 = AndroidUtilities.rectTmp;
                float f32 = lerp5 / 2.0f;
                float f33 = lerp4 / 2.0f;
                rectF10.set(f14 - f32, lerp3 - f33, f14 + f32, lerp3 + f33);
                boolean z12 = i9Var.R0;
                float[] fArr2 = this.v0;
                if (z12) {
                    float lerp6 = AndroidUtilities.lerp(i9Var.N / 2.0f, 0.0f, f13);
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
                    int[] iArr = i9Var.S0;
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
                        f16 = i9Var.L;
                        if (f16 != f15 && i9Var.M != f15) {
                            canvas.clipRect(f15, AndroidUtilities.lerp(f15, f16, (float) Math.pow(1.0f - i9Var.Q, 0.4000000059604645d)), getMeasuredWidth(), AndroidUtilities.lerp(getMeasuredHeight(), i9Var.M, 1.0f - i9Var.Q));
                        }
                        if (f9Var == null && (h7Var3 = f9Var.m) != null && h7Var3.w && i9Var.R0) {
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
                        if (f9Var != null || f9Var.c == null || (currentPeerView = i9Var.j0.getCurrentPeerView()) == null || (j3Var = currentPeerView.Y0) == null) {
                            f17 = f24;
                            rectF4 = rectF2;
                            f18 = 0.0f;
                        } else {
                            boolean visible = f9Var.c.getVisible();
                            f18 = 0.0f;
                            rectF9.set(j3Var.getX() + currentPeerView.getX() + i9Var.T + i9Var.v.getLeft(), j3Var.getY() + currentPeerView.getY() + i9Var.S + i9Var.v.getTop(), ((i9Var.T + i9Var.v.getRight()) - (i9Var.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - j3Var.getRight()), ((i9Var.S + i9Var.v.getBottom()) - (i9Var.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - j3Var.getBottom()));
                            AndroidUtilities.lerp(rectF2, rectF9, f24, rectF11);
                            float imageX = f9Var.c.getImageX();
                            float imageY = f9Var.c.getImageY();
                            float imageWidth = f9Var.c.getImageWidth();
                            float imageHeight = f9Var.c.getImageHeight();
                            f9Var.c.setImageCoords(rectF11);
                            float f34 = 1.0f - f24;
                            f9Var.c.setAlpha(f34);
                            f17 = f24;
                            rectF4 = rectF2;
                            f9Var.c.setVisible(true, false);
                            int saveCount = canvas.getSaveCount();
                            c9 c9Var2 = f9Var.f;
                            if (c9Var2 != null) {
                                c9Var2.d(f34, canvas, rectF11, i9Var.A);
                            }
                            f9Var.c.draw(canvas);
                            d9 d9Var2 = f9Var.e;
                            if (d9Var2 != null) {
                                d9Var2.d(canvas, rectF11, f34);
                            }
                            f9Var.c.setVisible(visible, false);
                            f9Var.c.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                            canvas.restoreToCount(saveCount);
                        }
                        canvas.restore();
                        if (a4Var != null) {
                            z3 z3Var2 = a4Var.a;
                            float f35 = i9Var.T;
                            float f36 = i9Var.S;
                            if (i9Var.D0 && i9Var.R0) {
                                rectF9.set(rectF);
                            } else {
                                for (View view3 = z3Var2; view3 != this && view3 != null; view3 = (View) view3.getParent()) {
                                    if (view3.getParent() == this) {
                                        f35 += view3.getLeft();
                                        f36 += view3.getTop();
                                    } else if (view3.getParent() != i9Var.j0) {
                                        float x8 = view3.getX() + f35;
                                        f36 = view3.getY() + f36;
                                        f35 = x8;
                                    }
                                    if (!(view3.getParent() instanceof View)) {
                                        break;
                                    }
                                }
                                rectF9.set(f35, f36, z3Var2.getMeasuredWidth() + f35, z3Var2.getMeasuredHeight() + f36);
                            }
                            AndroidUtilities.lerp(rectF4, rectF9, i9Var.Q, rectF11);
                            int saveCount2 = canvas.getSaveCount();
                            if (f9Var != null && (c9Var = f9Var.f) != null) {
                                c9Var.d(1.0f - f17, canvas, rectF11, i9Var.A);
                            }
                            if (i9Var.R0) {
                                boolean z13 = (f9Var == null || f9Var.l == null) ? false : true;
                                if (z13 && i9Var.Q == f18) {
                                    f19 = f17;
                                } else {
                                    if (f9Var != null && (h7Var2 = f9Var.m) != null && h7Var2.w) {
                                        canvas.saveLayerAlpha(rectF11.left - AndroidUtilities.dp(4.0f), rectF11.top - AndroidUtilities.dp(4.0f), rectF11.right + AndroidUtilities.dp(4.0f), rectF11.bottom + AndroidUtilities.dp(4.0f), 255, 31);
                                    }
                                    z3Var2.getImageReceiver().setImageCoords(rectF11);
                                    z3Var2.getImageReceiver().setRoundRadius((int) AndroidUtilities.lerp(rectF11.width() / 2.0f, ((f9Var == null || f9Var.b == null) ? null : Integer.valueOf((int) (f9Var.b.getRoundRadius()[0] * ((!f9Var.n || (view = f9Var.a) == null || view.getParent() == null) ? 1.0f : ((ViewGroup) f9Var.a.getParent()).getScaleY())))) != null ? r4.intValue() : rectF11.width() / 2.0f, 1.0f - i9Var.Q));
                                    z3Var2.getImageReceiver().setVisible(true, false);
                                    float f37 = z13 ? i9Var.Q : 1.0f;
                                    if (f9Var == null || f9Var.k >= 1.0f || (paint = f9Var.j) == null) {
                                        f19 = f17;
                                        f20 = f37;
                                    } else {
                                        paint.setAlpha((int) ((1.0f - f17) * f10));
                                        canvas.drawCircle(rectF11.centerX(), rectF11.centerY(), rectF11.width() / 2.0f, f9Var.j);
                                        f19 = f17;
                                        f20 = AndroidUtilities.lerp(f9Var.k, f37, f19);
                                    }
                                    z3Var2.getImageReceiver().setAlpha(f20);
                                    a4Var.b(i9Var.Q, canvas, rectF11, !i9.w1);
                                    z3Var2.getImageReceiver().draw(canvas);
                                    z3Var2.getImageReceiver().setAlpha(f37);
                                    z3Var2.getImageReceiver().setVisible(false, false);
                                    if (f9Var != null && (h7Var = f9Var.m) != null && h7Var.w) {
                                        RectF rectF12 = AndroidUtilities.rectTmp;
                                        rectF12.set(rectF11);
                                        f21 = 1.0f;
                                        l7.k(canvas, rectF12, 1.0f - i9Var.Q, true, 0.0f);
                                        canvas.restore();
                                        if (i9Var.Q != f21 && z13) {
                                            RectF rectF13 = rectF3;
                                            rectF13.set(f9Var.l.getImageX(), f9Var.l.getImageY(), f9Var.l.getImageX2(), f9Var.l.getImageY2());
                                            int i11 = f9Var.l.getRoundRadius()[0];
                                            boolean visible2 = f9Var.l.getVisible();
                                            f9Var.l.setImageCoords(rectF11);
                                            f9Var.l.setRoundRadius((int) (rectF11.width() / 2.0f));
                                            f9Var.l.setVisible(true, false);
                                            canvas.saveLayerAlpha(rectF11, (int) ((1.0f - i9Var.Q) * f10), 31);
                                            f9Var.l.draw(canvas);
                                            canvas.restore();
                                            f9Var.l.setVisible(visible2, false);
                                            f9Var.l.setImageCoords(rectF13);
                                            f9Var.l.setRoundRadius(i11);
                                        }
                                        if (f9Var != null && (d9Var = f9Var.e) != null) {
                                            d9Var.d(canvas, rectF11, 1.0f - f19);
                                        }
                                    }
                                }
                                f21 = 1.0f;
                                if (i9Var.Q != f21) {
                                    RectF rectF132 = rectF3;
                                    rectF132.set(f9Var.l.getImageX(), f9Var.l.getImageY(), f9Var.l.getImageX2(), f9Var.l.getImageY2());
                                    int i112 = f9Var.l.getRoundRadius()[0];
                                    boolean visible22 = f9Var.l.getVisible();
                                    f9Var.l.setImageCoords(rectF11);
                                    f9Var.l.setRoundRadius((int) (rectF11.width() / 2.0f));
                                    f9Var.l.setVisible(true, false);
                                    canvas.saveLayerAlpha(rectF11, (int) ((1.0f - i9Var.Q) * f10), 31);
                                    f9Var.l.draw(canvas);
                                    canvas.restore();
                                    f9Var.l.setVisible(visible22, false);
                                    f9Var.l.setImageCoords(rectF132);
                                    f9Var.l.setRoundRadius(i112);
                                }
                                if (f9Var != null) {
                                    d9Var.d(canvas, rectF11, 1.0f - f19);
                                }
                            }
                            canvas.restoreToCount(saveCount2);
                        }
                        if (i9Var.I != null) {
                            float clamp3 = Utilities.clamp(i9Var.Q / 0.4f, 1.0f, 0.0f);
                            if (clamp3 != 1.0f) {
                                RectF rectF14 = AndroidUtilities.rectTmp;
                                float f38 = i9Var.J;
                                float f39 = i9Var.K;
                                rectF14.set(f38, f39, i9Var.N + f38, i9Var.O + f39);
                                rectF14.inset(-AndroidUtilities.dp(16.0f), -AndroidUtilities.dp(16.0f));
                                if (clamp3 != 0.0f) {
                                    canvas.saveLayerAlpha(rectF14, (int) ((1.0f - clamp3) * f10), 31);
                                } else {
                                    canvas.save();
                                }
                                canvas.translate(i9Var.G, i9Var.H);
                                ((org.telegram.ui.Cells.p2) i9Var.I).C(canvas);
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
                            if (f9Var.d != null && (t10 = i9Var.t()) != null && (si0Var = t10.k1.d) != null) {
                                si0 si0Var2 = f9Var.d;
                                si0Var.c = si0Var2.c;
                                si0Var.f = si0Var2.f;
                                si0Var.b = si0Var2.b;
                                si0Var.a = System.currentTimeMillis();
                                si0Var.c();
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
                            i9Var.B.setInterpolator(er.f);
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
                    float lerp7 = AndroidUtilities.lerp(iArr[c11], 0, f24);
                    fArr[c10] = lerp7;
                    fArr[0] = lerp7;
                    float lerp8 = AndroidUtilities.lerp(i9Var.S0[c10], 0, f24);
                    fArr[3] = lerp8;
                    fArr[c12] = lerp8;
                    float lerp9 = AndroidUtilities.lerp(i9Var.S0[c12], 0, f24);
                    fArr[5] = lerp9;
                    fArr[4] = lerp9;
                    float lerp10 = AndroidUtilities.lerp(i9Var.S0[3], 0, f24);
                    fArr[7] = lerp10;
                    fArr[6] = lerp10;
                }
                f15 = 0.0f;
                path.addRoundRect(rectF10, fArr, Path.Direction.CCW);
                canvas.save();
                f16 = i9Var.L;
                if (f16 != f15) {
                    canvas.clipRect(f15, AndroidUtilities.lerp(f15, f16, (float) Math.pow(1.0f - i9Var.Q, 0.4000000059604645d)), getMeasuredWidth(), AndroidUtilities.lerp(getMeasuredHeight(), i9Var.M, 1.0f - i9Var.Q));
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
                f17 = f24;
                rectF4 = rectF2;
                f18 = 0.0f;
                canvas.restore();
                if (a4Var != null) {
                }
                if (i9Var.I != null) {
                }
                canvas.restore();
                if (i9.w1) {
                }
            }
        }
        i9Var.v.setAlpha(i9Var.Q);
        float f40 = (clamp * 0.15f) + (i9Var.Q * 0.1f) + 0.75f;
        i9Var.v.setScaleX(f40);
        i9Var.v.setScaleY(f40);
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
        wj0 wj0Var;
        i9 i9Var = this.E0;
        float[] fArr = i9Var.k0;
        e4 currentPeerView = i9Var.j0.getCurrentPeerView();
        if (currentPeerView != null) {
            n3 n3Var = currentPeerView.G0;
            if (n3Var.S.y()) {
                float x8 = currentPeerView.getX();
                float y10 = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x8, -y10);
                if (!n3Var.S.o(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x8, y10);
                }
                return true;
            }
        }
        float f10 = 0.0f;
        int i11 = 0;
        if (i9Var.l1 && currentPeerView != null && (wj0Var = currentPeerView.n3) != null) {
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
            wj0Var.getHitRect(rect);
            rect.offset((int) f10, (int) f11);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.b1(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            wj0Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            i9Var.f0 = false;
            AndroidUtilities.cancelRunOnUIThread(i9Var.X0);
            float f12 = i9Var.T;
            if (f12 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, 0.0f);
                i9Var.C = ofFloat;
                ofFloat.addUpdateListener(new t8(this, i11));
                i9Var.C.addListener(new u8(this, i11));
                i9Var.C.setDuration(250L);
                i9Var.C.setInterpolator(er.f);
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
                ag.d dVar = currentPeerView.u0;
                n8 n8Var = currentPeerView.y0;
                j3 j3Var = currentPeerView.Y0;
                lh.w3 w3Var = currentPeerView.B0;
                if (w3Var != null && w3Var.R && n8Var != null && !w3Var.n0.contains(motionEvent.getX() - (currentPeerView.B0.getX() + (j3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.B0.getY() + (j3Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, n8Var)) {
                    currentPeerView.B0.e(true);
                }
                lh.w3 w3Var2 = currentPeerView.C0;
                if (w3Var2 != null && w3Var2.R && dVar != null && !w3Var2.n0.contains(motionEvent.getX() - (currentPeerView.C0.getX() + (j3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.C0.getY() + (j3Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, dVar)) {
                    currentPeerView.C0.e(true);
                }
            }
            i9Var.j0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        boolean z12 = (i9Var.x || i9Var.D0 || i9Var.E0) ? false : true;
        float f13 = i9Var.a0;
        SparseArray sparseArray = this.C0;
        if (f13 == 0.0f && !i9Var.f0 && i9Var.j0.B0 == 1 && motionEvent.getAction() == 2 && z12) {
            float floatValue = ((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0);
            if ((floatValue != 0.0f && (((i10 = (y8Var = i9Var.j0).E0) == 0 && y8Var.G0 == 0.0f && floatValue < 0.0f) || (i10 == y8Var.getAdapter().b() - 1 && y8Var.G0 == 0.0f && floatValue > 0.0f))) || i9Var.T != 0.0f) {
                float f14 = i9Var.T;
                if (f14 == 0.0f) {
                    i9Var.U = -floatValue;
                }
                if ((floatValue < 0.0f && i9Var.U > 0.0f) || (floatValue > 0.0f && i9Var.U < 0.0f)) {
                    floatValue *= 0.2f;
                }
                i9Var.T = f14 - floatValue;
                i9.k(i9Var);
                float f15 = i9Var.T;
                if ((f15 > 0.0f && i9Var.U < 0.0f) || (f15 < 0.0f && i9Var.U > 0.0f)) {
                    i9Var.T = 0.0f;
                }
                z11 = true;
                if (currentPeerView != null && i9Var.a0 == 0.0f && !i9Var.f0 && !i9Var.H0 && !i9Var.E0 && i9Var.j0.B0 != 1) {
                    AndroidUtilities.getViewPositionInParent(currentPeerView.Y0, this, fArr);
                    motionEvent.offsetLocation(-fArr[0], -fArr[1]);
                    e4 currentPeerView2 = i9Var.j0.getCurrentPeerView();
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
                        e4 t10 = i9Var.t();
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
            e4 currentPeerView22 = i9Var.j0.getCurrentPeerView();
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

    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i9 i9Var = this.E0;
        if (i9Var.b && !i9Var.c) {
            org.telegram.ui.ActionBar.n2 n2Var = this.D0;
            AndroidUtilities.requestAdjustResize(n2Var.getParentActivity(), n2Var.getClassGuid());
        }
        ec.a(this, new v8(this));
        NotificationCenter.getInstance(i9Var.h).addObserver(i9Var, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(i9Var.h).addObserver(i9Var, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i9Var.h).addObserver(i9Var, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(i9Var.h).addObserver(i9Var, NotificationCenter.openArticle);
        NotificationCenter.getInstance(i9Var.h).addObserver(i9Var, NotificationCenter.storyDeleted);
    }

    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ec.h(this);
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
        float f10;
        g2 g2Var;
        h9 h9Var;
        e4 currentPeerView;
        boolean z10;
        y9 y9Var;
        d4 d4Var;
        e4 currentPeerView2;
        c4 c4Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        g2 g2Var2;
        i9 i9Var = this.E0;
        l3 l3Var = i9Var.X0;
        if (motionEvent.getAction() == 0 && i9Var.Q == 1.0f) {
            float x8 = motionEvent.getX();
            this.u0 = x8;
            this.s0 = x8;
            this.t0 = motionEvent.getY();
            i9Var.c0 = false;
            i9Var.b0 = (i9Var.E0 || i9.i(i9Var, i9Var.s, motionEvent.getX(), motionEvent.getY(), false)) ? false : true;
            i9Var.d0 = (i9Var.E0 || i9.i(i9Var, i9Var.s, motionEvent.getX(), motionEvent.getY(), true)) ? false : true;
            i9Var.K(i9Var.b0 && !i9Var.i1);
            e4 t10 = i9Var.t();
            if (i9Var.b0 && t10 != null && (g2Var2 = t10.H0) != null) {
                g2Var2.setAllowTouches(false);
            }
            if (i9Var.b0 && !i9Var.E0 && i9Var.i1) {
                y9 y9Var2 = new y9(this, 28);
                i9Var.j1 = y9Var2;
                AndroidUtilities.runOnUIThread(y9Var2, 150L);
            }
            if (i9Var.b0 && !i9Var.x && !i9Var.E0 && !i9Var.f1) {
                AndroidUtilities.runOnUIThread(l3Var, 400L);
            }
            f10 = 1.0f;
        } else if (motionEvent.getAction() == 2) {
            float abs = Math.abs(this.t0 - motionEvent.getY());
            float abs2 = Math.abs(this.s0 - motionEvent.getX());
            if (i9Var.W0 && i9Var.g0 && !i9Var.b1 && !i9Var.f0 && (d4Var = i9Var.C0) != null && d4Var.b != null && (currentPeerView2 = i9Var.j0.getCurrentPeerView()) != null && (c4Var = currentPeerView2.K1) != null && c4Var.b == null && c4Var.e) {
                long j10 = currentPeerView2.N2;
                if (j10 <= 0 && (storyItem = c4Var.a) != null && (messageMedia = storyItem.media) != null && (document = messageMedia.document) != null) {
                    j10 = (long) (MessageObject.getDocumentDuration(document) * 1000.0d);
                }
                if (j10 > 0) {
                    float x10 = motionEvent.getX();
                    h9 h9Var2 = i9Var.C0.b;
                    f10 = 1.0f;
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
                            y9Var = i9Var.j1;
                            if (y9Var != null) {
                                AndroidUtilities.cancelRunOnUIThread(y9Var);
                                i9Var.j1.run();
                                i9Var.j1 = null;
                            }
                            AndroidUtilities.cancelRunOnUIThread(l3Var);
                        }
                        i9Var.y();
                    }
                }
            }
            f10 = 1.0f;
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
                    y9Var = i9Var.j1;
                    if (y9Var != null) {
                    }
                    AndroidUtilities.cancelRunOnUIThread(l3Var);
                }
                i9Var.y();
            }
        } else {
            f10 = 1.0f;
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                AndroidUtilities.cancelRunOnUIThread(l3Var);
                y9 y9Var3 = i9Var.j1;
                if (y9Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(y9Var3);
                    i9Var.j1 = null;
                }
                i9Var.K(false);
                i9Var.c0 = false;
                i9Var.g0 = false;
                d4 d4Var2 = i9Var.C0;
                if (d4Var2 != null && (h9Var = d4Var2.b) != null) {
                    h9Var.setSeeking(false);
                }
                e4 t11 = i9Var.t();
                if (t11 != null && (g2Var = t11.H0) != null) {
                    g2Var.setAllowTouches(true);
                }
            }
        }
        k5 k5Var = i9Var.w;
        boolean z12 = k5Var != null && k5Var.f == f10;
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
        g2 g2Var;
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
                i9Var.C.setInterpolator(er.f);
                i9Var.C.start();
            }
            e4 t10 = i9Var.t();
            if (t10 != null && (g2Var = t10.H0) != null) {
                g2Var.setAllowTouches(true);
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
