package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
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
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.DispatchQueuePoolBackground;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class xi0 extends BitmapDrawable implements Animatable, jf.e {
    public static final AtomicInteger L0 = new AtomicInteger();
    public static final AtomicInteger M0 = new AtomicInteger();
    public static final ExecutorService N0;
    public static final ExecutorService O0;
    public static DispatchQueue P0;
    public boolean A;
    public int A0;
    public float B;
    public boolean B0;
    public final boolean C;
    public boolean C0;
    public WeakReference D;
    public final Runnable D0;
    public int E;
    public int E0;
    public final ArrayList F;
    public RLottieNative F0;
    public int G;
    public int G0;
    public int H;
    public volatile boolean H0;
    public int I;
    public final jf.i I0;
    public int J;
    public boolean J0;
    public volatile boolean K;
    public boolean K0;
    public ui0 L;
    public Runnable M;
    public volatile Bitmap N;
    public volatile Bitmap O;
    public volatile Bitmap P;
    public boolean Q;
    public CountDownLatch R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public final boolean Y;
    public final boolean Z;
    public boolean a;
    public float a0;
    public final int b;
    public float b0;
    public final int c;
    public boolean c0;
    public boolean d;
    public boolean d0;
    public final int[] e;
    public final RectF e0;
    public int f;
    public final RectF[] f0;
    public final Paint[] g0;
    public boolean h;
    public volatile boolean h0;
    public volatile boolean i0;
    public volatile RLottieNative j0;
    public final boolean k0;
    public boolean l0;
    public boolean m0;
    public int[] n;
    public boolean n0;
    public final File o0;
    public final boolean p0;
    public Runnable q0;
    public int[] r;
    public View r0;
    public final HashMap s;
    public final wi0 s0;
    public final Runnable t0;
    public final Runnable u0;
    public final HashMap v;
    public boolean v0;
    public final HashMap w;
    public final Runnable w0;
    public HashMap x;
    public final Runnable x0;
    public boolean y;
    public Runnable y0;
    public jf.g z0;

    static {
        final int i10 = 0;
        N0 = Executors.newFixedThreadPool(4, new ThreadFactory() { // from class: org.telegram.ui.Components.vi0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                switch (i10) {
                    case 0:
                        return new Thread(runnable, "Lottie-" + xi0.L0.getAndIncrement());
                    default:
                        return new Thread(runnable, "LottieLow-" + xi0.M0.getAndIncrement());
                }
            }
        });
        final int i11 = 1;
        O0 = Executors.newFixedThreadPool(2, new ThreadFactory() { // from class: org.telegram.ui.Components.vi0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                switch (i11) {
                    case 0:
                        return new Thread(runnable, "Lottie-" + xi0.L0.getAndIncrement());
                    default:
                        return new Thread(runnable, "LottieLow-" + xi0.M0.getAndIncrement());
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xi0(File file, String str, int i10, int i11, ie.i iVar, boolean z10, int i12, boolean z11) {
        int i13;
        char c3;
        RLottieNative a2;
        JsonReader jsonReader;
        int[] iArr = new int[3];
        this.e = iArr;
        this.f = -1;
        this.s = new HashMap();
        this.v = new HashMap();
        HashMap hashMap = new HashMap();
        this.w = hashMap;
        this.y = false;
        this.A = true;
        this.B = 1.0f;
        this.F = new ArrayList();
        this.H = 1;
        this.I = -1;
        this.a0 = 1.0f;
        this.b0 = 1.0f;
        this.e0 = new RectF();
        this.f0 = new RectF[2];
        this.g0 = new Paint[2];
        this.t0 = new ui0(this, 1);
        this.u0 = new ui0(this, 2);
        this.w0 = new ui0(this, 3);
        this.x0 = new ui0(this, 4);
        this.D0 = new ui0(this, 5);
        this.I0 = new b6(this, 2);
        this.b = i10;
        this.c = i11;
        this.Y = z10;
        this.C = z11;
        boolean z12 = iVar != null;
        this.p0 = z12;
        this.k0 = str == null && iVar != null && iVar.b;
        boolean z13 = iVar != null && iVar.c;
        this.Z = z13;
        wi0 wi0Var = new wi0();
        this.s0 = wi0Var;
        wi0Var.d = file.getAbsoluteFile();
        wi0Var.e = str;
        wi0Var.a = null;
        wi0Var.b = i12;
        getPaint().setFlags(2);
        if (str == null) {
            this.o0 = file;
        }
        if (z12 && P0 == null) {
            P0 = new DispatchQueue("cache generator queue");
        }
        if (!z12) {
            this.j0 = RLottieNative.a(file.getAbsolutePath(), str, i10, i11, iArr, z12, wi0Var.a, z10, i12, hashMap);
            if (this.j0 == null) {
                FileLog.d("RLottieDrawable nativePtr == 0 " + file.getAbsolutePath() + " remove file");
                file.delete();
            }
            if (!z10 || iArr[1] >= 60) {
                return;
            }
            this.Y = false;
            return;
        }
        if (z13) {
            return;
        }
        try {
            try {
                jsonReader = new JsonReader(new FileReader(file.getAbsoluteFile()));
            } catch (Exception e10) {
                e = e10;
                FileLog.e((Throwable) e, false);
                String absolutePath = file.getAbsolutePath();
                int i14 = this.b;
                int i15 = this.c;
                wi0 wi0Var2 = this.s0;
                i13 = 60;
                c3 = 1;
                a2 = RLottieNative.a(absolutePath, str, i14, i15, iArr, false, wi0Var2.a, this.Y, wi0Var2.b, this.w);
                if (a2 != null) {
                    a2.d();
                }
                if (this.Y) {
                    this.Y = false;
                }
                this.z0 = new jf.g(file, this, iVar, i10, i11, !z10, i12);
            }
        } catch (Exception e11) {
            e = e11;
            FileLog.e((Throwable) e, false);
            String absolutePath2 = file.getAbsolutePath();
            int i142 = this.b;
            int i152 = this.c;
            wi0 wi0Var22 = this.s0;
            i13 = 60;
            c3 = 1;
            a2 = RLottieNative.a(absolutePath2, str, i142, i152, iArr, false, wi0Var22.a, this.Y, wi0Var22.b, this.w);
            if (a2 != null) {
            }
            if (this.Y) {
            }
            this.z0 = new jf.g(file, this, iVar, i10, i11, !z10, i12);
        }
        try {
            jsonReader.beginObject();
            double d = 0.0d;
            double d10 = 30.0d;
            double d11 = 0.0d;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                try {
                    int hashCode = nextName.hashCode();
                    if (hashCode != 3276) {
                        if (hashCode != 3367) {
                            if (hashCode == 3553 && nextName.equals("op")) {
                                d = jsonReader.nextDouble();
                            }
                            jsonReader.skipValue();
                        } else if (nextName.equals("ip")) {
                            d11 = jsonReader.nextDouble();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (nextName.equals("fr")) {
                        d10 = jsonReader.nextDouble();
                    } else {
                        jsonReader.skipValue();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    try {
                        jsonReader.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            }
            jsonReader.endObject();
            jsonReader.close();
            iArr[0] = (int) (d - d11);
            iArr[1] = (int) d10;
            i13 = 60;
            c3 = 1;
            if (this.Y && this.e[c3] < i13) {
                this.Y = false;
            }
            this.z0 = new jf.g(file, this, iVar, i10, i11, !z10, i12);
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public static void d(xi0 xi0Var) {
        if (xi0Var.L != null) {
            jf.g.c();
            xi0Var.L = null;
        }
        xi0Var.v0 = false;
        xi0Var.n();
        Runnable runnable = xi0Var.y0;
        if (runnable != null) {
            runnable.run();
            xi0Var.y0 = null;
        }
    }

    public static void e(xi0 xi0Var) {
        if (xi0Var.i0 || xi0Var.S || !xi0Var.i() || xi0Var.L != null) {
            return;
        }
        xi0Var.v0 = true;
        if (P0 == null) {
            P0 = new DispatchQueue("cache generator queue");
        }
        jf.g.A++;
        DispatchQueue dispatchQueue = P0;
        ui0 ui0Var = new ui0(xi0Var, 0);
        xi0Var.L = ui0Var;
        dispatchQueue.postRunnable(ui0Var);
    }

    public static void f(xi0 xi0Var) {
        Runnable runnable = xi0Var.t0;
        int z10 = xi0Var.z();
        if (z10 == 1) {
            xi0Var.E0 = 0;
            AndroidUtilities.runOnUIThread(xi0Var.u0);
        } else if (z10 == 2) {
            AndroidUtilities.runOnUIThread(runnable, xi0Var.E0);
            xi0Var.E0 = Math.min((Math.max(xi0Var.E0, 2) * 3) / 2, 2000);
        } else if (z10 == 3) {
            AndroidUtilities.runOnUIThread(runnable);
        }
        CountDownLatch countDownLatch = xi0Var.R;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static void g(xi0 xi0Var) {
        int i10 = xi0Var.G0 + 1;
        xi0Var.G0 = i10;
        if (i10 > 10) {
            xi0Var.H0 = true;
        }
        xi0Var.k();
        if (xi0Var.K0) {
            xi0Var.J0 = true;
            xi0Var.v();
        }
    }

    public static void h(xi0 xi0Var) {
        xi0Var.U = true;
        if ((!xi0Var.h0 && xi0Var.T) || (xi0Var.N == null && xi0Var.O != null)) {
            xi0Var.v();
        }
        xi0Var.n();
    }

    public void A(boolean z10) {
        this.h0 = false;
        this.i0 = true;
        j();
        l();
        if (this.M != null || this.L != null || this.v0) {
            this.S = true;
            return;
        }
        B(z10);
        jf.g gVar = this.z0;
        if (gVar != null) {
            RandomAccessFile randomAccessFile = gVar.s;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
                gVar.s = null;
            }
            gVar.r = true;
            this.z0 = null;
        }
        C();
    }

    public void B(boolean z10) {
        RLottieNative rLottieNative = this.j0;
        this.j0 = null;
        if (rLottieNative != null) {
            xb0 xb0Var = new xb0(rLottieNative, 15);
            if (z10) {
                DispatchQueuePoolBackground.execute(xb0Var);
            } else {
                Utilities.globalQueue.postRunnable(xb0Var);
            }
        }
    }

    public final void C() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.N);
        arrayList.add(this.P);
        arrayList.add(this.O);
        this.O = null;
        this.N = null;
        this.P = null;
        AndroidUtilities.recycleBitmaps(arrayList);
        if (this.q0 != null) {
            this.q0 = null;
        }
    }

    public final void D(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.F;
        arrayList.remove(imageReceiver);
        if (this.z0 == null || P0 == null || this.L == null || !arrayList.isEmpty() || getCallback() != null) {
            return;
        }
        View view = this.r0;
        if (view == null || !view.isAttachedToWindow()) {
            ui0 ui0Var = this.L;
            if (ui0Var != null) {
                P0.cancelRunnable(ui0Var);
                jf.g.c();
                this.L = null;
            }
            this.v0 = false;
            this.B0 = false;
        }
    }

    public final void E() {
        if (!this.W && !this.h0 && this.T) {
            if (this.X <= 2) {
                this.X = 0;
            }
            this.K = false;
            this.U = false;
            if (!G()) {
                this.V = true;
            }
        }
        v();
    }

    public final boolean F(boolean z10) {
        if (!z10 && ((this.H < 2 || this.J == 0) && this.I < 0)) {
            return false;
        }
        this.J = 0;
        this.H = 2;
        start();
        return true;
    }

    public final boolean G() {
        if (this.M != null || this.O != null || !i() || u() || this.S || this.i0) {
            return false;
        }
        if (!this.h0 && (!this.T || this.U)) {
            return false;
        }
        if (this.v0 && !this.C0) {
            return false;
        }
        if (!this.s.isEmpty()) {
            this.v.putAll(this.s);
            this.s.clear();
        }
        int[] iArr = this.n;
        if (iArr != null) {
            this.r = iArr;
            this.n = null;
        }
        Runnable runnable = this.D0;
        this.M = runnable;
        (this.Y ? O0 : N0).execute(runnable);
        return true;
    }

    public final void H(boolean z10) {
        this.T = true;
        G();
    }

    public final void I(int i10) {
        if (this.H == 2 && i10 == 3 && this.X != 0) {
            return;
        }
        this.H = i10;
    }

    public final void J() {
        L(85, false, false);
    }

    public final void K(int i10) {
        L(i10, true, false);
    }

    public final void L(int i10, boolean z10, boolean z11) {
        if (i10 < 0 || i10 > this.e[0]) {
            return;
        }
        if (this.X != i10 || z11) {
            this.X = i10;
            this.K = false;
            this.U = false;
            if (this.l0) {
                this.m0 = true;
                if (this.M != null) {
                    this.n0 = true;
                }
            }
            if ((!z10 || z11) && this.Q && this.O != null) {
                this.P = this.O;
                this.O = null;
                this.M = null;
                this.Q = false;
            }
            if (!z10 && this.M == null) {
                this.R = new CountDownLatch(1);
            }
            if (z11 && !this.h0) {
                this.h0 = true;
                j();
            }
            if (!G()) {
                this.V = true;
            } else if (!z10) {
                try {
                    this.R.await();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                this.R = null;
            }
            invalidateSelf();
        }
    }

    public final void M(boolean z10) {
        WeakReference weakReference;
        Runnable runnable;
        WeakReference weakReference2;
        this.P = this.N;
        this.N = this.O;
        this.O = null;
        this.J0 = false;
        if (this.G == 2 && (weakReference2 = this.D) != null && this.X - 1 >= this.E) {
            Runnable runnable2 = (Runnable) weakReference2.get();
            if (runnable2 != null) {
                runnable2.run();
            }
            this.D = null;
        }
        if (this.K || (this.I == 0 && this.H == 1)) {
            stop();
        }
        this.M = null;
        if (this.n0) {
            this.n0 = false;
        } else if (this.m0) {
            this.m0 = false;
        }
        this.U = true;
        this.Q = false;
        if (z10 && this.V) {
            this.U = false;
            this.V = false;
        }
        if (this.G == 0 && (weakReference = this.D) != null && this.X >= this.E && (runnable = (Runnable) weakReference.get()) != null) {
            runnable.run();
        }
        G();
    }

    public final boolean N(int i10) {
        if (this.f == i10 || i10 > this.e[0]) {
            return false;
        }
        this.f = i10;
        return true;
    }

    public final void O(int i10, String str) {
        this.s.put(str, Integer.valueOf(i10));
        E();
    }

    public final void P(int i10, Runnable runnable) {
        if (runnable != null) {
            this.D = new WeakReference(runnable);
            this.E = i10;
        } else if (this.D != null) {
            this.D = null;
        }
    }

    public final void Q(float f9, boolean z10) {
        if (f9 < 0.0f) {
            f9 = 0.0f;
        } else if (f9 > 1.0f) {
            f9 = 1.0f;
        }
        L((int) (this.e[0] * f9), z10, false);
    }

    public final void R(long j10) {
        int i10;
        int[] iArr = this.e;
        if (iArr[0] == 0 || (i10 = iArr[1]) == 0) {
            return;
        }
        L(Math.round(Math.max(0L, j10) / (1000.0f / i10)) % iArr[0], true, true);
    }

    public final void S(long j10) {
        Integer num;
        this.G0 = 0;
        if (this.H0) {
            this.H0 = false;
            j();
        }
        if (j10 == 0) {
            System.currentTimeMillis();
        }
        boolean z10 = this.J0 || (!this.h0 && this.T);
        if (!this.h0) {
            if ((this.V || (this.T && z10)) && this.O != null) {
                M(true);
                return;
            }
            return;
        }
        if (this.N == null && this.O == null) {
            G();
            return;
        }
        if (this.O != null) {
            if (this.N == null || (z10 && !this.a)) {
                HashMap hashMap = this.x;
                if (hashMap != null && this.A && (num = (Integer) hashMap.get(Integer.valueOf(this.X - 1))) != null) {
                    try {
                        Activity activity = LaunchActivity.C1;
                        if (activity == null) {
                            activity = BubbleActivity.W;
                        }
                        activity.getWindow().getDecorView().performHapticFeedback(num.intValue() == 1 ? 0 : 3, 2);
                    } catch (Exception unused) {
                    }
                }
                M(false);
            }
        }
    }

    @Override // jf.e
    public final int a(Bitmap bitmap) {
        RLottieNative rLottieNative = this.F0;
        if (rLottieNative == null) {
            return -1;
        }
        int i10 = this.A0;
        if (i10 >= rLottieNative.a[0]) {
            return 0;
        }
        int i11 = this.Y ? 2 : 1;
        if (rLottieNative.c(i10, bitmap, true) != -5) {
            this.A0 += i11;
            return 1;
        }
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
        return a(bitmap);
    }

    @Override // jf.e
    public final void b() {
        File file;
        wi0 wi0Var = this.s0;
        File file2 = wi0Var.d;
        RLottieNative a2 = RLottieNative.a(file2 != null ? file2.toString() : null, wi0Var.e, this.b, this.c, this.Z ? this.e : null, false, wi0Var.a, false, wi0Var.b, this.w);
        this.F0 = a2;
        this.A0 = 0;
        if (a2 != null || (file = this.o0) == null) {
            return;
        }
        file.delete();
    }

    @Override // jf.e
    public final void c() {
        RLottieNative rLottieNative = this.F0;
        if (rLottieNative != null) {
            rLottieNative.d();
            this.F0 = null;
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        o(canvas, null, false, 0L, 0);
    }

    public final void finalize() {
        try {
            A(false);
        } finally {
            super.finalize();
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

    public final boolean i() {
        return this.p0 ? this.z0 != null || this.k0 : this.j0 != null || this.d;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.h0;
    }

    public final void j() {
        AndroidUtilities.executeOnUIThread(new ui0(this, 6));
    }

    public final void k() {
        if (!this.h0 || this.H0) {
            if (this.K0) {
                this.K0 = false;
                this.G0 = 0;
                jf.j.d().g(this.I0);
                return;
            }
            return;
        }
        if (this.K0) {
            return;
        }
        int round = Math.round((this.e[1] / (this.Y ? 2.0f : 1.0f)) * this.B);
        if (round > 0) {
            if (this.e[0] == 1 && this.G == 0) {
                return;
            }
            this.K0 = true;
            this.G0 = 0;
            jf.j.d().b(this.I0, round);
            v();
        }
    }

    public final void l() {
        ui0 ui0Var = this.L;
        if (ui0Var != null) {
            P0.cancelRunnable(ui0Var);
            jf.g.c();
            this.L = null;
        }
        if (t() || this.O == null || this.M == null) {
            return;
        }
        this.M = null;
        this.O = null;
    }

    public final void m() {
        if (this.W) {
            this.W = false;
            if (!this.h0 && this.T) {
                if (this.X <= 2) {
                    this.X = 0;
                }
                this.K = false;
                this.U = false;
                if (!G()) {
                    this.V = true;
                }
            }
            v();
        }
    }

    public void n() {
        if (this.S) {
            l();
            if (this.M == null && this.L == null && this.j0 != null) {
                B(true);
            }
        }
        if ((this.j0 == null || this.k0) && this.z0 == null) {
            C();
            return;
        }
        this.Q = true;
        if (!t()) {
            stop();
        }
        if (this.h0) {
            G();
        }
    }

    public final void o(Canvas canvas, Paint paint, boolean z10, long j10, int i10) {
        float width;
        boolean z11;
        float f9;
        if (!i() || this.S) {
            return;
        }
        if (!z10) {
            S(j10);
        }
        RectF rectF = z10 ? this.f0[i10] : this.e0;
        if (paint == null) {
            paint = z10 ? this.g0[i10] : getPaint();
        }
        if (paint.getAlpha() == 0 || this.m0 || this.N == null) {
            return;
        }
        boolean z12 = true;
        if (z10) {
            width = rectF.width() / this.b;
            float height = rectF.height() / this.c;
            if (Math.abs(rectF.width() - this.b) < AndroidUtilities.dp(1.0f) && Math.abs(rectF.height() - this.c) < AndroidUtilities.dp(1.0f)) {
                z12 = false;
            }
            z11 = z12;
            f9 = height;
        } else {
            rectF.set(getBounds());
            if (this.c0) {
                this.a0 = rectF.width() / this.b;
                this.b0 = rectF.height() / this.c;
                this.c0 = false;
                if (Math.abs(rectF.width() - this.b) < AndroidUtilities.dp(1.0f) && Math.abs(rectF.height() - this.c) < AndroidUtilities.dp(1.0f)) {
                    z12 = false;
                }
                this.d0 = z12;
            }
            width = this.a0;
            f9 = this.b0;
            z11 = this.d0;
        }
        if (!z11) {
            canvas.drawBitmap(this.N, rectF.left, rectF.top, paint);
            return;
        }
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        canvas.scale(width, f9);
        canvas.drawBitmap(this.N, 0.0f, 0.0f, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.c0 = true;
    }

    public final long p() {
        int[] iArr = this.e;
        return (long) ((iArr[0] / iArr[1]) * 1000.0f);
    }

    public final int q() {
        return this.e[0];
    }

    public final float r() {
        return this.X / this.e[0];
    }

    public final boolean s() {
        if (this.i0) {
            return false;
        }
        return ((this.N == null && this.O == null) || this.m0) ? false : true;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.h0) {
            return;
        }
        if ((this.H < 2 || this.J == 0) && this.f != this.X) {
            this.h0 = true;
            this.H0 = false;
            if (this.l0) {
                this.m0 = true;
                if (this.M != null) {
                    this.n0 = true;
                }
            }
            G();
            v();
            j();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.h0 = false;
        j();
    }

    public final boolean t() {
        return (this.F.isEmpty() && this.r0 == null && getCallback() == null) ? false : true;
    }

    public boolean u() {
        return this.N != null && this.e[0] == 1;
    }

    public final void v() {
        if (this.i0) {
            return;
        }
        int size = this.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((ImageReceiver) this.F.get(i10)).invalidate();
        }
        View view = this.r0;
        if (view != null) {
            view.invalidate();
        }
        if (getCallback() != null) {
            invalidateSelf();
        }
    }

    public final boolean w() {
        return this.L != null;
    }

    public boolean x() {
        return true;
    }

    public final boolean y() {
        return this.X == this.e[0] - 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0105 A[Catch: Exception -> 0x0132, TRY_LEAVE, TryCatch #5 {Exception -> 0x0132, blocks: (B:24:0x00f8, B:27:0x0101, B:29:0x0105, B:43:0x013d, B:45:0x0141, B:47:0x0147, B:49:0x014b, B:50:0x0152, B:52:0x0157, B:54:0x015b, B:55:0x017f, B:57:0x0183, B:59:0x0191, B:61:0x0199, B:63:0x019d, B:65:0x01a1, B:67:0x01a4, B:68:0x01aa, B:70:0x01b0, B:71:0x01b7, B:73:0x01ba, B:74:0x01c0, B:76:0x01c6, B:77:0x01cc, B:81:0x01d8, B:83:0x01dc, B:84:0x01e4, B:85:0x01e9, B:87:0x01ed, B:89:0x01f5, B:90:0x01f9, B:92:0x01fd, B:95:0x0204, B:97:0x0211, B:98:0x0216, B:100:0x021c, B:101:0x01d2, B:104:0x012e, B:107:0x0135), top: B:23:0x00f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0141 A[Catch: Exception -> 0x0132, TryCatch #5 {Exception -> 0x0132, blocks: (B:24:0x00f8, B:27:0x0101, B:29:0x0105, B:43:0x013d, B:45:0x0141, B:47:0x0147, B:49:0x014b, B:50:0x0152, B:52:0x0157, B:54:0x015b, B:55:0x017f, B:57:0x0183, B:59:0x0191, B:61:0x0199, B:63:0x019d, B:65:0x01a1, B:67:0x01a4, B:68:0x01aa, B:70:0x01b0, B:71:0x01b7, B:73:0x01ba, B:74:0x01c0, B:76:0x01c6, B:77:0x01cc, B:81:0x01d8, B:83:0x01dc, B:84:0x01e4, B:85:0x01e9, B:87:0x01ed, B:89:0x01f5, B:90:0x01f9, B:92:0x01fd, B:95:0x0204, B:97:0x0211, B:98:0x0216, B:100:0x021c, B:101:0x01d2, B:104:0x012e, B:107:0x0135), top: B:23:0x00f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014b A[Catch: Exception -> 0x0132, TryCatch #5 {Exception -> 0x0132, blocks: (B:24:0x00f8, B:27:0x0101, B:29:0x0105, B:43:0x013d, B:45:0x0141, B:47:0x0147, B:49:0x014b, B:50:0x0152, B:52:0x0157, B:54:0x015b, B:55:0x017f, B:57:0x0183, B:59:0x0191, B:61:0x0199, B:63:0x019d, B:65:0x01a1, B:67:0x01a4, B:68:0x01aa, B:70:0x01b0, B:71:0x01b7, B:73:0x01ba, B:74:0x01c0, B:76:0x01c6, B:77:0x01cc, B:81:0x01d8, B:83:0x01dc, B:84:0x01e4, B:85:0x01e9, B:87:0x01ed, B:89:0x01f5, B:90:0x01f9, B:92:0x01fd, B:95:0x0204, B:97:0x0211, B:98:0x0216, B:100:0x021c, B:101:0x01d2, B:104:0x012e, B:107:0x0135), top: B:23:0x00f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0157 A[Catch: Exception -> 0x0132, TryCatch #5 {Exception -> 0x0132, blocks: (B:24:0x00f8, B:27:0x0101, B:29:0x0105, B:43:0x013d, B:45:0x0141, B:47:0x0147, B:49:0x014b, B:50:0x0152, B:52:0x0157, B:54:0x015b, B:55:0x017f, B:57:0x0183, B:59:0x0191, B:61:0x0199, B:63:0x019d, B:65:0x01a1, B:67:0x01a4, B:68:0x01aa, B:70:0x01b0, B:71:0x01b7, B:73:0x01ba, B:74:0x01c0, B:76:0x01c6, B:77:0x01cc, B:81:0x01d8, B:83:0x01dc, B:84:0x01e4, B:85:0x01e9, B:87:0x01ed, B:89:0x01f5, B:90:0x01f9, B:92:0x01fd, B:95:0x0204, B:97:0x0211, B:98:0x0216, B:100:0x021c, B:101:0x01d2, B:104:0x012e, B:107:0x0135), top: B:23:0x00f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0191 A[Catch: Exception -> 0x0132, TryCatch #5 {Exception -> 0x0132, blocks: (B:24:0x00f8, B:27:0x0101, B:29:0x0105, B:43:0x013d, B:45:0x0141, B:47:0x0147, B:49:0x014b, B:50:0x0152, B:52:0x0157, B:54:0x015b, B:55:0x017f, B:57:0x0183, B:59:0x0191, B:61:0x0199, B:63:0x019d, B:65:0x01a1, B:67:0x01a4, B:68:0x01aa, B:70:0x01b0, B:71:0x01b7, B:73:0x01ba, B:74:0x01c0, B:76:0x01c6, B:77:0x01cc, B:81:0x01d8, B:83:0x01dc, B:84:0x01e4, B:85:0x01e9, B:87:0x01ed, B:89:0x01f5, B:90:0x01f9, B:92:0x01fd, B:95:0x0204, B:97:0x0211, B:98:0x0216, B:100:0x021c, B:101:0x01d2, B:104:0x012e, B:107:0x0135), top: B:23:0x00f8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int z() {
        boolean z10;
        int i10;
        RLottieNative b10;
        int c3;
        jf.g gVar;
        jf.g gVar2;
        if (this.i0) {
            return 3;
        }
        if (i()) {
            if (this.j0 == null && this.d) {
                String readRes = AndroidUtilities.readRes(this.s0.c);
                if (!TextUtils.isEmpty(readRes)) {
                    wi0 wi0Var = this.s0;
                    this.j0 = RLottieNative.b(readRes, wi0Var.f, this.e, wi0Var.a, this.w);
                    this.d = false;
                }
            }
            if (this.P == null) {
                try {
                    this.P = Bitmap.createBitmap(this.b, this.c, this.C ? Bitmap.Config.ALPHA_8 : Bitmap.Config.ARGB_8888);
                    z10 = false;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                if (this.P != null) {
                    RLottieNative rLottieNative = this.j0;
                    try {
                        if (rLottieNative != null) {
                            if (!this.v.isEmpty() || this.r != null) {
                                this.w.putAll(this.v);
                                int[] iArr = this.r;
                                if (iArr != null) {
                                    this.s0.a = (int[]) iArr.clone();
                                }
                                wi0 wi0Var2 = this.s0;
                                File file = wi0Var2.d;
                                if (file != null) {
                                    String absolutePath = file.getAbsolutePath();
                                    wi0 wi0Var3 = this.s0;
                                    i10 = 2;
                                    b10 = RLottieNative.a(absolutePath, wi0Var3.e, this.b, this.c, this.e, false, wi0Var3.a, this.Y, wi0Var3.b, this.w);
                                } else {
                                    i10 = 2;
                                    int i11 = wi0Var2.c;
                                    if (i11 == 0 || wi0Var2.e != null) {
                                        b10 = RLottieNative.b(wi0Var2.e, wi0Var2.f, this.e, wi0Var2.a, this.w);
                                    } else {
                                        String readRes2 = AndroidUtilities.readRes(i11);
                                        if (TextUtils.isEmpty(readRes2)) {
                                            RLottieNative rLottieNative2 = this.j0;
                                            int i12 = this.Y ? 2 : 1;
                                            if (this.p0 || (gVar2 = this.z0) == null) {
                                                c3 = rLottieNative2.c(this.X, this.P, z10);
                                            } else {
                                                try {
                                                    c3 = gVar2.f(this.P, this.X / i12);
                                                } catch (Exception e10) {
                                                    e = e10;
                                                    c3 = 0;
                                                }
                                                try {
                                                    if (!this.z0.g() && this.C0 && this.j0 != null) {
                                                        this.j0.d();
                                                        this.j0 = null;
                                                    }
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    FileLog.e(e);
                                                    gVar = this.z0;
                                                    if (gVar != null) {
                                                    }
                                                    if (c3 >= 0) {
                                                    }
                                                }
                                            }
                                            gVar = this.z0;
                                            if (gVar != null && gVar.g()) {
                                                if (!this.B0) {
                                                    this.B0 = true;
                                                    AndroidUtilities.runOnUIThread(this.w0);
                                                }
                                                c3 = -1;
                                                if (this.C0) {
                                                    if (this.j0 == null) {
                                                        String file2 = this.s0.d.toString();
                                                        wi0 wi0Var4 = this.s0;
                                                        this.j0 = RLottieNative.a(file2, wi0Var4.e, this.b, this.c, null, false, wi0Var4.a, false, wi0Var4.b, this.w);
                                                    }
                                                    if (this.j0 != null) {
                                                        c3 = this.j0.c(this.X, this.P, z10);
                                                    }
                                                }
                                            }
                                            if (c3 >= 0) {
                                                return i10;
                                            }
                                            this.O = this.P;
                                            int i13 = this.f;
                                            if (i13 < 0 || !this.h) {
                                                int i14 = this.X + i12;
                                                if (i13 < 0) {
                                                    i13 = this.e[0];
                                                }
                                                if (i14 >= i13) {
                                                    int i15 = this.H;
                                                    if (i15 == 1) {
                                                        this.X = 0;
                                                        this.K = false;
                                                        if (this.y) {
                                                            this.x = null;
                                                            this.y = false;
                                                        }
                                                        int i16 = this.I;
                                                        if (i16 > 0) {
                                                            this.I = i16 - 1;
                                                        }
                                                    } else if (i15 == 2) {
                                                        this.X = 0;
                                                        this.K = true;
                                                        this.J++;
                                                        if (this.y) {
                                                            this.x = null;
                                                            this.y = false;
                                                        }
                                                    } else {
                                                        this.K = true;
                                                        Runnable runnable = this.q0;
                                                        if (runnable != null) {
                                                            runnable.run();
                                                            this.q0 = null;
                                                        }
                                                    }
                                                } else if (this.H == 3) {
                                                    this.K = true;
                                                    this.J++;
                                                } else {
                                                    this.X = i14;
                                                    this.K = false;
                                                }
                                            } else {
                                                int i17 = this.X;
                                                if (i17 > i13) {
                                                    int i18 = i17 - i12;
                                                    if (i18 >= i13) {
                                                        this.X = i18;
                                                        this.K = false;
                                                    } else {
                                                        this.K = true;
                                                        Runnable runnable2 = this.q0;
                                                        if (runnable2 != null) {
                                                            runnable2.run();
                                                            this.q0 = null;
                                                        }
                                                    }
                                                } else {
                                                    int i19 = i17 + i12;
                                                    if (i19 < i13) {
                                                        this.X = i19;
                                                        this.K = false;
                                                    } else {
                                                        this.K = true;
                                                        Runnable runnable3 = this.q0;
                                                        if (runnable3 != null) {
                                                            runnable3.run();
                                                            this.q0 = null;
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            wi0 wi0Var5 = this.s0;
                                            wi0Var5.e = readRes2;
                                            b10 = RLottieNative.b(readRes2, wi0Var5.f, this.e, wi0Var5.a, this.w);
                                        }
                                    }
                                }
                                if (b10 != null) {
                                    this.j0 = b10;
                                    rLottieNative.d();
                                    this.v.clear();
                                    this.r = null;
                                }
                                RLottieNative rLottieNative22 = this.j0;
                                if (this.Y) {
                                }
                                if (this.p0) {
                                }
                                c3 = rLottieNative22.c(this.X, this.P, z10);
                                gVar = this.z0;
                                if (gVar != null) {
                                    if (!this.B0) {
                                    }
                                    c3 = -1;
                                    if (this.C0) {
                                    }
                                }
                                if (c3 >= 0) {
                                }
                            }
                        }
                        RLottieNative rLottieNative222 = this.j0;
                        if (this.Y) {
                        }
                        if (this.p0) {
                        }
                        c3 = rLottieNative222.c(this.X, this.P, z10);
                        gVar = this.z0;
                        if (gVar != null) {
                        }
                        if (c3 >= 0) {
                        }
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                    i10 = 2;
                }
                return 1;
            }
            z10 = true;
            if (this.P != null) {
            }
            return 1;
        }
        return 2;
    }

    public xi0(int i10, int i11) {
        this.e = new int[3];
        this.f = -1;
        this.s = new HashMap();
        this.v = new HashMap();
        this.w = new HashMap();
        this.y = false;
        this.A = true;
        this.B = 1.0f;
        this.F = new ArrayList();
        this.H = 1;
        this.I = -1;
        this.a0 = 1.0f;
        this.b0 = 1.0f;
        this.e0 = new RectF();
        this.f0 = new RectF[2];
        this.g0 = new Paint[2];
        this.t0 = new ui0(this, 1);
        this.u0 = new ui0(this, 2);
        this.w0 = new ui0(this, 3);
        this.x0 = new ui0(this, 4);
        this.D0 = new ui0(this, 5);
        this.I0 = new b6(this, 2);
        this.b = i10;
        this.c = i11;
        this.C = false;
    }

    public xi0(int i10, int i11, String str, int i12) {
        this(i10, str, i11, i12, true, null);
    }

    public xi0(int i10, String str, int i11, int i12, boolean z10, int[] iArr) {
        long j10;
        long j11;
        this.e = new int[3];
        this.f = -1;
        this.s = new HashMap();
        this.v = new HashMap();
        this.w = new HashMap();
        this.y = false;
        this.A = true;
        this.B = 1.0f;
        this.F = new ArrayList();
        this.H = 1;
        this.I = -1;
        this.a0 = 1.0f;
        this.b0 = 1.0f;
        this.e0 = new RectF();
        this.f0 = new RectF[2];
        this.g0 = new Paint[2];
        this.t0 = new ui0(this, 1);
        this.u0 = new ui0(this, 2);
        this.w0 = new ui0(this, 3);
        this.x0 = new ui0(this, 4);
        this.D0 = new ui0(this, 5);
        this.I0 = new b6(this, 2);
        this.b = i11;
        this.c = i12;
        this.H = 0;
        getPaint().setFlags(2);
        wi0 wi0Var = new wi0();
        this.s0 = wi0Var;
        wi0Var.f = str;
        wi0Var.a = iArr == null ? null : (int[]) iArr.clone();
        long[] jArr = se.b.a;
        int length = jArr.length - 1;
        int i13 = 0;
        while (true) {
            if (i13 > length) {
                j10 = -1;
                j11 = -1;
                break;
            }
            int i14 = (i13 + length) >>> 1;
            j11 = jArr[i14];
            j10 = -1;
            int i15 = (int) (j11 >>> 32);
            if (i15 >= i10) {
                if (i15 <= i10) {
                    break;
                } else {
                    length = i14 - 1;
                }
            } else {
                i13 = i14 + 1;
            }
        }
        if (j11 != j10) {
            this.d = true;
            this.s0.c = i10;
            this.C = (8388608 & j11) != 0;
            int[] iArr2 = this.e;
            iArr2[0] = (int) (8388607 & j11);
            iArr2[1] = (int) ((j11 >>> 24) & 255);
        } else {
            this.C = false;
            String readRes = AndroidUtilities.readRes(i10);
            if (TextUtils.isEmpty(readRes)) {
                this.s0 = null;
                return;
            } else {
                wi0 wi0Var2 = this.s0;
                wi0Var2.e = readRes;
                this.j0 = RLottieNative.b(readRes, str, this.e, wi0Var2.a, this.w);
            }
        }
        if (this.C) {
            setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        if (z10) {
            H(true);
        }
    }
}
