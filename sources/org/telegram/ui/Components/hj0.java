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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class hj0 extends BitmapDrawable implements Animatable, xf.c {
    public static final AtomicInteger P0 = new AtomicInteger();
    public static final AtomicInteger Q0 = new AtomicInteger();
    public static final ExecutorService R0 = Executors.newFixedThreadPool(4, new e2.c0(1));
    public static final ExecutorService S0 = Executors.newFixedThreadPool(2, new e2.c0(2));
    public static DispatchQueue T0;
    public final Runnable A0;
    public final Runnable B0;
    public Runnable C0;
    public xf.e D0;
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
    public final xf.g M0;
    public int N;
    public boolean N0;
    public volatile boolean O;
    public boolean O0;
    public gj0 P;
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

    /* JADX WARN: Removed duplicated region for block: B:70:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hj0(File file, String str, int i10, int i11, b2.n1 n1Var, boolean z10, int i12, boolean z11) {
        char c10;
        RLottieNative a2;
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
        this.x0 = new gj0(this, 1);
        this.y0 = new gj0(this, 2);
        this.A0 = new gj0(this, 3);
        this.B0 = new gj0(this, 4);
        this.H0 = new gj0(this, 5);
        this.M0 = new b6(this, 2);
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
            c10 = 1;
            T0 = new DispatchQueue("cache generator queue");
        } else {
            c10 = 1;
        }
        if (!z12) {
            this.n0 = RLottieNative.a(file.getAbsolutePath(), str, iArr, (int[]) pVar.c, i12, hashMap);
            if (this.n0 == null) {
                FileLog.d("RLottieDrawable nativePtr == 0 " + file.getAbsolutePath() + " remove file");
                file.delete();
            }
            if (!z10 || iArr[c10] >= 60) {
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
                JsonReader jsonReader = new JsonReader(new FileReader(file.getAbsoluteFile()));
                try {
                    jsonReader.beginObject();
                    double d = 0.0d;
                    double d10 = 30.0d;
                    double d11 = 0.0d;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        int hashCode = nextName.hashCode();
                        if (hashCode == 3276) {
                            if (nextName.equals("fr")) {
                                d10 = jsonReader.nextDouble();
                            }
                            jsonReader.skipValue();
                        } else if (hashCode != 3367) {
                            if (hashCode == 3553) {
                                try {
                                    if (nextName.equals("op")) {
                                        d = jsonReader.nextDouble();
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
                            jsonReader.skipValue();
                        } else {
                            if (nextName.equals("ip")) {
                                d11 = jsonReader.nextDouble();
                            }
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    jsonReader.close();
                    iArr[0] = (int) (d - d11);
                    iArr[c10] = (int) d10;
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Exception e) {
                e = e;
                FileLog.e((Throwable) e, false);
                String absolutePath = file.getAbsolutePath();
                com.google.firebase.messaging.p pVar2 = this.w0;
                a2 = RLottieNative.a(absolutePath, str, iArr, (int[]) pVar2.c, pVar2.a, this.w);
                if (a2 != null) {
                    a2.d();
                }
                if (this.c0) {
                    this.c0 = false;
                }
                this.D0 = new xf.e(file, this, n1Var, i10, i11, !z10, i12);
            }
        } catch (Exception e7) {
            e = e7;
            FileLog.e((Throwable) e, false);
            String absolutePath2 = file.getAbsolutePath();
            com.google.firebase.messaging.p pVar22 = this.w0;
            a2 = RLottieNative.a(absolutePath2, str, iArr, (int[]) pVar22.c, pVar22.a, this.w);
            if (a2 != null) {
            }
            if (this.c0) {
            }
            this.D0 = new xf.e(file, this, n1Var, i10, i11, !z10, i12);
        }
        if (this.c0 && this.e[c10] < 60) {
            this.c0 = false;
        }
        this.D0 = new xf.e(file, this, n1Var, i10, i11, !z10, i12);
    }

    public static void d(hj0 hj0Var) {
        if (hj0Var.P != null) {
            xf.e.c();
            hj0Var.P = null;
        }
        hj0Var.z0 = false;
        hj0Var.p();
        Runnable runnable = hj0Var.C0;
        if (runnable != null) {
            runnable.run();
            hj0Var.C0 = null;
        }
    }

    public static void e(hj0 hj0Var) {
        if (hj0Var.m0 || hj0Var.W || !hj0Var.k() || hj0Var.P != null) {
            return;
        }
        hj0Var.z0 = true;
        if (T0 == null) {
            T0 = new DispatchQueue("cache generator queue");
        }
        xf.e.A++;
        DispatchQueue dispatchQueue = T0;
        gj0 gj0Var = new gj0(hj0Var, 0);
        hj0Var.P = gj0Var;
        dispatchQueue.postRunnable(gj0Var);
    }

    public static void f(hj0 hj0Var) {
        int i10;
        Bitmap createBitmap;
        boolean z10;
        try {
            i10 = hj0Var.j();
            if (i10 == 1) {
                if (hj0Var.T != null) {
                    createBitmap = hj0Var.T;
                    z10 = true;
                } else {
                    createBitmap = Bitmap.createBitmap(hj0Var.b, hj0Var.c, hj0Var.G ? Bitmap.Config.ALPHA_8 : Bitmap.Config.ARGB_8888);
                    hj0Var.T = createBitmap;
                    z10 = false;
                }
                int B = hj0Var.B(createBitmap, z10);
                if (B == 1) {
                    hj0Var.S = createBitmap;
                    hj0Var.i();
                }
                i10 = B;
            }
        } catch (Exception e) {
            FileLog.e(e);
            i10 = 2;
        }
        if (i10 == 1) {
            hj0Var.I0 = 0;
            AndroidUtilities.runOnUIThread(hj0Var.y0);
        } else if (i10 == 2) {
            AndroidUtilities.runOnUIThread(hj0Var.x0, hj0Var.I0);
            hj0Var.I0 = Math.min((Math.max(hj0Var.I0, 2) * 3) / 2, 2000);
        } else if (i10 == 3) {
            AndroidUtilities.runOnUIThread(hj0Var.x0);
        }
        CountDownLatch countDownLatch = hj0Var.V;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static void g(hj0 hj0Var) {
        int i10 = hj0Var.K0 + 1;
        hj0Var.K0 = i10;
        if (i10 > 10) {
            hj0Var.L0 = true;
        }
        hj0Var.m();
        if (hj0Var.O0) {
            hj0Var.N0 = true;
            hj0Var.x();
        }
    }

    public static void h(hj0 hj0Var) {
        hj0Var.Y = true;
        if ((!hj0Var.l0 && hj0Var.X) || (hj0Var.R == null && hj0Var.S != null)) {
            hj0Var.x();
        }
        hj0Var.p();
    }

    public final boolean A() {
        return this.b0 == this.e[0] - 1;
    }

    public int B(Bitmap bitmap, boolean z10) {
        RLottieNative b10;
        int c10;
        xf.e eVar;
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
                        b10 = RLottieNative.a(absolutePath, (String) pVar2.d, this.e, (int[]) pVar2.c, pVar2.a, this.w);
                    } else {
                        int i10 = pVar.b;
                        if (i10 == 0 || ((String) pVar.d) != null) {
                            b10 = RLottieNative.b((String) pVar.d, this.e, (int[]) pVar.c, this.w);
                        } else {
                            String readRes = AndroidUtilities.readRes(i10);
                            if (!TextUtils.isEmpty(readRes)) {
                                com.google.firebase.messaging.p pVar3 = this.w0;
                                pVar3.d = readRes;
                                b10 = RLottieNative.b(readRes, this.e, (int[]) pVar3.c, this.w);
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
        RLottieNative rLottieNative2 = this.n0;
        int i11 = this.c0 ? 2 : 1;
        if (!this.t0 || (eVar = this.D0) == null) {
            c10 = rLottieNative2.c(this.b0, bitmap, z10);
        } else {
            c10 = 0;
            try {
                c10 = eVar.f(bitmap, this.b0 / i11);
                if (!this.D0.g() && this.G0 && this.n0 != null) {
                    this.n0.d();
                    this.n0 = null;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        xf.e eVar2 = this.D0;
        if (eVar2 != null && eVar2.g()) {
            if (!this.F0) {
                this.F0 = true;
                AndroidUtilities.runOnUIThread(this.A0);
            }
            c10 = -1;
            if (this.G0) {
                if (this.n0 == null) {
                    String file2 = ((File) this.w0.e).toString();
                    com.google.firebase.messaging.p pVar4 = this.w0;
                    this.n0 = RLottieNative.a(file2, (String) pVar4.d, null, (int[]) pVar4.c, pVar4.a, this.w);
                }
                if (this.n0 != null) {
                    c10 = this.n0.c(this.b0, bitmap, z10);
                }
            }
        }
        return c10 < 0 ? 2 : 1;
    }

    public void C(boolean z10) {
        this.l0 = false;
        this.m0 = true;
        l();
        n();
        if (this.Q != null || this.P != null || this.z0) {
            this.W = true;
            return;
        }
        D(z10);
        xf.e eVar = this.D0;
        if (eVar != null) {
            RandomAccessFile randomAccessFile = eVar.s;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                eVar.s = null;
            }
            eVar.r = true;
            this.D0 = null;
        }
        E();
    }

    public void D(boolean z10) {
        RLottieNative rLottieNative = this.n0;
        this.n0 = null;
        if (rLottieNative != null) {
            kc0 kc0Var = new kc0(rLottieNative, 15);
            if (z10) {
                DispatchQueuePoolBackground.execute(kc0Var);
            } else {
                Utilities.globalQueue.postRunnable(kc0Var);
            }
        }
    }

    public final void E() {
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

    public final void F(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.J;
        arrayList.remove(imageReceiver);
        if (this.D0 == null || T0 == null || this.P == null || !arrayList.isEmpty() || getCallback() != null) {
            return;
        }
        View view = this.v0;
        if (view == null || !view.isAttachedToWindow()) {
            gj0 gj0Var = this.P;
            if (gj0Var != null) {
                T0.cancelRunnable(gj0Var);
                xf.e.c();
                this.P = null;
            }
            this.z0 = false;
            this.F0 = false;
        }
    }

    public final void G() {
        if (!this.a0 && !this.l0 && this.X) {
            if (this.b0 <= 2) {
                this.b0 = 0;
            }
            this.O = false;
            this.Y = false;
            if (!I()) {
                this.Z = true;
            }
        }
        x();
    }

    public final boolean H(boolean z10) {
        if (!z10 && ((this.L < 2 || this.N == 0) && this.M < 0)) {
            return false;
        }
        this.N = 0;
        this.L = 2;
        start();
        return true;
    }

    public final boolean I() {
        if (this.Q != null || this.S != null || !k() || w() || this.W || this.m0) {
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

    public final void J(boolean z10) {
        this.X = true;
        I();
    }

    public final void K(int i10) {
        if (this.L == 2 && i10 == 3 && this.b0 != 0) {
            return;
        }
        this.L = i10;
    }

    public final void L() {
        N(85, false, false);
    }

    public final void M(int i10) {
        N(i10, true, false);
    }

    public final void N(int i10, boolean z10, boolean z11) {
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
                l();
            }
            if (!I()) {
                this.Z = true;
            } else if (!z10) {
                try {
                    this.V.await();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                this.V = null;
            }
            invalidateSelf();
        }
    }

    public final void O(boolean z10) {
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
        I();
    }

    public final boolean P(int i10) {
        if (this.f == i10 || i10 > this.e[0]) {
            return false;
        }
        this.f = i10;
        return true;
    }

    public final void Q(int i10, String str) {
        this.s.put(str, Integer.valueOf(i10));
        G();
    }

    public final void R(int i10, Runnable runnable) {
        if (runnable != null) {
            this.H = new WeakReference(runnable);
            this.I = i10;
        } else if (this.H != null) {
            this.H = null;
        }
    }

    public final void S(float f7, boolean z10) {
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        N((int) (this.e[0] * f7), z10, false);
    }

    public final void T(long j3) {
        int i10;
        int[] iArr = this.e;
        if (iArr[0] == 0 || (i10 = iArr[1]) == 0) {
            return;
        }
        N(Math.round(Math.max(0L, j3) / (1000.0f / i10)) % iArr[0], true, true);
    }

    public final void U(long j3) {
        Integer num;
        this.K0 = 0;
        if (this.L0) {
            this.L0 = false;
            l();
        }
        boolean z10 = this.N0 || (!this.l0 && this.X);
        if (!this.l0) {
            if ((this.Z || (this.X && z10)) && this.S != null) {
                O(true);
                return;
            }
            return;
        }
        if (this.R == null && this.S == null) {
            I();
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
                O(false);
            }
        }
    }

    @Override // xf.c
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
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a(bitmap);
    }

    @Override // xf.c
    public final void b() {
        File file;
        com.google.firebase.messaging.p pVar = this.w0;
        File file2 = (File) pVar.e;
        RLottieNative a2 = RLottieNative.a(file2 != null ? file2.toString() : null, (String) pVar.d, this.d0 ? this.e : null, (int[]) pVar.c, pVar.a, this.w);
        this.J0 = a2;
        this.E0 = 0;
        if (a2 != null || (file = this.s0) == null) {
            return;
        }
        file.delete();
    }

    @Override // xf.c
    public final void c() {
        RLottieNative rLottieNative = this.J0;
        if (rLottieNative != null) {
            rLottieNative.d();
            this.J0 = null;
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        q(canvas, null, false, 0L, 0);
    }

    public final void finalize() {
        try {
            C(false);
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

    public void i() {
        int i10 = this.c0 ? 2 : 1;
        int i11 = this.f;
        if (i11 >= 0 && this.h) {
            int i12 = this.b0;
            if (i12 > i11) {
                int i13 = i12 - i10;
                if (i13 >= i11) {
                    this.b0 = i13;
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
            int i14 = i12 + i10;
            if (i14 < i11) {
                this.b0 = i14;
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
        int i15 = this.b0 + i10;
        if (i11 < 0) {
            i11 = this.e[0];
        }
        if (i15 < i11) {
            if (this.L == 3) {
                this.O = true;
                this.N++;
                return;
            } else {
                this.b0 = i15;
                this.O = false;
                return;
            }
        }
        int i16 = this.L;
        if (i16 == 1) {
            this.b0 = 0;
            this.O = false;
            if (this.y) {
                this.x = null;
                this.y = false;
            }
            int i17 = this.M;
            if (i17 > 0) {
                this.M = i17 - 1;
                return;
            }
            return;
        }
        if (i16 != 2) {
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
        if (this.y) {
            this.x = null;
            this.y = false;
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.l0;
    }

    public int j() {
        if (this.m0) {
            return 3;
        }
        if (!k()) {
            return 2;
        }
        if (this.n0 != null || !this.d) {
            return 1;
        }
        String readRes = AndroidUtilities.readRes(this.w0.b);
        if (TextUtils.isEmpty(readRes)) {
            return 2;
        }
        this.n0 = RLottieNative.b(readRes, this.e, (int[]) this.w0.c, this.w);
        this.d = false;
        return 1;
    }

    public final boolean k() {
        return this.t0 ? this.D0 != null || this.o0 : this.n0 != null || this.d;
    }

    public final void l() {
        AndroidUtilities.executeOnUIThread(new gj0(this, 6));
    }

    public final void m() {
        if (!this.l0 || this.L0) {
            if (this.O0) {
                this.O0 = false;
                this.K0 = 0;
                xf.h.d().g(this.M0);
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
            xf.h.d().b(this.M0, round);
            x();
        }
    }

    public final void n() {
        gj0 gj0Var = this.P;
        if (gj0Var != null) {
            T0.cancelRunnable(gj0Var);
            xf.e.c();
            this.P = null;
        }
        if (v() || this.S == null || this.Q == null) {
            return;
        }
        this.Q = null;
        this.S = null;
    }

    public final void o() {
        if (this.a0) {
            this.a0 = false;
            if (!this.l0 && this.X) {
                if (this.b0 <= 2) {
                    this.b0 = 0;
                }
                this.O = false;
                this.Y = false;
                if (!I()) {
                    this.Z = true;
                }
            }
            x();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.g0 = true;
    }

    public void p() {
        if (this.W) {
            n();
            if (this.Q == null && this.P == null && this.n0 != null) {
                D(true);
            }
        }
        if ((this.n0 == null || this.o0) && this.D0 == null) {
            E();
            return;
        }
        this.U = true;
        if (!v()) {
            stop();
        }
        if (this.l0) {
            I();
        }
    }

    public final void q(Canvas canvas, Paint paint, boolean z10, long j3, int i10) {
        float width;
        boolean z11;
        float f7;
        if (!k() || this.W) {
            return;
        }
        if (!z10) {
            U(j3);
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

    public final long r() {
        int[] iArr = this.e;
        return (long) ((iArr[0] / iArr[1]) * 1000.0f);
    }

    public final int s() {
        return this.e[0];
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
            I();
            x();
            l();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.l0 = false;
        l();
    }

    public final float t() {
        return this.b0 / this.e[0];
    }

    public final boolean u() {
        if (this.m0) {
            return false;
        }
        return ((this.R == null && this.S == null) || this.q0) ? false : true;
    }

    public final boolean v() {
        return (this.J.isEmpty() && this.v0 == null && getCallback() == null) ? false : true;
    }

    public boolean w() {
        return this.R != null && this.e[0] == 1;
    }

    public final void x() {
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

    public final boolean y() {
        return this.P != null;
    }

    public boolean z() {
        return true;
    }

    public hj0(int i10, int i11) {
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
        this.x0 = new gj0(this, 1);
        this.y0 = new gj0(this, 2);
        this.A0 = new gj0(this, 3);
        this.B0 = new gj0(this, 4);
        this.H0 = new gj0(this, 5);
        this.M0 = new b6(this, 2);
        this.b = i10;
        this.c = i11;
        this.G = false;
    }

    public hj0(int i10, int i11, int i12) {
        this(i10, i11, i12, true, null);
    }

    public hj0(int i10, int i11, int i12, boolean z10, int[] iArr) {
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
        this.x0 = new gj0(this, 1);
        this.y0 = new gj0(this, 2);
        this.A0 = new gj0(this, 3);
        this.B0 = new gj0(this, 4);
        this.H0 = new gj0(this, 5);
        this.M0 = new b6(this, 2);
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
            J(true);
        }
    }
}
