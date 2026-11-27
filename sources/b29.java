// default package

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Looper;
import android.text.TextUtils;
import android.util.JsonReader;
import android.view.View;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class b29 extends BitmapDrawable implements Animatable, ck0 {
    public static final AtomicInteger Q0 = new AtomicInteger();
    public static final AtomicInteger R0 = new AtomicInteger();
    public static final ExecutorService S0 = Executors.newFixedThreadPool(4, new y20(5));
    public static final ExecutorService T0 = Executors.newFixedThreadPool(2, new y20(6));
    public static uo3 U0;
    public final Runnable A0;
    public Runnable B0;
    public ek0 C0;
    public int D0;
    public boolean E;
    public boolean E0;
    public boolean F;
    public boolean F0;
    public float G;
    public final Runnable G0;
    public final boolean H;
    public int H0;
    public WeakReference I;
    public WeakReference I0;
    public int J;
    public final r89 J0;
    public byte K;
    public RLottieNative K0;
    public byte L;
    public int L0;
    public int M;
    public volatile boolean M0;
    public int N;
    public final km N0;
    public volatile boolean O;
    public boolean O0;
    public zk1 P;
    public boolean P0;
    public Runnable Q;
    public volatile Bitmap R;
    public volatile Bitmap S;
    public volatile Bitmap T;
    public boolean U;
    public CountDownLatch V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a;
    public boolean a0;
    public final int b;
    public int b0;
    public final int c;
    public final boolean c0;
    public boolean d;
    public final boolean d0;
    public final int[] e;
    public float e0;
    public int f;
    public float f0;
    public boolean g0;
    public boolean h;
    public boolean h0;
    public final RectF i0;
    public final RectF[] j0;
    public final Paint[] k0;
    public volatile boolean l0;
    public volatile boolean m0;
    public int[] n;
    public volatile RLottieNative n0;
    public final boolean o0;
    public boolean p0;
    public boolean q0;
    public int[] r;
    public boolean r0;
    public final HashMap s;
    public final File s0;
    public final boolean t0;
    public Runnable u0;
    public final tf7 v0;
    public final HashMap w;
    public final Runnable w0;
    public final HashMap x;
    public final Runnable x0;
    public HashMap y;
    public boolean y0;
    public final Runnable z0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0189  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r27v0, types: [byte, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b29(File file, String str, int i, int i2, bk0 bk0Var, boolean z, int i3, boolean z2) {
        boolean z3;
        char c;
        RLottieNative a;
        JsonReader jsonReader;
        int[] iArr = new int[3];
        this.e = iArr;
        this.f = -1;
        this.s = new HashMap();
        this.w = new HashMap();
        HashMap hashMap = new HashMap();
        this.x = hashMap;
        this.E = false;
        this.F = true;
        this.G = 1.0f;
        this.L = (byte) 1;
        this.M = -1;
        this.e0 = 1.0f;
        this.f0 = 1.0f;
        this.i0 = new RectF();
        this.j0 = new RectF[2];
        this.k0 = new Paint[2];
        this.w0 = new zk1(this, (byte) 2);
        this.x0 = new zk1(this, (byte) 3);
        this.z0 = new zk1(this, (byte) 4);
        this.A0 = new zk1(this, (byte) 5);
        this.G0 = new zk1(this, (byte) 6);
        this.J0 = new r89(0, true);
        this.N0 = new km(this, (byte) 2);
        this.b = i;
        this.c = i2;
        this.c0 = z;
        this.H = z2;
        boolean z4 = bk0Var != null;
        this.t0 = z4;
        this.o0 = str == null && bk0Var != null && bk0Var.b;
        boolean z5 = bk0Var != null && bk0Var.c;
        this.d0 = z5;
        tf7 tf7Var = new tf7();
        this.v0 = tf7Var;
        tf7Var.e = file.getAbsoluteFile();
        tf7Var.c = str;
        tf7Var.d = null;
        tf7Var.a = i3;
        getPaint().setFlags(2);
        if (str == null) {
            this.s0 = file;
        }
        if (z4 && U0 == null) {
            z3 = 0;
            U0 = new uo3("cache generator queue", true);
        } else {
            z3 = 0;
        }
        if (!z4) {
            this.n0 = RLottieNative.a(file.getAbsolutePath(), str, iArr, (int[]) tf7Var.d, i3, hashMap);
            if (this.n0 == null) {
                cc4.b("RLottieDrawable nativePtr == 0 " + file.getAbsolutePath() + " remove file");
                file.delete();
            }
            if (!z || iArr[1] >= 60) {
                return;
            }
            this.c0 = false;
            return;
        }
        if (z5) {
            return;
        }
        try {
            try {
                jsonReader = new JsonReader(new FileReader(file.getAbsoluteFile()));
            } catch (Exception e) {
                e = e;
                c = 1;
                cc4.g(e, z3);
                String absolutePath = file.getAbsolutePath();
                tf7 tf7Var2 = this.v0;
                a = RLottieNative.a(absolutePath, str, iArr, (int[]) tf7Var2.d, tf7Var2.a, this.x);
                if (a != null) {
                    a.d();
                }
                if (this.c0) {
                    this.c0 = false;
                }
                this.C0 = new ek0(file, this, bk0Var, i, i2, !z, i3);
            }
        } catch (Exception e2) {
            e = e2;
            cc4.g(e, z3);
            String absolutePath2 = file.getAbsolutePath();
            tf7 tf7Var22 = this.v0;
            a = RLottieNative.a(absolutePath2, str, iArr, (int[]) tf7Var22.d, tf7Var22.a, this.x);
            if (a != null) {
            }
            if (this.c0) {
            }
            this.C0 = new ek0(file, this, bk0Var, i, i2, !z, i3);
        }
        try {
            jsonReader.beginObject();
            double d = 0.0d;
            c = 1;
            double d2 = 30.0d;
            double d3 = 0.0d;
            while (jsonReader.hasNext()) {
                try {
                    String nextName = jsonReader.nextName();
                    int hashCode = nextName.hashCode();
                    if (hashCode != 3276) {
                        if (hashCode != 3367) {
                            if (hashCode == 3553 && nextName.equals("op")) {
                                d = jsonReader.nextDouble();
                            }
                            jsonReader.skipValue();
                        } else if (nextName.equals("ip")) {
                            d3 = jsonReader.nextDouble();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (nextName.equals("fr")) {
                        d2 = jsonReader.nextDouble();
                    } else {
                        jsonReader.skipValue();
                    }
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        jsonReader.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            jsonReader.endObject();
            jsonReader.close();
            iArr[z3] = (int) (d - d3);
            iArr[1] = (int) d2;
            if (this.c0 && this.e[c] < 60) {
                this.c0 = false;
            }
            this.C0 = new ek0(file, this, bk0Var, i, i2, !z, i3);
        } catch (Throwable th4) {
            th = th4;
            c = 1;
        }
    }

    public final void A(ImageReceiver imageReceiver) {
        r89 r89Var = this.J0;
        r89Var.remove(imageReceiver);
        if (this.C0 == null || U0 == null || this.P == null) {
            return;
        }
        WeakReference weakReference = this.I0;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (r89Var.isEmpty() && getCallback() == null) {
            if (view == null || !view.isAttachedToWindow()) {
                zk1 zk1Var = this.P;
                if (zk1Var != null) {
                    U0.cancelRunnable(zk1Var);
                    ek0.c();
                    this.P = null;
                }
                this.y0 = false;
                this.E0 = false;
            }
        }
    }

    public final void B() {
        if (!this.a0 && !this.l0 && this.X) {
            if (this.b0 <= 2) {
                this.b0 = 0;
            }
            this.O = false;
            this.Y = false;
            if (!D()) {
                this.Z = true;
            }
        }
        s();
    }

    public final boolean C(boolean z) {
        if (!z && ((this.L < 2 || this.N == 0) && this.M < 0)) {
            return false;
        }
        this.N = 0;
        this.L = (byte) 2;
        start();
        return true;
    }

    public final boolean D() {
        if (this.Q != null || this.S != null || !f() || r() || this.W || this.m0) {
            return false;
        }
        if (!this.l0 && (!this.X || this.Y)) {
            return false;
        }
        if (this.y0 && !this.F0) {
            return false;
        }
        if (!this.s.isEmpty()) {
            this.w.putAll(this.s);
            this.s.clear();
        }
        int[] iArr = this.n;
        if (iArr != null) {
            this.r = iArr;
            this.n = null;
        }
        Runnable runnable = this.G0;
        this.Q = runnable;
        (this.c0 ? T0 : S0).execute(runnable);
        return true;
    }

    public final void E(boolean z) {
        this.X = true;
        D();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F(int i) {
        if (this.L == 2 && i == 3 && this.b0 != 0) {
            return;
        }
        this.L = i;
    }

    public final void G() {
        I(85, false, false);
    }

    public final void H(int i) {
        I(i, true, false);
    }

    public final void I(int i, boolean z, boolean z2) {
        if (i < 0 || i > this.e[0]) {
            return;
        }
        if (this.b0 != i || z2) {
            this.b0 = i;
            this.O = false;
            this.Y = false;
            if (this.p0) {
                this.q0 = true;
                if (this.Q != null) {
                    this.r0 = true;
                }
            }
            if ((!z || z2) && this.U && this.S != null) {
                this.T = this.S;
                this.S = null;
                this.Q = null;
                this.U = false;
            }
            if (!z && this.Q == null) {
                this.V = new CountDownLatch(1);
            }
            if (z2 && !this.l0) {
                this.l0 = true;
                g();
            }
            if (!D()) {
                this.Z = true;
            } else if (!z) {
                try {
                    this.V.await();
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                this.V = null;
            }
            invalidateSelf();
        }
    }

    public final void J(boolean z) {
        WeakReference weakReference;
        Runnable runnable;
        WeakReference weakReference2;
        this.T = this.R;
        this.R = this.S;
        this.S = null;
        this.O0 = false;
        if (this.K == 2 && (weakReference2 = this.I) != null && this.b0 - 1 >= this.J) {
            Runnable runnable2 = (Runnable) weakReference2.get();
            if (runnable2 != null) {
                runnable2.run();
            }
            this.I = null;
        }
        if (this.O || (this.M == 0 && this.L == 1)) {
            stop();
        }
        this.Q = null;
        if (this.r0) {
            this.r0 = false;
        } else if (this.q0) {
            this.q0 = false;
        }
        this.Y = true;
        this.U = false;
        if (z && this.Z) {
            this.Y = false;
            this.Z = false;
        }
        if (this.K == 0 && (weakReference = this.I) != null && this.b0 >= this.J && (runnable = (Runnable) weakReference.get()) != null) {
            runnable.run();
        }
        D();
    }

    public final boolean K(int i) {
        if (this.f == i || i > this.e[0]) {
            return false;
        }
        this.f = i;
        return true;
    }

    public final void L(int i, String str) {
        this.s.put(str, Integer.valueOf(i));
        B();
    }

    public final void M(View view) {
        this.I0 = new WeakReference(view);
    }

    public final void N(int i, Runnable runnable) {
        if (runnable != null) {
            this.I = new WeakReference(runnable);
            this.J = i;
        } else if (this.I != null) {
            this.I = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r4 > 1.0f) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(boolean z, float f) {
        float f2 = f >= 0.0f ? 1.0f : 0.0f;
        f = f2;
        I((int) (this.e[0] * f), z, false);
    }

    public final void P(long j) {
        int i;
        int[] iArr = this.e;
        if (iArr[0] == 0 || (i = iArr[1]) == 0) {
            return;
        }
        I(Math.round(Math.max(0L, j) / (1000.0f / i)) % iArr[0], true, true);
    }

    public final void Q(long j) {
        Integer num;
        this.L0 = 0;
        if (this.M0) {
            this.M0 = false;
            g();
        }
        boolean z = this.O0 || (!this.l0 && this.X);
        if (!this.l0) {
            if ((this.Z || (this.X && z)) && this.S != null) {
                J(true);
                return;
            }
            return;
        }
        if (this.R == null && this.S == null) {
            D();
            return;
        }
        if (this.S != null) {
            if (this.R == null || (z && !this.a)) {
                HashMap hashMap = this.y;
                if (hashMap != null && this.F && (num = (Integer) hashMap.get(Integer.valueOf(this.b0 - 1))) != null) {
                    try {
                        Activity activity = LaunchActivity.H1;
                        if (activity == null) {
                            activity = BubbleActivity.b0;
                        }
                        activity.getWindow().getDecorView().performHapticFeedback(num.intValue() == 1 ? 0 : 3, 2);
                    } catch (Exception unused) {
                    }
                }
                J(false);
            }
        }
    }

    @Override // ck0
    public final int a(Bitmap bitmap) {
        RLottieNative rLottieNative = this.K0;
        if (rLottieNative == null) {
            return -1;
        }
        int i = this.D0;
        if (i >= rLottieNative.a[0]) {
            return 0;
        }
        int i2 = this.c0 ? 2 : 1;
        if (rLottieNative.c(i, bitmap, true) == -5) {
            return -1;
        }
        this.D0 += i2;
        return 1;
    }

    @Override // ck0
    public final void b() {
        File file;
        tf7 tf7Var = this.v0;
        File file2 = (File) tf7Var.e;
        RLottieNative a = RLottieNative.a(file2 != null ? file2.toString() : null, tf7Var.c, this.d0 ? this.e : null, (int[]) tf7Var.d, tf7Var.a, this.x);
        this.K0 = a;
        this.D0 = 0;
        if (a != null || (file = this.s0) == null) {
            return;
        }
        file.delete();
    }

    @Override // ck0
    public final void c() {
        RLottieNative rLottieNative = this.K0;
        if (rLottieNative != null) {
            rLottieNative.d();
            this.K0 = null;
        }
    }

    public void d() {
        int i = this.c0 ? 2 : 1;
        int i2 = this.f;
        if (i2 >= 0 && this.h) {
            int i3 = this.b0;
            if (i3 > i2) {
                int i4 = i3 - i;
                if (i4 >= i2) {
                    this.b0 = i4;
                    this.O = false;
                    return;
                }
                this.O = true;
                Runnable runnable = this.u0;
                if (runnable != null) {
                    runnable.run();
                    this.u0 = null;
                    return;
                }
                return;
            }
            int i5 = i3 + i;
            if (i5 < i2) {
                this.b0 = i5;
                this.O = false;
                return;
            }
            this.O = true;
            Runnable runnable2 = this.u0;
            if (runnable2 != null) {
                runnable2.run();
                this.u0 = null;
                return;
            }
            return;
        }
        int i6 = this.b0 + i;
        if (i2 < 0) {
            i2 = this.e[0];
        }
        byte b = this.L;
        if (i6 < i2) {
            if (b == 3) {
                this.O = true;
                this.N++;
                return;
            } else {
                this.b0 = i6;
                this.O = false;
                return;
            }
        }
        if (b == 1) {
            this.b0 = 0;
            this.O = false;
            if (this.E) {
                this.y = null;
                this.E = false;
            }
            int i7 = this.M;
            if (i7 > 0) {
                this.M = i7 - 1;
                return;
            }
            return;
        }
        if (b != 2) {
            this.O = true;
            Runnable runnable3 = this.u0;
            if (runnable3 != null) {
                runnable3.run();
                this.u0 = null;
                return;
            }
            return;
        }
        this.b0 = 0;
        this.O = true;
        this.N++;
        if (this.E) {
            this.y = null;
            this.E = false;
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        l(canvas, null, false, 0L, 0);
    }

    public int e() {
        if (this.m0) {
            return 3;
        }
        if (!f()) {
            return 2;
        }
        if (this.n0 != null || !this.d) {
            return 1;
        }
        String v2 = hl.v2(null, this.v0.b);
        if (TextUtils.isEmpty(v2)) {
            return 2;
        }
        this.n0 = RLottieNative.b(v2, this.e, (int[]) this.v0.d, this.x);
        this.d = false;
        return 1;
    }

    public final boolean f() {
        return this.t0 ? this.C0 != null || this.o0 : this.n0 != null || this.d;
    }

    public final void finalize() {
        try {
            x(false);
        } finally {
            super.finalize();
        }
    }

    public final void g() {
        zk1 zk1Var = new zk1(this, (byte) 7);
        Typeface typeface = hl.a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            hl.c3(zk1Var);
        } else {
            zk1Var.run();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.c;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.b;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        if (!this.l0 || this.M0) {
            if (this.P0) {
                this.P0 = false;
                this.L0 = 0;
                jh2.d().f(this.N0);
                return;
            }
            return;
        }
        if (this.P0) {
            return;
        }
        int round = Math.round((this.e[1] / (this.c0 ? 2.0f : 1.0f)) * this.G);
        if (round > 0) {
            if (this.e[0] == 1 && this.K == 0) {
                return;
            }
            this.P0 = true;
            this.L0 = 0;
            jh2.d().b(this.N0, round);
            s();
        }
    }

    public final void i() {
        zk1 zk1Var = this.P;
        if (zk1Var != null) {
            U0.cancelRunnable(zk1Var);
            ek0.c();
            this.P = null;
        }
        if (q() || this.S == null || this.Q == null) {
            return;
        }
        this.Q = null;
        this.S = null;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.l0;
    }

    public final void j() {
        if (this.a0) {
            this.a0 = false;
            if (!this.l0 && this.X) {
                if (this.b0 <= 2) {
                    this.b0 = 0;
                }
                this.O = false;
                this.Y = false;
                if (!D()) {
                    this.Z = true;
                }
            }
            s();
        }
    }

    public void k() {
        if (this.W) {
            i();
            if (this.Q == null && this.P == null && this.n0 != null) {
                y(true);
            }
        }
        if ((this.n0 == null || this.o0) && this.C0 == null) {
            z();
            return;
        }
        this.U = true;
        if (!q()) {
            stop();
        }
        if (this.l0) {
            D();
        }
    }

    public final void l(Canvas canvas, Paint paint, boolean z, long j, int i) {
        RectF rectF;
        float width;
        boolean z2;
        float f;
        if (!f() || this.W) {
            return;
        }
        if (z) {
            rectF = this.j0[i];
        } else {
            Q(j);
            rectF = this.i0;
        }
        if (paint == null) {
            paint = z ? this.k0[i] : getPaint();
        }
        if (paint.getAlpha() == 0 || this.q0 || this.R == null) {
            return;
        }
        boolean z3 = true;
        if (z) {
            width = rectF.width() / this.b;
            float height = rectF.height() / this.c;
            if (Math.abs(rectF.width() - this.b) < hl.L(1.0f) && Math.abs(rectF.height() - this.c) < hl.L(1.0f)) {
                z3 = false;
            }
            z2 = z3;
            f = height;
        } else {
            rectF.set(getBounds());
            if (this.g0) {
                this.e0 = rectF.width() / this.b;
                this.f0 = rectF.height() / this.c;
                this.g0 = false;
                if (Math.abs(rectF.width() - this.b) < hl.L(1.0f) && Math.abs(rectF.height() - this.c) < hl.L(1.0f)) {
                    z3 = false;
                }
                this.h0 = z3;
            }
            width = this.e0;
            f = this.f0;
            z2 = this.h0;
        }
        if (!z2) {
            canvas.drawBitmap(this.R, rectF.left, rectF.top, paint);
            return;
        }
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        canvas.scale(width, f);
        canvas.drawBitmap(this.R, 0.0f, 0.0f, paint);
        canvas.restore();
    }

    public final long m() {
        int[] iArr = this.e;
        return (long) ((iArr[0] / iArr[1]) * 1000.0f);
    }

    public final int n() {
        return this.e[0];
    }

    public final float o() {
        return this.b0 / this.e[0];
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.g0 = true;
    }

    public final boolean p() {
        if (this.m0) {
            return false;
        }
        return ((this.R == null && this.S == null) || this.q0) ? false : true;
    }

    public final boolean q() {
        if (!this.J0.isEmpty()) {
            return true;
        }
        WeakReference weakReference = this.I0;
        return ((weakReference == null || weakReference.get() == null) && getCallback() == null) ? false : true;
    }

    public boolean r() {
        return this.R != null && this.e[0] == 1;
    }

    public final void s() {
        if (this.m0) {
            return;
        }
        Iterator it = this.J0.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
        WeakReference weakReference = this.I0;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            view.invalidate();
        }
        if (getCallback() != null) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.l0) {
            return;
        }
        if ((this.L < 2 || this.N == 0) && this.f != this.b0) {
            this.l0 = true;
            this.M0 = false;
            if (this.p0) {
                this.q0 = true;
                if (this.Q != null) {
                    this.r0 = true;
                }
            }
            D();
            s();
            g();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.l0 = false;
        g();
    }

    public final boolean t() {
        return this.P != null;
    }

    public boolean u() {
        return true;
    }

    public final boolean v() {
        return this.b0 == this.e[0] - 1;
    }

    public int w(Bitmap bitmap, boolean z) {
        RLottieNative b;
        int c;
        ek0 ek0Var;
        RLottieNative rLottieNative = this.n0;
        if (rLottieNative != null) {
            try {
                if (!this.w.isEmpty() || this.r != null) {
                    this.x.putAll(this.w);
                    int[] iArr = this.r;
                    if (iArr != null) {
                        this.v0.d = (int[]) iArr.clone();
                    }
                    tf7 tf7Var = this.v0;
                    File file = (File) tf7Var.e;
                    if (file != null) {
                        String absolutePath = file.getAbsolutePath();
                        tf7 tf7Var2 = this.v0;
                        b = RLottieNative.a(absolutePath, tf7Var2.c, this.e, (int[]) tf7Var2.d, tf7Var2.a, this.x);
                    } else {
                        int i = tf7Var.b;
                        if (i == 0 || tf7Var.c != null) {
                            b = RLottieNative.b(tf7Var.c, this.e, (int[]) tf7Var.d, this.x);
                        } else {
                            String v2 = hl.v2(null, i);
                            if (!TextUtils.isEmpty(v2)) {
                                tf7 tf7Var3 = this.v0;
                                tf7Var3.c = v2;
                                b = RLottieNative.b(v2, this.e, (int[]) tf7Var3.d, this.x);
                            }
                        }
                    }
                    if (b != null) {
                        this.n0 = b;
                        rLottieNative.d();
                        this.w.clear();
                        this.r = null;
                    }
                }
            } catch (Exception unused) {
            }
        }
        RLottieNative rLottieNative2 = this.n0;
        int i2 = this.c0 ? 2 : 1;
        if (!this.t0 || (ek0Var = this.C0) == null) {
            c = rLottieNative2.c(this.b0, bitmap, z);
        } else {
            c = 0;
            try {
                c = ek0Var.f(this.b0 / i2, bitmap);
                if (!this.C0.g() && this.F0 && this.n0 != null) {
                    this.n0.d();
                    this.n0 = null;
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        ek0 ek0Var2 = this.C0;
        if (ek0Var2 != null && ek0Var2.g()) {
            if (!this.E0) {
                this.E0 = true;
                hl.c3(this.z0);
            }
            c = -1;
            if (this.F0) {
                if (this.n0 == null) {
                    String file2 = ((File) this.v0.e).toString();
                    tf7 tf7Var4 = this.v0;
                    this.n0 = RLottieNative.a(file2, tf7Var4.c, null, (int[]) tf7Var4.d, tf7Var4.a, this.x);
                }
                if (this.n0 != null) {
                    c = this.n0.c(this.b0, bitmap, z);
                }
            }
        }
        return c < 0 ? 2 : 1;
    }

    public void x(boolean z) {
        this.l0 = false;
        this.m0 = true;
        g();
        i();
        if (this.Q != null || this.P != null || this.y0) {
            this.W = true;
            return;
        }
        y(z);
        ek0 ek0Var = this.C0;
        if (ek0Var != null) {
            RandomAccessFile randomAccessFile = ek0Var.s;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                ek0Var.s = null;
            }
            ek0Var.r = true;
            this.C0 = null;
        }
        z();
    }

    public void y(boolean z) {
        RLottieNative rLottieNative = this.n0;
        this.n0 = null;
        if (rLottieNative != null) {
            uk8 uk8Var = new uk8(rLottieNative, (byte) 23);
            if (z) {
                vo3.a(uk8Var);
            } else {
                Utilities.e.c(uk8Var);
            }
        }
    }

    public final void z() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.R);
        arrayList.add(this.T);
        arrayList.add(this.S);
        this.S = null;
        this.R = null;
        this.T = null;
        hl.x2(arrayList);
        if (this.u0 != null) {
            this.u0 = null;
        }
    }

    public b29(int i, int i2) {
        this.e = new int[3];
        this.f = -1;
        this.s = new HashMap();
        this.w = new HashMap();
        this.x = new HashMap();
        this.E = false;
        this.F = true;
        this.G = 1.0f;
        this.L = (byte) 1;
        this.M = -1;
        this.e0 = 1.0f;
        this.f0 = 1.0f;
        this.i0 = new RectF();
        this.j0 = new RectF[2];
        this.k0 = new Paint[2];
        this.w0 = new zk1(this, (byte) 2);
        this.x0 = new zk1(this, (byte) 3);
        this.z0 = new zk1(this, (byte) 4);
        this.A0 = new zk1(this, (byte) 5);
        this.G0 = new zk1(this, (byte) 6);
        this.J0 = new r89(0, true);
        this.N0 = new km(this, (byte) 2);
        this.b = i;
        this.c = i2;
        this.H = false;
    }

    public b29(int i, int i2, int i3) {
        this(i, i2, i3, true, null);
    }

    public b29(int i, int i2, int i3, boolean z, int[] iArr) {
        long j;
        this.e = new int[3];
        this.f = -1;
        this.s = new HashMap();
        this.w = new HashMap();
        this.x = new HashMap();
        boolean z2 = false;
        this.E = false;
        this.F = true;
        this.G = 1.0f;
        this.L = (byte) 1;
        this.M = -1;
        this.e0 = 1.0f;
        this.f0 = 1.0f;
        this.i0 = new RectF();
        this.j0 = new RectF[2];
        this.k0 = new Paint[2];
        this.w0 = new zk1(this, (byte) 2);
        this.x0 = new zk1(this, (byte) 3);
        this.z0 = new zk1(this, (byte) 4);
        this.A0 = new zk1(this, (byte) 5);
        this.G0 = new zk1(this, (byte) 6);
        this.J0 = new r89(0, true);
        this.N0 = new km(this, (byte) 2);
        this.b = i2;
        this.c = i3;
        this.L = (byte) 0;
        getPaint().setFlags(2);
        tf7 tf7Var = new tf7();
        this.v0 = tf7Var;
        tf7Var.d = iArr == null ? null : (int[]) iArr.clone();
        long[] jArr = ac9.a;
        int length = jArr.length - 1;
        int i4 = 0;
        while (true) {
            if (i4 > length) {
                j = -1;
                break;
            }
            int i5 = (i4 + length) >>> 1;
            j = jArr[i5];
            int i6 = (int) (j >>> 32);
            if (i6 >= i) {
                if (i6 <= i) {
                    break;
                } else {
                    length = i5 - 1;
                }
            } else {
                i4 = i5 + 1;
            }
        }
        if (j != -1) {
            this.d = true;
            this.v0.b = i;
            boolean z3 = (8388608 & j) != 0;
            this.H = z3;
            int[] iArr2 = this.e;
            iArr2[0] = (int) (8388607 & j);
            iArr2[1] = (int) ((j >>> 24) & 255);
            z2 = z3;
        } else {
            this.H = false;
            String v2 = hl.v2(null, i);
            if (TextUtils.isEmpty(v2)) {
                this.v0 = null;
                return;
            } else {
                tf7 tf7Var2 = this.v0;
                tf7Var2.c = v2;
                this.n0 = RLottieNative.b(v2, this.e, (int[]) tf7Var2.d, this.x);
            }
        }
        if (z2) {
            setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        if (z) {
            E(true);
        }
    }
}
