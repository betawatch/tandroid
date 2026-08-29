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
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.DispatchQueuePoolBackground;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class c6 extends BitmapDrawable implements Animatable, jf.e {
    public static final float[] R0 = new float[8];
    public static final ScheduledThreadPoolExecutor S0 = new ScheduledThreadPoolExecutor(8, new ThreadPoolExecutor.DiscardPolicy());
    public static final PorterDuffXfermode T0 = new PorterDuffXfermode(PorterDuff.Mode.SRC);
    public boolean A;
    public final a6 A0;
    public boolean B;
    public final a6 B0;
    public final File C;
    public int C0;
    public final long D;
    public final a6 D0;
    public final int E;
    public final a6 E0;
    public final int F;
    public a6 F0;
    public boolean G;
    public boolean G0;
    public volatile long H;
    public long H0;
    public volatile long I;
    public Bitmap I0;
    public boolean J;
    public AnimatedFileNative J0;
    public int K;
    public int K0;
    public boolean L;
    public int L0;
    public final Object M;
    public int M0;
    public boolean N;
    public volatile boolean N0;
    public final RectF O;
    public final b6 O0;
    public final int[] P;
    public boolean P0;
    public int[] Q;
    public boolean Q0;
    public final Matrix[] R;
    public final Path[] S;
    public float T;
    public float U;
    public boolean V;
    public final RectF W;
    public volatile boolean X;
    public volatile boolean Y;
    public volatile AnimatedFileNative Z;
    public boolean a;
    public boolean a0;
    public boolean b;
    public DispatchQueue b0;
    public int c;
    public float c0;
    public final int[] d;
    public float d0;
    public a6 e;
    public int e0;
    public boolean f;
    public int f0;
    public final boolean g0;
    public final ArrayList h;
    public final boolean h0;
    public float i0;
    public boolean j0;
    public final TLRPC.Document k0;
    public final RectF[] l0;
    public final Paint[] m0;
    public z5 n;
    public View n0;
    public final ArrayList o0;
    public final ArrayList p0;
    public AnimatedFileDrawableStream q0;
    public z5 r;
    public boolean r0;
    public z5 s;
    public boolean s0;
    public boolean t0;
    public int u0;
    public z5 v;
    public final jf.g v0;
    public boolean w;
    public a5.c w0;
    public boolean x;
    public final a6 x0;
    public boolean y;
    public boolean y0;
    public a6 z0;

    public c6(File file, boolean z10, long j10, int i10, TLRPC.Document document, ImageLocation imageLocation, Object obj, long j11, int i11, boolean z11) {
        this(file, z10, j10, i10, document, imageLocation, obj, j11, i11, z11, 0, 0, null, document != null ? 1 : 0, true);
    }

    public final void A(boolean z10) {
        this.t0 = z10;
        if (z10) {
            this.b = false;
        }
    }

    public final void B(int[] iArr) {
        boolean isEmpty = this.o0.isEmpty();
        int[] iArr2 = this.P;
        if (!isEmpty) {
            if (this.Q == null) {
                this.Q = new int[4];
            }
            int[] iArr3 = this.Q;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr3.length);
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if (!this.s0 && iArr[i10] != iArr2[i10]) {
                this.s0 = true;
            }
            iArr2[i10] = iArr[i10];
        }
    }

    public final void C(long j10, long j11) {
        this.c0 = j10 / 1000.0f;
        this.d0 = j11 / 1000.0f;
        if (j10 < 0 || o() >= j10) {
            return;
        }
        y(j10, true, false);
    }

    public final void D(long j10) {
        this.M0 = 0;
        if (this.N0) {
            this.N0 = false;
            AndroidUtilities.executeOnUIThread(new a6(this, 0));
        }
        boolean z10 = this.P0 || (!this.X && this.y);
        if (!this.X) {
            if (this.X || !this.y || !z10 || this.r == null) {
                return;
            }
            z5 z5Var = this.n;
            if (z5Var != null) {
                this.h.add(z5Var);
            }
            this.n = this.r;
            this.r = this.s;
            this.s = null;
            this.P0 = false;
            x(false);
            return;
        }
        z5 z5Var2 = this.n;
        if (z5Var2 == null && this.r == null) {
            x(false);
            return;
        }
        if (this.r != null) {
            if (z5Var2 == null || (z10 && !this.a && this.I < 0)) {
                z5 z5Var3 = this.n;
                if (z5Var3 != null) {
                    this.h.add(z5Var3);
                }
                this.n = this.r;
                this.r = this.s;
                this.s = null;
                this.P0 = false;
                x(false);
            }
        }
    }

    public final void E() {
        int i10;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        if (this.j0 || (i10 = this.e0) <= 0 || (i11 = this.f0) <= 0 || (i12 = (iArr = this.d)[0]) <= 0 || (i13 = iArr[1]) <= 0) {
            this.i0 = 1.0f;
            return;
        }
        float max = Math.max(i11 / i12, i10 / i13);
        this.i0 = max;
        if (max <= 0.0f || max > 0.7d) {
            this.i0 = 1.0f;
        }
    }

    @Override // jf.e
    public final int a(Bitmap bitmap) {
        int i10;
        if (this.J0 == null) {
            return -1;
        }
        Canvas canvas = new Canvas(bitmap);
        Bitmap bitmap2 = this.I0;
        int[] iArr = this.d;
        if (bitmap2 == null) {
            this.I0 = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        }
        this.J0.c(this.I0, false, this.c0, this.d0, this.g0);
        long j10 = this.H0;
        if (j10 != 0 && ((i10 = iArr[3]) == 0 || j10 > i10)) {
            return 0;
        }
        int i11 = this.L0;
        int i12 = iArr[3];
        if (i11 == i12) {
            int i13 = this.K0 + 1;
            this.K0 = i13;
            if (i13 > 5) {
                return 0;
            }
        }
        this.L0 = i12;
        bitmap.eraseColor(0);
        canvas.save();
        float width = this.f0 / this.I0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.I0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        this.H0 = iArr[3];
        return 1;
    }

    @Override // jf.e
    public final void b() {
        this.J0 = AnimatedFileNative.a(this.C.getAbsolutePath(), this.d, this.F, this.D, this.q0, false);
    }

    @Override // jf.e
    public final void c() {
        AnimatedFileNative animatedFileNative = this.J0;
        if (animatedFileNative != null) {
            animatedFileNative.f();
            this.J0 = null;
        }
    }

    public final void d() {
        int i10;
        if (this.f0 == 0 && this.e0 == 0) {
            int[] iArr = this.d;
            int i11 = iArr[0];
            if (i11 > 3000 || (i10 = iArr[1]) > 3000) {
                this.f0 = i11 / 4;
                this.e0 = iArr[1] / 4;
            } else if (i11 > 2200 || i10 > 2200) {
                this.f0 = i11 / 2;
                this.e0 = i10 / 2;
            }
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        l(canvas, false, System.currentTimeMillis(), 0);
    }

    public final void e(ImageReceiver imageReceiver) {
        if (!this.p0.contains(imageReceiver)) {
            this.p0.add(imageReceiver);
            if (this.X) {
                x(false);
            }
        }
        h();
    }

    public final void f(View view) {
        if (view != null) {
            ArrayList arrayList = this.o0;
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
        }
    }

    public final void finalize() {
        try {
            this.o0.clear();
            u();
        } finally {
            super.finalize();
        }
    }

    public final boolean g() {
        return this.h0 ? this.v0 != null : (this.Z == null && this.x) ? false : true;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i10 = 0;
        if (this.x) {
            int[] iArr = this.d;
            int i11 = iArr[2];
            i10 = (i11 == 90 || i11 == 270) ? iArr[0] : iArr[1];
        }
        return i10 == 0 ? AndroidUtilities.dp(100.0f) : (int) (i10 * this.i0);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i10 = 0;
        if (this.x) {
            int[] iArr = this.d;
            int i11 = iArr[2];
            i10 = (i11 == 90 || i11 == 270) ? iArr[1] : iArr[0];
        }
        return i10 == 0 ? AndroidUtilities.dp(100.0f) : (int) (i10 * this.i0);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        int i10 = 0;
        if (this.x) {
            int[] iArr = this.d;
            int i11 = iArr[2];
            i10 = (i11 == 90 || i11 == 270) ? iArr[0] : iArr[1];
        }
        return i10 == 0 ? AndroidUtilities.dp(100.0f) : i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        int i10 = 0;
        if (this.x) {
            int[] iArr = this.d;
            int i11 = iArr[2];
            i10 = (i11 == 90 || i11 == 270) ? iArr[1] : iArr[0];
        }
        return i10 == 0 ? AndroidUtilities.dp(100.0f) : i10;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        a6 a6Var;
        if (this.v0 == null) {
            return;
        }
        boolean isEmpty = this.p0.isEmpty();
        if (isEmpty && this.F0 == null) {
            a6 a6Var2 = new a6(this, 1);
            this.F0 = a6Var2;
            AndroidUtilities.runOnUIThread(a6Var2, 600L);
        } else {
            if (isEmpty || (a6Var = this.F0) == null) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(a6Var);
            this.F0 = null;
        }
    }

    public final void i() {
        int i10;
        if (!this.X || this.N0 || this.f) {
            if (this.Q0) {
                this.Q0 = false;
                this.M0 = 0;
                jf.j.d().g(this.O0);
                return;
            }
            return;
        }
        if (this.Q0 || (i10 = this.d[5]) <= 0) {
            return;
        }
        this.Q0 = true;
        this.M0 = 0;
        jf.j.d().b(this.O0, i10);
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.X;
    }

    public final void j() {
        ArrayList arrayList;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.p0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i10);
            if (!imageReceiver.isAttachedToWindow()) {
                arrayList.remove(i10);
                i10--;
            }
            int i12 = imageReceiver.animatedFileDrawableRepeatMaxCount;
            if (i12 > 0 && this.u0 >= i12) {
                i11++;
            }
            i10++;
        }
        if (arrayList.size() == i11) {
            stop();
        } else {
            start();
        }
    }

    public final void k() {
        if (g()) {
            return;
        }
        z5 z5Var = this.n;
        if (z5Var != null) {
            z5Var.b.recycle();
            Arrays.fill(z5Var.a, (Object) null);
            this.n = null;
        }
        z5 z5Var2 = this.v;
        if (z5Var2 != null) {
            z5Var2.b.recycle();
            Arrays.fill(z5Var2.a, (Object) null);
            this.v = null;
        }
        DispatchQueue dispatchQueue = this.b0;
        if (dispatchQueue != null) {
            dispatchQueue.recycle();
            this.b0 = null;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                arrayList.clear();
                t();
                return;
            } else {
                z5 z5Var3 = (z5) arrayList.get(i10);
                z5Var3.b.recycle();
                Arrays.fill(z5Var3.a, (Object) null);
                i10++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(Canvas canvas, boolean z10, long j10, int i10) {
        boolean z11;
        float width;
        float height;
        float[] fArr;
        int i11;
        if (!g() || this.w) {
            return;
        }
        long currentTimeMillis = j10 == 0 ? System.currentTimeMillis() : j10;
        RectF rectF = z10 ? this.l0[i10] : this.W;
        Paint paint = z10 ? this.m0[i10] : getPaint();
        if (!z10) {
            D(currentTimeMillis);
        }
        if (this.n == null) {
            return;
        }
        int[] iArr = this.P;
        int length = iArr.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                z11 = false;
                break;
            } else {
                if (iArr[i12] != 0) {
                    z11 = true;
                    break;
                }
                i12++;
            }
        }
        if (!z10) {
            PorterDuffXfermode porterDuffXfermode = (!z11 && this.n.f && paint.getAlpha() == 255) ? T0 : null;
            if (paint.getXfermode() != porterDuffXfermode) {
                paint.setXfermode(porterDuffXfermode);
            }
        }
        float f9 = this.T;
        float f10 = this.U;
        int[] iArr2 = this.d;
        if (!z10) {
            if (this.V) {
                z5 z5Var = this.n;
                int i13 = z5Var.c;
                int i14 = z5Var.d;
                int i15 = iArr2[2];
                if (i15 == 90 || i15 == 270) {
                    i13 = i14;
                    i14 = i13;
                }
                rectF.set(getBounds());
                width = rectF.width() / i13;
                this.T = width;
                height = rectF.height() / i14;
                this.U = height;
                this.V = false;
            }
            if (z11) {
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                int i16 = iArr2[2];
                if (i16 == 90) {
                    canvas.rotate(90.0f);
                    canvas.translate(0.0f, -rectF.width());
                } else if (i16 == 180) {
                    canvas.rotate(180.0f);
                    canvas.translate(-rectF.width(), -rectF.height());
                } else if (i16 == 270) {
                    canvas.rotate(270.0f);
                    canvas.translate(-rectF.height(), 0.0f);
                }
                canvas.scale(f9, f10);
                canvas.drawBitmap(this.n.b, 0.0f, 0.0f, paint);
                canvas.restore();
                return;
            }
            int i17 = z10 ? i10 + 1 : 0;
            z5 z5Var2 = this.n;
            BitmapShader[] bitmapShaderArr = z5Var2.a;
            if (bitmapShaderArr[i17] == null) {
                Bitmap bitmap = z5Var2.b;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                bitmapShaderArr[i17] = new BitmapShader(bitmap, tileMode, tileMode);
            }
            BitmapShader bitmapShader = bitmapShaderArr[i17];
            paint.setShader(bitmapShader);
            Matrix[] matrixArr = this.R;
            Matrix matrix = matrixArr[i17];
            if (matrix == null) {
                matrix = new Matrix();
                matrixArr[i17] = matrix;
            }
            matrix.reset();
            matrix.setTranslate(rectF.left, rectF.top);
            int i18 = iArr2[2];
            if (i18 == 90) {
                matrix.preRotate(90.0f);
                matrix.preTranslate(0.0f, -rectF.width());
            } else if (i18 == 180) {
                matrix.preRotate(180.0f);
                matrix.preTranslate(-rectF.width(), -rectF.height());
            } else if (i18 == 270) {
                matrix.preRotate(270.0f);
                matrix.preTranslate(-rectF.height(), 0.0f);
            }
            matrix.preScale(f9, f10);
            bitmapShader.setLocalMatrix(matrix);
            Path[] pathArr = this.S;
            Path path = pathArr[i17];
            if (path == null) {
                path = new Path();
                pathArr[i17] = path;
            }
            boolean z12 = this.s0;
            RectF rectF2 = this.O;
            if (z12 || z10) {
                if (!z10) {
                    this.s0 = false;
                }
                int i19 = 0;
                while (true) {
                    int length2 = iArr.length;
                    fArr = R0;
                    if (i19 >= length2) {
                        break;
                    }
                    int i20 = i19 * 2;
                    float f11 = iArr[i19];
                    fArr[i20] = f11;
                    fArr[i20 + 1] = f11;
                    i19++;
                }
                path.rewind();
                path.addRoundRect(z10 ? rectF : rectF2, fArr, Path.Direction.CW);
            }
            int i21 = iArr[0];
            int i22 = iArr[1];
            if (i21 != i22 || i22 != (i11 = iArr[2]) || i11 != iArr[3]) {
                canvas.drawPath(path, paint);
                return;
            }
            if (!z10) {
                rectF = rectF2;
            }
            float f12 = i21;
            canvas.drawRoundRect(rectF, f12, f12, paint);
            return;
        }
        z5 z5Var3 = this.n;
        int i23 = z5Var3.c;
        int i24 = z5Var3.d;
        int i25 = iArr2[2];
        if (i25 == 90 || i25 == 270) {
            i23 = i24;
            i24 = i23;
        }
        width = rectF.width() / i23;
        height = rectF.height() / i24;
        float f13 = width;
        f10 = height;
        f9 = f13;
        if (z11) {
        }
    }

    public final Bitmap m() {
        z5 z5Var = this.n;
        if (z5Var != null) {
            return z5Var.b;
        }
        z5 z5Var2 = this.r;
        if (z5Var2 != null) {
            return z5Var2.b;
        }
        z5 z5Var3 = this.s;
        if (z5Var3 != null) {
            return z5Var3.b;
        }
        return null;
    }

    public final float n() {
        if (this.d[4] == 0) {
            return 0.0f;
        }
        if (this.I >= 0) {
            return this.I / this.d[4];
        }
        int[] iArr = this.d;
        return iArr[3] / iArr[4];
    }

    public final int o() {
        int i10;
        if (this.I >= 0) {
            return (int) this.I;
        }
        z5 z5Var = this.r;
        if (z5Var != null && (i10 = z5Var.e) != 0) {
            return i10;
        }
        z5 z5Var2 = this.n;
        if (z5Var2 != null) {
            return z5Var2.e;
        }
        return 0;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.V = true;
    }

    public final Bitmap p() {
        int i10 = this.f0;
        int i11 = this.e0;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, config);
        Canvas canvas = new Canvas(createBitmap);
        AnimatedFileNative a2 = AnimatedFileNative.a(this.C.getAbsolutePath(), this.d, this.F, this.D, this.q0, false);
        if (a2 == null) {
            return createBitmap;
        }
        if (this.I0 == null) {
            int[] iArr = this.d;
            this.I0 = Bitmap.createBitmap(Math.max(1, iArr[0]), Math.max(1, iArr[1]), config);
        }
        a2.c(this.I0, false, this.c0, this.d0, true);
        a2.f();
        createBitmap.eraseColor(0);
        canvas.save();
        float width = this.f0 / this.I0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.I0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        return createBitmap;
    }

    public final Bitmap q(long j10, boolean z10) {
        if (this.x && this.Z != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = this.q0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.cancel(false);
                this.q0.reset();
            }
            if (!z10) {
                this.Z.g(j10, z10);
            }
            int[] iArr = this.d;
            Bitmap createBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
            if ((z10 ? this.Z.b(createBitmap, j10) : this.Z.c(createBitmap, true, 0.0f, 0.0f, true)) != 0) {
                return createBitmap;
            }
            createBitmap.recycle();
        }
        return null;
    }

    public final Bitmap r(boolean z10) {
        if (this.Z == null) {
            z5 z5Var = this.v;
            if (z5Var != null) {
                return z5Var.b;
            }
            return null;
        }
        if (this.v == null) {
            if (this.h.isEmpty()) {
                float f9 = this.d[0];
                float f10 = this.i0;
                this.v = new z5(Bitmap.createBitmap((int) (f9 * f10), (int) (r0[1] * f10), Bitmap.Config.ARGB_8888));
            } else {
                this.v = (z5) this.h.remove(0);
            }
        }
        this.Z.c(this.v.b, false, this.c0, this.d0, z10);
        return this.v.b;
    }

    public final boolean s() {
        if (g()) {
            return (this.n == null && this.r == null) ? false : true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.X || this.p0.isEmpty()) {
            return;
        }
        this.X = true;
        this.N0 = false;
        x(false);
        AndroidUtilities.runOnUIThread(this.E0);
        AndroidUtilities.executeOnUIThread(new a6(this, 0));
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.X = false;
        AndroidUtilities.executeOnUIThread(new a6(this, 0));
    }

    public final void t() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.p0;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((ImageReceiver) arrayList.get(i10)).invalidate();
            i10++;
        }
    }

    public final void u() {
        if (!this.o0.isEmpty()) {
            this.G = true;
            return;
        }
        int i10 = 0;
        this.X = false;
        this.Y = true;
        AndroidUtilities.executeOnUIThread(new a6(this, 0));
        if (this.z0 != null) {
            jf.g.c();
            xi0.P0.cancelRunnable(this.z0);
            this.z0 = null;
        }
        if (this.e == null) {
            if (this.Z != null) {
                this.Z.f();
                this.Z = null;
            }
            ArrayList arrayList = new ArrayList();
            z5 z5Var = this.n;
            if (z5Var != null) {
                arrayList.add(z5Var.b);
            }
            z5 z5Var2 = this.r;
            if (z5Var2 != null) {
                arrayList.add(z5Var2.b);
            }
            z5 z5Var3 = this.s;
            if (z5Var3 != null) {
                arrayList.add(z5Var3.b);
            }
            z5 z5Var4 = this.v;
            if (z5Var4 != null) {
                arrayList.add(z5Var4.b);
            }
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                z5 z5Var5 = (z5) obj;
                if (z5Var5 != null) {
                    arrayList.add(z5Var5.b);
                }
            }
            this.h.clear();
            this.n = null;
            this.r = null;
            this.s = null;
            this.v = null;
            DispatchQueue dispatchQueue = this.b0;
            if (dispatchQueue != null) {
                dispatchQueue.recycle();
                this.b0 = null;
            }
            getPaint().setShader(null);
            AndroidUtilities.recycleBitmaps(arrayList);
        } else {
            this.w = true;
        }
        AnimatedFileDrawableStream animatedFileDrawableStream = this.q0;
        if (animatedFileDrawableStream != null) {
            animatedFileDrawableStream.cancel(true);
            this.q0 = null;
        }
        t();
    }

    public final void v(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.p0;
        arrayList.remove(imageReceiver);
        if (arrayList.isEmpty()) {
            this.u0 = 0;
        }
        h();
    }

    public final void w(View view) {
        ArrayList arrayList = this.o0;
        arrayList.remove(view);
        if (arrayList.isEmpty()) {
            if (this.G) {
                u();
                return;
            }
            int[] iArr = this.Q;
            if (iArr != null) {
                B(iArr);
            }
        }
    }

    public final void x(boolean z10) {
        a6 a6Var;
        a6 a6Var2;
        if (this.e == null || z10) {
            if ((!this.b || (this.s != null && (this.G0 || this.I < 0))) && this.r != null) {
                return;
            }
            if ((this.n == null || !this.f) && g() && !this.w) {
                if ((!this.X && (!this.y || this.A)) || this.p0.isEmpty() || this.y0) {
                    return;
                }
                if (!this.r0) {
                    if (this.b0 == null) {
                        this.b0 = new DispatchQueue("decodeQueue" + this);
                    }
                    if (z10 && (a6Var = this.e) != null) {
                        this.b0.cancelRunnable(a6Var);
                    }
                    DispatchQueue dispatchQueue = this.b0;
                    a6 a6Var3 = this.D0;
                    this.e = a6Var3;
                    dispatchQueue.postRunnable(a6Var3, 0L);
                } else if (this.t0) {
                    a6 a6Var4 = this.D0;
                    this.e = a6Var4;
                    DispatchQueuePoolBackground.execute(a6Var4);
                } else {
                    if (z10 && (a6Var2 = this.e) != null) {
                        S0.remove(a6Var2);
                    }
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = S0;
                    a6 a6Var5 = this.D0;
                    this.e = a6Var5;
                    scheduledThreadPoolExecutor.execute(a6Var5);
                }
                this.G0 = true;
            }
        }
    }

    public final void y(long j10, boolean z10, boolean z11) {
        AnimatedFileDrawableStream animatedFileDrawableStream;
        synchronized (this.M) {
            try {
                this.H = j10;
                this.I = j10;
                this.G0 = false;
                if (this.Z != null) {
                    this.Z.e();
                }
                if (this.x && (animatedFileDrawableStream = this.q0) != null) {
                    animatedFileDrawableStream.cancel(z10);
                    this.J = z10;
                    this.K = z10 ? 0 : 10;
                }
                if (z11 && this.y) {
                    this.A = false;
                    if (this.e == null) {
                        x(true);
                    } else {
                        this.B = true;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void z(float f9, float f10, float f11, float f12) {
        float f13 = f12 + f10;
        float f14 = f11 + f9;
        RectF rectF = this.O;
        if (rectF.left == f9 && rectF.top == f10 && rectF.right == f14 && rectF.bottom == f13) {
            return;
        }
        rectF.set(f9, f10, f14, f13);
        this.s0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c6(File file, boolean z10, long j10, int i10, TLRPC.Document document, ImageLocation imageLocation, Object obj, long j11, int i11, boolean z11, int i12, int i13, ie.i iVar, int i14, boolean z12) {
        char c3;
        char c6;
        long j12;
        boolean z13;
        int[] iArr = new int[8];
        this.d = iArr;
        this.h = new ArrayList();
        this.H = -1L;
        this.I = -1L;
        this.M = new Object();
        this.O = new RectF();
        this.P = new int[4];
        this.R = new Matrix[3];
        this.S = new Path[3];
        this.T = 1.0f;
        this.U = 1.0f;
        this.W = new RectF();
        this.i0 = 1.0f;
        this.l0 = new RectF[2];
        this.m0 = new Paint[2];
        this.o0 = new ArrayList();
        this.p0 = new ArrayList();
        this.s0 = true;
        this.x0 = new a6(this, 2);
        this.A0 = new a6(this, 3);
        this.B0 = new a6(this, 4);
        this.C0 = 0;
        this.D0 = new a6(this, 5);
        this.E0 = new a6(this, 6);
        this.O0 = new b6(this, 0);
        this.C = file;
        this.b = SharedConfig.deviceIsAboveAverage();
        this.D = j10;
        this.E = i10;
        this.F = i11;
        this.e0 = i13;
        this.f0 = i12;
        this.g0 = z12;
        boolean z14 = iVar != null && i12 > 0 && i13 > 0;
        this.h0 = z14;
        this.k0 = document;
        getPaint().setFlags(3);
        if (j10 == 0 || (document == null && imageLocation == null)) {
            c3 = 0;
        } else {
            c3 = 0;
            this.q0 = new AnimatedFileDrawableStream(document, imageLocation, obj, i11, z11, i10, i14);
        }
        jf.g gVar = null;
        if (!z10 || z14) {
            c6 = 1;
        } else {
            c6 = 1;
            this.Z = AnimatedFileNative.a(file.getAbsolutePath(), iArr, i11, j10, this.q0, z11);
            this.a0 = this.Z == null && (!this.j0 || this.C0 > 15);
            if (this.Z != null && (iArr[c3] > 3840 || iArr[1] > 3840)) {
                this.Z.f();
                this.Z = null;
            }
            d();
            E();
            this.x = true;
        }
        if (z14) {
            this.Z = AnimatedFileNative.a(file.getAbsolutePath(), iArr, i11, j10, this.q0, z11);
            this.a0 = this.Z == null && (!this.j0 || this.C0 > 15);
            if (this.Z == null || (iArr[c3] <= 3840 && iArr[c6] <= 3840)) {
                j12 = j11;
                z13 = false;
                gVar = new jf.g(file, this, iVar, this.f0, this.e0, !this.t0, 0);
                this.v0 = gVar;
                if (j12 == 0) {
                    y(j12, z13, z13);
                    return;
                }
                return;
            }
            this.Z.f();
            this.Z = null;
        }
        j12 = j11;
        z13 = false;
        this.v0 = gVar;
        if (j12 == 0) {
        }
    }
}
