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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.s10;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v3 extends View {
    public float A;
    public long B;
    public boolean C;
    public boolean D;
    public VelocityTracker E;
    public float F;
    public boolean G;
    public float H;
    public Bitmap I;
    public BitmapShader J;
    public Paint K;
    public Matrix L;
    public final RectF M;
    public final ArrayList N;
    public View O;
    public ValueAnimator P;
    public boolean Q;
    public float R;
    public ValueAnimator S;
    public final int[] T;
    public final int[] U;
    public final RectF V;
    public final RectF W;
    public m3 a;
    public final RectF a0;
    public s3 b;
    public final Path b0;
    public j3 c;
    public nz0 c0;
    public ValueAnimator d;
    public boolean d0;
    public float e;
    public org.telegram.ui.Cells.z e0;
    public final org.telegram.ui.Components.y5 f;
    public s10 f0;
    public final OverScroller h;
    public final int n;
    public final int r;
    public int s;
    public final r3 v;
    public u3 w;
    public boolean x;
    public float y;

    public v3(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f = new org.telegram.ui.Components.y5(this, 0L, 350L, gr.h);
        this.M = new RectF();
        this.N = new ArrayList();
        this.T = new int[2];
        this.U = new int[2];
        this.V = new RectF();
        this.W = new RectF();
        this.a0 = new RectF();
        this.b0 = new Path();
        setWillNotDraw(false);
        this.h = new OverScroller(launchActivity);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(launchActivity);
        this.n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.r = viewConfiguration.getScaledMinimumFlingVelocity();
        r3 r3Var = new r3(this, this);
        this.v = r3Var;
        r0.j0.k(this, r3Var);
        setImportantForAccessibility(2);
        r0.b0.j(this, new n(this, 6));
    }

    public static void g(ViewGroup viewGroup, float f10, final fh.f1 f1Var) {
        if (viewGroup.getWidth() <= 0 || viewGroup.getHeight() <= 0) {
            f1Var.run(null);
            return;
        }
        final SurfaceTexture b10 = org.telegram.messenger.t3.b();
        b10.setDefaultBufferSize(viewGroup.getWidth(), viewGroup.getHeight());
        final Surface surface = new Surface(b10);
        final Bitmap createBitmap = Bitmap.createBitmap(viewGroup.getWidth(), viewGroup.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
        lockHardwareCanvas.translate(0.0f, f10);
        viewGroup.draw(lockHardwareCanvas);
        surface.unlockCanvasAndPost(lockHardwareCanvas);
        PixelCopy.request(surface, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: org.telegram.ui.ActionBar.p3
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i9) {
                fh.f1 f1Var2 = fh.f1.this;
                Bitmap bitmap = createBitmap;
                Surface surface2 = surface;
                SurfaceTexture surfaceTexture = b10;
                if (i9 == 0) {
                    f1Var2.run(bitmap);
                } else {
                    bitmap.recycle();
                    f1Var2.run(null);
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
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                View childAt = viewGroup.getChildAt(i9);
                if (childAt != this) {
                    childAt.setImportantForAccessibility(z10 ? 4 : 0);
                }
            }
        }
        r3 r3Var = this.v;
        if (r3Var != null) {
            r3Var.i();
        }
        if (z10) {
            sendAccessibilityEvent(32);
        }
    }

    public final void a(boolean z10) {
        if (this.Q == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.Q = z10;
        m3 m3Var = this.a;
        if (m3Var != null) {
            m3Var.b = false;
            m3Var.invalidate();
        }
        setModalAccessibility(z10);
        invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.R, z10 ? 1.0f : 0.0f);
        this.S = ofFloat;
        ofFloat.addUpdateListener(new n3(this, 0));
        this.S.addListener(new h(this, 4));
        this.S.setInterpolator(gr.h);
        this.S.setDuration(320L);
        this.S.start();
    }

    public final void b(s3 s3Var) {
        ValueAnimator valueAnimator;
        if (this.a == null) {
            return;
        }
        if (this.b != null && (valueAnimator = this.d) != null) {
            valueAnimator.end();
            this.d = null;
        }
        this.b = s3Var;
        s3Var.setLastVisible(false);
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        l3 a2 = s3Var.a();
        m3 m3Var = this.a;
        ArrayList<l3> tabs = m3Var.getTabs();
        ArrayList<j3> tabDrawables = m3Var.getTabDrawables();
        j3 j3Var = new j3(m3Var, a2);
        j3Var.d.d(-1.0f, true);
        j3Var.e.d(0.0f, true);
        tabDrawables.add(j3Var);
        tabs.add(0, a2);
        for (int i9 = 0; i9 < tabDrawables.size(); i9++) {
            j3 j3Var2 = tabDrawables.get(i9);
            int indexOf = tabs.indexOf(j3Var2.a);
            j3Var2.c = indexOf;
            if (indexOf >= 0) {
                j3Var2.b = indexOf;
            }
        }
        m3Var.n();
        m3Var.o(true);
        m3Var.invalidate();
        k3 k3Var = m3Var.e;
        if (k3Var != null) {
            k3Var.i();
        }
        this.c = j3Var;
        post(new p(s3Var, 10));
        invalidate();
        this.e = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.addUpdateListener(new n3(this, 1));
        this.d.addListener(new q3(this, a2, s3Var));
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
        float f10;
        int i9;
        int i10;
        float f11;
        float f12;
        float f13;
        ArrayList arrayList2;
        RectF rectF2;
        int i11;
        float f14;
        float f15;
        v3 v3Var = this;
        super.dispatchDraw(canvas);
        s3 s3Var = v3Var.b;
        int[] iArr = v3Var.T;
        int[] iArr2 = v3Var.U;
        RectF rectF3 = v3Var.V;
        if (s3Var != null) {
            v3Var.getLocationOnScreen(iArr2);
            v3Var.a.getLocationOnScreen(iArr);
            v3Var.a.d(rectF3, 0.0f);
            rectF3.offset(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
            canvas.save();
            canvas.clipRect(0, 0, v3Var.getMeasuredWidth(), v3Var.getMeasuredHeight() - v3Var.s);
            t3 windowView = v3Var.b.getWindowView();
            float f16 = v3Var.e;
            RectF rectF4 = v3Var.a0;
            float z10 = windowView.z(canvas, rectF3, f16, rectF4, f16);
            if (v3Var.c != null) {
                Path path = v3Var.b0;
                path.rewind();
                path.addRoundRect(rectF4, z10, z10, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float C = j3.r0.C(1.0f, v3Var.e, AndroidUtilities.dp(50.0f), rectF4.top);
                rectF3.set(rectF4.left, C, rectF4.right, AndroidUtilities.dp(50.0f) + C);
                v3Var.a.setupTab(v3Var.c);
                v3Var.c.a(canvas, rectF3, z10, v3Var.e, 1.0f);
                rectF = rectF3;
                canvas.restore();
            } else {
                rectF = rectF3;
            }
            canvas.restore();
        } else {
            rectF = rectF3;
        }
        if (v3Var.R <= 0.0f) {
            return;
        }
        canvas.save();
        View view = v3Var.O;
        RectF rectF5 = v3Var.M;
        if (view != null) {
            view.getLocationOnScreen(iArr);
            v3Var.getLocationOnScreen(iArr2);
            rectF5.set(iArr[0] - iArr2[0], iArr[1] - iArr2[1], v3Var.O.getWidth() + r1, v3Var.O.getHeight() + (iArr[1] - iArr2[1]));
        } else {
            iArr[1] = 0;
            iArr[0] = 0;
            rectF5.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        canvas.clipRect(rectF5);
        canvas.translate(rectF5.left, rectF5.top);
        float width = rectF5.width();
        float height = rectF5.height();
        if (v3Var.I != null) {
            v3Var.L.reset();
            float width2 = rectF5.width() / v3Var.I.getWidth();
            v3Var.L.postScale(width2, width2);
            v3Var.J.setLocalMatrix(v3Var.L);
            v3Var.K.setAlpha((int) (v3Var.R * 255.0f));
            canvas.drawRect(0.0f, 0.0f, width, height, v3Var.K);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, width, height, 255, 31);
        float f17 = width;
        float f18 = height;
        float dp = AndroidUtilities.dp(55.0f) + AndroidUtilities.dp(40.0f) + AndroidUtilities.statusBarHeight;
        float dp2 = AndroidUtilities.dp(68.0f);
        int min = (int) Math.min(AndroidUtilities.dp(340.0f), 0.95f * f17);
        int height2 = (int) (AndroidUtilities.isTablet() ? rectF5.height() * 0.5f : 0.75f * f18);
        float f19 = f17 / 2.0f;
        int i12 = 0;
        float f20 = 0.0f;
        while (true) {
            arrayList = v3Var.N;
            if (i12 >= arrayList.size()) {
                break;
            }
            f20 += ((u3) arrayList.get(i12)).d.c >= 0 ? 1.0f : 0.0f;
            i12++;
        }
        float d = v3Var.f.d(f20, false);
        float lerp = AndroidUtilities.lerp(0.0f, 1.0f - Utilities.clamp(v3Var.getScrollWindow() <= 0.0f ? 0.0f : ((v3Var.getScrollMin() - v3Var.getScrollOffset()) / (v3Var.getScrollWindow() * 0.15f)) * 0.2f, 1.0f, 0.0f), v3Var.R);
        int i13 = 0;
        while (i13 < arrayList.size() + 1) {
            if (i13 == arrayList.size()) {
                f15 = dp;
                f10 = dp2;
                i10 = min;
                f11 = lerp;
                i9 = i13;
                f12 = f17;
                f13 = d;
                arrayList2 = arrayList;
                rectF2 = rectF;
                i11 = height2;
                f14 = f18;
            } else {
                u3 u3Var = (u3) arrayList.get(i13);
                if (i13 < arrayList.size()) {
                    j3 j3Var = u3Var.d;
                }
                j3 j3Var2 = u3Var.d;
                float[] fArr = u3Var.g;
                float f21 = dp;
                Matrix matrix = u3Var.f;
                float[] fArr2 = u3Var.h;
                float f22 = j3Var2 == null ? 1.0f : lerp;
                float c10 = (d - 1.0f) - j3Var2.c();
                f10 = dp2;
                i9 = i13;
                float max = (c10 - Math.max(v3Var.getScrollMin(), v3Var.getScrollOffset())) / v3Var.getScrollWindow();
                Math.max(max, 0.0f);
                Math.max(Math.min(max, 1.0f), -4.0f);
                float min2 = (Math.min(5.0f, c10) * AndroidUtilities.dp(6.0f)) + f21;
                float f23 = height2;
                float f24 = ((((f18 - f10) - (0.26f * f23)) - min2) * max) + min2;
                float f25 = min / 2.0f;
                i10 = min;
                RectF rectF6 = v3Var.W;
                rectF6.set(f19 - f25, f24, f19 + f25, f23 + f24);
                boolean z11 = (rectF6.top > f18 || rectF6.bottom < 0.0f || lerp < 0.1f) && c10 < d - 3.0f;
                v3Var.a.d(rectF, Utilities.clamp(j3Var2.c(), 1.0f, 0.0f));
                rectF.offset(v3Var.a.getX(), v3Var.a.getY());
                AndroidUtilities.lerpCentered(rectF, rectF6, lerp, rectF6);
                m3 m3Var = v3Var.a;
                if (m3Var != null) {
                    m3Var.setupTab(j3Var2);
                }
                if (rectF6.top > f18 || rectF6.bottom < 0.0f) {
                    f11 = lerp;
                    f12 = f17;
                    f13 = d;
                    arrayList2 = arrayList;
                    rectF2 = rectF;
                    i11 = height2;
                    f14 = f18;
                    f15 = f21;
                } else {
                    canvas.save();
                    u3Var.a.set(rectF6);
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
                    matrix.setPolyToPoly(u3Var.g, 0, u3Var.h, 0, 4);
                    canvas.concat(matrix);
                    float lerp2 = AndroidUtilities.lerp(j3Var2.b(), 1.0f, v3Var.R);
                    float lerp3 = AndroidUtilities.lerp(Utilities.clamp01((c10 - d) + 2.0f), 1.0f, Utilities.clamp01((f22 - 0.1f) / 0.8f));
                    RadialGradient radialGradient = u3Var.p;
                    Paint paint = u3Var.o;
                    Paint paint2 = u3Var.r;
                    f11 = lerp;
                    Matrix matrix2 = u3Var.q;
                    l3 l3Var = u3Var.c;
                    f13 = d;
                    Path path2 = u3Var.n;
                    arrayList2 = arrayList;
                    Paint paint3 = u3Var.e;
                    rectF2 = rectF;
                    RectF rectF7 = u3Var.m;
                    i11 = height2;
                    Paint paint4 = u3Var.l;
                    f14 = f18;
                    f12 = f17;
                    float clamp = Utilities.clamp(1.0f - ((Math.abs(u3Var.i) - 0.3f) / 0.7f), 1.0f, 0.0f) * lerp2;
                    if (clamp > 0.0f) {
                        float f29 = f28 * 1.0f;
                        float lerp4 = AndroidUtilities.lerp(1.0f, 1.3f, f29);
                        float currentActionBarHeight = ((k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(50.0f)) * 0.0f;
                        canvas.save();
                        canvas.rotate(u3Var.i * 20.0f, (u3Var.i * AndroidUtilities.dp(50.0f)) + rectF6.centerX(), rectF6.bottom + AndroidUtilities.dp(350.0f));
                        float a2 = u3Var.k.a(0.01f);
                        canvas.scale(a2, a2, rectF6.centerX(), rectF6.centerY());
                        float lerp5 = AndroidUtilities.lerp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), f28);
                        if (z11) {
                            paint4.setColor(0);
                            paint4.setShadowLayer(AndroidUtilities.dp(30.0f), 0.0f, AndroidUtilities.dp(10.0f), f6.l1(clamp * f28 * 1.0f, TLObject.FLAG_29));
                            canvas.drawRoundRect(rectF6, lerp5, lerp5, paint4);
                            paint3.setAlpha((int) (clamp * 255.0f));
                            canvas.drawRoundRect(rectF6, lerp5, lerp5, paint3);
                            canvas.restore();
                        } else {
                            path2.rewind();
                            path2.addRoundRect(rectF6, lerp5, lerp5, Path.Direction.CW);
                            canvas.save();
                            paint4.setColor(0);
                            paint4.setShadowLayer(AndroidUtilities.dp(30.0f), 0.0f, AndroidUtilities.dp(10.0f), f6.l1(clamp * f28 * 1.0f, TLObject.FLAG_29));
                            canvas.drawPath(path2, paint4);
                            canvas.clipPath(path2);
                            float f30 = clamp * 255.0f * f28;
                            int i14 = (int) f30;
                            paint3.setAlpha(i14);
                            canvas.drawRoundRect(rectF6, lerp5, lerp5, paint3);
                            canvas.save();
                            canvas.translate(rectF6.left, aa.d.w(AndroidUtilities.dp(50.0f), lerp4, rectF6.top, currentActionBarHeight));
                            canvas.scale(1.0f, AndroidUtilities.lerp(1.0f, 1.25f, f29));
                            if (l3Var != null && l3Var.k != null) {
                                float width3 = rectF6.width() / l3Var.k.getWidth();
                                canvas.scale(width3, width3);
                                paint.setAlpha(i14);
                                canvas.drawBitmap(l3Var.k, 0.0f, 0.0f, paint);
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
                            u3Var.d.v = f28;
                            canvas.scale(1.0f, lerp4, rectF7.centerX(), rectF7.top);
                            f15 = f21;
                            u3Var.d.a(canvas, rectF7, lerp5, clamp * clamp, lerp3);
                            canvas.restore();
                            canvas.restore();
                            canvas.restore();
                        }
                    }
                    f15 = f21;
                    canvas.restore();
                }
            }
            i13 = i9 + 1;
            dp = f15;
            lerp = f11;
            d = f13;
            arrayList = arrayList2;
            rectF = rectF2;
            height2 = i11;
            dp2 = f10;
            f18 = f14;
            min = i10;
            f17 = f12;
            v3Var = this;
        }
        float f31 = dp;
        float f32 = f17;
        canvas.save();
        if (this.f0 == null) {
            this.f0 = new s10();
        }
        RectF rectF8 = AndroidUtilities.rectTmp;
        rectF8.set(0.0f, 0.0f, f32, f31);
        this.f0.b(canvas, rectF8, 1, this.R);
        canvas.restore();
        canvas.restore();
        if (this.c0 == null) {
            this.c0 = new nz0(LocaleController.getString(R.string.BotCloseAllTabs), 14.0f, AndroidUtilities.bold());
        }
        if (this.e0 == null || this.d0 != f6.I.q()) {
            boolean q10 = f6.I.q();
            this.d0 = q10;
            if (q10) {
                this.e0 = f6.i0(64, 64, 64, 64, 553648127, 872415231, 872415231);
            } else {
                this.e0 = f6.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688);
            }
            this.e0.setCallback(this);
        }
        float dp3 = this.c0.c + AndroidUtilities.dp(24.0f);
        float f33 = (f32 - dp3) / 2.0f;
        this.e0.setBounds((int) f33, (int) ((f31 - (AndroidUtilities.dp(95.0f) / 2.0f)) - AndroidUtilities.dp(14.0f)), (int) ((f32 + dp3) / 2.0f), (int) ((f31 - (AndroidUtilities.dp(95.0f) / 2.0f)) + AndroidUtilities.dp(14.0f)));
        this.e0.setAlpha((int) (this.R * 255.0f));
        this.e0.draw(canvas);
        this.c0.c(f33 + AndroidUtilities.dp(12.0f), f31 - (AndroidUtilities.dp(95.0f) / 2.0f), this.R, -1, canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        r3 r3Var;
        if (this.R <= 0.0f || (r3Var = this.v) == null || !r3Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x047a  */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.VelocityTracker, org.telegram.ui.ActionBar.u3] */
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
        u3 u3Var;
        if ((AndroidUtilities.isTablet() && motionEvent.getAction() == 0 && !this.M.contains(motionEvent.getX(), motionEvent.getY())) || this.R <= 0.0f) {
            return false;
        }
        if (this.E == null) {
            this.E = VelocityTracker.obtain();
        }
        this.E.addMovement(motionEvent);
        int action = motionEvent.getAction();
        OverScroller overScroller = this.h;
        if (action == 0) {
            this.B = System.currentTimeMillis();
            this.A = motionEvent.getX();
            this.y = motionEvent.getY();
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (this.R >= 1.0f) {
                ArrayList arrayList = this.N;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    u3Var = (u3) arrayList.get(size);
                    if (Math.abs(u3Var.i) < 0.4f && u3Var.a.contains(x10, y10)) {
                        break;
                    }
                }
            }
            u3Var = null;
            this.w = u3Var;
            org.telegram.ui.Cells.z zVar = this.e0;
            boolean z11 = zVar != null && zVar.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
            this.G = z11;
            if (z11) {
                this.w = null;
            }
            org.telegram.ui.Cells.z zVar2 = this.e0;
            if (zVar2 != null) {
                zVar2.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.e0.setState(this.G ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : new int[0]);
            }
            this.C = false;
            this.D = false;
            this.x = false;
            u3 u3Var2 = this.w;
            if (u3Var2 != null) {
                ValueAnimator valueAnimator = u3Var2.j;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                boolean contains = this.w.d.k.getBounds().contains((int) (motionEvent.getX() - this.w.a.left), (int) ((motionEvent.getY() - this.w.a.top) - AndroidUtilities.dp(24.0f)));
                this.x = contains;
                if (contains) {
                    org.telegram.ui.Cells.z zVar3 = this.w.d.k;
                    float x11 = motionEvent.getX();
                    RectF rectF = this.V;
                    zVar3.setHotspot((int) (x11 - rectF.left), (int) (motionEvent.getY() - rectF.centerY()));
                }
                this.w.k.c(!this.x);
                this.w.d.k.setState(this.x ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : new int[0]);
            }
            this.F = motionEvent.getY();
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
            }
            ValueAnimator valueAnimator2 = this.P;
            if (valueAnimator2 == null) {
                return true;
            }
            valueAnimator2.cancel();
            this.P = null;
            return true;
        }
        if (motionEvent.getAction() == 2) {
            u3 u3Var3 = this.w;
            if (u3Var3 != null) {
                if (u3Var3.k.h) {
                    if (!this.D && !this.C && g7.w.a(this.A, motionEvent.getY(), motionEvent.getX(), motionEvent.getY()) > AndroidUtilities.touchSlop) {
                        this.D = true;
                    }
                    if (!this.C && !this.D && g7.w.a(motionEvent.getX(), this.y, motionEvent.getX(), motionEvent.getY()) > AndroidUtilities.touchSlop) {
                        if (!overScroller.isFinished()) {
                            overScroller.abortAnimation();
                        }
                        ValueAnimator valueAnimator3 = this.P;
                        if (valueAnimator3 != null) {
                            valueAnimator3.cancel();
                            this.P = null;
                        }
                        this.C = true;
                    }
                    if (this.a != null && (this.C || this.D)) {
                        this.w.k.c(false);
                        ValueAnimator valueAnimator4 = this.w.j;
                        if (valueAnimator4 != null) {
                            valueAnimator4.cancel();
                        }
                    }
                } else {
                    if (!this.x && !this.D && !this.C && g7.w.a(this.A, motionEvent.getY(), motionEvent.getX(), motionEvent.getY()) > AndroidUtilities.touchSlop) {
                        this.D = true;
                    }
                    if (!this.x && !this.C && !this.D && g7.w.a(motionEvent.getX(), this.y, motionEvent.getX(), motionEvent.getY()) > AndroidUtilities.touchSlop) {
                        if (!overScroller.isFinished()) {
                            overScroller.abortAnimation();
                        }
                        ValueAnimator valueAnimator5 = this.P;
                        if (valueAnimator5 != null) {
                            valueAnimator5.cancel();
                            this.P = null;
                        }
                        this.C = true;
                    }
                    if (this.x) {
                        boolean contains2 = this.w.d.k.getBounds().contains((int) (motionEvent.getX() - this.w.a.left), (int) ((motionEvent.getY() - this.w.a.top) - AndroidUtilities.dp(24.0f)));
                        this.x = contains2;
                        if (!contains2) {
                            this.w.d.k.setState(new int[0]);
                        }
                    }
                }
                u3 u3Var4 = this.w;
                if (!u3Var4.k.h) {
                    if (this.D) {
                        u3Var4.i = (motionEvent.getX() - this.A) / AndroidUtilities.dp(300.0f);
                    } else if (this.C) {
                        float y11 = motionEvent.getY() - this.F;
                        if (this.H < getScrollMin()) {
                            y11 *= 1.0f - (Utilities.clamp((getScrollMin() - this.H) / getScrollStep(), 1.0f, 0.0f) * 0.5f);
                        }
                        setScrollOffset(Utilities.clamp(((getScrollOffset() * getScrollStep()) - y11) / getScrollStep(), getScrollMax(), getScrollMin() - (getScrollStep() * 1.4f)));
                        invalidate();
                    }
                }
                invalidate();
            }
            org.telegram.ui.Cells.z zVar4 = this.e0;
            if (zVar4 != null && this.G) {
                boolean z12 = this.w == null && zVar4.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
                this.G = z12;
                if (!z12) {
                    this.e0.setState(new int[0]);
                }
            }
            this.F = motionEvent.getY();
            return true;
        }
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() != 3) {
                return true;
            }
            u3 u3Var5 = this.w;
            if (u3Var5 != null) {
                u3Var5.a(0.0f);
                this.w.k.c(false);
                this.w.d.k.setState(new int[0]);
            }
            this.w = null;
            this.x = false;
            VelocityTracker velocityTracker3 = this.E;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.E = null;
            }
            this.G = false;
            org.telegram.ui.Cells.z zVar5 = this.e0;
            if (zVar5 == null) {
                return true;
            }
            zVar5.setState(new int[0]);
            return true;
        }
        u3 u3Var6 = this.w;
        if (u3Var6 != null) {
            if (this.a == null || Math.abs(u3Var6.i) <= 0.4f) {
                this.w.a(0.0f);
                if (this.a != null && this.w.k.h) {
                    a(false);
                    u3 u3Var7 = this.w;
                    u3Var7.getClass();
                    this.a.e(u3Var7.c);
                } else if (this.C) {
                    if (this.H < getScrollMin() - (getScrollWindow() * 0.15f)) {
                        a(false);
                    } else if (this.H < getScrollMin()) {
                        h(getScrollMin());
                    } else {
                        this.E.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.n);
                        float yVelocity = this.E.getYVelocity();
                        if (Math.abs(yVelocity) > this.r) {
                            velocityTracker = null;
                            z10 = true;
                            overScroller.fling(0, (int) (getScrollOffset() * getScrollStep()), 0, (int) (-yVelocity), 0, 0, (int) (getScrollMin() * getScrollStep()), (int) (getScrollMax() * getScrollStep()), 0, (int) (getScrollStep() * 0.1f));
                        } else {
                            velocityTracker = null;
                            z10 = true;
                            overScroller.startScroll(0, (int) (getScrollOffset() * getScrollStep()), 0, 0, 0);
                        }
                        this.E.recycle();
                        this.E = velocityTracker;
                        postInvalidateOnAnimation();
                        velocityTracker2 = velocityTracker;
                        this.w.k.c(false);
                        if (this.x) {
                            this.x = this.w.d.k.getBounds().contains((int) (motionEvent.getX() - this.w.a.left), (int) ((motionEvent.getY() - this.w.a.top) - AndroidUtilities.dp(24.0f)));
                        }
                        if (this.x) {
                            final u3 u3Var8 = this.w;
                            final int i9 = 1;
                            this.a.g(u3Var8.c, new Utilities.Callback(this) { // from class: org.telegram.ui.ActionBar.o3
                                public final /* synthetic */ v3 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    Boolean bool = (Boolean) obj;
                                    switch (i9) {
                                        case 0:
                                            v3 v3Var = this.b;
                                            v3Var.getClass();
                                            boolean booleanValue = bool.booleanValue();
                                            u3 u3Var9 = u3Var8;
                                            if (!booleanValue) {
                                                u3Var9.a(0.0f);
                                                break;
                                            } else {
                                                u3Var9.a(u3Var9.i < 0.0f ? -1.0f : 1.0f);
                                                v3Var.h(Utilities.clamp(v3Var.H, v3Var.c(false), v3Var.d(false)));
                                                if (v3Var.a.getTabs().isEmpty()) {
                                                    v3Var.a(false);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            v3 v3Var2 = this.b;
                                            v3Var2.getClass();
                                            boolean booleanValue2 = bool.booleanValue();
                                            u3 u3Var10 = u3Var8;
                                            if (!booleanValue2) {
                                                u3Var10.a(0.0f);
                                                break;
                                            } else {
                                                u3Var10.a(1.0f);
                                                v3Var2.h(Utilities.clamp(v3Var2.H, v3Var2.c(false), v3Var2.d(false)));
                                                if (v3Var2.a.getTabs().isEmpty()) {
                                                    v3Var2.a(false);
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
                    this.E.recycle();
                    this.E = velocityTracker;
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
                final u3 u3Var9 = this.w;
                final int i10 = 0;
                this.a.g(u3Var9.c, new Utilities.Callback(this) { // from class: org.telegram.ui.ActionBar.o3
                    public final /* synthetic */ v3 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (i10) {
                            case 0:
                                v3 v3Var = this.b;
                                v3Var.getClass();
                                boolean booleanValue = bool.booleanValue();
                                u3 u3Var92 = u3Var9;
                                if (!booleanValue) {
                                    u3Var92.a(0.0f);
                                    break;
                                } else {
                                    u3Var92.a(u3Var92.i < 0.0f ? -1.0f : 1.0f);
                                    v3Var.h(Utilities.clamp(v3Var.H, v3Var.c(false), v3Var.d(false)));
                                    if (v3Var.a.getTabs().isEmpty()) {
                                        v3Var.a(false);
                                        break;
                                    }
                                }
                                break;
                            default:
                                v3 v3Var2 = this.b;
                                v3Var2.getClass();
                                boolean booleanValue2 = bool.booleanValue();
                                u3 u3Var10 = u3Var9;
                                if (!booleanValue2) {
                                    u3Var10.a(0.0f);
                                    break;
                                } else {
                                    u3Var10.a(1.0f);
                                    v3Var2.h(Utilities.clamp(v3Var2.H, v3Var2.c(false), v3Var2.d(false)));
                                    if (v3Var2.a.getTabs().isEmpty()) {
                                        v3Var2.a(false);
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
            if (this.G) {
                this.a.f();
                a(false);
                r82 = obj;
            } else {
                r82 = obj;
                if (g7.w.a(this.A, this.y, motionEvent.getX(), motionEvent.getY()) <= AndroidUtilities.touchSlop) {
                    r82 = obj;
                    if (!this.C) {
                        r82 = obj;
                        if (!this.D) {
                            r82 = obj;
                            if (System.currentTimeMillis() - this.B <= ViewConfiguration.getTapTimeout() * 1.2f) {
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
        VelocityTracker velocityTracker4 = this.E;
        if (velocityTracker4 != null) {
            velocityTracker4.recycle();
            this.E = r82;
        }
        this.G = false;
        org.telegram.ui.Cells.z zVar6 = this.e0;
        if (zVar6 == null) {
            return z10;
        }
        zVar6.setState(new int[0]);
        return z10;
    }

    public final float e(boolean z10) {
        int i9 = 0;
        float f10 = 0.0f;
        while (true) {
            ArrayList arrayList = this.N;
            if (i9 >= arrayList.size()) {
                break;
            }
            f10 += ((u3) arrayList.get(i9)).d.c >= 0 ? 1.0f : 0.0f;
            i9++;
        }
        return z10 ? this.f.d(f10, false) : f10;
    }

    public final void f() {
        j3 j3Var;
        m3 m3Var = this.a;
        if (m3Var == null || !(m3Var.getParent() instanceof View)) {
            return;
        }
        HashSet hashSet = mh.c3.S0;
        if (!hashSet.isEmpty()) {
            Iterator it = new HashSet(hashSet).iterator();
            while (it.hasNext()) {
                ((mh.c3) it.next()).k(true);
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
        this.O = view;
        int[] iArr = this.T;
        if (view != null) {
            view.getLocationOnScreen(iArr);
        } else {
            iArr[1] = 0;
            iArr[0] = 0;
        }
        int[] iArr2 = this.U;
        getLocationOnScreen(iArr2);
        this.M.set(iArr[0] - iArr2[0], iArr[1] - iArr2[1], this.O.getWidth() + r5, this.O.getHeight() + (iArr[1] - iArr2[1]));
        View view2 = this.O;
        AndroidUtilities.makingGlobalBlurBitmap = true;
        this.I = AndroidUtilities.makeBlurBitmap(view2, 14.0f, 14);
        AndroidUtilities.makingGlobalBlurBitmap = false;
        Paint paint = new Paint(1);
        this.K = paint;
        Bitmap bitmap = this.I;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.J = bitmapShader;
        paint.setShader(bitmapShader);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f6.I.q() ? 0.08f : 0.25f);
        this.K.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.L = new Matrix();
        ArrayList arrayList = this.N;
        arrayList.clear();
        ArrayList<l3> tabs = this.a.getTabs();
        ArrayList<j3> tabDrawables = this.a.getTabDrawables();
        for (int size = tabs.size() - 1; size >= 0; size--) {
            l3 l3Var = tabs.get(size);
            int i9 = 0;
            while (true) {
                if (i9 >= tabDrawables.size()) {
                    j3Var = null;
                    break;
                }
                j3Var = tabDrawables.get(i9);
                if (j3Var.a == l3Var) {
                    break;
                } else {
                    i9++;
                }
            }
            if (j3Var != null) {
                arrayList.add(new u3(this, l3Var, j3Var));
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
        return this.H;
    }

    public float getScrollRange() {
        return e(true);
    }

    public float getScrollWindow() {
        return Math.min(3.0f, getScrollRange());
    }

    public final void h(float f10) {
        ValueAnimator valueAnimator = this.P;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.P = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H, f10);
        this.P = ofFloat;
        ofFloat.addUpdateListener(new n3(this, 2));
        this.P.setDuration(250L);
        this.P.setInterpolator(gr.h);
        this.P.start();
    }

    public void setScrollOffset(float f10) {
        this.H = f10;
    }

    public void setTabsView(m3 m3Var) {
        this.a = m3Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.e0 || super.verifyDrawable(drawable);
    }

    public void setSlowerDismiss(boolean z10) {
    }
}
