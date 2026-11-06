package org.telegram.ui.ActionBar;

import a8.r9;
import android.R;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.qs;
import org.telegram.messenger.z8;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class k3 extends View {
    public float D;
    public float E;
    public long F;
    public boolean G;
    public boolean H;
    public VelocityTracker I;
    public float J;
    public boolean K;
    public float L;
    public Bitmap M;
    public BitmapShader N;
    public Paint O;
    public Matrix P;
    public final RectF Q;
    public final ArrayList R;
    public View S;
    public ValueAnimator T;
    public boolean U;
    public float V;
    public ValueAnimator W;
    public d3 a;
    public final int[] a0;
    public h3 b;
    public final int[] b0;
    public a3 c;
    public final RectF c0;
    public ValueAnimator d;
    public final RectF d0;
    public float e;
    public final RectF e0;
    public final org.telegram.ui.Components.w5 f;
    public final Path f0;
    public my0 g0;
    public final OverScroller h;
    public boolean h0;
    public org.telegram.ui.Cells.y i0;
    public h6.m j0;
    public final int n;
    public final int r;
    public int s;
    public final fi.f6 w;
    public j3 x;
    public boolean y;

    public k3(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f = new org.telegram.ui.Components.w5(this, 0L, 350L, xq.h);
        this.Q = new RectF();
        this.R = new ArrayList();
        this.a0 = new int[2];
        this.b0 = new int[2];
        this.c0 = new RectF();
        this.d0 = new RectF();
        this.e0 = new RectF();
        this.f0 = new Path();
        setWillNotDraw(false);
        this.h = new OverScroller(launchActivity);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(launchActivity);
        this.n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.r = viewConfiguration.getScaledMinimumFlingVelocity();
        fi.f6 f6Var = new fi.f6(this, this);
        this.w = f6Var;
        r0.i0.j(this, f6Var);
        setImportantForAccessibility(2);
        r0.a0.i(this, new l2.y(this, 29));
    }

    public static void g(ViewGroup viewGroup, float f10, final org.telegram.messenger.voip.k kVar) {
        if (viewGroup.getWidth() <= 0 || viewGroup.getHeight() <= 0) {
            kVar.a(null);
            return;
        }
        final SurfaceTexture c10 = z8.c();
        c10.setDefaultBufferSize(viewGroup.getWidth(), viewGroup.getHeight());
        final Surface surface = new Surface(c10);
        final Bitmap createBitmap = Bitmap.createBitmap(viewGroup.getWidth(), viewGroup.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
        lockHardwareCanvas.translate(0.0f, f10);
        viewGroup.draw(lockHardwareCanvas);
        surface.unlockCanvasAndPost(lockHardwareCanvas);
        PixelCopy.request(surface, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: org.telegram.ui.ActionBar.g3
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i7) {
                org.telegram.messenger.voip.k kVar2 = org.telegram.messenger.voip.k.this;
                Bitmap bitmap = createBitmap;
                Surface surface2 = surface;
                SurfaceTexture surfaceTexture = c10;
                if (i7 == 0) {
                    kVar2.a(bitmap);
                } else {
                    bitmap.recycle();
                    kVar2.a(null);
                }
                surface2.release();
                surfaceTexture.release();
            }
        }, new Handler());
    }

    private float getScrollStep() {
        return org.telegram.messenger.g0.L(200.0f);
    }

    private void setModalAccessibility(boolean z9) {
        setImportantForAccessibility(z9 ? 1 : 2);
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (childAt != this) {
                    childAt.setImportantForAccessibility(z9 ? 4 : 0);
                }
            }
        }
        fi.f6 f6Var = this.w;
        if (f6Var != null) {
            f6Var.i();
        }
        if (z9) {
            sendAccessibilityEvent(32);
        }
    }

    public final void a(boolean z9) {
        if (this.U == z9) {
            return;
        }
        ValueAnimator valueAnimator = this.W;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.U = z9;
        d3 d3Var = this.a;
        if (d3Var != null) {
            d3Var.b = false;
            d3Var.invalidate();
        }
        setModalAccessibility(z9);
        invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, z9 ? 1.0f : 0.0f);
        this.W = ofFloat;
        ofFloat.addUpdateListener(new e3(this, 0));
        this.W.addListener(new m.a(this, 11));
        this.W.setInterpolator(xq.h);
        this.W.setDuration(320L);
        this.W.start();
    }

    public final void b(h3 h3Var) {
        ValueAnimator valueAnimator;
        if (this.a == null) {
            return;
        }
        if (this.b != null && (valueAnimator = this.d) != null) {
            valueAnimator.end();
            this.d = null;
        }
        this.b = h3Var;
        h3Var.b(false);
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        c3 c10 = h3Var.c();
        d3 d3Var = this.a;
        ArrayList<c3> tabs = d3Var.getTabs();
        ArrayList<a3> tabDrawables = d3Var.getTabDrawables();
        a3 a3Var = new a3(d3Var, c10);
        a3Var.e.e(true, -1.0f);
        a3Var.f.e(true, 0.0f);
        tabDrawables.add(a3Var);
        tabs.add(0, c10);
        for (int i7 = 0; i7 < tabDrawables.size(); i7++) {
            a3 a3Var2 = tabDrawables.get(i7);
            int indexOf = tabs.indexOf(a3Var2.a);
            a3Var2.d = indexOf;
            if (indexOf >= 0) {
                a3Var2.c = indexOf;
            }
        }
        d3Var.n();
        d3Var.o(true);
        d3Var.invalidate();
        b3 b3Var = d3Var.e;
        if (b3Var != null) {
            b3Var.i();
        }
        this.c = a3Var;
        post(new l2.w(h3Var, 24));
        invalidate();
        this.e = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.addUpdateListener(new e3(this, 2));
        this.d.addListener(new di.h3(this, c10, h3Var, 2));
        org.telegram.messenger.g0.n(this.d, 220.0d, 30.0d);
        this.d.setDuration((long) (r11.getDuration() * 1.1f));
        this.d.start();
    }

    public final float c(boolean z9) {
        return (e(z9) - Math.min(3.0f, e(z9))) - (Utilities.i(4.0f - e(z9), 0.5f, 0.0f) * (Math.min(3.0f, e(z9)) / 3.0f));
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.h.computeScrollOffset()) {
            setScrollOffset(r0.getCurrY() / getScrollStep());
            postInvalidateOnAnimation();
        }
    }

    public final float d(boolean z9) {
        return Utilities.i(e(z9), 1.0f, 0.0f) * ((-getScrollWindow()) / 3.0f);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        ArrayList arrayList;
        float f10;
        int i7;
        float f11;
        int i10;
        int i11;
        float f12;
        float f13;
        ArrayList arrayList2;
        float f14;
        RectF rectF2;
        int i12;
        float f15;
        float f16;
        k3 k3Var = this;
        super.dispatchDraw(canvas);
        h3 h3Var = k3Var.b;
        float f17 = 1.0f;
        int i13 = 1;
        int[] iArr = k3Var.a0;
        int[] iArr2 = k3Var.b0;
        int i14 = 0;
        RectF rectF3 = k3Var.c0;
        if (h3Var != null) {
            k3Var.getLocationOnScreen(iArr2);
            k3Var.a.getLocationOnScreen(iArr);
            k3Var.a.d(rectF3, 0.0f);
            rectF3.offset(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
            canvas.save();
            canvas.clipRect(0, 0, k3Var.getMeasuredWidth(), k3Var.getMeasuredHeight() - k3Var.s);
            i3 d = k3Var.b.d();
            float f18 = k3Var.e;
            RectF rectF4 = k3Var.e0;
            float z9 = d.z(canvas, rectF3, f18, rectF4, f18);
            if (k3Var.c != null) {
                Path path = k3Var.f0;
                path.rewind();
                path.addRoundRect(rectF4, z9, z9, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float v = com.google.android.recaptcha.internal.a.v(1.0f, k3Var.e, org.telegram.messenger.g0.L(50.0f), rectF4.top);
                rectF3.set(rectF4.left, v, rectF4.right, org.telegram.messenger.g0.L(50.0f) + v);
                k3Var.a.setupTab(k3Var.c);
                k3Var.c.a(canvas, rectF3, z9, k3Var.e, 1.0f);
                rectF = rectF3;
                canvas.restore();
            } else {
                rectF = rectF3;
            }
            canvas.restore();
        } else {
            rectF = rectF3;
        }
        if (k3Var.V <= 0.0f) {
            return;
        }
        canvas.save();
        View view = k3Var.S;
        RectF rectF5 = k3Var.Q;
        if (view != null) {
            view.getLocationOnScreen(iArr);
            k3Var.getLocationOnScreen(iArr2);
            rectF5.set(iArr[0] - iArr2[0], iArr[1] - iArr2[1], k3Var.S.getWidth() + r1, k3Var.S.getHeight() + (iArr[1] - iArr2[1]));
        } else {
            iArr[1] = 0;
            iArr[0] = 0;
            rectF5.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        canvas.clipRect(rectF5);
        canvas.translate(rectF5.left, rectF5.top);
        float width = rectF5.width();
        float height = rectF5.height();
        float f19 = 255.0f;
        if (k3Var.M != null) {
            k3Var.P.reset();
            float width2 = rectF5.width() / k3Var.M.getWidth();
            k3Var.P.postScale(width2, width2);
            k3Var.N.setLocalMatrix(k3Var.P);
            k3Var.O.setAlpha((int) (k3Var.V * 255.0f));
            canvas.drawRect(0.0f, 0.0f, width, height, k3Var.O);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, width, height, qs.e4, 31);
        float f20 = width;
        float L = org.telegram.messenger.g0.L(55.0f) + org.telegram.messenger.g0.L(40.0f) + org.telegram.messenger.g0.m;
        float L2 = org.telegram.messenger.g0.L(68.0f);
        int min = (int) Math.min(org.telegram.messenger.g0.L(340.0f), 0.95f * f20);
        int height2 = (int) (org.telegram.messenger.g0.Q1() ? rectF5.height() * 0.5f : 0.75f * height);
        float f21 = f20 / 2.0f;
        float f22 = 0.0f;
        int i15 = 0;
        while (true) {
            arrayList = k3Var.R;
            f10 = f19;
            if (i15 >= arrayList.size()) {
                break;
            }
            f22 += ((j3) arrayList.get(i15)).d.d >= 0 ? 1.0f : 0.0f;
            i15++;
            f19 = f10;
        }
        float e10 = k3Var.f.e(false, f22);
        float T1 = org.telegram.messenger.g0.T1(0.0f, 1.0f - Utilities.i(k3Var.getScrollWindow() <= 0.0f ? 0.0f : ((k3Var.getScrollMin() - k3Var.getScrollOffset()) / (k3Var.getScrollWindow() * 0.15f)) * 0.2f, 1.0f, 0.0f), k3Var.V);
        int i16 = 0;
        while (true) {
            i7 = i13;
            if (i16 >= arrayList.size() + 1) {
                break;
            }
            if (i16 == arrayList.size()) {
                f15 = L;
                f11 = L2;
                i11 = min;
                f12 = T1;
                i10 = i16;
                f13 = f20;
                arrayList2 = arrayList;
                f14 = e10;
                rectF2 = rectF;
                i12 = height2;
                f16 = f17;
            } else {
                j3 j3Var = (j3) arrayList.get(i16);
                int i17 = i14;
                if (i16 < arrayList.size()) {
                    a3 a3Var = j3Var.d;
                }
                a3 a3Var2 = j3Var.d;
                float f23 = f17;
                float[] fArr = j3Var.g;
                Matrix matrix = j3Var.f;
                float f24 = L;
                float[] fArr2 = j3Var.h;
                float f25 = a3Var2 == null ? f23 : T1;
                float c10 = (e10 - f23) - a3Var2.c();
                f11 = L2;
                i10 = i16;
                float max = (c10 - Math.max(k3Var.getScrollMin(), k3Var.getScrollOffset())) / k3Var.getScrollWindow();
                Math.max(max, 0.0f);
                Math.max(Math.min(max, f23), -4.0f);
                float min2 = (Math.min(5.0f, c10) * org.telegram.messenger.g0.L(6.0f)) + f24;
                float f26 = height2;
                float f27 = ((((height - f11) - (0.26f * f26)) - min2) * max) + min2;
                float f28 = min / 2.0f;
                i11 = min;
                RectF rectF6 = k3Var.d0;
                rectF6.set(f21 - f28, f27, f21 + f28, f26 + f27);
                int i18 = ((rectF6.top > height || rectF6.bottom < 0.0f || T1 < 0.1f) && c10 < e10 - 3.0f) ? i7 : i17;
                k3Var.a.d(rectF, Utilities.i(a3Var2.c(), 1.0f, 0.0f));
                rectF.offset(k3Var.a.getX(), k3Var.a.getY());
                org.telegram.messenger.g0.c2(rectF, rectF6, T1, rectF6);
                d3 d3Var = k3Var.a;
                if (d3Var != null) {
                    d3Var.setupTab(a3Var2);
                }
                if (rectF6.top > height || rectF6.bottom < 0.0f) {
                    f12 = T1;
                    f13 = f20;
                    arrayList2 = arrayList;
                    f14 = e10;
                    rectF2 = rectF;
                    i12 = height2;
                    f15 = f24;
                    f16 = 1.0f;
                } else {
                    canvas.save();
                    j3Var.a.set(rectF6);
                    matrix.reset();
                    fArr[i17] = rectF6.left;
                    float f29 = rectF6.top;
                    fArr[i7] = f29;
                    float f30 = rectF6.right;
                    fArr[2] = f30;
                    fArr[3] = f29;
                    fArr[4] = f30;
                    fArr[5] = (rectF6.height() * 1.0f) + f29;
                    fArr[6] = rectF6.left;
                    fArr[7] = (rectF6.height() * 1.0f) + rectF6.top;
                    fArr2[i17] = rectF6.left;
                    fArr2[i7] = rectF6.top - org.telegram.messenger.g0.L(0.0f);
                    fArr2[2] = rectF6.right;
                    fArr2[3] = rectF6.top - org.telegram.messenger.g0.L(0.0f);
                    float f31 = f25 * 1.0f;
                    fArr2[4] = (org.telegram.messenger.g0.T1(1.0f, 0.83f, f31) * (rectF6.width() / 2.0f)) + rectF6.centerX();
                    fArr2[5] = (org.telegram.messenger.g0.T1(1.0f, 0.6f, f31) * ((rectF6.height() * 1.0f) + org.telegram.messenger.g0.L(0.0f))) + (rectF6.top - org.telegram.messenger.g0.L(0.0f));
                    fArr2[6] = rectF6.centerX() - (org.telegram.messenger.g0.T1(1.0f, 0.83f, f31) * (rectF6.width() / 2.0f));
                    fArr2[7] = (org.telegram.messenger.g0.T1(1.0f, 0.6f, f31) * ((rectF6.height() * 1.0f) + org.telegram.messenger.g0.L(0.0f))) + (rectF6.top - org.telegram.messenger.g0.L(0.0f));
                    matrix.setPolyToPoly(j3Var.g, 0, j3Var.h, 0, 4);
                    canvas.concat(matrix);
                    float T12 = org.telegram.messenger.g0.T1(a3Var2.b(), 1.0f, k3Var.V);
                    float T13 = org.telegram.messenger.g0.T1(Utilities.l((c10 - e10) + 2.0f), 1.0f, Utilities.l((f25 - 0.1f) / 0.8f));
                    RadialGradient radialGradient = j3Var.p;
                    Paint paint = j3Var.o;
                    Paint paint2 = j3Var.r;
                    Matrix matrix2 = j3Var.q;
                    c3 c3Var = j3Var.c;
                    f12 = T1;
                    Path path2 = j3Var.n;
                    arrayList2 = arrayList;
                    Paint paint3 = j3Var.e;
                    f14 = e10;
                    RectF rectF7 = j3Var.m;
                    rectF2 = rectF;
                    Paint paint4 = j3Var.l;
                    i12 = height2;
                    f13 = f20;
                    f16 = 1.0f;
                    float i19 = Utilities.i(1.0f - ((Math.abs(j3Var.i) - 0.3f) / 0.7f), 1.0f, 0.0f) * T12;
                    if (i19 <= 0.0f) {
                        f15 = f24;
                    } else {
                        float f32 = f31 * 1.0f;
                        float T14 = org.telegram.messenger.g0.T1(1.0f, 1.3f, f32);
                        float currentActionBarHeight = ((k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(50.0f)) * 0.0f;
                        canvas.save();
                        canvas.rotate(j3Var.i * 20.0f, (j3Var.i * org.telegram.messenger.g0.L(50.0f)) + rectF6.centerX(), rectF6.bottom + org.telegram.messenger.g0.L(350.0f));
                        float a10 = j3Var.k.a(0.01f);
                        canvas.scale(a10, a10, rectF6.centerX(), rectF6.centerY());
                        float W1 = org.telegram.messenger.g0.W1(f31, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f));
                        if (i18 != 0) {
                            paint4.setColor(i17);
                            paint4.setShadowLayer(org.telegram.messenger.g0.L(30.0f), 0.0f, org.telegram.messenger.g0.L(10.0f), k6.r1(i19 * f31 * 1.0f, TLObject.FLAG_29));
                            canvas.drawRoundRect(rectF6, W1, W1, paint4);
                            paint3.setAlpha((int) (i19 * f10));
                            canvas.drawRoundRect(rectF6, W1, W1, paint3);
                            canvas.restore();
                            f15 = f24;
                            f16 = 1.0f;
                        } else {
                            path2.rewind();
                            path2.addRoundRect(rectF6, W1, W1, Path.Direction.CW);
                            canvas.save();
                            paint4.setColor(0);
                            paint4.setShadowLayer(org.telegram.messenger.g0.L(30.0f), 0.0f, org.telegram.messenger.g0.L(10.0f), k6.r1(i19 * f31 * 1.0f, TLObject.FLAG_29));
                            canvas.drawPath(path2, paint4);
                            canvas.clipPath(path2);
                            float f33 = i19 * f10 * f31;
                            int i20 = (int) f33;
                            paint3.setAlpha(i20);
                            canvas.drawRoundRect(rectF6, W1, W1, paint3);
                            canvas.save();
                            canvas.translate(rectF6.left, rf.b.d(org.telegram.messenger.g0.L(50.0f), T14, rectF6.top, currentActionBarHeight));
                            canvas.scale(1.0f, org.telegram.messenger.g0.T1(1.0f, 1.25f, f32));
                            if (c3Var != null && c3Var.m != null) {
                                float width3 = rectF6.width() / c3Var.m.getWidth();
                                canvas.scale(width3, width3);
                                paint.setAlpha(i20);
                                canvas.drawBitmap(c3Var.m, 0.0f, 0.0f, paint);
                            }
                            canvas.restore();
                            canvas.save();
                            paint2.setAlpha((int) (f33 * 1.0f));
                            matrix2.reset();
                            float height3 = rectF6.height() / f10;
                            matrix2.postScale(height3, height3);
                            matrix2.postTranslate(rectF6.centerX(), rectF6.top);
                            radialGradient.setLocalMatrix(matrix2);
                            paint2.setShader(radialGradient);
                            canvas.drawRect(rectF6, paint2);
                            canvas.restore();
                            rectF7.set(rectF6);
                            rectF7.bottom = Math.min(rectF6.height(), org.telegram.messenger.g0.L(50.0f)) + rectF7.top;
                            rectF7.offset(0.0f, currentActionBarHeight);
                            j3Var.d.w = f31;
                            f16 = 1.0f;
                            canvas.scale(1.0f, T14, rectF7.centerX(), rectF7.top);
                            f15 = f24;
                            j3Var.d.a(canvas, rectF7, W1, i19 * i19, T13);
                            canvas.restore();
                            canvas.restore();
                        }
                    }
                    canvas.restore();
                }
            }
            i16 = i10 + 1;
            L = f15;
            f17 = f16;
            i13 = i7;
            T1 = f12;
            arrayList = arrayList2;
            e10 = f14;
            rectF = rectF2;
            height2 = i12;
            L2 = f11;
            min = i11;
            f20 = f13;
            i14 = 0;
            k3Var = this;
        }
        float f34 = L;
        float f35 = f20;
        canvas.save();
        if (this.j0 == null) {
            this.j0 = new h6.m(28);
        }
        RectF rectF8 = org.telegram.messenger.g0.P;
        rectF8.set(0.0f, 0.0f, f35, f34);
        this.j0.m(canvas, rectF8, i7, this.V);
        canvas.restore();
        canvas.restore();
        if (this.g0 == null) {
            this.g0 = new my0(hd.M0(2131753099, null), 14.0f, org.telegram.messenger.g0.o());
        }
        if (this.i0 == null || this.h0 != k6.I.q()) {
            boolean q10 = k6.I.q();
            this.h0 = q10;
            if (q10) {
                this.i0 = k6.k0(64, 64, 64, 64, 553648127, 872415231, 872415231);
            } else {
                this.i0 = k6.k0(64, 64, 64, 64, 771751936, 1140850688, 1140850688);
            }
            this.i0.setCallback(this);
        }
        float L3 = this.g0.c + org.telegram.messenger.g0.L(24.0f);
        float f36 = (f35 - L3) / 2.0f;
        this.i0.setBounds((int) f36, (int) ((f34 - (org.telegram.messenger.g0.L(95.0f) / 2.0f)) - org.telegram.messenger.g0.L(14.0f)), (int) ((f35 + L3) / 2.0f), (int) ((f34 - (org.telegram.messenger.g0.L(95.0f) / 2.0f)) + org.telegram.messenger.g0.L(14.0f)));
        this.i0.setAlpha((int) (this.V * f10));
        this.i0.draw(canvas);
        this.g0.c(f36 + org.telegram.messenger.g0.L(12.0f), f34 - (org.telegram.messenger.g0.L(95.0f) / 2.0f), this.V, -1, canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        fi.f6 f6Var;
        if (this.V <= 0.0f || (f6Var = this.w) == null || !f6Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0470  */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.VelocityTracker, org.telegram.ui.ActionBar.j3] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        ?? r82;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        j3 j3Var;
        if ((org.telegram.messenger.g0.Q1() && motionEvent.getAction() == 0 && !this.Q.contains(motionEvent.getX(), motionEvent.getY())) || this.V <= 0.0f) {
            return false;
        }
        if (this.I == null) {
            this.I = VelocityTracker.obtain();
        }
        this.I.addMovement(motionEvent);
        int action = motionEvent.getAction();
        OverScroller overScroller = this.h;
        if (action == 0) {
            this.F = System.currentTimeMillis();
            this.E = motionEvent.getX();
            this.D = motionEvent.getY();
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (this.V >= 1.0f) {
                ArrayList arrayList = this.R;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    j3Var = (j3) arrayList.get(size);
                    if (Math.abs(j3Var.i) < 0.4f && j3Var.a.contains(x10, y10)) {
                        break;
                    }
                }
            }
            j3Var = null;
            this.x = j3Var;
            org.telegram.ui.Cells.y yVar = this.i0;
            boolean z10 = yVar != null && yVar.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
            this.K = z10;
            if (z10) {
                this.x = null;
            }
            org.telegram.ui.Cells.y yVar2 = this.i0;
            if (yVar2 != null) {
                yVar2.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.i0.setState(this.K ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : new int[0]);
            }
            this.G = false;
            this.H = false;
            this.y = false;
            j3 j3Var2 = this.x;
            if (j3Var2 != null) {
                ValueAnimator valueAnimator = j3Var2.j;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                boolean contains = this.x.d.l.getBounds().contains((int) (motionEvent.getX() - this.x.a.left), (int) ((motionEvent.getY() - this.x.a.top) - org.telegram.messenger.g0.L(24.0f)));
                this.y = contains;
                if (contains) {
                    org.telegram.ui.Cells.y yVar3 = this.x.d.l;
                    float x11 = motionEvent.getX();
                    RectF rectF = this.c0;
                    yVar3.setHotspot((int) (x11 - rectF.left), (int) (motionEvent.getY() - rectF.centerY()));
                }
                this.x.k.c(!this.y);
                this.x.d.l.setState(this.y ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : new int[0]);
            }
            this.J = motionEvent.getY();
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
            }
            ValueAnimator valueAnimator2 = this.T;
            if (valueAnimator2 == null) {
                return true;
            }
            valueAnimator2.cancel();
            this.T = null;
            return true;
        }
        if (motionEvent.getAction() == 2) {
            j3 j3Var3 = this.x;
            if (j3Var3 != null) {
                if (j3Var3.k.i) {
                    if (!this.H && !this.G && r9.a(this.E, motionEvent.getY(), motionEvent.getX(), motionEvent.getY()) > org.telegram.messenger.g0.e) {
                        this.H = true;
                    }
                    if (!this.G && !this.H && r9.a(motionEvent.getX(), this.D, motionEvent.getX(), motionEvent.getY()) > org.telegram.messenger.g0.e) {
                        if (!overScroller.isFinished()) {
                            overScroller.abortAnimation();
                        }
                        ValueAnimator valueAnimator3 = this.T;
                        if (valueAnimator3 != null) {
                            valueAnimator3.cancel();
                            this.T = null;
                        }
                        this.G = true;
                    }
                    if (this.a != null && (this.G || this.H)) {
                        this.x.k.c(false);
                        ValueAnimator valueAnimator4 = this.x.j;
                        if (valueAnimator4 != null) {
                            valueAnimator4.cancel();
                        }
                    }
                } else {
                    if (!this.y && !this.H && !this.G && r9.a(this.E, motionEvent.getY(), motionEvent.getX(), motionEvent.getY()) > org.telegram.messenger.g0.e) {
                        this.H = true;
                    }
                    if (!this.y && !this.G && !this.H && r9.a(motionEvent.getX(), this.D, motionEvent.getX(), motionEvent.getY()) > org.telegram.messenger.g0.e) {
                        if (!overScroller.isFinished()) {
                            overScroller.abortAnimation();
                        }
                        ValueAnimator valueAnimator5 = this.T;
                        if (valueAnimator5 != null) {
                            valueAnimator5.cancel();
                            this.T = null;
                        }
                        this.G = true;
                    }
                    if (this.y) {
                        boolean contains2 = this.x.d.l.getBounds().contains((int) (motionEvent.getX() - this.x.a.left), (int) ((motionEvent.getY() - this.x.a.top) - org.telegram.messenger.g0.L(24.0f)));
                        this.y = contains2;
                        if (!contains2) {
                            this.x.d.l.setState(new int[0]);
                        }
                    }
                }
                j3 j3Var4 = this.x;
                if (!j3Var4.k.i) {
                    if (this.H) {
                        j3Var4.i = (motionEvent.getX() - this.E) / org.telegram.messenger.g0.L(300.0f);
                    } else if (this.G) {
                        float y11 = motionEvent.getY() - this.J;
                        if (this.L < getScrollMin()) {
                            y11 *= 1.0f - (Utilities.i((getScrollMin() - this.L) / getScrollStep(), 1.0f, 0.0f) * 0.5f);
                        }
                        setScrollOffset(Utilities.i(((getScrollOffset() * getScrollStep()) - y11) / getScrollStep(), getScrollMax(), getScrollMin() - (getScrollStep() * 1.4f)));
                        invalidate();
                    }
                }
                invalidate();
            }
            org.telegram.ui.Cells.y yVar4 = this.i0;
            if (yVar4 != null && this.K) {
                boolean z11 = this.x == null && yVar4.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
                this.K = z11;
                if (!z11) {
                    this.i0.setState(new int[0]);
                }
            }
            this.J = motionEvent.getY();
            return true;
        }
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() != 3) {
                return true;
            }
            j3 j3Var5 = this.x;
            if (j3Var5 != null) {
                j3Var5.a(0.0f);
                this.x.k.c(false);
                this.x.d.l.setState(new int[0]);
            }
            this.x = null;
            this.y = false;
            VelocityTracker velocityTracker3 = this.I;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.I = null;
            }
            this.K = false;
            org.telegram.ui.Cells.y yVar5 = this.i0;
            if (yVar5 == null) {
                return true;
            }
            yVar5.setState(new int[0]);
            return true;
        }
        j3 j3Var6 = this.x;
        if (j3Var6 != null) {
            if (this.a == null || Math.abs(j3Var6.i) <= 0.4f) {
                this.x.a(0.0f);
                if (this.a != null && this.x.k.i) {
                    a(false);
                    j3 j3Var7 = this.x;
                    j3Var7.getClass();
                    this.a.e(j3Var7.c);
                } else if (this.G) {
                    if (this.L < getScrollMin() - (getScrollWindow() * 0.15f)) {
                        a(false);
                    } else if (this.L < getScrollMin()) {
                        h(getScrollMin());
                    } else {
                        this.I.computeCurrentVelocity(1000, this.n);
                        float yVelocity = this.I.getYVelocity();
                        if (Math.abs(yVelocity) > this.r) {
                            velocityTracker = null;
                            z9 = true;
                            overScroller.fling(0, (int) (getScrollOffset() * getScrollStep()), 0, (int) (-yVelocity), 0, 0, (int) (getScrollMin() * getScrollStep()), (int) (getScrollMax() * getScrollStep()), 0, (int) (getScrollStep() * 0.1f));
                        } else {
                            velocityTracker = null;
                            z9 = true;
                            overScroller.startScroll(0, (int) (getScrollOffset() * getScrollStep()), 0, 0, 0);
                        }
                        this.I.recycle();
                        this.I = velocityTracker;
                        postInvalidateOnAnimation();
                        velocityTracker2 = velocityTracker;
                        this.x.k.c(false);
                        if (this.y) {
                            this.y = this.x.d.l.getBounds().contains((int) (motionEvent.getX() - this.x.a.left), (int) ((motionEvent.getY() - this.x.a.top) - org.telegram.messenger.g0.L(24.0f)));
                        }
                        if (this.y) {
                            final j3 j3Var8 = this.x;
                            final int i7 = 1;
                            this.a.g(j3Var8.c, new c20(this) { // from class: org.telegram.ui.ActionBar.f3
                                public final /* synthetic */ k3 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.c20
                                public final void a(Object obj) {
                                    Boolean bool = (Boolean) obj;
                                    switch (i7) {
                                        case 0:
                                            k3 k3Var = this.b;
                                            k3Var.getClass();
                                            boolean booleanValue = bool.booleanValue();
                                            j3 j3Var9 = j3Var8;
                                            if (!booleanValue) {
                                                j3Var9.a(0.0f);
                                                break;
                                            } else {
                                                j3Var9.a(j3Var9.i < 0.0f ? -1.0f : 1.0f);
                                                k3Var.h(Utilities.i(k3Var.L, k3Var.c(false), k3Var.d(false)));
                                                if (k3Var.a.getTabs().isEmpty()) {
                                                    k3Var.a(false);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            k3 k3Var2 = this.b;
                                            k3Var2.getClass();
                                            boolean booleanValue2 = bool.booleanValue();
                                            j3 j3Var10 = j3Var8;
                                            if (!booleanValue2) {
                                                j3Var10.a(0.0f);
                                                break;
                                            } else {
                                                j3Var10.a(1.0f);
                                                k3Var2.h(Utilities.i(k3Var2.L, k3Var2.c(false), k3Var2.d(false)));
                                                if (k3Var2.a.getTabs().isEmpty()) {
                                                    k3Var2.a(false);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                        }
                        this.x.d.l.setState(new int[0]);
                        r82 = velocityTracker2;
                    }
                    velocityTracker = null;
                    z9 = true;
                    this.I.recycle();
                    this.I = velocityTracker;
                    postInvalidateOnAnimation();
                    velocityTracker2 = velocityTracker;
                    this.x.k.c(false);
                    if (this.y) {
                    }
                    if (this.y) {
                    }
                    this.x.d.l.setState(new int[0]);
                    r82 = velocityTracker2;
                }
            } else {
                final j3 j3Var9 = this.x;
                final int i10 = 0;
                this.a.g(j3Var9.c, new c20(this) { // from class: org.telegram.ui.ActionBar.f3
                    public final /* synthetic */ k3 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.c20
                    public final void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (i10) {
                            case 0:
                                k3 k3Var = this.b;
                                k3Var.getClass();
                                boolean booleanValue = bool.booleanValue();
                                j3 j3Var92 = j3Var9;
                                if (!booleanValue) {
                                    j3Var92.a(0.0f);
                                    break;
                                } else {
                                    j3Var92.a(j3Var92.i < 0.0f ? -1.0f : 1.0f);
                                    k3Var.h(Utilities.i(k3Var.L, k3Var.c(false), k3Var.d(false)));
                                    if (k3Var.a.getTabs().isEmpty()) {
                                        k3Var.a(false);
                                        break;
                                    }
                                }
                                break;
                            default:
                                k3 k3Var2 = this.b;
                                k3Var2.getClass();
                                boolean booleanValue2 = bool.booleanValue();
                                j3 j3Var10 = j3Var9;
                                if (!booleanValue2) {
                                    j3Var10.a(0.0f);
                                    break;
                                } else {
                                    j3Var10.a(1.0f);
                                    k3Var2.h(Utilities.i(k3Var2.L, k3Var2.c(false), k3Var2.d(false)));
                                    if (k3Var2.a.getTabs().isEmpty()) {
                                        k3Var2.a(false);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
            }
            velocityTracker2 = null;
            z9 = true;
            this.x.k.c(false);
            if (this.y) {
            }
            if (this.y) {
            }
            this.x.d.l.setState(new int[0]);
            r82 = velocityTracker2;
        } else {
            Object obj = null;
            z9 = true;
            if (this.K) {
                this.a.f();
                a(false);
                r82 = obj;
            } else {
                r82 = obj;
                if (r9.a(this.E, this.D, motionEvent.getX(), motionEvent.getY()) <= org.telegram.messenger.g0.e) {
                    r82 = obj;
                    if (!this.G) {
                        r82 = obj;
                        if (!this.H) {
                            r82 = obj;
                            if (System.currentTimeMillis() - this.F <= ViewConfiguration.getTapTimeout() * 1.2f) {
                                a(false);
                                r82 = obj;
                            }
                        }
                    }
                }
            }
        }
        this.x = r82;
        this.y = false;
        VelocityTracker velocityTracker4 = this.I;
        if (velocityTracker4 != null) {
            velocityTracker4.recycle();
            this.I = r82;
        }
        this.K = false;
        org.telegram.ui.Cells.y yVar6 = this.i0;
        if (yVar6 == null) {
            return z9;
        }
        yVar6.setState(new int[0]);
        return z9;
    }

    public final float e(boolean z9) {
        float f10 = 0.0f;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.R;
            if (i7 >= arrayList.size()) {
                break;
            }
            f10 += ((j3) arrayList.get(i7)).d.d >= 0 ? 1.0f : 0.0f;
            i7++;
        }
        return z9 ? this.f.e(false, f10) : f10;
    }

    public final void f() {
        a3 a3Var;
        d3 d3Var = this.a;
        if (d3Var == null || !(d3Var.getParent() instanceof View)) {
            return;
        }
        HashSet hashSet = hi.a3.a1;
        if (!hashSet.isEmpty()) {
            Iterator it = new HashSet(hashSet).iterator();
            while (it.hasNext()) {
                ((hi.a3) it.next()).o(true);
            }
            org.telegram.messenger.g0.i3(new l2.w(this, 25), 100L);
            return;
        }
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.d = null;
        }
        View view = (View) this.a.getParent();
        this.S = view;
        int[] iArr = this.a0;
        if (view != null) {
            view.getLocationOnScreen(iArr);
        } else {
            iArr[1] = 0;
            iArr[0] = 0;
        }
        int[] iArr2 = this.b0;
        getLocationOnScreen(iArr2);
        this.Q.set(iArr[0] - iArr2[0], iArr[1] - iArr2[1], this.S.getWidth() + r5, this.S.getHeight() + (iArr[1] - iArr2[1]));
        View view2 = this.S;
        org.telegram.messenger.g0.m0 = true;
        this.M = org.telegram.messenger.g0.j2(14.0f, 14, view2);
        org.telegram.messenger.g0.m0 = false;
        Paint paint = new Paint(1);
        this.O = paint;
        Bitmap bitmap = this.M;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.N = bitmapShader;
        paint.setShader(bitmapShader);
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.g0.i(colorMatrix, k6.I.q() ? 0.08f : 0.25f);
        this.O.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.P = new Matrix();
        ArrayList arrayList = this.R;
        arrayList.clear();
        ArrayList<c3> tabs = this.a.getTabs();
        ArrayList<a3> tabDrawables = this.a.getTabDrawables();
        for (int size = tabs.size() - 1; size >= 0; size--) {
            c3 c3Var = tabs.get(size);
            int i7 = 0;
            while (true) {
                if (i7 >= tabDrawables.size()) {
                    a3Var = null;
                    break;
                }
                a3Var = tabDrawables.get(i7);
                if (a3Var.a == c3Var) {
                    break;
                } else {
                    i7++;
                }
            }
            if (a3Var != null) {
                arrayList.add(new j3(this, c3Var, a3Var));
            }
        }
        this.f.e(true, arrayList.size());
        setScrollOffset(getScrollMax());
        a(true);
    }

    public float getScrollMax() {
        return c(true);
    }

    public float getScrollMin() {
        return d(true);
    }

    public float getScrollOffset() {
        return this.L;
    }

    public float getScrollRange() {
        return e(true);
    }

    public float getScrollWindow() {
        return Math.min(3.0f, getScrollRange());
    }

    public final void h(float f10) {
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.T = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.L, f10);
        this.T = ofFloat;
        ofFloat.addUpdateListener(new e3(this, 1));
        this.T.setDuration(250L);
        this.T.setInterpolator(xq.h);
        this.T.start();
    }

    public void setScrollOffset(float f10) {
        this.L = f10;
    }

    public void setTabsView(d3 d3Var) {
        this.a = d3Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.i0 || super.verifyDrawable(drawable);
    }

    public void setSlowerDismiss(boolean z9) {
    }
}
