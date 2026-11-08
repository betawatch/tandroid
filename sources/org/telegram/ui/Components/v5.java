package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Looper;
import android.view.View;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class v5 extends BitmapDrawable implements Animatable, bg.g {
    public static final float[] V0 = new float[8];
    public static final ScheduledThreadPoolExecutor W0 = new ScheduledThreadPoolExecutor(8, new ThreadPoolExecutor.DiscardPolicy());
    public static final PorterDuffXfermode X0 = new PorterDuffXfermode(PorterDuff.Mode.SRC);
    public b7.l A0;
    public final t5 B0;
    public boolean C0;
    public boolean D;
    public t5 D0;
    public boolean E;
    public final t5 E0;
    public boolean F;
    public final t5 F0;
    public final File G;
    public int G0;
    public final long H;
    public final t5 H0;
    public final int I;
    public final t5 I0;
    public final int J;
    public t5 J0;
    public boolean K;
    public boolean K0;
    public volatile long L;
    public long L0;
    public volatile long M;
    public Bitmap M0;
    public boolean N;
    public AnimatedFileNative N0;
    public int O;
    public int O0;
    public boolean P;
    public int P0;
    public final Object Q;
    public int Q0;
    public boolean R;
    public volatile boolean R0;
    public final RectF S;
    public final u5 S0;
    public final int[] T;
    public boolean T0;
    public int[] U;
    public boolean U0;
    public final Matrix[] V;
    public final Path[] W;
    public float X;
    public float Y;
    public boolean Z;
    public boolean a;
    public final RectF a0;
    public boolean b;
    public volatile boolean b0;
    public int c;
    public volatile boolean c0;
    public final int[] d;
    public volatile AnimatedFileNative d0;
    public t5 e;
    public boolean e0;
    public boolean f;
    public org.telegram.messenger.q5 f0;
    public float g0;
    public final ArrayList h;
    public float h0;
    public int i0;
    public int j0;
    public final boolean k0;
    public final boolean l0;
    public float m0;
    public s5 n;
    public boolean n0;
    public final TLRPC.Document o0;
    public final RectF[] p0;
    public final Paint[] q0;
    public s5 r;
    public WeakReference r0;
    public s5 s;
    public final xe.b s0;
    public final xe.b t0;
    public AnimatedFileDrawableStream u0;
    public boolean v0;
    public s5 w;
    public boolean w0;
    public boolean x;
    public boolean x0;
    public boolean y;
    public int y0;
    public final bg.i z0;

    public v5(File file, boolean z9, long j3, int i7, TLRPC.Document document, org.telegram.messenger.hc hcVar, Object obj, long j10, int i10, boolean z10) {
        this(file, z9, j3, i7, document, hcVar, obj, j10, i10, z10, 0, 0, null, document != null ? 1 : 0, true);
    }

    public final void A(boolean z9) {
        this.x0 = z9;
        if (z9) {
            this.b = false;
        }
    }

    public final void B(int[] iArr) {
        boolean isEmpty = this.s0.isEmpty();
        int[] iArr2 = this.T;
        if (!isEmpty) {
            if (this.U == null) {
                this.U = new int[4];
            }
            int[] iArr3 = this.U;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr3.length);
        }
        for (int i7 = 0; i7 < 4; i7++) {
            if (!this.w0 && iArr[i7] != iArr2[i7]) {
                this.w0 = true;
            }
            iArr2[i7] = iArr[i7];
        }
    }

    public final void C(long j3, long j10) {
        this.g0 = j3 / 1000.0f;
        this.h0 = j10 / 1000.0f;
        if (j3 < 0 || o() >= j3) {
            return;
        }
        y(j3, true, false);
    }

    public final void D(long j3) {
        int i7 = 0;
        this.Q0 = 0;
        if (this.R0) {
            this.R0 = false;
            t5 t5Var = new t5(this, i7);
            Typeface typeface = org.telegram.messenger.g0.a;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                org.telegram.messenger.g0.h3(t5Var);
            } else {
                t5Var.run();
            }
        }
        boolean z9 = this.T0 || (!this.b0 && this.D);
        if (!this.b0) {
            if (this.b0 || !this.D || !z9 || this.r == null) {
                return;
            }
            s5 s5Var = this.n;
            if (s5Var != null) {
                this.h.add(s5Var);
            }
            this.n = this.r;
            this.r = this.s;
            this.s = null;
            this.T0 = false;
            x(false);
            return;
        }
        s5 s5Var2 = this.n;
        if (s5Var2 == null && this.r == null) {
            x(false);
            return;
        }
        if (this.r != null) {
            if (s5Var2 == null || (z9 && !this.a && this.M < 0)) {
                s5 s5Var3 = this.n;
                if (s5Var3 != null) {
                    this.h.add(s5Var3);
                }
                this.n = this.r;
                this.r = this.s;
                this.s = null;
                this.T0 = false;
                x(false);
            }
        }
    }

    public final void E() {
        int i7;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        if (this.n0 || (i7 = this.i0) <= 0 || (i10 = this.j0) <= 0 || (i11 = (iArr = this.d)[0]) <= 0 || (i12 = iArr[1]) <= 0) {
            this.m0 = 1.0f;
            return;
        }
        float max = Math.max(i10 / i11, i7 / i12);
        this.m0 = max;
        if (max <= 0.0f || max > 0.7d) {
            this.m0 = 1.0f;
        }
    }

    @Override // bg.g
    public final int a(Bitmap bitmap) {
        int i7;
        if (this.N0 == null) {
            return -1;
        }
        Canvas canvas = new Canvas(bitmap);
        Bitmap bitmap2 = this.M0;
        int[] iArr = this.d;
        if (bitmap2 == null) {
            this.M0 = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        }
        this.N0.c(this.M0, false, this.g0, this.h0, this.k0);
        long j3 = this.L0;
        if (j3 != 0 && ((i7 = iArr[3]) == 0 || j3 > i7)) {
            return 0;
        }
        int i10 = this.P0;
        int i11 = iArr[3];
        if (i10 == i11) {
            int i12 = this.O0 + 1;
            this.O0 = i12;
            if (i12 > 5) {
                return 0;
            }
        }
        this.P0 = i11;
        bitmap.eraseColor(0);
        canvas.save();
        float width = this.j0 / this.M0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.M0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        this.L0 = iArr[3];
        return 1;
    }

    @Override // bg.g
    public final void b() {
        this.N0 = AnimatedFileNative.a(this.G.getAbsolutePath(), this.d, this.J, this.H, this.u0, false);
    }

    @Override // bg.g
    public final void c() {
        AnimatedFileNative animatedFileNative = this.N0;
        if (animatedFileNative != null) {
            animatedFileNative.f();
            this.N0 = null;
        }
    }

    public final void d() {
        int i7;
        if (this.j0 == 0 && this.i0 == 0) {
            int[] iArr = this.d;
            int i10 = iArr[0];
            if (i10 > 3000 || (i7 = iArr[1]) > 3000) {
                this.j0 = i10 / 4;
                this.i0 = iArr[1] / 4;
            } else if (i10 > 2200 || i7 > 2200) {
                this.j0 = i10 / 2;
                this.i0 = i7 / 2;
            }
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        l(canvas, false, System.currentTimeMillis(), 0);
    }

    public final void e(ImageReceiver imageReceiver) {
        if (imageReceiver != null && this.t0.add(imageReceiver) && this.b0) {
            x(false);
        }
        h();
    }

    public final void f(View view) {
        if (view != null) {
            this.s0.add(view);
        }
    }

    public final void finalize() {
        try {
            this.s0.clear();
            u();
        } finally {
            super.finalize();
        }
    }

    public final boolean g() {
        return this.l0 ? this.z0 != null : (this.d0 == null && this.y) ? false : true;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i7 = 0;
        if (this.y) {
            int[] iArr = this.d;
            int i10 = iArr[2];
            i7 = (i10 == 90 || i10 == 270) ? iArr[0] : iArr[1];
        }
        return i7 == 0 ? org.telegram.messenger.g0.L(100.0f) : (int) (i7 * this.m0);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i7 = 0;
        if (this.y) {
            int[] iArr = this.d;
            int i10 = iArr[2];
            i7 = (i10 == 90 || i10 == 270) ? iArr[1] : iArr[0];
        }
        return i7 == 0 ? org.telegram.messenger.g0.L(100.0f) : (int) (i7 * this.m0);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        int i7 = 0;
        if (this.y) {
            int[] iArr = this.d;
            int i10 = iArr[2];
            i7 = (i10 == 90 || i10 == 270) ? iArr[0] : iArr[1];
        }
        return i7 == 0 ? org.telegram.messenger.g0.L(100.0f) : i7;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        int i7 = 0;
        if (this.y) {
            int[] iArr = this.d;
            int i10 = iArr[2];
            i7 = (i10 == 90 || i10 == 270) ? iArr[1] : iArr[0];
        }
        return i7 == 0 ? org.telegram.messenger.g0.L(100.0f) : i7;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        t5 t5Var;
        if (this.z0 == null) {
            return;
        }
        boolean isEmpty = this.t0.isEmpty();
        if (isEmpty && this.J0 == null) {
            t5 t5Var2 = new t5(this, 3);
            this.J0 = t5Var2;
            org.telegram.messenger.g0.i3(t5Var2, 600L);
        } else {
            if (isEmpty || (t5Var = this.J0) == null) {
                return;
            }
            org.telegram.messenger.g0.r(t5Var);
            this.J0 = null;
        }
    }

    public final void i() {
        int i7;
        if (!this.b0 || this.R0 || this.f) {
            if (this.U0) {
                this.U0 = false;
                this.Q0 = 0;
                bg.k.d().g(this.S0);
                return;
            }
            return;
        }
        if (this.U0 || (i7 = this.d[5]) <= 0) {
            return;
        }
        this.U0 = true;
        this.Q0 = 0;
        bg.k.d().b(this.S0, i7);
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.b0;
    }

    public final void j() {
        xe.b bVar = this.t0;
        Iterator it = bVar.iterator();
        int i7 = 0;
        int i10 = 0;
        while (it.hasNext()) {
            ImageReceiver imageReceiver = (ImageReceiver) it.next();
            if (imageReceiver.x1) {
                i7++;
            } else {
                bVar.remove(imageReceiver);
            }
            int i11 = imageReceiver.C1;
            if (i11 > 0 && this.y0 >= i11) {
                i10++;
            }
        }
        if (i7 == i10) {
            stop();
        } else {
            start();
        }
    }

    public final void k() {
        if (g()) {
            return;
        }
        s5 s5Var = this.n;
        if (s5Var != null) {
            s5Var.b.recycle();
            Arrays.fill(s5Var.a, (Object) null);
            this.n = null;
        }
        s5 s5Var2 = this.w;
        if (s5Var2 != null) {
            s5Var2.b.recycle();
            Arrays.fill(s5Var2.a, (Object) null);
            this.w = null;
        }
        org.telegram.messenger.q5 q5Var = this.f0;
        if (q5Var != null) {
            q5Var.recycle();
            this.f0 = null;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 >= arrayList.size()) {
                arrayList.clear();
                t();
                return;
            } else {
                s5 s5Var3 = (s5) arrayList.get(i7);
                s5Var3.b.recycle();
                Arrays.fill(s5Var3.a, (Object) null);
                i7++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(Canvas canvas, boolean z9, long j3, int i7) {
        boolean z10;
        float width;
        float height;
        float[] fArr;
        int i10;
        if (!g() || this.x) {
            return;
        }
        long currentTimeMillis = j3 == 0 ? System.currentTimeMillis() : j3;
        RectF rectF = z9 ? this.p0[i7] : this.a0;
        Paint paint = z9 ? this.q0[i7] : getPaint();
        if (!z9) {
            D(currentTimeMillis);
        }
        if (this.n == null) {
            return;
        }
        int[] iArr = this.T;
        int length = iArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                z10 = false;
                break;
            } else {
                if (iArr[i11] != 0) {
                    z10 = true;
                    break;
                }
                i11++;
            }
        }
        if (!z9) {
            PorterDuffXfermode porterDuffXfermode = (!z10 && this.n.f && paint.getAlpha() == 255) ? X0 : null;
            if (paint.getXfermode() != porterDuffXfermode) {
                paint.setXfermode(porterDuffXfermode);
            }
        }
        float f10 = this.X;
        float f11 = this.Y;
        int[] iArr2 = this.d;
        if (!z9) {
            if (this.Z) {
                s5 s5Var = this.n;
                int i12 = s5Var.c;
                int i13 = s5Var.d;
                int i14 = iArr2[2];
                if (i14 == 90 || i14 == 270) {
                    i12 = i13;
                    i13 = i12;
                }
                rectF.set(getBounds());
                width = rectF.width() / i12;
                this.X = width;
                height = rectF.height() / i13;
                this.Y = height;
                this.Z = false;
            }
            if (z10) {
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                int i15 = iArr2[2];
                if (i15 == 90) {
                    canvas.rotate(90.0f);
                    canvas.translate(0.0f, -rectF.width());
                } else if (i15 == 180) {
                    canvas.rotate(180.0f);
                    canvas.translate(-rectF.width(), -rectF.height());
                } else if (i15 == 270) {
                    canvas.rotate(270.0f);
                    canvas.translate(-rectF.height(), 0.0f);
                }
                canvas.scale(f10, f11);
                canvas.drawBitmap(this.n.b, 0.0f, 0.0f, paint);
                canvas.restore();
                return;
            }
            int i16 = z9 ? i7 + 1 : 0;
            s5 s5Var2 = this.n;
            BitmapShader[] bitmapShaderArr = s5Var2.a;
            if (bitmapShaderArr[i16] == null) {
                Bitmap bitmap = s5Var2.b;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                bitmapShaderArr[i16] = new BitmapShader(bitmap, tileMode, tileMode);
            }
            BitmapShader bitmapShader = bitmapShaderArr[i16];
            paint.setShader(bitmapShader);
            Matrix[] matrixArr = this.V;
            Matrix matrix = matrixArr[i16];
            if (matrix == null) {
                matrix = new Matrix();
                matrixArr[i16] = matrix;
            }
            matrix.reset();
            matrix.setTranslate(rectF.left, rectF.top);
            int i17 = iArr2[2];
            if (i17 == 90) {
                matrix.preRotate(90.0f);
                matrix.preTranslate(0.0f, -rectF.width());
            } else if (i17 == 180) {
                matrix.preRotate(180.0f);
                matrix.preTranslate(-rectF.width(), -rectF.height());
            } else if (i17 == 270) {
                matrix.preRotate(270.0f);
                matrix.preTranslate(-rectF.height(), 0.0f);
            }
            matrix.preScale(f10, f11);
            bitmapShader.setLocalMatrix(matrix);
            Path[] pathArr = this.W;
            Path path = pathArr[i16];
            if (path == null) {
                path = new Path();
                pathArr[i16] = path;
            }
            boolean z11 = this.w0;
            RectF rectF2 = this.S;
            if (z11 || z9) {
                if (!z9) {
                    this.w0 = false;
                }
                int i18 = 0;
                while (true) {
                    int length2 = iArr.length;
                    fArr = V0;
                    if (i18 >= length2) {
                        break;
                    }
                    int i19 = i18 * 2;
                    float f12 = iArr[i18];
                    fArr[i19] = f12;
                    fArr[i19 + 1] = f12;
                    i18++;
                }
                path.rewind();
                path.addRoundRect(z9 ? rectF : rectF2, fArr, Path.Direction.CW);
            }
            int i20 = iArr[0];
            int i21 = iArr[1];
            if (i20 != i21 || i21 != (i10 = iArr[2]) || i10 != iArr[3]) {
                canvas.drawPath(path, paint);
                return;
            }
            if (!z9) {
                rectF = rectF2;
            }
            float f13 = i20;
            canvas.drawRoundRect(rectF, f13, f13, paint);
            return;
        }
        s5 s5Var3 = this.n;
        int i22 = s5Var3.c;
        int i23 = s5Var3.d;
        int i24 = iArr2[2];
        if (i24 == 90 || i24 == 270) {
            i22 = i23;
            i23 = i22;
        }
        width = rectF.width() / i22;
        height = rectF.height() / i23;
        float f14 = width;
        f11 = height;
        f10 = f14;
        if (z10) {
        }
    }

    public final Bitmap m() {
        s5 s5Var = this.n;
        if (s5Var != null) {
            return s5Var.b;
        }
        s5 s5Var2 = this.r;
        if (s5Var2 != null) {
            return s5Var2.b;
        }
        s5 s5Var3 = this.s;
        if (s5Var3 != null) {
            return s5Var3.b;
        }
        return null;
    }

    public final float n() {
        if (this.d[4] == 0) {
            return 0.0f;
        }
        if (this.M >= 0) {
            return this.M / this.d[4];
        }
        int[] iArr = this.d;
        return iArr[3] / iArr[4];
    }

    public final int o() {
        int i7;
        if (this.M >= 0) {
            return (int) this.M;
        }
        s5 s5Var = this.r;
        if (s5Var != null && (i7 = s5Var.e) != 0) {
            return i7;
        }
        s5 s5Var2 = this.n;
        if (s5Var2 != null) {
            return s5Var2.e;
        }
        return 0;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.Z = true;
    }

    public final Bitmap p() {
        int i7 = this.j0;
        int i10 = this.i0;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(i7, i10, config);
        Canvas canvas = new Canvas(createBitmap);
        AnimatedFileNative a10 = AnimatedFileNative.a(this.G.getAbsolutePath(), this.d, this.J, this.H, this.u0, false);
        if (a10 == null) {
            return createBitmap;
        }
        if (this.M0 == null) {
            int[] iArr = this.d;
            this.M0 = Bitmap.createBitmap(Math.max(1, iArr[0]), Math.max(1, iArr[1]), config);
        }
        a10.c(this.M0, false, this.g0, this.h0, true);
        a10.f();
        createBitmap.eraseColor(0);
        canvas.save();
        float width = this.j0 / this.M0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.M0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        return createBitmap;
    }

    public final Bitmap q(long j3, boolean z9) {
        if (this.y && this.d0 != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = this.u0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.b(false);
                this.u0.d();
            }
            if (!z9) {
                this.d0.g(j3, z9);
            }
            int[] iArr = this.d;
            Bitmap createBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
            if ((z9 ? this.d0.b(j3, createBitmap) : this.d0.c(createBitmap, true, 0.0f, 0.0f, true)) != 0) {
                return createBitmap;
            }
            createBitmap.recycle();
        }
        return null;
    }

    public final Bitmap r(boolean z9) {
        if (this.d0 == null) {
            s5 s5Var = this.w;
            if (s5Var != null) {
                return s5Var.b;
            }
            return null;
        }
        if (this.w == null) {
            if (this.h.isEmpty()) {
                float f10 = this.d[0];
                float f11 = this.m0;
                this.w = new s5(Bitmap.createBitmap((int) (f10 * f11), (int) (r0[1] * f11), Bitmap.Config.ARGB_8888));
            } else {
                this.w = (s5) this.h.remove(0);
            }
        }
        this.d0.c(this.w.b, false, this.g0, this.h0, z9);
        return this.w.b;
    }

    public final boolean s() {
        if (g()) {
            return (this.n == null && this.r == null) ? false : true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.b0 || this.t0.isEmpty()) {
            return;
        }
        this.b0 = true;
        this.R0 = false;
        x(false);
        org.telegram.messenger.g0.h3(this.I0);
        t5 t5Var = new t5(this, 0);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.g0.h3(t5Var);
        } else {
            t5Var.run();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.b0 = false;
        t5 t5Var = new t5(this, 0);
        Typeface typeface = org.telegram.messenger.g0.a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.g0.h3(t5Var);
        } else {
            t5Var.run();
        }
    }

    public final void t() {
        Iterator it = this.t0.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    public final void u() {
        if (!this.s0.isEmpty()) {
            this.K = true;
            return;
        }
        int i7 = 0;
        this.b0 = false;
        this.c0 = true;
        t5 t5Var = new t5(this, i7);
        Typeface typeface = org.telegram.messenger.g0.a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.g0.h3(t5Var);
        } else {
            t5Var.run();
        }
        if (this.D0 != null) {
            bg.i.c();
            zg0.T0.cancelRunnable(this.D0);
            this.D0 = null;
        }
        if (this.e == null) {
            if (this.d0 != null) {
                this.d0.f();
                this.d0 = null;
            }
            ArrayList arrayList = new ArrayList();
            s5 s5Var = this.n;
            if (s5Var != null) {
                arrayList.add(s5Var.b);
            }
            s5 s5Var2 = this.r;
            if (s5Var2 != null) {
                arrayList.add(s5Var2.b);
            }
            s5 s5Var3 = this.s;
            if (s5Var3 != null) {
                arrayList.add(s5Var3.b);
            }
            s5 s5Var4 = this.w;
            if (s5Var4 != null) {
                arrayList.add(s5Var4.b);
            }
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                s5 s5Var5 = (s5) obj;
                if (s5Var5 != null) {
                    arrayList.add(s5Var5.b);
                }
            }
            this.h.clear();
            this.n = null;
            this.r = null;
            this.s = null;
            this.w = null;
            org.telegram.messenger.q5 q5Var = this.f0;
            if (q5Var != null) {
                q5Var.recycle();
                this.f0 = null;
            }
            getPaint().setShader(null);
            org.telegram.messenger.g0.A2(arrayList);
        } else {
            this.x = true;
        }
        AnimatedFileDrawableStream animatedFileDrawableStream = this.u0;
        if (animatedFileDrawableStream != null) {
            animatedFileDrawableStream.b(true);
            this.u0 = null;
        }
        t5 t5Var2 = new t5(this, 2);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.g0.h3(t5Var2);
        } else {
            t5Var2.run();
        }
    }

    public final void v(ImageReceiver imageReceiver) {
        xe.b bVar = this.t0;
        bVar.remove(imageReceiver);
        if (bVar.isEmpty()) {
            this.y0 = 0;
        }
        h();
    }

    public final void w(View view) {
        xe.b bVar = this.s0;
        bVar.remove(view);
        if (bVar.isEmpty()) {
            if (this.K) {
                u();
                return;
            }
            int[] iArr = this.U;
            if (iArr != null) {
                B(iArr);
            }
        }
    }

    public final void x(boolean z9) {
        t5 t5Var;
        t5 t5Var2;
        if (this.e == null || z9) {
            if ((!this.b || (this.s != null && (this.K0 || this.M < 0))) && this.r != null) {
                return;
            }
            if ((this.n == null || !this.f) && g() && !this.x) {
                if ((!this.b0 && (!this.D || this.E)) || this.t0.isEmpty() || this.C0) {
                    return;
                }
                if (!this.v0) {
                    if (this.f0 == null) {
                        this.f0 = new org.telegram.messenger.q5("decodeQueue" + this, true);
                    }
                    if (z9 && (t5Var = this.e) != null) {
                        this.f0.cancelRunnable(t5Var);
                    }
                    org.telegram.messenger.q5 q5Var = this.f0;
                    t5 t5Var3 = this.H0;
                    this.e = t5Var3;
                    q5Var.postRunnable(t5Var3, 0L);
                } else if (this.x0) {
                    t5 t5Var4 = this.H0;
                    this.e = t5Var4;
                    org.telegram.messenger.r5.a(t5Var4);
                } else {
                    if (z9 && (t5Var2 = this.e) != null) {
                        W0.remove(t5Var2);
                    }
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = W0;
                    t5 t5Var5 = this.H0;
                    this.e = t5Var5;
                    scheduledThreadPoolExecutor.execute(t5Var5);
                }
                this.K0 = true;
            }
        }
    }

    public final void y(long j3, boolean z9, boolean z10) {
        AnimatedFileDrawableStream animatedFileDrawableStream;
        synchronized (this.Q) {
            try {
                this.L = j3;
                this.M = j3;
                this.K0 = false;
                if (this.d0 != null) {
                    this.d0.e();
                }
                if (this.y && (animatedFileDrawableStream = this.u0) != null) {
                    animatedFileDrawableStream.b(z9);
                    this.N = z9;
                    this.O = z9 ? 0 : 10;
                }
                if (z10 && this.D) {
                    this.E = false;
                    if (this.e == null) {
                        x(true);
                    } else {
                        this.F = true;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void z(float f10, float f11, float f12, float f13) {
        float f14 = f13 + f11;
        float f15 = f12 + f10;
        RectF rectF = this.S;
        if (rectF.left == f10 && rectF.top == f11 && rectF.right == f15 && rectF.bottom == f14) {
            return;
        }
        rectF.set(f10, f11, f15, f14);
        this.w0 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v5(File file, boolean z9, long j3, int i7, TLRPC.Document document, org.telegram.messenger.hc hcVar, Object obj, long j10, int i10, boolean z10, int i11, int i12, bg.f fVar, int i13, boolean z11) {
        ?? r12;
        ?? r13;
        long j11;
        int[] iArr = new int[8];
        this.d = iArr;
        this.h = new ArrayList();
        this.L = -1L;
        this.M = -1L;
        this.Q = new Object();
        this.S = new RectF();
        this.T = new int[4];
        this.V = new Matrix[3];
        this.W = new Path[3];
        this.X = 1.0f;
        this.Y = 1.0f;
        this.a0 = new RectF();
        this.m0 = 1.0f;
        this.p0 = new RectF[2];
        this.q0 = new Paint[2];
        this.s0 = new xe.b(true, true);
        this.t0 = new xe.b(true, true);
        this.w0 = true;
        this.B0 = new t5(this, 4);
        this.E0 = new t5(this, 5);
        this.F0 = new t5(this, 6);
        this.G0 = 0;
        this.H0 = new t5(this, 7);
        this.I0 = new t5(this, 8);
        this.S0 = new u5(this, 0);
        this.G = file;
        this.b = org.telegram.messenger.iz.o() >= 1;
        this.H = j3;
        this.I = i7;
        this.J = i10;
        this.i0 = i12;
        this.j0 = i11;
        this.k0 = z11;
        boolean z12 = fVar != null && i11 > 0 && i12 > 0;
        this.l0 = z12;
        this.o0 = document;
        getPaint().setFlags(3);
        if (j3 == 0 || (document == null && hcVar == null)) {
            r12 = 1;
        } else {
            r12 = 1;
            this.u0 = new AnimatedFileDrawableStream(document, hcVar, obj, i10, z10, i7, i13);
        }
        bg.i iVar = null;
        if (!z9 || z12) {
            r13 = 0;
        } else {
            r13 = 0;
            this.d0 = AnimatedFileNative.a(file.getAbsolutePath(), iArr, i10, j3, this.u0, z10);
            this.e0 = (this.d0 != null || (this.n0 && this.G0 <= 15)) ? false : r12;
            if (this.d0 != null && (iArr[0] > 3840 || iArr[r12] > 3840)) {
                this.d0.f();
                this.d0 = null;
            }
            d();
            E();
            this.y = r12;
        }
        if (z12) {
            this.d0 = AnimatedFileNative.a(file.getAbsolutePath(), iArr, i10, j3, this.u0, z10);
            this.e0 = (this.d0 != null || (this.n0 && this.G0 <= 15)) ? r13 : r12;
            if (this.d0 == null || (iArr[r13] <= 3840 && iArr[r12] <= 3840)) {
                j11 = j10;
                iVar = new bg.i(file, this, fVar, this.j0, this.i0, !this.x0, 0);
                this.z0 = iVar;
                if (j11 == 0) {
                    y(j11, r13, r13);
                    return;
                }
                return;
            }
            this.d0.f();
            this.d0 = null;
        }
        j11 = j10;
        this.z0 = iVar;
        if (j11 == 0) {
        }
    }
}
