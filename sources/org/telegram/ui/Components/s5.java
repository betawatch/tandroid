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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s5 extends BitmapDrawable implements Animatable, rf.c {
    public static final float[] V0 = new float[8];
    public static final ScheduledThreadPoolExecutor W0 = new ScheduledThreadPoolExecutor(8, new ThreadPoolExecutor.DiscardPolicy());
    public static final PorterDuffXfermode X0 = new PorterDuffXfermode(PorterDuff.Mode.SRC);
    public ae.j A0;
    public final q5 B0;
    public boolean C0;
    public boolean D;
    public q5 D0;
    public boolean E;
    public final q5 E0;
    public boolean F;
    public final q5 F0;
    public final File G;
    public int G0;
    public final long H;
    public final q5 H0;
    public final int I;
    public final q5 I0;
    public final int J;
    public q5 J0;
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
    public final r5 S0;
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
    public q5 e;
    public boolean e0;
    public boolean f;
    public org.telegram.messenger.s5 f0;
    public float g0;
    public final ArrayList h;
    public float h0;
    public int i0;
    public int j0;
    public final boolean k0;
    public final boolean l0;
    public float m0;
    public p5 n;
    public boolean n0;
    public final TLRPC.Document o0;
    public final RectF[] p0;
    public final Paint[] q0;
    public p5 r;
    public WeakReference r0;
    public p5 s;
    public final je.b s0;
    public final je.b t0;
    public AnimatedFileDrawableStream u0;
    public boolean v0;
    public p5 w;
    public boolean w0;
    public boolean x;
    public boolean x0;
    public boolean y;
    public int y0;
    public final rf.e z0;

    public s5(File file, boolean z10, long j10, int i10, TLRPC.Document document, org.telegram.messenger.ic icVar, Object obj, long j11, int i11, boolean z11) {
        this(file, z10, j10, i10, document, icVar, obj, j11, i11, z11, 0, 0, null, document != null ? 1 : 0, true);
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

    public final void C(long j10, long j11) {
        this.g0 = j10 / 1000.0f;
        this.h0 = j11 / 1000.0f;
        if (j10 < 0 || o() >= j10) {
            return;
        }
        y(j10, true, false);
    }

    public final void D(long j10) {
        int i10 = 0;
        this.Q0 = 0;
        if (this.R0) {
            this.R0 = false;
            q5 q5Var = new q5(this, i10);
            Typeface typeface = org.telegram.messenger.i0.a;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                org.telegram.messenger.i0.g3(q5Var);
            } else {
                q5Var.run();
            }
        }
        boolean z10 = this.T0 || (!this.b0 && this.D);
        if (!this.b0) {
            if (this.b0 || !this.D || !z10 || this.r == null) {
                return;
            }
            p5 p5Var = this.n;
            if (p5Var != null) {
                this.h.add(p5Var);
            }
            this.n = this.r;
            this.r = this.s;
            this.s = null;
            this.T0 = false;
            x(false);
            return;
        }
        p5 p5Var2 = this.n;
        if (p5Var2 == null && this.r == null) {
            x(false);
            return;
        }
        if (this.r != null) {
            if (p5Var2 == null || (z10 && !this.a && this.M < 0)) {
                p5 p5Var3 = this.n;
                if (p5Var3 != null) {
                    this.h.add(p5Var3);
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

    @Override // rf.c
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
        long j10 = this.L0;
        if (j10 != 0 && ((i10 = iArr[3]) == 0 || j10 > i10)) {
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

    @Override // rf.c
    public final void b() {
        this.N0 = AnimatedFileNative.a(this.G.getAbsolutePath(), this.d, this.J, this.H, this.u0, false);
    }

    @Override // rf.c
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
        int i10 = 0;
        if (this.y) {
            int[] iArr = this.d;
            int i11 = iArr[2];
            i10 = (i11 == 90 || i11 == 270) ? iArr[0] : iArr[1];
        }
        return i10 == 0 ? org.telegram.messenger.i0.L(100.0f) : (int) (i10 * this.m0);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i10 = 0;
        if (this.y) {
            int[] iArr = this.d;
            int i11 = iArr[2];
            i10 = (i11 == 90 || i11 == 270) ? iArr[1] : iArr[0];
        }
        return i10 == 0 ? org.telegram.messenger.i0.L(100.0f) : (int) (i10 * this.m0);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        int i10 = 0;
        if (this.y) {
            int[] iArr = this.d;
            int i11 = iArr[2];
            i10 = (i11 == 90 || i11 == 270) ? iArr[0] : iArr[1];
        }
        return i10 == 0 ? org.telegram.messenger.i0.L(100.0f) : i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        int i10 = 0;
        if (this.y) {
            int[] iArr = this.d;
            int i11 = iArr[2];
            i10 = (i11 == 90 || i11 == 270) ? iArr[1] : iArr[0];
        }
        return i10 == 0 ? org.telegram.messenger.i0.L(100.0f) : i10;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        q5 q5Var;
        if (this.z0 == null) {
            return;
        }
        boolean isEmpty = this.t0.isEmpty();
        if (isEmpty && this.J0 == null) {
            q5 q5Var2 = new q5(this, 3);
            this.J0 = q5Var2;
            org.telegram.messenger.i0.h3(q5Var2, 600L);
        } else {
            if (isEmpty || (q5Var = this.J0) == null) {
                return;
            }
            org.telegram.messenger.i0.r(q5Var);
            this.J0 = null;
        }
    }

    public final void i() {
        int i10;
        if (!this.b0 || this.R0 || this.f) {
            if (this.U0) {
                this.U0 = false;
                this.Q0 = 0;
                rf.g.d().g(this.S0);
                return;
            }
            return;
        }
        if (this.U0 || (i10 = this.d[5]) <= 0) {
            return;
        }
        this.U0 = true;
        this.Q0 = 0;
        rf.g.d().b(this.S0, i10);
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.b0;
    }

    public final void j() {
        je.b bVar = this.t0;
        Iterator it = bVar.iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            ImageReceiver imageReceiver = (ImageReceiver) it.next();
            if (imageReceiver.x1) {
                i10++;
            } else {
                bVar.remove(imageReceiver);
            }
            int i12 = imageReceiver.C1;
            if (i12 > 0 && this.y0 >= i12) {
                i11++;
            }
        }
        if (i10 == i11) {
            stop();
        } else {
            start();
        }
    }

    public final void k() {
        if (g()) {
            return;
        }
        p5 p5Var = this.n;
        if (p5Var != null) {
            p5Var.b.recycle();
            Arrays.fill(p5Var.a, (Object) null);
            this.n = null;
        }
        p5 p5Var2 = this.w;
        if (p5Var2 != null) {
            p5Var2.b.recycle();
            Arrays.fill(p5Var2.a, (Object) null);
            this.w = null;
        }
        org.telegram.messenger.s5 s5Var = this.f0;
        if (s5Var != null) {
            s5Var.recycle();
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
                p5 p5Var3 = (p5) arrayList.get(i10);
                p5Var3.b.recycle();
                Arrays.fill(p5Var3.a, (Object) null);
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
        if (!g() || this.x) {
            return;
        }
        long currentTimeMillis = j10 == 0 ? System.currentTimeMillis() : j10;
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
                p5 p5Var = this.n;
                int i13 = p5Var.c;
                int i14 = p5Var.d;
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
            p5 p5Var2 = this.n;
            BitmapShader[] bitmapShaderArr = p5Var2.a;
            if (bitmapShaderArr[i17] == null) {
                Bitmap bitmap = p5Var2.b;
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
        p5 p5Var3 = this.n;
        int i23 = p5Var3.c;
        int i24 = p5Var3.d;
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
        p5 p5Var = this.n;
        if (p5Var != null) {
            return p5Var.b;
        }
        p5 p5Var2 = this.r;
        if (p5Var2 != null) {
            return p5Var2.b;
        }
        p5 p5Var3 = this.s;
        if (p5Var3 != null) {
            return p5Var3.b;
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
        p5 p5Var = this.r;
        if (p5Var != null && (i10 = p5Var.e) != 0) {
            return i10;
        }
        p5 p5Var2 = this.n;
        if (p5Var2 != null) {
            return p5Var2.e;
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

    public final Bitmap q(long j10, boolean z10) {
        if (this.y && this.d0 != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = this.u0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.b(false);
                this.u0.d();
            }
            if (!z10) {
                this.d0.g(j10, z10);
            }
            int[] iArr = this.d;
            Bitmap createBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
            if ((z10 ? this.d0.b(j10, createBitmap) : this.d0.c(createBitmap, true, 0.0f, 0.0f, true)) != 0) {
                return createBitmap;
            }
            createBitmap.recycle();
        }
        return null;
    }

    public final Bitmap r(boolean z10) {
        if (this.d0 == null) {
            p5 p5Var = this.w;
            if (p5Var != null) {
                return p5Var.b;
            }
            return null;
        }
        if (this.w == null) {
            if (this.h.isEmpty()) {
                float f7 = this.d[0];
                float f10 = this.m0;
                this.w = new p5(Bitmap.createBitmap((int) (f7 * f10), (int) (r0[1] * f10), Bitmap.Config.ARGB_8888));
            } else {
                this.w = (p5) this.h.remove(0);
            }
        }
        this.d0.c(this.w.b, false, this.g0, this.h0, z10);
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
        org.telegram.messenger.i0.g3(this.I0);
        q5 q5Var = new q5(this, 0);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.i0.g3(q5Var);
        } else {
            q5Var.run();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.b0 = false;
        q5 q5Var = new q5(this, 0);
        Typeface typeface = org.telegram.messenger.i0.a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.i0.g3(q5Var);
        } else {
            q5Var.run();
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
        int i10 = 0;
        this.b0 = false;
        this.c0 = true;
        q5 q5Var = new q5(this, i10);
        Typeface typeface = org.telegram.messenger.i0.a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.i0.g3(q5Var);
        } else {
            q5Var.run();
        }
        if (this.D0 != null) {
            rf.e.c();
            bi0.T0.cancelRunnable(this.D0);
            this.D0 = null;
        }
        if (this.e == null) {
            if (this.d0 != null) {
                this.d0.f();
                this.d0 = null;
            }
            ArrayList arrayList = new ArrayList();
            p5 p5Var = this.n;
            if (p5Var != null) {
                arrayList.add(p5Var.b);
            }
            p5 p5Var2 = this.r;
            if (p5Var2 != null) {
                arrayList.add(p5Var2.b);
            }
            p5 p5Var3 = this.s;
            if (p5Var3 != null) {
                arrayList.add(p5Var3.b);
            }
            p5 p5Var4 = this.w;
            if (p5Var4 != null) {
                arrayList.add(p5Var4.b);
            }
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                p5 p5Var5 = (p5) obj;
                if (p5Var5 != null) {
                    arrayList.add(p5Var5.b);
                }
            }
            this.h.clear();
            this.n = null;
            this.r = null;
            this.s = null;
            this.w = null;
            org.telegram.messenger.s5 s5Var = this.f0;
            if (s5Var != null) {
                s5Var.recycle();
                this.f0 = null;
            }
            getPaint().setShader(null);
            org.telegram.messenger.i0.A2(arrayList);
        } else {
            this.x = true;
        }
        AnimatedFileDrawableStream animatedFileDrawableStream = this.u0;
        if (animatedFileDrawableStream != null) {
            animatedFileDrawableStream.b(true);
            this.u0 = null;
        }
        q5 q5Var2 = new q5(this, 2);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.i0.g3(q5Var2);
        } else {
            q5Var2.run();
        }
    }

    public final void v(ImageReceiver imageReceiver) {
        je.b bVar = this.t0;
        bVar.remove(imageReceiver);
        if (bVar.isEmpty()) {
            this.y0 = 0;
        }
        h();
    }

    public final void w(View view) {
        je.b bVar = this.s0;
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

    public final void x(boolean z10) {
        q5 q5Var;
        q5 q5Var2;
        if (this.e == null || z10) {
            if ((!this.b || (this.s != null && (this.K0 || this.M < 0))) && this.r != null) {
                return;
            }
            if ((this.n == null || !this.f) && g() && !this.x) {
                if ((!this.b0 && (!this.D || this.E)) || this.t0.isEmpty() || this.C0) {
                    return;
                }
                if (!this.v0) {
                    if (this.f0 == null) {
                        this.f0 = new org.telegram.messenger.s5("decodeQueue" + this, true);
                    }
                    if (z10 && (q5Var = this.e) != null) {
                        this.f0.cancelRunnable(q5Var);
                    }
                    org.telegram.messenger.s5 s5Var = this.f0;
                    q5 q5Var3 = this.H0;
                    this.e = q5Var3;
                    s5Var.postRunnable(q5Var3, 0L);
                } else if (this.x0) {
                    q5 q5Var4 = this.H0;
                    this.e = q5Var4;
                    org.telegram.messenger.t5.a(q5Var4);
                } else {
                    if (z10 && (q5Var2 = this.e) != null) {
                        W0.remove(q5Var2);
                    }
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = W0;
                    q5 q5Var5 = this.H0;
                    this.e = q5Var5;
                    scheduledThreadPoolExecutor.execute(q5Var5);
                }
                this.K0 = true;
            }
        }
    }

    public final void y(long j10, boolean z10, boolean z11) {
        AnimatedFileDrawableStream animatedFileDrawableStream;
        synchronized (this.Q) {
            try {
                this.L = j10;
                this.M = j10;
                this.K0 = false;
                if (this.d0 != null) {
                    this.d0.e();
                }
                if (this.y && (animatedFileDrawableStream = this.u0) != null) {
                    animatedFileDrawableStream.b(z10);
                    this.N = z10;
                    this.O = z10 ? 0 : 10;
                }
                if (z11 && this.D) {
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
    public s5(File file, boolean z10, long j10, int i10, TLRPC.Document document, org.telegram.messenger.ic icVar, Object obj, long j11, int i11, boolean z11, int i12, int i13, b2.r1 r1Var, int i14, boolean z12) {
        ?? r12;
        ?? r13;
        long j12;
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
        this.s0 = new je.b(true, true);
        this.t0 = new je.b(true, true);
        this.w0 = true;
        this.B0 = new q5(this, 4);
        this.E0 = new q5(this, 5);
        this.F0 = new q5(this, 6);
        this.G0 = 0;
        this.H0 = new q5(this, 7);
        this.I0 = new q5(this, 8);
        this.S0 = new r5(this, 0);
        this.G = file;
        this.b = org.telegram.messenger.tz.o() >= 1;
        this.H = j10;
        this.I = i10;
        this.J = i11;
        this.i0 = i13;
        this.j0 = i12;
        this.k0 = z12;
        boolean z13 = r1Var != null && i12 > 0 && i13 > 0;
        this.l0 = z13;
        this.o0 = document;
        getPaint().setFlags(3);
        if (j10 == 0 || (document == null && icVar == null)) {
            r12 = 1;
        } else {
            r12 = 1;
            this.u0 = new AnimatedFileDrawableStream(document, icVar, obj, i11, z11, i10, i14);
        }
        rf.e eVar = null;
        if (!z10 || z13) {
            r13 = 0;
        } else {
            r13 = 0;
            this.d0 = AnimatedFileNative.a(file.getAbsolutePath(), iArr, i11, j10, this.u0, z11);
            this.e0 = (this.d0 != null || (this.n0 && this.G0 <= 15)) ? false : r12;
            if (this.d0 != null && (iArr[0] > 3840 || iArr[r12] > 3840)) {
                this.d0.f();
                this.d0 = null;
            }
            d();
            E();
            this.y = r12;
        }
        if (z13) {
            this.d0 = AnimatedFileNative.a(file.getAbsolutePath(), iArr, i11, j10, this.u0, z11);
            this.e0 = (this.d0 != null || (this.n0 && this.G0 <= 15)) ? r13 : r12;
            if (this.d0 == null || (iArr[r13] <= 3840 && iArr[r12] <= 3840)) {
                j12 = j11;
                eVar = new rf.e(file, this, r1Var, this.j0, this.i0, !this.x0, 0);
                this.z0 = eVar;
                if (j12 == 0) {
                    y(j12, r13, r13);
                    return;
                }
                return;
            }
            this.d0.f();
            this.d0 = null;
        }
        j12 = j11;
        this.z0 = eVar;
        if (j12 == 0) {
        }
    }
}
