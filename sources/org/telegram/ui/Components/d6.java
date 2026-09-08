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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class d6 extends BitmapDrawable implements Animatable, yf.c {
    public static final float[] V0 = new float[8];
    public static final ScheduledThreadPoolExecutor W0 = new ScheduledThreadPoolExecutor(8, new ThreadPoolExecutor.DiscardPolicy());
    public static final PorterDuffXfermode X0 = new PorterDuffXfermode(PorterDuff.Mode.SRC);
    public com.google.android.gms.internal.cast.a A0;
    public final b6 B0;
    public boolean C0;
    public b6 D0;
    public boolean E;
    public final b6 E0;
    public boolean F;
    public final b6 F0;
    public final File G;
    public int G0;
    public final long H;
    public final b6 H0;
    public final int I;
    public final b6 I0;
    public final int J;
    public b6 J0;
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
    public final c6 S0;
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
    public b6 e;
    public boolean e0;
    public boolean f;
    public DispatchQueue f0;
    public float g0;
    public final ArrayList h;
    public float h0;
    public int i0;
    public int j0;
    public final boolean k0;
    public final boolean l0;
    public float m0;
    public a6 n;
    public boolean n0;
    public final TLRPC.Document o0;
    public final RectF[] p0;
    public final Paint[] q0;
    public a6 r;
    public View r0;
    public a6 s;
    public final ArrayList s0;
    public final ArrayList t0;
    public AnimatedFileDrawableStream u0;
    public a6 v;
    public boolean v0;
    public boolean w;
    public boolean w0;
    public boolean x;
    public boolean x0;
    public boolean y;
    public int y0;
    public final yf.e z0;

    public d6(File file, boolean z10, long j3, int i10, TLRPC.Document document, ImageLocation imageLocation, Object obj, long j10, int i11, boolean z11) {
        this(file, z10, j3, i10, document, imageLocation, obj, j10, i11, z11, 0, 0, null, document != null ? 1 : 0, true);
    }

    public final void A(boolean z10) {
        this.x0 = z10;
        if (z10) {
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
        for (int i10 = 0; i10 < 4; i10++) {
            if (!this.w0 && iArr[i10] != iArr2[i10]) {
                this.w0 = true;
            }
            iArr2[i10] = iArr[i10];
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
        this.Q0 = 0;
        if (this.R0) {
            this.R0 = false;
            AndroidUtilities.executeOnUIThread(new b6(this, 0));
        }
        boolean z10 = this.T0 || (!this.b0 && this.y);
        if (!this.b0) {
            if (this.b0 || !this.y || !z10 || this.r == null) {
                return;
            }
            a6 a6Var = this.n;
            if (a6Var != null) {
                this.h.add(a6Var);
            }
            this.n = this.r;
            this.r = this.s;
            this.s = null;
            this.T0 = false;
            x(false);
            return;
        }
        a6 a6Var2 = this.n;
        if (a6Var2 == null && this.r == null) {
            x(false);
            return;
        }
        if (this.r != null) {
            if (a6Var2 == null || (z10 && !this.a && this.M < 0)) {
                a6 a6Var3 = this.n;
                if (a6Var3 != null) {
                    this.h.add(a6Var3);
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
        int i10;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        if (this.n0 || (i10 = this.i0) <= 0 || (i11 = this.j0) <= 0 || (i12 = (iArr = this.d)[0]) <= 0 || (i13 = iArr[1]) <= 0) {
            this.m0 = 1.0f;
            return;
        }
        float max = Math.max(i11 / i12, i10 / i13);
        this.m0 = max;
        if (max <= 0.0f || max > 0.7d) {
            this.m0 = 1.0f;
        }
    }

    @Override // yf.c
    public final int a(Bitmap bitmap) {
        int i10;
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
        if (j3 != 0 && ((i10 = iArr[3]) == 0 || j3 > i10)) {
            return 0;
        }
        int i11 = this.P0;
        int i12 = iArr[3];
        if (i11 == i12) {
            int i13 = this.O0 + 1;
            this.O0 = i13;
            if (i13 > 5) {
                return 0;
            }
        }
        this.P0 = i12;
        bitmap.eraseColor(0);
        canvas.save();
        float width = this.j0 / this.M0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.M0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        this.L0 = iArr[3];
        return 1;
    }

    @Override // yf.c
    public final void b() {
        this.N0 = AnimatedFileNative.a(this.G.getAbsolutePath(), this.d, this.J, this.H, this.u0, false);
    }

    @Override // yf.c
    public final void c() {
        AnimatedFileNative animatedFileNative = this.N0;
        if (animatedFileNative != null) {
            animatedFileNative.f();
            this.N0 = null;
        }
    }

    public final void d() {
        int i10;
        if (this.j0 == 0 && this.i0 == 0) {
            int[] iArr = this.d;
            int i11 = iArr[0];
            if (i11 > 3000 || (i10 = iArr[1]) > 3000) {
                this.j0 = i11 / 4;
                this.i0 = iArr[1] / 4;
            } else if (i11 > 2200 || i10 > 2200) {
                this.j0 = i11 / 2;
                this.i0 = i10 / 2;
            }
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        l(canvas, false, System.currentTimeMillis(), 0);
    }

    public final void e(ImageReceiver imageReceiver) {
        if (!this.t0.contains(imageReceiver)) {
            this.t0.add(imageReceiver);
            if (this.b0) {
                x(false);
            }
        }
        h();
    }

    public final void f(View view) {
        if (view != null) {
            ArrayList arrayList = this.s0;
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
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
        return this.l0 ? this.z0 != null : (this.d0 == null && this.x) ? false : true;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i10 = 0;
        if (this.x) {
            int[] iArr = this.d;
            int i11 = iArr[2];
            i10 = (i11 == 90 || i11 == 270) ? iArr[0] : iArr[1];
        }
        return i10 == 0 ? AndroidUtilities.dp(100.0f) : (int) (i10 * this.m0);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i10 = 0;
        if (this.x) {
            int[] iArr = this.d;
            int i11 = iArr[2];
            i10 = (i11 == 90 || i11 == 270) ? iArr[1] : iArr[0];
        }
        return i10 == 0 ? AndroidUtilities.dp(100.0f) : (int) (i10 * this.m0);
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
        b6 b6Var;
        if (this.z0 == null) {
            return;
        }
        boolean isEmpty = this.t0.isEmpty();
        if (isEmpty && this.J0 == null) {
            b6 b6Var2 = new b6(this, 1);
            this.J0 = b6Var2;
            AndroidUtilities.runOnUIThread(b6Var2, 600L);
        } else {
            if (isEmpty || (b6Var = this.J0) == null) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(b6Var);
            this.J0 = null;
        }
    }

    public final void i() {
        int i10;
        if (!this.b0 || this.R0 || this.f) {
            if (this.U0) {
                this.U0 = false;
                this.Q0 = 0;
                yf.h.d().g(this.S0);
                return;
            }
            return;
        }
        if (this.U0 || (i10 = this.d[5]) <= 0) {
            return;
        }
        this.U0 = true;
        this.Q0 = 0;
        yf.h.d().b(this.S0, i10);
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.b0;
    }

    public final void j() {
        ArrayList arrayList;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.t0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i10);
            if (!imageReceiver.isAttachedToWindow()) {
                arrayList.remove(i10);
                i10--;
            }
            int i12 = imageReceiver.animatedFileDrawableRepeatMaxCount;
            if (i12 > 0 && this.y0 >= i12) {
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
        a6 a6Var = this.n;
        if (a6Var != null) {
            a6Var.b.recycle();
            Arrays.fill(a6Var.a, (Object) null);
            this.n = null;
        }
        a6 a6Var2 = this.v;
        if (a6Var2 != null) {
            a6Var2.b.recycle();
            Arrays.fill(a6Var2.a, (Object) null);
            this.v = null;
        }
        DispatchQueue dispatchQueue = this.f0;
        if (dispatchQueue != null) {
            dispatchQueue.recycle();
            this.f0 = null;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                arrayList.clear();
                t();
                return;
            } else {
                a6 a6Var3 = (a6) arrayList.get(i10);
                a6Var3.b.recycle();
                Arrays.fill(a6Var3.a, (Object) null);
                i10++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(Canvas canvas, boolean z10, long j3, int i10) {
        boolean z11;
        float width;
        float height;
        float[] fArr;
        int i11;
        if (!g() || this.w) {
            return;
        }
        long currentTimeMillis = j3 == 0 ? System.currentTimeMillis() : j3;
        RectF rectF = z10 ? this.p0[i10] : this.a0;
        Paint paint = z10 ? this.q0[i10] : getPaint();
        if (!z10) {
            D(currentTimeMillis);
        }
        if (this.n == null) {
            return;
        }
        int[] iArr = this.T;
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
            PorterDuffXfermode porterDuffXfermode = (!z11 && this.n.f && paint.getAlpha() == 255) ? X0 : null;
            if (paint.getXfermode() != porterDuffXfermode) {
                paint.setXfermode(porterDuffXfermode);
            }
        }
        float f7 = this.X;
        float f10 = this.Y;
        int[] iArr2 = this.d;
        if (!z10) {
            if (this.Z) {
                a6 a6Var = this.n;
                int i13 = a6Var.c;
                int i14 = a6Var.d;
                int i15 = iArr2[2];
                if (i15 == 90 || i15 == 270) {
                    i13 = i14;
                    i14 = i13;
                }
                rectF.set(getBounds());
                width = rectF.width() / i13;
                this.X = width;
                height = rectF.height() / i14;
                this.Y = height;
                this.Z = false;
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
                canvas.scale(f7, f10);
                canvas.drawBitmap(this.n.b, 0.0f, 0.0f, paint);
                canvas.restore();
                return;
            }
            int i17 = z10 ? i10 + 1 : 0;
            a6 a6Var2 = this.n;
            BitmapShader[] bitmapShaderArr = a6Var2.a;
            if (bitmapShaderArr[i17] == null) {
                Bitmap bitmap = a6Var2.b;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                bitmapShaderArr[i17] = new BitmapShader(bitmap, tileMode, tileMode);
            }
            BitmapShader bitmapShader = bitmapShaderArr[i17];
            paint.setShader(bitmapShader);
            Matrix[] matrixArr = this.V;
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
            matrix.preScale(f7, f10);
            bitmapShader.setLocalMatrix(matrix);
            Path[] pathArr = this.W;
            Path path = pathArr[i17];
            if (path == null) {
                path = new Path();
                pathArr[i17] = path;
            }
            boolean z12 = this.w0;
            RectF rectF2 = this.S;
            if (z12 || z10) {
                if (!z10) {
                    this.w0 = false;
                }
                int i19 = 0;
                while (true) {
                    int length2 = iArr.length;
                    fArr = V0;
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
        a6 a6Var3 = this.n;
        int i23 = a6Var3.c;
        int i24 = a6Var3.d;
        int i25 = iArr2[2];
        if (i25 == 90 || i25 == 270) {
            i23 = i24;
            i24 = i23;
        }
        width = rectF.width() / i23;
        height = rectF.height() / i24;
        float f13 = width;
        f10 = height;
        f7 = f13;
        if (z11) {
        }
    }

    public final Bitmap m() {
        a6 a6Var = this.n;
        if (a6Var != null) {
            return a6Var.b;
        }
        a6 a6Var2 = this.r;
        if (a6Var2 != null) {
            return a6Var2.b;
        }
        a6 a6Var3 = this.s;
        if (a6Var3 != null) {
            return a6Var3.b;
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
        int i10;
        if (this.M >= 0) {
            return (int) this.M;
        }
        a6 a6Var = this.r;
        if (a6Var != null && (i10 = a6Var.e) != 0) {
            return i10;
        }
        a6 a6Var2 = this.n;
        if (a6Var2 != null) {
            return a6Var2.e;
        }
        return 0;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.Z = true;
    }

    public final Bitmap p() {
        int i10 = this.j0;
        int i11 = this.i0;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, config);
        Canvas canvas = new Canvas(createBitmap);
        AnimatedFileNative a2 = AnimatedFileNative.a(this.G.getAbsolutePath(), this.d, this.J, this.H, this.u0, false);
        if (a2 == null) {
            return createBitmap;
        }
        if (this.M0 == null) {
            int[] iArr = this.d;
            this.M0 = Bitmap.createBitmap(Math.max(1, iArr[0]), Math.max(1, iArr[1]), config);
        }
        a2.c(this.M0, false, this.g0, this.h0, true);
        a2.f();
        createBitmap.eraseColor(0);
        canvas.save();
        float width = this.j0 / this.M0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.M0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        return createBitmap;
    }

    public final Bitmap q(long j3, boolean z10) {
        if (this.x && this.d0 != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = this.u0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.cancel(false);
                this.u0.reset();
            }
            if (!z10) {
                this.d0.g(j3, z10);
            }
            int[] iArr = this.d;
            Bitmap createBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
            if ((z10 ? this.d0.b(createBitmap, j3) : this.d0.c(createBitmap, true, 0.0f, 0.0f, true)) != 0) {
                return createBitmap;
            }
            createBitmap.recycle();
        }
        return null;
    }

    public final Bitmap r(boolean z10) {
        if (this.d0 == null) {
            a6 a6Var = this.v;
            if (a6Var != null) {
                return a6Var.b;
            }
            return null;
        }
        if (this.v == null) {
            if (this.h.isEmpty()) {
                float f7 = this.d[0];
                float f10 = this.m0;
                this.v = new a6(Bitmap.createBitmap((int) (f7 * f10), (int) (r0[1] * f10), Bitmap.Config.ARGB_8888));
            } else {
                this.v = (a6) this.h.remove(0);
            }
        }
        this.d0.c(this.v.b, false, this.g0, this.h0, z10);
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
        if (this.b0 || this.t0.isEmpty()) {
            return;
        }
        this.b0 = true;
        this.R0 = false;
        x(false);
        AndroidUtilities.runOnUIThread(this.I0);
        AndroidUtilities.executeOnUIThread(new b6(this, 0));
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.b0 = false;
        AndroidUtilities.executeOnUIThread(new b6(this, 0));
    }

    public final void t() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.t0;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((ImageReceiver) arrayList.get(i10)).invalidate();
            i10++;
        }
    }

    public final void u() {
        if (!this.s0.isEmpty()) {
            this.K = true;
            return;
        }
        int i10 = 0;
        this.b0 = false;
        this.c0 = true;
        AndroidUtilities.executeOnUIThread(new b6(this, 0));
        if (this.D0 != null) {
            yf.e.c();
            xi0.T0.cancelRunnable(this.D0);
            this.D0 = null;
        }
        if (this.e == null) {
            if (this.d0 != null) {
                this.d0.f();
                this.d0 = null;
            }
            ArrayList arrayList = new ArrayList();
            a6 a6Var = this.n;
            if (a6Var != null) {
                arrayList.add(a6Var.b);
            }
            a6 a6Var2 = this.r;
            if (a6Var2 != null) {
                arrayList.add(a6Var2.b);
            }
            a6 a6Var3 = this.s;
            if (a6Var3 != null) {
                arrayList.add(a6Var3.b);
            }
            a6 a6Var4 = this.v;
            if (a6Var4 != null) {
                arrayList.add(a6Var4.b);
            }
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                a6 a6Var5 = (a6) obj;
                if (a6Var5 != null) {
                    arrayList.add(a6Var5.b);
                }
            }
            this.h.clear();
            this.n = null;
            this.r = null;
            this.s = null;
            this.v = null;
            DispatchQueue dispatchQueue = this.f0;
            if (dispatchQueue != null) {
                dispatchQueue.recycle();
                this.f0 = null;
            }
            getPaint().setShader(null);
            AndroidUtilities.recycleBitmaps(arrayList);
        } else {
            this.w = true;
        }
        AnimatedFileDrawableStream animatedFileDrawableStream = this.u0;
        if (animatedFileDrawableStream != null) {
            animatedFileDrawableStream.cancel(true);
            this.u0 = null;
        }
        t();
    }

    public final void v(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.t0;
        arrayList.remove(imageReceiver);
        if (arrayList.isEmpty()) {
            this.y0 = 0;
        }
        h();
    }

    public final void w(View view) {
        ArrayList arrayList = this.s0;
        arrayList.remove(view);
        if (arrayList.isEmpty()) {
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

    public final void x(boolean z10) {
        b6 b6Var;
        b6 b6Var2;
        if (this.e == null || z10) {
            if ((!this.b || (this.s != null && (this.K0 || this.M < 0))) && this.r != null) {
                return;
            }
            if ((this.n == null || !this.f) && g() && !this.w) {
                if ((!this.b0 && (!this.y || this.E)) || this.t0.isEmpty() || this.C0) {
                    return;
                }
                if (!this.v0) {
                    if (this.f0 == null) {
                        this.f0 = new DispatchQueue("decodeQueue" + this);
                    }
                    if (z10 && (b6Var = this.e) != null) {
                        this.f0.cancelRunnable(b6Var);
                    }
                    DispatchQueue dispatchQueue = this.f0;
                    b6 b6Var3 = this.H0;
                    this.e = b6Var3;
                    dispatchQueue.postRunnable(b6Var3, 0L);
                } else if (this.x0) {
                    b6 b6Var4 = this.H0;
                    this.e = b6Var4;
                    DispatchQueuePoolBackground.execute(b6Var4);
                } else {
                    if (z10 && (b6Var2 = this.e) != null) {
                        W0.remove(b6Var2);
                    }
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = W0;
                    b6 b6Var5 = this.H0;
                    this.e = b6Var5;
                    scheduledThreadPoolExecutor.execute(b6Var5);
                }
                this.K0 = true;
            }
        }
    }

    public final void y(long j3, boolean z10, boolean z11) {
        AnimatedFileDrawableStream animatedFileDrawableStream;
        synchronized (this.Q) {
            try {
                this.L = j3;
                this.M = j3;
                this.K0 = false;
                if (this.d0 != null) {
                    this.d0.e();
                }
                if (this.x && (animatedFileDrawableStream = this.u0) != null) {
                    animatedFileDrawableStream.cancel(z10);
                    this.N = z10;
                    this.O = z10 ? 0 : 10;
                }
                if (z11 && this.y) {
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

    public final void z(float f7, float f10, float f11, float f12) {
        float f13 = f12 + f10;
        float f14 = f11 + f7;
        RectF rectF = this.S;
        if (rectF.left == f7 && rectF.top == f10 && rectF.right == f14 && rectF.bottom == f13) {
            return;
        }
        rectF.set(f7, f10, f14, f13);
        this.w0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d6(File file, boolean z10, long j3, int i10, TLRPC.Document document, ImageLocation imageLocation, Object obj, long j10, int i11, boolean z11, int i12, int i13, b2.n1 n1Var, int i14, boolean z12) {
        char c10;
        char c11;
        long j11;
        boolean z13;
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
        this.s0 = new ArrayList();
        this.t0 = new ArrayList();
        this.w0 = true;
        this.B0 = new b6(this, 2);
        this.E0 = new b6(this, 3);
        this.F0 = new b6(this, 4);
        this.G0 = 0;
        this.H0 = new b6(this, 5);
        this.I0 = new b6(this, 6);
        this.S0 = new c6(this, 0);
        this.G = file;
        this.b = SharedConfig.deviceIsAboveAverage();
        this.H = j3;
        this.I = i10;
        this.J = i11;
        this.i0 = i13;
        this.j0 = i12;
        this.k0 = z12;
        boolean z14 = n1Var != null && i12 > 0 && i13 > 0;
        this.l0 = z14;
        this.o0 = document;
        getPaint().setFlags(3);
        if (j3 == 0 || (document == null && imageLocation == null)) {
            c10 = 0;
        } else {
            c10 = 0;
            this.u0 = new AnimatedFileDrawableStream(document, imageLocation, obj, i11, z11, i10, i14);
        }
        yf.e eVar = null;
        if (!z10 || z14) {
            c11 = 1;
        } else {
            c11 = 1;
            this.d0 = AnimatedFileNative.a(file.getAbsolutePath(), iArr, i11, j3, this.u0, z11);
            this.e0 = this.d0 == null && (!this.n0 || this.G0 > 15);
            if (this.d0 != null && (iArr[c10] > 3840 || iArr[1] > 3840)) {
                this.d0.f();
                this.d0 = null;
            }
            d();
            E();
            this.x = true;
        }
        if (z14) {
            this.d0 = AnimatedFileNative.a(file.getAbsolutePath(), iArr, i11, j3, this.u0, z11);
            this.e0 = this.d0 == null && (!this.n0 || this.G0 > 15);
            if (this.d0 == null || (iArr[c10] <= 3840 && iArr[c11] <= 3840)) {
                j11 = j10;
                z13 = false;
                eVar = new yf.e(file, this, n1Var, this.j0, this.i0, !this.x0, 0);
                this.z0 = eVar;
                if (j11 == 0) {
                    y(j11, z13, z13);
                    return;
                }
                return;
            }
            this.d0.f();
            this.d0 = null;
        }
        j11 = j10;
        z13 = false;
        this.z0 = eVar;
        if (j11 == 0) {
        }
    }
}
