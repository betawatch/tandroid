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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class gj0 extends BitmapDrawable implements Animatable, lf.e {
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
    public dj0 M;
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
    public final fj0 t0;
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
        O0 = Executors.newFixedThreadPool(4, new ThreadFactory() { // from class: org.telegram.ui.Components.ej0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                switch (i10) {
                    case 0:
                        return new Thread(runnable, "Lottie-" + gj0.M0.getAndIncrement());
                    default:
                        return new Thread(runnable, "LottieLow-" + gj0.N0.getAndIncrement());
                }
            }
        });
        final int i11 = 1;
        P0 = Executors.newFixedThreadPool(2, new ThreadFactory() { // from class: org.telegram.ui.Components.ej0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                switch (i11) {
                    case 0:
                        return new Thread(runnable, "Lottie-" + gj0.M0.getAndIncrement());
                    default:
                        return new Thread(runnable, "LottieLow-" + gj0.N0.getAndIncrement());
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gj0(File file, String str, int i10, int i11, ke.i iVar, boolean z4, int i12, boolean z10) {
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
        this.u0 = new dj0(this, 1);
        this.v0 = new dj0(this, 2);
        this.x0 = new dj0(this, 3);
        this.y0 = new dj0(this, 4);
        this.E0 = new dj0(this, 5);
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
        fj0 fj0Var = new fj0();
        this.t0 = fj0Var;
        fj0Var.d = file.getAbsoluteFile();
        fj0Var.e = str;
        fj0Var.a = null;
        fj0Var.b = i12;
        getPaint().setFlags(2);
        if (str == null) {
            this.p0 = file;
        }
        if (z11 && Q0 == null) {
            Q0 = new DispatchQueue("cache generator queue");
        }
        if (!z11) {
            this.k0 = RLottieNative.a(file.getAbsolutePath(), str, i10, i11, iArr, z11, fj0Var.a, z4, i12, hashMap);
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
            } catch (Exception e) {
                e = e;
                FileLog.e((Throwable) e, false);
                String absolutePath = file.getAbsolutePath();
                int i14 = this.b;
                int i15 = this.c;
                fj0 fj0Var2 = this.t0;
                i13 = 60;
                c3 = 1;
                a2 = RLottieNative.a(absolutePath, str, i14, i15, iArr, false, fj0Var2.a, this.Z, fj0Var2.b, this.w);
                if (a2 != null) {
                    a2.d();
                }
                if (this.Z) {
                    this.Z = false;
                }
                this.A0 = new lf.g(file, this, iVar, i10, i11, !z4, i12);
            }
        } catch (Exception e6) {
            e = e6;
            FileLog.e((Throwable) e, false);
            String absolutePath2 = file.getAbsolutePath();
            int i142 = this.b;
            int i152 = this.c;
            fj0 fj0Var22 = this.t0;
            i13 = 60;
            c3 = 1;
            a2 = RLottieNative.a(absolutePath2, str, i142, i152, iArr, false, fj0Var22.a, this.Z, fj0Var22.b, this.w);
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

    public static void d(gj0 gj0Var) {
        if (gj0Var.M != null) {
            lf.g.c();
            gj0Var.M = null;
        }
        gj0Var.w0 = false;
        gj0Var.n();
        Runnable runnable = gj0Var.z0;
        if (runnable != null) {
            runnable.run();
            gj0Var.z0 = null;
        }
    }

    public static void e(gj0 gj0Var) {
        if (gj0Var.j0 || gj0Var.T || !gj0Var.i() || gj0Var.M != null) {
            return;
        }
        gj0Var.w0 = true;
        if (Q0 == null) {
            Q0 = new DispatchQueue("cache generator queue");
        }
        lf.g.A++;
        DispatchQueue dispatchQueue = Q0;
        dj0 dj0Var = new dj0(gj0Var, 0);
        gj0Var.M = dj0Var;
        dispatchQueue.postRunnable(dj0Var);
    }

    public static void f(gj0 gj0Var) {
        Runnable runnable = gj0Var.u0;
        int z4 = gj0Var.z();
        if (z4 == 1) {
            gj0Var.F0 = 0;
            AndroidUtilities.runOnUIThread(gj0Var.v0);
        } else if (z4 == 2) {
            AndroidUtilities.runOnUIThread(runnable, gj0Var.F0);
            gj0Var.F0 = Math.min((Math.max(gj0Var.F0, 2) * 3) / 2, 2000);
        } else if (z4 == 3) {
            AndroidUtilities.runOnUIThread(runnable);
        }
        CountDownLatch countDownLatch = gj0Var.S;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static void g(gj0 gj0Var) {
        int i10 = gj0Var.H0 + 1;
        gj0Var.H0 = i10;
        if (i10 > 10) {
            gj0Var.I0 = true;
        }
        gj0Var.k();
        if (gj0Var.L0) {
            gj0Var.K0 = true;
            gj0Var.v();
        }
    }

    public static void h(gj0 gj0Var) {
        gj0Var.V = true;
        if ((!gj0Var.i0 && gj0Var.U) || (gj0Var.O == null && gj0Var.P != null)) {
            gj0Var.v();
        }
        gj0Var.n();
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
                } catch (IOException e) {
                    e.printStackTrace();
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
            cc0 cc0Var = new cc0(rLottieNative, 15);
            if (z4) {
                DispatchQueuePoolBackground.execute(cc0Var);
            } else {
                Utilities.globalQueue.postRunnable(cc0Var);
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
            dj0 dj0Var = this.M;
            if (dj0Var != null) {
                Q0.cancelRunnable(dj0Var);
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
                } catch (Exception e) {
                    FileLog.e(e);
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
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a(bitmap);
    }

    @Override // lf.e
    public final void b() {
        File file;
        fj0 fj0Var = this.t0;
        File file2 = fj0Var.d;
        RLottieNative a2 = RLottieNative.a(file2 != null ? file2.toString() : null, fj0Var.e, this.b, this.c, this.a0 ? this.e : null, false, fj0Var.a, false, fj0Var.b, this.w);
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
        AndroidUtilities.executeOnUIThread(new dj0(this, 6));
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
        dj0 dj0Var = this.M;
        if (dj0Var != null) {
            Q0.cancelRunnable(dj0Var);
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
        boolean z4;
        int i10;
        RLottieNative b10;
        int c3;
        lf.g gVar;
        lf.g gVar2;
        if (this.j0) {
            return 3;
        }
        if (i()) {
            if (this.k0 == null && this.d) {
                String readRes = AndroidUtilities.readRes(this.t0.c);
                if (!TextUtils.isEmpty(readRes)) {
                    fj0 fj0Var = this.t0;
                    this.k0 = RLottieNative.b(readRes, fj0Var.f, this.e, fj0Var.a, this.w);
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
                    try {
                        if (rLottieNative != null) {
                            if (!this.v.isEmpty() || this.r != null) {
                                this.w.putAll(this.v);
                                int[] iArr = this.r;
                                if (iArr != null) {
                                    this.t0.a = (int[]) iArr.clone();
                                }
                                fj0 fj0Var2 = this.t0;
                                File file = fj0Var2.d;
                                if (file != null) {
                                    String absolutePath = file.getAbsolutePath();
                                    fj0 fj0Var3 = this.t0;
                                    i10 = 2;
                                    b10 = RLottieNative.a(absolutePath, fj0Var3.e, this.b, this.c, this.e, false, fj0Var3.a, this.Z, fj0Var3.b, this.w);
                                } else {
                                    i10 = 2;
                                    int i11 = fj0Var2.c;
                                    if (i11 == 0 || fj0Var2.e != null) {
                                        b10 = RLottieNative.b(fj0Var2.e, fj0Var2.f, this.e, fj0Var2.a, this.w);
                                    } else {
                                        String readRes2 = AndroidUtilities.readRes(i11);
                                        if (TextUtils.isEmpty(readRes2)) {
                                            RLottieNative rLottieNative2 = this.k0;
                                            int i12 = this.Z ? 2 : 1;
                                            if (this.q0 || (gVar2 = this.A0) == null) {
                                                c3 = rLottieNative2.c(this.Y, this.Q, z4);
                                            } else {
                                                try {
                                                    c3 = gVar2.f(this.Q, this.Y / i12);
                                                } catch (Exception e) {
                                                    e = e;
                                                    c3 = 0;
                                                }
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
                                                    }
                                                    if (c3 >= 0) {
                                                    }
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
                                                        String file2 = this.t0.d.toString();
                                                        fj0 fj0Var4 = this.t0;
                                                        this.k0 = RLottieNative.a(file2, fj0Var4.e, this.b, this.c, null, false, fj0Var4.a, false, fj0Var4.b, this.w);
                                                    }
                                                    if (this.k0 != null) {
                                                        c3 = this.k0.c(this.Y, this.Q, z4);
                                                    }
                                                }
                                            }
                                            if (c3 >= 0) {
                                                return i10;
                                            }
                                            this.P = this.Q;
                                            int i13 = this.f;
                                            if (i13 < 0 || !this.h) {
                                                int i14 = this.Y + i12;
                                                if (i13 < 0) {
                                                    i13 = this.e[0];
                                                }
                                                if (i14 >= i13) {
                                                    int i15 = this.I;
                                                    if (i15 == 1) {
                                                        this.Y = 0;
                                                        this.L = false;
                                                        if (this.y) {
                                                            this.x = null;
                                                            this.y = false;
                                                        }
                                                        int i16 = this.J;
                                                        if (i16 > 0) {
                                                            this.J = i16 - 1;
                                                        }
                                                    } else if (i15 == 2) {
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
                                                    this.Y = i14;
                                                    this.L = false;
                                                }
                                            } else {
                                                int i17 = this.Y;
                                                if (i17 > i13) {
                                                    int i18 = i17 - i12;
                                                    if (i18 >= i13) {
                                                        this.Y = i18;
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
                                                    int i19 = i17 + i12;
                                                    if (i19 < i13) {
                                                        this.Y = i19;
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
                                        } else {
                                            fj0 fj0Var5 = this.t0;
                                            fj0Var5.e = readRes2;
                                            b10 = RLottieNative.b(readRes2, fj0Var5.f, this.e, fj0Var5.a, this.w);
                                        }
                                    }
                                }
                                if (b10 != null) {
                                    this.k0 = b10;
                                    rLottieNative.d();
                                    this.v.clear();
                                    this.r = null;
                                }
                                RLottieNative rLottieNative22 = this.k0;
                                if (this.Z) {
                                }
                                if (this.q0) {
                                }
                                c3 = rLottieNative22.c(this.Y, this.Q, z4);
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
                            }
                        }
                        RLottieNative rLottieNative222 = this.k0;
                        if (this.Z) {
                        }
                        if (this.q0) {
                        }
                        c3 = rLottieNative222.c(this.Y, this.Q, z4);
                        gVar = this.A0;
                        if (gVar != null) {
                        }
                        if (c3 >= 0) {
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    i10 = 2;
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

    public gj0(int i10, int i11) {
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
        this.u0 = new dj0(this, 1);
        this.v0 = new dj0(this, 2);
        this.x0 = new dj0(this, 3);
        this.y0 = new dj0(this, 4);
        this.E0 = new dj0(this, 5);
        this.J0 = new x5(this, 2);
        this.b = i10;
        this.c = i11;
        this.D = false;
    }

    public gj0(int i10, int i11, String str, int i12) {
        this(i10, str, i11, i12, true, null);
    }

    public gj0(int i10, String str, int i11, int i12, boolean z4, int[] iArr) {
        long j10;
        long j11;
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
        this.u0 = new dj0(this, 1);
        this.v0 = new dj0(this, 2);
        this.x0 = new dj0(this, 3);
        this.y0 = new dj0(this, 4);
        this.E0 = new dj0(this, 5);
        this.J0 = new x5(this, 2);
        this.b = i11;
        this.c = i12;
        this.I = 0;
        getPaint().setFlags(2);
        fj0 fj0Var = new fj0();
        this.t0 = fj0Var;
        fj0Var.f = str;
        fj0Var.a = iArr == null ? null : (int[]) iArr.clone();
        long[] jArr = ue.b.a;
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
            this.t0.c = i10;
            this.D = (8388608 & j11) != 0;
            int[] iArr2 = this.e;
            iArr2[0] = (int) (8388607 & j11);
            iArr2[1] = (int) ((j11 >>> 24) & 255);
        } else {
            this.D = false;
            String readRes = AndroidUtilities.readRes(i10);
            if (TextUtils.isEmpty(readRes)) {
                this.t0 = null;
                return;
            } else {
                fj0 fj0Var2 = this.t0;
                fj0Var2.e = readRes;
                this.k0 = RLottieNative.b(readRes, str, this.e, fj0Var2.a, this.w);
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
