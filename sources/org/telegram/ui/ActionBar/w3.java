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
import k7.n6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.nr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.g20;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class w3 extends View {
    public float B;
    public long C;
    public boolean D;
    public boolean E;
    public VelocityTracker F;
    public float G;
    public boolean H;
    public float I;
    public Bitmap J;
    public BitmapShader K;
    public Paint L;
    public Matrix M;
    public final RectF N;
    public final ArrayList O;
    public View P;
    public ValueAnimator Q;
    public boolean R;
    public float S;
    public ValueAnimator T;
    public final int[] U;
    public final int[] V;
    public final RectF W;
    public n3 a;
    public final RectF a0;
    public t3 b;
    public final RectF b0;
    public k3 c;
    public final Path c0;
    public ValueAnimator d;
    public k01 d0;
    public float e;
    public boolean e0;
    public final org.telegram.ui.Components.z5 f;
    public org.telegram.ui.Cells.z f0;
    public g20 g0;
    public final OverScroller h;
    public final int n;
    public final int r;
    public int s;
    public final s3 v;
    public v3 w;
    public boolean x;
    public float y;

    public w3(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f = new org.telegram.ui.Components.z5(this, 0L, 350L, nr.h);
        this.N = new RectF();
        this.O = new ArrayList();
        this.U = new int[2];
        this.V = new int[2];
        this.W = new RectF();
        this.a0 = new RectF();
        this.b0 = new RectF();
        this.c0 = new Path();
        setWillNotDraw(false);
        this.h = new OverScroller(launchActivity);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(launchActivity);
        this.n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.r = viewConfiguration.getScaledMinimumFlingVelocity();
        s3 s3Var = new s3(this, this);
        this.v = s3Var;
        r0.j0.k(this, s3Var);
        setImportantForAccessibility(2);
        r0.b0.j(this, new n(this, 6));
    }

    public static void g(ViewGroup viewGroup, float f10, final kh.a1 a1Var) {
        if (viewGroup.getWidth() <= 0 || viewGroup.getHeight() <= 0) {
            a1Var.run(null);
            return;
        }
        final SurfaceTexture b10 = org.telegram.messenger.v3.b();
        b10.setDefaultBufferSize(viewGroup.getWidth(), viewGroup.getHeight());
        final Surface surface = new Surface(b10);
        final Bitmap createBitmap = Bitmap.createBitmap(viewGroup.getWidth(), viewGroup.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
        lockHardwareCanvas.translate(0.0f, f10);
        viewGroup.draw(lockHardwareCanvas);
        surface.unlockCanvasAndPost(lockHardwareCanvas);
        PixelCopy.request(surface, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: org.telegram.ui.ActionBar.q3
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i10) {
                kh.a1 a1Var2 = kh.a1.this;
                Bitmap bitmap = createBitmap;
                Surface surface2 = surface;
                SurfaceTexture surfaceTexture = b10;
                if (i10 == 0) {
                    a1Var2.run(bitmap);
                } else {
                    bitmap.recycle();
                    a1Var2.run(null);
                }
                surface2.release();
                surfaceTexture.release();
            }
        }, new Handler());
    }

    private float getScrollStep() {
        return AndroidUtilities.dp(200.0f);
    }

    private void setModalAccessibility(boolean z4) {
        setImportantForAccessibility(z4 ? 1 : 2);
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != this) {
                    childAt.setImportantForAccessibility(z4 ? 4 : 0);
                }
            }
        }
        s3 s3Var = this.v;
        if (s3Var != null) {
            s3Var.i();
        }
        if (z4) {
            sendAccessibilityEvent(32);
        }
    }

    public final void a(boolean z4) {
        if (this.R == z4) {
            return;
        }
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.R = z4;
        n3 n3Var = this.a;
        if (n3Var != null) {
            n3Var.b = false;
            n3Var.invalidate();
        }
        setModalAccessibility(z4);
        invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.S, z4 ? 1.0f : 0.0f);
        this.T = ofFloat;
        ofFloat.addUpdateListener(new o3(this, 0));
        this.T.addListener(new h(this, 4));
        this.T.setInterpolator(nr.h);
        this.T.setDuration(320L);
        this.T.start();
    }

    public final void b(t3 t3Var) {
        ValueAnimator valueAnimator;
        if (this.a == null) {
            return;
        }
        if (this.b != null && (valueAnimator = this.d) != null) {
            valueAnimator.end();
            this.d = null;
        }
        this.b = t3Var;
        t3Var.setLastVisible(false);
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        m3 a2 = t3Var.a();
        n3 n3Var = this.a;
        ArrayList<m3> tabs = n3Var.getTabs();
        ArrayList<k3> tabDrawables = n3Var.getTabDrawables();
        k3 k3Var = new k3(n3Var, a2);
        k3Var.d.d(-1.0f, true);
        k3Var.e.d(0.0f, true);
        tabDrawables.add(k3Var);
        tabs.add(0, a2);
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            k3 k3Var2 = tabDrawables.get(i10);
            int indexOf = tabs.indexOf(k3Var2.a);
            k3Var2.c = indexOf;
            if (indexOf >= 0) {
                k3Var2.b = indexOf;
            }
        }
        n3Var.n();
        n3Var.o(true);
        n3Var.invalidate();
        l3 l3Var = n3Var.e;
        if (l3Var != null) {
            l3Var.i();
        }
        this.c = k3Var;
        post(new p(t3Var, 10));
        invalidate();
        this.e = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.addUpdateListener(new o3(this, 1));
        this.d.addListener(new r3(this, a2, t3Var));
        AndroidUtilities.applySpring(this.d, 220.0d, 30.0d, 1.0d);
        this.d.setDuration((long) (r11.getDuration() * 1.1f));
        this.d.start();
    }

    public final float c(boolean z4) {
        return (e(z4) - Math.min(3.0f, e(z4))) - (Utilities.clamp(4.0f - e(z4), 0.5f, 0.0f) * (Math.min(3.0f, e(z4)) / 3.0f));
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.h.computeScrollOffset()) {
            setScrollOffset(r0.getCurrY() / getScrollStep());
            postInvalidateOnAnimation();
        }
    }

    public final float d(boolean z4) {
        return Utilities.clamp(e(z4), 1.0f, 0.0f) * ((-getScrollWindow()) / 3.0f);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        ArrayList arrayList;
        float f10;
        int i10;
        int i11;
        float f11;
        float f12;
        float f13;
        ArrayList arrayList2;
        RectF rectF2;
        int i12;
        float f14;
        float f15;
        w3 w3Var = this;
        super.dispatchDraw(canvas);
        t3 t3Var = w3Var.b;
        int[] iArr = w3Var.U;
        int[] iArr2 = w3Var.V;
        RectF rectF3 = w3Var.W;
        if (t3Var != null) {
            w3Var.getLocationOnScreen(iArr2);
            w3Var.a.getLocationOnScreen(iArr);
            w3Var.a.d(rectF3, 0.0f);
            rectF3.offset(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
            canvas.save();
            canvas.clipRect(0, 0, w3Var.getMeasuredWidth(), w3Var.getMeasuredHeight() - w3Var.s);
            u3 windowView = w3Var.b.getWindowView();
            float f16 = w3Var.e;
            RectF rectF4 = w3Var.b0;
            float z4 = windowView.z(canvas, rectF3, f16, rectF4, f16);
            if (w3Var.c != null) {
                Path path = w3Var.c0;
                path.rewind();
                path.addRoundRect(rectF4, z4, z4, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float c3 = yh.c(1.0f, w3Var.e, AndroidUtilities.dp(50.0f), rectF4.top);
                rectF3.set(rectF4.left, c3, rectF4.right, AndroidUtilities.dp(50.0f) + c3);
                w3Var.a.setupTab(w3Var.c);
                w3Var.c.a(canvas, rectF3, z4, w3Var.e, 1.0f);
                rectF = rectF3;
                canvas.restore();
            } else {
                rectF = rectF3;
            }
            canvas.restore();
        } else {
            rectF = rectF3;
        }
        if (w3Var.S <= 0.0f) {
            return;
        }
        canvas.save();
        View view = w3Var.P;
        RectF rectF5 = w3Var.N;
        if (view != null) {
            view.getLocationOnScreen(iArr);
            w3Var.getLocationOnScreen(iArr2);
            rectF5.set(iArr[0] - iArr2[0], iArr[1] - iArr2[1], w3Var.P.getWidth() + r1, w3Var.P.getHeight() + (iArr[1] - iArr2[1]));
        } else {
            iArr[1] = 0;
            iArr[0] = 0;
            rectF5.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        canvas.clipRect(rectF5);
        canvas.translate(rectF5.left, rectF5.top);
        float width = rectF5.width();
        float height = rectF5.height();
        if (w3Var.J != null) {
            w3Var.M.reset();
            float width2 = rectF5.width() / w3Var.J.getWidth();
            w3Var.M.postScale(width2, width2);
            w3Var.K.setLocalMatrix(w3Var.M);
            w3Var.L.setAlpha((int) (w3Var.S * 255.0f));
            canvas.drawRect(0.0f, 0.0f, width, height, w3Var.L);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, width, height, 255, 31);
        float f17 = width;
        float f18 = height;
        float dp = AndroidUtilities.dp(55.0f) + AndroidUtilities.dp(40.0f) + AndroidUtilities.statusBarHeight;
        float dp2 = AndroidUtilities.dp(68.0f);
        int min = (int) Math.min(AndroidUtilities.dp(340.0f), 0.95f * f17);
        int height2 = (int) (AndroidUtilities.isTablet() ? rectF5.height() * 0.5f : 0.75f * f18);
        float f19 = f17 / 2.0f;
        int i13 = 0;
        float f20 = 0.0f;
        while (true) {
            arrayList = w3Var.O;
            if (i13 >= arrayList.size()) {
                break;
            }
            f20 += ((v3) arrayList.get(i13)).d.c >= 0 ? 1.0f : 0.0f;
            i13++;
        }
        float d = w3Var.f.d(f20, false);
        float lerp = AndroidUtilities.lerp(0.0f, 1.0f - Utilities.clamp(w3Var.getScrollWindow() <= 0.0f ? 0.0f : ((w3Var.getScrollMin() - w3Var.getScrollOffset()) / (w3Var.getScrollWindow() * 0.15f)) * 0.2f, 1.0f, 0.0f), w3Var.S);
        int i14 = 0;
        while (i14 < arrayList.size() + 1) {
            if (i14 == arrayList.size()) {
                f15 = dp;
                f10 = dp2;
                i11 = min;
                f11 = lerp;
                i10 = i14;
                f12 = f17;
                f13 = d;
                arrayList2 = arrayList;
                rectF2 = rectF;
                i12 = height2;
                f14 = f18;
            } else {
                v3 v3Var = (v3) arrayList.get(i14);
                if (i14 < arrayList.size()) {
                    k3 k3Var = v3Var.d;
                }
                k3 k3Var2 = v3Var.d;
                float[] fArr = v3Var.g;
                float f21 = dp;
                Matrix matrix = v3Var.f;
                float[] fArr2 = v3Var.h;
                float f22 = k3Var2 == null ? 1.0f : lerp;
                float c10 = (d - 1.0f) - k3Var2.c();
                f10 = dp2;
                i10 = i14;
                float max = (c10 - Math.max(w3Var.getScrollMin(), w3Var.getScrollOffset())) / w3Var.getScrollWindow();
                Math.max(max, 0.0f);
                Math.max(Math.min(max, 1.0f), -4.0f);
                float min2 = (Math.min(5.0f, c10) * AndroidUtilities.dp(6.0f)) + f21;
                float f23 = height2;
                float f24 = ((((f18 - f10) - (0.26f * f23)) - min2) * max) + min2;
                float f25 = min / 2.0f;
                i11 = min;
                RectF rectF6 = w3Var.a0;
                rectF6.set(f19 - f25, f24, f19 + f25, f23 + f24);
                boolean z10 = (rectF6.top > f18 || rectF6.bottom < 0.0f || lerp < 0.1f) && c10 < d - 3.0f;
                w3Var.a.d(rectF, Utilities.clamp(k3Var2.c(), 1.0f, 0.0f));
                rectF.offset(w3Var.a.getX(), w3Var.a.getY());
                AndroidUtilities.lerpCentered(rectF, rectF6, lerp, rectF6);
                n3 n3Var = w3Var.a;
                if (n3Var != null) {
                    n3Var.setupTab(k3Var2);
                }
                if (rectF6.top > f18 || rectF6.bottom < 0.0f) {
                    f11 = lerp;
                    f12 = f17;
                    f13 = d;
                    arrayList2 = arrayList;
                    rectF2 = rectF;
                    i12 = height2;
                    f14 = f18;
                    f15 = f21;
                } else {
                    canvas.save();
                    v3Var.a.set(rectF6);
                    matrix.reset();
                    fArr[0] = rectF6.left;
                    float f26 = rectF6.top;
                    fArr[1] = f26;
                    float f27 = rectF6.right;
                    fArr[2] = f27;
                    fArr[3] = f26;
                    fArr[4] = f27;
                    fArr[5] = (rectF6.height() * 1.0f) + f26;
                    fArr[6] = rectF6.left;
                    fArr[7] = (rectF6.height() * 1.0f) + rectF6.top;
                    fArr2[0] = rectF6.left;
                    fArr2[1] = rectF6.top - AndroidUtilities.dp(0.0f);
                    fArr2[2] = rectF6.right;
                    fArr2[3] = rectF6.top - AndroidUtilities.dp(0.0f);
                    float f28 = f22 * 1.0f;
                    fArr2[4] = (AndroidUtilities.lerp(1.0f, 0.83f, f28) * (rectF6.width() / 2.0f)) + rectF6.centerX();
                    fArr2[5] = (AndroidUtilities.lerp(1.0f, 0.6f, f28) * ((rectF6.height() * 1.0f) + AndroidUtilities.dp(0.0f))) + (rectF6.top - AndroidUtilities.dp(0.0f));
                    fArr2[6] = rectF6.centerX() - (AndroidUtilities.lerp(1.0f, 0.83f, f28) * (rectF6.width() / 2.0f));
                    fArr2[7] = (AndroidUtilities.lerp(1.0f, 0.6f, f28) * ((rectF6.height() * 1.0f) + AndroidUtilities.dp(0.0f))) + (rectF6.top - AndroidUtilities.dp(0.0f));
                    matrix.setPolyToPoly(v3Var.g, 0, v3Var.h, 0, 4);
                    canvas.concat(matrix);
                    float lerp2 = AndroidUtilities.lerp(k3Var2.b(), 1.0f, w3Var.S);
                    float lerp3 = AndroidUtilities.lerp(Utilities.clamp01((c10 - d) + 2.0f), 1.0f, Utilities.clamp01((f22 - 0.1f) / 0.8f));
                    RadialGradient radialGradient = v3Var.p;
                    Paint paint = v3Var.o;
                    Paint paint2 = v3Var.r;
                    f11 = lerp;
                    Matrix matrix2 = v3Var.q;
                    m3 m3Var = v3Var.c;
                    f13 = d;
                    Path path2 = v3Var.n;
                    arrayList2 = arrayList;
                    Paint paint3 = v3Var.e;
                    rectF2 = rectF;
                    RectF rectF7 = v3Var.m;
                    i12 = height2;
                    Paint paint4 = v3Var.l;
                    f14 = f18;
                    f12 = f17;
                    float clamp = Utilities.clamp(1.0f - ((Math.abs(v3Var.i) - 0.3f) / 0.7f), 1.0f, 0.0f) * lerp2;
                    if (clamp > 0.0f) {
                        float f29 = f28 * 1.0f;
                        float lerp4 = AndroidUtilities.lerp(1.0f, 1.3f, f29);
                        float currentActionBarHeight = ((k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(50.0f)) * 0.0f;
                        canvas.save();
                        canvas.rotate(v3Var.i * 20.0f, (v3Var.i * AndroidUtilities.dp(50.0f)) + rectF6.centerX(), rectF6.bottom + AndroidUtilities.dp(350.0f));
                        float a2 = v3Var.k.a(0.01f);
                        canvas.scale(a2, a2, rectF6.centerX(), rectF6.centerY());
                        float lerp5 = AndroidUtilities.lerp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), f28);
                        if (z10) {
                            paint4.setColor(0);
                            paint4.setShadowLayer(AndroidUtilities.dp(30.0f), 0.0f, AndroidUtilities.dp(10.0f), j6.l1(clamp * f28 * 1.0f, TLObject.FLAG_29));
                            canvas.drawRoundRect(rectF6, lerp5, lerp5, paint4);
                            paint3.setAlpha((int) (clamp * 255.0f));
                            canvas.drawRoundRect(rectF6, lerp5, lerp5, paint3);
                            canvas.restore();
                        } else {
                            path2.rewind();
                            path2.addRoundRect(rectF6, lerp5, lerp5, Path.Direction.CW);
                            canvas.save();
                            paint4.setColor(0);
                            paint4.setShadowLayer(AndroidUtilities.dp(30.0f), 0.0f, AndroidUtilities.dp(10.0f), j6.l1(clamp * f28 * 1.0f, TLObject.FLAG_29));
                            canvas.drawPath(path2, paint4);
                            canvas.clipPath(path2);
                            float f30 = clamp * 255.0f * f28;
                            int i15 = (int) f30;
                            paint3.setAlpha(i15);
                            canvas.drawRoundRect(rectF6, lerp5, lerp5, paint3);
                            canvas.save();
                            canvas.translate(rectF6.left, e2.c.A(AndroidUtilities.dp(50.0f), lerp4, rectF6.top, currentActionBarHeight));
                            canvas.scale(1.0f, AndroidUtilities.lerp(1.0f, 1.25f, f29));
                            if (m3Var != null && m3Var.k != null) {
                                float width3 = rectF6.width() / m3Var.k.getWidth();
                                canvas.scale(width3, width3);
                                paint.setAlpha(i15);
                                canvas.drawBitmap(m3Var.k, 0.0f, 0.0f, paint);
                            }
                            canvas.restore();
                            canvas.save();
                            paint2.setAlpha((int) (f30 * 1.0f));
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
                            v3Var.d.v = f28;
                            canvas.scale(1.0f, lerp4, rectF7.centerX(), rectF7.top);
                            f15 = f21;
                            v3Var.d.a(canvas, rectF7, lerp5, clamp * clamp, lerp3);
                            canvas.restore();
                            canvas.restore();
                            canvas.restore();
                        }
                    }
                    f15 = f21;
                    canvas.restore();
                }
            }
            i14 = i10 + 1;
            dp = f15;
            lerp = f11;
            d = f13;
            arrayList = arrayList2;
            rectF = rectF2;
            height2 = i12;
            dp2 = f10;
            f18 = f14;
            min = i11;
            f17 = f12;
            w3Var = this;
        }
        float f31 = dp;
        float f32 = f17;
        canvas.save();
        if (this.g0 == null) {
            this.g0 = new g20();
        }
        RectF rectF8 = AndroidUtilities.rectTmp;
        rectF8.set(0.0f, 0.0f, f32, f31);
        this.g0.b(canvas, rectF8, 1, this.S);
        canvas.restore();
        canvas.restore();
        if (this.d0 == null) {
            this.d0 = new k01(LocaleController.getString(R.string.BotCloseAllTabs), 14.0f, AndroidUtilities.bold());
        }
        if (this.f0 == null || this.e0 != j6.I.q()) {
            boolean q10 = j6.I.q();
            this.e0 = q10;
            if (q10) {
                this.f0 = j6.i0(64, 64, 64, 64, 553648127, 872415231, 872415231);
            } else {
                this.f0 = j6.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688);
            }
            this.f0.setCallback(this);
        }
        float dp3 = this.d0.c + AndroidUtilities.dp(24.0f);
        float f33 = (f32 - dp3) / 2.0f;
        this.f0.setBounds((int) f33, (int) ((f31 - (AndroidUtilities.dp(95.0f) / 2.0f)) - AndroidUtilities.dp(14.0f)), (int) ((f32 + dp3) / 2.0f), (int) ((f31 - (AndroidUtilities.dp(95.0f) / 2.0f)) + AndroidUtilities.dp(14.0f)));
        this.f0.setAlpha((int) (this.S * 255.0f));
        this.f0.draw(canvas);
        this.d0.c(f33 + AndroidUtilities.dp(12.0f), f31 - (AndroidUtilities.dp(95.0f) / 2.0f), this.S, -1, canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        s3 s3Var;
        if (this.S <= 0.0f || (s3Var = this.v) == null || !s3Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x047a  */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.VelocityTracker, org.telegram.ui.ActionBar.v3] */
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
        boolean z4;
        ?? r82;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        v3 v3Var;
        if ((AndroidUtilities.isTablet() && motionEvent.getAction() == 0 && !this.N.contains(motionEvent.getX(), motionEvent.getY())) || this.S <= 0.0f) {
            return false;
        }
        if (this.F == null) {
            this.F = VelocityTracker.obtain();
        }
        this.F.addMovement(motionEvent);
        int action = motionEvent.getAction();
        OverScroller overScroller = this.h;
        if (action == 0) {
            this.C = System.currentTimeMillis();
            this.B = motionEvent.getX();
            this.y = motionEvent.getY();
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (this.S >= 1.0f) {
                ArrayList arrayList = this.O;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    v3Var = (v3) arrayList.get(size);
                    if (Math.abs(v3Var.i) < 0.4f && v3Var.a.contains(x10, y10)) {
                        break;
                    }
                }
            }
            v3Var = null;
            this.w = v3Var;
            org.telegram.ui.Cells.z zVar = this.f0;
            boolean z10 = zVar != null && zVar.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
            this.H = z10;
            if (z10) {
                this.w = null;
            }
            org.telegram.ui.Cells.z zVar2 = this.f0;
            if (zVar2 != null) {
                zVar2.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.f0.setState(this.H ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : new int[0]);
            }
            this.D = false;
            this.E = false;
            this.x = false;
            v3 v3Var2 = this.w;
            if (v3Var2 != null) {
                ValueAnimator valueAnimator = v3Var2.j;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                boolean contains = this.w.d.k.getBounds().contains((int) (motionEvent.getX() - this.w.a.left), (int) ((motionEvent.getY() - this.w.a.top) - AndroidUtilities.dp(24.0f)));
                this.x = contains;
                if (contains) {
                    org.telegram.ui.Cells.z zVar3 = this.w.d.k;
                    float x11 = motionEvent.getX();
                    RectF rectF = this.W;
                    zVar3.setHotspot((int) (x11 - rectF.left), (int) (motionEvent.getY() - rectF.centerY()));
                }
                this.w.k.c(!this.x);
                this.w.d.k.setState(this.x ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : new int[0]);
            }
            this.G = motionEvent.getY();
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
            }
            ValueAnimator valueAnimator2 = this.Q;
            if (valueAnimator2 == null) {
                return true;
            }
            valueAnimator2.cancel();
            this.Q = null;
            return true;
        }
        if (motionEvent.getAction() == 2) {
            v3 v3Var3 = this.w;
            if (v3Var3 != null) {
                if (v3Var3.k.h) {
                    if (!this.E && !this.D && n6.a(this.B, motionEvent.getY(), motionEvent.getX(), motionEvent.getY()) > AndroidUtilities.touchSlop) {
                        this.E = true;
                    }
                    if (!this.D && !this.E && n6.a(motionEvent.getX(), this.y, motionEvent.getX(), motionEvent.getY()) > AndroidUtilities.touchSlop) {
                        if (!overScroller.isFinished()) {
                            overScroller.abortAnimation();
                        }
                        ValueAnimator valueAnimator3 = this.Q;
                        if (valueAnimator3 != null) {
                            valueAnimator3.cancel();
                            this.Q = null;
                        }
                        this.D = true;
                    }
                    if (this.a != null && (this.D || this.E)) {
                        this.w.k.c(false);
                        ValueAnimator valueAnimator4 = this.w.j;
                        if (valueAnimator4 != null) {
                            valueAnimator4.cancel();
                        }
                    }
                } else {
                    if (!this.x && !this.E && !this.D && n6.a(this.B, motionEvent.getY(), motionEvent.getX(), motionEvent.getY()) > AndroidUtilities.touchSlop) {
                        this.E = true;
                    }
                    if (!this.x && !this.D && !this.E && n6.a(motionEvent.getX(), this.y, motionEvent.getX(), motionEvent.getY()) > AndroidUtilities.touchSlop) {
                        if (!overScroller.isFinished()) {
                            overScroller.abortAnimation();
                        }
                        ValueAnimator valueAnimator5 = this.Q;
                        if (valueAnimator5 != null) {
                            valueAnimator5.cancel();
                            this.Q = null;
                        }
                        this.D = true;
                    }
                    if (this.x) {
                        boolean contains2 = this.w.d.k.getBounds().contains((int) (motionEvent.getX() - this.w.a.left), (int) ((motionEvent.getY() - this.w.a.top) - AndroidUtilities.dp(24.0f)));
                        this.x = contains2;
                        if (!contains2) {
                            this.w.d.k.setState(new int[0]);
                        }
                    }
                }
                v3 v3Var4 = this.w;
                if (!v3Var4.k.h) {
                    if (this.E) {
                        v3Var4.i = (motionEvent.getX() - this.B) / AndroidUtilities.dp(300.0f);
                    } else if (this.D) {
                        float y11 = motionEvent.getY() - this.G;
                        if (this.I < getScrollMin()) {
                            y11 *= 1.0f - (Utilities.clamp((getScrollMin() - this.I) / getScrollStep(), 1.0f, 0.0f) * 0.5f);
                        }
                        setScrollOffset(Utilities.clamp(((getScrollOffset() * getScrollStep()) - y11) / getScrollStep(), getScrollMax(), getScrollMin() - (getScrollStep() * 1.4f)));
                        invalidate();
                    }
                }
                invalidate();
            }
            org.telegram.ui.Cells.z zVar4 = this.f0;
            if (zVar4 != null && this.H) {
                boolean z11 = this.w == null && zVar4.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
                this.H = z11;
                if (!z11) {
                    this.f0.setState(new int[0]);
                }
            }
            this.G = motionEvent.getY();
            return true;
        }
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() != 3) {
                return true;
            }
            v3 v3Var5 = this.w;
            if (v3Var5 != null) {
                v3Var5.a(0.0f);
                this.w.k.c(false);
                this.w.d.k.setState(new int[0]);
            }
            this.w = null;
            this.x = false;
            VelocityTracker velocityTracker3 = this.F;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.F = null;
            }
            this.H = false;
            org.telegram.ui.Cells.z zVar5 = this.f0;
            if (zVar5 == null) {
                return true;
            }
            zVar5.setState(new int[0]);
            return true;
        }
        v3 v3Var6 = this.w;
        if (v3Var6 != null) {
            if (this.a == null || Math.abs(v3Var6.i) <= 0.4f) {
                this.w.a(0.0f);
                if (this.a != null && this.w.k.h) {
                    a(false);
                    v3 v3Var7 = this.w;
                    v3Var7.getClass();
                    this.a.e(v3Var7.c);
                } else if (this.D) {
                    if (this.I < getScrollMin() - (getScrollWindow() * 0.15f)) {
                        a(false);
                    } else if (this.I < getScrollMin()) {
                        h(getScrollMin());
                    } else {
                        this.F.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.n);
                        float yVelocity = this.F.getYVelocity();
                        if (Math.abs(yVelocity) > this.r) {
                            velocityTracker = null;
                            z4 = true;
                            overScroller.fling(0, (int) (getScrollOffset() * getScrollStep()), 0, (int) (-yVelocity), 0, 0, (int) (getScrollMin() * getScrollStep()), (int) (getScrollMax() * getScrollStep()), 0, (int) (getScrollStep() * 0.1f));
                        } else {
                            velocityTracker = null;
                            z4 = true;
                            overScroller.startScroll(0, (int) (getScrollOffset() * getScrollStep()), 0, 0, 0);
                        }
                        this.F.recycle();
                        this.F = velocityTracker;
                        postInvalidateOnAnimation();
                        velocityTracker2 = velocityTracker;
                        this.w.k.c(false);
                        if (this.x) {
                            this.x = this.w.d.k.getBounds().contains((int) (motionEvent.getX() - this.w.a.left), (int) ((motionEvent.getY() - this.w.a.top) - AndroidUtilities.dp(24.0f)));
                        }
                        if (this.x) {
                            final v3 v3Var8 = this.w;
                            final int i10 = 1;
                            this.a.g(v3Var8.c, new Utilities.Callback(this) { // from class: org.telegram.ui.ActionBar.p3
                                public final /* synthetic */ w3 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    Boolean bool = (Boolean) obj;
                                    switch (i10) {
                                        case 0:
                                            w3 w3Var = this.b;
                                            w3Var.getClass();
                                            boolean booleanValue = bool.booleanValue();
                                            v3 v3Var9 = v3Var8;
                                            if (!booleanValue) {
                                                v3Var9.a(0.0f);
                                                break;
                                            } else {
                                                v3Var9.a(v3Var9.i < 0.0f ? -1.0f : 1.0f);
                                                w3Var.h(Utilities.clamp(w3Var.I, w3Var.c(false), w3Var.d(false)));
                                                if (w3Var.a.getTabs().isEmpty()) {
                                                    w3Var.a(false);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            w3 w3Var2 = this.b;
                                            w3Var2.getClass();
                                            boolean booleanValue2 = bool.booleanValue();
                                            v3 v3Var10 = v3Var8;
                                            if (!booleanValue2) {
                                                v3Var10.a(0.0f);
                                                break;
                                            } else {
                                                v3Var10.a(1.0f);
                                                w3Var2.h(Utilities.clamp(w3Var2.I, w3Var2.c(false), w3Var2.d(false)));
                                                if (w3Var2.a.getTabs().isEmpty()) {
                                                    w3Var2.a(false);
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
                    z4 = true;
                    this.F.recycle();
                    this.F = velocityTracker;
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
                final v3 v3Var9 = this.w;
                final int i11 = 0;
                this.a.g(v3Var9.c, new Utilities.Callback(this) { // from class: org.telegram.ui.ActionBar.p3
                    public final /* synthetic */ w3 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (i11) {
                            case 0:
                                w3 w3Var = this.b;
                                w3Var.getClass();
                                boolean booleanValue = bool.booleanValue();
                                v3 v3Var92 = v3Var9;
                                if (!booleanValue) {
                                    v3Var92.a(0.0f);
                                    break;
                                } else {
                                    v3Var92.a(v3Var92.i < 0.0f ? -1.0f : 1.0f);
                                    w3Var.h(Utilities.clamp(w3Var.I, w3Var.c(false), w3Var.d(false)));
                                    if (w3Var.a.getTabs().isEmpty()) {
                                        w3Var.a(false);
                                        break;
                                    }
                                }
                                break;
                            default:
                                w3 w3Var2 = this.b;
                                w3Var2.getClass();
                                boolean booleanValue2 = bool.booleanValue();
                                v3 v3Var10 = v3Var9;
                                if (!booleanValue2) {
                                    v3Var10.a(0.0f);
                                    break;
                                } else {
                                    v3Var10.a(1.0f);
                                    w3Var2.h(Utilities.clamp(w3Var2.I, w3Var2.c(false), w3Var2.d(false)));
                                    if (w3Var2.a.getTabs().isEmpty()) {
                                        w3Var2.a(false);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
            }
            velocityTracker2 = null;
            z4 = true;
            this.w.k.c(false);
            if (this.x) {
            }
            if (this.x) {
            }
            this.w.d.k.setState(new int[0]);
            r82 = velocityTracker2;
        } else {
            Object obj = null;
            z4 = true;
            if (this.H) {
                this.a.f();
                a(false);
                r82 = obj;
            } else {
                r82 = obj;
                if (n6.a(this.B, this.y, motionEvent.getX(), motionEvent.getY()) <= AndroidUtilities.touchSlop) {
                    r82 = obj;
                    if (!this.D) {
                        r82 = obj;
                        if (!this.E) {
                            r82 = obj;
                            if (System.currentTimeMillis() - this.C <= ViewConfiguration.getTapTimeout() * 1.2f) {
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
        VelocityTracker velocityTracker4 = this.F;
        if (velocityTracker4 != null) {
            velocityTracker4.recycle();
            this.F = r82;
        }
        this.H = false;
        org.telegram.ui.Cells.z zVar6 = this.f0;
        if (zVar6 == null) {
            return z4;
        }
        zVar6.setState(new int[0]);
        return z4;
    }

    public final float e(boolean z4) {
        int i10 = 0;
        float f10 = 0.0f;
        while (true) {
            ArrayList arrayList = this.O;
            if (i10 >= arrayList.size()) {
                break;
            }
            f10 += ((v3) arrayList.get(i10)).d.c >= 0 ? 1.0f : 0.0f;
            i10++;
        }
        return z4 ? this.f.d(f10, false) : f10;
    }

    public final void f() {
        k3 k3Var;
        n3 n3Var = this.a;
        if (n3Var == null || !(n3Var.getParent() instanceof View)) {
            return;
        }
        HashSet hashSet = rh.q2.T0;
        if (!hashSet.isEmpty()) {
            Iterator it = new HashSet(hashSet).iterator();
            while (it.hasNext()) {
                ((rh.q2) it.next()).k(true);
            }
            AndroidUtilities.runOnUIThread(new p(this, 11), 100L);
            return;
        }
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.d = null;
        }
        View view = (View) this.a.getParent();
        this.P = view;
        int[] iArr = this.U;
        if (view != null) {
            view.getLocationOnScreen(iArr);
        } else {
            iArr[1] = 0;
            iArr[0] = 0;
        }
        int[] iArr2 = this.V;
        getLocationOnScreen(iArr2);
        this.N.set(iArr[0] - iArr2[0], iArr[1] - iArr2[1], this.P.getWidth() + r5, this.P.getHeight() + (iArr[1] - iArr2[1]));
        View view2 = this.P;
        AndroidUtilities.makingGlobalBlurBitmap = true;
        this.J = AndroidUtilities.makeBlurBitmap(view2, 14.0f, 14);
        AndroidUtilities.makingGlobalBlurBitmap = false;
        Paint paint = new Paint(1);
        this.L = paint;
        Bitmap bitmap = this.J;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.K = bitmapShader;
        paint.setShader(bitmapShader);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, j6.I.q() ? 0.08f : 0.25f);
        this.L.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.M = new Matrix();
        ArrayList arrayList = this.O;
        arrayList.clear();
        ArrayList<m3> tabs = this.a.getTabs();
        ArrayList<k3> tabDrawables = this.a.getTabDrawables();
        for (int size = tabs.size() - 1; size >= 0; size--) {
            m3 m3Var = tabs.get(size);
            int i10 = 0;
            while (true) {
                if (i10 >= tabDrawables.size()) {
                    k3Var = null;
                    break;
                }
                k3Var = tabDrawables.get(i10);
                if (k3Var.a == m3Var) {
                    break;
                } else {
                    i10++;
                }
            }
            if (k3Var != null) {
                arrayList.add(new v3(this, m3Var, k3Var));
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
        return this.I;
    }

    public float getScrollRange() {
        return e(true);
    }

    public float getScrollWindow() {
        return Math.min(3.0f, getScrollRange());
    }

    public final void h(float f10) {
        ValueAnimator valueAnimator = this.Q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Q = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f10);
        this.Q = ofFloat;
        ofFloat.addUpdateListener(new o3(this, 2));
        this.Q.setDuration(250L);
        this.Q.setInterpolator(nr.h);
        this.Q.start();
    }

    public void setScrollOffset(float f10) {
        this.I = f10;
    }

    public void setTabsView(n3 n3Var) {
        this.a = n3Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f0 || super.verifyDrawable(drawable);
    }

    public void setSlowerDismiss(boolean z4) {
    }
}
