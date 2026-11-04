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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t5 extends BitmapDrawable implements Animatable, cg.f {
    public static final float[] W0 = new float[8];
    public static final ScheduledThreadPoolExecutor X0 = new ScheduledThreadPoolExecutor(8, new ThreadPoolExecutor.DiscardPolicy());
    public static final PorterDuffXfermode Y0 = new PorterDuffXfermode(PorterDuff.Mode.SRC);
    public final cg.h A0;
    public a7.l B0;
    public final r5 C0;
    public boolean D0;
    public boolean E;
    public r5 E0;
    public boolean F;
    public final r5 F0;
    public boolean G;
    public final r5 G0;
    public final File H;
    public int H0;
    public final long I;
    public final r5 I0;
    public final int J;
    public final r5 J0;
    public final int K;
    public r5 K0;
    public boolean L;
    public boolean L0;
    public volatile long M;
    public long M0;
    public volatile long N;
    public Bitmap N0;
    public boolean O;
    public AnimatedFileNative O0;
    public int P;
    public int P0;
    public boolean Q;
    public int Q0;
    public final Object R;
    public int R0;
    public boolean S;
    public volatile boolean S0;
    public final RectF T;
    public final s5 T0;
    public final int[] U;
    public boolean U0;
    public int[] V;
    public boolean V0;
    public final Matrix[] W;
    public final Path[] X;
    public float Y;
    public float Z;
    public boolean a;
    public boolean a0;
    public boolean b;
    public final RectF b0;
    public int c;
    public volatile boolean c0;
    public final int[] d;
    public volatile boolean d0;
    public r5 e;
    public volatile AnimatedFileNative e0;
    public boolean f;
    public boolean f0;
    public org.telegram.messenger.q5 g0;
    public final ArrayList h;
    public float h0;
    public float i0;
    public int j0;
    public int k0;
    public final boolean l0;
    public final boolean m0;
    public q5 n;
    public float n0;
    public boolean o0;
    public final TLRPC.Document p0;
    public final RectF[] q0;
    public q5 r;
    public final Paint[] r0;
    public q5 s;
    public WeakReference s0;
    public final ue.b t0;
    public final ue.b u0;
    public AnimatedFileDrawableStream v0;
    public q5 w;
    public boolean w0;
    public boolean x;
    public boolean x0;
    public boolean y;
    public boolean y0;
    public int z0;

    public t5(File file, boolean z10, long j10, int i3, TLRPC.Document document, org.telegram.messenger.ac acVar, Object obj, long j11, int i10, boolean z11) {
        this(file, z10, j10, i3, document, acVar, obj, j11, i10, z11, 0, 0, null, document != null ? 1 : 0, true);
    }

    public final void A(boolean z10) {
        this.y0 = z10;
        if (z10) {
            this.b = false;
        }
    }

    public final void B(int[] iArr) {
        boolean isEmpty = this.t0.isEmpty();
        int[] iArr2 = this.U;
        if (!isEmpty) {
            if (this.V == null) {
                this.V = new int[4];
            }
            int[] iArr3 = this.V;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr3.length);
        }
        for (int i3 = 0; i3 < 4; i3++) {
            if (!this.x0 && iArr[i3] != iArr2[i3]) {
                this.x0 = true;
            }
            iArr2[i3] = iArr[i3];
        }
    }

    public final void C(long j10, long j11) {
        this.h0 = j10 / 1000.0f;
        this.i0 = j11 / 1000.0f;
        if (j10 < 0 || o() >= j10) {
            return;
        }
        y(j10, true, false);
    }

    public final void D(long j10) {
        int i3 = 0;
        this.R0 = 0;
        if (this.S0) {
            this.S0 = false;
            r5 r5Var = new r5(this, i3);
            Typeface typeface = org.telegram.messenger.g0.a;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                org.telegram.messenger.g0.h3(r5Var);
            } else {
                r5Var.run();
            }
        }
        boolean z10 = this.U0 || (!this.c0 && this.E);
        if (!this.c0) {
            if (this.c0 || !this.E || !z10 || this.r == null) {
                return;
            }
            q5 q5Var = this.n;
            if (q5Var != null) {
                this.h.add(q5Var);
            }
            this.n = this.r;
            this.r = this.s;
            this.s = null;
            this.U0 = false;
            x(false);
            return;
        }
        q5 q5Var2 = this.n;
        if (q5Var2 == null && this.r == null) {
            x(false);
            return;
        }
        if (this.r != null) {
            if (q5Var2 == null || (z10 && !this.a && this.N < 0)) {
                q5 q5Var3 = this.n;
                if (q5Var3 != null) {
                    this.h.add(q5Var3);
                }
                this.n = this.r;
                this.r = this.s;
                this.s = null;
                this.U0 = false;
                x(false);
            }
        }
    }

    public final void E() {
        int i3;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        if (this.o0 || (i3 = this.j0) <= 0 || (i10 = this.k0) <= 0 || (i11 = (iArr = this.d)[0]) <= 0 || (i12 = iArr[1]) <= 0) {
            this.n0 = 1.0f;
            return;
        }
        float max = Math.max(i10 / i11, i3 / i12);
        this.n0 = max;
        if (max <= 0.0f || max > 0.7d) {
            this.n0 = 1.0f;
        }
    }

    @Override // cg.f
    public final int a(Bitmap bitmap) {
        int i3;
        if (this.O0 == null) {
            return -1;
        }
        Canvas canvas = new Canvas(bitmap);
        Bitmap bitmap2 = this.N0;
        int[] iArr = this.d;
        if (bitmap2 == null) {
            this.N0 = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        }
        this.O0.c(this.N0, false, this.h0, this.i0, this.l0);
        long j10 = this.M0;
        if (j10 != 0 && ((i3 = iArr[3]) == 0 || j10 > i3)) {
            return 0;
        }
        int i10 = this.Q0;
        int i11 = iArr[3];
        if (i10 == i11) {
            int i12 = this.P0 + 1;
            this.P0 = i12;
            if (i12 > 5) {
                return 0;
            }
        }
        this.Q0 = i11;
        bitmap.eraseColor(0);
        canvas.save();
        float width = this.k0 / this.N0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.N0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        this.M0 = iArr[3];
        return 1;
    }

    @Override // cg.f
    public final void b() {
        this.O0 = AnimatedFileNative.a(this.H.getAbsolutePath(), this.d, this.K, this.I, this.v0, false);
    }

    @Override // cg.f
    public final void c() {
        AnimatedFileNative animatedFileNative = this.O0;
        if (animatedFileNative != null) {
            animatedFileNative.f();
            this.O0 = null;
        }
    }

    public final void d() {
        int i3;
        if (this.k0 == 0 && this.j0 == 0) {
            int[] iArr = this.d;
            int i10 = iArr[0];
            if (i10 > 3000 || (i3 = iArr[1]) > 3000) {
                this.k0 = i10 / 4;
                this.j0 = iArr[1] / 4;
            } else if (i10 > 2200 || i3 > 2200) {
                this.k0 = i10 / 2;
                this.j0 = i3 / 2;
            }
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        l(canvas, false, System.currentTimeMillis(), 0);
    }

    public final void e(ImageReceiver imageReceiver) {
        if (imageReceiver != null && this.u0.add(imageReceiver) && this.c0) {
            x(false);
        }
        h();
    }

    public final void f(View view) {
        if (view != null) {
            this.t0.add(view);
        }
    }

    public final void finalize() {
        try {
            this.t0.clear();
            u();
        } finally {
            super.finalize();
        }
    }

    public final boolean g() {
        return this.m0 ? this.A0 != null : (this.e0 == null && this.y) ? false : true;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i3 = 0;
        if (this.y) {
            int[] iArr = this.d;
            int i10 = iArr[2];
            i3 = (i10 == 90 || i10 == 270) ? iArr[0] : iArr[1];
        }
        return i3 == 0 ? org.telegram.messenger.g0.L(100.0f) : (int) (i3 * this.n0);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i3 = 0;
        if (this.y) {
            int[] iArr = this.d;
            int i10 = iArr[2];
            i3 = (i10 == 90 || i10 == 270) ? iArr[1] : iArr[0];
        }
        return i3 == 0 ? org.telegram.messenger.g0.L(100.0f) : (int) (i3 * this.n0);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        int i3 = 0;
        if (this.y) {
            int[] iArr = this.d;
            int i10 = iArr[2];
            i3 = (i10 == 90 || i10 == 270) ? iArr[0] : iArr[1];
        }
        return i3 == 0 ? org.telegram.messenger.g0.L(100.0f) : i3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        int i3 = 0;
        if (this.y) {
            int[] iArr = this.d;
            int i10 = iArr[2];
            i3 = (i10 == 90 || i10 == 270) ? iArr[1] : iArr[0];
        }
        return i3 == 0 ? org.telegram.messenger.g0.L(100.0f) : i3;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        r5 r5Var;
        if (this.A0 == null) {
            return;
        }
        boolean isEmpty = this.u0.isEmpty();
        if (isEmpty && this.K0 == null) {
            r5 r5Var2 = new r5(this, 3);
            this.K0 = r5Var2;
            org.telegram.messenger.g0.i3(r5Var2, 600L);
        } else {
            if (isEmpty || (r5Var = this.K0) == null) {
                return;
            }
            org.telegram.messenger.g0.r(r5Var);
            this.K0 = null;
        }
    }

    public final void i() {
        int i3;
        if (!this.c0 || this.S0 || this.f) {
            if (this.V0) {
                this.V0 = false;
                this.R0 = 0;
                cg.j.d().g(this.T0);
                return;
            }
            return;
        }
        if (this.V0 || (i3 = this.d[5]) <= 0) {
            return;
        }
        this.V0 = true;
        this.R0 = 0;
        cg.j.d().b(this.T0, i3);
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.c0;
    }

    public final void j() {
        ue.b bVar = this.u0;
        Iterator it = bVar.iterator();
        int i3 = 0;
        int i10 = 0;
        while (it.hasNext()) {
            ImageReceiver imageReceiver = (ImageReceiver) it.next();
            if (imageReceiver.y1) {
                i3++;
            } else {
                bVar.remove(imageReceiver);
            }
            int i11 = imageReceiver.D1;
            if (i11 > 0 && this.z0 >= i11) {
                i10++;
            }
        }
        if (i3 == i10) {
            stop();
        } else {
            start();
        }
    }

    public final void k() {
        if (g()) {
            return;
        }
        q5 q5Var = this.n;
        if (q5Var != null) {
            q5Var.b.recycle();
            Arrays.fill(q5Var.a, (Object) null);
            this.n = null;
        }
        q5 q5Var2 = this.w;
        if (q5Var2 != null) {
            q5Var2.b.recycle();
            Arrays.fill(q5Var2.a, (Object) null);
            this.w = null;
        }
        org.telegram.messenger.q5 q5Var3 = this.g0;
        if (q5Var3 != null) {
            q5Var3.recycle();
            this.g0 = null;
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i3 >= arrayList.size()) {
                arrayList.clear();
                t();
                return;
            } else {
                q5 q5Var4 = (q5) arrayList.get(i3);
                q5Var4.b.recycle();
                Arrays.fill(q5Var4.a, (Object) null);
                i3++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(Canvas canvas, boolean z10, long j10, int i3) {
        boolean z11;
        float width;
        float height;
        float[] fArr;
        int i10;
        if (!g() || this.x) {
            return;
        }
        long currentTimeMillis = j10 == 0 ? System.currentTimeMillis() : j10;
        RectF rectF = z10 ? this.q0[i3] : this.b0;
        Paint paint = z10 ? this.r0[i3] : getPaint();
        if (!z10) {
            D(currentTimeMillis);
        }
        if (this.n == null) {
            return;
        }
        int[] iArr = this.U;
        int length = iArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                z11 = false;
                break;
            } else {
                if (iArr[i11] != 0) {
                    z11 = true;
                    break;
                }
                i11++;
            }
        }
        if (!z10) {
            PorterDuffXfermode porterDuffXfermode = (!z11 && this.n.f && paint.getAlpha() == 255) ? Y0 : null;
            if (paint.getXfermode() != porterDuffXfermode) {
                paint.setXfermode(porterDuffXfermode);
            }
        }
        float f10 = this.Y;
        float f11 = this.Z;
        int[] iArr2 = this.d;
        if (!z10) {
            if (this.a0) {
                q5 q5Var = this.n;
                int i12 = q5Var.c;
                int i13 = q5Var.d;
                int i14 = iArr2[2];
                if (i14 == 90 || i14 == 270) {
                    i12 = i13;
                    i13 = i12;
                }
                rectF.set(getBounds());
                width = rectF.width() / i12;
                this.Y = width;
                height = rectF.height() / i13;
                this.Z = height;
                this.a0 = false;
            }
            if (z11) {
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
            int i16 = z10 ? i3 + 1 : 0;
            q5 q5Var2 = this.n;
            BitmapShader[] bitmapShaderArr = q5Var2.a;
            if (bitmapShaderArr[i16] == null) {
                Bitmap bitmap = q5Var2.b;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                bitmapShaderArr[i16] = new BitmapShader(bitmap, tileMode, tileMode);
            }
            BitmapShader bitmapShader = bitmapShaderArr[i16];
            paint.setShader(bitmapShader);
            Matrix[] matrixArr = this.W;
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
            Path[] pathArr = this.X;
            Path path = pathArr[i16];
            if (path == null) {
                path = new Path();
                pathArr[i16] = path;
            }
            boolean z12 = this.x0;
            RectF rectF2 = this.T;
            if (z12 || z10) {
                if (!z10) {
                    this.x0 = false;
                }
                int i18 = 0;
                while (true) {
                    int length2 = iArr.length;
                    fArr = W0;
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
                path.addRoundRect(z10 ? rectF : rectF2, fArr, Path.Direction.CW);
            }
            int i20 = iArr[0];
            int i21 = iArr[1];
            if (i20 != i21 || i21 != (i10 = iArr[2]) || i10 != iArr[3]) {
                canvas.drawPath(path, paint);
                return;
            }
            if (!z10) {
                rectF = rectF2;
            }
            float f13 = i20;
            canvas.drawRoundRect(rectF, f13, f13, paint);
            return;
        }
        q5 q5Var3 = this.n;
        int i22 = q5Var3.c;
        int i23 = q5Var3.d;
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
        if (z11) {
        }
    }

    public final Bitmap m() {
        q5 q5Var = this.n;
        if (q5Var != null) {
            return q5Var.b;
        }
        q5 q5Var2 = this.r;
        if (q5Var2 != null) {
            return q5Var2.b;
        }
        q5 q5Var3 = this.s;
        if (q5Var3 != null) {
            return q5Var3.b;
        }
        return null;
    }

    public final float n() {
        if (this.d[4] == 0) {
            return 0.0f;
        }
        if (this.N >= 0) {
            return this.N / this.d[4];
        }
        int[] iArr = this.d;
        return iArr[3] / iArr[4];
    }

    public final int o() {
        int i3;
        if (this.N >= 0) {
            return (int) this.N;
        }
        q5 q5Var = this.r;
        if (q5Var != null && (i3 = q5Var.e) != 0) {
            return i3;
        }
        q5 q5Var2 = this.n;
        if (q5Var2 != null) {
            return q5Var2.e;
        }
        return 0;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.a0 = true;
    }

    public final Bitmap p() {
        int i3 = this.k0;
        int i10 = this.j0;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(i3, i10, config);
        Canvas canvas = new Canvas(createBitmap);
        AnimatedFileNative a10 = AnimatedFileNative.a(this.H.getAbsolutePath(), this.d, this.K, this.I, this.v0, false);
        if (a10 == null) {
            return createBitmap;
        }
        if (this.N0 == null) {
            int[] iArr = this.d;
            this.N0 = Bitmap.createBitmap(Math.max(1, iArr[0]), Math.max(1, iArr[1]), config);
        }
        a10.c(this.N0, false, this.h0, this.i0, true);
        a10.f();
        createBitmap.eraseColor(0);
        canvas.save();
        float width = this.k0 / this.N0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.N0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        return createBitmap;
    }

    public final Bitmap q(long j10, boolean z10) {
        if (this.y && this.e0 != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = this.v0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.b(false);
                this.v0.d();
            }
            if (!z10) {
                this.e0.g(j10, z10);
            }
            int[] iArr = this.d;
            Bitmap createBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
            if ((z10 ? this.e0.b(j10, createBitmap) : this.e0.c(createBitmap, true, 0.0f, 0.0f, true)) != 0) {
                return createBitmap;
            }
            createBitmap.recycle();
        }
        return null;
    }

    public final Bitmap r(boolean z10) {
        if (this.e0 == null) {
            q5 q5Var = this.w;
            if (q5Var != null) {
                return q5Var.b;
            }
            return null;
        }
        if (this.w == null) {
            if (this.h.isEmpty()) {
                float f10 = this.d[0];
                float f11 = this.n0;
                this.w = new q5(Bitmap.createBitmap((int) (f10 * f11), (int) (r0[1] * f11), Bitmap.Config.ARGB_8888));
            } else {
                this.w = (q5) this.h.remove(0);
            }
        }
        this.e0.c(this.w.b, false, this.h0, this.i0, z10);
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
        if (this.c0 || this.u0.isEmpty()) {
            return;
        }
        this.c0 = true;
        this.S0 = false;
        x(false);
        org.telegram.messenger.g0.h3(this.J0);
        r5 r5Var = new r5(this, 0);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.g0.h3(r5Var);
        } else {
            r5Var.run();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.c0 = false;
        r5 r5Var = new r5(this, 0);
        Typeface typeface = org.telegram.messenger.g0.a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.g0.h3(r5Var);
        } else {
            r5Var.run();
        }
    }

    public final void t() {
        Iterator it = this.u0.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    public final void u() {
        if (!this.t0.isEmpty()) {
            this.L = true;
            return;
        }
        int i3 = 0;
        this.c0 = false;
        this.d0 = true;
        r5 r5Var = new r5(this, i3);
        Typeface typeface = org.telegram.messenger.g0.a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.g0.h3(r5Var);
        } else {
            r5Var.run();
        }
        if (this.E0 != null) {
            cg.h.c();
            ch0.U0.cancelRunnable(this.E0);
            this.E0 = null;
        }
        if (this.e == null) {
            if (this.e0 != null) {
                this.e0.f();
                this.e0 = null;
            }
            ArrayList arrayList = new ArrayList();
            q5 q5Var = this.n;
            if (q5Var != null) {
                arrayList.add(q5Var.b);
            }
            q5 q5Var2 = this.r;
            if (q5Var2 != null) {
                arrayList.add(q5Var2.b);
            }
            q5 q5Var3 = this.s;
            if (q5Var3 != null) {
                arrayList.add(q5Var3.b);
            }
            q5 q5Var4 = this.w;
            if (q5Var4 != null) {
                arrayList.add(q5Var4.b);
            }
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                q5 q5Var5 = (q5) obj;
                if (q5Var5 != null) {
                    arrayList.add(q5Var5.b);
                }
            }
            this.h.clear();
            this.n = null;
            this.r = null;
            this.s = null;
            this.w = null;
            org.telegram.messenger.q5 q5Var6 = this.g0;
            if (q5Var6 != null) {
                q5Var6.recycle();
                this.g0 = null;
            }
            getPaint().setShader(null);
            org.telegram.messenger.g0.A2(arrayList);
        } else {
            this.x = true;
        }
        AnimatedFileDrawableStream animatedFileDrawableStream = this.v0;
        if (animatedFileDrawableStream != null) {
            animatedFileDrawableStream.b(true);
            this.v0 = null;
        }
        r5 r5Var2 = new r5(this, 2);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.g0.h3(r5Var2);
        } else {
            r5Var2.run();
        }
    }

    public final void v(ImageReceiver imageReceiver) {
        ue.b bVar = this.u0;
        bVar.remove(imageReceiver);
        if (bVar.isEmpty()) {
            this.z0 = 0;
        }
        h();
    }

    public final void w(View view) {
        ue.b bVar = this.t0;
        bVar.remove(view);
        if (bVar.isEmpty()) {
            if (this.L) {
                u();
                return;
            }
            int[] iArr = this.V;
            if (iArr != null) {
                B(iArr);
            }
        }
    }

    public final void x(boolean z10) {
        r5 r5Var;
        r5 r5Var2;
        if (this.e == null || z10) {
            if ((!this.b || (this.s != null && (this.L0 || this.N < 0))) && this.r != null) {
                return;
            }
            if ((this.n == null || !this.f) && g() && !this.x) {
                if ((!this.c0 && (!this.E || this.F)) || this.u0.isEmpty() || this.D0) {
                    return;
                }
                if (!this.w0) {
                    if (this.g0 == null) {
                        this.g0 = new org.telegram.messenger.q5("decodeQueue" + this, true);
                    }
                    if (z10 && (r5Var = this.e) != null) {
                        this.g0.cancelRunnable(r5Var);
                    }
                    org.telegram.messenger.q5 q5Var = this.g0;
                    r5 r5Var3 = this.I0;
                    this.e = r5Var3;
                    q5Var.postRunnable(r5Var3, 0L);
                } else if (this.y0) {
                    r5 r5Var4 = this.I0;
                    this.e = r5Var4;
                    org.telegram.messenger.r5.a(r5Var4);
                } else {
                    if (z10 && (r5Var2 = this.e) != null) {
                        X0.remove(r5Var2);
                    }
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = X0;
                    r5 r5Var5 = this.I0;
                    this.e = r5Var5;
                    scheduledThreadPoolExecutor.execute(r5Var5);
                }
                this.L0 = true;
            }
        }
    }

    public final void y(long j10, boolean z10, boolean z11) {
        AnimatedFileDrawableStream animatedFileDrawableStream;
        synchronized (this.R) {
            try {
                this.M = j10;
                this.N = j10;
                this.L0 = false;
                if (this.e0 != null) {
                    this.e0.e();
                }
                if (this.y && (animatedFileDrawableStream = this.v0) != null) {
                    animatedFileDrawableStream.b(z10);
                    this.O = z10;
                    this.P = z10 ? 0 : 10;
                }
                if (z11 && this.E) {
                    this.F = false;
                    if (this.e == null) {
                        x(true);
                    } else {
                        this.G = true;
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
        RectF rectF = this.T;
        if (rectF.left == f10 && rectF.top == f11 && rectF.right == f15 && rectF.bottom == f14) {
            return;
        }
        rectF.set(f10, f11, f15, f14);
        this.x0 = true;
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
    public t5(File file, boolean z10, long j10, int i3, TLRPC.Document document, org.telegram.messenger.ac acVar, Object obj, long j11, int i10, boolean z11, int i11, int i12, bd.i iVar, int i13, boolean z12) {
        ?? r12;
        ?? r13;
        long j12;
        int[] iArr = new int[8];
        this.d = iArr;
        this.h = new ArrayList();
        this.M = -1L;
        this.N = -1L;
        this.R = new Object();
        this.T = new RectF();
        this.U = new int[4];
        this.W = new Matrix[3];
        this.X = new Path[3];
        this.Y = 1.0f;
        this.Z = 1.0f;
        this.b0 = new RectF();
        this.n0 = 1.0f;
        this.q0 = new RectF[2];
        this.r0 = new Paint[2];
        this.t0 = new ue.b(true, true);
        this.u0 = new ue.b(true, true);
        this.x0 = true;
        this.C0 = new r5(this, 4);
        this.F0 = new r5(this, 5);
        this.G0 = new r5(this, 6);
        this.H0 = 0;
        this.I0 = new r5(this, 7);
        this.J0 = new r5(this, 8);
        this.T0 = new s5(this, 0);
        this.H = file;
        this.b = org.telegram.messenger.az.o() >= 1;
        this.I = j10;
        this.J = i3;
        this.K = i10;
        this.j0 = i12;
        this.k0 = i11;
        this.l0 = z12;
        boolean z13 = iVar != null && i11 > 0 && i12 > 0;
        this.m0 = z13;
        this.p0 = document;
        getPaint().setFlags(3);
        if (j10 == 0 || (document == null && acVar == null)) {
            r12 = 1;
        } else {
            r12 = 1;
            this.v0 = new AnimatedFileDrawableStream(document, acVar, obj, i10, z11, i3, i13);
        }
        cg.h hVar = null;
        if (!z10 || z13) {
            r13 = 0;
        } else {
            r13 = 0;
            this.e0 = AnimatedFileNative.a(file.getAbsolutePath(), iArr, i10, j10, this.v0, z11);
            this.f0 = (this.e0 != null || (this.o0 && this.H0 <= 15)) ? false : r12;
            if (this.e0 != null && (iArr[0] > 3840 || iArr[r12] > 3840)) {
                this.e0.f();
                this.e0 = null;
            }
            d();
            E();
            this.y = r12;
        }
        if (z13) {
            this.e0 = AnimatedFileNative.a(file.getAbsolutePath(), iArr, i10, j10, this.v0, z11);
            this.f0 = (this.e0 != null || (this.o0 && this.H0 <= 15)) ? r13 : r12;
            if (this.e0 == null || (iArr[r13] <= 3840 && iArr[r12] <= 3840)) {
                j12 = j11;
                hVar = new cg.h(file, this, iVar, this.k0, this.j0, !this.y0, 0);
                this.A0 = hVar;
                if (j12 == 0) {
                    y(j12, r13, r13);
                    return;
                }
                return;
            }
            this.e0.f();
            this.e0 = null;
        }
        j12 = j11;
        this.A0 = hVar;
        if (j12 == 0) {
        }
    }
}
