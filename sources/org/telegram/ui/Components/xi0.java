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
import java.util.Iterator;
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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public class xi0 extends BitmapDrawable implements Animatable, yf.c {
    public static final AtomicInteger P0 = new AtomicInteger();
    public static final AtomicInteger Q0 = new AtomicInteger();
    public static final ExecutorService R0 = Executors.newFixedThreadPool(4, new e2.c0(1));
    public static final ExecutorService S0 = Executors.newFixedThreadPool(2, new e2.c0(2));
    public static DispatchQueue T0;
    public Runnable A0;
    public yf.e B0;
    public int C0;
    public boolean D0;
    public boolean E;
    public boolean E0;
    public float F;
    public final Runnable F0;
    public final boolean G;
    public int G0;
    public WeakReference H;
    public WeakReference H0;
    public int I;
    public final pe.b I0;
    public int J;
    public RLottieNative J0;
    public int K;
    public int K0;
    public int L;
    public volatile boolean L0;
    public int M;
    public final yf.g M0;
    public volatile boolean N;
    public boolean N0;
    public wi0 O;
    public boolean O0;
    public Runnable P;
    public volatile Bitmap Q;
    public volatile Bitmap R;
    public volatile Bitmap S;
    public boolean T;
    public CountDownLatch U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a;
    public int a0;
    public final int b;
    public final boolean b0;
    public final int c;
    public final boolean c0;
    public boolean d;
    public float d0;
    public final int[] e;
    public float e0;
    public int f;
    public boolean f0;
    public boolean g0;
    public boolean h;
    public final RectF h0;
    public final RectF[] i0;
    public final Paint[] j0;
    public volatile boolean k0;
    public volatile boolean l0;
    public volatile RLottieNative m0;
    public int[] n;
    public final boolean n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public int[] r;
    public final File r0;
    public final HashMap s;
    public final boolean s0;
    public Runnable t0;
    public final com.google.firebase.messaging.p u0;
    public final HashMap v;
    public final Runnable v0;
    public final HashMap w;
    public final Runnable w0;
    public HashMap x;
    public boolean x0;
    public boolean y;
    public final Runnable y0;
    public final Runnable z0;

    /* JADX WARN: Removed duplicated region for block: B:70:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xi0(File file, String str, int i10, int i11, b2.n1 n1Var, boolean z10, int i12, boolean z11) {
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
        this.K = 1;
        this.L = -1;
        this.d0 = 1.0f;
        this.e0 = 1.0f;
        this.h0 = new RectF();
        this.i0 = new RectF[2];
        this.j0 = new Paint[2];
        this.v0 = new wi0(this, 1);
        this.w0 = new wi0(this, 2);
        this.y0 = new wi0(this, 3);
        this.z0 = new wi0(this, 4);
        this.F0 = new wi0(this, 5);
        this.I0 = new pe.b(true);
        this.M0 = new a6(this, 2);
        this.b = i10;
        this.c = i11;
        this.b0 = z10;
        this.G = z11;
        boolean z12 = n1Var != null;
        this.s0 = z12;
        this.n0 = str == null && n1Var != null && n1Var.b;
        boolean z13 = n1Var != null && n1Var.c;
        this.c0 = z13;
        com.google.firebase.messaging.p pVar = new com.google.firebase.messaging.p();
        this.u0 = pVar;
        pVar.e = file.getAbsoluteFile();
        pVar.d = str;
        pVar.c = null;
        pVar.a = i12;
        getPaint().setFlags(2);
        if (str == null) {
            this.r0 = file;
        }
        if (z12 && T0 == null) {
            c10 = 1;
            T0 = new DispatchQueue("cache generator queue");
        } else {
            c10 = 1;
        }
        if (!z12) {
            this.m0 = RLottieNative.a(file.getAbsolutePath(), str, iArr, (int[]) pVar.c, i12, hashMap);
            if (this.m0 == null) {
                FileLog.d("RLottieDrawable nativePtr == 0 " + file.getAbsolutePath() + " remove file");
                file.delete();
            }
            if (!z10 || iArr[c10] >= 60) {
                return;
            }
            this.b0 = false;
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
                com.google.firebase.messaging.p pVar2 = this.u0;
                a2 = RLottieNative.a(absolutePath, str, iArr, (int[]) pVar2.c, pVar2.a, this.w);
                if (a2 != null) {
                    a2.d();
                }
                if (this.b0) {
                    this.b0 = false;
                }
                this.B0 = new yf.e(file, this, n1Var, i10, i11, !z10, i12);
            }
        } catch (Exception e7) {
            e = e7;
            FileLog.e((Throwable) e, false);
            String absolutePath2 = file.getAbsolutePath();
            com.google.firebase.messaging.p pVar22 = this.u0;
            a2 = RLottieNative.a(absolutePath2, str, iArr, (int[]) pVar22.c, pVar22.a, this.w);
            if (a2 != null) {
            }
            if (this.b0) {
            }
            this.B0 = new yf.e(file, this, n1Var, i10, i11, !z10, i12);
        }
        if (this.b0 && this.e[c10] < 60) {
            this.b0 = false;
        }
        this.B0 = new yf.e(file, this, n1Var, i10, i11, !z10, i12);
    }

    public static void d(xi0 xi0Var) {
        if (xi0Var.O != null) {
            yf.e.c();
            xi0Var.O = null;
        }
        xi0Var.x0 = false;
        xi0Var.p();
        Runnable runnable = xi0Var.A0;
        if (runnable != null) {
            runnable.run();
            xi0Var.A0 = null;
        }
    }

    public static void e(xi0 xi0Var) {
        if (xi0Var.l0 || xi0Var.V || !xi0Var.k() || xi0Var.O != null) {
            return;
        }
        xi0Var.x0 = true;
        if (T0 == null) {
            T0 = new DispatchQueue("cache generator queue");
        }
        yf.e.A++;
        DispatchQueue dispatchQueue = T0;
        wi0 wi0Var = new wi0(xi0Var, 0);
        xi0Var.O = wi0Var;
        dispatchQueue.postRunnable(wi0Var);
    }

    public static void f(xi0 xi0Var) {
        int i10;
        Bitmap createBitmap;
        boolean z10;
        try {
            i10 = xi0Var.j();
            if (i10 == 1) {
                if (xi0Var.S != null) {
                    createBitmap = xi0Var.S;
                    z10 = true;
                } else {
                    createBitmap = Bitmap.createBitmap(xi0Var.b, xi0Var.c, xi0Var.G ? Bitmap.Config.ALPHA_8 : Bitmap.Config.ARGB_8888);
                    xi0Var.S = createBitmap;
                    z10 = false;
                }
                int B = xi0Var.B(createBitmap, z10);
                if (B == 1) {
                    xi0Var.R = createBitmap;
                    xi0Var.i();
                }
                i10 = B;
            }
        } catch (Exception e) {
            FileLog.e(e);
            i10 = 2;
        }
        if (i10 == 1) {
            xi0Var.G0 = 0;
            AndroidUtilities.runOnUIThread(xi0Var.w0);
        } else if (i10 == 2) {
            AndroidUtilities.runOnUIThread(xi0Var.v0, xi0Var.G0);
            xi0Var.G0 = Math.min((Math.max(xi0Var.G0, 2) * 3) / 2, 2000);
        } else if (i10 == 3) {
            AndroidUtilities.runOnUIThread(xi0Var.v0);
        }
        CountDownLatch countDownLatch = xi0Var.U;
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
        xi0Var.m();
        if (xi0Var.O0) {
            xi0Var.N0 = true;
            xi0Var.x();
        }
    }

    public static void h(xi0 xi0Var) {
        xi0Var.X = true;
        if ((!xi0Var.k0 && xi0Var.W) || (xi0Var.Q == null && xi0Var.R != null)) {
            xi0Var.x();
        }
        xi0Var.p();
    }

    public final boolean A() {
        return this.a0 == this.e[0] - 1;
    }

    public int B(Bitmap bitmap, boolean z10) {
        RLottieNative b10;
        int c10;
        yf.e eVar;
        RLottieNative rLottieNative = this.m0;
        if (rLottieNative != null) {
            try {
                if (!this.v.isEmpty() || this.r != null) {
                    this.w.putAll(this.v);
                    int[] iArr = this.r;
                    if (iArr != null) {
                        this.u0.c = (int[]) iArr.clone();
                    }
                    com.google.firebase.messaging.p pVar = this.u0;
                    File file = (File) pVar.e;
                    if (file != null) {
                        String absolutePath = file.getAbsolutePath();
                        com.google.firebase.messaging.p pVar2 = this.u0;
                        b10 = RLottieNative.a(absolutePath, (String) pVar2.d, this.e, (int[]) pVar2.c, pVar2.a, this.w);
                    } else {
                        int i10 = pVar.b;
                        if (i10 == 0 || ((String) pVar.d) != null) {
                            b10 = RLottieNative.b((String) pVar.d, this.e, (int[]) pVar.c, this.w);
                        } else {
                            String readRes = AndroidUtilities.readRes(i10);
                            if (!TextUtils.isEmpty(readRes)) {
                                com.google.firebase.messaging.p pVar3 = this.u0;
                                pVar3.d = readRes;
                                b10 = RLottieNative.b(readRes, this.e, (int[]) pVar3.c, this.w);
                            }
                        }
                    }
                    if (b10 != null) {
                        this.m0 = b10;
                        rLottieNative.d();
                        this.v.clear();
                        this.r = null;
                    }
                }
            } catch (Exception unused) {
            }
        }
        RLottieNative rLottieNative2 = this.m0;
        int i11 = this.b0 ? 2 : 1;
        if (!this.s0 || (eVar = this.B0) == null) {
            c10 = rLottieNative2.c(this.a0, bitmap, z10);
        } else {
            c10 = 0;
            try {
                c10 = eVar.f(bitmap, this.a0 / i11);
                if (!this.B0.g() && this.E0 && this.m0 != null) {
                    this.m0.d();
                    this.m0 = null;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        yf.e eVar2 = this.B0;
        if (eVar2 != null && eVar2.g()) {
            if (!this.D0) {
                this.D0 = true;
                AndroidUtilities.runOnUIThread(this.y0);
            }
            c10 = -1;
            if (this.E0) {
                if (this.m0 == null) {
                    String file2 = ((File) this.u0.e).toString();
                    com.google.firebase.messaging.p pVar4 = this.u0;
                    this.m0 = RLottieNative.a(file2, (String) pVar4.d, null, (int[]) pVar4.c, pVar4.a, this.w);
                }
                if (this.m0 != null) {
                    c10 = this.m0.c(this.a0, bitmap, z10);
                }
            }
        }
        return c10 < 0 ? 2 : 1;
    }

    public void C(boolean z10) {
        this.k0 = false;
        this.l0 = true;
        l();
        n();
        if (this.P != null || this.O != null || this.x0) {
            this.V = true;
            return;
        }
        D(z10);
        yf.e eVar = this.B0;
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
            this.B0 = null;
        }
        E();
    }

    public void D(boolean z10) {
        RLottieNative rLottieNative = this.m0;
        this.m0 = null;
        if (rLottieNative != null) {
            bc0 bc0Var = new bc0(rLottieNative, 15);
            if (z10) {
                DispatchQueuePoolBackground.execute(bc0Var);
            } else {
                Utilities.globalQueue.postRunnable(bc0Var);
            }
        }
    }

    public final void E() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.Q);
        arrayList.add(this.S);
        arrayList.add(this.R);
        this.R = null;
        this.Q = null;
        this.S = null;
        AndroidUtilities.recycleBitmaps(arrayList);
        if (this.t0 != null) {
            this.t0 = null;
        }
    }

    public final void F(ImageReceiver imageReceiver) {
        pe.b bVar = this.I0;
        bVar.remove(imageReceiver);
        if (this.B0 == null || T0 == null || this.O == null) {
            return;
        }
        WeakReference weakReference = this.H0;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (bVar.isEmpty() && getCallback() == null) {
            if (view == null || !view.isAttachedToWindow()) {
                wi0 wi0Var = this.O;
                if (wi0Var != null) {
                    T0.cancelRunnable(wi0Var);
                    yf.e.c();
                    this.O = null;
                }
                this.x0 = false;
                this.D0 = false;
            }
        }
    }

    public final void G() {
        if (!this.Z && !this.k0 && this.W) {
            if (this.a0 <= 2) {
                this.a0 = 0;
            }
            this.N = false;
            this.X = false;
            if (!I()) {
                this.Y = true;
            }
        }
        x();
    }

    public final boolean H(boolean z10) {
        if (!z10 && ((this.K < 2 || this.M == 0) && this.L < 0)) {
            return false;
        }
        this.M = 0;
        this.K = 2;
        start();
        return true;
    }

    public final boolean I() {
        if (this.P != null || this.R != null || !k() || w() || this.V || this.l0) {
            return false;
        }
        if (!this.k0 && (!this.W || this.X)) {
            return false;
        }
        if (this.x0 && !this.E0) {
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
        Runnable runnable = this.F0;
        this.P = runnable;
        (this.b0 ? S0 : R0).execute(runnable);
        return true;
    }

    public final void J(boolean z10) {
        this.W = true;
        I();
    }

    public final void K(int i10) {
        if (this.K == 2 && i10 == 3 && this.a0 != 0) {
            return;
        }
        this.K = i10;
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
        if (this.a0 != i10 || z11) {
            this.a0 = i10;
            this.N = false;
            this.X = false;
            if (this.o0) {
                this.p0 = true;
                if (this.P != null) {
                    this.q0 = true;
                }
            }
            if ((!z10 || z11) && this.T && this.R != null) {
                this.S = this.R;
                this.R = null;
                this.P = null;
                this.T = false;
            }
            if (!z10 && this.P == null) {
                this.U = new CountDownLatch(1);
            }
            if (z11 && !this.k0) {
                this.k0 = true;
                l();
            }
            if (!I()) {
                this.Y = true;
            } else if (!z10) {
                try {
                    this.U.await();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                this.U = null;
            }
            invalidateSelf();
        }
    }

    public final void O(boolean z10) {
        WeakReference weakReference;
        Runnable runnable;
        WeakReference weakReference2;
        this.S = this.Q;
        this.Q = this.R;
        this.R = null;
        this.N0 = false;
        if (this.J == 2 && (weakReference2 = this.H) != null && this.a0 - 1 >= this.I) {
            Runnable runnable2 = (Runnable) weakReference2.get();
            if (runnable2 != null) {
                runnable2.run();
            }
            this.H = null;
        }
        if (this.N || (this.L == 0 && this.K == 1)) {
            stop();
        }
        this.P = null;
        if (this.q0) {
            this.q0 = false;
        } else if (this.p0) {
            this.p0 = false;
        }
        this.X = true;
        this.T = false;
        if (z10 && this.Y) {
            this.X = false;
            this.Y = false;
        }
        if (this.J == 0 && (weakReference = this.H) != null && this.a0 >= this.I && (runnable = (Runnable) weakReference.get()) != null) {
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

    public final void R(View view) {
        this.H0 = new WeakReference(view);
    }

    public final void S(int i10, Runnable runnable) {
        if (runnable != null) {
            this.H = new WeakReference(runnable);
            this.I = i10;
        } else if (this.H != null) {
            this.H = null;
        }
    }

    public final void T(float f7, boolean z10) {
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        N((int) (this.e[0] * f7), z10, false);
    }

    public final void U(long j3) {
        int i10;
        int[] iArr = this.e;
        if (iArr[0] == 0 || (i10 = iArr[1]) == 0) {
            return;
        }
        N(Math.round(Math.max(0L, j3) / (1000.0f / i10)) % iArr[0], true, true);
    }

    public final void V(long j3) {
        Integer num;
        this.K0 = 0;
        if (this.L0) {
            this.L0 = false;
            l();
        }
        boolean z10 = this.N0 || (!this.k0 && this.W);
        if (!this.k0) {
            if ((this.Y || (this.W && z10)) && this.R != null) {
                O(true);
                return;
            }
            return;
        }
        if (this.Q == null && this.R == null) {
            I();
            return;
        }
        if (this.R != null) {
            if (this.Q == null || (z10 && !this.a)) {
                HashMap hashMap = this.x;
                if (hashMap != null && this.E && (num = (Integer) hashMap.get(Integer.valueOf(this.a0 - 1))) != null) {
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

    @Override // yf.c
    public final int a(Bitmap bitmap) {
        RLottieNative rLottieNative = this.J0;
        if (rLottieNative == null) {
            return -1;
        }
        int i10 = this.C0;
        if (i10 >= rLottieNative.a[0]) {
            return 0;
        }
        int i11 = this.b0 ? 2 : 1;
        if (rLottieNative.c(i10, bitmap, true) != -5) {
            this.C0 += i11;
            return 1;
        }
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a(bitmap);
    }

    @Override // yf.c
    public final void b() {
        File file;
        com.google.firebase.messaging.p pVar = this.u0;
        File file2 = (File) pVar.e;
        RLottieNative a2 = RLottieNative.a(file2 != null ? file2.toString() : null, (String) pVar.d, this.c0 ? this.e : null, (int[]) pVar.c, pVar.a, this.w);
        this.J0 = a2;
        this.C0 = 0;
        if (a2 != null || (file = this.r0) == null) {
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
        int i10 = this.b0 ? 2 : 1;
        int i11 = this.f;
        if (i11 >= 0 && this.h) {
            int i12 = this.a0;
            if (i12 > i11) {
                int i13 = i12 - i10;
                if (i13 >= i11) {
                    this.a0 = i13;
                    this.N = false;
                    return;
                }
                this.N = true;
                Runnable runnable = this.t0;
                if (runnable != null) {
                    runnable.run();
                    this.t0 = null;
                    return;
                }
                return;
            }
            int i14 = i12 + i10;
            if (i14 < i11) {
                this.a0 = i14;
                this.N = false;
                return;
            }
            this.N = true;
            Runnable runnable2 = this.t0;
            if (runnable2 != null) {
                runnable2.run();
                this.t0 = null;
                return;
            }
            return;
        }
        int i15 = this.a0 + i10;
        if (i11 < 0) {
            i11 = this.e[0];
        }
        if (i15 < i11) {
            if (this.K == 3) {
                this.N = true;
                this.M++;
                return;
            } else {
                this.a0 = i15;
                this.N = false;
                return;
            }
        }
        int i16 = this.K;
        if (i16 == 1) {
            this.a0 = 0;
            this.N = false;
            if (this.y) {
                this.x = null;
                this.y = false;
            }
            int i17 = this.L;
            if (i17 > 0) {
                this.L = i17 - 1;
                return;
            }
            return;
        }
        if (i16 != 2) {
            this.N = true;
            Runnable runnable3 = this.t0;
            if (runnable3 != null) {
                runnable3.run();
                this.t0 = null;
                return;
            }
            return;
        }
        this.a0 = 0;
        this.N = true;
        this.M++;
        if (this.y) {
            this.x = null;
            this.y = false;
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.k0;
    }

    public int j() {
        if (this.l0) {
            return 3;
        }
        if (!k()) {
            return 2;
        }
        if (this.m0 != null || !this.d) {
            return 1;
        }
        String readRes = AndroidUtilities.readRes(this.u0.b);
        if (TextUtils.isEmpty(readRes)) {
            return 2;
        }
        this.m0 = RLottieNative.b(readRes, this.e, (int[]) this.u0.c, this.w);
        this.d = false;
        return 1;
    }

    public final boolean k() {
        return this.s0 ? this.B0 != null || this.n0 : this.m0 != null || this.d;
    }

    public final void l() {
        AndroidUtilities.executeOnUIThread(new wi0(this, 6));
    }

    public final void m() {
        if (!this.k0 || this.L0) {
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
        int round = Math.round((this.e[1] / (this.b0 ? 2.0f : 1.0f)) * this.F);
        if (round > 0) {
            if (this.e[0] == 1 && this.J == 0) {
                return;
            }
            this.O0 = true;
            this.K0 = 0;
            yf.h.d().b(this.M0, round);
            x();
        }
    }

    public final void n() {
        wi0 wi0Var = this.O;
        if (wi0Var != null) {
            T0.cancelRunnable(wi0Var);
            yf.e.c();
            this.O = null;
        }
        if (v() || this.R == null || this.P == null) {
            return;
        }
        this.P = null;
        this.R = null;
    }

    public final void o() {
        if (this.Z) {
            this.Z = false;
            if (!this.k0 && this.W) {
                if (this.a0 <= 2) {
                    this.a0 = 0;
                }
                this.N = false;
                this.X = false;
                if (!I()) {
                    this.Y = true;
                }
            }
            x();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f0 = true;
    }

    public void p() {
        if (this.V) {
            n();
            if (this.P == null && this.O == null && this.m0 != null) {
                D(true);
            }
        }
        if ((this.m0 == null || this.n0) && this.B0 == null) {
            E();
            return;
        }
        this.T = true;
        if (!v()) {
            stop();
        }
        if (this.k0) {
            I();
        }
    }

    public final void q(Canvas canvas, Paint paint, boolean z10, long j3, int i10) {
        float width;
        boolean z11;
        float f7;
        if (!k() || this.V) {
            return;
        }
        if (!z10) {
            V(j3);
        }
        RectF rectF = z10 ? this.i0[i10] : this.h0;
        if (paint == null) {
            paint = z10 ? this.j0[i10] : getPaint();
        }
        if (paint.getAlpha() == 0 || this.p0 || this.Q == null) {
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
            if (this.f0) {
                this.d0 = rectF.width() / this.b;
                this.e0 = rectF.height() / this.c;
                this.f0 = false;
                if (Math.abs(rectF.width() - this.b) < AndroidUtilities.dp(1.0f) && Math.abs(rectF.height() - this.c) < AndroidUtilities.dp(1.0f)) {
                    z12 = false;
                }
                this.g0 = z12;
            }
            width = this.d0;
            f7 = this.e0;
            z11 = this.g0;
        }
        if (!z11) {
            canvas.drawBitmap(this.Q, rectF.left, rectF.top, paint);
            return;
        }
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        canvas.scale(width, f7);
        canvas.drawBitmap(this.Q, 0.0f, 0.0f, paint);
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
        if (this.k0) {
            return;
        }
        if ((this.K < 2 || this.M == 0) && this.f != this.a0) {
            this.k0 = true;
            this.L0 = false;
            if (this.o0) {
                this.p0 = true;
                if (this.P != null) {
                    this.q0 = true;
                }
            }
            I();
            x();
            l();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.k0 = false;
        l();
    }

    public final float t() {
        return this.a0 / this.e[0];
    }

    public final boolean u() {
        if (this.l0) {
            return false;
        }
        return ((this.Q == null && this.R == null) || this.p0) ? false : true;
    }

    public final boolean v() {
        if (!this.I0.isEmpty()) {
            return true;
        }
        WeakReference weakReference = this.H0;
        return ((weakReference == null || weakReference.get() == null) && getCallback() == null) ? false : true;
    }

    public boolean w() {
        return this.Q != null && this.e[0] == 1;
    }

    public final void x() {
        if (this.l0) {
            return;
        }
        Iterator it = this.I0.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
        WeakReference weakReference = this.H0;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            view.invalidate();
        }
        if (getCallback() != null) {
            invalidateSelf();
        }
    }

    public final boolean y() {
        return this.O != null;
    }

    public boolean z() {
        return true;
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
        this.K = 1;
        this.L = -1;
        this.d0 = 1.0f;
        this.e0 = 1.0f;
        this.h0 = new RectF();
        this.i0 = new RectF[2];
        this.j0 = new Paint[2];
        this.v0 = new wi0(this, 1);
        this.w0 = new wi0(this, 2);
        this.y0 = new wi0(this, 3);
        this.z0 = new wi0(this, 4);
        this.F0 = new wi0(this, 5);
        this.I0 = new pe.b(true);
        this.M0 = new a6(this, 2);
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
        this.K = 1;
        this.L = -1;
        this.d0 = 1.0f;
        this.e0 = 1.0f;
        this.h0 = new RectF();
        this.i0 = new RectF[2];
        this.j0 = new Paint[2];
        this.v0 = new wi0(this, 1);
        this.w0 = new wi0(this, 2);
        this.y0 = new wi0(this, 3);
        this.z0 = new wi0(this, 4);
        this.F0 = new wi0(this, 5);
        this.I0 = new pe.b(true);
        this.M0 = new a6(this, 2);
        this.b = i11;
        this.c = i12;
        this.K = 0;
        getPaint().setFlags(2);
        com.google.firebase.messaging.p pVar = new com.google.firebase.messaging.p();
        this.u0 = pVar;
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
                this.u0 = null;
                return;
            } else {
                pVar.d = readRes;
                this.m0 = RLottieNative.b(readRes, iArr2, (int[]) pVar.c, hashMap);
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
