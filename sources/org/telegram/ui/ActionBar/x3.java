package org.telegram.ui.ActionBar;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.pr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.l20;
import v7.z6;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class x3 extends View {
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
    public o3 a;
    public final int[] a0;
    public u3 b;
    public final int[] b0;
    public l3 c;
    public final RectF c0;
    public ValueAnimator d;
    public final RectF d0;
    public float e;
    public final RectF e0;
    public final org.telegram.ui.Components.e6 f;
    public final Path f0;
    public f01 g0;
    public final OverScroller h;
    public boolean h0;
    public org.telegram.ui.Cells.z i0;
    public l20 j0;
    public final int n;
    public final int r;
    public int s;
    public final t3 v;
    public w3 w;
    public boolean x;
    public float y;

    public x3(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f = new org.telegram.ui.Components.e6(this, 0L, 350L, pr.h);
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
        t3 t3Var = new t3(this, this);
        this.v = t3Var;
        r0.i0.k(this, t3Var);
        setImportantForAccessibility(2);
        r0.a0.j(this, new n(this, 7));
    }

    public static void g(ViewGroup viewGroup, float f7, final di.m2 m2Var) {
        if (viewGroup.getWidth() <= 0 || viewGroup.getHeight() <= 0) {
            m2Var.run(null);
            return;
        }
        final SurfaceTexture b10 = org.telegram.messenger.u3.b();
        b10.setDefaultBufferSize(viewGroup.getWidth(), viewGroup.getHeight());
        final Surface surface = new Surface(b10);
        final Bitmap createBitmap = Bitmap.createBitmap(viewGroup.getWidth(), viewGroup.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
        lockHardwareCanvas.translate(0.0f, f7);
        viewGroup.draw(lockHardwareCanvas);
        surface.unlockCanvasAndPost(lockHardwareCanvas);
        PixelCopy.request(surface, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: org.telegram.ui.ActionBar.r3
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i10) {
                di.m2 m2Var2 = di.m2.this;
                Bitmap bitmap = createBitmap;
                Surface surface2 = surface;
                SurfaceTexture surfaceTexture = b10;
                if (i10 == 0) {
                    m2Var2.run(bitmap);
                } else {
                    bitmap.recycle();
                    m2Var2.run(null);
                }
                surface2.release();
                surfaceTexture.release();
            }
        }, new Handler());
    }

    private float getScrollStep() {
        return AndroidUtilities.dp(200.0f);
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
        t3 t3Var = this.v;
        if (t3Var != null) {
            t3Var.i();
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
        o3 o3Var = this.a;
        if (o3Var != null) {
            o3Var.b = false;
            o3Var.invalidate();
        }
        setModalAccessibility(z10);
        invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, z10 ? 1.0f : 0.0f);
        this.W = ofFloat;
        ofFloat.addUpdateListener(new p3(this, 0));
        this.W.addListener(new h(this, 4));
        this.W.setInterpolator(pr.h);
        this.W.setDuration(320L);
        this.W.start();
    }

    public final void b(u3 u3Var) {
        ValueAnimator valueAnimator;
        if (this.a == null) {
            return;
        }
        if (this.b != null && (valueAnimator = this.d) != null) {
            valueAnimator.end();
            this.d = null;
        }
        this.b = u3Var;
        u3Var.setLastVisible(false);
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        n3 a2 = u3Var.a();
        o3 o3Var = this.a;
        ArrayList<n3> tabs = o3Var.getTabs();
        ArrayList<l3> tabDrawables = o3Var.getTabDrawables();
        l3 l3Var = new l3(o3Var, a2);
        l3Var.d.d(-1.0f, true);
        l3Var.e.d(0.0f, true);
        tabDrawables.add(l3Var);
        tabs.add(0, a2);
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            l3 l3Var2 = tabDrawables.get(i10);
            int indexOf = tabs.indexOf(l3Var2.a);
            l3Var2.c = indexOf;
            if (indexOf >= 0) {
                l3Var2.b = indexOf;
            }
        }
        o3Var.n();
        o3Var.o(true);
        o3Var.invalidate();
        m3 m3Var = o3Var.e;
        if (m3Var != null) {
            m3Var.i();
        }
        this.c = l3Var;
        post(new q(u3Var, 10));
        invalidate();
        this.e = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.addUpdateListener(new p3(this, 1));
        this.d.addListener(new s3(this, a2, u3Var));
        AndroidUtilities.applySpring(this.d, 220.0d, 30.0d, 1.0d);
        this.d.setDuration((long) (r11.getDuration() * 1.1f));
        this.d.start();
    }

    public final float c(boolean z10) {
        return (e(z10) - Math.min(3.0f, e(z10))) - (Utilities.clamp(4.0f - e(z10), 0.5f, 0.0f) * (Math.min(3.0f, e(z10)) / 3.0f));
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.h.computeScrollOffset()) {
            setScrollOffset(r0.getCurrY() / getScrollStep());
            postInvalidateOnAnimation();
        }
    }

    public final float d(boolean z10) {
        return Utilities.clamp(e(z10), 1.0f, 0.0f) * ((-getScrollWindow()) / 3.0f);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        ArrayList arrayList;
        float f7;
        int i10;
        int i11;
        float f10;
        float f11;
        float f12;
        ArrayList arrayList2;
        RectF rectF2;
        int i12;
        float f13;
        float f14;
        x3 x3Var = this;
        super.dispatchDraw(canvas);
        u3 u3Var = x3Var.b;
        int[] iArr = x3Var.a0;
        int[] iArr2 = x3Var.b0;
        RectF rectF3 = x3Var.c0;
        if (u3Var != null) {
            x3Var.getLocationOnScreen(iArr2);
            x3Var.a.getLocationOnScreen(iArr);
            x3Var.a.d(rectF3, 0.0f);
            rectF3.offset(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
            canvas.save();
            canvas.clipRect(0, 0, x3Var.getMeasuredWidth(), x3Var.getMeasuredHeight() - x3Var.s);
            v3 windowView = x3Var.b.getWindowView();
            float f15 = x3Var.e;
            RectF rectF4 = x3Var.e0;
            float z10 = windowView.z(canvas, rectF3, f15, rectF4, f15);
            if (x3Var.c != null) {
                Path path = x3Var.f0;
                path.rewind();
                path.addRoundRect(rectF4, z10, z10, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float b10 = com.google.android.gms.internal.vision.e2.b(1.0f, x3Var.e, AndroidUtilities.dp(50.0f), rectF4.top);
                rectF3.set(rectF4.left, b10, rectF4.right, AndroidUtilities.dp(50.0f) + b10);
                x3Var.a.setupTab(x3Var.c);
                x3Var.c.a(canvas, rectF3, z10, x3Var.e, 1.0f);
                rectF = rectF3;
                canvas.restore();
            } else {
                rectF = rectF3;
            }
            canvas.restore();
        } else {
            rectF = rectF3;
        }
        if (x3Var.V <= 0.0f) {
            return;
        }
        canvas.save();
        View view = x3Var.S;
        RectF rectF5 = x3Var.Q;
        if (view != null) {
            view.getLocationOnScreen(iArr);
            x3Var.getLocationOnScreen(iArr2);
            rectF5.set(iArr[0] - iArr2[0], iArr[1] - iArr2[1], x3Var.S.getWidth() + r1, x3Var.S.getHeight() + (iArr[1] - iArr2[1]));
        } else {
            iArr[1] = 0;
            iArr[0] = 0;
            rectF5.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        canvas.clipRect(rectF5);
        canvas.translate(rectF5.left, rectF5.top);
        float width = rectF5.width();
        float height = rectF5.height();
        if (x3Var.M != null) {
            x3Var.P.reset();
            float width2 = rectF5.width() / x3Var.M.getWidth();
            x3Var.P.postScale(width2, width2);
            x3Var.N.setLocalMatrix(x3Var.P);
            x3Var.O.setAlpha((int) (x3Var.V * 255.0f));
            canvas.drawRect(0.0f, 0.0f, width, height, x3Var.O);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, width, height, 255, 31);
        float f16 = width;
        float f17 = height;
        float dp = AndroidUtilities.dp(55.0f) + AndroidUtilities.dp(40.0f) + AndroidUtilities.statusBarHeight;
        float dp2 = AndroidUtilities.dp(68.0f);
        int min = (int) Math.min(AndroidUtilities.dp(340.0f), 0.95f * f16);
        int height2 = (int) (AndroidUtilities.isTablet() ? rectF5.height() * 0.5f : 0.75f * f17);
        float f18 = f16 / 2.0f;
        int i13 = 0;
        float f19 = 0.0f;
        while (true) {
            arrayList = x3Var.R;
            if (i13 >= arrayList.size()) {
                break;
            }
            f19 += ((w3) arrayList.get(i13)).d.c >= 0 ? 1.0f : 0.0f;
            i13++;
        }
        float d = x3Var.f.d(f19, false);
        float lerp = AndroidUtilities.lerp(0.0f, 1.0f - Utilities.clamp(x3Var.getScrollWindow() <= 0.0f ? 0.0f : ((x3Var.getScrollMin() - x3Var.getScrollOffset()) / (x3Var.getScrollWindow() * 0.15f)) * 0.2f, 1.0f, 0.0f), x3Var.V);
        int i14 = 0;
        while (i14 < arrayList.size() + 1) {
            if (i14 == arrayList.size()) {
                f14 = dp;
                f7 = dp2;
                i11 = min;
                f10 = lerp;
                i10 = i14;
                f11 = f16;
                f12 = d;
                arrayList2 = arrayList;
                rectF2 = rectF;
                i12 = height2;
                f13 = f17;
            } else {
                w3 w3Var = (w3) arrayList.get(i14);
                if (i14 < arrayList.size()) {
                    l3 l3Var = w3Var.d;
                }
                l3 l3Var2 = w3Var.d;
                float[] fArr = w3Var.g;
                float f20 = dp;
                Matrix matrix = w3Var.f;
                float[] fArr2 = w3Var.h;
                float f21 = l3Var2 == null ? 1.0f : lerp;
                float c10 = (d - 1.0f) - l3Var2.c();
                f7 = dp2;
                i10 = i14;
                float max = (c10 - Math.max(x3Var.getScrollMin(), x3Var.getScrollOffset())) / x3Var.getScrollWindow();
                Math.max(max, 0.0f);
                Math.max(Math.min(max, 1.0f), -4.0f);
                float min2 = (Math.min(5.0f, c10) * AndroidUtilities.dp(6.0f)) + f20;
                float f22 = height2;
                float f23 = ((((f17 - f7) - (0.26f * f22)) - min2) * max) + min2;
                float f24 = min / 2.0f;
                i11 = min;
                RectF rectF6 = x3Var.d0;
                rectF6.set(f18 - f24, f23, f18 + f24, f22 + f23);
                boolean z11 = (rectF6.top > f17 || rectF6.bottom < 0.0f || lerp < 0.1f) && c10 < d - 3.0f;
                x3Var.a.d(rectF, Utilities.clamp(l3Var2.c(), 1.0f, 0.0f));
                rectF.offset(x3Var.a.getX(), x3Var.a.getY());
                AndroidUtilities.lerpCentered(rectF, rectF6, lerp, rectF6);
                o3 o3Var = x3Var.a;
                if (o3Var != null) {
                    o3Var.setupTab(l3Var2);
                }
                if (rectF6.top > f17 || rectF6.bottom < 0.0f) {
                    f10 = lerp;
                    f11 = f16;
                    f12 = d;
                    arrayList2 = arrayList;
                    rectF2 = rectF;
                    i12 = height2;
                    f13 = f17;
                    f14 = f20;
                } else {
                    canvas.save();
                    w3Var.a.set(rectF6);
                    matrix.reset();
                    fArr[0] = rectF6.left;
                    float f25 = rectF6.top;
                    fArr[1] = f25;
                    float f26 = rectF6.right;
                    fArr[2] = f26;
                    fArr[3] = f25;
                    fArr[4] = f26;
                    fArr[5] = (rectF6.height() * 1.0f) + f25;
                    fArr[6] = rectF6.left;
                    fArr[7] = (rectF6.height() * 1.0f) + rectF6.top;
                    fArr2[0] = rectF6.left;
                    fArr2[1] = rectF6.top - AndroidUtilities.dp(0.0f);
                    fArr2[2] = rectF6.right;
                    fArr2[3] = rectF6.top - AndroidUtilities.dp(0.0f);
                    float f27 = f21 * 1.0f;
                    fArr2[4] = (AndroidUtilities.lerp(1.0f, 0.83f, f27) * (rectF6.width() / 2.0f)) + rectF6.centerX();
                    fArr2[5] = (AndroidUtilities.lerp(1.0f, 0.6f, f27) * ((rectF6.height() * 1.0f) + AndroidUtilities.dp(0.0f))) + (rectF6.top - AndroidUtilities.dp(0.0f));
                    fArr2[6] = rectF6.centerX() - (AndroidUtilities.lerp(1.0f, 0.83f, f27) * (rectF6.width() / 2.0f));
                    fArr2[7] = (AndroidUtilities.lerp(1.0f, 0.6f, f27) * ((rectF6.height() * 1.0f) + AndroidUtilities.dp(0.0f))) + (rectF6.top - AndroidUtilities.dp(0.0f));
                    matrix.setPolyToPoly(w3Var.g, 0, w3Var.h, 0, 4);
                    canvas.concat(matrix);
                    float lerp2 = AndroidUtilities.lerp(l3Var2.b(), 1.0f, x3Var.V);
                    float lerp3 = AndroidUtilities.lerp(Utilities.clamp01((c10 - d) + 2.0f), 1.0f, Utilities.clamp01((f21 - 0.1f) / 0.8f));
                    RadialGradient radialGradient = w3Var.p;
                    Paint paint = w3Var.o;
                    Paint paint2 = w3Var.r;
                    f10 = lerp;
                    Matrix matrix2 = w3Var.q;
                    n3 n3Var = w3Var.c;
                    f12 = d;
                    Path path2 = w3Var.n;
                    arrayList2 = arrayList;
                    Paint paint3 = w3Var.e;
                    rectF2 = rectF;
                    RectF rectF7 = w3Var.m;
                    i12 = height2;
                    Paint paint4 = w3Var.l;
                    f13 = f17;
                    f11 = f16;
                    float clamp = Utilities.clamp(1.0f - ((Math.abs(w3Var.i) - 0.3f) / 0.7f), 1.0f, 0.0f) * lerp2;
                    if (clamp > 0.0f) {
                        float f28 = f27 * 1.0f;
                        float lerp4 = AndroidUtilities.lerp(1.0f, 1.3f, f28);
                        float currentActionBarHeight = ((k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(50.0f)) * 0.0f;
                        canvas.save();
                        canvas.rotate(w3Var.i * 20.0f, (w3Var.i * AndroidUtilities.dp(50.0f)) + rectF6.centerX(), rectF6.bottom + AndroidUtilities.dp(350.0f));
                        float a2 = w3Var.k.a(0.01f);
                        canvas.scale(a2, a2, rectF6.centerX(), rectF6.centerY());
                        float lerp5 = AndroidUtilities.lerp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), f27);
                        if (z11) {
                            paint4.setColor(0);
                            paint4.setShadowLayer(AndroidUtilities.dp(30.0f), 0.0f, AndroidUtilities.dp(10.0f), j6.l1(clamp * f27 * 1.0f, TLObject.FLAG_29));
                            canvas.drawRoundRect(rectF6, lerp5, lerp5, paint4);
                            paint3.setAlpha((int) (clamp * 255.0f));
                            canvas.drawRoundRect(rectF6, lerp5, lerp5, paint3);
                            canvas.restore();
                        } else {
                            path2.rewind();
                            path2.addRoundRect(rectF6, lerp5, lerp5, Path.Direction.CW);
                            canvas.save();
                            paint4.setColor(0);
                            paint4.setShadowLayer(AndroidUtilities.dp(30.0f), 0.0f, AndroidUtilities.dp(10.0f), j6.l1(clamp * f27 * 1.0f, TLObject.FLAG_29));
                            canvas.drawPath(path2, paint4);
                            canvas.clipPath(path2);
                            float f29 = clamp * 255.0f * f27;
                            int i15 = (int) f29;
                            paint3.setAlpha(i15);
                            canvas.drawRoundRect(rectF6, lerp5, lerp5, paint3);
                            canvas.save();
                            canvas.translate(rectF6.left, p6.a(AndroidUtilities.dp(50.0f), lerp4, rectF6.top, currentActionBarHeight));
                            canvas.scale(1.0f, AndroidUtilities.lerp(1.0f, 1.25f, f28));
                            if (n3Var != null && n3Var.m != null) {
                                float width3 = rectF6.width() / n3Var.m.getWidth();
                                canvas.scale(width3, width3);
                                paint.setAlpha(i15);
                                canvas.drawBitmap(n3Var.m, 0.0f, 0.0f, paint);
                            }
                            canvas.restore();
                            canvas.save();
                            paint2.setAlpha((int) (f29 * 1.0f));
                            matrix2.reset();
                            float height3 = rectF6.height() / 255.0f;
                            matrix2.postScale(height3, height3);
                            matrix2.postTranslate(rectF6.centerX(), rectF6.top);
                            radialGradient.setLocalMatrix(matrix2);
                            paint2.setShader(radialGradient);
                            canvas.drawRect(rectF6, paint2);
                            canvas.restore();
                            rectF7.set(rectF6);
                            rectF7.bottom = Math.min(rectF6.height(), AndroidUtilities.dp(50.0f)) + rectF7.top;
                            rectF7.offset(0.0f, currentActionBarHeight);
                            w3Var.d.v = f27;
                            canvas.scale(1.0f, lerp4, rectF7.centerX(), rectF7.top);
                            f14 = f20;
                            w3Var.d.a(canvas, rectF7, lerp5, clamp * clamp, lerp3);
                            canvas.restore();
                            canvas.restore();
                            canvas.restore();
                        }
                    }
                    f14 = f20;
                    canvas.restore();
                }
            }
            i14 = i10 + 1;
            dp = f14;
            lerp = f10;
            d = f12;
            arrayList = arrayList2;
            rectF = rectF2;
            height2 = i12;
            dp2 = f7;
            f17 = f13;
            min = i11;
            f16 = f11;
            x3Var = this;
        }
        float f30 = dp;
        float f31 = f16;
        canvas.save();
        if (this.j0 == null) {
            this.j0 = new l20();
        }
        RectF rectF8 = AndroidUtilities.rectTmp;
        rectF8.set(0.0f, 0.0f, f31, f30);
        this.j0.b(canvas, rectF8, 1, this.V);
        canvas.restore();
        canvas.restore();
        if (this.g0 == null) {
            this.g0 = new f01(LocaleController.getString(R.string.BotCloseAllTabs), 14.0f, AndroidUtilities.bold());
        }
        if (this.i0 == null || this.h0 != j6.I.q()) {
            boolean q6 = j6.I.q();
            this.h0 = q6;
            if (q6) {
                this.i0 = j6.i0(64, 64, 64, 64, 553648127, 872415231, 872415231);
            } else {
                this.i0 = j6.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688);
            }
            this.i0.setCallback(this);
        }
        float dp3 = this.g0.c + AndroidUtilities.dp(24.0f);
        float f32 = (f31 - dp3) / 2.0f;
        this.i0.setBounds((int) f32, (int) ((f30 - (AndroidUtilities.dp(95.0f) / 2.0f)) - AndroidUtilities.dp(14.0f)), (int) ((f31 + dp3) / 2.0f), (int) ((f30 - (AndroidUtilities.dp(95.0f) / 2.0f)) + AndroidUtilities.dp(14.0f)));
        this.i0.setAlpha((int) (this.V * 255.0f));
        this.i0.draw(canvas);
        this.g0.c(f32 + AndroidUtilities.dp(12.0f), f30 - (AndroidUtilities.dp(95.0f) / 2.0f), this.V, -1, canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        t3 t3Var;
        if (this.V <= 0.0f || (t3Var = this.v) == null || !t3Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x047a  */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.VelocityTracker, org.telegram.ui.ActionBar.w3] */
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
        w3 w3Var;
        if ((AndroidUtilities.isTablet() && motionEvent.getAction() == 0 && !this.Q.contains(motionEvent.getX(), motionEvent.getY())) || this.V <= 0.0f) {
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
            this.y = motionEvent.getY();
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            if (this.V >= 1.0f) {
                ArrayList arrayList = this.R;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    w3Var = (w3) arrayList.get(size);
                    if (Math.abs(w3Var.i) < 0.4f && w3Var.a.contains(x10, y3)) {
                        break;
                    }
                }
            }
            w3Var = null;
            this.w = w3Var;
            org.telegram.ui.Cells.z zVar = this.i0;
            boolean z11 = zVar != null && zVar.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
            this.K = z11;
            if (z11) {
                this.w = null;
            }
            org.telegram.ui.Cells.z zVar2 = this.i0;
            if (zVar2 != null) {
                zVar2.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.i0.setState(this.K ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : new int[0]);
            }
            this.G = false;
            this.H = false;
            this.x = false;
            w3 w3Var2 = this.w;
            if (w3Var2 != null) {
                ValueAnimator valueAnimator = w3Var2.j;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                boolean contains = this.w.d.k.getBounds().contains((int) (motionEvent.getX() - this.w.a.left), (int) ((motionEvent.getY() - this.w.a.top) - AndroidUtilities.dp(24.0f)));
                this.x = contains;
                if (contains) {
                    org.telegram.ui.Cells.z zVar3 = this.w.d.k;
                    float x11 = motionEvent.getX();
                    RectF rectF = this.c0;
                    zVar3.setHotspot((int) (x11 - rectF.left), (int) (motionEvent.getY() - rectF.centerY()));
                }
                this.w.k.c(!this.x);
                this.w.d.k.setState(this.x ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : new int[0]);
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
            w3 w3Var3 = this.w;
            if (w3Var3 != null) {
                if (w3Var3.k.h) {
                    if (!this.H && !this.G && z6.a(this.E, motionEvent.getY(), motionEvent.getX(), motionEvent.getY()) > AndroidUtilities.touchSlop) {
                        this.H = true;
                    }
                    if (!this.G && !this.H && z6.a(motionEvent.getX(), this.y, motionEvent.getX(), motionEvent.getY()) > AndroidUtilities.touchSlop) {
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
                        this.w.k.c(false);
                        ValueAnimator valueAnimator4 = this.w.j;
                        if (valueAnimator4 != null) {
                            valueAnimator4.cancel();
                        }
                    }
                } else {
                    if (!this.x && !this.H && !this.G && z6.a(this.E, motionEvent.getY(), motionEvent.getX(), motionEvent.getY()) > AndroidUtilities.touchSlop) {
                        this.H = true;
                    }
                    if (!this.x && !this.G && !this.H && z6.a(motionEvent.getX(), this.y, motionEvent.getX(), motionEvent.getY()) > AndroidUtilities.touchSlop) {
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
                    if (this.x) {
                        boolean contains2 = this.w.d.k.getBounds().contains((int) (motionEvent.getX() - this.w.a.left), (int) ((motionEvent.getY() - this.w.a.top) - AndroidUtilities.dp(24.0f)));
                        this.x = contains2;
                        if (!contains2) {
                            this.w.d.k.setState(new int[0]);
                        }
                    }
                }
                w3 w3Var4 = this.w;
                if (!w3Var4.k.h) {
                    if (this.H) {
                        w3Var4.i = (motionEvent.getX() - this.E) / AndroidUtilities.dp(300.0f);
                    } else if (this.G) {
                        float y10 = motionEvent.getY() - this.J;
                        if (this.L < getScrollMin()) {
                            y10 *= 1.0f - (Utilities.clamp((getScrollMin() - this.L) / getScrollStep(), 1.0f, 0.0f) * 0.5f);
                        }
                        setScrollOffset(Utilities.clamp(((getScrollOffset() * getScrollStep()) - y10) / getScrollStep(), getScrollMax(), getScrollMin() - (getScrollStep() * 1.4f)));
                        invalidate();
                    }
                }
                invalidate();
            }
            org.telegram.ui.Cells.z zVar4 = this.i0;
            if (zVar4 != null && this.K) {
                boolean z12 = this.w == null && zVar4.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
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
            w3 w3Var5 = this.w;
            if (w3Var5 != null) {
                w3Var5.a(0.0f);
                this.w.k.c(false);
                this.w.d.k.setState(new int[0]);
            }
            this.w = null;
            this.x = false;
            VelocityTracker velocityTracker3 = this.I;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.I = null;
            }
            this.K = false;
            org.telegram.ui.Cells.z zVar5 = this.i0;
            if (zVar5 == null) {
                return true;
            }
            zVar5.setState(new int[0]);
            return true;
        }
        w3 w3Var6 = this.w;
        if (w3Var6 != null) {
            if (this.a == null || Math.abs(w3Var6.i) <= 0.4f) {
                this.w.a(0.0f);
                if (this.a != null && this.w.k.h) {
                    a(false);
                    w3 w3Var7 = this.w;
                    w3Var7.getClass();
                    this.a.e(w3Var7.c);
                } else if (this.G) {
                    if (this.L < getScrollMin() - (getScrollWindow() * 0.15f)) {
                        a(false);
                    } else if (this.L < getScrollMin()) {
                        h(getScrollMin());
                    } else {
                        this.I.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.n);
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
                        this.w.k.c(false);
                        if (this.x) {
                            this.x = this.w.d.k.getBounds().contains((int) (motionEvent.getX() - this.w.a.left), (int) ((motionEvent.getY() - this.w.a.top) - AndroidUtilities.dp(24.0f)));
                        }
                        if (this.x) {
                            final w3 w3Var8 = this.w;
                            final int i10 = 1;
                            this.a.g(w3Var8.c, new Utilities.Callback(this) { // from class: org.telegram.ui.ActionBar.q3
                                public final /* synthetic */ x3 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    Boolean bool = (Boolean) obj;
                                    switch (i10) {
                                        case 0:
                                            x3 x3Var = this.b;
                                            x3Var.getClass();
                                            boolean booleanValue = bool.booleanValue();
                                            w3 w3Var9 = w3Var8;
                                            if (!booleanValue) {
                                                w3Var9.a(0.0f);
                                                break;
                                            } else {
                                                w3Var9.a(w3Var9.i < 0.0f ? -1.0f : 1.0f);
                                                x3Var.h(Utilities.clamp(x3Var.L, x3Var.c(false), x3Var.d(false)));
                                                if (x3Var.a.getTabs().isEmpty()) {
                                                    x3Var.a(false);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            x3 x3Var2 = this.b;
                                            x3Var2.getClass();
                                            boolean booleanValue2 = bool.booleanValue();
                                            w3 w3Var10 = w3Var8;
                                            if (!booleanValue2) {
                                                w3Var10.a(0.0f);
                                                break;
                                            } else {
                                                w3Var10.a(1.0f);
                                                x3Var2.h(Utilities.clamp(x3Var2.L, x3Var2.c(false), x3Var2.d(false)));
                                                if (x3Var2.a.getTabs().isEmpty()) {
                                                    x3Var2.a(false);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                        }
                        this.w.d.k.setState(new int[0]);
                        r82 = velocityTracker2;
                    }
                    velocityTracker = null;
                    z10 = true;
                    this.I.recycle();
                    this.I = velocityTracker;
                    postInvalidateOnAnimation();
                    velocityTracker2 = velocityTracker;
                    this.w.k.c(false);
                    if (this.x) {
                    }
                    if (this.x) {
                    }
                    this.w.d.k.setState(new int[0]);
                    r82 = velocityTracker2;
                }
            } else {
                final w3 w3Var9 = this.w;
                final int i11 = 0;
                this.a.g(w3Var9.c, new Utilities.Callback(this) { // from class: org.telegram.ui.ActionBar.q3
                    public final /* synthetic */ x3 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (i11) {
                            case 0:
                                x3 x3Var = this.b;
                                x3Var.getClass();
                                boolean booleanValue = bool.booleanValue();
                                w3 w3Var92 = w3Var9;
                                if (!booleanValue) {
                                    w3Var92.a(0.0f);
                                    break;
                                } else {
                                    w3Var92.a(w3Var92.i < 0.0f ? -1.0f : 1.0f);
                                    x3Var.h(Utilities.clamp(x3Var.L, x3Var.c(false), x3Var.d(false)));
                                    if (x3Var.a.getTabs().isEmpty()) {
                                        x3Var.a(false);
                                        break;
                                    }
                                }
                                break;
                            default:
                                x3 x3Var2 = this.b;
                                x3Var2.getClass();
                                boolean booleanValue2 = bool.booleanValue();
                                w3 w3Var10 = w3Var9;
                                if (!booleanValue2) {
                                    w3Var10.a(0.0f);
                                    break;
                                } else {
                                    w3Var10.a(1.0f);
                                    x3Var2.h(Utilities.clamp(x3Var2.L, x3Var2.c(false), x3Var2.d(false)));
                                    if (x3Var2.a.getTabs().isEmpty()) {
                                        x3Var2.a(false);
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
            this.w.k.c(false);
            if (this.x) {
            }
            if (this.x) {
            }
            this.w.d.k.setState(new int[0]);
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
                if (z6.a(this.E, this.y, motionEvent.getX(), motionEvent.getY()) <= AndroidUtilities.touchSlop) {
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
        this.w = r82;
        this.x = false;
        VelocityTracker velocityTracker4 = this.I;
        if (velocityTracker4 != null) {
            velocityTracker4.recycle();
            this.I = r82;
        }
        this.K = false;
        org.telegram.ui.Cells.z zVar6 = this.i0;
        if (zVar6 == null) {
            return z10;
        }
        zVar6.setState(new int[0]);
        return z10;
    }

    public final float e(boolean z10) {
        int i10 = 0;
        float f7 = 0.0f;
        while (true) {
            ArrayList arrayList = this.R;
            if (i10 >= arrayList.size()) {
                break;
            }
            f7 += ((w3) arrayList.get(i10)).d.c >= 0 ? 1.0f : 0.0f;
            i10++;
        }
        return z10 ? this.f.d(f7, false) : f7;
    }

    public final void f() {
        l3 l3Var;
        o3 o3Var = this.a;
        if (o3Var == null || !(o3Var.getParent() instanceof View)) {
            return;
        }
        HashSet hashSet = fi.k3.W0;
        if (!hashSet.isEmpty()) {
            Iterator it = new HashSet(hashSet).iterator();
            while (it.hasNext()) {
                ((fi.k3) it.next()).k(true);
            }
            AndroidUtilities.runOnUIThread(new q(this, 11), 100L);
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
        AndroidUtilities.makingGlobalBlurBitmap = true;
        this.M = AndroidUtilities.makeBlurBitmap(view2, 14.0f, 14);
        AndroidUtilities.makingGlobalBlurBitmap = false;
        Paint paint = new Paint(1);
        this.O = paint;
        Bitmap bitmap = this.M;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.N = bitmapShader;
        paint.setShader(bitmapShader);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, j6.I.q() ? 0.08f : 0.25f);
        this.O.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.P = new Matrix();
        ArrayList arrayList = this.R;
        arrayList.clear();
        ArrayList<n3> tabs = this.a.getTabs();
        ArrayList<l3> tabDrawables = this.a.getTabDrawables();
        for (int size = tabs.size() - 1; size >= 0; size--) {
            n3 n3Var = tabs.get(size);
            int i10 = 0;
            while (true) {
                if (i10 >= tabDrawables.size()) {
                    l3Var = null;
                    break;
                }
                l3Var = tabDrawables.get(i10);
                if (l3Var.a == n3Var) {
                    break;
                } else {
                    i10++;
                }
            }
            if (l3Var != null) {
                arrayList.add(new w3(this, n3Var, l3Var));
            }
        }
        this.f.d(arrayList.size(), true);
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
        ofFloat.addUpdateListener(new p3(this, 2));
        this.T.setDuration(250L);
        this.T.setInterpolator(pr.h);
        this.T.start();
    }

    public void setScrollOffset(float f7) {
        this.L = f7;
    }

    public void setTabsView(o3 o3Var) {
        this.a = o3Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.i0 || super.verifyDrawable(drawable);
    }

    public void setSlowerDismiss(boolean z10) {
    }
}
