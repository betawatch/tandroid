package org.telegram.ui.ActionBar;

import a8.w9;
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
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.y10;
import org.telegram.messenger.z8;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class m3 extends View {
    public float E;
    public float F;
    public long G;
    public boolean H;
    public boolean I;
    public VelocityTracker J;
    public float K;
    public boolean L;
    public float M;
    public Bitmap N;
    public BitmapShader O;
    public Paint P;
    public Matrix Q;
    public final RectF R;
    public final ArrayList S;
    public View T;
    public ValueAnimator U;
    public boolean V;
    public float W;
    public f3 a;
    public ValueAnimator a0;
    public j3 b;
    public final int[] b0;
    public c3 c;
    public final int[] c0;
    public ValueAnimator d;
    public final RectF d0;
    public float e;
    public final RectF e0;
    public final org.telegram.ui.Components.d6 f;
    public final RectF f0;
    public final Path g0;
    public final OverScroller h;
    public xy0 h0;
    public boolean i0;
    public org.telegram.ui.Cells.y j0;
    public h6.m k0;
    public final int n;
    public final int r;
    public int s;
    public final hi.c6 w;
    public l3 x;
    public boolean y;

    public m3(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f = new org.telegram.ui.Components.d6(this, 0L, 350L, nr.h);
        this.R = new RectF();
        this.S = new ArrayList();
        this.b0 = new int[2];
        this.c0 = new int[2];
        this.d0 = new RectF();
        this.e0 = new RectF();
        this.f0 = new RectF();
        this.g0 = new Path();
        setWillNotDraw(false);
        this.h = new OverScroller(launchActivity);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(launchActivity);
        this.n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.r = viewConfiguration.getScaledMinimumFlingVelocity();
        hi.c6 c6Var = new hi.c6(this, this);
        this.w = c6Var;
        r0.i0.j(this, c6Var);
        setImportantForAccessibility(2);
        r0.a0.i(this, new org.telegram.tgnet.u(this, 5));
    }

    public static void g(ViewGroup viewGroup, float f10, final b3 b3Var) {
        if (viewGroup.getWidth() <= 0 || viewGroup.getHeight() <= 0) {
            b3Var.a(null);
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
        PixelCopy.request(surface, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: org.telegram.ui.ActionBar.i3
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i7) {
                b3 b3Var2 = b3.this;
                Bitmap bitmap = createBitmap;
                Surface surface2 = surface;
                SurfaceTexture surfaceTexture = c10;
                if (i7 == 0) {
                    b3Var2.a(bitmap);
                } else {
                    bitmap.recycle();
                    b3Var2.a(null);
                }
                surface2.release();
                surfaceTexture.release();
            }
        }, new Handler());
    }

    private float getScrollStep() {
        return org.telegram.messenger.g0.L(200.0f);
    }

    private void setModalAccessibility(boolean z10) {
        setImportantForAccessibility(z10 ? 1 : 2);
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (childAt != this) {
                    childAt.setImportantForAccessibility(z10 ? 4 : 0);
                }
            }
        }
        hi.c6 c6Var = this.w;
        if (c6Var != null) {
            c6Var.i();
        }
        if (z10) {
            sendAccessibilityEvent(32);
        }
    }

    public final void a(boolean z10) {
        if (this.V == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.V = z10;
        f3 f3Var = this.a;
        if (f3Var != null) {
            f3Var.b = false;
            f3Var.invalidate();
        }
        setModalAccessibility(z10);
        invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.W, z10 ? 1.0f : 0.0f);
        this.a0 = ofFloat;
        ofFloat.addUpdateListener(new g3(this, 0));
        this.a0.addListener(new ki.m3(this, 12));
        this.a0.setInterpolator(nr.h);
        this.a0.setDuration(320L);
        this.a0.start();
    }

    public final void b(j3 j3Var) {
        ValueAnimator valueAnimator;
        if (this.a == null) {
            return;
        }
        if (this.b != null && (valueAnimator = this.d) != null) {
            valueAnimator.end();
            this.d = null;
        }
        this.b = j3Var;
        j3Var.b(false);
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        e3 c10 = j3Var.c();
        f3 f3Var = this.a;
        ArrayList<e3> tabs = f3Var.getTabs();
        ArrayList<c3> tabDrawables = f3Var.getTabDrawables();
        c3 c3Var = new c3(f3Var, c10);
        c3Var.e.e(true, -1.0f);
        c3Var.f.e(true, 0.0f);
        tabDrawables.add(c3Var);
        tabs.add(0, c10);
        for (int i7 = 0; i7 < tabDrawables.size(); i7++) {
            c3 c3Var2 = tabDrawables.get(i7);
            int indexOf = tabs.indexOf(c3Var2.a);
            c3Var2.d = indexOf;
            if (indexOf >= 0) {
                c3Var2.c = indexOf;
            }
        }
        f3Var.n();
        f3Var.o(true);
        f3Var.invalidate();
        d3 d3Var = f3Var.e;
        if (d3Var != null) {
            d3Var.i();
        }
        this.c = c3Var;
        post(new oi.c2(j3Var, 10));
        invalidate();
        this.e = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.addUpdateListener(new g3(this, 2));
        this.d.addListener(new fi.a3(this, c10, j3Var, 2));
        org.telegram.messenger.g0.n(this.d, 220.0d, 30.0d);
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
        m3 m3Var = this;
        super.dispatchDraw(canvas);
        j3 j3Var = m3Var.b;
        float f17 = 1.0f;
        int i13 = 1;
        int[] iArr = m3Var.b0;
        int[] iArr2 = m3Var.c0;
        int i14 = 0;
        RectF rectF3 = m3Var.d0;
        if (j3Var != null) {
            m3Var.getLocationOnScreen(iArr2);
            m3Var.a.getLocationOnScreen(iArr);
            m3Var.a.d(rectF3, 0.0f);
            rectF3.offset(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
            canvas.save();
            canvas.clipRect(0, 0, m3Var.getMeasuredWidth(), m3Var.getMeasuredHeight() - m3Var.s);
            k3 d = m3Var.b.d();
            float f18 = m3Var.e;
            RectF rectF4 = m3Var.f0;
            float z10 = d.z(canvas, rectF3, f18, rectF4, f18);
            if (m3Var.c != null) {
                Path path = m3Var.g0;
                path.rewind();
                path.addRoundRect(rectF4, z10, z10, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float t6 = com.google.android.gms.internal.vision.e2.t(1.0f, m3Var.e, org.telegram.messenger.g0.L(50.0f), rectF4.top);
                rectF3.set(rectF4.left, t6, rectF4.right, org.telegram.messenger.g0.L(50.0f) + t6);
                m3Var.a.setupTab(m3Var.c);
                m3Var.c.a(canvas, rectF3, z10, m3Var.e, 1.0f);
                rectF = rectF3;
                canvas.restore();
            } else {
                rectF = rectF3;
            }
            canvas.restore();
        } else {
            rectF = rectF3;
        }
        if (m3Var.W <= 0.0f) {
            return;
        }
        canvas.save();
        View view = m3Var.T;
        RectF rectF5 = m3Var.R;
        if (view != null) {
            view.getLocationOnScreen(iArr);
            m3Var.getLocationOnScreen(iArr2);
            rectF5.set(iArr[0] - iArr2[0], iArr[1] - iArr2[1], m3Var.T.getWidth() + r1, m3Var.T.getHeight() + (iArr[1] - iArr2[1]));
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
        if (m3Var.N != null) {
            m3Var.Q.reset();
            float width2 = rectF5.width() / m3Var.N.getWidth();
            m3Var.Q.postScale(width2, width2);
            m3Var.O.setLocalMatrix(m3Var.Q);
            m3Var.P.setAlpha((int) (m3Var.W * 255.0f));
            canvas.drawRect(0.0f, 0.0f, width, height, m3Var.P);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, width, height, ls.e4, 31);
        float f20 = width;
        float L = org.telegram.messenger.g0.L(55.0f) + org.telegram.messenger.g0.L(40.0f) + org.telegram.messenger.g0.m;
        float L2 = org.telegram.messenger.g0.L(68.0f);
        int min = (int) Math.min(org.telegram.messenger.g0.L(340.0f), 0.95f * f20);
        int height2 = (int) (org.telegram.messenger.g0.Q1() ? rectF5.height() * 0.5f : 0.75f * height);
        float f21 = f20 / 2.0f;
        float f22 = 0.0f;
        int i15 = 0;
        while (true) {
            arrayList = m3Var.S;
            f10 = f19;
            if (i15 >= arrayList.size()) {
                break;
            }
            f22 += ((l3) arrayList.get(i15)).d.d >= 0 ? 1.0f : 0.0f;
            i15++;
            f19 = f10;
        }
        float e10 = m3Var.f.e(false, f22);
        float T1 = org.telegram.messenger.g0.T1(0.0f, 1.0f - Utilities.i(m3Var.getScrollWindow() <= 0.0f ? 0.0f : ((m3Var.getScrollMin() - m3Var.getScrollOffset()) / (m3Var.getScrollWindow() * 0.15f)) * 0.2f, 1.0f, 0.0f), m3Var.W);
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
                l3 l3Var = (l3) arrayList.get(i16);
                int i17 = i14;
                if (i16 < arrayList.size()) {
                    c3 c3Var = l3Var.d;
                }
                c3 c3Var2 = l3Var.d;
                float f23 = f17;
                float[] fArr = l3Var.g;
                Matrix matrix = l3Var.f;
                float f24 = L;
                float[] fArr2 = l3Var.h;
                float f25 = c3Var2 == null ? f23 : T1;
                float c10 = (e10 - f23) - c3Var2.c();
                f11 = L2;
                i10 = i16;
                float max = (c10 - Math.max(m3Var.getScrollMin(), m3Var.getScrollOffset())) / m3Var.getScrollWindow();
                Math.max(max, 0.0f);
                Math.max(Math.min(max, f23), -4.0f);
                float min2 = (Math.min(5.0f, c10) * org.telegram.messenger.g0.L(6.0f)) + f24;
                float f26 = height2;
                float f27 = ((((height - f11) - (0.26f * f26)) - min2) * max) + min2;
                float f28 = min / 2.0f;
                i11 = min;
                RectF rectF6 = m3Var.e0;
                rectF6.set(f21 - f28, f27, f21 + f28, f26 + f27);
                int i18 = ((rectF6.top > height || rectF6.bottom < 0.0f || T1 < 0.1f) && c10 < e10 - 3.0f) ? i7 : i17;
                m3Var.a.d(rectF, Utilities.i(c3Var2.c(), 1.0f, 0.0f));
                rectF.offset(m3Var.a.getX(), m3Var.a.getY());
                org.telegram.messenger.g0.c2(rectF, rectF6, T1, rectF6);
                f3 f3Var = m3Var.a;
                if (f3Var != null) {
                    f3Var.setupTab(c3Var2);
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
                    l3Var.a.set(rectF6);
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
                    matrix.setPolyToPoly(l3Var.g, 0, l3Var.h, 0, 4);
                    canvas.concat(matrix);
                    float T12 = org.telegram.messenger.g0.T1(c3Var2.b(), 1.0f, m3Var.W);
                    float T13 = org.telegram.messenger.g0.T1(Utilities.l((c10 - e10) + 2.0f), 1.0f, Utilities.l((f25 - 0.1f) / 0.8f));
                    RadialGradient radialGradient = l3Var.p;
                    Paint paint = l3Var.o;
                    Paint paint2 = l3Var.r;
                    Matrix matrix2 = l3Var.q;
                    e3 e3Var = l3Var.c;
                    f12 = T1;
                    Path path2 = l3Var.n;
                    arrayList2 = arrayList;
                    Paint paint3 = l3Var.e;
                    f14 = e10;
                    RectF rectF7 = l3Var.m;
                    rectF2 = rectF;
                    Paint paint4 = l3Var.l;
                    i12 = height2;
                    f13 = f20;
                    f16 = 1.0f;
                    float i19 = Utilities.i(1.0f - ((Math.abs(l3Var.i) - 0.3f) / 0.7f), 1.0f, 0.0f) * T12;
                    if (i19 <= 0.0f) {
                        f15 = f24;
                    } else {
                        float f32 = f31 * 1.0f;
                        float T14 = org.telegram.messenger.g0.T1(1.0f, 1.3f, f32);
                        float currentActionBarHeight = ((k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(50.0f)) * 0.0f;
                        canvas.save();
                        canvas.rotate(l3Var.i * 20.0f, (l3Var.i * org.telegram.messenger.g0.L(50.0f)) + rectF6.centerX(), rectF6.bottom + org.telegram.messenger.g0.L(350.0f));
                        float a10 = l3Var.k.a(0.01f);
                        canvas.scale(a10, a10, rectF6.centerX(), rectF6.centerY());
                        float W1 = org.telegram.messenger.g0.W1(f31, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f));
                        if (i18 != 0) {
                            paint4.setColor(i17);
                            paint4.setShadowLayer(org.telegram.messenger.g0.L(30.0f), 0.0f, org.telegram.messenger.g0.L(10.0f), m6.r1(i19 * f31 * 1.0f, TLObject.FLAG_29));
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
                            paint4.setShadowLayer(org.telegram.messenger.g0.L(30.0f), 0.0f, org.telegram.messenger.g0.L(10.0f), m6.r1(i19 * f31 * 1.0f, TLObject.FLAG_29));
                            canvas.drawPath(path2, paint4);
                            canvas.clipPath(path2);
                            float f33 = i19 * f10 * f31;
                            int i20 = (int) f33;
                            paint3.setAlpha(i20);
                            canvas.drawRoundRect(rectF6, W1, W1, paint3);
                            canvas.save();
                            canvas.translate(rectF6.left, p5.c.e(org.telegram.messenger.g0.L(50.0f), T14, rectF6.top, currentActionBarHeight));
                            canvas.scale(1.0f, org.telegram.messenger.g0.T1(1.0f, 1.25f, f32));
                            if (e3Var != null && e3Var.m != null) {
                                float width3 = rectF6.width() / e3Var.m.getWidth();
                                canvas.scale(width3, width3);
                                paint.setAlpha(i20);
                                canvas.drawBitmap(e3Var.m, 0.0f, 0.0f, paint);
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
                            l3Var.d.w = f31;
                            f16 = 1.0f;
                            canvas.scale(1.0f, T14, rectF7.centerX(), rectF7.top);
                            f15 = f24;
                            l3Var.d.a(canvas, rectF7, W1, i19 * i19, T13);
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
            m3Var = this;
        }
        float f34 = L;
        float f35 = f20;
        canvas.save();
        if (this.k0 == null) {
            this.k0 = new h6.m(29);
        }
        RectF rectF8 = org.telegram.messenger.g0.P;
        rectF8.set(0.0f, 0.0f, f35, f34);
        this.k0.n(canvas, rectF8, i7, this.W);
        canvas.restore();
        canvas.restore();
        if (this.h0 == null) {
            this.h0 = new xy0(hd.N0(2131753096, null), 14.0f, org.telegram.messenger.g0.o());
        }
        if (this.j0 == null || this.i0 != m6.I.q()) {
            boolean q10 = m6.I.q();
            this.i0 = q10;
            if (q10) {
                this.j0 = m6.k0(64, 64, 64, 64, 553648127, 872415231, 872415231);
            } else {
                this.j0 = m6.k0(64, 64, 64, 64, 771751936, 1140850688, 1140850688);
            }
            this.j0.setCallback(this);
        }
        float L3 = this.h0.c + org.telegram.messenger.g0.L(24.0f);
        float f36 = (f35 - L3) / 2.0f;
        this.j0.setBounds((int) f36, (int) ((f34 - (org.telegram.messenger.g0.L(95.0f) / 2.0f)) - org.telegram.messenger.g0.L(14.0f)), (int) ((f35 + L3) / 2.0f), (int) ((f34 - (org.telegram.messenger.g0.L(95.0f) / 2.0f)) + org.telegram.messenger.g0.L(14.0f)));
        this.j0.setAlpha((int) (this.W * f10));
        this.j0.draw(canvas);
        this.h0.c(f36 + org.telegram.messenger.g0.L(12.0f), f34 - (org.telegram.messenger.g0.L(95.0f) / 2.0f), this.W, -1, canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        hi.c6 c6Var;
        if (this.W <= 0.0f || (c6Var = this.w) == null || !c6Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0470  */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.VelocityTracker, org.telegram.ui.ActionBar.l3] */
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
        l3 l3Var;
        if ((org.telegram.messenger.g0.Q1() && motionEvent.getAction() == 0 && !this.R.contains(motionEvent.getX(), motionEvent.getY())) || this.W <= 0.0f) {
            return false;
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(motionEvent);
        int action = motionEvent.getAction();
        OverScroller overScroller = this.h;
        if (action == 0) {
            this.G = System.currentTimeMillis();
            this.F = motionEvent.getX();
            this.E = motionEvent.getY();
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (this.W >= 1.0f) {
                ArrayList arrayList = this.S;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    l3Var = (l3) arrayList.get(size);
                    if (Math.abs(l3Var.i) < 0.4f && l3Var.a.contains(x10, y10)) {
                        break;
                    }
                }
            }
            l3Var = null;
            this.x = l3Var;
            org.telegram.ui.Cells.y yVar = this.j0;
            boolean z11 = yVar != null && yVar.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
            this.L = z11;
            if (z11) {
                this.x = null;
            }
            org.telegram.ui.Cells.y yVar2 = this.j0;
            if (yVar2 != null) {
                yVar2.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.j0.setState(this.L ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : new int[0]);
            }
            this.H = false;
            this.I = false;
            this.y = false;
            l3 l3Var2 = this.x;
            if (l3Var2 != null) {
                ValueAnimator valueAnimator = l3Var2.j;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                boolean contains = this.x.d.l.getBounds().contains((int) (motionEvent.getX() - this.x.a.left), (int) ((motionEvent.getY() - this.x.a.top) - org.telegram.messenger.g0.L(24.0f)));
                this.y = contains;
                if (contains) {
                    org.telegram.ui.Cells.y yVar3 = this.x.d.l;
                    float x11 = motionEvent.getX();
                    RectF rectF = this.d0;
                    yVar3.setHotspot((int) (x11 - rectF.left), (int) (motionEvent.getY() - rectF.centerY()));
                }
                this.x.k.c(!this.y);
                this.x.d.l.setState(this.y ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : new int[0]);
            }
            this.K = motionEvent.getY();
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
            }
            ValueAnimator valueAnimator2 = this.U;
            if (valueAnimator2 == null) {
                return true;
            }
            valueAnimator2.cancel();
            this.U = null;
            return true;
        }
        if (motionEvent.getAction() == 2) {
            l3 l3Var3 = this.x;
            if (l3Var3 != null) {
                if (l3Var3.k.i) {
                    if (!this.I && !this.H && w9.a(this.F, motionEvent.getY(), motionEvent.getX(), motionEvent.getY()) > org.telegram.messenger.g0.e) {
                        this.I = true;
                    }
                    if (!this.H && !this.I && w9.a(motionEvent.getX(), this.E, motionEvent.getX(), motionEvent.getY()) > org.telegram.messenger.g0.e) {
                        if (!overScroller.isFinished()) {
                            overScroller.abortAnimation();
                        }
                        ValueAnimator valueAnimator3 = this.U;
                        if (valueAnimator3 != null) {
                            valueAnimator3.cancel();
                            this.U = null;
                        }
                        this.H = true;
                    }
                    if (this.a != null && (this.H || this.I)) {
                        this.x.k.c(false);
                        ValueAnimator valueAnimator4 = this.x.j;
                        if (valueAnimator4 != null) {
                            valueAnimator4.cancel();
                        }
                    }
                } else {
                    if (!this.y && !this.I && !this.H && w9.a(this.F, motionEvent.getY(), motionEvent.getX(), motionEvent.getY()) > org.telegram.messenger.g0.e) {
                        this.I = true;
                    }
                    if (!this.y && !this.H && !this.I && w9.a(motionEvent.getX(), this.E, motionEvent.getX(), motionEvent.getY()) > org.telegram.messenger.g0.e) {
                        if (!overScroller.isFinished()) {
                            overScroller.abortAnimation();
                        }
                        ValueAnimator valueAnimator5 = this.U;
                        if (valueAnimator5 != null) {
                            valueAnimator5.cancel();
                            this.U = null;
                        }
                        this.H = true;
                    }
                    if (this.y) {
                        boolean contains2 = this.x.d.l.getBounds().contains((int) (motionEvent.getX() - this.x.a.left), (int) ((motionEvent.getY() - this.x.a.top) - org.telegram.messenger.g0.L(24.0f)));
                        this.y = contains2;
                        if (!contains2) {
                            this.x.d.l.setState(new int[0]);
                        }
                    }
                }
                l3 l3Var4 = this.x;
                if (!l3Var4.k.i) {
                    if (this.I) {
                        l3Var4.i = (motionEvent.getX() - this.F) / org.telegram.messenger.g0.L(300.0f);
                    } else if (this.H) {
                        float y11 = motionEvent.getY() - this.K;
                        if (this.M < getScrollMin()) {
                            y11 *= 1.0f - (Utilities.i((getScrollMin() - this.M) / getScrollStep(), 1.0f, 0.0f) * 0.5f);
                        }
                        setScrollOffset(Utilities.i(((getScrollOffset() * getScrollStep()) - y11) / getScrollStep(), getScrollMax(), getScrollMin() - (getScrollStep() * 1.4f)));
                        invalidate();
                    }
                }
                invalidate();
            }
            org.telegram.ui.Cells.y yVar4 = this.j0;
            if (yVar4 != null && this.L) {
                boolean z12 = this.x == null && yVar4.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
                this.L = z12;
                if (!z12) {
                    this.j0.setState(new int[0]);
                }
            }
            this.K = motionEvent.getY();
            return true;
        }
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() != 3) {
                return true;
            }
            l3 l3Var5 = this.x;
            if (l3Var5 != null) {
                l3Var5.a(0.0f);
                this.x.k.c(false);
                this.x.d.l.setState(new int[0]);
            }
            this.x = null;
            this.y = false;
            VelocityTracker velocityTracker3 = this.J;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.J = null;
            }
            this.L = false;
            org.telegram.ui.Cells.y yVar5 = this.j0;
            if (yVar5 == null) {
                return true;
            }
            yVar5.setState(new int[0]);
            return true;
        }
        l3 l3Var6 = this.x;
        if (l3Var6 != null) {
            if (this.a == null || Math.abs(l3Var6.i) <= 0.4f) {
                this.x.a(0.0f);
                if (this.a != null && this.x.k.i) {
                    a(false);
                    l3 l3Var7 = this.x;
                    l3Var7.getClass();
                    this.a.e(l3Var7.c);
                } else if (this.H) {
                    if (this.M < getScrollMin() - (getScrollWindow() * 0.15f)) {
                        a(false);
                    } else if (this.M < getScrollMin()) {
                        h(getScrollMin());
                    } else {
                        this.J.computeCurrentVelocity(1000, this.n);
                        float yVelocity = this.J.getYVelocity();
                        if (Math.abs(yVelocity) > this.r) {
                            velocityTracker = null;
                            z10 = true;
                            overScroller.fling(0, (int) (getScrollOffset() * getScrollStep()), 0, (int) (-yVelocity), 0, 0, (int) (getScrollMin() * getScrollStep()), (int) (getScrollMax() * getScrollStep()), 0, (int) (getScrollStep() * 0.1f));
                        } else {
                            velocityTracker = null;
                            z10 = true;
                            overScroller.startScroll(0, (int) (getScrollOffset() * getScrollStep()), 0, 0, 0);
                        }
                        this.J.recycle();
                        this.J = velocityTracker;
                        postInvalidateOnAnimation();
                        velocityTracker2 = velocityTracker;
                        this.x.k.c(false);
                        if (this.y) {
                            this.y = this.x.d.l.getBounds().contains((int) (motionEvent.getX() - this.x.a.left), (int) ((motionEvent.getY() - this.x.a.top) - org.telegram.messenger.g0.L(24.0f)));
                        }
                        if (this.y) {
                            final l3 l3Var8 = this.x;
                            final int i7 = 1;
                            this.a.g(l3Var8.c, new y10(this) { // from class: org.telegram.ui.ActionBar.h3
                                public final /* synthetic */ m3 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.y10
                                public final void a(Object obj) {
                                    Boolean bool = (Boolean) obj;
                                    switch (i7) {
                                        case 0:
                                            m3 m3Var = this.b;
                                            m3Var.getClass();
                                            boolean booleanValue = bool.booleanValue();
                                            l3 l3Var9 = l3Var8;
                                            if (!booleanValue) {
                                                l3Var9.a(0.0f);
                                                break;
                                            } else {
                                                l3Var9.a(l3Var9.i < 0.0f ? -1.0f : 1.0f);
                                                m3Var.h(Utilities.i(m3Var.M, m3Var.c(false), m3Var.d(false)));
                                                if (m3Var.a.getTabs().isEmpty()) {
                                                    m3Var.a(false);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            m3 m3Var2 = this.b;
                                            m3Var2.getClass();
                                            boolean booleanValue2 = bool.booleanValue();
                                            l3 l3Var10 = l3Var8;
                                            if (!booleanValue2) {
                                                l3Var10.a(0.0f);
                                                break;
                                            } else {
                                                l3Var10.a(1.0f);
                                                m3Var2.h(Utilities.i(m3Var2.M, m3Var2.c(false), m3Var2.d(false)));
                                                if (m3Var2.a.getTabs().isEmpty()) {
                                                    m3Var2.a(false);
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
                    this.J.recycle();
                    this.J = velocityTracker;
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
                final l3 l3Var9 = this.x;
                final int i10 = 0;
                this.a.g(l3Var9.c, new y10(this) { // from class: org.telegram.ui.ActionBar.h3
                    public final /* synthetic */ m3 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.y10
                    public final void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (i10) {
                            case 0:
                                m3 m3Var = this.b;
                                m3Var.getClass();
                                boolean booleanValue = bool.booleanValue();
                                l3 l3Var92 = l3Var9;
                                if (!booleanValue) {
                                    l3Var92.a(0.0f);
                                    break;
                                } else {
                                    l3Var92.a(l3Var92.i < 0.0f ? -1.0f : 1.0f);
                                    m3Var.h(Utilities.i(m3Var.M, m3Var.c(false), m3Var.d(false)));
                                    if (m3Var.a.getTabs().isEmpty()) {
                                        m3Var.a(false);
                                        break;
                                    }
                                }
                                break;
                            default:
                                m3 m3Var2 = this.b;
                                m3Var2.getClass();
                                boolean booleanValue2 = bool.booleanValue();
                                l3 l3Var10 = l3Var9;
                                if (!booleanValue2) {
                                    l3Var10.a(0.0f);
                                    break;
                                } else {
                                    l3Var10.a(1.0f);
                                    m3Var2.h(Utilities.i(m3Var2.M, m3Var2.c(false), m3Var2.d(false)));
                                    if (m3Var2.a.getTabs().isEmpty()) {
                                        m3Var2.a(false);
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
            if (this.L) {
                this.a.f();
                a(false);
                r82 = obj;
            } else {
                r82 = obj;
                if (w9.a(this.F, this.E, motionEvent.getX(), motionEvent.getY()) <= org.telegram.messenger.g0.e) {
                    r82 = obj;
                    if (!this.H) {
                        r82 = obj;
                        if (!this.I) {
                            r82 = obj;
                            if (System.currentTimeMillis() - this.G <= ViewConfiguration.getTapTimeout() * 1.2f) {
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
        VelocityTracker velocityTracker4 = this.J;
        if (velocityTracker4 != null) {
            velocityTracker4.recycle();
            this.J = r82;
        }
        this.L = false;
        org.telegram.ui.Cells.y yVar6 = this.j0;
        if (yVar6 == null) {
            return z10;
        }
        yVar6.setState(new int[0]);
        return z10;
    }

    public final float e(boolean z10) {
        float f10 = 0.0f;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.S;
            if (i7 >= arrayList.size()) {
                break;
            }
            f10 += ((l3) arrayList.get(i7)).d.d >= 0 ? 1.0f : 0.0f;
            i7++;
        }
        return z10 ? this.f.e(false, f10) : f10;
    }

    public final void f() {
        c3 c3Var;
        f3 f3Var = this.a;
        if (f3Var == null || !(f3Var.getParent() instanceof View)) {
            return;
        }
        HashSet hashSet = ki.s2.b1;
        if (!hashSet.isEmpty()) {
            Iterator it = new HashSet(hashSet).iterator();
            while (it.hasNext()) {
                ((ki.s2) it.next()).o(true);
            }
            org.telegram.messenger.g0.h3(new oi.c2(this, 11), 100L);
            return;
        }
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.d = null;
        }
        View view = (View) this.a.getParent();
        this.T = view;
        int[] iArr = this.b0;
        if (view != null) {
            view.getLocationOnScreen(iArr);
        } else {
            iArr[1] = 0;
            iArr[0] = 0;
        }
        int[] iArr2 = this.c0;
        getLocationOnScreen(iArr2);
        this.R.set(iArr[0] - iArr2[0], iArr[1] - iArr2[1], this.T.getWidth() + r5, this.T.getHeight() + (iArr[1] - iArr2[1]));
        View view2 = this.T;
        org.telegram.messenger.g0.m0 = true;
        this.N = org.telegram.messenger.g0.j2(14.0f, 14, view2);
        org.telegram.messenger.g0.m0 = false;
        Paint paint = new Paint(1);
        this.P = paint;
        Bitmap bitmap = this.N;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.O = bitmapShader;
        paint.setShader(bitmapShader);
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.g0.i(colorMatrix, m6.I.q() ? 0.08f : 0.25f);
        this.P.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.Q = new Matrix();
        ArrayList arrayList = this.S;
        arrayList.clear();
        ArrayList<e3> tabs = this.a.getTabs();
        ArrayList<c3> tabDrawables = this.a.getTabDrawables();
        for (int size = tabs.size() - 1; size >= 0; size--) {
            e3 e3Var = tabs.get(size);
            int i7 = 0;
            while (true) {
                if (i7 >= tabDrawables.size()) {
                    c3Var = null;
                    break;
                }
                c3Var = tabDrawables.get(i7);
                if (c3Var.a == e3Var) {
                    break;
                } else {
                    i7++;
                }
            }
            if (c3Var != null) {
                arrayList.add(new l3(this, e3Var, c3Var));
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
        return this.M;
    }

    public float getScrollRange() {
        return e(true);
    }

    public float getScrollWindow() {
        return Math.min(3.0f, getScrollRange());
    }

    public final void h(float f10) {
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.U = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M, f10);
        this.U = ofFloat;
        ofFloat.addUpdateListener(new g3(this, 1));
        this.U.setDuration(250L);
        this.U.setInterpolator(nr.h);
        this.U.start();
    }

    public void setScrollOffset(float f10) {
        this.M = f10;
    }

    public void setTabsView(f3 f3Var) {
        this.a = f3Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.j0 || super.verifyDrawable(drawable);
    }

    public void setSlowerDismiss(boolean z10) {
    }
}
