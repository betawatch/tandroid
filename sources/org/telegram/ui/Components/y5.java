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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class y5 extends BitmapDrawable implements Animatable, lf.e {
    public static final float[] S0 = new float[8];
    public static final ScheduledThreadPoolExecutor T0 = new ScheduledThreadPoolExecutor(8, new ThreadPoolExecutor.DiscardPolicy());
    public static final PorterDuffXfermode U0 = new PorterDuffXfermode(PorterDuff.Mode.SRC);
    public w5 A0;
    public boolean B;
    public final w5 B0;
    public boolean C;
    public final w5 C0;
    public final File D;
    public int D0;
    public final long E;
    public final w5 E0;
    public final int F;
    public final w5 F0;
    public final int G;
    public w5 G0;
    public boolean H;
    public boolean H0;
    public volatile long I;
    public long I0;
    public volatile long J;
    public Bitmap J0;
    public boolean K;
    public AnimatedFileNative K0;
    public int L;
    public int L0;
    public boolean M;
    public int M0;
    public final Object N;
    public int N0;
    public boolean O;
    public volatile boolean O0;
    public final RectF P;
    public final x5 P0;
    public final int[] Q;
    public boolean Q0;
    public int[] R;
    public boolean R0;
    public final Matrix[] S;
    public final Path[] T;
    public float U;
    public float V;
    public boolean W;
    public final RectF X;
    public volatile boolean Y;
    public volatile boolean Z;
    public boolean a;
    public volatile AnimatedFileNative a0;
    public boolean b;
    public boolean b0;
    public int c;
    public DispatchQueue c0;
    public final int[] d;
    public float d0;
    public w5 e;
    public float e0;
    public boolean f;
    public int f0;
    public int g0;
    public final ArrayList h;
    public final boolean h0;
    public final boolean i0;
    public float j0;
    public boolean k0;
    public final TLRPC.Document l0;
    public final RectF[] m0;
    public v5 n;
    public final Paint[] n0;
    public View o0;
    public final ArrayList p0;
    public final ArrayList q0;
    public v5 r;
    public AnimatedFileDrawableStream r0;
    public v5 s;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public v5 v;
    public int v0;
    public boolean w;
    public final lf.g w0;
    public boolean x;
    public c5.c x0;
    public boolean y;
    public final w5 y0;
    public boolean z0;

    public y5(File file, boolean z4, long j10, int i10, TLRPC.Document document, ImageLocation imageLocation, Object obj, long j11, int i11, boolean z10) {
        this(file, z4, j10, i10, document, imageLocation, obj, j11, i11, z10, 0, 0, null, document != null ? 1 : 0, true);
    }

    public final void A(boolean z4) {
        this.u0 = z4;
        if (z4) {
            this.b = false;
        }
    }

    public final void B(int[] iArr) {
        boolean isEmpty = this.p0.isEmpty();
        int[] iArr2 = this.Q;
        if (!isEmpty) {
            if (this.R == null) {
                this.R = new int[4];
            }
            int[] iArr3 = this.R;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr3.length);
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if (!this.t0 && iArr[i10] != iArr2[i10]) {
                this.t0 = true;
            }
            iArr2[i10] = iArr[i10];
        }
    }

    public final void C(long j10, long j11) {
        this.d0 = j10 / 1000.0f;
        this.e0 = j11 / 1000.0f;
        if (j10 < 0 || o() >= j10) {
            return;
        }
        y(j10, true, false);
    }

    public final void D(long j10) {
        this.N0 = 0;
        if (this.O0) {
            this.O0 = false;
            AndroidUtilities.executeOnUIThread(new w5(this, 0));
        }
        boolean z4 = this.Q0 || (!this.Y && this.y);
        if (!this.Y) {
            if (this.Y || !this.y || !z4 || this.r == null) {
                return;
            }
            v5 v5Var = this.n;
            if (v5Var != null) {
                this.h.add(v5Var);
            }
            this.n = this.r;
            this.r = this.s;
            this.s = null;
            this.Q0 = false;
            x(false);
            return;
        }
        v5 v5Var2 = this.n;
        if (v5Var2 == null && this.r == null) {
            x(false);
            return;
        }
        if (this.r != null) {
            if (v5Var2 == null || (z4 && !this.a && this.J < 0)) {
                v5 v5Var3 = this.n;
                if (v5Var3 != null) {
                    this.h.add(v5Var3);
                }
                this.n = this.r;
                this.r = this.s;
                this.s = null;
                this.Q0 = false;
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
        if (this.k0 || (i10 = this.f0) <= 0 || (i11 = this.g0) <= 0 || (i12 = (iArr = this.d)[0]) <= 0 || (i13 = iArr[1]) <= 0) {
            this.j0 = 1.0f;
            return;
        }
        float max = Math.max(i11 / i12, i10 / i13);
        this.j0 = max;
        if (max <= 0.0f || max > 0.7d) {
            this.j0 = 1.0f;
        }
    }

    @Override // lf.e
    public final int a(Bitmap bitmap) {
        int i10;
        if (this.K0 == null) {
            return -1;
        }
        Canvas canvas = new Canvas(bitmap);
        Bitmap bitmap2 = this.J0;
        int[] iArr = this.d;
        if (bitmap2 == null) {
            this.J0 = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        }
        this.K0.c(this.J0, false, this.d0, this.e0, this.h0);
        long j10 = this.I0;
        if (j10 != 0 && ((i10 = iArr[3]) == 0 || j10 > i10)) {
            return 0;
        }
        int i11 = this.M0;
        int i12 = iArr[3];
        if (i11 == i12) {
            int i13 = this.L0 + 1;
            this.L0 = i13;
            if (i13 > 5) {
                return 0;
            }
        }
        this.M0 = i12;
        bitmap.eraseColor(0);
        canvas.save();
        float width = this.g0 / this.J0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.J0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        this.I0 = iArr[3];
        return 1;
    }

    @Override // lf.e
    public final void b() {
        this.K0 = AnimatedFileNative.a(this.D.getAbsolutePath(), this.d, this.G, this.E, this.r0, false);
    }

    @Override // lf.e
    public final void c() {
        AnimatedFileNative animatedFileNative = this.K0;
        if (animatedFileNative != null) {
            animatedFileNative.f();
            this.K0 = null;
        }
    }

    public final void d() {
        int i10;
        if (this.g0 == 0 && this.f0 == 0) {
            int[] iArr = this.d;
            int i11 = iArr[0];
            if (i11 > 3000 || (i10 = iArr[1]) > 3000) {
                this.g0 = i11 / 4;
                this.f0 = iArr[1] / 4;
            } else if (i11 > 2200 || i10 > 2200) {
                this.g0 = i11 / 2;
                this.f0 = i10 / 2;
            }
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        l(canvas, false, System.currentTimeMillis(), 0);
    }

    public final void e(ImageReceiver imageReceiver) {
        if (!this.q0.contains(imageReceiver)) {
            this.q0.add(imageReceiver);
            if (this.Y) {
                x(false);
            }
        }
        h();
    }

    public final void f(View view) {
        if (view != null) {
            ArrayList arrayList = this.p0;
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
        }
    }

    public final void finalize() {
        try {
            this.p0.clear();
            u();
        } finally {
            super.finalize();
        }
    }

    public final boolean g() {
        return this.i0 ? this.w0 != null : (this.a0 == null && this.x) ? false : true;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i10 = 0;
        if (this.x) {
            int[] iArr = this.d;
            int i11 = iArr[2];
            i10 = (i11 == 90 || i11 == 270) ? iArr[0] : iArr[1];
        }
        return i10 == 0 ? AndroidUtilities.dp(100.0f) : (int) (i10 * this.j0);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i10 = 0;
        if (this.x) {
            int[] iArr = this.d;
            int i11 = iArr[2];
            i10 = (i11 == 90 || i11 == 270) ? iArr[1] : iArr[0];
        }
        return i10 == 0 ? AndroidUtilities.dp(100.0f) : (int) (i10 * this.j0);
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
        w5 w5Var;
        if (this.w0 == null) {
            return;
        }
        boolean isEmpty = this.q0.isEmpty();
        if (isEmpty && this.G0 == null) {
            w5 w5Var2 = new w5(this, 1);
            this.G0 = w5Var2;
            AndroidUtilities.runOnUIThread(w5Var2, 600L);
        } else {
            if (isEmpty || (w5Var = this.G0) == null) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(w5Var);
            this.G0 = null;
        }
    }

    public final void i() {
        int i10;
        if (!this.Y || this.O0 || this.f) {
            if (this.R0) {
                this.R0 = false;
                this.N0 = 0;
                lf.j.d().g(this.P0);
                return;
            }
            return;
        }
        if (this.R0 || (i10 = this.d[5]) <= 0) {
            return;
        }
        this.R0 = true;
        this.N0 = 0;
        lf.j.d().b(this.P0, i10);
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.Y;
    }

    public final void j() {
        ArrayList arrayList;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.q0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i10);
            if (!imageReceiver.isAttachedToWindow()) {
                arrayList.remove(i10);
                i10--;
            }
            int i12 = imageReceiver.animatedFileDrawableRepeatMaxCount;
            if (i12 > 0 && this.v0 >= i12) {
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
        v5 v5Var = this.n;
        if (v5Var != null) {
            v5Var.b.recycle();
            Arrays.fill(v5Var.a, (Object) null);
            this.n = null;
        }
        v5 v5Var2 = this.v;
        if (v5Var2 != null) {
            v5Var2.b.recycle();
            Arrays.fill(v5Var2.a, (Object) null);
            this.v = null;
        }
        DispatchQueue dispatchQueue = this.c0;
        if (dispatchQueue != null) {
            dispatchQueue.recycle();
            this.c0 = null;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                arrayList.clear();
                t();
                return;
            } else {
                v5 v5Var3 = (v5) arrayList.get(i10);
                v5Var3.b.recycle();
                Arrays.fill(v5Var3.a, (Object) null);
                i10++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(Canvas canvas, boolean z4, long j10, int i10) {
        boolean z10;
        float width;
        float height;
        float[] fArr;
        int i11;
        if (!g() || this.w) {
            return;
        }
        long currentTimeMillis = j10 == 0 ? System.currentTimeMillis() : j10;
        RectF rectF = z4 ? this.m0[i10] : this.X;
        Paint paint = z4 ? this.n0[i10] : getPaint();
        if (!z4) {
            D(currentTimeMillis);
        }
        if (this.n == null) {
            return;
        }
        int[] iArr = this.Q;
        int length = iArr.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                z10 = false;
                break;
            } else {
                if (iArr[i12] != 0) {
                    z10 = true;
                    break;
                }
                i12++;
            }
        }
        if (!z4) {
            PorterDuffXfermode porterDuffXfermode = (!z10 && this.n.f && paint.getAlpha() == 255) ? U0 : null;
            if (paint.getXfermode() != porterDuffXfermode) {
                paint.setXfermode(porterDuffXfermode);
            }
        }
        float f10 = this.U;
        float f11 = this.V;
        int[] iArr2 = this.d;
        if (!z4) {
            if (this.W) {
                v5 v5Var = this.n;
                int i13 = v5Var.c;
                int i14 = v5Var.d;
                int i15 = iArr2[2];
                if (i15 == 90 || i15 == 270) {
                    i13 = i14;
                    i14 = i13;
                }
                rectF.set(getBounds());
                width = rectF.width() / i13;
                this.U = width;
                height = rectF.height() / i14;
                this.V = height;
                this.W = false;
            }
            if (z10) {
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
                canvas.scale(f10, f11);
                canvas.drawBitmap(this.n.b, 0.0f, 0.0f, paint);
                canvas.restore();
                return;
            }
            int i17 = z4 ? i10 + 1 : 0;
            v5 v5Var2 = this.n;
            BitmapShader[] bitmapShaderArr = v5Var2.a;
            if (bitmapShaderArr[i17] == null) {
                Bitmap bitmap = v5Var2.b;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                bitmapShaderArr[i17] = new BitmapShader(bitmap, tileMode, tileMode);
            }
            BitmapShader bitmapShader = bitmapShaderArr[i17];
            paint.setShader(bitmapShader);
            Matrix[] matrixArr = this.S;
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
            matrix.preScale(f10, f11);
            bitmapShader.setLocalMatrix(matrix);
            Path[] pathArr = this.T;
            Path path = pathArr[i17];
            if (path == null) {
                path = new Path();
                pathArr[i17] = path;
            }
            boolean z11 = this.t0;
            RectF rectF2 = this.P;
            if (z11 || z4) {
                if (!z4) {
                    this.t0 = false;
                }
                int i19 = 0;
                while (true) {
                    int length2 = iArr.length;
                    fArr = S0;
                    if (i19 >= length2) {
                        break;
                    }
                    int i20 = i19 * 2;
                    float f12 = iArr[i19];
                    fArr[i20] = f12;
                    fArr[i20 + 1] = f12;
                    i19++;
                }
                path.rewind();
                path.addRoundRect(z4 ? rectF : rectF2, fArr, Path.Direction.CW);
            }
            int i21 = iArr[0];
            int i22 = iArr[1];
            if (i21 != i22 || i22 != (i11 = iArr[2]) || i11 != iArr[3]) {
                canvas.drawPath(path, paint);
                return;
            }
            if (!z4) {
                rectF = rectF2;
            }
            float f13 = i21;
            canvas.drawRoundRect(rectF, f13, f13, paint);
            return;
        }
        v5 v5Var3 = this.n;
        int i23 = v5Var3.c;
        int i24 = v5Var3.d;
        int i25 = iArr2[2];
        if (i25 == 90 || i25 == 270) {
            i23 = i24;
            i24 = i23;
        }
        width = rectF.width() / i23;
        height = rectF.height() / i24;
        float f14 = width;
        f11 = height;
        f10 = f14;
        if (z10) {
        }
    }

    public final Bitmap m() {
        v5 v5Var = this.n;
        if (v5Var != null) {
            return v5Var.b;
        }
        v5 v5Var2 = this.r;
        if (v5Var2 != null) {
            return v5Var2.b;
        }
        v5 v5Var3 = this.s;
        if (v5Var3 != null) {
            return v5Var3.b;
        }
        return null;
    }

    public final float n() {
        if (this.d[4] == 0) {
            return 0.0f;
        }
        if (this.J >= 0) {
            return this.J / this.d[4];
        }
        int[] iArr = this.d;
        return iArr[3] / iArr[4];
    }

    public final int o() {
        int i10;
        if (this.J >= 0) {
            return (int) this.J;
        }
        v5 v5Var = this.r;
        if (v5Var != null && (i10 = v5Var.e) != 0) {
            return i10;
        }
        v5 v5Var2 = this.n;
        if (v5Var2 != null) {
            return v5Var2.e;
        }
        return 0;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.W = true;
    }

    public final Bitmap p() {
        int i10 = this.g0;
        int i11 = this.f0;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, config);
        Canvas canvas = new Canvas(createBitmap);
        AnimatedFileNative a2 = AnimatedFileNative.a(this.D.getAbsolutePath(), this.d, this.G, this.E, this.r0, false);
        if (a2 == null) {
            return createBitmap;
        }
        if (this.J0 == null) {
            int[] iArr = this.d;
            this.J0 = Bitmap.createBitmap(Math.max(1, iArr[0]), Math.max(1, iArr[1]), config);
        }
        a2.c(this.J0, false, this.d0, this.e0, true);
        a2.f();
        createBitmap.eraseColor(0);
        canvas.save();
        float width = this.g0 / this.J0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.J0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        return createBitmap;
    }

    public final Bitmap q(long j10, boolean z4) {
        if (this.x && this.a0 != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = this.r0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.cancel(false);
                this.r0.reset();
            }
            if (!z4) {
                this.a0.g(j10, z4);
            }
            int[] iArr = this.d;
            Bitmap createBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
            if ((z4 ? this.a0.b(createBitmap, j10) : this.a0.c(createBitmap, true, 0.0f, 0.0f, true)) != 0) {
                return createBitmap;
            }
            createBitmap.recycle();
        }
        return null;
    }

    public final Bitmap r(boolean z4) {
        if (this.a0 == null) {
            v5 v5Var = this.v;
            if (v5Var != null) {
                return v5Var.b;
            }
            return null;
        }
        if (this.v == null) {
            if (this.h.isEmpty()) {
                float f10 = this.d[0];
                float f11 = this.j0;
                this.v = new v5(Bitmap.createBitmap((int) (f10 * f11), (int) (r0[1] * f11), Bitmap.Config.ARGB_8888));
            } else {
                this.v = (v5) this.h.remove(0);
            }
        }
        this.a0.c(this.v.b, false, this.d0, this.e0, z4);
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
        if (this.Y || this.q0.isEmpty()) {
            return;
        }
        this.Y = true;
        this.O0 = false;
        x(false);
        AndroidUtilities.runOnUIThread(this.F0);
        AndroidUtilities.executeOnUIThread(new w5(this, 0));
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.Y = false;
        AndroidUtilities.executeOnUIThread(new w5(this, 0));
    }

    public final void t() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.q0;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((ImageReceiver) arrayList.get(i10)).invalidate();
            i10++;
        }
    }

    public final void u() {
        if (!this.p0.isEmpty()) {
            this.H = true;
            return;
        }
        int i10 = 0;
        this.Y = false;
        this.Z = true;
        AndroidUtilities.executeOnUIThread(new w5(this, 0));
        if (this.A0 != null) {
            lf.g.c();
            ij0.Q0.cancelRunnable(this.A0);
            this.A0 = null;
        }
        if (this.e == null) {
            if (this.a0 != null) {
                this.a0.f();
                this.a0 = null;
            }
            ArrayList arrayList = new ArrayList();
            v5 v5Var = this.n;
            if (v5Var != null) {
                arrayList.add(v5Var.b);
            }
            v5 v5Var2 = this.r;
            if (v5Var2 != null) {
                arrayList.add(v5Var2.b);
            }
            v5 v5Var3 = this.s;
            if (v5Var3 != null) {
                arrayList.add(v5Var3.b);
            }
            v5 v5Var4 = this.v;
            if (v5Var4 != null) {
                arrayList.add(v5Var4.b);
            }
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                v5 v5Var5 = (v5) obj;
                if (v5Var5 != null) {
                    arrayList.add(v5Var5.b);
                }
            }
            this.h.clear();
            this.n = null;
            this.r = null;
            this.s = null;
            this.v = null;
            DispatchQueue dispatchQueue = this.c0;
            if (dispatchQueue != null) {
                dispatchQueue.recycle();
                this.c0 = null;
            }
            getPaint().setShader(null);
            AndroidUtilities.recycleBitmaps(arrayList);
        } else {
            this.w = true;
        }
        AnimatedFileDrawableStream animatedFileDrawableStream = this.r0;
        if (animatedFileDrawableStream != null) {
            animatedFileDrawableStream.cancel(true);
            this.r0 = null;
        }
        t();
    }

    public final void v(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.q0;
        arrayList.remove(imageReceiver);
        if (arrayList.isEmpty()) {
            this.v0 = 0;
        }
        h();
    }

    public final void w(View view) {
        ArrayList arrayList = this.p0;
        arrayList.remove(view);
        if (arrayList.isEmpty()) {
            if (this.H) {
                u();
                return;
            }
            int[] iArr = this.R;
            if (iArr != null) {
                B(iArr);
            }
        }
    }

    public final void x(boolean z4) {
        w5 w5Var;
        w5 w5Var2;
        if (this.e == null || z4) {
            if ((!this.b || (this.s != null && (this.H0 || this.J < 0))) && this.r != null) {
                return;
            }
            if ((this.n == null || !this.f) && g() && !this.w) {
                if ((!this.Y && (!this.y || this.B)) || this.q0.isEmpty() || this.z0) {
                    return;
                }
                if (!this.s0) {
                    if (this.c0 == null) {
                        this.c0 = new DispatchQueue("decodeQueue" + this);
                    }
                    if (z4 && (w5Var = this.e) != null) {
                        this.c0.cancelRunnable(w5Var);
                    }
                    DispatchQueue dispatchQueue = this.c0;
                    w5 w5Var3 = this.E0;
                    this.e = w5Var3;
                    dispatchQueue.postRunnable(w5Var3, 0L);
                } else if (this.u0) {
                    w5 w5Var4 = this.E0;
                    this.e = w5Var4;
                    DispatchQueuePoolBackground.execute(w5Var4);
                } else {
                    if (z4 && (w5Var2 = this.e) != null) {
                        T0.remove(w5Var2);
                    }
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = T0;
                    w5 w5Var5 = this.E0;
                    this.e = w5Var5;
                    scheduledThreadPoolExecutor.execute(w5Var5);
                }
                this.H0 = true;
            }
        }
    }

    public final void y(long j10, boolean z4, boolean z10) {
        AnimatedFileDrawableStream animatedFileDrawableStream;
        synchronized (this.N) {
            try {
                this.I = j10;
                this.J = j10;
                this.H0 = false;
                if (this.a0 != null) {
                    this.a0.e();
                }
                if (this.x && (animatedFileDrawableStream = this.r0) != null) {
                    animatedFileDrawableStream.cancel(z4);
                    this.K = z4;
                    this.L = z4 ? 0 : 10;
                }
                if (z10 && this.y) {
                    this.B = false;
                    if (this.e == null) {
                        x(true);
                    } else {
                        this.C = true;
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
        RectF rectF = this.P;
        if (rectF.left == f10 && rectF.top == f11 && rectF.right == f15 && rectF.bottom == f14) {
            return;
        }
        rectF.set(f10, f11, f15, f14);
        this.t0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y5(File file, boolean z4, long j10, int i10, TLRPC.Document document, ImageLocation imageLocation, Object obj, long j11, int i11, boolean z10, int i12, int i13, ke.i iVar, int i14, boolean z11) {
        char c3;
        char c10;
        long j12;
        boolean z12;
        int[] iArr = new int[8];
        this.d = iArr;
        this.h = new ArrayList();
        this.I = -1L;
        this.J = -1L;
        this.N = new Object();
        this.P = new RectF();
        this.Q = new int[4];
        this.S = new Matrix[3];
        this.T = new Path[3];
        this.U = 1.0f;
        this.V = 1.0f;
        this.X = new RectF();
        this.j0 = 1.0f;
        this.m0 = new RectF[2];
        this.n0 = new Paint[2];
        this.p0 = new ArrayList();
        this.q0 = new ArrayList();
        this.t0 = true;
        this.y0 = new w5(this, 2);
        this.B0 = new w5(this, 3);
        this.C0 = new w5(this, 4);
        this.D0 = 0;
        this.E0 = new w5(this, 5);
        this.F0 = new w5(this, 6);
        this.P0 = new x5(this, 0);
        this.D = file;
        this.b = SharedConfig.deviceIsAboveAverage();
        this.E = j10;
        this.F = i10;
        this.G = i11;
        this.f0 = i13;
        this.g0 = i12;
        this.h0 = z11;
        boolean z13 = iVar != null && i12 > 0 && i13 > 0;
        this.i0 = z13;
        this.l0 = document;
        getPaint().setFlags(3);
        if (j10 == 0 || (document == null && imageLocation == null)) {
            c3 = 0;
        } else {
            c3 = 0;
            this.r0 = new AnimatedFileDrawableStream(document, imageLocation, obj, i11, z10, i10, i14);
        }
        lf.g gVar = null;
        if (!z4 || z13) {
            c10 = 1;
        } else {
            c10 = 1;
            this.a0 = AnimatedFileNative.a(file.getAbsolutePath(), iArr, i11, j10, this.r0, z10);
            this.b0 = this.a0 == null && (!this.k0 || this.D0 > 15);
            if (this.a0 != null && (iArr[c3] > 3840 || iArr[1] > 3840)) {
                this.a0.f();
                this.a0 = null;
            }
            d();
            E();
            this.x = true;
        }
        if (z13) {
            this.a0 = AnimatedFileNative.a(file.getAbsolutePath(), iArr, i11, j10, this.r0, z10);
            this.b0 = this.a0 == null && (!this.k0 || this.D0 > 15);
            if (this.a0 == null || (iArr[c3] <= 3840 && iArr[c10] <= 3840)) {
                j12 = j11;
                z12 = false;
                gVar = new lf.g(file, this, iVar, this.g0, this.f0, !this.u0, 0);
                this.w0 = gVar;
                if (j12 == 0) {
                    y(j12, z12, z12);
                    return;
                }
                return;
            }
            this.a0.f();
            this.a0 = null;
        }
        j12 = j11;
        z12 = false;
        this.w0 = gVar;
        if (j12 == 0) {
        }
    }
}
