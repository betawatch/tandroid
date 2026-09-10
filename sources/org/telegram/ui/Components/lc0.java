package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class lc0 extends Drawable {
    public static final boolean e0;
    public static final boolean f0;
    public Matrix A;
    public boolean B;
    public GradientDrawable C;
    public GenericProvider D;
    public boolean E;
    public boolean F;
    public final Runnable G;
    public PorterDuffColorFilter H;
    public int I;
    public float J;
    public float K;
    public int L;
    public float M;
    public boolean N;
    public final int O;
    public final int P;
    public qc0 Q;
    public List R;
    public int S;
    public boolean T;
    public int U;
    public final fh.a V;
    public final fh.a W;
    public Bitmap X;
    public Canvas Y;
    public Paint Z;
    public final int[] a;
    public int a0;
    public long b;
    public final fh.a b0;
    public WeakReference c;
    public Bitmap c0;
    public boolean d;
    public int d0;
    public final wr e;
    public int f;
    public boolean g;
    public float h;
    public int i;
    public final RectF j;
    public Bitmap k;
    public Bitmap l;
    public final Bitmap[] m;
    public final Paint n;
    public final Paint o;
    public final Paint p;
    public int q;
    public Canvas r;
    public Canvas s;
    public boolean t;
    public Bitmap u;
    public BitmapShader v;
    public BitmapShader w;
    public Bitmap x;
    public ImageReceiver y;
    public boolean z;

    static {
        int i10 = Build.VERSION.SDK_INT;
        e0 = i10 < 28;
        f0 = i10 >= 29;
    }

    public lc0() {
        this.a = new int[]{-12423849, -531317, -7888252, -133430};
        this.e = new wr(0.33d, 0.0d, 0.0d, 1.0d);
        this.h = 1.0f;
        this.j = new RectF();
        this.m = new Bitmap[3];
        this.n = new Paint(2);
        this.o = new Paint(2);
        this.p = new Paint();
        this.q = 100;
        this.C = new GradientDrawable();
        this.G = new kc0(this, 0);
        this.J = 1.0f;
        this.K = 1.0f;
        this.L = 255;
        this.M = 1.0f;
        this.O = 60;
        this.P = 80;
        this.S = -1;
        this.U = -16777216;
        this.V = new fh.a();
        this.W = new fh.a();
        this.b0 = new fh.a();
        h();
    }

    public static int g(int i10, int i11, int i12, int i13) {
        boolean j3 = j(i10, i11, i12, i13);
        boolean z10 = f0;
        if (j3) {
            if (z10) {
                return -1;
            }
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        if (z10) {
            return -16777216;
        }
        int averageColor = AndroidUtilities.getAverageColor(i12, AndroidUtilities.getAverageColor(i10, i11));
        if (i13 != 0) {
            averageColor = AndroidUtilities.getAverageColor(i13, averageColor);
        }
        return (AndroidUtilities.getPatternColor(averageColor, true) & 16777215) | 1677721600;
    }

    public static boolean j(int i10, int i11, int i12, int i13) {
        int averageColor = AndroidUtilities.getAverageColor(i10, i11);
        if (i12 != 0) {
            averageColor = AndroidUtilities.getAverageColor(averageColor, i12);
        }
        if (i13 != 0) {
            averageColor = AndroidUtilities.getAverageColor(averageColor, i13);
        }
        return AndroidUtilities.RGBtoHSB(Color.red(averageColor), Color.green(averageColor), Color.blue(averageColor))[2] < 0.3f;
    }

    public final void a(Canvas canvas, int i10, float f7, float f10, float f11, float f12) {
        List list = this.R;
        if (list == null || this.y == null || i10 < 0 || i10 >= list.size()) {
            return;
        }
        cg.c cVar = (cg.c) this.R.get(i10);
        canvas.save();
        canvas.translate(f7, f10);
        canvas.scale(f11, f12);
        canvas.concat(cVar.b);
        this.y.setImageCoords(cVar.a);
        this.y.draw(canvas);
        canvas.restore();
    }

    public final void b(Canvas canvas, RectF rectF, int i10) {
        if (this.R == null || this.u == null) {
            return;
        }
        a(canvas, i10, rectF.left, rectF.top, rectF.width() / this.u.getWidth(), rectF.height() / this.u.getHeight());
    }

    public final void c() {
        int i10 = -1;
        while (i10 < 3) {
            int i11 = i10 + 1;
            Utilities.generateGradient(i10 < 0 ? this.l : this.m[i10], this.i, i11 / 3.0f, this.a);
            i10 = i11;
        }
    }

    public final Bitmap d() {
        return this.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        Bitmap e = e();
        float f7 = e != null ? bounds.top : this.f;
        int width = this.k.getWidth();
        int height = this.k.getHeight();
        float width2 = bounds.width();
        float height2 = bounds.height();
        float f10 = width;
        float f11 = height;
        float max = Math.max(width2 / f10, height2 / f11);
        float f12 = f10 * max;
        float f13 = f11 * max;
        float f14 = (width2 - f12) / 2.0f;
        float f15 = (height2 - f13) / 2.0f;
        if (this.g) {
            int i10 = bounds.left;
            f14 += i10;
            int i11 = bounds.top;
            f15 += i11;
            canvas.clipRect(i10, i11, bounds.right, bounds.bottom);
        }
        boolean z10 = (Build.VERSION.SDK_INT < 28 || this.Q == null || this.k == null || e == null) ? false : true;
        int i12 = this.q;
        float f16 = 1.0f;
        Paint paint = this.n;
        Paint paint2 = this.o;
        RectF rectF = this.j;
        if (i12 < 0) {
            boolean z11 = e0;
            if (!z10 && (!z11 || e == null)) {
                canvas.drawColor(i0.a.k(-16777216, (int) (this.L * this.K)));
            }
            if (e != null) {
                if (z11) {
                    int i13 = (((int) (this.L * this.J)) * (-this.q)) / 100;
                    if (this.u != null) {
                        Bitmap e7 = e();
                        fh.a aVar = this.b0;
                        if (aVar.a(e7) || this.c0 == null || this.d0 != i13) {
                            int width3 = this.u.getWidth();
                            int height3 = this.u.getHeight();
                            this.d0 = i13;
                            Bitmap bitmap = this.c0;
                            if (bitmap == null || bitmap.getWidth() != width3 || this.c0.getHeight() != height3) {
                                this.c0 = Bitmap.createBitmap(width3, height3, Bitmap.Config.ARGB_8888);
                            }
                            Utilities.applyAlphaInvert(e7, this.c0, i13);
                        }
                        aVar.b(e7);
                    }
                    float width4 = e.getWidth();
                    float height4 = e.getHeight();
                    float max2 = Math.max(width2 / width4, height2 / height4);
                    float f17 = width4 * max2;
                    float f18 = height4 * max2;
                    float f19 = (width2 - f17) / 2.0f;
                    float f20 = (height2 - f18) / 2.0f;
                    rectF.set(f19, f20, f17 + f19, f18 + f20);
                    if (this.c0 != null) {
                        canvas.drawBitmap(this.k, (Rect) null, rectF, paint);
                        canvas.drawBitmap(this.c0, (Rect) null, rectF, paint);
                    } else {
                        canvas.drawColor(i0.a.k(-16777216, (int) (this.L * this.K)));
                    }
                    b(canvas, rectF, this.S);
                } else {
                    if (this.A == null) {
                        this.A = new Matrix();
                    }
                    this.A.reset();
                    this.A.setTranslate(f14, f15 + f7);
                    float min = 1.0f / Math.min(this.k.getWidth() / bounds.width(), this.k.getHeight() / bounds.height());
                    this.A.preScale(min, min);
                    this.v.setLocalMatrix(this.A);
                    this.A.reset();
                    float width5 = e.getWidth();
                    float height5 = e.getHeight();
                    float max3 = Math.max(width2 / width5, height2 / height5);
                    float f21 = (width2 - (width5 * max3)) / 2.0f;
                    float f22 = ((height2 - (height5 * max3)) / 2.0f) + f7;
                    this.A.setTranslate((int) f21, (int) f22);
                    if (!this.z || max3 > 1.4f || max3 < 0.8f) {
                        this.A.preScale(max3, max3);
                        f16 = max3;
                    }
                    this.w.setLocalMatrix(this.A);
                    paint2.setColorFilter(null);
                    paint2.setAlpha((int) ((Math.abs(this.q) / 100.0f) * this.L * this.J));
                    rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
                    if (z10) {
                        Paint e10 = this.Q.e(this.k, e, this.U, (int) (this.L * this.J), this.q, canvas.isHardwareAccelerated());
                        this.Q.d(this.A);
                        this.Q.c(rectF);
                        float f23 = this.I;
                        canvas.drawRoundRect(rectF, f23, f23, e10);
                    } else {
                        float f24 = this.I;
                        canvas.drawRoundRect(rectF, f24, f24, paint2);
                    }
                    a(canvas, this.S, f21, f22, f16, f16);
                }
            }
        } else {
            boolean z12 = z10;
            if (this.I != 0) {
                this.A.reset();
                this.A.setTranslate(f14, f15);
                float min2 = 1.0f / Math.min(this.k.getWidth() / bounds.width(), this.k.getHeight() / bounds.height());
                this.A.preScale(min2, min2);
                this.v.setLocalMatrix(this.A);
                rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
                if (!z12) {
                    float f25 = this.I;
                    canvas.drawRoundRect(rectF, f25, f25, paint);
                }
            } else {
                canvas.translate(0.0f, f7);
                GradientDrawable gradientDrawable = this.C;
                if (gradientDrawable != null) {
                    gradientDrawable.setBounds((int) f14, (int) f15, (int) (f14 + f12), (int) (f15 + f13));
                    this.C.setAlpha((int) (this.K * 255.0f));
                    this.C.draw(canvas);
                } else {
                    rectF.set(f14, f15, f12 + f14, f13 + f15);
                    int alpha = paint.getAlpha();
                    paint.setAlpha((int) (alpha * this.K));
                    if (!z12) {
                        canvas.drawBitmap(this.k, (Rect) null, rectF, paint);
                    }
                    paint.setAlpha(alpha);
                }
            }
            if (e != null) {
                float width6 = e.getWidth();
                float height6 = e.getHeight();
                float max4 = Math.max(width2 / width6, height2 / height6);
                float f26 = width6 * max4;
                float f27 = height6 * max4;
                float f28 = (width2 - f26) / 2.0f;
                float f29 = (height2 - f27) / 2.0f;
                rectF.set(f28, f29, f26 + f28, f27 + f29);
                paint2.setColorFilter(this.H);
                paint2.setAlpha((int) ((Math.abs(this.q) / 100.0f) * this.L * this.J));
                if (z12) {
                    Paint e11 = this.Q.e(this.k, e, this.U, (int) (this.L * this.J), this.q, canvas.isHardwareAccelerated());
                    qc0 qc0Var = this.Q;
                    RectF rectF2 = qc0Var.j;
                    rectF2.set(0.0f, 0.0f, qc0Var.g, qc0Var.h);
                    Matrix matrix = qc0Var.i;
                    matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.FILL);
                    qc0Var.d(matrix);
                    this.Q.c(rectF);
                    canvas.drawRect(rectF, e11);
                } else {
                    canvas.drawBitmap(e, (Rect) null, rectF, paint2);
                }
                paint2.setAlpha((int) ((Math.abs(this.q) / 100.0f) * this.L * this.J * 0.8f));
                b(canvas, rectF, this.S);
            }
        }
        canvas.restore();
        z();
    }

    public final Bitmap e() {
        Bitmap bitmap = this.u;
        if (bitmap == null) {
            return null;
        }
        if (this.x == null) {
            return bitmap;
        }
        fh.a aVar = this.V;
        boolean a2 = aVar.a(bitmap);
        Bitmap bitmap2 = this.x;
        fh.a aVar2 = this.W;
        boolean a10 = aVar2.a(bitmap2);
        boolean z10 = true;
        boolean z11 = this.a0 != this.S;
        if (!a2 && !a10 && !z11) {
            z10 = false;
        }
        Bitmap bitmap3 = this.X;
        if (bitmap3 != null && !z10) {
            return bitmap3;
        }
        int width = this.u.getWidth();
        int height = this.u.getHeight();
        Bitmap bitmap4 = this.X;
        if (bitmap4 == null || bitmap4.getWidth() != width || this.X.getHeight() != height) {
            this.X = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            this.Y = new Canvas(this.X);
        }
        Bitmap.Config config = this.u.getConfig();
        if (config == Bitmap.Config.ARGB_8888) {
            Utilities.copyBitmaps(this.u, this.X);
        } else if (config == Bitmap.Config.ALPHA_8) {
            Utilities.expandAlphaToBlack(this.u, this.X);
        }
        if (this.Z == null) {
            Paint paint = new Paint(3);
            this.Z = paint;
            paint.setAlpha(204);
        }
        Canvas canvas = this.Y;
        Paint paint2 = this.Z;
        int i10 = this.S;
        if (this.x != null && this.R != null) {
            for (int i11 = 0; i11 < this.R.size(); i11++) {
                if (i11 != i10) {
                    cg.c cVar = (cg.c) this.R.get(i11);
                    canvas.save();
                    canvas.concat(cVar.b);
                    canvas.drawBitmap(this.x, (Rect) null, cVar.a, paint2);
                    canvas.restore();
                }
            }
        }
        this.a0 = this.S;
        aVar.b(this.u);
        aVar2.b(this.x);
        return this.X;
    }

    public final int f() {
        int[] iArr = this.a;
        return g(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Bitmap bitmap = this.u;
        return bitmap != null ? bitmap.getHeight() : super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Bitmap bitmap = this.u;
        return bitmap != null ? bitmap.getWidth() : super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        BlendMode blendMode;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int i10 = this.O;
        int i11 = this.P;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, config);
        this.k = createBitmap;
        createBitmap.setHasAlpha(false);
        for (int i12 = 0; i12 < 3; i12++) {
            Bitmap createBitmap2 = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            this.m[i12] = createBitmap2;
            createBitmap2.setHasAlpha(false);
        }
        this.r = new Canvas(this.k);
        Bitmap createBitmap3 = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        this.l = createBitmap3;
        createBitmap3.setHasAlpha(false);
        this.s = new Canvas(this.l);
        Utilities.generateGradient(this.k, this.i, this.e.getInterpolation(this.h), this.a);
        if (f0) {
            Paint paint = this.o;
            blendMode = BlendMode.SOFT_LIGHT;
            paint.setBlendMode(blendMode);
        }
    }

    public final void i() {
        invalidateSelf();
        WeakReference weakReference = this.c;
        if (weakReference != null && weakReference.get() != null) {
            ((View) this.c.get()).invalidate();
        }
        if (this.t) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.invalidateMotionBackground, new Object[0]);
            z();
            Runnable runnable = this.G;
            AndroidUtilities.cancelRunOnUIThread(runnable);
            AndroidUtilities.runOnUIThread(runnable, 16L);
        }
    }

    public final void k() {
        this.T = true;
        ImageReceiver imageReceiver = this.y;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
    }

    public final void l() {
        this.T = false;
        ImageReceiver imageReceiver = this.y;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }

    public final void m(boolean z10) {
        if (this.h < 1.0f) {
            return;
        }
        this.F = true;
        this.h = 0.0f;
        this.E = z10;
        i();
    }

    public final void n(int i10, int i11, int i12, int i13) {
        o(i10, i11, i12, i13, 0, true);
    }

    public final void o(int i10, int i11, int i12, int i13, int i14, boolean z10) {
        if (this.g && i12 == 0 && i13 == 0) {
            this.C = new GradientDrawable(v9.d(i14), new int[]{i10, i11});
        } else {
            this.C = null;
        }
        int[] iArr = this.a;
        if (iArr[0] == i10 && iArr[1] == i11 && iArr[2] == i12 && iArr[3] == i13) {
            return;
        }
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = i12;
        iArr[3] = i13;
        Bitmap bitmap = this.k;
        if (bitmap != null) {
            Utilities.generateGradient(bitmap, this.i, this.e.getInterpolation(this.h), iArr);
            if (z10) {
                i();
            }
        }
    }

    public final void p() {
        if (Build.VERSION.SDK_INT < 28 || this.Q != null || SharedConfig.fastWallpaperDisabled) {
            return;
        }
        this.Q = new qc0();
    }

    public final void q(boolean z10) {
        if (!z10 && this.N) {
            this.h = 1.0f - ((this.h - (((int) (r0 / 0.125f)) * 0.125f)) / 0.125f);
            this.d = true;
        }
        this.N = z10;
    }

    public final void r(View view) {
        this.c = new WeakReference(view);
        ImageReceiver imageReceiver = this.y;
        if (imageReceiver != null) {
            imageReceiver.setParentView(view);
        }
    }

    public final void s(float f7) {
        this.J = f7;
        i();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.L = i10;
        this.n.setAlpha(i10);
        this.o.setAlpha(i10);
    }

    public final void t(Bitmap bitmap, int i10) {
        this.q = i10;
        this.u = bitmap;
        if (bitmap == null) {
            return;
        }
        boolean z10 = f0;
        Paint paint = this.o;
        if (z10) {
            if (i10 >= 0) {
                paint.setBlendMode(BlendMode.SOFT_LIGHT);
            } else {
                paint.setBlendMode(null);
            }
        }
        boolean z11 = e0;
        if (i10 >= 0) {
            if (z11) {
                paint.setXfermode(null);
            }
        } else {
            if (z11) {
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                return;
            }
            Bitmap bitmap2 = this.k;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.v = new BitmapShader(bitmap2, tileMode, tileMode);
            Bitmap bitmap3 = this.u;
            Shader.TileMode tileMode2 = Shader.TileMode.REPEAT;
            this.w = new BitmapShader(bitmap3, tileMode2, tileMode2);
            this.z = true;
            paint.setShader(new ComposeShader(this.v, this.w, PorterDuff.Mode.DST_IN));
            paint.setFilterBitmap(true);
            this.A = new Matrix();
        }
    }

    public final void u(int i10) {
        this.U = i10;
        this.H = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        i();
    }

    public final void v(int i10) {
        this.i = i10;
        if (i10 < 0) {
            this.i = 0;
        } else if (i10 > 7) {
            this.i = 7;
        }
        Utilities.generateGradient(this.k, this.i, this.e.getInterpolation(this.h), this.a);
    }

    public final void w(int i10) {
        this.I = i10;
        this.A = new Matrix();
        Bitmap bitmap = this.k;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.v = bitmapShader;
        this.n.setShader(bitmapShader);
        i();
    }

    public final void x(boolean z10) {
        if (this.h < 1.0f || !LiteMode.isEnabled(32)) {
            i();
            return;
        }
        this.F = false;
        this.E = false;
        this.B = z10;
        this.h = 0.0f;
        int i10 = this.i - 1;
        this.i = i10;
        if (i10 < 0) {
            this.i = 7;
        }
        i();
        this.s.drawBitmap(this.k, 0.0f, 0.0f, (Paint) null);
        c();
    }

    public final void y() {
        if (this.h < 1.0f) {
            return;
        }
        this.F = false;
        this.B = true;
        this.E = true;
        this.h = 0.0f;
        i();
        Utilities.generateGradient(this.l, this.i, 0.0f, this.a);
        c();
    }

    public final void z() {
        float interpolation;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.b;
        if (j3 > 20) {
            j3 = 17;
        }
        this.b = elapsedRealtime;
        if (j3 <= 1) {
            return;
        }
        boolean z10 = this.N;
        if (z10 && this.h == 1.0f) {
            this.h = 0.0f;
        }
        float f7 = this.h;
        if (f7 < 1.0f) {
            boolean z11 = true;
            boolean z12 = this.t || this.F;
            if (z10) {
                float f10 = ((j3 / 12000.0f) * this.M) + f7;
                this.h = f10;
                if (f10 >= 1.0f) {
                    this.h = 0.0f;
                }
                float f11 = this.h;
                int i10 = (int) (f11 / 0.125f);
                this.i = i10;
                interpolation = 1.0f - ((f11 - (i10 * 0.125f)) / 0.125f);
            } else {
                boolean z13 = this.F;
                wr wrVar = this.e;
                if (z13) {
                    float interpolation2 = wrVar.getInterpolation(f7);
                    char c10 = interpolation2 <= 0.25f ? (char) 0 : interpolation2 <= 0.5f ? (char) 1 : interpolation2 <= 0.75f ? (char) 2 : (char) 3;
                    GenericProvider genericProvider = this.D;
                    if (genericProvider != null) {
                        this.h = ((Float) genericProvider.provide(this)).floatValue();
                    } else {
                        this.h = (j3 / (this.E ? 1000.0f : 2000.0f)) + this.h;
                    }
                    if (this.h > 1.0f) {
                        this.h = 1.0f;
                    }
                    float interpolation3 = (this.D != null || this.d) ? this.h : wrVar.getInterpolation(this.h);
                    if (this.d && (interpolation3 == 0.0f || interpolation3 == 1.0f)) {
                        this.d = false;
                    }
                    if ((c10 == 0 && interpolation3 > 0.25f) || ((c10 == 1 && interpolation3 > 0.5f) || (c10 == 2 && interpolation3 > 0.75f))) {
                        if (this.E) {
                            int i11 = this.i + 1;
                            this.i = i11;
                            if (i11 > 7) {
                                this.i = 0;
                            }
                        } else {
                            int i12 = this.i - 1;
                            this.i = i12;
                            if (i12 < 0) {
                                this.i = 7;
                            }
                        }
                    }
                    if (interpolation3 > 0.25f) {
                        interpolation3 = interpolation3 <= 0.5f ? interpolation3 - 0.25f : interpolation3 <= 0.75f ? interpolation3 - 0.5f : interpolation3 - 0.75f;
                    }
                    float f12 = interpolation3 / 0.25f;
                    if (this.E) {
                        interpolation = 1.0f - f12;
                        if (this.h >= 1.0f) {
                            int i13 = this.i + 1;
                            this.i = i13;
                            if (i13 > 7) {
                                this.i = 0;
                            }
                            interpolation = 1.0f;
                        }
                    } else {
                        interpolation = f12;
                    }
                } else {
                    GenericProvider genericProvider2 = this.D;
                    if (genericProvider2 != null) {
                        this.h = ((Float) genericProvider2.provide(this)).floatValue();
                    } else {
                        this.h = (j3 / (this.B ? 300.0f : 500.0f)) + f7;
                    }
                    if (this.h > 1.0f) {
                        this.h = 1.0f;
                    }
                    interpolation = (this.D != null || this.d) ? this.h : wrVar.getInterpolation(this.h);
                    if (this.d && (interpolation == 0.0f || interpolation == 1.0f)) {
                        this.d = false;
                    }
                    if (this.E) {
                        interpolation = 1.0f - interpolation;
                        if (this.h >= 1.0f) {
                            int i14 = this.i + 1;
                            this.i = i14;
                            if (i14 > 7) {
                                this.i = 0;
                            }
                            z11 = z12;
                            interpolation = 1.0f;
                        }
                    }
                }
                z11 = z12;
            }
            if (z11) {
                Utilities.generateGradient(this.k, this.i, interpolation, this.a);
            } else {
                Paint paint = this.p;
                Bitmap[] bitmapArr = this.m;
                if (interpolation != 1.0f) {
                    int i15 = (int) (interpolation / 0.33333334f);
                    if (i15 == 0) {
                        this.r.drawBitmap(this.l, 0.0f, 0.0f, (Paint) null);
                    } else {
                        this.r.drawBitmap(bitmapArr[i15 - 1], 0.0f, 0.0f, (Paint) null);
                    }
                    paint.setAlpha((int) (((interpolation - (i15 * 0.33333334f)) / 0.33333334f) * 255.0f));
                    this.r.drawBitmap(bitmapArr[i15], 0.0f, 0.0f, paint);
                } else {
                    this.r.drawBitmap(bitmapArr[2], 0.0f, 0.0f, paint);
                }
            }
            i();
        }
    }

    public lc0(boolean z10, int i10, int i11, int i12, int i13) {
        this(i10, i11, i12, i13, z10, 0, false);
    }

    public lc0(int i10, int i11, int i12, int i13, boolean z10, int i14, boolean z11) {
        this.a = new int[]{-12423849, -531317, -7888252, -133430};
        this.e = new wr(0.33d, 0.0d, 0.0d, 1.0d);
        this.h = 1.0f;
        this.j = new RectF();
        this.m = new Bitmap[3];
        this.n = new Paint(2);
        this.o = new Paint(2);
        this.p = new Paint();
        this.q = 100;
        this.C = new GradientDrawable();
        this.G = new kc0(this, 0);
        this.J = 1.0f;
        this.K = 1.0f;
        this.L = 255;
        this.M = 1.0f;
        this.O = 60;
        this.P = 80;
        this.S = -1;
        this.U = -16777216;
        this.V = new fh.a();
        this.W = new fh.a();
        this.b0 = new fh.a();
        if (z11) {
            this.O = 80;
            this.P = 80;
        }
        this.g = z10;
        o(i10, i11, i12, i13, i14, false);
        h();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
