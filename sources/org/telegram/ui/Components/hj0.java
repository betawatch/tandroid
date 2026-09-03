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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class hj0 extends BitmapDrawable implements Animatable, lf.e {
    public static final AtomicInteger M0 = new AtomicInteger();
    public static final AtomicInteger N0 = new AtomicInteger();
    public static final ExecutorService O0;
    public static final ExecutorService P0;
    public static DispatchQueue Q0;
    public lf.g A0;
    public boolean B;
    public int B0;
    public float C;
    public boolean C0;
    public final boolean D;
    public boolean D0;
    public WeakReference E;
    public final Runnable E0;
    public int F;
    public int F0;
    public final ArrayList G;
    public RLottieNative G0;
    public int H;
    public int H0;
    public int I;
    public volatile boolean I0;
    public int J;
    public final lf.i J0;
    public int K;
    public boolean K0;
    public volatile boolean L;
    public boolean L0;
    public fj0 M;
    public Runnable N;
    public volatile Bitmap O;
    public volatile Bitmap P;
    public volatile Bitmap Q;
    public boolean R;
    public CountDownLatch S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public final boolean Z;
    public boolean a;
    public final boolean a0;
    public final int b;
    public float b0;
    public final int c;
    public float c0;
    public boolean d;
    public boolean d0;
    public final int[] e;
    public boolean e0;
    public int f;
    public final RectF f0;
    public final RectF[] g0;
    public boolean h;
    public final Paint[] h0;
    public volatile boolean i0;
    public volatile boolean j0;
    public volatile RLottieNative k0;
    public final boolean l0;
    public boolean m0;
    public int[] n;
    public boolean n0;
    public boolean o0;
    public final File p0;
    public final boolean q0;
    public int[] r;
    public Runnable r0;
    public final HashMap s;
    public View s0;
    public final com.google.firebase.messaging.n t0;
    public final Runnable u0;
    public final HashMap v;
    public final Runnable v0;
    public final HashMap w;
    public boolean w0;
    public HashMap x;
    public final Runnable x0;
    public boolean y;
    public final Runnable y0;
    public Runnable z0;

    static {
        final int i10 = 0;
        O0 = Executors.newFixedThreadPool(4, new ThreadFactory() { // from class: org.telegram.ui.Components.gj0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                switch (i10) {
                    case 0:
                        return new Thread(runnable, "Lottie-" + hj0.M0.getAndIncrement());
                    default:
                        return new Thread(runnable, "LottieLow-" + hj0.N0.getAndIncrement());
                }
            }
        });
        final int i11 = 1;
        P0 = Executors.newFixedThreadPool(2, new ThreadFactory() { // from class: org.telegram.ui.Components.gj0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                switch (i11) {
                    case 0:
                        return new Thread(runnable, "Lottie-" + hj0.M0.getAndIncrement());
                    default:
                        return new Thread(runnable, "LottieLow-" + hj0.N0.getAndIncrement());
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hj0(File file, String str, int i10, int i11, ke.i iVar, boolean z4, int i12, boolean z10) {
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
        this.B = true;
        this.C = 1.0f;
        this.G = new ArrayList();
        this.I = 1;
        this.J = -1;
        this.b0 = 1.0f;
        this.c0 = 1.0f;
        this.f0 = new RectF();
        this.g0 = new RectF[2];
        this.h0 = new Paint[2];
        this.u0 = new fj0(this, 1);
        this.v0 = new fj0(this, 2);
        this.x0 = new fj0(this, 3);
        this.y0 = new fj0(this, 4);
        this.E0 = new fj0(this, 5);
        this.J0 = new x5(this, 2);
        this.b = i10;
        this.c = i11;
        this.Z = z4;
        this.D = z10;
        boolean z11 = iVar != null;
        this.q0 = z11;
        this.l0 = str == null && iVar != null && iVar.b;
        boolean z12 = iVar != null && iVar.c;
        this.a0 = z12;
        com.google.firebase.messaging.n nVar = new com.google.firebase.messaging.n();
        this.t0 = nVar;
        nVar.e = file.getAbsoluteFile();
        nVar.d = str;
        nVar.c = null;
        nVar.a = i12;
        getPaint().setFlags(2);
        if (str == null) {
            this.p0 = file;
        }
        if (z11 && Q0 == null) {
            Q0 = new DispatchQueue("cache generator queue");
        }
        if (!z11) {
            this.k0 = RLottieNative.a(file.getAbsolutePath(), str, i10, i11, iArr, z11, (int[]) nVar.c, z4, i12, hashMap);
            if (this.k0 == null) {
                FileLog.d("RLottieDrawable nativePtr == 0 " + file.getAbsolutePath() + " remove file");
                file.delete();
            }
            if (!z4 || iArr[1] >= 60) {
                return;
            }
            this.Z = false;
            return;
        }
        if (z12) {
            return;
        }
        try {
            try {
                jsonReader = new JsonReader(new FileReader(file.getAbsoluteFile()));
            } catch (Exception e6) {
                e = e6;
                FileLog.e((Throwable) e, false);
                String absolutePath = file.getAbsolutePath();
                int i14 = this.b;
                int i15 = this.c;
                com.google.firebase.messaging.n nVar2 = this.t0;
                i13 = 60;
                c3 = 1;
                a2 = RLottieNative.a(absolutePath, str, i14, i15, iArr, false, (int[]) nVar2.c, this.Z, nVar2.a, this.w);
                if (a2 != null) {
                    a2.d();
                }
                if (this.Z) {
                    this.Z = false;
                }
                this.A0 = new lf.g(file, this, iVar, i10, i11, !z4, i12);
            }
        } catch (Exception e10) {
            e = e10;
            FileLog.e((Throwable) e, false);
            String absolutePath2 = file.getAbsolutePath();
            int i142 = this.b;
            int i152 = this.c;
            com.google.firebase.messaging.n nVar22 = this.t0;
            i13 = 60;
            c3 = 1;
            a2 = RLottieNative.a(absolutePath2, str, i142, i152, iArr, false, (int[]) nVar22.c, this.Z, nVar22.a, this.w);
            if (a2 != null) {
            }
            if (this.Z) {
            }
            this.A0 = new lf.g(file, this, iVar, i10, i11, !z4, i12);
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
            if (this.Z && this.e[c3] < i13) {
                this.Z = false;
            }
            this.A0 = new lf.g(file, this, iVar, i10, i11, !z4, i12);
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public static void d(hj0 hj0Var) {
        if (hj0Var.M != null) {
            lf.g.c();
            hj0Var.M = null;
        }
        hj0Var.w0 = false;
        hj0Var.n();
        Runnable runnable = hj0Var.z0;
        if (runnable != null) {
            runnable.run();
            hj0Var.z0 = null;
        }
    }

    public static void e(hj0 hj0Var) {
        if (hj0Var.j0 || hj0Var.T || !hj0Var.i() || hj0Var.M != null) {
            return;
        }
        hj0Var.w0 = true;
        if (Q0 == null) {
            Q0 = new DispatchQueue("cache generator queue");
        }
        lf.g.A++;
        DispatchQueue dispatchQueue = Q0;
        fj0 fj0Var = new fj0(hj0Var, 0);
        hj0Var.M = fj0Var;
        dispatchQueue.postRunnable(fj0Var);
    }

    public static void f(hj0 hj0Var) {
        Runnable runnable = hj0Var.u0;
        int z4 = hj0Var.z();
        if (z4 == 1) {
            hj0Var.F0 = 0;
            AndroidUtilities.runOnUIThread(hj0Var.v0);
        } else if (z4 == 2) {
            AndroidUtilities.runOnUIThread(runnable, hj0Var.F0);
            hj0Var.F0 = Math.min((Math.max(hj0Var.F0, 2) * 3) / 2, 2000);
        } else if (z4 == 3) {
            AndroidUtilities.runOnUIThread(runnable);
        }
        CountDownLatch countDownLatch = hj0Var.S;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static void g(hj0 hj0Var) {
        int i10 = hj0Var.H0 + 1;
        hj0Var.H0 = i10;
        if (i10 > 10) {
            hj0Var.I0 = true;
        }
        hj0Var.k();
        if (hj0Var.L0) {
            hj0Var.K0 = true;
            hj0Var.v();
        }
    }

    public static void h(hj0 hj0Var) {
        hj0Var.V = true;
        if ((!hj0Var.i0 && hj0Var.U) || (hj0Var.O == null && hj0Var.P != null)) {
            hj0Var.v();
        }
        hj0Var.n();
    }

    public void A(boolean z4) {
        this.i0 = false;
        this.j0 = true;
        j();
        l();
        if (this.N != null || this.M != null || this.w0) {
            this.T = true;
            return;
        }
        B(z4);
        lf.g gVar = this.A0;
        if (gVar != null) {
            RandomAccessFile randomAccessFile = gVar.s;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
                gVar.s = null;
            }
            gVar.r = true;
            this.A0 = null;
        }
        C();
    }

    public void B(boolean z4) {
        RLottieNative rLottieNative = this.k0;
        this.k0 = null;
        if (rLottieNative != null) {
            ec0 ec0Var = new ec0(rLottieNative, 15);
            if (z4) {
                DispatchQueuePoolBackground.execute(ec0Var);
            } else {
                Utilities.globalQueue.postRunnable(ec0Var);
            }
        }
    }

    public final void C() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.O);
        arrayList.add(this.Q);
        arrayList.add(this.P);
        this.P = null;
        this.O = null;
        this.Q = null;
        AndroidUtilities.recycleBitmaps(arrayList);
        if (this.r0 != null) {
            this.r0 = null;
        }
    }

    public final void D(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.G;
        arrayList.remove(imageReceiver);
        if (this.A0 == null || Q0 == null || this.M == null || !arrayList.isEmpty() || getCallback() != null) {
            return;
        }
        View view = this.s0;
        if (view == null || !view.isAttachedToWindow()) {
            fj0 fj0Var = this.M;
            if (fj0Var != null) {
                Q0.cancelRunnable(fj0Var);
                lf.g.c();
                this.M = null;
            }
            this.w0 = false;
            this.C0 = false;
        }
    }

    public final void E() {
        if (!this.X && !this.i0 && this.U) {
            if (this.Y <= 2) {
                this.Y = 0;
            }
            this.L = false;
            this.V = false;
            if (!G()) {
                this.W = true;
            }
        }
        v();
    }

    public final boolean F(boolean z4) {
        if (!z4 && ((this.I < 2 || this.K == 0) && this.J < 0)) {
            return false;
        }
        this.K = 0;
        this.I = 2;
        start();
        return true;
    }

    public final boolean G() {
        if (this.N != null || this.P != null || !i() || u() || this.T || this.j0) {
            return false;
        }
        if (!this.i0 && (!this.U || this.V)) {
            return false;
        }
        if (this.w0 && !this.D0) {
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
        Runnable runnable = this.E0;
        this.N = runnable;
        (this.Z ? P0 : O0).execute(runnable);
        return true;
    }

    public final void H(boolean z4) {
        this.U = true;
        G();
    }

    public final void I(int i10) {
        if (this.I == 2 && i10 == 3 && this.Y != 0) {
            return;
        }
        this.I = i10;
    }

    public final void J() {
        L(85, false, false);
    }

    public final void K(int i10) {
        L(i10, true, false);
    }

    public final void L(int i10, boolean z4, boolean z10) {
        if (i10 < 0 || i10 > this.e[0]) {
            return;
        }
        if (this.Y != i10 || z10) {
            this.Y = i10;
            this.L = false;
            this.V = false;
            if (this.m0) {
                this.n0 = true;
                if (this.N != null) {
                    this.o0 = true;
                }
            }
            if ((!z4 || z10) && this.R && this.P != null) {
                this.Q = this.P;
                this.P = null;
                this.N = null;
                this.R = false;
            }
            if (!z4 && this.N == null) {
                this.S = new CountDownLatch(1);
            }
            if (z10 && !this.i0) {
                this.i0 = true;
                j();
            }
            if (!G()) {
                this.W = true;
            } else if (!z4) {
                try {
                    this.S.await();
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                this.S = null;
            }
            invalidateSelf();
        }
    }

    public final void M(boolean z4) {
        WeakReference weakReference;
        Runnable runnable;
        WeakReference weakReference2;
        this.Q = this.O;
        this.O = this.P;
        this.P = null;
        this.K0 = false;
        if (this.H == 2 && (weakReference2 = this.E) != null && this.Y - 1 >= this.F) {
            Runnable runnable2 = (Runnable) weakReference2.get();
            if (runnable2 != null) {
                runnable2.run();
            }
            this.E = null;
        }
        if (this.L || (this.J == 0 && this.I == 1)) {
            stop();
        }
        this.N = null;
        if (this.o0) {
            this.o0 = false;
        } else if (this.n0) {
            this.n0 = false;
        }
        this.V = true;
        this.R = false;
        if (z4 && this.W) {
            this.V = false;
            this.W = false;
        }
        if (this.H == 0 && (weakReference = this.E) != null && this.Y >= this.F && (runnable = (Runnable) weakReference.get()) != null) {
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
            this.E = new WeakReference(runnable);
            this.F = i10;
        } else if (this.E != null) {
            this.E = null;
        }
    }

    public final void Q(float f10, boolean z4) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        L((int) (this.e[0] * f10), z4, false);
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
        this.H0 = 0;
        if (this.I0) {
            this.I0 = false;
            j();
        }
        if (j10 == 0) {
            System.currentTimeMillis();
        }
        boolean z4 = this.K0 || (!this.i0 && this.U);
        if (!this.i0) {
            if ((this.W || (this.U && z4)) && this.P != null) {
                M(true);
                return;
            }
            return;
        }
        if (this.O == null && this.P == null) {
            G();
            return;
        }
        if (this.P != null) {
            if (this.O == null || (z4 && !this.a)) {
                HashMap hashMap = this.x;
                if (hashMap != null && this.B && (num = (Integer) hashMap.get(Integer.valueOf(this.Y - 1))) != null) {
                    try {
                        Activity activity = LaunchActivity.D1;
                        if (activity == null) {
                            activity = BubbleActivity.X;
                        }
                        activity.getWindow().getDecorView().performHapticFeedback(num.intValue() == 1 ? 0 : 3, 2);
                    } catch (Exception unused) {
                    }
                }
                M(false);
            }
        }
    }

    @Override // lf.e
    public final int a(Bitmap bitmap) {
        RLottieNative rLottieNative = this.G0;
        if (rLottieNative == null) {
            return -1;
        }
        int i10 = this.B0;
        if (i10 >= rLottieNative.a[0]) {
            return 0;
        }
        int i11 = this.Z ? 2 : 1;
        if (rLottieNative.c(i10, bitmap, true) != -5) {
            this.B0 += i11;
            return 1;
        }
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e6) {
            e6.printStackTrace();
        }
        return a(bitmap);
    }

    @Override // lf.e
    public final void b() {
        File file;
        com.google.firebase.messaging.n nVar = this.t0;
        File file2 = (File) nVar.e;
        RLottieNative a2 = RLottieNative.a(file2 != null ? file2.toString() : null, (String) nVar.d, this.b, this.c, this.a0 ? this.e : null, false, (int[]) nVar.c, false, nVar.a, this.w);
        this.G0 = a2;
        this.B0 = 0;
        if (a2 != null || (file = this.p0) == null) {
            return;
        }
        file.delete();
    }

    @Override // lf.e
    public final void c() {
        RLottieNative rLottieNative = this.G0;
        if (rLottieNative != null) {
            rLottieNative.d();
            this.G0 = null;
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
        return this.q0 ? this.A0 != null || this.l0 : this.k0 != null || this.d;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.i0;
    }

    public final void j() {
        AndroidUtilities.executeOnUIThread(new fj0(this, 6));
    }

    public final void k() {
        if (!this.i0 || this.I0) {
            if (this.L0) {
                this.L0 = false;
                this.H0 = 0;
                lf.j.d().g(this.J0);
                return;
            }
            return;
        }
        if (this.L0) {
            return;
        }
        int round = Math.round((this.e[1] / (this.Z ? 2.0f : 1.0f)) * this.C);
        if (round > 0) {
            if (this.e[0] == 1 && this.H == 0) {
                return;
            }
            this.L0 = true;
            this.H0 = 0;
            lf.j.d().b(this.J0, round);
            v();
        }
    }

    public final void l() {
        fj0 fj0Var = this.M;
        if (fj0Var != null) {
            Q0.cancelRunnable(fj0Var);
            lf.g.c();
            this.M = null;
        }
        if (t() || this.P == null || this.N == null) {
            return;
        }
        this.N = null;
        this.P = null;
    }

    public final void m() {
        if (this.X) {
            this.X = false;
            if (!this.i0 && this.U) {
                if (this.Y <= 2) {
                    this.Y = 0;
                }
                this.L = false;
                this.V = false;
                if (!G()) {
                    this.W = true;
                }
            }
            v();
        }
    }

    public void n() {
        if (this.T) {
            l();
            if (this.N == null && this.M == null && this.k0 != null) {
                B(true);
            }
        }
        if ((this.k0 == null || this.l0) && this.A0 == null) {
            C();
            return;
        }
        this.R = true;
        if (!t()) {
            stop();
        }
        if (this.i0) {
            G();
        }
    }

    public final void o(Canvas canvas, Paint paint, boolean z4, long j10, int i10) {
        float width;
        boolean z10;
        float f10;
        if (!i() || this.T) {
            return;
        }
        if (!z4) {
            S(j10);
        }
        RectF rectF = z4 ? this.g0[i10] : this.f0;
        if (paint == null) {
            paint = z4 ? this.h0[i10] : getPaint();
        }
        if (paint.getAlpha() == 0 || this.n0 || this.O == null) {
            return;
        }
        boolean z11 = true;
        if (z4) {
            width = rectF.width() / this.b;
            float height = rectF.height() / this.c;
            if (Math.abs(rectF.width() - this.b) < AndroidUtilities.dp(1.0f) && Math.abs(rectF.height() - this.c) < AndroidUtilities.dp(1.0f)) {
                z11 = false;
            }
            z10 = z11;
            f10 = height;
        } else {
            rectF.set(getBounds());
            if (this.d0) {
                this.b0 = rectF.width() / this.b;
                this.c0 = rectF.height() / this.c;
                this.d0 = false;
                if (Math.abs(rectF.width() - this.b) < AndroidUtilities.dp(1.0f) && Math.abs(rectF.height() - this.c) < AndroidUtilities.dp(1.0f)) {
                    z11 = false;
                }
                this.e0 = z11;
            }
            width = this.b0;
            f10 = this.c0;
            z10 = this.e0;
        }
        if (!z10) {
            canvas.drawBitmap(this.O, rectF.left, rectF.top, paint);
            return;
        }
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        canvas.scale(width, f10);
        canvas.drawBitmap(this.O, 0.0f, 0.0f, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.d0 = true;
    }

    public final long p() {
        int[] iArr = this.e;
        return (long) ((iArr[0] / iArr[1]) * 1000.0f);
    }

    public final int q() {
        return this.e[0];
    }

    public final float r() {
        return this.Y / this.e[0];
    }

    public final boolean s() {
        if (this.j0) {
            return false;
        }
        return ((this.O == null && this.P == null) || this.n0) ? false : true;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.i0) {
            return;
        }
        if ((this.I < 2 || this.K == 0) && this.f != this.Y) {
            this.i0 = true;
            this.I0 = false;
            if (this.m0) {
                this.n0 = true;
                if (this.N != null) {
                    this.o0 = true;
                }
            }
            G();
            v();
            j();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.i0 = false;
        j();
    }

    public final boolean t() {
        return (this.G.isEmpty() && this.s0 == null && getCallback() == null) ? false : true;
    }

    public boolean u() {
        return this.O != null && this.e[0] == 1;
    }

    public final void v() {
        if (this.j0) {
            return;
        }
        int size = this.G.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((ImageReceiver) this.G.get(i10)).invalidate();
        }
        View view = this.s0;
        if (view != null) {
            view.invalidate();
        }
        if (getCallback() != null) {
            invalidateSelf();
        }
    }

    public final boolean w() {
        return this.M != null;
    }

    public boolean x() {
        return true;
    }

    public final boolean y() {
        return this.Y == this.e[0] - 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0150 A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:46:0x00fd, B:49:0x0106, B:51:0x010a, B:64:0x0142, B:66:0x0146, B:68:0x014c, B:70:0x0150, B:71:0x0157, B:73:0x015c, B:75:0x0160, B:76:0x018c, B:78:0x0190, B:80:0x019e, B:82:0x01a6, B:84:0x01aa, B:86:0x01ae, B:88:0x01b1, B:89:0x01b7, B:91:0x01bd, B:92:0x01c4, B:94:0x01c7, B:95:0x01cc, B:97:0x01d2, B:98:0x01d8, B:102:0x01e4, B:104:0x01e8, B:105:0x01f0, B:106:0x01f5, B:108:0x01f9, B:110:0x0201, B:111:0x0205, B:113:0x0209, B:115:0x020f, B:117:0x021c, B:118:0x0221, B:120:0x0227, B:121:0x01de, B:123:0x0133, B:127:0x013a), top: B:45:0x00fd }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015c A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:46:0x00fd, B:49:0x0106, B:51:0x010a, B:64:0x0142, B:66:0x0146, B:68:0x014c, B:70:0x0150, B:71:0x0157, B:73:0x015c, B:75:0x0160, B:76:0x018c, B:78:0x0190, B:80:0x019e, B:82:0x01a6, B:84:0x01aa, B:86:0x01ae, B:88:0x01b1, B:89:0x01b7, B:91:0x01bd, B:92:0x01c4, B:94:0x01c7, B:95:0x01cc, B:97:0x01d2, B:98:0x01d8, B:102:0x01e4, B:104:0x01e8, B:105:0x01f0, B:106:0x01f5, B:108:0x01f9, B:110:0x0201, B:111:0x0205, B:113:0x0209, B:115:0x020f, B:117:0x021c, B:118:0x0221, B:120:0x0227, B:121:0x01de, B:123:0x0133, B:127:0x013a), top: B:45:0x00fd }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019e A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:46:0x00fd, B:49:0x0106, B:51:0x010a, B:64:0x0142, B:66:0x0146, B:68:0x014c, B:70:0x0150, B:71:0x0157, B:73:0x015c, B:75:0x0160, B:76:0x018c, B:78:0x0190, B:80:0x019e, B:82:0x01a6, B:84:0x01aa, B:86:0x01ae, B:88:0x01b1, B:89:0x01b7, B:91:0x01bd, B:92:0x01c4, B:94:0x01c7, B:95:0x01cc, B:97:0x01d2, B:98:0x01d8, B:102:0x01e4, B:104:0x01e8, B:105:0x01f0, B:106:0x01f5, B:108:0x01f9, B:110:0x0201, B:111:0x0205, B:113:0x0209, B:115:0x020f, B:117:0x021c, B:118:0x0221, B:120:0x0227, B:121:0x01de, B:123:0x0133, B:127:0x013a), top: B:45:0x00fd }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int z() {
        boolean z4;
        int c3;
        lf.g gVar;
        lf.g gVar2;
        RLottieNative b10;
        if (this.j0) {
            return 3;
        }
        if (i()) {
            if (this.k0 == null && this.d) {
                String readRes = AndroidUtilities.readRes(this.t0.b);
                if (!TextUtils.isEmpty(readRes)) {
                    this.k0 = RLottieNative.b(readRes, this.e, (int[]) this.t0.c, this.w);
                    this.d = false;
                }
            }
            if (this.Q == null) {
                try {
                    this.Q = Bitmap.createBitmap(this.b, this.c, this.D ? Bitmap.Config.ALPHA_8 : Bitmap.Config.ARGB_8888);
                    z4 = false;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                if (this.Q != null) {
                    RLottieNative rLottieNative = this.k0;
                    if (rLottieNative != null) {
                        try {
                            if (!this.v.isEmpty() || this.r != null) {
                                this.w.putAll(this.v);
                                int[] iArr = this.r;
                                if (iArr != null) {
                                    this.t0.c = (int[]) iArr.clone();
                                }
                                com.google.firebase.messaging.n nVar = this.t0;
                                File file = (File) nVar.e;
                                if (file != null) {
                                    String absolutePath = file.getAbsolutePath();
                                    com.google.firebase.messaging.n nVar2 = this.t0;
                                    b10 = RLottieNative.a(absolutePath, (String) nVar2.d, this.b, this.c, this.e, false, (int[]) nVar2.c, this.Z, nVar2.a, this.w);
                                } else {
                                    int i10 = nVar.b;
                                    if (i10 == 0 || ((String) nVar.d) != null) {
                                        b10 = RLottieNative.b((String) nVar.d, this.e, (int[]) nVar.c, this.w);
                                    } else {
                                        String readRes2 = AndroidUtilities.readRes(i10);
                                        if (!TextUtils.isEmpty(readRes2)) {
                                            com.google.firebase.messaging.n nVar3 = this.t0;
                                            nVar3.d = readRes2;
                                            b10 = RLottieNative.b(readRes2, this.e, (int[]) nVar3.c, this.w);
                                        }
                                    }
                                }
                                if (b10 != null) {
                                    this.k0 = b10;
                                    rLottieNative.d();
                                    this.v.clear();
                                    this.r = null;
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    try {
                        RLottieNative rLottieNative2 = this.k0;
                        int i11 = this.Z ? 2 : 1;
                        if (!this.q0 || (gVar2 = this.A0) == null) {
                            c3 = rLottieNative2.c(this.Y, this.Q, z4);
                        } else {
                            try {
                                c3 = gVar2.f(this.Q, this.Y / i11);
                                try {
                                    if (!this.A0.g() && this.D0 && this.k0 != null) {
                                        this.k0.d();
                                        this.k0 = null;
                                    }
                                } catch (Exception e6) {
                                    e = e6;
                                    FileLog.e(e);
                                    gVar = this.A0;
                                    if (gVar != null) {
                                        if (!this.C0) {
                                        }
                                        c3 = -1;
                                        if (this.D0) {
                                        }
                                    }
                                    if (c3 >= 0) {
                                    }
                                    return 2;
                                }
                            } catch (Exception e10) {
                                e = e10;
                                c3 = 0;
                            }
                        }
                        gVar = this.A0;
                        if (gVar != null && gVar.g()) {
                            if (!this.C0) {
                                this.C0 = true;
                                AndroidUtilities.runOnUIThread(this.x0);
                            }
                            c3 = -1;
                            if (this.D0) {
                                if (this.k0 == null) {
                                    String file2 = ((File) this.t0.e).toString();
                                    com.google.firebase.messaging.n nVar4 = this.t0;
                                    this.k0 = RLottieNative.a(file2, (String) nVar4.d, this.b, this.c, null, false, (int[]) nVar4.c, false, nVar4.a, this.w);
                                }
                                if (this.k0 != null) {
                                    c3 = this.k0.c(this.Y, this.Q, z4);
                                }
                            }
                        }
                        if (c3 >= 0) {
                            this.P = this.Q;
                            int i12 = this.f;
                            if (i12 < 0 || !this.h) {
                                int i13 = this.Y + i11;
                                if (i12 < 0) {
                                    i12 = this.e[0];
                                }
                                if (i13 >= i12) {
                                    int i14 = this.I;
                                    if (i14 == 1) {
                                        this.Y = 0;
                                        this.L = false;
                                        if (this.y) {
                                            this.x = null;
                                            this.y = false;
                                        }
                                        int i15 = this.J;
                                        if (i15 > 0) {
                                            this.J = i15 - 1;
                                        }
                                    } else if (i14 == 2) {
                                        this.Y = 0;
                                        this.L = true;
                                        this.K++;
                                        if (this.y) {
                                            this.x = null;
                                            this.y = false;
                                        }
                                    } else {
                                        this.L = true;
                                        Runnable runnable = this.r0;
                                        if (runnable != null) {
                                            runnable.run();
                                            this.r0 = null;
                                        }
                                    }
                                } else if (this.I == 3) {
                                    this.L = true;
                                    this.K++;
                                } else {
                                    this.Y = i13;
                                    this.L = false;
                                }
                            } else {
                                int i16 = this.Y;
                                if (i16 > i12) {
                                    int i17 = i16 - i11;
                                    if (i17 >= i12) {
                                        this.Y = i17;
                                        this.L = false;
                                    } else {
                                        this.L = true;
                                        Runnable runnable2 = this.r0;
                                        if (runnable2 != null) {
                                            runnable2.run();
                                            this.r0 = null;
                                        }
                                    }
                                } else {
                                    int i18 = i16 + i11;
                                    if (i18 < i12) {
                                        this.Y = i18;
                                        this.L = false;
                                    } else {
                                        this.L = true;
                                        Runnable runnable3 = this.r0;
                                        if (runnable3 != null) {
                                            runnable3.run();
                                            this.r0 = null;
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
            z4 = true;
            if (this.Q != null) {
            }
            return 1;
        }
        return 2;
    }

    public hj0(int i10, int i11) {
        this.e = new int[3];
        this.f = -1;
        this.s = new HashMap();
        this.v = new HashMap();
        this.w = new HashMap();
        this.y = false;
        this.B = true;
        this.C = 1.0f;
        this.G = new ArrayList();
        this.I = 1;
        this.J = -1;
        this.b0 = 1.0f;
        this.c0 = 1.0f;
        this.f0 = new RectF();
        this.g0 = new RectF[2];
        this.h0 = new Paint[2];
        this.u0 = new fj0(this, 1);
        this.v0 = new fj0(this, 2);
        this.x0 = new fj0(this, 3);
        this.y0 = new fj0(this, 4);
        this.E0 = new fj0(this, 5);
        this.J0 = new x5(this, 2);
        this.b = i10;
        this.c = i11;
        this.D = false;
    }

    public hj0(int i10, int i11, int i12) {
        this(i10, i11, i12, true, null);
    }

    public hj0(int i10, int i11, int i12, boolean z4, int[] iArr) {
        long j10;
        this.e = new int[3];
        this.f = -1;
        this.s = new HashMap();
        this.v = new HashMap();
        this.w = new HashMap();
        this.y = false;
        this.B = true;
        this.C = 1.0f;
        this.G = new ArrayList();
        this.I = 1;
        this.J = -1;
        this.b0 = 1.0f;
        this.c0 = 1.0f;
        this.f0 = new RectF();
        this.g0 = new RectF[2];
        this.h0 = new Paint[2];
        this.u0 = new fj0(this, 1);
        this.v0 = new fj0(this, 2);
        this.x0 = new fj0(this, 3);
        this.y0 = new fj0(this, 4);
        this.E0 = new fj0(this, 5);
        this.J0 = new x5(this, 2);
        this.b = i11;
        this.c = i12;
        this.I = 0;
        getPaint().setFlags(2);
        com.google.firebase.messaging.n nVar = new com.google.firebase.messaging.n();
        this.t0 = nVar;
        nVar.c = iArr == null ? null : (int[]) iArr.clone();
        long[] jArr = ue.a.a;
        int length = jArr.length - 1;
        int i13 = 0;
        while (true) {
            if (i13 > length) {
                j10 = -1;
                break;
            }
            int i14 = (i13 + length) >>> 1;
            j10 = jArr[i14];
            int i15 = (int) (j10 >>> 32);
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
        if (j10 != -1) {
            this.d = true;
            this.t0.b = i10;
            this.D = (8388608 & j10) != 0;
            int[] iArr2 = this.e;
            iArr2[0] = (int) (8388607 & j10);
            iArr2[1] = (int) ((j10 >>> 24) & 255);
        } else {
            this.D = false;
            String readRes = AndroidUtilities.readRes(i10);
            if (TextUtils.isEmpty(readRes)) {
                this.t0 = null;
                return;
            } else {
                com.google.firebase.messaging.n nVar2 = this.t0;
                nVar2.d = readRes;
                this.k0 = RLottieNative.b(readRes, this.e, (int[]) nVar2.c, this.w);
            }
        }
        if (this.D) {
            setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        if (z4) {
            H(true);
        }
    }
}
