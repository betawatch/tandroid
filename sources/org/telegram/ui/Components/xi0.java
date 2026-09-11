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
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.DispatchQueuePoolBackground;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ResLottieMeta;
import org.telegram.messenger.Utilities;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public class xi0 extends BitmapDrawable implements Animatable, yf.c {
    public static final AtomicInteger P0 = new AtomicInteger();
    public static final AtomicInteger Q0 = new AtomicInteger();
    public static final ExecutorService R0 = Executors.newFixedThreadPool(4, new e2.c0(1));
    public static final ExecutorService S0 = Executors.newFixedThreadPool(2, new e2.c0(2));
    public static DispatchQueue T0;
    public final Runnable A0;
    public final Runnable B0;
    public Runnable C0;
    public yf.e D0;
    public boolean E;
    public int E0;
    public float F;
    public boolean F0;
    public final boolean G;
    public boolean G0;
    public WeakReference H;
    public final Runnable H0;
    public int I;
    public int I0;
    public final ArrayList J;
    public RLottieNative J0;
    public int K;
    public int K0;
    public int L;
    public volatile boolean L0;
    public int M;
    public final yf.g M0;
    public int N;
    public boolean N0;
    public volatile boolean O;
    public boolean O0;
    public wi0 P;
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
    public final HashMap v;
    public View v0;
    public final HashMap w;
    public final com.google.firebase.messaging.p w0;
    public HashMap x;
    public final Runnable x0;
    public boolean y;
    public final Runnable y0;
    public boolean z0;

    /* JADX WARN: Removed duplicated region for block: B:85:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xi0(File file, String str, int i10, int i11, b2.n1 n1Var, boolean z10, int i12, boolean z11) {
        int i13;
        char c10;
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
        this.E = true;
        this.F = 1.0f;
        this.J = new ArrayList();
        this.L = 1;
        this.M = -1;
        this.e0 = 1.0f;
        this.f0 = 1.0f;
        this.i0 = new RectF();
        this.j0 = new RectF[2];
        this.k0 = new Paint[2];
        this.x0 = new wi0(this, 1);
        this.y0 = new wi0(this, 2);
        this.A0 = new wi0(this, 3);
        this.B0 = new wi0(this, 4);
        this.H0 = new wi0(this, 5);
        this.M0 = new c6(this, 2);
        this.b = i10;
        this.c = i11;
        this.c0 = z10;
        this.G = z11;
        boolean z12 = n1Var != null;
        this.t0 = z12;
        this.o0 = str == null && n1Var != null && n1Var.b;
        boolean z13 = n1Var != null && n1Var.c;
        this.d0 = z13;
        com.google.firebase.messaging.p pVar = new com.google.firebase.messaging.p();
        this.w0 = pVar;
        pVar.e = file.getAbsoluteFile();
        pVar.d = str;
        pVar.c = null;
        pVar.a = i12;
        getPaint().setFlags(2);
        if (str == null) {
            this.s0 = file;
        }
        if (z12 && T0 == null) {
            T0 = new DispatchQueue("cache generator queue");
        }
        if (!z12) {
            this.n0 = RLottieNative.a(file.getAbsolutePath(), str, i10, i11, iArr, z12, (int[]) pVar.c, z10, i12, hashMap);
            if (this.n0 == null) {
                FileLog.d("RLottieDrawable nativePtr == 0 " + file.getAbsolutePath() + " remove file");
                file.delete();
            }
            if (!z10 || iArr[1] >= 60) {
                return;
            }
            this.c0 = false;
            return;
        }
        if (z13) {
            return;
        }
        try {
            try {
                jsonReader = new JsonReader(new FileReader(file.getAbsoluteFile()));
            } catch (Exception e7) {
                e = e7;
                FileLog.e((Throwable) e, false);
                String absolutePath = file.getAbsolutePath();
                int i14 = this.b;
                int i15 = this.c;
                com.google.firebase.messaging.p pVar2 = this.w0;
                i13 = 60;
                c10 = 1;
                a2 = RLottieNative.a(absolutePath, str, i14, i15, iArr, false, (int[]) pVar2.c, this.c0, pVar2.a, this.w);
                if (a2 != null) {
                    a2.d();
                }
                if (this.c0) {
                    this.c0 = false;
                }
                this.D0 = new yf.e(file, this, n1Var, i10, i11, !z10, i12);
            }
        } catch (Exception e10) {
            e = e10;
            FileLog.e((Throwable) e, false);
            String absolutePath2 = file.getAbsolutePath();
            int i142 = this.b;
            int i152 = this.c;
            com.google.firebase.messaging.p pVar22 = this.w0;
            i13 = 60;
            c10 = 1;
            a2 = RLottieNative.a(absolutePath2, str, i142, i152, iArr, false, (int[]) pVar22.c, this.c0, pVar22.a, this.w);
            if (a2 != null) {
            }
            if (this.c0) {
            }
            this.D0 = new yf.e(file, this, n1Var, i10, i11, !z10, i12);
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
            c10 = 1;
            if (this.c0 && this.e[c10] < i13) {
                this.c0 = false;
            }
            this.D0 = new yf.e(file, this, n1Var, i10, i11, !z10, i12);
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public static void d(xi0 xi0Var) {
        if (xi0Var.P != null) {
            yf.e.c();
            xi0Var.P = null;
        }
        xi0Var.z0 = false;
        xi0Var.n();
        Runnable runnable = xi0Var.C0;
        if (runnable != null) {
            runnable.run();
            xi0Var.C0 = null;
        }
    }

    public static void e(xi0 xi0Var) {
        if (xi0Var.m0 || xi0Var.W || !xi0Var.i() || xi0Var.P != null) {
            return;
        }
        xi0Var.z0 = true;
        if (T0 == null) {
            T0 = new DispatchQueue("cache generator queue");
        }
        yf.e.A++;
        DispatchQueue dispatchQueue = T0;
        wi0 wi0Var = new wi0(xi0Var, 0);
        xi0Var.P = wi0Var;
        dispatchQueue.postRunnable(wi0Var);
    }

    public static void f(xi0 xi0Var) {
        Runnable runnable = xi0Var.x0;
        int z10 = xi0Var.z();
        if (z10 == 1) {
            xi0Var.I0 = 0;
            AndroidUtilities.runOnUIThread(xi0Var.y0);
        } else if (z10 == 2) {
            AndroidUtilities.runOnUIThread(runnable, xi0Var.I0);
            xi0Var.I0 = Math.min((Math.max(xi0Var.I0, 2) * 3) / 2, 2000);
        } else if (z10 == 3) {
            AndroidUtilities.runOnUIThread(runnable);
        }
        CountDownLatch countDownLatch = xi0Var.V;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static void g(xi0 xi0Var) {
        int i10 = xi0Var.K0 + 1;
        xi0Var.K0 = i10;
        if (i10 > 10) {
            xi0Var.L0 = true;
        }
        xi0Var.k();
        if (xi0Var.O0) {
            xi0Var.N0 = true;
            xi0Var.v();
        }
    }

    public static void h(xi0 xi0Var) {
        xi0Var.Y = true;
        if ((!xi0Var.l0 && xi0Var.X) || (xi0Var.R == null && xi0Var.S != null)) {
            xi0Var.v();
        }
        xi0Var.n();
    }

    public void A(boolean z10) {
        this.l0 = false;
        this.m0 = true;
        j();
        l();
        if (this.Q != null || this.P != null || this.z0) {
            this.W = true;
            return;
        }
        B(z10);
        yf.e eVar = this.D0;
        if (eVar != null) {
            RandomAccessFile randomAccessFile = eVar.s;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
                eVar.s = null;
            }
            eVar.r = true;
            this.D0 = null;
        }
        C();
    }

    public void B(boolean z10) {
        RLottieNative rLottieNative = this.n0;
        this.n0 = null;
        if (rLottieNative != null) {
            cc0 cc0Var = new cc0(rLottieNative, 15);
            if (z10) {
                DispatchQueuePoolBackground.execute(cc0Var);
            } else {
                Utilities.globalQueue.postRunnable(cc0Var);
            }
        }
    }

    public final void C() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.R);
        arrayList.add(this.T);
        arrayList.add(this.S);
        this.S = null;
        this.R = null;
        this.T = null;
        AndroidUtilities.recycleBitmaps(arrayList);
        if (this.u0 != null) {
            this.u0 = null;
        }
    }

    public final void D(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.J;
        arrayList.remove(imageReceiver);
        if (this.D0 == null || T0 == null || this.P == null || !arrayList.isEmpty() || getCallback() != null) {
            return;
        }
        View view = this.v0;
        if (view == null || !view.isAttachedToWindow()) {
            wi0 wi0Var = this.P;
            if (wi0Var != null) {
                T0.cancelRunnable(wi0Var);
                yf.e.c();
                this.P = null;
            }
            this.z0 = false;
            this.F0 = false;
        }
    }

    public final void E() {
        if (!this.a0 && !this.l0 && this.X) {
            if (this.b0 <= 2) {
                this.b0 = 0;
            }
            this.O = false;
            this.Y = false;
            if (!G()) {
                this.Z = true;
            }
        }
        v();
    }

    public final boolean F(boolean z10) {
        if (!z10 && ((this.L < 2 || this.N == 0) && this.M < 0)) {
            return false;
        }
        this.N = 0;
        this.L = 2;
        start();
        return true;
    }

    public final boolean G() {
        if (this.Q != null || this.S != null || !i() || u() || this.W || this.m0) {
            return false;
        }
        if (!this.l0 && (!this.X || this.Y)) {
            return false;
        }
        if (this.z0 && !this.G0) {
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
        Runnable runnable = this.H0;
        this.Q = runnable;
        (this.c0 ? S0 : R0).execute(runnable);
        return true;
    }

    public final void H(boolean z10) {
        this.X = true;
        G();
    }

    public final void I(int i10) {
        if (this.L == 2 && i10 == 3 && this.b0 != 0) {
            return;
        }
        this.L = i10;
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
        if (this.b0 != i10 || z11) {
            this.b0 = i10;
            this.O = false;
            this.Y = false;
            if (this.p0) {
                this.q0 = true;
                if (this.Q != null) {
                    this.r0 = true;
                }
            }
            if ((!z10 || z11) && this.U && this.S != null) {
                this.T = this.S;
                this.S = null;
                this.Q = null;
                this.U = false;
            }
            if (!z10 && this.Q == null) {
                this.V = new CountDownLatch(1);
            }
            if (z11 && !this.l0) {
                this.l0 = true;
                j();
            }
            if (!G()) {
                this.Z = true;
            } else if (!z10) {
                try {
                    this.V.await();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                this.V = null;
            }
            invalidateSelf();
        }
    }

    public final void M(boolean z10) {
        WeakReference weakReference;
        Runnable runnable;
        WeakReference weakReference2;
        this.T = this.R;
        this.R = this.S;
        this.S = null;
        this.N0 = false;
        if (this.K == 2 && (weakReference2 = this.H) != null && this.b0 - 1 >= this.I) {
            Runnable runnable2 = (Runnable) weakReference2.get();
            if (runnable2 != null) {
                runnable2.run();
            }
            this.H = null;
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
        if (z10 && this.Z) {
            this.Y = false;
            this.Z = false;
        }
        if (this.K == 0 && (weakReference = this.H) != null && this.b0 >= this.I && (runnable = (Runnable) weakReference.get()) != null) {
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
            this.H = new WeakReference(runnable);
            this.I = i10;
        } else if (this.H != null) {
            this.H = null;
        }
    }

    public final void Q(float f7, boolean z10) {
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        L((int) (this.e[0] * f7), z10, false);
    }

    public final void R(long j3) {
        int i10;
        int[] iArr = this.e;
        if (iArr[0] == 0 || (i10 = iArr[1]) == 0) {
            return;
        }
        L(Math.round(Math.max(0L, j3) / (1000.0f / i10)) % iArr[0], true, true);
    }

    public final void S(long j3) {
        Integer num;
        this.K0 = 0;
        if (this.L0) {
            this.L0 = false;
            j();
        }
        boolean z10 = this.N0 || (!this.l0 && this.X);
        if (!this.l0) {
            if ((this.Z || (this.X && z10)) && this.S != null) {
                M(true);
                return;
            }
            return;
        }
        if (this.R == null && this.S == null) {
            G();
            return;
        }
        if (this.S != null) {
            if (this.R == null || (z10 && !this.a)) {
                HashMap hashMap = this.x;
                if (hashMap != null && this.E && (num = (Integer) hashMap.get(Integer.valueOf(this.b0 - 1))) != null) {
                    try {
                        Activity activity = LaunchActivity.G1;
                        if (activity == null) {
                            activity = BubbleActivity.a0;
                        }
                        activity.getWindow().getDecorView().performHapticFeedback(num.intValue() == 1 ? 0 : 3, 2);
                    } catch (Exception unused) {
                    }
                }
                M(false);
            }
        }
    }

    @Override // yf.c
    public final int a(Bitmap bitmap) {
        RLottieNative rLottieNative = this.J0;
        if (rLottieNative == null) {
            return -1;
        }
        int i10 = this.E0;
        if (i10 >= rLottieNative.a[0]) {
            return 0;
        }
        int i11 = this.c0 ? 2 : 1;
        if (rLottieNative.c(i10, bitmap, true) != -5) {
            this.E0 += i11;
            return 1;
        }
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e7) {
            e7.printStackTrace();
        }
        return a(bitmap);
    }

    @Override // yf.c
    public final void b() {
        File file;
        com.google.firebase.messaging.p pVar = this.w0;
        File file2 = (File) pVar.e;
        RLottieNative a2 = RLottieNative.a(file2 != null ? file2.toString() : null, (String) pVar.d, this.b, this.c, this.d0 ? this.e : null, false, (int[]) pVar.c, false, pVar.a, this.w);
        this.J0 = a2;
        this.E0 = 0;
        if (a2 != null || (file = this.s0) == null) {
            return;
        }
        file.delete();
    }

    @Override // yf.c
    public final void c() {
        RLottieNative rLottieNative = this.J0;
        if (rLottieNative != null) {
            rLottieNative.d();
            this.J0 = null;
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
        return this.t0 ? this.D0 != null || this.o0 : this.n0 != null || this.d;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.l0;
    }

    public final void j() {
        AndroidUtilities.executeOnUIThread(new wi0(this, 6));
    }

    public final void k() {
        if (!this.l0 || this.L0) {
            if (this.O0) {
                this.O0 = false;
                this.K0 = 0;
                yf.h.d().g(this.M0);
                return;
            }
            return;
        }
        if (this.O0) {
            return;
        }
        int round = Math.round((this.e[1] / (this.c0 ? 2.0f : 1.0f)) * this.F);
        if (round > 0) {
            if (this.e[0] == 1 && this.K == 0) {
                return;
            }
            this.O0 = true;
            this.K0 = 0;
            yf.h.d().b(this.M0, round);
            v();
        }
    }

    public final void l() {
        wi0 wi0Var = this.P;
        if (wi0Var != null) {
            T0.cancelRunnable(wi0Var);
            yf.e.c();
            this.P = null;
        }
        if (t() || this.S == null || this.Q == null) {
            return;
        }
        this.Q = null;
        this.S = null;
    }

    public final void m() {
        if (this.a0) {
            this.a0 = false;
            if (!this.l0 && this.X) {
                if (this.b0 <= 2) {
                    this.b0 = 0;
                }
                this.O = false;
                this.Y = false;
                if (!G()) {
                    this.Z = true;
                }
            }
            v();
        }
    }

    public void n() {
        if (this.W) {
            l();
            if (this.Q == null && this.P == null && this.n0 != null) {
                B(true);
            }
        }
        if ((this.n0 == null || this.o0) && this.D0 == null) {
            C();
            return;
        }
        this.U = true;
        if (!t()) {
            stop();
        }
        if (this.l0) {
            G();
        }
    }

    public final void o(Canvas canvas, Paint paint, boolean z10, long j3, int i10) {
        float width;
        boolean z11;
        float f7;
        if (!i() || this.W) {
            return;
        }
        if (!z10) {
            S(j3);
        }
        RectF rectF = z10 ? this.j0[i10] : this.i0;
        if (paint == null) {
            paint = z10 ? this.k0[i10] : getPaint();
        }
        if (paint.getAlpha() == 0 || this.q0 || this.R == null) {
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
            f7 = height;
        } else {
            rectF.set(getBounds());
            if (this.g0) {
                this.e0 = rectF.width() / this.b;
                this.f0 = rectF.height() / this.c;
                this.g0 = false;
                if (Math.abs(rectF.width() - this.b) < AndroidUtilities.dp(1.0f) && Math.abs(rectF.height() - this.c) < AndroidUtilities.dp(1.0f)) {
                    z12 = false;
                }
                this.h0 = z12;
            }
            width = this.e0;
            f7 = this.f0;
            z11 = this.h0;
        }
        if (!z11) {
            canvas.drawBitmap(this.R, rectF.left, rectF.top, paint);
            return;
        }
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        canvas.scale(width, f7);
        canvas.drawBitmap(this.R, 0.0f, 0.0f, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.g0 = true;
    }

    public final long p() {
        int[] iArr = this.e;
        return (long) ((iArr[0] / iArr[1]) * 1000.0f);
    }

    public final int q() {
        return this.e[0];
    }

    public final float r() {
        return this.b0 / this.e[0];
    }

    public final boolean s() {
        if (this.m0) {
            return false;
        }
        return ((this.R == null && this.S == null) || this.q0) ? false : true;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.l0) {
            return;
        }
        if ((this.L < 2 || this.N == 0) && this.f != this.b0) {
            this.l0 = true;
            this.L0 = false;
            if (this.p0) {
                this.q0 = true;
                if (this.Q != null) {
                    this.r0 = true;
                }
            }
            G();
            v();
            j();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.l0 = false;
        j();
    }

    public final boolean t() {
        return (this.J.isEmpty() && this.v0 == null && getCallback() == null) ? false : true;
    }

    public boolean u() {
        return this.R != null && this.e[0] == 1;
    }

    public final void v() {
        if (this.m0) {
            return;
        }
        int size = this.J.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((ImageReceiver) this.J.get(i10)).invalidate();
        }
        View view = this.v0;
        if (view != null) {
            view.invalidate();
        }
        if (getCallback() != null) {
            invalidateSelf();
        }
    }

    public final boolean w() {
        return this.P != null;
    }

    public boolean x() {
        return true;
    }

    public final boolean y() {
        return this.b0 == this.e[0] - 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0150 A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:46:0x00fd, B:49:0x0106, B:51:0x010a, B:64:0x0142, B:66:0x0146, B:68:0x014c, B:70:0x0150, B:71:0x0157, B:73:0x015c, B:75:0x0160, B:76:0x018c, B:78:0x0190, B:80:0x019e, B:82:0x01a6, B:84:0x01aa, B:86:0x01ae, B:88:0x01b1, B:89:0x01b7, B:91:0x01bd, B:92:0x01c4, B:94:0x01c7, B:95:0x01cc, B:97:0x01d2, B:98:0x01d8, B:102:0x01e4, B:104:0x01e8, B:105:0x01f0, B:106:0x01f5, B:108:0x01f9, B:110:0x0201, B:111:0x0205, B:113:0x0209, B:115:0x020f, B:117:0x021c, B:118:0x0221, B:120:0x0227, B:121:0x01de, B:123:0x0133, B:127:0x013a), top: B:45:0x00fd }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015c A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:46:0x00fd, B:49:0x0106, B:51:0x010a, B:64:0x0142, B:66:0x0146, B:68:0x014c, B:70:0x0150, B:71:0x0157, B:73:0x015c, B:75:0x0160, B:76:0x018c, B:78:0x0190, B:80:0x019e, B:82:0x01a6, B:84:0x01aa, B:86:0x01ae, B:88:0x01b1, B:89:0x01b7, B:91:0x01bd, B:92:0x01c4, B:94:0x01c7, B:95:0x01cc, B:97:0x01d2, B:98:0x01d8, B:102:0x01e4, B:104:0x01e8, B:105:0x01f0, B:106:0x01f5, B:108:0x01f9, B:110:0x0201, B:111:0x0205, B:113:0x0209, B:115:0x020f, B:117:0x021c, B:118:0x0221, B:120:0x0227, B:121:0x01de, B:123:0x0133, B:127:0x013a), top: B:45:0x00fd }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019e A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:46:0x00fd, B:49:0x0106, B:51:0x010a, B:64:0x0142, B:66:0x0146, B:68:0x014c, B:70:0x0150, B:71:0x0157, B:73:0x015c, B:75:0x0160, B:76:0x018c, B:78:0x0190, B:80:0x019e, B:82:0x01a6, B:84:0x01aa, B:86:0x01ae, B:88:0x01b1, B:89:0x01b7, B:91:0x01bd, B:92:0x01c4, B:94:0x01c7, B:95:0x01cc, B:97:0x01d2, B:98:0x01d8, B:102:0x01e4, B:104:0x01e8, B:105:0x01f0, B:106:0x01f5, B:108:0x01f9, B:110:0x0201, B:111:0x0205, B:113:0x0209, B:115:0x020f, B:117:0x021c, B:118:0x0221, B:120:0x0227, B:121:0x01de, B:123:0x0133, B:127:0x013a), top: B:45:0x00fd }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int z() {
        boolean z10;
        int c10;
        yf.e eVar;
        yf.e eVar2;
        RLottieNative b10;
        if (this.m0) {
            return 3;
        }
        if (i()) {
            if (this.n0 == null && this.d) {
                String readRes = AndroidUtilities.readRes(this.w0.b);
                if (!TextUtils.isEmpty(readRes)) {
                    this.n0 = RLottieNative.b(readRes, this.e, (int[]) this.w0.c, this.w);
                    this.d = false;
                }
            }
            if (this.T == null) {
                try {
                    this.T = Bitmap.createBitmap(this.b, this.c, this.G ? Bitmap.Config.ALPHA_8 : Bitmap.Config.ARGB_8888);
                    z10 = false;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                if (this.T != null) {
                    RLottieNative rLottieNative = this.n0;
                    if (rLottieNative != null) {
                        try {
                            if (!this.v.isEmpty() || this.r != null) {
                                this.w.putAll(this.v);
                                int[] iArr = this.r;
                                if (iArr != null) {
                                    this.w0.c = (int[]) iArr.clone();
                                }
                                com.google.firebase.messaging.p pVar = this.w0;
                                File file = (File) pVar.e;
                                if (file != null) {
                                    String absolutePath = file.getAbsolutePath();
                                    com.google.firebase.messaging.p pVar2 = this.w0;
                                    b10 = RLottieNative.a(absolutePath, (String) pVar2.d, this.b, this.c, this.e, false, (int[]) pVar2.c, this.c0, pVar2.a, this.w);
                                } else {
                                    int i10 = pVar.b;
                                    if (i10 == 0 || ((String) pVar.d) != null) {
                                        b10 = RLottieNative.b((String) pVar.d, this.e, (int[]) pVar.c, this.w);
                                    } else {
                                        String readRes2 = AndroidUtilities.readRes(i10);
                                        if (!TextUtils.isEmpty(readRes2)) {
                                            com.google.firebase.messaging.p pVar3 = this.w0;
                                            pVar3.d = readRes2;
                                            b10 = RLottieNative.b(readRes2, this.e, (int[]) pVar3.c, this.w);
                                        }
                                    }
                                }
                                if (b10 != null) {
                                    this.n0 = b10;
                                    rLottieNative.d();
                                    this.v.clear();
                                    this.r = null;
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    try {
                        RLottieNative rLottieNative2 = this.n0;
                        int i11 = this.c0 ? 2 : 1;
                        if (!this.t0 || (eVar2 = this.D0) == null) {
                            c10 = rLottieNative2.c(this.b0, this.T, z10);
                        } else {
                            try {
                                c10 = eVar2.f(this.T, this.b0 / i11);
                                try {
                                    if (!this.D0.g() && this.G0 && this.n0 != null) {
                                        this.n0.d();
                                        this.n0 = null;
                                    }
                                } catch (Exception e7) {
                                    e = e7;
                                    FileLog.e(e);
                                    eVar = this.D0;
                                    if (eVar != null) {
                                        if (!this.F0) {
                                        }
                                        c10 = -1;
                                        if (this.G0) {
                                        }
                                    }
                                    if (c10 >= 0) {
                                    }
                                    return 2;
                                }
                            } catch (Exception e10) {
                                e = e10;
                                c10 = 0;
                            }
                        }
                        eVar = this.D0;
                        if (eVar != null && eVar.g()) {
                            if (!this.F0) {
                                this.F0 = true;
                                AndroidUtilities.runOnUIThread(this.A0);
                            }
                            c10 = -1;
                            if (this.G0) {
                                if (this.n0 == null) {
                                    String file2 = ((File) this.w0.e).toString();
                                    com.google.firebase.messaging.p pVar4 = this.w0;
                                    this.n0 = RLottieNative.a(file2, (String) pVar4.d, this.b, this.c, null, false, (int[]) pVar4.c, false, pVar4.a, this.w);
                                }
                                if (this.n0 != null) {
                                    c10 = this.n0.c(this.b0, this.T, z10);
                                }
                            }
                        }
                        if (c10 >= 0) {
                            this.S = this.T;
                            int i12 = this.f;
                            if (i12 < 0 || !this.h) {
                                int i13 = this.b0 + i11;
                                if (i12 < 0) {
                                    i12 = this.e[0];
                                }
                                if (i13 >= i12) {
                                    int i14 = this.L;
                                    if (i14 == 1) {
                                        this.b0 = 0;
                                        this.O = false;
                                        if (this.y) {
                                            this.x = null;
                                            this.y = false;
                                        }
                                        int i15 = this.M;
                                        if (i15 > 0) {
                                            this.M = i15 - 1;
                                        }
                                    } else if (i14 == 2) {
                                        this.b0 = 0;
                                        this.O = true;
                                        this.N++;
                                        if (this.y) {
                                            this.x = null;
                                            this.y = false;
                                        }
                                    } else {
                                        this.O = true;
                                        Runnable runnable = this.u0;
                                        if (runnable != null) {
                                            runnable.run();
                                            this.u0 = null;
                                        }
                                    }
                                } else if (this.L == 3) {
                                    this.O = true;
                                    this.N++;
                                } else {
                                    this.b0 = i13;
                                    this.O = false;
                                }
                            } else {
                                int i16 = this.b0;
                                if (i16 > i12) {
                                    int i17 = i16 - i11;
                                    if (i17 >= i12) {
                                        this.b0 = i17;
                                        this.O = false;
                                    } else {
                                        this.O = true;
                                        Runnable runnable2 = this.u0;
                                        if (runnable2 != null) {
                                            runnable2.run();
                                            this.u0 = null;
                                        }
                                    }
                                } else {
                                    int i18 = i16 + i11;
                                    if (i18 < i12) {
                                        this.b0 = i18;
                                        this.O = false;
                                    } else {
                                        this.O = true;
                                        Runnable runnable3 = this.u0;
                                        if (runnable3 != null) {
                                            runnable3.run();
                                            this.u0 = null;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                }
                return 1;
            }
            z10 = true;
            if (this.T != null) {
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
        this.E = true;
        this.F = 1.0f;
        this.J = new ArrayList();
        this.L = 1;
        this.M = -1;
        this.e0 = 1.0f;
        this.f0 = 1.0f;
        this.i0 = new RectF();
        this.j0 = new RectF[2];
        this.k0 = new Paint[2];
        this.x0 = new wi0(this, 1);
        this.y0 = new wi0(this, 2);
        this.A0 = new wi0(this, 3);
        this.B0 = new wi0(this, 4);
        this.H0 = new wi0(this, 5);
        this.M0 = new c6(this, 2);
        this.b = i10;
        this.c = i11;
        this.G = false;
    }

    public xi0(int i10, int i11, int i12) {
        this(i10, i11, i12, true, null);
    }

    public xi0(int i10, int i11, int i12, boolean z10, int[] iArr) {
        int[] iArr2 = new int[3];
        this.e = iArr2;
        this.f = -1;
        this.s = new HashMap();
        this.v = new HashMap();
        HashMap hashMap = new HashMap();
        this.w = hashMap;
        this.y = false;
        this.E = true;
        this.F = 1.0f;
        this.J = new ArrayList();
        this.L = 1;
        this.M = -1;
        this.e0 = 1.0f;
        this.f0 = 1.0f;
        this.i0 = new RectF();
        this.j0 = new RectF[2];
        this.k0 = new Paint[2];
        this.x0 = new wi0(this, 1);
        this.y0 = new wi0(this, 2);
        this.A0 = new wi0(this, 3);
        this.B0 = new wi0(this, 4);
        this.H0 = new wi0(this, 5);
        this.M0 = new c6(this, 2);
        this.b = i11;
        this.c = i12;
        this.L = 0;
        getPaint().setFlags(2);
        com.google.firebase.messaging.p pVar = new com.google.firebase.messaging.p();
        this.w0 = pVar;
        pVar.c = iArr == null ? null : (int[]) iArr.clone();
        long find = ResLottieMeta.find(i10);
        if (find != -1) {
            this.d = true;
            pVar.b = i10;
            this.G = ResLottieMeta.isMonoColorOf(find);
            iArr2[0] = ResLottieMeta.frameCountOf(find);
            iArr2[1] = ResLottieMeta.fpsOf(find);
        } else {
            this.G = false;
            String readRes = AndroidUtilities.readRes(i10);
            if (TextUtils.isEmpty(readRes)) {
                this.w0 = null;
                return;
            } else {
                pVar.d = readRes;
                this.n0 = RLottieNative.b(readRes, iArr2, (int[]) pVar.c, hashMap);
            }
        }
        if (this.G) {
            setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        if (z10) {
            H(true);
        }
    }
}
