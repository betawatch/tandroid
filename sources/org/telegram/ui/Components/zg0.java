package org.telegram.ui.Components;

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
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public class zg0 extends BitmapDrawable implements Animatable, bg.g {
    public static final AtomicInteger P0 = new AtomicInteger();
    public static final AtomicInteger Q0 = new AtomicInteger();
    public static final ExecutorService R0 = Executors.newFixedThreadPool(4, new h2.l0(2));
    public static final ExecutorService S0 = Executors.newFixedThreadPool(2, new h2.l0(3));
    public static org.telegram.messenger.q5 T0;
    public Runnable A0;
    public bg.i B0;
    public int C0;
    public boolean D;
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
    public final xe.b I0;
    public int J;
    public RLottieNative J0;
    public int K;
    public int K0;
    public int L;
    public volatile boolean L0;
    public int M;
    public final u5 M0;
    public volatile boolean N;
    public boolean N0;
    public yg0 O;
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
    public final ab.v u0;
    public final Runnable v0;
    public final HashMap w;
    public final Runnable w0;
    public final HashMap x;
    public boolean x0;
    public HashMap y;
    public final Runnable y0;
    public final Runnable z0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0190  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zg0(File file, String str, int i7, int i10, bg.f fVar, boolean z9, int i11, boolean z10) {
        boolean z11;
        char c10;
        RLottieNative a10;
        int[] iArr = new int[3];
        this.e = iArr;
        this.f = -1;
        this.s = new HashMap();
        this.w = new HashMap();
        HashMap hashMap = new HashMap();
        this.x = hashMap;
        this.D = false;
        this.E = true;
        this.F = 1.0f;
        this.K = 1;
        this.L = -1;
        this.d0 = 1.0f;
        this.e0 = 1.0f;
        this.h0 = new RectF();
        this.i0 = new RectF[2];
        this.j0 = new Paint[2];
        this.v0 = new yg0(this, 1);
        this.w0 = new yg0(this, 2);
        this.y0 = new yg0(this, 3);
        this.z0 = new yg0(this, 4);
        this.F0 = new yg0(this, 5);
        this.I0 = new xe.b(true, true);
        this.M0 = new u5(this, 2);
        this.b = i7;
        this.c = i10;
        this.b0 = z9;
        this.G = z10;
        boolean z12 = fVar != null;
        this.s0 = z12;
        this.n0 = str == null && fVar != null && fVar.b;
        boolean z13 = fVar != null && fVar.c;
        this.c0 = z13;
        ab.v vVar = new ab.v();
        this.u0 = vVar;
        vVar.e = file.getAbsoluteFile();
        vVar.d = str;
        vVar.c = null;
        vVar.a = i11;
        getPaint().setFlags(2);
        if (str == null) {
            this.r0 = file;
        }
        if (z12 && T0 == null) {
            z11 = 0;
            T0 = new org.telegram.messenger.q5("cache generator queue", true);
        } else {
            z11 = 0;
        }
        if (!z12) {
            this.m0 = RLottieNative.a(file.getAbsolutePath(), str, iArr, (int[]) vVar.c, i11, hashMap);
            if (this.m0 == null) {
                org.telegram.messenger.a8.b("RLottieDrawable nativePtr == 0 " + file.getAbsolutePath() + " remove file");
                file.delete();
            }
            if (!z9 || iArr[1] >= 60) {
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
                    c10 = 1;
                    double d2 = 30.0d;
                    double d10 = 0.0d;
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
                                    d10 = jsonReader.nextDouble();
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else if (nextName.equals("fr")) {
                                d2 = jsonReader.nextDouble();
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
                    iArr[z11] = (int) (d - d10);
                    iArr[1] = (int) d2;
                } catch (Throwable th5) {
                    th = th5;
                    c10 = 1;
                }
            } catch (Exception e10) {
                e = e10;
                c10 = 1;
                org.telegram.messenger.a8.g(e, z11);
                String absolutePath = file.getAbsolutePath();
                ab.v vVar2 = this.u0;
                a10 = RLottieNative.a(absolutePath, str, iArr, (int[]) vVar2.c, vVar2.a, this.x);
                if (a10 != null) {
                    a10.d();
                }
                if (this.b0) {
                    this.b0 = false;
                }
                this.B0 = new bg.i(file, this, fVar, i7, i10, !z9, i11);
            }
        } catch (Exception e11) {
            e = e11;
            org.telegram.messenger.a8.g(e, z11);
            String absolutePath2 = file.getAbsolutePath();
            ab.v vVar22 = this.u0;
            a10 = RLottieNative.a(absolutePath2, str, iArr, (int[]) vVar22.c, vVar22.a, this.x);
            if (a10 != null) {
            }
            if (this.b0) {
            }
            this.B0 = new bg.i(file, this, fVar, i7, i10, !z9, i11);
        }
        if (this.b0 && this.e[c10] < 60) {
            this.b0 = false;
        }
        this.B0 = new bg.i(file, this, fVar, i7, i10, !z9, i11);
    }

    public static void d(zg0 zg0Var) {
        if (zg0Var.O != null) {
            bg.i.c();
            zg0Var.O = null;
        }
        zg0Var.x0 = false;
        zg0Var.p();
        Runnable runnable = zg0Var.A0;
        if (runnable != null) {
            runnable.run();
            zg0Var.A0 = null;
        }
    }

    public static void e(zg0 zg0Var) {
        if (zg0Var.l0 || zg0Var.V || !zg0Var.k() || zg0Var.O != null) {
            return;
        }
        zg0Var.x0 = true;
        if (T0 == null) {
            T0 = new org.telegram.messenger.q5("cache generator queue", true);
        }
        bg.i.A++;
        org.telegram.messenger.q5 q5Var = T0;
        yg0 yg0Var = new yg0(zg0Var, 0);
        zg0Var.O = yg0Var;
        q5Var.postRunnable(yg0Var);
    }

    public static void f(zg0 zg0Var) {
        int i7;
        Bitmap createBitmap;
        boolean z9;
        try {
            i7 = zg0Var.j();
            if (i7 == 1) {
                if (zg0Var.S != null) {
                    createBitmap = zg0Var.S;
                    z9 = true;
                } else {
                    createBitmap = Bitmap.createBitmap(zg0Var.b, zg0Var.c, zg0Var.G ? Bitmap.Config.ALPHA_8 : Bitmap.Config.ARGB_8888);
                    zg0Var.S = createBitmap;
                    z9 = false;
                }
                int B = zg0Var.B(createBitmap, z9);
                if (B == 1) {
                    zg0Var.R = createBitmap;
                    zg0Var.i();
                }
                i7 = B;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            i7 = 2;
        }
        if (i7 == 1) {
            zg0Var.G0 = 0;
            org.telegram.messenger.g0.h3(zg0Var.w0);
        } else if (i7 == 2) {
            org.telegram.messenger.g0.i3(zg0Var.v0, zg0Var.G0);
            zg0Var.G0 = Math.min((Math.max(zg0Var.G0, 2) * 3) / 2, 2000);
        } else if (i7 == 3) {
            org.telegram.messenger.g0.h3(zg0Var.v0);
        }
        CountDownLatch countDownLatch = zg0Var.U;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static void g(zg0 zg0Var) {
        int i7 = zg0Var.K0 + 1;
        zg0Var.K0 = i7;
        if (i7 > 10) {
            zg0Var.L0 = true;
        }
        zg0Var.m();
        if (zg0Var.O0) {
            zg0Var.N0 = true;
            zg0Var.x();
        }
    }

    public static void h(zg0 zg0Var) {
        zg0Var.X = true;
        if ((!zg0Var.k0 && zg0Var.W) || (zg0Var.Q == null && zg0Var.R != null)) {
            zg0Var.x();
        }
        zg0Var.p();
    }

    public final boolean A() {
        return this.a0 == this.e[0] - 1;
    }

    public int B(Bitmap bitmap, boolean z9) {
        RLottieNative b10;
        int c10;
        bg.i iVar;
        RLottieNative rLottieNative = this.m0;
        if (rLottieNative != null) {
            try {
                if (!this.w.isEmpty() || this.r != null) {
                    this.x.putAll(this.w);
                    int[] iArr = this.r;
                    if (iArr != null) {
                        this.u0.c = (int[]) iArr.clone();
                    }
                    ab.v vVar = this.u0;
                    File file = (File) vVar.e;
                    if (file != null) {
                        String absolutePath = file.getAbsolutePath();
                        ab.v vVar2 = this.u0;
                        b10 = RLottieNative.a(absolutePath, (String) vVar2.d, this.e, (int[]) vVar2.c, vVar2.a, this.x);
                    } else {
                        int i7 = vVar.b;
                        if (i7 == 0 || ((String) vVar.d) != null) {
                            b10 = RLottieNative.b((String) vVar.d, this.e, (int[]) vVar.c, this.x);
                        } else {
                            String y22 = org.telegram.messenger.g0.y2(null, i7);
                            if (!TextUtils.isEmpty(y22)) {
                                ab.v vVar3 = this.u0;
                                vVar3.d = y22;
                                b10 = RLottieNative.b(y22, this.e, (int[]) vVar3.c, this.x);
                            }
                        }
                    }
                    if (b10 != null) {
                        this.m0 = b10;
                        rLottieNative.d();
                        this.w.clear();
                        this.r = null;
                    }
                }
            } catch (Exception unused) {
            }
        }
        RLottieNative rLottieNative2 = this.m0;
        int i10 = this.b0 ? 2 : 1;
        if (!this.s0 || (iVar = this.B0) == null) {
            c10 = rLottieNative2.c(this.a0, bitmap, z9);
        } else {
            c10 = 0;
            try {
                c10 = iVar.f(this.a0 / i10, bitmap);
                if (!this.B0.g() && this.E0 && this.m0 != null) {
                    this.m0.d();
                    this.m0 = null;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        bg.i iVar2 = this.B0;
        if (iVar2 != null && iVar2.g()) {
            if (!this.D0) {
                this.D0 = true;
                org.telegram.messenger.g0.h3(this.y0);
            }
            c10 = -1;
            if (this.E0) {
                if (this.m0 == null) {
                    String file2 = ((File) this.u0.e).toString();
                    ab.v vVar4 = this.u0;
                    this.m0 = RLottieNative.a(file2, (String) vVar4.d, null, (int[]) vVar4.c, vVar4.a, this.x);
                }
                if (this.m0 != null) {
                    c10 = this.m0.c(this.a0, bitmap, z9);
                }
            }
        }
        return c10 < 0 ? 2 : 1;
    }

    public void C(boolean z9) {
        this.k0 = false;
        this.l0 = true;
        l();
        n();
        if (this.P != null || this.O != null || this.x0) {
            this.V = true;
            return;
        }
        D(z9);
        bg.i iVar = this.B0;
        if (iVar != null) {
            RandomAccessFile randomAccessFile = iVar.s;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
                iVar.s = null;
            }
            iVar.r = true;
            this.B0 = null;
        }
        E();
    }

    public void D(boolean z9) {
        RLottieNative rLottieNative = this.m0;
        this.m0 = null;
        if (rLottieNative != null) {
            ob0 ob0Var = new ob0(rLottieNative, 10);
            if (z9) {
                org.telegram.messenger.r5.a(ob0Var);
            } else {
                Utilities.e.c(ob0Var);
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
        org.telegram.messenger.g0.A2(arrayList);
        if (this.t0 != null) {
            this.t0 = null;
        }
    }

    public final void F(ImageReceiver imageReceiver) {
        xe.b bVar = this.I0;
        bVar.remove(imageReceiver);
        if (this.B0 == null || T0 == null || this.O == null) {
            return;
        }
        WeakReference weakReference = this.H0;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (bVar.isEmpty() && getCallback() == null) {
            if (view == null || !view.isAttachedToWindow()) {
                yg0 yg0Var = this.O;
                if (yg0Var != null) {
                    T0.cancelRunnable(yg0Var);
                    bg.i.c();
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

    public final boolean H(boolean z9) {
        if (!z9 && ((this.K < 2 || this.M == 0) && this.L < 0)) {
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
            this.w.putAll(this.s);
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

    public final void J(boolean z9) {
        this.W = true;
        I();
    }

    public final void K(int i7) {
        if (this.K == 2 && i7 == 3 && this.a0 != 0) {
            return;
        }
        this.K = i7;
    }

    public final void L() {
        N(85, false, false);
    }

    public final void M(int i7) {
        N(i7, true, false);
    }

    public final void N(int i7, boolean z9, boolean z10) {
        if (i7 < 0 || i7 > this.e[0]) {
            return;
        }
        if (this.a0 != i7 || z10) {
            this.a0 = i7;
            this.N = false;
            this.X = false;
            if (this.o0) {
                this.p0 = true;
                if (this.P != null) {
                    this.q0 = true;
                }
            }
            if ((!z9 || z10) && this.T && this.R != null) {
                this.S = this.R;
                this.R = null;
                this.P = null;
                this.T = false;
            }
            if (!z9 && this.P == null) {
                this.U = new CountDownLatch(1);
            }
            if (z10 && !this.k0) {
                this.k0 = true;
                l();
            }
            if (!I()) {
                this.Y = true;
            } else if (!z9) {
                try {
                    this.U.await();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                this.U = null;
            }
            invalidateSelf();
        }
    }

    public final void O(boolean z9) {
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
        if (z9 && this.Y) {
            this.X = false;
            this.Y = false;
        }
        if (this.J == 0 && (weakReference = this.H) != null && this.a0 >= this.I && (runnable = (Runnable) weakReference.get()) != null) {
            runnable.run();
        }
        I();
    }

    public final boolean P(int i7) {
        if (this.f == i7 || i7 > this.e[0]) {
            return false;
        }
        this.f = i7;
        return true;
    }

    public final void Q(int i7, String str) {
        this.s.put(str, Integer.valueOf(i7));
        G();
    }

    public final void R(View view) {
        this.H0 = new WeakReference(view);
    }

    public final void S(int i7, Runnable runnable) {
        if (runnable != null) {
            this.H = new WeakReference(runnable);
            this.I = i7;
        } else if (this.H != null) {
            this.H = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000b, code lost:
    
        if (r4 > 1.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(boolean z9, float f10) {
        float f11 = f10 >= 0.0f ? 1.0f : 0.0f;
        f10 = f11;
        N((int) (this.e[0] * f10), z9, false);
    }

    public final void U(long j3) {
        int i7;
        int[] iArr = this.e;
        if (iArr[0] == 0 || (i7 = iArr[1]) == 0) {
            return;
        }
        N(Math.round(Math.max(0L, j3) / (1000.0f / i7)) % iArr[0], true, true);
    }

    public final void V(long j3) {
        Integer num;
        this.K0 = 0;
        if (this.L0) {
            this.L0 = false;
            l();
        }
        boolean z9 = this.N0 || (!this.k0 && this.W);
        if (!this.k0) {
            if ((this.Y || (this.W && z9)) && this.R != null) {
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
            if (this.Q == null || (z9 && !this.a)) {
                HashMap hashMap = this.y;
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

    @Override // bg.g
    public final int a(Bitmap bitmap) {
        RLottieNative rLottieNative = this.J0;
        if (rLottieNative == null) {
            return -1;
        }
        int i7 = this.C0;
        if (i7 >= rLottieNative.a[0]) {
            return 0;
        }
        int i10 = this.b0 ? 2 : 1;
        if (rLottieNative.c(i7, bitmap, true) == -5) {
            return -1;
        }
        this.C0 += i10;
        return 1;
    }

    @Override // bg.g
    public final void b() {
        File file;
        ab.v vVar = this.u0;
        File file2 = (File) vVar.e;
        RLottieNative a10 = RLottieNative.a(file2 != null ? file2.toString() : null, (String) vVar.d, this.c0 ? this.e : null, (int[]) vVar.c, vVar.a, this.x);
        this.J0 = a10;
        this.C0 = 0;
        if (a10 != null || (file = this.r0) == null) {
            return;
        }
        file.delete();
    }

    @Override // bg.g
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
        int i7 = this.b0 ? 2 : 1;
        int i10 = this.f;
        if (i10 >= 0 && this.h) {
            int i11 = this.a0;
            if (i11 > i10) {
                int i12 = i11 - i7;
                if (i12 >= i10) {
                    this.a0 = i12;
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
            int i13 = i11 + i7;
            if (i13 < i10) {
                this.a0 = i13;
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
        int i14 = this.a0 + i7;
        if (i10 < 0) {
            i10 = this.e[0];
        }
        if (i14 < i10) {
            if (this.K == 3) {
                this.N = true;
                this.M++;
                return;
            } else {
                this.a0 = i14;
                this.N = false;
                return;
            }
        }
        int i15 = this.K;
        if (i15 == 1) {
            this.a0 = 0;
            this.N = false;
            if (this.D) {
                this.y = null;
                this.D = false;
            }
            int i16 = this.L;
            if (i16 > 0) {
                this.L = i16 - 1;
                return;
            }
            return;
        }
        if (i15 != 2) {
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
        if (this.D) {
            this.y = null;
            this.D = false;
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
        String y22 = org.telegram.messenger.g0.y2(null, this.u0.b);
        if (TextUtils.isEmpty(y22)) {
            return 2;
        }
        this.m0 = RLottieNative.b(y22, this.e, (int[]) this.u0.c, this.x);
        this.d = false;
        return 1;
    }

    public final boolean k() {
        return this.s0 ? this.B0 != null || this.n0 : this.m0 != null || this.d;
    }

    public final void l() {
        yg0 yg0Var = new yg0(this, 6);
        Typeface typeface = org.telegram.messenger.g0.a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.g0.h3(yg0Var);
        } else {
            yg0Var.run();
        }
    }

    public final void m() {
        if (!this.k0 || this.L0) {
            if (this.O0) {
                this.O0 = false;
                this.K0 = 0;
                bg.k.d().g(this.M0);
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
            bg.k.d().b(this.M0, round);
            x();
        }
    }

    public final void n() {
        yg0 yg0Var = this.O;
        if (yg0Var != null) {
            T0.cancelRunnable(yg0Var);
            bg.i.c();
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

    public final void q(Canvas canvas, Paint paint, boolean z9, long j3, int i7) {
        float width;
        boolean z10;
        float f10;
        if (!k() || this.V) {
            return;
        }
        if (!z9) {
            V(j3);
        }
        RectF rectF = z9 ? this.i0[i7] : this.h0;
        if (paint == null) {
            paint = z9 ? this.j0[i7] : getPaint();
        }
        if (paint.getAlpha() == 0 || this.p0 || this.Q == null) {
            return;
        }
        boolean z11 = true;
        if (z9) {
            width = rectF.width() / this.b;
            float height = rectF.height() / this.c;
            if (Math.abs(rectF.width() - this.b) < org.telegram.messenger.g0.L(1.0f) && Math.abs(rectF.height() - this.c) < org.telegram.messenger.g0.L(1.0f)) {
                z11 = false;
            }
            z10 = z11;
            f10 = height;
        } else {
            rectF.set(getBounds());
            if (this.f0) {
                this.d0 = rectF.width() / this.b;
                this.e0 = rectF.height() / this.c;
                this.f0 = false;
                if (Math.abs(rectF.width() - this.b) < org.telegram.messenger.g0.L(1.0f) && Math.abs(rectF.height() - this.c) < org.telegram.messenger.g0.L(1.0f)) {
                    z11 = false;
                }
                this.g0 = z11;
            }
            width = this.d0;
            f10 = this.e0;
            z10 = this.g0;
        }
        if (!z10) {
            canvas.drawBitmap(this.Q, rectF.left, rectF.top, paint);
            return;
        }
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        canvas.scale(width, f10);
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

    public zg0(int i7, int i10) {
        this.e = new int[3];
        this.f = -1;
        this.s = new HashMap();
        this.w = new HashMap();
        this.x = new HashMap();
        this.D = false;
        this.E = true;
        this.F = 1.0f;
        this.K = 1;
        this.L = -1;
        this.d0 = 1.0f;
        this.e0 = 1.0f;
        this.h0 = new RectF();
        this.i0 = new RectF[2];
        this.j0 = new Paint[2];
        this.v0 = new yg0(this, 1);
        this.w0 = new yg0(this, 2);
        this.y0 = new yg0(this, 3);
        this.z0 = new yg0(this, 4);
        this.F0 = new yg0(this, 5);
        this.I0 = new xe.b(true, true);
        this.M0 = new u5(this, 2);
        this.b = i7;
        this.c = i10;
        this.G = false;
    }

    public zg0(int i7, int i10, int i11) {
        this(i7, i10, i11, true, null);
    }

    public zg0(int i7, int i10, int i11, boolean z9, int[] iArr) {
        long j3;
        this.e = new int[3];
        this.f = -1;
        this.s = new HashMap();
        this.w = new HashMap();
        this.x = new HashMap();
        this.D = false;
        this.E = true;
        this.F = 1.0f;
        this.K = 1;
        this.L = -1;
        this.d0 = 1.0f;
        this.e0 = 1.0f;
        this.h0 = new RectF();
        this.i0 = new RectF[2];
        this.j0 = new Paint[2];
        this.v0 = new yg0(this, 1);
        this.w0 = new yg0(this, 2);
        this.y0 = new yg0(this, 3);
        this.z0 = new yg0(this, 4);
        this.F0 = new yg0(this, 5);
        this.I0 = new xe.b(true, true);
        this.M0 = new u5(this, 2);
        this.b = i10;
        this.c = i11;
        this.K = 0;
        getPaint().setFlags(2);
        ab.v vVar = new ab.v();
        this.u0 = vVar;
        vVar.c = iArr == null ? null : (int[]) iArr.clone();
        long[] jArr = org.telegram.messenger.ut.a;
        int length = jArr.length - 1;
        int i12 = 0;
        while (true) {
            if (i12 > length) {
                j3 = -1;
                break;
            }
            int i13 = (i12 + length) >>> 1;
            j3 = jArr[i13];
            int i14 = (int) (j3 >>> 32);
            if (i14 >= i7) {
                if (i14 <= i7) {
                    break;
                } else {
                    length = i13 - 1;
                }
            } else {
                i12 = i13 + 1;
            }
        }
        if (j3 != -1) {
            this.d = true;
            this.u0.b = i7;
            this.G = (8388608 & j3) != 0;
            int[] iArr2 = this.e;
            iArr2[0] = (int) (8388607 & j3);
            iArr2[1] = (int) ((j3 >>> 24) & 255);
        } else {
            this.G = false;
            String y22 = org.telegram.messenger.g0.y2(null, i7);
            if (TextUtils.isEmpty(y22)) {
                this.u0 = null;
                return;
            } else {
                ab.v vVar2 = this.u0;
                vVar2.d = y22;
                this.m0 = RLottieNative.b(y22, this.e, (int[]) vVar2.c, this.x);
            }
        }
        if (this.G) {
            setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        if (z9) {
            J(true);
        }
    }
}
