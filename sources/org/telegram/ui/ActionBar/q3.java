package org.telegram.ui.ActionBar;

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
import org.telegram.messenger.cd;
import org.telegram.messenger.q20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.LaunchActivity;
import w7.z8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q3 extends View {
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
    public i3 a;
    public final int[] a0;
    public n3 b;
    public final int[] b0;
    public f3 c;
    public final RectF c0;
    public ValueAnimator d;
    public final RectF d0;
    public float e;
    public final RectF e0;
    public final org.telegram.ui.Components.t5 f;
    public final Path f0;
    public qz0 g0;
    public final OverScroller h;
    public boolean h0;
    public org.telegram.ui.Cells.y i0;
    public li.k j0;
    public final int n;
    public final int r;
    public int s;
    public final m3 w;
    public p3 x;
    public boolean y;

    public q3(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f = new org.telegram.ui.Components.t5(this, 0L, 350L, gr.h);
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
        m3 m3Var = new m3(this, this);
        this.w = m3Var;
        r0.h0.j(this, m3Var);
        setImportantForAccessibility(2);
        r0.z.i(this, new mg.l(this, 12));
    }

    public static void g(ViewGroup viewGroup, float f7, final ag.e0 e0Var) {
        if (viewGroup.getWidth() <= 0 || viewGroup.getHeight() <= 0) {
            e0Var.a(null);
            return;
        }
        final SurfaceTexture d = c9.b.d();
        d.setDefaultBufferSize(viewGroup.getWidth(), viewGroup.getHeight());
        final Surface surface = new Surface(d);
        final Bitmap createBitmap = Bitmap.createBitmap(viewGroup.getWidth(), viewGroup.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
        lockHardwareCanvas.translate(0.0f, f7);
        viewGroup.draw(lockHardwareCanvas);
        surface.unlockCanvasAndPost(lockHardwareCanvas);
        PixelCopy.request(surface, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: org.telegram.ui.ActionBar.l3
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i10) {
                ag.e0 e0Var2 = ag.e0.this;
                Bitmap bitmap = createBitmap;
                Surface surface2 = surface;
                SurfaceTexture surfaceTexture = d;
                if (i10 == 0) {
                    e0Var2.a(bitmap);
                } else {
                    bitmap.recycle();
                    e0Var2.a(null);
                }
                surface2.release();
                surfaceTexture.release();
            }
        }, new Handler());
    }

    private float getScrollStep() {
        return org.telegram.messenger.i0.L(200.0f);
    }

    private void setModalAccessibility(boolean z10) {
        setImportantForAccessibility(z10 ? 1 : 2);
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != this) {
                    childAt.setImportantForAccessibility(z10 ? 4 : 0);
                }
            }
        }
        m3 m3Var = this.w;
        if (m3Var != null) {
            m3Var.i();
        }
        if (z10) {
            sendAccessibilityEvent(32);
        }
    }

    public final void a(boolean z10) {
        if (this.U == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.W;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.U = z10;
        i3 i3Var = this.a;
        if (i3Var != null) {
            i3Var.b = false;
            i3Var.invalidate();
        }
        setModalAccessibility(z10);
        invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, z10 ? 1.0f : 0.0f);
        this.W = ofFloat;
        ofFloat.addUpdateListener(new j3(this, 0));
        this.W.addListener(new bg.e(this, 22));
        this.W.setInterpolator(gr.h);
        this.W.setDuration(320L);
        this.W.start();
    }

    public final void b(n3 n3Var) {
        ValueAnimator valueAnimator;
        if (this.a == null) {
            return;
        }
        if (this.b != null && (valueAnimator = this.d) != null) {
            valueAnimator.end();
            this.d = null;
        }
        this.b = n3Var;
        n3Var.b(false);
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        h3 c10 = n3Var.c();
        i3 i3Var = this.a;
        ArrayList<h3> tabs = i3Var.getTabs();
        ArrayList<f3> tabDrawables = i3Var.getTabDrawables();
        f3 f3Var = new f3(i3Var, c10);
        int i10 = 1;
        f3Var.e.e(true, -1.0f);
        f3Var.f.e(true, 0.0f);
        tabDrawables.add(f3Var);
        tabs.add(0, c10);
        for (int i11 = 0; i11 < tabDrawables.size(); i11++) {
            f3 f3Var2 = tabDrawables.get(i11);
            int indexOf = tabs.indexOf(f3Var2.a);
            f3Var2.d = indexOf;
            if (indexOf >= 0) {
                f3Var2.c = indexOf;
            }
        }
        i3Var.n();
        i3Var.o(true);
        i3Var.invalidate();
        g3 g3Var = i3Var.e;
        if (g3Var != null) {
            g3Var.i();
        }
        this.c = f3Var;
        post(new lg.s(n3Var, 23));
        invalidate();
        this.e = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.addUpdateListener(new j3(this, 2));
        this.d.addListener(new g1(this, c10, n3Var, i10));
        org.telegram.messenger.i0.n(this.d, 220.0d, 30.0d);
        this.d.setDuration((long) (r11.getDuration() * 1.1f));
        this.d.start();
    }

    public final float c(boolean z10) {
        return (e(z10) - Math.min(3.0f, e(z10))) - (Utilities.i(4.0f - e(z10), 0.5f, 0.0f) * (Math.min(3.0f, e(z10)) / 3.0f));
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.h.computeScrollOffset()) {
            setScrollOffset(r0.getCurrY() / getScrollStep());
            postInvalidateOnAnimation();
        }
    }

    public final float d(boolean z10) {
        return Utilities.i(e(z10), 1.0f, 0.0f) * ((-getScrollWindow()) / 3.0f);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        ArrayList arrayList;
        float f7;
        int i10;
        float f10;
        int i11;
        int i12;
        float f11;
        float f12;
        ArrayList arrayList2;
        float f13;
        RectF rectF2;
        int i13;
        float f14;
        float f15;
        q3 q3Var = this;
        super.dispatchDraw(canvas);
        n3 n3Var = q3Var.b;
        float f16 = 1.0f;
        int i14 = 1;
        int[] iArr = q3Var.a0;
        int[] iArr2 = q3Var.b0;
        int i15 = 0;
        RectF rectF3 = q3Var.c0;
        if (n3Var != null) {
            q3Var.getLocationOnScreen(iArr2);
            q3Var.a.getLocationOnScreen(iArr);
            q3Var.a.d(rectF3, 0.0f);
            rectF3.offset(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
            canvas.save();
            canvas.clipRect(0, 0, q3Var.getMeasuredWidth(), q3Var.getMeasuredHeight() - q3Var.s);
            o3 d = q3Var.b.d();
            float f17 = q3Var.e;
            RectF rectF4 = q3Var.e0;
            float x10 = d.x(canvas, rectF3, f17, rectF4, f17);
            if (q3Var.c != null) {
                Path path = q3Var.f0;
                path.rewind();
                path.addRoundRect(rectF4, x10, x10, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float z10 = sc.e.z(1.0f, q3Var.e, org.telegram.messenger.i0.L(50.0f), rectF4.top);
                rectF3.set(rectF4.left, z10, rectF4.right, org.telegram.messenger.i0.L(50.0f) + z10);
                q3Var.a.setupTab(q3Var.c);
                q3Var.c.a(canvas, rectF3, x10, q3Var.e, 1.0f);
                rectF = rectF3;
                canvas.restore();
            } else {
                rectF = rectF3;
            }
            canvas.restore();
        } else {
            rectF = rectF3;
        }
        if (q3Var.V <= 0.0f) {
            return;
        }
        canvas.save();
        View view = q3Var.S;
        RectF rectF5 = q3Var.Q;
        if (view != null) {
            view.getLocationOnScreen(iArr);
            q3Var.getLocationOnScreen(iArr2);
            rectF5.set(iArr[0] - iArr2[0], iArr[1] - iArr2[1], q3Var.S.getWidth() + r1, q3Var.S.getHeight() + (iArr[1] - iArr2[1]));
        } else {
            iArr[1] = 0;
            iArr[0] = 0;
            rectF5.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        canvas.clipRect(rectF5);
        canvas.translate(rectF5.left, rectF5.top);
        float width = rectF5.width();
        float height = rectF5.height();
        float f18 = 255.0f;
        if (q3Var.M != null) {
            q3Var.P.reset();
            float width2 = rectF5.width() / q3Var.M.getWidth();
            q3Var.P.postScale(width2, width2);
            q3Var.N.setLocalMatrix(q3Var.P);
            q3Var.O.setAlpha((int) (q3Var.V * 255.0f));
            canvas.drawRect(0.0f, 0.0f, width, height, q3Var.O);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, width, height, zs.e4, 31);
        float f19 = width;
        float L = org.telegram.messenger.i0.L(55.0f) + org.telegram.messenger.i0.L(40.0f) + org.telegram.messenger.i0.m;
        float L2 = org.telegram.messenger.i0.L(68.0f);
        int min = (int) Math.min(org.telegram.messenger.i0.L(340.0f), 0.95f * f19);
        int height2 = (int) (org.telegram.messenger.i0.Q1() ? rectF5.height() * 0.5f : 0.75f * height);
        float f20 = f19 / 2.0f;
        float f21 = 0.0f;
        int i16 = 0;
        while (true) {
            arrayList = q3Var.R;
            f7 = f18;
            if (i16 >= arrayList.size()) {
                break;
            }
            f21 += ((p3) arrayList.get(i16)).d.d >= 0 ? 1.0f : 0.0f;
            i16++;
            f18 = f7;
        }
        float e = q3Var.f.e(false, f21);
        float T1 = org.telegram.messenger.i0.T1(0.0f, 1.0f - Utilities.i(q3Var.getScrollWindow() <= 0.0f ? 0.0f : ((q3Var.getScrollMin() - q3Var.getScrollOffset()) / (q3Var.getScrollWindow() * 0.15f)) * 0.2f, 1.0f, 0.0f), q3Var.V);
        int i17 = 0;
        while (true) {
            i10 = i14;
            if (i17 >= arrayList.size() + 1) {
                break;
            }
            if (i17 == arrayList.size()) {
                f14 = L;
                f10 = L2;
                i12 = min;
                f11 = T1;
                i11 = i17;
                f12 = f19;
                arrayList2 = arrayList;
                f13 = e;
                rectF2 = rectF;
                i13 = height2;
                f15 = f16;
            } else {
                p3 p3Var = (p3) arrayList.get(i17);
                int i18 = i15;
                if (i17 < arrayList.size()) {
                    f3 f3Var = p3Var.d;
                }
                f3 f3Var2 = p3Var.d;
                float f22 = f16;
                float[] fArr = p3Var.g;
                Matrix matrix = p3Var.f;
                float f23 = L;
                float[] fArr2 = p3Var.h;
                float f24 = f3Var2 == null ? f22 : T1;
                float c10 = (e - f22) - f3Var2.c();
                f10 = L2;
                i11 = i17;
                float max = (c10 - Math.max(q3Var.getScrollMin(), q3Var.getScrollOffset())) / q3Var.getScrollWindow();
                Math.max(max, 0.0f);
                Math.max(Math.min(max, f22), -4.0f);
                float min2 = (Math.min(5.0f, c10) * org.telegram.messenger.i0.L(6.0f)) + f23;
                float f25 = height2;
                float f26 = ((((height - f10) - (0.26f * f25)) - min2) * max) + min2;
                float f27 = min / 2.0f;
                i12 = min;
                RectF rectF6 = q3Var.d0;
                rectF6.set(f20 - f27, f26, f20 + f27, f25 + f26);
                int i19 = ((rectF6.top > height || rectF6.bottom < 0.0f || T1 < 0.1f) && c10 < e - 3.0f) ? i10 : i18;
                q3Var.a.d(rectF, Utilities.i(f3Var2.c(), 1.0f, 0.0f));
                rectF.offset(q3Var.a.getX(), q3Var.a.getY());
                org.telegram.messenger.i0.c2(rectF, rectF6, T1, rectF6);
                i3 i3Var = q3Var.a;
                if (i3Var != null) {
                    i3Var.setupTab(f3Var2);
                }
                if (rectF6.top > height || rectF6.bottom < 0.0f) {
                    f11 = T1;
                    f12 = f19;
                    arrayList2 = arrayList;
                    f13 = e;
                    rectF2 = rectF;
                    i13 = height2;
                    f14 = f23;
                    f15 = 1.0f;
                } else {
                    canvas.save();
                    p3Var.a.set(rectF6);
                    matrix.reset();
                    fArr[i18] = rectF6.left;
                    float f28 = rectF6.top;
                    fArr[i10] = f28;
                    float f29 = rectF6.right;
                    fArr[2] = f29;
                    fArr[3] = f28;
                    fArr[4] = f29;
                    fArr[5] = (rectF6.height() * 1.0f) + f28;
                    fArr[6] = rectF6.left;
                    fArr[7] = (rectF6.height() * 1.0f) + rectF6.top;
                    fArr2[i18] = rectF6.left;
                    fArr2[i10] = rectF6.top - org.telegram.messenger.i0.L(0.0f);
                    fArr2[2] = rectF6.right;
                    fArr2[3] = rectF6.top - org.telegram.messenger.i0.L(0.0f);
                    float f30 = f24 * 1.0f;
                    fArr2[4] = (org.telegram.messenger.i0.T1(1.0f, 0.83f, f30) * (rectF6.width() / 2.0f)) + rectF6.centerX();
                    fArr2[5] = (org.telegram.messenger.i0.T1(1.0f, 0.6f, f30) * ((rectF6.height() * 1.0f) + org.telegram.messenger.i0.L(0.0f))) + (rectF6.top - org.telegram.messenger.i0.L(0.0f));
                    fArr2[6] = rectF6.centerX() - (org.telegram.messenger.i0.T1(1.0f, 0.83f, f30) * (rectF6.width() / 2.0f));
                    fArr2[7] = (org.telegram.messenger.i0.T1(1.0f, 0.6f, f30) * ((rectF6.height() * 1.0f) + org.telegram.messenger.i0.L(0.0f))) + (rectF6.top - org.telegram.messenger.i0.L(0.0f));
                    matrix.setPolyToPoly(p3Var.g, 0, p3Var.h, 0, 4);
                    canvas.concat(matrix);
                    float T12 = org.telegram.messenger.i0.T1(f3Var2.b(), 1.0f, q3Var.V);
                    float T13 = org.telegram.messenger.i0.T1(Utilities.l((c10 - e) + 2.0f), 1.0f, Utilities.l((f24 - 0.1f) / 0.8f));
                    RadialGradient radialGradient = p3Var.p;
                    Paint paint = p3Var.o;
                    Paint paint2 = p3Var.r;
                    Matrix matrix2 = p3Var.q;
                    h3 h3Var = p3Var.c;
                    f11 = T1;
                    Path path2 = p3Var.n;
                    arrayList2 = arrayList;
                    Paint paint3 = p3Var.e;
                    f13 = e;
                    RectF rectF7 = p3Var.m;
                    rectF2 = rectF;
                    Paint paint4 = p3Var.l;
                    i13 = height2;
                    f12 = f19;
                    f15 = 1.0f;
                    float i20 = Utilities.i(1.0f - ((Math.abs(p3Var.i) - 0.3f) / 0.7f), 1.0f, 0.0f) * T12;
                    if (i20 <= 0.0f) {
                        f14 = f23;
                    } else {
                        float f31 = f30 * 1.0f;
                        float T14 = org.telegram.messenger.i0.T1(1.0f, 1.3f, f31);
                        float currentActionBarHeight = ((l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m) - org.telegram.messenger.i0.L(50.0f)) * 0.0f;
                        canvas.save();
                        canvas.rotate(p3Var.i * 20.0f, (p3Var.i * org.telegram.messenger.i0.L(50.0f)) + rectF6.centerX(), rectF6.bottom + org.telegram.messenger.i0.L(350.0f));
                        float a2 = p3Var.k.a(0.01f);
                        canvas.scale(a2, a2, rectF6.centerX(), rectF6.centerY());
                        float W1 = org.telegram.messenger.i0.W1(f30, org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f));
                        if (i19 != 0) {
                            paint4.setColor(i18);
                            paint4.setShadowLayer(org.telegram.messenger.i0.L(30.0f), 0.0f, org.telegram.messenger.i0.L(10.0f), t6.r1(i20 * f30 * 1.0f, TLObject.FLAG_29));
                            canvas.drawRoundRect(rectF6, W1, W1, paint4);
                            paint3.setAlpha((int) (i20 * f7));
                            canvas.drawRoundRect(rectF6, W1, W1, paint3);
                            canvas.restore();
                            f14 = f23;
                            f15 = 1.0f;
                        } else {
                            path2.rewind();
                            path2.addRoundRect(rectF6, W1, W1, Path.Direction.CW);
                            canvas.save();
                            paint4.setColor(0);
                            paint4.setShadowLayer(org.telegram.messenger.i0.L(30.0f), 0.0f, org.telegram.messenger.i0.L(10.0f), t6.r1(i20 * f30 * 1.0f, TLObject.FLAG_29));
                            canvas.drawPath(path2, paint4);
                            canvas.clipPath(path2);
                            float f32 = i20 * f7 * f30;
                            int i21 = (int) f32;
                            paint3.setAlpha(i21);
                            canvas.drawRoundRect(rectF6, W1, W1, paint3);
                            canvas.save();
                            canvas.translate(rectF6.left, sc.e.d(org.telegram.messenger.i0.L(50.0f), T14, rectF6.top, currentActionBarHeight));
                            canvas.scale(1.0f, org.telegram.messenger.i0.T1(1.0f, 1.25f, f31));
                            if (h3Var != null && h3Var.m != null) {
                                float width3 = rectF6.width() / h3Var.m.getWidth();
                                canvas.scale(width3, width3);
                                paint.setAlpha(i21);
                                canvas.drawBitmap(h3Var.m, 0.0f, 0.0f, paint);
                            }
                            canvas.restore();
                            canvas.save();
                            paint2.setAlpha((int) (f32 * 1.0f));
                            matrix2.reset();
                            float height3 = rectF6.height() / f7;
                            matrix2.postScale(height3, height3);
                            matrix2.postTranslate(rectF6.centerX(), rectF6.top);
                            radialGradient.setLocalMatrix(matrix2);
                            paint2.setShader(radialGradient);
                            canvas.drawRect(rectF6, paint2);
                            canvas.restore();
                            rectF7.set(rectF6);
                            rectF7.bottom = Math.min(rectF6.height(), org.telegram.messenger.i0.L(50.0f)) + rectF7.top;
                            rectF7.offset(0.0f, currentActionBarHeight);
                            p3Var.d.w = f30;
                            f15 = 1.0f;
                            canvas.scale(1.0f, T14, rectF7.centerX(), rectF7.top);
                            f14 = f23;
                            p3Var.d.a(canvas, rectF7, W1, i20 * i20, T13);
                            canvas.restore();
                            canvas.restore();
                        }
                    }
                    canvas.restore();
                }
            }
            i17 = i11 + 1;
            L = f14;
            f16 = f15;
            i14 = i10;
            T1 = f11;
            arrayList = arrayList2;
            e = f13;
            rectF = rectF2;
            height2 = i13;
            L2 = f10;
            min = i12;
            f19 = f12;
            i15 = 0;
            q3Var = this;
        }
        float f33 = L;
        float f34 = f19;
        canvas.save();
        if (this.j0 == null) {
            this.j0 = new li.k(23);
        }
        RectF rectF8 = org.telegram.messenger.i0.P;
        rectF8.set(0.0f, 0.0f, f34, f33);
        this.j0.o(canvas, rectF8, i10, this.V);
        canvas.restore();
        canvas.restore();
        if (this.g0 == null) {
            this.g0 = new qz0(cd.L0(2131753099, null), 14.0f, org.telegram.messenger.i0.o());
        }
        if (this.i0 == null || this.h0 != t6.I.q()) {
            boolean q6 = t6.I.q();
            this.h0 = q6;
            if (q6) {
                this.i0 = t6.k0(64, 64, 64, 64, 553648127, 872415231, 872415231);
            } else {
                this.i0 = t6.k0(64, 64, 64, 64, 771751936, 1140850688, 1140850688);
            }
            this.i0.setCallback(this);
        }
        float L3 = this.g0.c + org.telegram.messenger.i0.L(24.0f);
        float f35 = (f34 - L3) / 2.0f;
        this.i0.setBounds((int) f35, (int) ((f33 - (org.telegram.messenger.i0.L(95.0f) / 2.0f)) - org.telegram.messenger.i0.L(14.0f)), (int) ((f34 + L3) / 2.0f), (int) ((f33 - (org.telegram.messenger.i0.L(95.0f) / 2.0f)) + org.telegram.messenger.i0.L(14.0f)));
        this.i0.setAlpha((int) (this.V * f7));
        this.i0.draw(canvas);
        this.g0.c(f35 + org.telegram.messenger.i0.L(12.0f), f33 - (org.telegram.messenger.i0.L(95.0f) / 2.0f), this.V, -1, canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        m3 m3Var;
        if (this.V <= 0.0f || (m3Var = this.w) == null || !m3Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0470  */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.VelocityTracker, org.telegram.ui.ActionBar.p3] */
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
        boolean z10;
        ?? r82;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        p3 p3Var;
        if ((org.telegram.messenger.i0.Q1() && motionEvent.getAction() == 0 && !this.Q.contains(motionEvent.getX(), motionEvent.getY())) || this.V <= 0.0f) {
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
            float y3 = motionEvent.getY();
            if (this.V >= 1.0f) {
                ArrayList arrayList = this.R;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    p3Var = (p3) arrayList.get(size);
                    if (Math.abs(p3Var.i) < 0.4f && p3Var.a.contains(x10, y3)) {
                        break;
                    }
                }
            }
            p3Var = null;
            this.x = p3Var;
            org.telegram.ui.Cells.y yVar = this.i0;
            boolean z11 = yVar != null && yVar.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
            this.K = z11;
            if (z11) {
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
            p3 p3Var2 = this.x;
            if (p3Var2 != null) {
                ValueAnimator valueAnimator = p3Var2.j;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                boolean contains = this.x.d.l.getBounds().contains((int) (motionEvent.getX() - this.x.a.left), (int) ((motionEvent.getY() - this.x.a.top) - org.telegram.messenger.i0.L(24.0f)));
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
            p3 p3Var3 = this.x;
            if (p3Var3 != null) {
                if (p3Var3.k.i) {
                    if (!this.H && !this.G && z8.a(this.E, motionEvent.getY(), motionEvent.getX(), motionEvent.getY()) > org.telegram.messenger.i0.e) {
                        this.H = true;
                    }
                    if (!this.G && !this.H && z8.a(motionEvent.getX(), this.D, motionEvent.getX(), motionEvent.getY()) > org.telegram.messenger.i0.e) {
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
                    if (!this.y && !this.H && !this.G && z8.a(this.E, motionEvent.getY(), motionEvent.getX(), motionEvent.getY()) > org.telegram.messenger.i0.e) {
                        this.H = true;
                    }
                    if (!this.y && !this.G && !this.H && z8.a(motionEvent.getX(), this.D, motionEvent.getX(), motionEvent.getY()) > org.telegram.messenger.i0.e) {
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
                        boolean contains2 = this.x.d.l.getBounds().contains((int) (motionEvent.getX() - this.x.a.left), (int) ((motionEvent.getY() - this.x.a.top) - org.telegram.messenger.i0.L(24.0f)));
                        this.y = contains2;
                        if (!contains2) {
                            this.x.d.l.setState(new int[0]);
                        }
                    }
                }
                p3 p3Var4 = this.x;
                if (!p3Var4.k.i) {
                    if (this.H) {
                        p3Var4.i = (motionEvent.getX() - this.E) / org.telegram.messenger.i0.L(300.0f);
                    } else if (this.G) {
                        float y10 = motionEvent.getY() - this.J;
                        if (this.L < getScrollMin()) {
                            y10 *= 1.0f - (Utilities.i((getScrollMin() - this.L) / getScrollStep(), 1.0f, 0.0f) * 0.5f);
                        }
                        setScrollOffset(Utilities.i(((getScrollOffset() * getScrollStep()) - y10) / getScrollStep(), getScrollMax(), getScrollMin() - (getScrollStep() * 1.4f)));
                        invalidate();
                    }
                }
                invalidate();
            }
            org.telegram.ui.Cells.y yVar4 = this.i0;
            if (yVar4 != null && this.K) {
                boolean z12 = this.x == null && yVar4.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
                this.K = z12;
                if (!z12) {
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
            p3 p3Var5 = this.x;
            if (p3Var5 != null) {
                p3Var5.a(0.0f);
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
        p3 p3Var6 = this.x;
        if (p3Var6 != null) {
            if (this.a == null || Math.abs(p3Var6.i) <= 0.4f) {
                this.x.a(0.0f);
                if (this.a != null && this.x.k.i) {
                    a(false);
                    p3 p3Var7 = this.x;
                    p3Var7.getClass();
                    this.a.e(p3Var7.c);
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
                            z10 = true;
                            overScroller.fling(0, (int) (getScrollOffset() * getScrollStep()), 0, (int) (-yVelocity), 0, 0, (int) (getScrollMin() * getScrollStep()), (int) (getScrollMax() * getScrollStep()), 0, (int) (getScrollStep() * 0.1f));
                        } else {
                            velocityTracker = null;
                            z10 = true;
                            overScroller.startScroll(0, (int) (getScrollOffset() * getScrollStep()), 0, 0, 0);
                        }
                        this.I.recycle();
                        this.I = velocityTracker;
                        postInvalidateOnAnimation();
                        velocityTracker2 = velocityTracker;
                        this.x.k.c(false);
                        if (this.y) {
                            this.y = this.x.d.l.getBounds().contains((int) (motionEvent.getX() - this.x.a.left), (int) ((motionEvent.getY() - this.x.a.top) - org.telegram.messenger.i0.L(24.0f)));
                        }
                        if (this.y) {
                            final p3 p3Var8 = this.x;
                            final int i10 = 1;
                            this.a.g(p3Var8.c, new q20(this) { // from class: org.telegram.ui.ActionBar.k3
                                public final /* synthetic */ q3 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.q20
                                public final void a(Object obj) {
                                    Boolean bool = (Boolean) obj;
                                    switch (i10) {
                                        case 0:
                                            q3 q3Var = this.b;
                                            q3Var.getClass();
                                            boolean booleanValue = bool.booleanValue();
                                            p3 p3Var9 = p3Var8;
                                            if (!booleanValue) {
                                                p3Var9.a(0.0f);
                                                break;
                                            } else {
                                                p3Var9.a(p3Var9.i < 0.0f ? -1.0f : 1.0f);
                                                q3Var.h(Utilities.i(q3Var.L, q3Var.c(false), q3Var.d(false)));
                                                if (q3Var.a.getTabs().isEmpty()) {
                                                    q3Var.a(false);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            q3 q3Var2 = this.b;
                                            q3Var2.getClass();
                                            boolean booleanValue2 = bool.booleanValue();
                                            p3 p3Var10 = p3Var8;
                                            if (!booleanValue2) {
                                                p3Var10.a(0.0f);
                                                break;
                                            } else {
                                                p3Var10.a(1.0f);
                                                q3Var2.h(Utilities.i(q3Var2.L, q3Var2.c(false), q3Var2.d(false)));
                                                if (q3Var2.a.getTabs().isEmpty()) {
                                                    q3Var2.a(false);
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
                    z10 = true;
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
                final p3 p3Var9 = this.x;
                final int i11 = 0;
                this.a.g(p3Var9.c, new q20(this) { // from class: org.telegram.ui.ActionBar.k3
                    public final /* synthetic */ q3 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.q20
                    public final void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (i11) {
                            case 0:
                                q3 q3Var = this.b;
                                q3Var.getClass();
                                boolean booleanValue = bool.booleanValue();
                                p3 p3Var92 = p3Var9;
                                if (!booleanValue) {
                                    p3Var92.a(0.0f);
                                    break;
                                } else {
                                    p3Var92.a(p3Var92.i < 0.0f ? -1.0f : 1.0f);
                                    q3Var.h(Utilities.i(q3Var.L, q3Var.c(false), q3Var.d(false)));
                                    if (q3Var.a.getTabs().isEmpty()) {
                                        q3Var.a(false);
                                        break;
                                    }
                                }
                                break;
                            default:
                                q3 q3Var2 = this.b;
                                q3Var2.getClass();
                                boolean booleanValue2 = bool.booleanValue();
                                p3 p3Var10 = p3Var9;
                                if (!booleanValue2) {
                                    p3Var10.a(0.0f);
                                    break;
                                } else {
                                    p3Var10.a(1.0f);
                                    q3Var2.h(Utilities.i(q3Var2.L, q3Var2.c(false), q3Var2.d(false)));
                                    if (q3Var2.a.getTabs().isEmpty()) {
                                        q3Var2.a(false);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
            }
            velocityTracker2 = null;
            z10 = true;
            this.x.k.c(false);
            if (this.y) {
            }
            if (this.y) {
            }
            this.x.d.l.setState(new int[0]);
            r82 = velocityTracker2;
        } else {
            Object obj = null;
            z10 = true;
            if (this.K) {
                this.a.f();
                a(false);
                r82 = obj;
            } else {
                r82 = obj;
                if (z8.a(this.E, this.D, motionEvent.getX(), motionEvent.getY()) <= org.telegram.messenger.i0.e) {
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
            return z10;
        }
        yVar6.setState(new int[0]);
        return z10;
    }

    public final float e(boolean z10) {
        float f7 = 0.0f;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.R;
            if (i10 >= arrayList.size()) {
                break;
            }
            f7 += ((p3) arrayList.get(i10)).d.d >= 0 ? 1.0f : 0.0f;
            i10++;
        }
        return z10 ? this.f.e(false, f7) : f7;
    }

    public final void f() {
        f3 f3Var;
        i3 i3Var = this.a;
        if (i3Var == null || !(i3Var.getParent() instanceof View)) {
            return;
        }
        HashSet hashSet = xh.m2.a1;
        if (!hashSet.isEmpty()) {
            Iterator it = new HashSet(hashSet).iterator();
            while (it.hasNext()) {
                ((xh.m2) it.next()).o(true);
            }
            org.telegram.messenger.i0.h3(new lg.s(this, 24), 100L);
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
        org.telegram.messenger.i0.m0 = true;
        this.M = org.telegram.messenger.i0.j2(14.0f, 14, view2);
        org.telegram.messenger.i0.m0 = false;
        Paint paint = new Paint(1);
        this.O = paint;
        Bitmap bitmap = this.M;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.N = bitmapShader;
        paint.setShader(bitmapShader);
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.i0.i(colorMatrix, t6.I.q() ? 0.08f : 0.25f);
        this.O.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.P = new Matrix();
        ArrayList arrayList = this.R;
        arrayList.clear();
        ArrayList<h3> tabs = this.a.getTabs();
        ArrayList<f3> tabDrawables = this.a.getTabDrawables();
        for (int size = tabs.size() - 1; size >= 0; size--) {
            h3 h3Var = tabs.get(size);
            int i10 = 0;
            while (true) {
                if (i10 >= tabDrawables.size()) {
                    f3Var = null;
                    break;
                }
                f3Var = tabDrawables.get(i10);
                if (f3Var.a == h3Var) {
                    break;
                } else {
                    i10++;
                }
            }
            if (f3Var != null) {
                arrayList.add(new p3(this, h3Var, f3Var));
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

    public final void h(float f7) {
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.T = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.L, f7);
        this.T = ofFloat;
        ofFloat.addUpdateListener(new j3(this, 1));
        this.T.setDuration(250L);
        this.T.setInterpolator(gr.h);
        this.T.start();
    }

    public void setScrollOffset(float f7) {
        this.L = f7;
    }

    public void setTabsView(i3 i3Var) {
        this.a = i3Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.i0 || super.verifyDrawable(drawable);
    }

    public void setSlowerDismiss(boolean z10) {
    }
}
