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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class ch0 extends BitmapDrawable implements Animatable, bg.g {
    public static final AtomicInteger Q0 = new AtomicInteger();
    public static final AtomicInteger R0 = new AtomicInteger();
    public static final ExecutorService S0 = Executors.newFixedThreadPool(4, new ai.y0(2));
    public static final ExecutorService T0 = Executors.newFixedThreadPool(2, new ai.y0(3));
    public static org.telegram.messenger.q5 U0;
    public final Runnable A0;
    public Runnable B0;
    public bg.i C0;
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
    public final xe.b J0;
    public int K;
    public RLottieNative K0;
    public int L;
    public int L0;
    public int M;
    public volatile boolean M0;
    public int N;
    public final s5 N0;
    public volatile boolean O;
    public boolean O0;
    public bh0 P;
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
    public final ab.v v0;
    public final HashMap w;
    public final Runnable w0;
    public final HashMap x;
    public final Runnable x0;
    public HashMap y;
    public boolean y0;
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
    public ch0(File file, String str, int i7, int i10, bg.f fVar, boolean z10, int i11, boolean z11) {
        boolean z12;
        char c10;
        RLottieNative a10;
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
        this.L = 1;
        this.M = -1;
        this.e0 = 1.0f;
        this.f0 = 1.0f;
        this.i0 = new RectF();
        this.j0 = new RectF[2];
        this.k0 = new Paint[2];
        this.w0 = new bh0(this, 1);
        this.x0 = new bh0(this, 2);
        this.z0 = new bh0(this, 3);
        this.A0 = new bh0(this, 4);
        this.G0 = new bh0(this, 5);
        this.J0 = new xe.b(true, true);
        this.N0 = new s5(this, 2);
        this.b = i7;
        this.c = i10;
        this.c0 = z10;
        this.H = z11;
        boolean z13 = fVar != null;
        this.t0 = z13;
        this.o0 = str == null && fVar != null && fVar.b;
        boolean z14 = fVar != null && fVar.c;
        this.d0 = z14;
        ab.v vVar = new ab.v();
        this.v0 = vVar;
        vVar.e = file.getAbsoluteFile();
        vVar.d = str;
        vVar.c = null;
        vVar.a = i11;
        getPaint().setFlags(2);
        if (str == null) {
            this.s0 = file;
        }
        if (z13 && U0 == null) {
            z12 = 0;
            U0 = new org.telegram.messenger.q5("cache generator queue", true);
        } else {
            z12 = 0;
        }
        if (!z13) {
            this.n0 = RLottieNative.a(file.getAbsolutePath(), str, iArr, (int[]) vVar.c, i11, hashMap);
            if (this.n0 == null) {
                org.telegram.messenger.a8.b("RLottieDrawable nativePtr == 0 " + file.getAbsolutePath() + " remove file");
                file.delete();
            }
            if (!z10 || iArr[1] >= 60) {
                return;
            }
            this.c0 = false;
            return;
        }
        if (z14) {
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
                    iArr[z12] = (int) (d - d10);
                    iArr[1] = (int) d2;
                } catch (Throwable th5) {
                    th = th5;
                    c10 = 1;
                }
            } catch (Exception e10) {
                e = e10;
                c10 = 1;
                org.telegram.messenger.a8.g(e, z12);
                String absolutePath = file.getAbsolutePath();
                ab.v vVar2 = this.v0;
                a10 = RLottieNative.a(absolutePath, str, iArr, (int[]) vVar2.c, vVar2.a, this.x);
                if (a10 != null) {
                    a10.d();
                }
                if (this.c0) {
                    this.c0 = false;
                }
                this.C0 = new bg.i(file, this, fVar, i7, i10, !z10, i11);
            }
        } catch (Exception e11) {
            e = e11;
            org.telegram.messenger.a8.g(e, z12);
            String absolutePath2 = file.getAbsolutePath();
            ab.v vVar22 = this.v0;
            a10 = RLottieNative.a(absolutePath2, str, iArr, (int[]) vVar22.c, vVar22.a, this.x);
            if (a10 != null) {
            }
            if (this.c0) {
            }
            this.C0 = new bg.i(file, this, fVar, i7, i10, !z10, i11);
        }
        if (this.c0 && this.e[c10] < 60) {
            this.c0 = false;
        }
        this.C0 = new bg.i(file, this, fVar, i7, i10, !z10, i11);
    }

    public static void d(ch0 ch0Var) {
        if (ch0Var.P != null) {
            bg.i.c();
            ch0Var.P = null;
        }
        ch0Var.y0 = false;
        ch0Var.p();
        Runnable runnable = ch0Var.B0;
        if (runnable != null) {
            runnable.run();
            ch0Var.B0 = null;
        }
    }

    public static void e(ch0 ch0Var) {
        if (ch0Var.m0 || ch0Var.W || !ch0Var.k() || ch0Var.P != null) {
            return;
        }
        ch0Var.y0 = true;
        if (U0 == null) {
            U0 = new org.telegram.messenger.q5("cache generator queue", true);
        }
        bg.i.A++;
        org.telegram.messenger.q5 q5Var = U0;
        bh0 bh0Var = new bh0(ch0Var, 0);
        ch0Var.P = bh0Var;
        q5Var.postRunnable(bh0Var);
    }

    public static void f(ch0 ch0Var) {
        int i7;
        Bitmap createBitmap;
        boolean z10;
        try {
            i7 = ch0Var.j();
            if (i7 == 1) {
                if (ch0Var.T != null) {
                    createBitmap = ch0Var.T;
                    z10 = true;
                } else {
                    createBitmap = Bitmap.createBitmap(ch0Var.b, ch0Var.c, ch0Var.H ? Bitmap.Config.ALPHA_8 : Bitmap.Config.ARGB_8888);
                    ch0Var.T = createBitmap;
                    z10 = false;
                }
                int B = ch0Var.B(createBitmap, z10);
                if (B == 1) {
                    ch0Var.S = createBitmap;
                    ch0Var.i();
                }
                i7 = B;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            i7 = 2;
        }
        if (i7 == 1) {
            ch0Var.H0 = 0;
            org.telegram.messenger.g0.h3(ch0Var.x0);
        } else if (i7 == 2) {
            org.telegram.messenger.g0.i3(ch0Var.w0, ch0Var.H0);
            ch0Var.H0 = Math.min((Math.max(ch0Var.H0, 2) * 3) / 2, 2000);
        } else if (i7 == 3) {
            org.telegram.messenger.g0.h3(ch0Var.w0);
        }
        CountDownLatch countDownLatch = ch0Var.V;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static void g(ch0 ch0Var) {
        int i7 = ch0Var.L0 + 1;
        ch0Var.L0 = i7;
        if (i7 > 10) {
            ch0Var.M0 = true;
        }
        ch0Var.m();
        if (ch0Var.P0) {
            ch0Var.O0 = true;
            ch0Var.x();
        }
    }

    public static void h(ch0 ch0Var) {
        ch0Var.Y = true;
        if ((!ch0Var.l0 && ch0Var.X) || (ch0Var.R == null && ch0Var.S != null)) {
            ch0Var.x();
        }
        ch0Var.p();
    }

    public final boolean A() {
        return this.b0 == this.e[0] - 1;
    }

    public int B(Bitmap bitmap, boolean z10) {
        RLottieNative b10;
        int c10;
        bg.i iVar;
        RLottieNative rLottieNative = this.n0;
        if (rLottieNative != null) {
            try {
                if (!this.w.isEmpty() || this.r != null) {
                    this.x.putAll(this.w);
                    int[] iArr = this.r;
                    if (iArr != null) {
                        this.v0.c = (int[]) iArr.clone();
                    }
                    ab.v vVar = this.v0;
                    File file = (File) vVar.e;
                    if (file != null) {
                        String absolutePath = file.getAbsolutePath();
                        ab.v vVar2 = this.v0;
                        b10 = RLottieNative.a(absolutePath, (String) vVar2.d, this.e, (int[]) vVar2.c, vVar2.a, this.x);
                    } else {
                        int i7 = vVar.b;
                        if (i7 == 0 || ((String) vVar.d) != null) {
                            b10 = RLottieNative.b((String) vVar.d, this.e, (int[]) vVar.c, this.x);
                        } else {
                            String y22 = org.telegram.messenger.g0.y2(null, i7);
                            if (!TextUtils.isEmpty(y22)) {
                                ab.v vVar3 = this.v0;
                                vVar3.d = y22;
                                b10 = RLottieNative.b(y22, this.e, (int[]) vVar3.c, this.x);
                            }
                        }
                    }
                    if (b10 != null) {
                        this.n0 = b10;
                        rLottieNative.d();
                        this.w.clear();
                        this.r = null;
                    }
                }
            } catch (Exception unused) {
            }
        }
        RLottieNative rLottieNative2 = this.n0;
        int i10 = this.c0 ? 2 : 1;
        if (!this.t0 || (iVar = this.C0) == null) {
            c10 = rLottieNative2.c(this.b0, bitmap, z10);
        } else {
            c10 = 0;
            try {
                c10 = iVar.f(this.b0 / i10, bitmap);
                if (!this.C0.g() && this.F0 && this.n0 != null) {
                    this.n0.d();
                    this.n0 = null;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        bg.i iVar2 = this.C0;
        if (iVar2 != null && iVar2.g()) {
            if (!this.E0) {
                this.E0 = true;
                org.telegram.messenger.g0.h3(this.z0);
            }
            c10 = -1;
            if (this.F0) {
                if (this.n0 == null) {
                    String file2 = ((File) this.v0.e).toString();
                    ab.v vVar4 = this.v0;
                    this.n0 = RLottieNative.a(file2, (String) vVar4.d, null, (int[]) vVar4.c, vVar4.a, this.x);
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
        if (this.Q != null || this.P != null || this.y0) {
            this.W = true;
            return;
        }
        D(z10);
        bg.i iVar = this.C0;
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
            this.C0 = null;
        }
        E();
    }

    public void D(boolean z10) {
        RLottieNative rLottieNative = this.n0;
        this.n0 = null;
        if (rLottieNative != null) {
            wa0 wa0Var = new wa0(rLottieNative, 12);
            if (z10) {
                org.telegram.messenger.r5.a(wa0Var);
            } else {
                Utilities.e.c(wa0Var);
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
        org.telegram.messenger.g0.A2(arrayList);
        if (this.u0 != null) {
            this.u0 = null;
        }
    }

    public final void F(ImageReceiver imageReceiver) {
        xe.b bVar = this.J0;
        bVar.remove(imageReceiver);
        if (this.C0 == null || U0 == null || this.P == null) {
            return;
        }
        WeakReference weakReference = this.I0;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (bVar.isEmpty() && getCallback() == null) {
            if (view == null || !view.isAttachedToWindow()) {
                bh0 bh0Var = this.P;
                if (bh0Var != null) {
                    U0.cancelRunnable(bh0Var);
                    bg.i.c();
                    this.P = null;
                }
                this.y0 = false;
                this.E0 = false;
            }
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

    public final void J(boolean z10) {
        this.X = true;
        I();
    }

    public final void K(int i7) {
        if (this.L == 2 && i7 == 3 && this.b0 != 0) {
            return;
        }
        this.L = i7;
    }

    public final void L() {
        N(85, false, false);
    }

    public final void M(int i7) {
        N(i7, true, false);
    }

    public final void N(int i7, boolean z10, boolean z11) {
        if (i7 < 0 || i7 > this.e[0]) {
            return;
        }
        if (this.b0 != i7 || z11) {
            this.b0 = i7;
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
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
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
        if (z10 && this.Z) {
            this.Y = false;
            this.Z = false;
        }
        if (this.K == 0 && (weakReference = this.I) != null && this.b0 >= this.J && (runnable = (Runnable) weakReference.get()) != null) {
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
        this.I0 = new WeakReference(view);
    }

    public final void S(int i7, Runnable runnable) {
        if (runnable != null) {
            this.I = new WeakReference(runnable);
            this.J = i7;
        } else if (this.I != null) {
            this.I = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000b, code lost:
    
        if (r4 > 1.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(boolean z10, float f10) {
        float f11 = f10 >= 0.0f ? 1.0f : 0.0f;
        f10 = f11;
        N((int) (this.e[0] * f10), z10, false);
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
        this.L0 = 0;
        if (this.M0) {
            this.M0 = false;
            l();
        }
        boolean z10 = this.O0 || (!this.l0 && this.X);
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
                O(false);
            }
        }
    }

    @Override // bg.g
    public final int a(Bitmap bitmap) {
        RLottieNative rLottieNative = this.K0;
        if (rLottieNative == null) {
            return -1;
        }
        int i7 = this.D0;
        if (i7 >= rLottieNative.a[0]) {
            return 0;
        }
        int i10 = this.c0 ? 2 : 1;
        if (rLottieNative.c(i7, bitmap, true) == -5) {
            return -1;
        }
        this.D0 += i10;
        return 1;
    }

    @Override // bg.g
    public final void b() {
        File file;
        ab.v vVar = this.v0;
        File file2 = (File) vVar.e;
        RLottieNative a10 = RLottieNative.a(file2 != null ? file2.toString() : null, (String) vVar.d, this.d0 ? this.e : null, (int[]) vVar.c, vVar.a, this.x);
        this.K0 = a10;
        this.D0 = 0;
        if (a10 != null || (file = this.s0) == null) {
            return;
        }
        file.delete();
    }

    @Override // bg.g
    public final void c() {
        RLottieNative rLottieNative = this.K0;
        if (rLottieNative != null) {
            rLottieNative.d();
            this.K0 = null;
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
        int i7 = this.c0 ? 2 : 1;
        int i10 = this.f;
        if (i10 >= 0 && this.h) {
            int i11 = this.b0;
            if (i11 > i10) {
                int i12 = i11 - i7;
                if (i12 >= i10) {
                    this.b0 = i12;
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
            int i13 = i11 + i7;
            if (i13 < i10) {
                this.b0 = i13;
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
        int i14 = this.b0 + i7;
        if (i10 < 0) {
            i10 = this.e[0];
        }
        if (i14 < i10) {
            if (this.L == 3) {
                this.O = true;
                this.N++;
                return;
            } else {
                this.b0 = i14;
                this.O = false;
                return;
            }
        }
        int i15 = this.L;
        if (i15 == 1) {
            this.b0 = 0;
            this.O = false;
            if (this.E) {
                this.y = null;
                this.E = false;
            }
            int i16 = this.M;
            if (i16 > 0) {
                this.M = i16 - 1;
                return;
            }
            return;
        }
        if (i15 != 2) {
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
        String y22 = org.telegram.messenger.g0.y2(null, this.v0.b);
        if (TextUtils.isEmpty(y22)) {
            return 2;
        }
        this.n0 = RLottieNative.b(y22, this.e, (int[]) this.v0.c, this.x);
        this.d = false;
        return 1;
    }

    public final boolean k() {
        return this.t0 ? this.C0 != null || this.o0 : this.n0 != null || this.d;
    }

    public final void l() {
        bh0 bh0Var = new bh0(this, 6);
        Typeface typeface = org.telegram.messenger.g0.a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.g0.h3(bh0Var);
        } else {
            bh0Var.run();
        }
    }

    public final void m() {
        if (!this.l0 || this.M0) {
            if (this.P0) {
                this.P0 = false;
                this.L0 = 0;
                bg.k.d().g(this.N0);
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
            bg.k.d().b(this.N0, round);
            x();
        }
    }

    public final void n() {
        bh0 bh0Var = this.P;
        if (bh0Var != null) {
            U0.cancelRunnable(bh0Var);
            bg.i.c();
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
        if ((this.n0 == null || this.o0) && this.C0 == null) {
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

    public final void q(Canvas canvas, Paint paint, boolean z10, long j3, int i7) {
        float width;
        boolean z11;
        float f10;
        if (!k() || this.W) {
            return;
        }
        if (!z10) {
            V(j3);
        }
        RectF rectF = z10 ? this.j0[i7] : this.i0;
        if (paint == null) {
            paint = z10 ? this.k0[i7] : getPaint();
        }
        if (paint.getAlpha() == 0 || this.q0 || this.R == null) {
            return;
        }
        boolean z12 = true;
        if (z10) {
            width = rectF.width() / this.b;
            float height = rectF.height() / this.c;
            if (Math.abs(rectF.width() - this.b) < org.telegram.messenger.g0.L(1.0f) && Math.abs(rectF.height() - this.c) < org.telegram.messenger.g0.L(1.0f)) {
                z12 = false;
            }
            z11 = z12;
            f10 = height;
        } else {
            rectF.set(getBounds());
            if (this.g0) {
                this.e0 = rectF.width() / this.b;
                this.f0 = rectF.height() / this.c;
                this.g0 = false;
                if (Math.abs(rectF.width() - this.b) < org.telegram.messenger.g0.L(1.0f) && Math.abs(rectF.height() - this.c) < org.telegram.messenger.g0.L(1.0f)) {
                    z12 = false;
                }
                this.h0 = z12;
            }
            width = this.e0;
            f10 = this.f0;
            z11 = this.h0;
        }
        if (!z11) {
            canvas.drawBitmap(this.R, rectF.left, rectF.top, paint);
            return;
        }
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        canvas.scale(width, f10);
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
            this.M0 = false;
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
        if (!this.J0.isEmpty()) {
            return true;
        }
        WeakReference weakReference = this.I0;
        return ((weakReference == null || weakReference.get() == null) && getCallback() == null) ? false : true;
    }

    public boolean w() {
        return this.R != null && this.e[0] == 1;
    }

    public final void x() {
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

    public final boolean y() {
        return this.P != null;
    }

    public boolean z() {
        return true;
    }

    public ch0(int i7, int i10) {
        this.e = new int[3];
        this.f = -1;
        this.s = new HashMap();
        this.w = new HashMap();
        this.x = new HashMap();
        this.E = false;
        this.F = true;
        this.G = 1.0f;
        this.L = 1;
        this.M = -1;
        this.e0 = 1.0f;
        this.f0 = 1.0f;
        this.i0 = new RectF();
        this.j0 = new RectF[2];
        this.k0 = new Paint[2];
        this.w0 = new bh0(this, 1);
        this.x0 = new bh0(this, 2);
        this.z0 = new bh0(this, 3);
        this.A0 = new bh0(this, 4);
        this.G0 = new bh0(this, 5);
        this.J0 = new xe.b(true, true);
        this.N0 = new s5(this, 2);
        this.b = i7;
        this.c = i10;
        this.H = false;
    }

    public ch0(int i7, int i10, int i11) {
        this(i7, i10, i11, true, null);
    }

    public ch0(int i7, int i10, int i11, boolean z10, int[] iArr) {
        long j3;
        this.e = new int[3];
        this.f = -1;
        this.s = new HashMap();
        this.w = new HashMap();
        this.x = new HashMap();
        this.E = false;
        this.F = true;
        this.G = 1.0f;
        this.L = 1;
        this.M = -1;
        this.e0 = 1.0f;
        this.f0 = 1.0f;
        this.i0 = new RectF();
        this.j0 = new RectF[2];
        this.k0 = new Paint[2];
        this.w0 = new bh0(this, 1);
        this.x0 = new bh0(this, 2);
        this.z0 = new bh0(this, 3);
        this.A0 = new bh0(this, 4);
        this.G0 = new bh0(this, 5);
        this.J0 = new xe.b(true, true);
        this.N0 = new s5(this, 2);
        this.b = i10;
        this.c = i11;
        this.L = 0;
        getPaint().setFlags(2);
        ab.v vVar = new ab.v();
        this.v0 = vVar;
        vVar.c = iArr == null ? null : (int[]) iArr.clone();
        long[] jArr = org.telegram.messenger.rt.a;
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
            this.v0.b = i7;
            this.H = (8388608 & j3) != 0;
            int[] iArr2 = this.e;
            iArr2[0] = (int) (8388607 & j3);
            iArr2[1] = (int) ((j3 >>> 24) & 255);
        } else {
            this.H = false;
            String y22 = org.telegram.messenger.g0.y2(null, i7);
            if (TextUtils.isEmpty(y22)) {
                this.v0 = null;
                return;
            } else {
                ab.v vVar2 = this.v0;
                vVar2.d = y22;
                this.n0 = RLottieNative.b(y22, this.e, (int[]) vVar2.c, this.x);
            }
        }
        if (this.H) {
            setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        if (z10) {
            J(true);
        }
    }
}
