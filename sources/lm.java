// default package

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
import org.telegram.ui.Components.AnimatedFileNative;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class lm extends BitmapDrawable implements Animatable, ck0 {
    public static final float[] W0 = new float[8];
    public static final ScheduledThreadPoolExecutor X0 = new ScheduledThreadPoolExecutor(8, new ThreadPoolExecutor.DiscardPolicy());
    public static final PorterDuffXfermode Y0 = new PorterDuffXfermode(PorterDuff.Mode.SRC);
    public final ek0 A0;
    public h30 B0;
    public final jm C0;
    public boolean D0;
    public boolean E;
    public jm E0;
    public boolean F;
    public final jm F0;
    public boolean G;
    public final jm G0;
    public final File H;
    public int H0;
    public final long I;
    public final jm I0;
    public final boolean J;
    public final jm J0;
    public final int K;
    public jm K0;
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
    public final km T0;
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
    public jm e;
    public volatile AnimatedFileNative e0;
    public boolean f;
    public boolean f0;
    public uo3 g0;
    public final ArrayList h;
    public float h0;
    public float i0;
    public int j0;
    public int k0;
    public final boolean l0;
    public final boolean m0;
    public im n;
    public float n0;
    public boolean o0;
    public final TLRPC.Document p0;
    public final RectF[] q0;
    public im r;
    public final Paint[] r0;
    public im s;
    public WeakReference s0;
    public final r89 t0;
    public final r89 u0;
    public AnimatedFileDrawableStream v0;
    public im w;
    public boolean w0;
    public boolean x;
    public boolean x0;
    public boolean y;
    public boolean y0;
    public int z0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r23v0, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lm(File file, boolean z, long j, int i, TLRPC.Document document, jn5 jn5Var, Object obj, long j2, int i2, boolean z2, int i3, int i4, bk0 bk0Var, int i5, boolean z3) {
        ?? r1;
        boolean z4;
        ?? r13;
        long j3;
        boolean z5;
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
        this.t0 = new r89(0, true);
        this.u0 = new r89(0, true);
        this.x0 = true;
        this.C0 = new jm(this, (byte) 4);
        this.F0 = new jm(this, (byte) 5);
        this.G0 = new jm(this, (byte) 6);
        this.H0 = 0;
        this.I0 = new jm(this, (byte) 7);
        this.J0 = new jm(this, (byte) 8);
        this.T0 = new km(this, (byte) 0);
        this.H = file;
        this.b = xea.o() >= 1;
        this.I = j;
        this.J = i;
        this.K = i2;
        this.j0 = i4;
        this.k0 = i3;
        this.l0 = z3;
        boolean z6 = bk0Var != null && i3 > 0 && i4 > 0;
        this.m0 = z6;
        this.p0 = document;
        getPaint().setFlags(3);
        if (j == 0 || (document == null && jn5Var == null)) {
            r1 = 0;
            z4 = true;
        } else {
            z4 = true;
            r1 = 0;
            this.v0 = new AnimatedFileDrawableStream(document, jn5Var, obj, i2, z2, i, i5);
        }
        ek0 ek0Var = null;
        if (!z || z6) {
            r13 = z4;
        } else {
            boolean z7 = z4;
            this.e0 = AnimatedFileNative.a(file.getAbsolutePath(), iArr, i2, j, this.v0, z2);
            this.f0 = (this.e0 != null || (this.o0 && this.H0 <= 15)) ? r1 : z7 ? 1 : 0;
            if (this.e0 != null && (iArr[r1] > 3840 || iArr[z7 ? 1 : 0] > 3840)) {
                this.e0.f();
                this.e0 = null;
            }
            d();
            E();
            this.y = z7;
            r13 = z7;
        }
        if (z6) {
            this.e0 = AnimatedFileNative.a(file.getAbsolutePath(), iArr, i2, j, this.v0, z2);
            this.f0 = (this.e0 != null || (this.o0 && this.H0 <= 15)) ? r1 : r13;
            if (this.e0 == null || (iArr[r1] <= 3840 && iArr[r13] <= 3840)) {
                j3 = j2;
                z5 = r1;
                ek0Var = new ek0(file, this, bk0Var, this.k0, this.j0, !this.y0, 0);
                this.A0 = ek0Var;
                if (j3 == 0) {
                    y(j3, z5, z5);
                    return;
                }
                return;
            }
            this.e0.f();
            this.e0 = null;
        }
        j3 = j2;
        z5 = r1;
        this.A0 = ek0Var;
        if (j3 == 0) {
        }
    }

    public final void A(boolean z) {
        this.y0 = z;
        if (z) {
            this.b = false;
        }
    }

    public final void B(int[] iArr) {
        boolean isEmpty = this.t0.isEmpty();
        int[] iArr2 = this.U;
        if (!isEmpty) {
            int[] iArr3 = this.V;
            if (iArr3 == null) {
                iArr3 = new int[4];
                this.V = iArr3;
            }
            System.arraycopy(iArr2, 0, iArr3, 0, iArr3.length);
        }
        for (int i = 0; i < 4; i++) {
            if (!this.x0 && iArr[i] != iArr2[i]) {
                this.x0 = true;
            }
            iArr2[i] = iArr[i];
        }
    }

    public final void C(long j, long j2) {
        this.h0 = j / 1000.0f;
        this.i0 = j2 / 1000.0f;
        if (j < 0 || o() >= j) {
            return;
        }
        y(j, true, false);
    }

    public final void D(long j) {
        byte b = 0;
        this.R0 = 0;
        if (this.S0) {
            this.S0 = false;
            jm jmVar = new jm(this, b);
            Typeface typeface = hl.a;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                hl.c3(jmVar);
            } else {
                jmVar.run();
            }
        }
        boolean z = this.U0 || (!this.c0 && this.E);
        if (!this.c0) {
            if (this.c0 || !this.E || !z || this.r == null) {
                return;
            }
            im imVar = this.n;
            if (imVar != null) {
                this.h.add(imVar);
            }
            this.n = this.r;
            this.r = this.s;
            this.s = null;
            this.U0 = false;
            x(false);
            return;
        }
        im imVar2 = this.n;
        if (imVar2 == null && this.r == null) {
            x(false);
            return;
        }
        if (this.r != null) {
            if (imVar2 == null || (z && !this.a && this.N < 0)) {
                im imVar3 = this.n;
                if (imVar3 != null) {
                    this.h.add(imVar3);
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
        int i;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        if (this.o0 || (i = this.j0) <= 0 || (i2 = this.k0) <= 0 || (i3 = (iArr = this.d)[0]) <= 0 || (i4 = iArr[1]) <= 0) {
            this.n0 = 1.0f;
            return;
        }
        float max = Math.max(i2 / i3, i / i4);
        this.n0 = max;
        if (max <= 0.0f || max > 0.7d) {
            this.n0 = 1.0f;
        }
    }

    @Override // ck0
    public final int a(Bitmap bitmap) {
        int i;
        if (this.O0 == null) {
            return -1;
        }
        Canvas canvas = new Canvas(bitmap);
        Bitmap bitmap2 = this.N0;
        int[] iArr = this.d;
        if (bitmap2 == null) {
            bitmap2 = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
            this.N0 = bitmap2;
        }
        this.O0.c(bitmap2, false, this.h0, this.i0, this.l0);
        long j = this.M0;
        if (j != 0 && ((i = iArr[3]) == 0 || j > i)) {
            return 0;
        }
        int i2 = this.Q0;
        int i3 = iArr[3];
        if (i2 == i3) {
            int i4 = this.P0 + 1;
            this.P0 = i4;
            if (i4 > 5) {
                return 0;
            }
        }
        this.Q0 = i3;
        bitmap.eraseColor(0);
        canvas.save();
        float width = this.k0 / this.N0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.N0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        this.M0 = iArr[3];
        return 1;
    }

    @Override // ck0
    public final void b() {
        this.O0 = AnimatedFileNative.a(this.H.getAbsolutePath(), this.d, this.K, this.I, this.v0, false);
    }

    @Override // ck0
    public final void c() {
        AnimatedFileNative animatedFileNative = this.O0;
        if (animatedFileNative != null) {
            animatedFileNative.f();
            this.O0 = null;
        }
    }

    public final void d() {
        int i;
        if (this.k0 == 0 && this.j0 == 0) {
            int[] iArr = this.d;
            int i2 = iArr[0];
            if (i2 > 3000 || (i = iArr[1]) > 3000) {
                this.k0 = i2 / 4;
                this.j0 = iArr[1] / 4;
            } else if (i2 > 2200 || i > 2200) {
                this.k0 = i2 / 2;
                this.j0 = i / 2;
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
        int i = 0;
        if (this.y) {
            int[] iArr = this.d;
            int i2 = iArr[2];
            i = (i2 == 90 || i2 == 270) ? iArr[0] : iArr[1];
        }
        return i == 0 ? hl.L(100.0f) : (int) (i * this.n0);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i = 0;
        if (this.y) {
            int[] iArr = this.d;
            int i2 = iArr[2];
            i = (i2 == 90 || i2 == 270) ? iArr[1] : iArr[0];
        }
        return i == 0 ? hl.L(100.0f) : (int) (i * this.n0);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        int i = 0;
        if (this.y) {
            int[] iArr = this.d;
            int i2 = iArr[2];
            i = (i2 == 90 || i2 == 270) ? iArr[0] : iArr[1];
        }
        return i == 0 ? hl.L(100.0f) : i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        int i = 0;
        if (this.y) {
            int[] iArr = this.d;
            int i2 = iArr[2];
            i = (i2 == 90 || i2 == 270) ? iArr[1] : iArr[0];
        }
        return i == 0 ? hl.L(100.0f) : i;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        if (this.A0 != null) {
            boolean isEmpty = this.u0.isEmpty();
            jm jmVar = this.K0;
            if (!isEmpty) {
                if (jmVar != null) {
                    hl.r(jmVar);
                    this.K0 = null;
                    return;
                }
                return;
            }
            if (jmVar == null) {
                jm jmVar2 = new jm(this, (byte) 3);
                this.K0 = jmVar2;
                hl.d3(jmVar2, 600L);
            }
        }
    }

    public final void i() {
        int i;
        if (!this.c0 || this.S0 || this.f) {
            if (this.V0) {
                this.V0 = false;
                this.R0 = 0;
                jh2.d().f(this.T0);
                return;
            }
            return;
        }
        if (this.V0 || (i = this.d[5]) <= 0) {
            return;
        }
        this.V0 = true;
        this.R0 = 0;
        jh2.d().b(this.T0, i);
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.c0;
    }

    public final void j() {
        r89 r89Var = this.u0;
        Iterator it = r89Var.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            ImageReceiver imageReceiver = (ImageReceiver) it.next();
            if (imageReceiver.y1) {
                i++;
            } else {
                r89Var.remove(imageReceiver);
            }
            int i3 = imageReceiver.D1;
            if (i3 > 0 && this.z0 >= i3) {
                i2++;
            }
        }
        if (i == i2) {
            stop();
        } else {
            start();
        }
    }

    public final void k() {
        if (g()) {
            return;
        }
        im imVar = this.n;
        if (imVar != null) {
            imVar.b.recycle();
            Arrays.fill(imVar.a, (Object) null);
            this.n = null;
        }
        im imVar2 = this.w;
        if (imVar2 != null) {
            imVar2.b.recycle();
            Arrays.fill(imVar2.a, (Object) null);
            this.w = null;
        }
        uo3 uo3Var = this.g0;
        if (uo3Var != null) {
            uo3Var.recycle();
            this.g0 = null;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i >= arrayList.size()) {
                arrayList.clear();
                t();
                return;
            } else {
                im imVar3 = (im) arrayList.get(i);
                imVar3.b.recycle();
                Arrays.fill(imVar3.a, (Object) null);
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(Canvas canvas, boolean z, long j, int i) {
        RectF rectF;
        Paint paint;
        boolean z2;
        float width;
        float height;
        float[] fArr;
        int i2;
        if (!g() || this.x) {
            return;
        }
        long currentTimeMillis = j == 0 ? System.currentTimeMillis() : j;
        if (z) {
            rectF = this.q0[i];
            paint = this.r0[i];
        } else {
            Paint paint2 = getPaint();
            D(currentTimeMillis);
            rectF = this.b0;
            paint = paint2;
        }
        if (this.n == null) {
            return;
        }
        int[] iArr = this.U;
        int length = iArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                z2 = false;
                break;
            } else {
                if (iArr[i3] != 0) {
                    z2 = true;
                    break;
                }
                i3++;
            }
        }
        if (!z) {
            PorterDuffXfermode porterDuffXfermode = (!z2 && this.n.f && paint.getAlpha() == 255) ? Y0 : null;
            if (paint.getXfermode() != porterDuffXfermode) {
                paint.setXfermode(porterDuffXfermode);
            }
        }
        float f = this.Y;
        float f2 = this.Z;
        int[] iArr2 = this.d;
        if (!z) {
            if (this.a0) {
                im imVar = this.n;
                int i4 = imVar.c;
                int i5 = imVar.d;
                int i6 = iArr2[2];
                if (i6 == 90 || i6 == 270) {
                    i4 = i5;
                    i5 = i4;
                }
                rectF.set(getBounds());
                width = rectF.width() / i4;
                this.Y = width;
                height = rectF.height() / i5;
                this.Z = height;
                this.a0 = false;
            }
            if (z2) {
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                int i7 = iArr2[2];
                if (i7 == 90) {
                    canvas.rotate(90.0f);
                    canvas.translate(0.0f, -rectF.width());
                } else if (i7 == 180) {
                    canvas.rotate(180.0f);
                    canvas.translate(-rectF.width(), -rectF.height());
                } else if (i7 == 270) {
                    canvas.rotate(270.0f);
                    canvas.translate(-rectF.height(), 0.0f);
                }
                canvas.scale(f, f2);
                canvas.drawBitmap(this.n.b, 0.0f, 0.0f, paint);
                canvas.restore();
                return;
            }
            int i8 = z ? i + 1 : 0;
            im imVar2 = this.n;
            BitmapShader[] bitmapShaderArr = imVar2.a;
            if (bitmapShaderArr[i8] == null) {
                Bitmap bitmap = imVar2.b;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                bitmapShaderArr[i8] = new BitmapShader(bitmap, tileMode, tileMode);
            }
            BitmapShader bitmapShader = bitmapShaderArr[i8];
            paint.setShader(bitmapShader);
            Matrix[] matrixArr = this.W;
            Matrix matrix = matrixArr[i8];
            if (matrix == null) {
                matrix = new Matrix();
                matrixArr[i8] = matrix;
            }
            matrix.reset();
            matrix.setTranslate(rectF.left, rectF.top);
            int i9 = iArr2[2];
            if (i9 == 90) {
                matrix.preRotate(90.0f);
                matrix.preTranslate(0.0f, -rectF.width());
            } else if (i9 == 180) {
                matrix.preRotate(180.0f);
                matrix.preTranslate(-rectF.width(), -rectF.height());
            } else if (i9 == 270) {
                matrix.preRotate(270.0f);
                matrix.preTranslate(-rectF.height(), 0.0f);
            }
            matrix.preScale(f, f2);
            bitmapShader.setLocalMatrix(matrix);
            Path[] pathArr = this.X;
            Path path = pathArr[i8];
            if (path == null) {
                path = new Path();
                pathArr[i8] = path;
            }
            boolean z3 = this.x0;
            RectF rectF2 = this.T;
            if (z3 || z) {
                if (!z) {
                    this.x0 = false;
                }
                int i10 = 0;
                while (true) {
                    int length2 = iArr.length;
                    fArr = W0;
                    if (i10 >= length2) {
                        break;
                    }
                    int i11 = i10 << 1;
                    float f3 = iArr[i10];
                    fArr[i11] = f3;
                    fArr[i11 + 1] = f3;
                    i10++;
                }
                path.rewind();
                path.addRoundRect(z ? rectF : rectF2, fArr, Path.Direction.CW);
            }
            int i12 = iArr[0];
            int i13 = iArr[1];
            if (i12 != i13 || i13 != (i2 = iArr[2]) || i2 != iArr[3]) {
                canvas.drawPath(path, paint);
                return;
            }
            if (!z) {
                rectF = rectF2;
            }
            float f4 = i12;
            canvas.drawRoundRect(rectF, f4, f4, paint);
            return;
        }
        im imVar3 = this.n;
        int i14 = imVar3.c;
        int i15 = imVar3.d;
        int i16 = iArr2[2];
        if (i16 == 90 || i16 == 270) {
            i14 = i15;
            i15 = i14;
        }
        width = rectF.width() / i14;
        height = rectF.height() / i15;
        float f5 = width;
        f2 = height;
        f = f5;
        if (z2) {
        }
    }

    public final Bitmap m() {
        im imVar = this.n;
        if (imVar != null) {
            return imVar.b;
        }
        im imVar2 = this.r;
        if (imVar2 != null) {
            return imVar2.b;
        }
        im imVar3 = this.s;
        if (imVar3 != null) {
            return imVar3.b;
        }
        return null;
    }

    public final float n() {
        float f;
        int i;
        if (this.d[4] == 0) {
            return 0.0f;
        }
        if (this.N >= 0) {
            f = this.N;
            i = this.d[4];
        } else {
            int[] iArr = this.d;
            f = iArr[3];
            i = iArr[4];
        }
        return f / i;
    }

    public final int o() {
        int i;
        if (this.N >= 0) {
            return (int) this.N;
        }
        im imVar = this.r;
        if (imVar != null && (i = imVar.e) != 0) {
            return i;
        }
        im imVar2 = this.n;
        if (imVar2 != null) {
            return imVar2.e;
        }
        return 0;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.a0 = true;
    }

    public final Bitmap p() {
        int i = this.k0;
        int i2 = this.j0;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        Canvas canvas = new Canvas(createBitmap);
        AnimatedFileNative a = AnimatedFileNative.a(this.H.getAbsolutePath(), this.d, this.K, this.I, this.v0, false);
        if (a == null) {
            return createBitmap;
        }
        Bitmap bitmap = this.N0;
        if (bitmap == null) {
            int[] iArr = this.d;
            bitmap = Bitmap.createBitmap(Math.max(1, iArr[0]), Math.max(1, iArr[1]), config);
            this.N0 = bitmap;
        }
        a.c(bitmap, false, this.h0, this.i0, true);
        a.f();
        createBitmap.eraseColor(0);
        canvas.save();
        float width = this.k0 / this.N0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.N0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        return createBitmap;
    }

    public final Bitmap q(long j, boolean z) {
        if (this.y && this.e0 != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = this.v0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.b(false);
                this.v0.d();
            }
            if (!z) {
                this.e0.g(j, z);
            }
            int[] iArr = this.d;
            Bitmap createBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
            AnimatedFileNative animatedFileNative = this.e0;
            if ((z ? animatedFileNative.b(j, createBitmap) : animatedFileNative.c(createBitmap, true, 0.0f, 0.0f, true)) != 0) {
                return createBitmap;
            }
            createBitmap.recycle();
        }
        return null;
    }

    public final Bitmap r(boolean z) {
        AnimatedFileNative animatedFileNative = this.e0;
        im imVar = this.w;
        if (animatedFileNative == null) {
            if (imVar != null) {
                return imVar.b;
            }
            return null;
        }
        if (imVar == null) {
            if (this.h.isEmpty()) {
                float f = this.d[0];
                float f2 = this.n0;
                this.w = new im(Bitmap.createBitmap((int) (f * f2), (int) (r0[1] * f2), Bitmap.Config.ARGB_8888));
            } else {
                this.w = (im) this.h.remove(0);
            }
        }
        this.e0.c(this.w.b, false, this.h0, this.i0, z);
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
        hl.c3(this.J0);
        jm jmVar = new jm(this, (byte) 0);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            hl.c3(jmVar);
        } else {
            jmVar.run();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.c0 = false;
        jm jmVar = new jm(this, (byte) 0);
        Typeface typeface = hl.a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            hl.c3(jmVar);
        } else {
            jmVar.run();
        }
    }

    public final void t() {
        Iterator it = this.u0.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u() {
        if (!this.t0.isEmpty()) {
            this.L = true;
            return;
        }
        int i = 0;
        this.c0 = false;
        this.d0 = true;
        jm jmVar = new jm(this, 0 == true ? 1 : 0);
        Typeface typeface = hl.a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            hl.c3(jmVar);
        } else {
            jmVar.run();
        }
        if (this.E0 != null) {
            ek0.c();
            b29.U0.cancelRunnable(this.E0);
            this.E0 = null;
        }
        if (this.e == null) {
            if (this.e0 != null) {
                this.e0.f();
                this.e0 = null;
            }
            ArrayList arrayList = new ArrayList();
            im imVar = this.n;
            if (imVar != null) {
                arrayList.add(imVar.b);
            }
            im imVar2 = this.r;
            if (imVar2 != null) {
                arrayList.add(imVar2.b);
            }
            im imVar3 = this.s;
            if (imVar3 != null) {
                arrayList.add(imVar3.b);
            }
            im imVar4 = this.w;
            if (imVar4 != null) {
                arrayList.add(imVar4.b);
            }
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                im imVar5 = (im) obj;
                if (imVar5 != null) {
                    arrayList.add(imVar5.b);
                }
            }
            this.h.clear();
            this.n = null;
            this.r = null;
            this.s = null;
            this.w = null;
            uo3 uo3Var = this.g0;
            if (uo3Var != null) {
                uo3Var.recycle();
                this.g0 = null;
            }
            getPaint().setShader(null);
            hl.x2(arrayList);
        } else {
            this.x = true;
        }
        AnimatedFileDrawableStream animatedFileDrawableStream = this.v0;
        if (animatedFileDrawableStream != null) {
            animatedFileDrawableStream.b(true);
            this.v0 = null;
        }
        jm jmVar2 = new jm(this, (byte) 2);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            hl.c3(jmVar2);
        } else {
            jmVar2.run();
        }
    }

    public final void v(ImageReceiver imageReceiver) {
        r89 r89Var = this.u0;
        r89Var.remove(imageReceiver);
        if (r89Var.isEmpty()) {
            this.z0 = 0;
        }
        h();
    }

    public final void w(View view) {
        r89 r89Var = this.t0;
        r89Var.remove(view);
        if (r89Var.isEmpty()) {
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

    public final void x(boolean z) {
        jm jmVar;
        jm jmVar2;
        if (this.e == null || z) {
            if ((!this.b || (this.s != null && (this.L0 || this.N < 0))) && this.r != null) {
                return;
            }
            if ((this.n == null || !this.f) && g() && !this.x) {
                if ((!this.c0 && (!this.E || this.F)) || this.u0.isEmpty() || this.D0) {
                    return;
                }
                if (!this.w0) {
                    uo3 uo3Var = this.g0;
                    if (uo3Var == null) {
                        uo3Var = new uo3("decodeQueue" + this, true);
                        this.g0 = uo3Var;
                    }
                    if (z && (jmVar = this.e) != null) {
                        uo3Var.cancelRunnable(jmVar);
                    }
                    uo3 uo3Var2 = this.g0;
                    jm jmVar3 = this.I0;
                    this.e = jmVar3;
                    uo3Var2.postRunnable(jmVar3, 0L);
                } else if (this.y0) {
                    jm jmVar4 = this.I0;
                    this.e = jmVar4;
                    vo3.a(jmVar4);
                } else {
                    if (z && (jmVar2 = this.e) != null) {
                        X0.remove(jmVar2);
                    }
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = X0;
                    jm jmVar5 = this.I0;
                    this.e = jmVar5;
                    scheduledThreadPoolExecutor.execute(jmVar5);
                }
                this.L0 = true;
            }
        }
    }

    public final void y(long j, boolean z, boolean z2) {
        AnimatedFileDrawableStream animatedFileDrawableStream;
        synchronized (this.R) {
            this.M = j;
            this.N = j;
            this.L0 = false;
            if (this.e0 != null) {
                this.e0.e();
            }
            if (this.y && (animatedFileDrawableStream = this.v0) != null) {
                animatedFileDrawableStream.b(z);
                this.O = z;
                this.P = z ? 0 : 10;
            }
            if (z2 && this.E) {
                this.F = false;
                if (this.e == null) {
                    x(true);
                } else {
                    this.G = true;
                }
            }
        }
    }

    public final void z(float f, float f2, float f3, float f4) {
        float f5 = f4 + f2;
        float f6 = f3 + f;
        RectF rectF = this.T;
        if (rectF.left == f && rectF.top == f2 && rectF.right == f6 && rectF.bottom == f5) {
            return;
        }
        rectF.set(f, f2, f6, f5);
        this.x0 = true;
    }

    public lm(File file, boolean z, long j, int i, TLRPC.Document document, jn5 jn5Var, Object obj, long j2, int i2, boolean z2) {
        this(file, z, j, i, document, jn5Var, obj, j2, i2, z2, 0, 0, null, document != null ? 1 : 0, true);
    }
}
