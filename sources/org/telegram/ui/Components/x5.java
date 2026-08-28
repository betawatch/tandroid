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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x5 extends BitmapDrawable implements Animatable, ff.f {
    public static final float[] R0 = new float[8];
    public static final ScheduledThreadPoolExecutor S0 = new ScheduledThreadPoolExecutor(8, new ThreadPoolExecutor.DiscardPolicy());
    public static final PorterDuffXfermode T0 = new PorterDuffXfermode(PorterDuff.Mode.SRC);
    public boolean A;
    public final v5 A0;
    public boolean B;
    public final v5 B0;
    public final File C;
    public int C0;
    public final long D;
    public final v5 D0;
    public final int E;
    public final v5 E0;
    public final int F;
    public v5 F0;
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
    public final w5 O0;
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
    public v5 e;
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
    public u5 n;
    public View n0;
    public final ArrayList o0;
    public final ArrayList p0;
    public AnimatedFileDrawableStream q0;
    public u5 r;
    public boolean r0;
    public u5 s;
    public boolean s0;
    public boolean t0;
    public int u0;
    public u5 v;
    public final ff.h v0;
    public boolean w;
    public com.google.android.gms.internal.cast.a w0;
    public boolean x;
    public final v5 x0;
    public boolean y;
    public boolean y0;
    public v5 z0;

    public x5(File file, boolean z10, long j10, int i9, TLRPC.Document document, ImageLocation imageLocation, Object obj, long j11, int i10, boolean z11) {
        this(file, z10, j10, i9, document, imageLocation, obj, j11, i10, z11, 0, 0, null, document != null ? 1 : 0, true);
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
        for (int i9 = 0; i9 < 4; i9++) {
            if (!this.s0 && iArr[i9] != iArr2[i9]) {
                this.s0 = true;
            }
            iArr2[i9] = iArr[i9];
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
            AndroidUtilities.executeOnUIThread(new v5(this, 0));
        }
        boolean z10 = this.P0 || (!this.X && this.y);
        if (!this.X) {
            if (this.X || !this.y || !z10 || this.r == null) {
                return;
            }
            u5 u5Var = this.n;
            if (u5Var != null) {
                this.h.add(u5Var);
            }
            this.n = this.r;
            this.r = this.s;
            this.s = null;
            this.P0 = false;
            x(false);
            return;
        }
        u5 u5Var2 = this.n;
        if (u5Var2 == null && this.r == null) {
            x(false);
            return;
        }
        if (this.r != null) {
            if (u5Var2 == null || (z10 && !this.a && this.I < 0)) {
                u5 u5Var3 = this.n;
                if (u5Var3 != null) {
                    this.h.add(u5Var3);
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
        int i9;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        if (this.j0 || (i9 = this.e0) <= 0 || (i10 = this.f0) <= 0 || (i11 = (iArr = this.d)[0]) <= 0 || (i12 = iArr[1]) <= 0) {
            this.i0 = 1.0f;
            return;
        }
        float max = Math.max(i10 / i11, i9 / i12);
        this.i0 = max;
        if (max <= 0.0f || max > 0.7d) {
            this.i0 = 1.0f;
        }
    }

    @Override // ff.f
    public final int a(Bitmap bitmap) {
        int i9;
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
        if (j10 != 0 && ((i9 = iArr[3]) == 0 || j10 > i9)) {
            return 0;
        }
        int i10 = this.L0;
        int i11 = iArr[3];
        if (i10 == i11) {
            int i12 = this.K0 + 1;
            this.K0 = i12;
            if (i12 > 5) {
                return 0;
            }
        }
        this.L0 = i11;
        bitmap.eraseColor(0);
        canvas.save();
        float width = this.f0 / this.I0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.I0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        this.H0 = iArr[3];
        return 1;
    }

    @Override // ff.f
    public final void b() {
        this.J0 = AnimatedFileNative.a(this.C.getAbsolutePath(), this.d, this.F, this.D, this.q0, false);
    }

    @Override // ff.f
    public final void c() {
        AnimatedFileNative animatedFileNative = this.J0;
        if (animatedFileNative != null) {
            animatedFileNative.f();
            this.J0 = null;
        }
    }

    public final void d() {
        int i9;
        if (this.f0 == 0 && this.e0 == 0) {
            int[] iArr = this.d;
            int i10 = iArr[0];
            if (i10 > 3000 || (i9 = iArr[1]) > 3000) {
                this.f0 = i10 / 4;
                this.e0 = iArr[1] / 4;
            } else if (i10 > 2200 || i9 > 2200) {
                this.f0 = i10 / 2;
                this.e0 = i9 / 2;
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
        int i9 = 0;
        if (this.x) {
            int[] iArr = this.d;
            int i10 = iArr[2];
            i9 = (i10 == 90 || i10 == 270) ? iArr[0] : iArr[1];
        }
        return i9 == 0 ? AndroidUtilities.dp(100.0f) : (int) (i9 * this.i0);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i9 = 0;
        if (this.x) {
            int[] iArr = this.d;
            int i10 = iArr[2];
            i9 = (i10 == 90 || i10 == 270) ? iArr[1] : iArr[0];
        }
        return i9 == 0 ? AndroidUtilities.dp(100.0f) : (int) (i9 * this.i0);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        int i9 = 0;
        if (this.x) {
            int[] iArr = this.d;
            int i10 = iArr[2];
            i9 = (i10 == 90 || i10 == 270) ? iArr[0] : iArr[1];
        }
        return i9 == 0 ? AndroidUtilities.dp(100.0f) : i9;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        int i9 = 0;
        if (this.x) {
            int[] iArr = this.d;
            int i10 = iArr[2];
            i9 = (i10 == 90 || i10 == 270) ? iArr[1] : iArr[0];
        }
        return i9 == 0 ? AndroidUtilities.dp(100.0f) : i9;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        v5 v5Var;
        if (this.v0 == null) {
            return;
        }
        boolean isEmpty = this.p0.isEmpty();
        if (isEmpty && this.F0 == null) {
            v5 v5Var2 = new v5(this, 1);
            this.F0 = v5Var2;
            AndroidUtilities.runOnUIThread(v5Var2, 600L);
        } else {
            if (isEmpty || (v5Var = this.F0) == null) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(v5Var);
            this.F0 = null;
        }
    }

    public final void i() {
        int i9;
        if (!this.X || this.N0 || this.f) {
            if (this.Q0) {
                this.Q0 = false;
                this.M0 = 0;
                ff.k.d().f(this.O0);
                return;
            }
            return;
        }
        if (this.Q0 || (i9 = this.d[5]) <= 0) {
            return;
        }
        this.Q0 = true;
        this.M0 = 0;
        ff.k.d().b(this.O0, i9);
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.X;
    }

    public final void j() {
        ArrayList arrayList;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            arrayList = this.p0;
            if (i9 >= arrayList.size()) {
                break;
            }
            ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i9);
            if (!imageReceiver.isAttachedToWindow()) {
                arrayList.remove(i9);
                i9--;
            }
            int i11 = imageReceiver.animatedFileDrawableRepeatMaxCount;
            if (i11 > 0 && this.u0 >= i11) {
                i10++;
            }
            i9++;
        }
        if (arrayList.size() == i10) {
            stop();
        } else {
            start();
        }
    }

    public final void k() {
        if (g()) {
            return;
        }
        u5 u5Var = this.n;
        if (u5Var != null) {
            u5Var.b.recycle();
            Arrays.fill(u5Var.a, (Object) null);
            this.n = null;
        }
        u5 u5Var2 = this.v;
        if (u5Var2 != null) {
            u5Var2.b.recycle();
            Arrays.fill(u5Var2.a, (Object) null);
            this.v = null;
        }
        DispatchQueue dispatchQueue = this.b0;
        if (dispatchQueue != null) {
            dispatchQueue.recycle();
            this.b0 = null;
        }
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i9 >= arrayList.size()) {
                arrayList.clear();
                t();
                return;
            } else {
                u5 u5Var3 = (u5) arrayList.get(i9);
                u5Var3.b.recycle();
                Arrays.fill(u5Var3.a, (Object) null);
                i9++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(Canvas canvas, boolean z10, long j10, int i9) {
        boolean z11;
        float width;
        float height;
        float[] fArr;
        int i10;
        if (!g() || this.w) {
            return;
        }
        long currentTimeMillis = j10 == 0 ? System.currentTimeMillis() : j10;
        RectF rectF = z10 ? this.l0[i9] : this.W;
        Paint paint = z10 ? this.m0[i9] : getPaint();
        if (!z10) {
            D(currentTimeMillis);
        }
        if (this.n == null) {
            return;
        }
        int[] iArr = this.P;
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
            PorterDuffXfermode porterDuffXfermode = (!z11 && this.n.f && paint.getAlpha() == 255) ? T0 : null;
            if (paint.getXfermode() != porterDuffXfermode) {
                paint.setXfermode(porterDuffXfermode);
            }
        }
        float f10 = this.T;
        float f11 = this.U;
        int[] iArr2 = this.d;
        if (!z10) {
            if (this.V) {
                u5 u5Var = this.n;
                int i12 = u5Var.c;
                int i13 = u5Var.d;
                int i14 = iArr2[2];
                if (i14 == 90 || i14 == 270) {
                    i12 = i13;
                    i13 = i12;
                }
                rectF.set(getBounds());
                width = rectF.width() / i12;
                this.T = width;
                height = rectF.height() / i13;
                this.U = height;
                this.V = false;
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
            int i16 = z10 ? i9 + 1 : 0;
            u5 u5Var2 = this.n;
            BitmapShader[] bitmapShaderArr = u5Var2.a;
            if (bitmapShaderArr[i16] == null) {
                Bitmap bitmap = u5Var2.b;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                bitmapShaderArr[i16] = new BitmapShader(bitmap, tileMode, tileMode);
            }
            BitmapShader bitmapShader = bitmapShaderArr[i16];
            paint.setShader(bitmapShader);
            Matrix[] matrixArr = this.R;
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
            Path[] pathArr = this.S;
            Path path = pathArr[i16];
            if (path == null) {
                path = new Path();
                pathArr[i16] = path;
            }
            boolean z12 = this.s0;
            RectF rectF2 = this.O;
            if (z12 || z10) {
                if (!z10) {
                    this.s0 = false;
                }
                int i18 = 0;
                while (true) {
                    int length2 = iArr.length;
                    fArr = R0;
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
        u5 u5Var3 = this.n;
        int i22 = u5Var3.c;
        int i23 = u5Var3.d;
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
        u5 u5Var = this.n;
        if (u5Var != null) {
            return u5Var.b;
        }
        u5 u5Var2 = this.r;
        if (u5Var2 != null) {
            return u5Var2.b;
        }
        u5 u5Var3 = this.s;
        if (u5Var3 != null) {
            return u5Var3.b;
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
        int i9;
        if (this.I >= 0) {
            return (int) this.I;
        }
        u5 u5Var = this.r;
        if (u5Var != null && (i9 = u5Var.e) != 0) {
            return i9;
        }
        u5 u5Var2 = this.n;
        if (u5Var2 != null) {
            return u5Var2.e;
        }
        return 0;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.V = true;
    }

    public final Bitmap p() {
        int i9 = this.f0;
        int i10 = this.e0;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(i9, i10, config);
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
            u5 u5Var = this.v;
            if (u5Var != null) {
                return u5Var.b;
            }
            return null;
        }
        if (this.v == null) {
            if (this.h.isEmpty()) {
                float f10 = this.d[0];
                float f11 = this.i0;
                this.v = new u5(Bitmap.createBitmap((int) (f10 * f11), (int) (r0[1] * f11), Bitmap.Config.ARGB_8888));
            } else {
                this.v = (u5) this.h.remove(0);
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
        AndroidUtilities.executeOnUIThread(new v5(this, 0));
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.X = false;
        AndroidUtilities.executeOnUIThread(new v5(this, 0));
    }

    public final void t() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.p0;
            if (i9 >= arrayList.size()) {
                return;
            }
            ((ImageReceiver) arrayList.get(i9)).invalidate();
            i9++;
        }
    }

    public final void u() {
        if (!this.o0.isEmpty()) {
            this.G = true;
            return;
        }
        int i9 = 0;
        this.X = false;
        this.Y = true;
        AndroidUtilities.executeOnUIThread(new v5(this, 0));
        if (this.z0 != null) {
            ff.h.c();
            mi0.P0.cancelRunnable(this.z0);
            this.z0 = null;
        }
        if (this.e == null) {
            if (this.Z != null) {
                this.Z.f();
                this.Z = null;
            }
            ArrayList arrayList = new ArrayList();
            u5 u5Var = this.n;
            if (u5Var != null) {
                arrayList.add(u5Var.b);
            }
            u5 u5Var2 = this.r;
            if (u5Var2 != null) {
                arrayList.add(u5Var2.b);
            }
            u5 u5Var3 = this.s;
            if (u5Var3 != null) {
                arrayList.add(u5Var3.b);
            }
            u5 u5Var4 = this.v;
            if (u5Var4 != null) {
                arrayList.add(u5Var4.b);
            }
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            while (i9 < size) {
                Object obj = arrayList2.get(i9);
                i9++;
                u5 u5Var5 = (u5) obj;
                if (u5Var5 != null) {
                    arrayList.add(u5Var5.b);
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
        v5 v5Var;
        v5 v5Var2;
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
                    if (z10 && (v5Var = this.e) != null) {
                        this.b0.cancelRunnable(v5Var);
                    }
                    DispatchQueue dispatchQueue = this.b0;
                    v5 v5Var3 = this.D0;
                    this.e = v5Var3;
                    dispatchQueue.postRunnable(v5Var3, 0L);
                } else if (this.t0) {
                    v5 v5Var4 = this.D0;
                    this.e = v5Var4;
                    DispatchQueuePoolBackground.execute(v5Var4);
                } else {
                    if (z10 && (v5Var2 = this.e) != null) {
                        S0.remove(v5Var2);
                    }
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = S0;
                    v5 v5Var5 = this.D0;
                    this.e = v5Var5;
                    scheduledThreadPoolExecutor.execute(v5Var5);
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
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(float f10, float f11, float f12, float f13) {
        float f14 = f13 + f11;
        float f15 = f12 + f10;
        RectF rectF = this.O;
        if (rectF.left == f10 && rectF.top == f11 && rectF.right == f15 && rectF.bottom == f14) {
            return;
        }
        rectF.set(f10, f11, f15, f14);
        this.s0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x5(File file, boolean z10, long j10, int i9, TLRPC.Document document, ImageLocation imageLocation, Object obj, long j11, int i10, boolean z11, int i11, int i12, fe.i iVar, int i13, boolean z12) {
        char c10;
        char c11;
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
        this.x0 = new v5(this, 2);
        this.A0 = new v5(this, 3);
        this.B0 = new v5(this, 4);
        this.C0 = 0;
        this.D0 = new v5(this, 5);
        this.E0 = new v5(this, 6);
        this.O0 = new w5(this, 0);
        this.C = file;
        this.b = SharedConfig.deviceIsAboveAverage();
        this.D = j10;
        this.E = i9;
        this.F = i10;
        this.e0 = i12;
        this.f0 = i11;
        this.g0 = z12;
        boolean z14 = iVar != null && i11 > 0 && i12 > 0;
        this.h0 = z14;
        this.k0 = document;
        getPaint().setFlags(3);
        if (j10 == 0 || (document == null && imageLocation == null)) {
            c10 = 0;
        } else {
            c10 = 0;
            this.q0 = new AnimatedFileDrawableStream(document, imageLocation, obj, i10, z11, i9, i13);
        }
        ff.h hVar = null;
        if (!z10 || z14) {
            c11 = 1;
        } else {
            c11 = 1;
            this.Z = AnimatedFileNative.a(file.getAbsolutePath(), iArr, i10, j10, this.q0, z11);
            this.a0 = this.Z == null && (!this.j0 || this.C0 > 15);
            if (this.Z != null && (iArr[c10] > 3840 || iArr[1] > 3840)) {
                this.Z.f();
                this.Z = null;
            }
            d();
            E();
            this.x = true;
        }
        if (z14) {
            this.Z = AnimatedFileNative.a(file.getAbsolutePath(), iArr, i10, j10, this.q0, z11);
            this.a0 = this.Z == null && (!this.j0 || this.C0 > 15);
            if (this.Z == null || (iArr[c10] <= 3840 && iArr[c11] <= 3840)) {
                j12 = j11;
                z13 = false;
                hVar = new ff.h(file, this, iVar, this.f0, this.e0, !this.t0, 0);
                this.v0 = hVar;
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
        this.v0 = hVar;
        if (j12 == 0) {
        }
    }
}
