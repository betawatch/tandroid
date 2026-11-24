// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fz0 extends View {
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
    public xy0 a;
    public ValueAnimator a0;
    public cz0 b;
    public final int[] b0;
    public uy0 c;
    public final int[] c0;
    public ValueAnimator d;
    public final RectF d0;
    public float e;
    public final RectF e0;
    public final ln f;
    public final RectF f0;
    public final Path g0;
    public final OverScroller h;
    public uib h0;
    public boolean i0;
    public fg0 j0;
    public in3 k0;
    public final int n;
    public final int r;
    public int s;
    public final bz0 w;
    public ez0 x;
    public boolean y;

    public fz0(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f = new ln(this, 0L, 350L, d53.h);
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
        bz0 bz0Var = new bz0(this, this);
        this.w = bz0Var;
        kfc.k(this, bz0Var);
        setImportantForAccessibility(2);
        cfc.i(this, new xg0(this, (byte) 17));
    }

    public static void g(ViewGroup viewGroup, float f, final x0 x0Var) {
        if (viewGroup.getWidth() <= 0 || viewGroup.getHeight() <= 0) {
            x0Var.a(null);
            return;
        }
        final SurfaceTexture d = fl.d();
        d.setDefaultBufferSize(viewGroup.getWidth(), viewGroup.getHeight());
        final Surface surface = new Surface(d);
        final Bitmap createBitmap = Bitmap.createBitmap(viewGroup.getWidth(), viewGroup.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
        lockHardwareCanvas.translate(0.0f, f);
        viewGroup.draw(lockHardwareCanvas);
        surface.unlockCanvasAndPost(lockHardwareCanvas);
        PixelCopy.request(surface, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: az0
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                x0 x0Var2 = x0.this;
                Bitmap bitmap = createBitmap;
                Surface surface2 = surface;
                SurfaceTexture surfaceTexture = d;
                if (i == 0) {
                    x0Var2.a(bitmap);
                } else {
                    bitmap.recycle();
                    x0Var2.a(null);
                }
                surface2.release();
                surfaceTexture.release();
            }
        }, new Handler());
    }

    private float getScrollStep() {
        return gm.L(200.0f);
    }

    private void setModalAccessibility(boolean z) {
        setImportantForAccessibility(z ? 1 : 2);
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != this) {
                    childAt.setImportantForAccessibility(z ? 4 : 0);
                }
            }
        }
        bz0 bz0Var = this.w;
        if (bz0Var != null) {
            bz0Var.i();
        }
        if (z) {
            sendAccessibilityEvent(32);
        }
    }

    public final void a(boolean z) {
        if (this.V == z) {
            return;
        }
        ValueAnimator valueAnimator = this.a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.V = z;
        xy0 xy0Var = this.a;
        if (xy0Var != null) {
            xy0Var.b = false;
            xy0Var.invalidate();
        }
        setModalAccessibility(z);
        invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.W, z ? 1.0f : 0.0f);
        this.a0 = ofFloat;
        ofFloat.addUpdateListener(new yy0(this, (byte) 0));
        this.a0.addListener(new g0(this, (byte) 29));
        this.a0.setInterpolator(d53.h);
        this.a0.setDuration(320L);
        this.a0.start();
    }

    public final void b(cz0 cz0Var) {
        ValueAnimator valueAnimator;
        if (this.a == null) {
            return;
        }
        if (this.b != null && (valueAnimator = this.d) != null) {
            valueAnimator.end();
            this.d = null;
        }
        this.b = cz0Var;
        cz0Var.b(false);
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        wy0 c = cz0Var.c();
        xy0 xy0Var = this.a;
        ArrayList<wy0> tabs = xy0Var.getTabs();
        ArrayList<uy0> tabDrawables = xy0Var.getTabDrawables();
        uy0 uy0Var = new uy0(xy0Var, c);
        uy0Var.e.e(true, -1.0f);
        uy0Var.f.e(true, 0.0f);
        tabDrawables.add(uy0Var);
        tabs.add(0, c);
        for (int i = 0; i < tabDrawables.size(); i++) {
            uy0 uy0Var2 = tabDrawables.get(i);
            int indexOf = tabs.indexOf(uy0Var2.a);
            uy0Var2.d = indexOf;
            if (indexOf >= 0) {
                uy0Var2.c = indexOf;
            }
        }
        xy0Var.n();
        xy0Var.o(true);
        xy0Var.invalidate();
        vy0 vy0Var = xy0Var.e;
        if (vy0Var != null) {
            vy0Var.i();
        }
        this.c = uy0Var;
        post(new yt0(cz0Var, (byte) 7));
        invalidate();
        this.e = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.addUpdateListener(new yy0(this, (byte) 2));
        this.d.addListener(new i8(this, c, cz0Var, (byte) 2));
        gm.n(this.d, 220.0d, 30.0d);
        this.d.setDuration((long) (r11.getDuration() * 1.1f));
        this.d.start();
    }

    public final float c(boolean z) {
        return (e(z) - Math.min(3.0f, e(z))) - (Utilities.i(4.0f - e(z), 0.5f, 0.0f) * (Math.min(3.0f, e(z)) / 3.0f));
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.h.computeScrollOffset()) {
            setScrollOffset(r0.getCurrY() / getScrollStep());
            postInvalidateOnAnimation();
        }
    }

    public final float d(boolean z) {
        return Utilities.i(e(z), 1.0f, 0.0f) * ((-getScrollWindow()) / 3.0f);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        ArrayList arrayList;
        float f;
        int i;
        fg0 i0;
        float f2;
        int i2;
        int i3;
        float f3;
        float f4;
        ArrayList arrayList2;
        float f5;
        RectF rectF2;
        int i4;
        float f6;
        float f7;
        fz0 fz0Var = this;
        super.dispatchDraw(canvas);
        cz0 cz0Var = fz0Var.b;
        float f8 = 1.0f;
        float f9 = 0.0f;
        int i5 = 1;
        int[] iArr = fz0Var.b0;
        int[] iArr2 = fz0Var.c0;
        int i6 = 0;
        RectF rectF3 = fz0Var.d0;
        if (cz0Var != null) {
            fz0Var.getLocationOnScreen(iArr2);
            fz0Var.a.getLocationOnScreen(iArr);
            fz0Var.a.d(rectF3, 0.0f);
            rectF3.offset(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
            canvas.save();
            canvas.clipRect(0, 0, fz0Var.getMeasuredWidth(), fz0Var.getMeasuredHeight() - fz0Var.s);
            dz0 d = fz0Var.b.d();
            float f10 = fz0Var.e;
            RectF rectF4 = fz0Var.f0;
            float y = d.y(canvas, rectF3, f10, rectF4, f10);
            if (fz0Var.c != null) {
                Path path = fz0Var.g0;
                path.rewind();
                path.addRoundRect(rectF4, y, y, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float B = kt6.B(1.0f, fz0Var.e, gm.L(50.0f), rectF4.top);
                rectF3.set(rectF4.left, B, rectF4.right, gm.L(50.0f) + B);
                fz0Var.a.setupTab(fz0Var.c);
                fz0Var.c.a(canvas, rectF3, y, fz0Var.e, 1.0f);
                rectF = rectF3;
                canvas.restore();
            } else {
                rectF = rectF3;
            }
            canvas.restore();
        } else {
            rectF = rectF3;
        }
        if (fz0Var.W <= 0.0f) {
            return;
        }
        canvas.save();
        View view = fz0Var.T;
        RectF rectF5 = fz0Var.R;
        if (view != null) {
            view.getLocationOnScreen(iArr);
            fz0Var.getLocationOnScreen(iArr2);
            rectF5.set(iArr[0] - iArr2[0], iArr[1] - iArr2[1], fz0Var.T.getWidth() + r1, fz0Var.T.getHeight() + (iArr[1] - iArr2[1]));
        } else {
            iArr[1] = 0;
            iArr[0] = 0;
            rectF5.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        canvas.clipRect(rectF5);
        canvas.translate(rectF5.left, rectF5.top);
        float width = rectF5.width();
        float height = rectF5.height();
        float f11 = 255.0f;
        if (fz0Var.N != null) {
            fz0Var.Q.reset();
            float width2 = rectF5.width() / fz0Var.N.getWidth();
            fz0Var.Q.postScale(width2, width2);
            fz0Var.O.setLocalMatrix(fz0Var.Q);
            fz0Var.P.setAlpha((int) (fz0Var.W * 255.0f));
            canvas.drawRect(0.0f, 0.0f, width, height, fz0Var.P);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, width, height, nm7.d4, 31);
        float f12 = width;
        float L = gm.L(55.0f) + gm.L(40.0f) + gm.m;
        float L2 = gm.L(68.0f);
        int min = (int) Math.min(gm.L(340.0f), 0.95f * f12);
        int height2 = (int) (gm.O1() ? rectF5.height() * 0.5f : 0.75f * height);
        float f13 = f12 / 2.0f;
        float f14 = 0.0f;
        int i7 = 0;
        while (true) {
            arrayList = fz0Var.S;
            f = f11;
            if (i7 >= arrayList.size()) {
                break;
            }
            f14 += ((ez0) arrayList.get(i7)).d.d >= 0 ? 1.0f : 0.0f;
            i7++;
            f11 = f;
        }
        float e = fz0Var.f.e(false, f14);
        float R1 = gm.R1(0.0f, 1.0f - Utilities.i(fz0Var.getScrollWindow() <= 0.0f ? 0.0f : ((fz0Var.getScrollMin() - fz0Var.getScrollOffset()) / (fz0Var.getScrollWindow() * 0.15f)) * 0.2f, 1.0f, 0.0f), fz0Var.W);
        int i8 = 0;
        while (true) {
            i = i5;
            int i9 = i6;
            if (i8 >= arrayList.size() + 1) {
                break;
            }
            if (i8 == arrayList.size()) {
                f6 = L;
                f2 = L2;
                i3 = min;
                f3 = R1;
                i2 = i8;
                f4 = f12;
                f7 = f8;
                arrayList2 = arrayList;
                f5 = e;
                rectF2 = rectF;
                i4 = height2;
            } else {
                ez0 ez0Var = (ez0) arrayList.get(i8);
                if (i8 < arrayList.size()) {
                    uy0 uy0Var = ez0Var.d;
                }
                uy0 uy0Var2 = ez0Var.d;
                float f15 = f8;
                float[] fArr = ez0Var.h;
                float f16 = f9;
                float[] fArr2 = ez0Var.g;
                float f17 = L;
                Matrix matrix = ez0Var.f;
                float c = (e - f15) - uy0Var2.c();
                f2 = L2;
                i2 = i8;
                float max = (c - Math.max(fz0Var.getScrollMin(), fz0Var.getScrollOffset())) / fz0Var.getScrollWindow();
                float min2 = (Math.min(5.0f, c) * gm.L(6.0f)) + f17;
                float f18 = height2;
                float f19 = ((((height - f2) - (0.26f * f18)) - min2) * max) + min2;
                float f20 = min / 2.0f;
                i3 = min;
                RectF rectF6 = fz0Var.e0;
                rectF6.set(f13 - f20, f19, f13 + f20, f19 + f18);
                int i10 = ((rectF6.top > height || rectF6.bottom < f16 || R1 < 0.1f) && c < e - 3.0f) ? i : i9;
                fz0Var.a.d(rectF, Utilities.i(uy0Var2.c(), f15, f16));
                rectF.offset(fz0Var.a.getX(), fz0Var.a.getY());
                gm.a2(rectF, rectF6, R1, rectF6);
                xy0 xy0Var = fz0Var.a;
                if (xy0Var != null) {
                    xy0Var.setupTab(uy0Var2);
                }
                if (rectF6.top > height || rectF6.bottom < 0.0f) {
                    f3 = R1;
                    f4 = f12;
                    arrayList2 = arrayList;
                    f5 = e;
                    rectF2 = rectF;
                    i4 = height2;
                    f6 = f17;
                    f7 = 1.0f;
                } else {
                    canvas.save();
                    ez0Var.a.set(rectF6);
                    matrix.reset();
                    fArr2[i9] = rectF6.left;
                    float f21 = rectF6.top;
                    fArr2[i] = f21;
                    float f22 = rectF6.right;
                    fArr2[2] = f22;
                    fArr2[3] = f21;
                    fArr2[4] = f22;
                    fArr2[5] = (rectF6.height() * 1.0f) + f21;
                    fArr2[6] = rectF6.left;
                    fArr2[7] = (rectF6.height() * 1.0f) + rectF6.top;
                    fArr[i9] = rectF6.left;
                    fArr[i] = rectF6.top - gm.L(0.0f);
                    fArr[2] = rectF6.right;
                    fArr[3] = rectF6.top - gm.L(0.0f);
                    float f23 = R1 * 1.0f;
                    fArr[4] = (gm.R1(1.0f, 0.83f, f23) * (rectF6.width() / 2.0f)) + rectF6.centerX();
                    fArr[5] = (gm.R1(1.0f, 0.6f, f23) * ((rectF6.height() * 1.0f) + gm.L(0.0f))) + (rectF6.top - gm.L(0.0f));
                    fArr[6] = rectF6.centerX() - (gm.R1(1.0f, 0.83f, f23) * (rectF6.width() / 2.0f));
                    fArr[7] = (gm.R1(1.0f, 0.6f, f23) * ((rectF6.height() * 1.0f) + gm.L(0.0f))) + (rectF6.top - gm.L(0.0f));
                    matrix.setPolyToPoly(fArr2, 0, fArr, 0, 4);
                    canvas.concat(matrix);
                    float R12 = gm.R1(uy0Var2.b(), 1.0f, fz0Var.W);
                    float R13 = gm.R1(Utilities.l((c - e) + 2.0f), 1.0f, Utilities.l((R1 - 0.1f) / 0.8f));
                    uy0 uy0Var3 = ez0Var.d;
                    RadialGradient radialGradient = ez0Var.p;
                    Paint paint = ez0Var.o;
                    Paint paint2 = ez0Var.r;
                    Matrix matrix2 = ez0Var.q;
                    f3 = R1;
                    wy0 wy0Var = ez0Var.c;
                    arrayList2 = arrayList;
                    Path path2 = ez0Var.n;
                    f5 = e;
                    Paint paint3 = ez0Var.e;
                    rectF2 = rectF;
                    RectF rectF7 = ez0Var.m;
                    i4 = height2;
                    Paint paint4 = ez0Var.l;
                    f4 = f12;
                    f7 = 1.0f;
                    float i11 = Utilities.i(1.0f - ((Math.abs(ez0Var.i) - 0.3f) / 0.7f), 1.0f, 0.0f) * R12;
                    if (i11 <= 0.0f) {
                        f6 = f17;
                    } else {
                        float f24 = f23 * 1.0f;
                        float R14 = gm.R1(1.0f, 1.3f, f24);
                        float currentActionBarHeight = ((a.getCurrentActionBarHeight() + gm.m) - gm.L(50.0f)) * 0.0f;
                        canvas.save();
                        canvas.rotate(ez0Var.i * 20.0f, (ez0Var.i * gm.L(50.0f)) + rectF6.centerX(), rectF6.bottom + gm.L(350.0f));
                        float a = ez0Var.k.a(0.01f);
                        canvas.scale(a, a, rectF6.centerX(), rectF6.centerY());
                        float U1 = gm.U1(f23, gm.L(18.0f), gm.L(18.0f));
                        if (i10 != 0) {
                            paint4.setColor(i9);
                            paint4.setShadowLayer(gm.L(30.0f), 0.0f, gm.L(10.0f), cmb.p1(i11 * f23 * 1.0f, TLObject.FLAG_29));
                            canvas.drawRoundRect(rectF6, U1, U1, paint4);
                            paint3.setAlpha((int) (i11 * f));
                            canvas.drawRoundRect(rectF6, U1, U1, paint3);
                            canvas.restore();
                            f6 = f17;
                            f7 = 1.0f;
                        } else {
                            path2.rewind();
                            path2.addRoundRect(rectF6, U1, U1, Path.Direction.CW);
                            canvas.save();
                            paint4.setColor(0);
                            paint4.setShadowLayer(gm.L(30.0f), 0.0f, gm.L(10.0f), cmb.p1(i11 * f23 * 1.0f, TLObject.FLAG_29));
                            canvas.drawPath(path2, paint4);
                            canvas.clipPath(path2);
                            float f25 = i11 * f * f23;
                            int i12 = (int) f25;
                            paint3.setAlpha(i12);
                            canvas.drawRoundRect(rectF6, U1, U1, paint3);
                            canvas.save();
                            canvas.translate(rectF6.left, ts2.i(gm.L(50.0f), R14, rectF6.top, currentActionBarHeight));
                            canvas.scale(1.0f, gm.R1(1.0f, 1.25f, f24));
                            if (wy0Var != null && wy0Var.m != null) {
                                float width3 = rectF6.width() / wy0Var.m.getWidth();
                                canvas.scale(width3, width3);
                                paint.setAlpha(i12);
                                canvas.drawBitmap(wy0Var.m, 0.0f, 0.0f, paint);
                            }
                            canvas.restore();
                            canvas.save();
                            paint2.setAlpha((int) (f25 * 1.0f));
                            matrix2.reset();
                            float height3 = rectF6.height() / f;
                            matrix2.postScale(height3, height3);
                            matrix2.postTranslate(rectF6.centerX(), rectF6.top);
                            radialGradient.setLocalMatrix(matrix2);
                            paint2.setShader(radialGradient);
                            canvas.drawRect(rectF6, paint2);
                            canvas.restore();
                            rectF7.set(rectF6);
                            rectF7.bottom = Math.min(rectF6.height(), gm.L(50.0f)) + rectF7.top;
                            rectF7.offset(0.0f, currentActionBarHeight);
                            uy0Var3.w = f23;
                            f7 = 1.0f;
                            canvas.scale(1.0f, R14, rectF7.centerX(), rectF7.top);
                            float f26 = i11 * i11;
                            f6 = f17;
                            uy0Var3.a(canvas, rectF7, U1, f26, R13);
                            canvas.restore();
                            canvas.restore();
                        }
                    }
                    canvas.restore();
                }
            }
            i8 = i2 + 1;
            L = f6;
            f8 = f7;
            i5 = i;
            R1 = f3;
            arrayList = arrayList2;
            e = f5;
            rectF = rectF2;
            height2 = i4;
            L2 = f2;
            f12 = f4;
            min = i3;
            f9 = 0.0f;
            i6 = 0;
            fz0Var = this;
        }
        float f27 = L;
        float f28 = f12;
        canvas.save();
        if (this.k0 == null) {
            this.k0 = new in3((byte) 7);
        }
        RectF rectF8 = gm.P;
        rectF8.set(0.0f, 0.0f, f28, f27);
        this.k0.r(canvas, rectF8, i, this.W);
        canvas.restore();
        canvas.restore();
        if (this.h0 == null) {
            this.h0 = new uib(jb6.M0(2131753064, null), 14.0f, gm.o());
        }
        if (this.j0 == null || this.i0 != cmb.I.o()) {
            boolean o = cmb.I.o();
            this.i0 = o;
            if (o) {
                i0 = cmb.i0(64, 64, 64, 64, 553648127, 872415231, 872415231);
                this.j0 = i0;
            } else {
                i0 = cmb.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688);
                this.j0 = i0;
            }
            i0.setCallback(this);
        }
        float L3 = this.h0.c + gm.L(24.0f);
        float f29 = (f28 - L3) / 2.0f;
        this.j0.setBounds((int) f29, (int) ((f27 - (gm.L(95.0f) / 2.0f)) - gm.L(14.0f)), (int) ((f28 + L3) / 2.0f), (int) ((f27 - (gm.L(95.0f) / 2.0f)) + gm.L(14.0f)));
        this.j0.setAlpha((int) (this.W * f));
        this.j0.draw(canvas);
        this.h0.c(f29 + gm.L(12.0f), f27 - (gm.L(95.0f) / 2.0f), this.W, -1, canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        bz0 bz0Var;
        if (this.W <= 0.0f || (bz0Var = this.w) == null || !bz0Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0467  */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.VelocityTracker, ez0] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        ?? r8;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        boolean z2;
        ez0 ez0Var;
        final byte b = 0;
        if ((gm.O1() && motionEvent.getAction() == 0 && !this.R.contains(motionEvent.getX(), motionEvent.getY())) || this.W <= 0.0f) {
            return false;
        }
        VelocityTracker velocityTracker3 = this.J;
        if (velocityTracker3 == null) {
            velocityTracker3 = VelocityTracker.obtain();
            this.J = velocityTracker3;
        }
        velocityTracker3.addMovement(motionEvent);
        int action = motionEvent.getAction();
        OverScroller overScroller = this.h;
        if (action == 0) {
            this.G = System.currentTimeMillis();
            this.F = motionEvent.getX();
            this.E = motionEvent.getY();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.W >= 1.0f) {
                ArrayList arrayList = this.S;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ez0Var = (ez0) arrayList.get(size);
                    if (Math.abs(ez0Var.i) < 0.4f && ez0Var.a.contains(x, y)) {
                        break;
                    }
                }
            }
            ez0Var = null;
            this.x = ez0Var;
            fg0 fg0Var = this.j0;
            boolean z3 = fg0Var != null && fg0Var.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
            this.L = z3;
            if (z3) {
                this.x = null;
            }
            fg0 fg0Var2 = this.j0;
            if (fg0Var2 != null) {
                fg0Var2.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.j0.setState(this.L ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : new int[0]);
            }
            this.H = false;
            this.I = false;
            this.y = false;
            ez0 ez0Var2 = this.x;
            if (ez0Var2 != null) {
                ValueAnimator valueAnimator = ez0Var2.j;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                boolean contains = this.x.d.l.getBounds().contains((int) (motionEvent.getX() - this.x.a.left), (int) ((motionEvent.getY() - this.x.a.top) - gm.L(24.0f)));
                this.y = contains;
                if (contains) {
                    fg0 fg0Var3 = this.x.d.l;
                    float x2 = motionEvent.getX();
                    RectF rectF = this.d0;
                    fg0Var3.setHotspot((int) (x2 - rectF.left), (int) (motionEvent.getY() - rectF.centerY()));
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
            ez0 ez0Var3 = this.x;
            if (ez0Var3 != null) {
                if (ez0Var3.k.i) {
                    if (!this.I && !this.H && oqe.a(this.F, motionEvent.getY(), motionEvent.getX(), motionEvent.getY()) > gm.e) {
                        this.I = true;
                    }
                    if (!this.H && !this.I && oqe.a(motionEvent.getX(), this.E, motionEvent.getX(), motionEvent.getY()) > gm.e) {
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
                    if (!this.y && !this.I && !this.H && oqe.a(this.F, motionEvent.getY(), motionEvent.getX(), motionEvent.getY()) > gm.e) {
                        this.I = true;
                    }
                    if (!this.y && !this.H && !this.I && oqe.a(motionEvent.getX(), this.E, motionEvent.getX(), motionEvent.getY()) > gm.e) {
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
                        boolean contains2 = this.x.d.l.getBounds().contains((int) (motionEvent.getX() - this.x.a.left), (int) ((motionEvent.getY() - this.x.a.top) - gm.L(24.0f)));
                        this.y = contains2;
                        if (!contains2) {
                            this.x.d.l.setState(new int[0]);
                        }
                    }
                }
                ez0 ez0Var4 = this.x;
                if (!ez0Var4.k.i) {
                    if (this.I) {
                        ez0Var4.i = (motionEvent.getX() - this.F) / gm.L(300.0f);
                    } else if (this.H) {
                        float y2 = motionEvent.getY() - this.K;
                        if (this.M < getScrollMin()) {
                            y2 *= 1.0f - (Utilities.i((getScrollMin() - this.M) / getScrollStep(), 1.0f, 0.0f) * 0.5f);
                        }
                        setScrollOffset(Utilities.i(((getScrollOffset() * getScrollStep()) - y2) / getScrollStep(), getScrollMax(), getScrollMin() - (getScrollStep() * 1.4f)));
                        invalidate();
                    }
                }
                invalidate();
            }
            fg0 fg0Var4 = this.j0;
            if (fg0Var4 != null && this.L) {
                boolean z4 = this.x == null && fg0Var4.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
                this.L = z4;
                if (!z4) {
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
            ez0 ez0Var5 = this.x;
            if (ez0Var5 != null) {
                ez0Var5.a(0.0f);
                this.x.k.c(false);
                this.x.d.l.setState(new int[0]);
            }
            this.x = null;
            this.y = false;
            VelocityTracker velocityTracker4 = this.J;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
                this.J = null;
            }
            this.L = false;
            fg0 fg0Var5 = this.j0;
            if (fg0Var5 == null) {
                return true;
            }
            fg0Var5.setState(new int[0]);
            return true;
        }
        ez0 ez0Var6 = this.x;
        if (ez0Var6 != null) {
            if (this.a == null || Math.abs(ez0Var6.i) <= 0.4f) {
                this.x.a(0.0f);
                if (this.a != null && this.x.k.i) {
                    a(false);
                    ez0 ez0Var7 = this.x;
                    ez0Var7.getClass();
                    this.a.e(ez0Var7.c);
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
                            z = true;
                            overScroller.fling(0, (int) (getScrollOffset() * getScrollStep()), 0, (int) (-yVelocity), 0, 0, (int) (getScrollMin() * getScrollStep()), (int) (getScrollMax() * getScrollStep()), 0, (int) (getScrollStep() * 0.1f));
                        } else {
                            velocityTracker = null;
                            z = true;
                            overScroller.startScroll(0, (int) (getScrollOffset() * getScrollStep()), 0, 0, 0);
                        }
                        this.J.recycle();
                        this.J = velocityTracker;
                        postInvalidateOnAnimation();
                        velocityTracker2 = velocityTracker;
                        this.x.k.c(false);
                        z2 = this.y;
                        if (z2) {
                            z2 = this.x.d.l.getBounds().contains((int) (motionEvent.getX() - this.x.a.left), (int) ((motionEvent.getY() - this.x.a.top) - gm.L(24.0f)));
                            this.y = z2;
                        }
                        if (z2) {
                            final ez0 ez0Var8 = this.x;
                            xy0 xy0Var = this.a;
                            wy0 wy0Var = ez0Var8.c;
                            final byte b2 = z ? (byte) 1 : (byte) 0;
                            xy0Var.g(wy0Var, new qac(this) { // from class: zy0
                                public final /* synthetic */ fz0 b;

                                {
                                    this.b = this;
                                }

                                @Override // qac
                                public final void a(Object obj) {
                                    byte b3 = b2;
                                    ez0 ez0Var9 = ez0Var8;
                                    fz0 fz0Var = this.b;
                                    Boolean bool = (Boolean) obj;
                                    switch (b3) {
                                        case 0:
                                            if (!bool.booleanValue()) {
                                                ez0Var9.a(0.0f);
                                                break;
                                            } else {
                                                ez0Var9.a(ez0Var9.i < 0.0f ? -1.0f : 1.0f);
                                                fz0Var.h(Utilities.i(fz0Var.M, fz0Var.c(false), fz0Var.d(false)));
                                                if (fz0Var.a.getTabs().isEmpty()) {
                                                    fz0Var.a(false);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            if (!bool.booleanValue()) {
                                                ez0Var9.a(0.0f);
                                                break;
                                            } else {
                                                ez0Var9.a(1.0f);
                                                fz0Var.h(Utilities.i(fz0Var.M, fz0Var.c(false), fz0Var.d(false)));
                                                if (fz0Var.a.getTabs().isEmpty()) {
                                                    fz0Var.a(false);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                        }
                        this.x.d.l.setState(new int[0]);
                        r8 = velocityTracker2;
                    }
                    velocityTracker = null;
                    z = true;
                    this.J.recycle();
                    this.J = velocityTracker;
                    postInvalidateOnAnimation();
                    velocityTracker2 = velocityTracker;
                    this.x.k.c(false);
                    z2 = this.y;
                    if (z2) {
                    }
                    if (z2) {
                    }
                    this.x.d.l.setState(new int[0]);
                    r8 = velocityTracker2;
                }
            } else {
                final ez0 ez0Var9 = this.x;
                this.a.g(ez0Var9.c, new qac(this) { // from class: zy0
                    public final /* synthetic */ fz0 b;

                    {
                        this.b = this;
                    }

                    @Override // qac
                    public final void a(Object obj) {
                        byte b3 = b;
                        ez0 ez0Var92 = ez0Var9;
                        fz0 fz0Var = this.b;
                        Boolean bool = (Boolean) obj;
                        switch (b3) {
                            case 0:
                                if (!bool.booleanValue()) {
                                    ez0Var92.a(0.0f);
                                    break;
                                } else {
                                    ez0Var92.a(ez0Var92.i < 0.0f ? -1.0f : 1.0f);
                                    fz0Var.h(Utilities.i(fz0Var.M, fz0Var.c(false), fz0Var.d(false)));
                                    if (fz0Var.a.getTabs().isEmpty()) {
                                        fz0Var.a(false);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (!bool.booleanValue()) {
                                    ez0Var92.a(0.0f);
                                    break;
                                } else {
                                    ez0Var92.a(1.0f);
                                    fz0Var.h(Utilities.i(fz0Var.M, fz0Var.c(false), fz0Var.d(false)));
                                    if (fz0Var.a.getTabs().isEmpty()) {
                                        fz0Var.a(false);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
            }
            velocityTracker2 = null;
            z = true;
            this.x.k.c(false);
            z2 = this.y;
            if (z2) {
            }
            if (z2) {
            }
            this.x.d.l.setState(new int[0]);
            r8 = velocityTracker2;
        } else {
            Object obj = null;
            z = true;
            if (this.L) {
                this.a.f();
                a(false);
                r8 = obj;
            } else {
                r8 = obj;
                if (oqe.a(this.F, this.E, motionEvent.getX(), motionEvent.getY()) <= gm.e) {
                    r8 = obj;
                    if (!this.H) {
                        r8 = obj;
                        if (!this.I) {
                            r8 = obj;
                            if (System.currentTimeMillis() - this.G <= ViewConfiguration.getTapTimeout() * 1.2f) {
                                a(false);
                                r8 = obj;
                            }
                        }
                    }
                }
            }
        }
        this.x = r8;
        this.y = false;
        VelocityTracker velocityTracker5 = this.J;
        if (velocityTracker5 != null) {
            velocityTracker5.recycle();
            this.J = r8;
        }
        this.L = false;
        fg0 fg0Var6 = this.j0;
        if (fg0Var6 == null) {
            return z;
        }
        fg0Var6.setState(new int[0]);
        return z;
    }

    public final float e(boolean z) {
        float f = 0.0f;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.S;
            if (i >= arrayList.size()) {
                break;
            }
            f += ((ez0) arrayList.get(i)).d.d >= 0 ? 1.0f : 0.0f;
            i++;
        }
        return z ? this.f.e(false, f) : f;
    }

    public final void f() {
        uy0 uy0Var;
        xy0 xy0Var = this.a;
        if (xy0Var == null || !(xy0Var.getParent() instanceof View)) {
            return;
        }
        HashSet hashSet = wx0.b1;
        if (!hashSet.isEmpty()) {
            Iterator it = new HashSet(hashSet).iterator();
            while (it.hasNext()) {
                ((wx0) it.next()).m(true);
            }
            gm.d3(new yt0(this, (byte) 8), 100L);
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
        gm.m0 = true;
        this.N = gm.h2(14.0f, 14, view2);
        gm.m0 = false;
        Paint paint = new Paint(1);
        this.P = paint;
        Bitmap bitmap = this.N;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.O = bitmapShader;
        paint.setShader(bitmapShader);
        ColorMatrix colorMatrix = new ColorMatrix();
        gm.i(colorMatrix, cmb.I.o() ? 0.08f : 0.25f);
        this.P.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.Q = new Matrix();
        ArrayList arrayList = this.S;
        arrayList.clear();
        ArrayList<wy0> tabs = this.a.getTabs();
        ArrayList<uy0> tabDrawables = this.a.getTabDrawables();
        for (int size = tabs.size() - 1; size >= 0; size--) {
            wy0 wy0Var = tabs.get(size);
            int i = 0;
            while (true) {
                if (i >= tabDrawables.size()) {
                    uy0Var = null;
                    break;
                }
                uy0Var = tabDrawables.get(i);
                if (uy0Var.a == wy0Var) {
                    break;
                } else {
                    i++;
                }
            }
            if (uy0Var != null) {
                arrayList.add(new ez0(this, wy0Var, uy0Var));
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

    public final void h(float f) {
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.U = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M, f);
        this.U = ofFloat;
        ofFloat.addUpdateListener(new yy0(this, (byte) 1));
        this.U.setDuration(250L);
        this.U.setInterpolator(d53.h);
        this.U.start();
    }

    public void setScrollOffset(float f) {
        this.M = f;
    }

    public void setTabsView(xy0 xy0Var) {
        this.a = xy0Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.j0 || super.verifyDrawable(drawable);
    }

    public void setSlowerDismiss(boolean z) {
    }
}
