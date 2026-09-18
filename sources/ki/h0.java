package ki;

import ai.q4;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.TextureView;
import hg.k0;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Cells.t6;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.q01;
import org.telegram.ui.Components.w50;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class h0 {
    public long A;
    public long B;
    public long D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public volatile e0 I;
    public volatile o J;
    public volatile File K;
    public i2.e0 L;
    public final d0 O;
    public final int P;
    public int R;
    public int S;
    public int T;
    public final Context a;
    public final TextureView b;
    public final l.d c;
    public final f0 d;
    public final w50 e;
    public final g k;
    public final j l;
    public final long m;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public volatile boolean x;
    public long y;
    public long z;
    public final Object f = new Object();
    public final Matrix g = new Matrix();
    public final Handler h = new Handler(Looper.getMainLooper());
    public final ExecutorService i = Executors.newSingleThreadExecutor(new e2.c0(1));
    public final ExecutorService j = Executors.newSingleThreadExecutor(new e2.c0(2));
    public int Q = 1;
    public int U = 1;
    public float n = 1.0f;
    public long C = 1;
    public final w M = new w(this, 1);
    public final q4 N = new q4(this, 24);

    public h0(Context context, TextureView textureView, l.d dVar, f0 f0Var, w50 w50Var) {
        k2.u uVar = new k2.u(this, 1);
        this.O = new d0(this, 0);
        r();
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.a = context;
        this.b = textureView;
        this.R = 1;
        this.P = 1;
        this.m = 60000L;
        this.c = dVar;
        this.d = f0Var;
        this.e = w50Var;
        j jVar = new j();
        this.l = jVar;
        StringBuilder sb2 = new StringBuilder("session created: device=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(" ");
        sb2.append(Build.MODEL);
        sb2.append(", sdk=");
        k0.s(sb2, Build.VERSION.SDK_INT, ", output=", 480, "x");
        sb2.append(480);
        sb2.append(", bitrate=1150000, cameraMode=");
        sb2.append("HIGH");
        sb2.append(", facing=");
        sb2.append("FRONT");
        sb2.append(", maxDurationMs=60000");
        jVar.b(sb2.toString());
        this.k = new g(context, textureView, jVar, uVar);
    }

    public static long e(long j3) {
        return (System.nanoTime() - j3) / 1000000;
    }

    public static void r() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("RoundVideoSession must be used from the main thread");
        }
    }

    public final void a() {
        r();
        int i10 = this.Q;
        if (i10 == 10 || i10 == 8) {
            return;
        }
        this.l.b("cancel requested: state=".concat(k0.C(i10)));
        this.x = true;
        d();
        p();
        e0 e0Var = this.I;
        if (e0Var != null) {
            j(e0Var, 3);
        }
        u(10);
        if (!this.v && !this.k.q()) {
            h();
        } else {
            this.v = true;
            this.u = true;
        }
    }

    public final void b(e0 e0Var, File file, long j3, boolean z10) {
        if (this.x || e0Var.d) {
            return;
        }
        this.j.execute(new z(this, e0Var, file, j3, z10));
    }

    public final void c(boolean z10) {
        synchronized (this.f) {
            f();
            File createTempFile = File.createTempFile("round_video_", ".mp4", this.a.getCacheDir());
            long j3 = this.C;
            this.C = 1 + j3;
            e0 e0Var = new e0(j3, createTempFile);
            this.I = e0Var;
            this.J = new o(createTempFile, k0.d(this.P), z10, this.l, new ah.b(23, this, e0Var));
            this.l.b("output generation started: id=" + j3 + ", includeAudio=" + z10 + ", file=" + createTempFile.getName());
            this.j.execute(new gg.t(this, e0Var, createTempFile, 24));
        }
    }

    public final void d() {
        this.o = false;
        g gVar = this.k;
        gVar.n(0.0f);
        gVar.m(false);
        t(false);
    }

    public final void f() {
        if (this.x) {
            throw new IOException("Round-video operation was cancelled");
        }
    }

    public final void g(Exception exc) {
        int i10 = this.Q;
        if (i10 == 9 || i10 == 10) {
            return;
        }
        this.l.a("fatal error in state=".concat(k0.C(i10)), exc);
        this.x = true;
        d();
        p();
        this.h.removeCallbacks(this.M);
        e0 e0Var = this.I;
        if (e0Var != null) {
            j(e0Var, 4);
        }
        e0 e0Var2 = this.I;
        if (e0Var2 != null) {
            this.j.execute(new a0(this, e0Var2, exc));
        }
        u(9);
        l("error");
        l.d dVar = this.c;
        dVar.getClass();
        FileLog.e(exc);
        a60 a60Var = (a60) dVar.a;
        q01 q01Var = a60Var.M;
        if (q01Var != null) {
            q01Var.b(true);
        }
        a60Var.M = null;
        NotificationCenter.getInstance(a60Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStartError, Integer.valueOf(a60Var.f));
        if (!this.v && !this.k.q()) {
            h();
        } else {
            this.v = true;
            this.u = true;
        }
    }

    public final void h() {
        if (this.w) {
            return;
        }
        this.w = true;
        l("cancelled");
        w wVar = new w(this, 0);
        ExecutorService executorService = this.i;
        executorService.execute(wVar);
        this.k.j();
        this.h.removeCallbacksAndMessages(null);
        executorService.shutdown();
        this.j.shutdown();
    }

    public final long i() {
        r();
        if (this.Q != 3) {
            return this.y;
        }
        return Math.min(this.m, (SystemClock.elapsedRealtime() + this.y) - this.z);
    }

    public final void j(e0 e0Var, int i10) {
        synchronized (this.f) {
            try {
                if (e0Var.d) {
                    return;
                }
                e0Var.d = true;
                this.l.b("output generation invalidated: id=" + e0Var.a + ", reason=" + k0.B(i10) + ", availableSize=" + e0Var.c);
                this.j.execute(new a0(this, e0Var, i10));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean k() {
        return this.A > 0 || this.B + 10 < this.y;
    }

    public final void l(String str) {
        if (this.H) {
            return;
        }
        this.H = true;
        e0 e0Var = this.I;
        j jVar = this.l;
        StringBuilder v = a4.a.v("session summary: terminal=", str, ", state=");
        v.append(k0.C(this.Q));
        v.append(", durationMs=");
        v.append(i());
        v.append(", pauses=");
        v.append(this.E);
        v.append(", resumes=");
        v.append(this.F);
        v.append(", cameraSwitches=");
        v.append(this.G);
        v.append(", facing=");
        v.append(k0.z(this.S));
        v.append(", cameraMode=");
        v.append(k0.A(this.T));
        v.append(", generation=");
        v.append(e0Var == null ? 0L : e0Var.a);
        v.append(", availableSize=");
        v.append(e0Var != null ? e0Var.c : 0L);
        jVar.b(v.toString());
    }

    public final void m() {
        int i10 = this.Q;
        long j3 = this.y;
        long j10 = this.z;
        boolean z10 = this.q;
        boolean z11 = this.o;
        long j11 = this.m;
        g0 g0Var = new g0(i10, j3, j10, j11, z10, z11);
        a60 a60Var = (a60) this.c.a;
        g0 g0Var2 = a60Var.K;
        int i11 = a60Var.e;
        t6 t6Var = a60Var.n0;
        jm0 jm0Var = a60Var.s;
        int i12 = g0Var2 == null ? 0 : g0Var2.a;
        a60Var.K = g0Var;
        a60Var.f0 = Math.max(a60Var.f0, j3);
        jm0Var.removeCallbacks(t6Var);
        if (i10 == 3) {
            jm0Var.setTrimEnabled(false);
            jm0Var.setLoading(false);
            a60.m(a60Var);
            jm0Var.postOnAnimation(t6Var);
            if (!a60Var.U) {
                a60Var.U = true;
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(a60Var.f), Boolean.FALSE);
            } else if (a60Var.V) {
                a60Var.V = false;
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
            }
        } else {
            jm0Var.setProgress(j3 / j11);
            boolean z12 = i10 == 4 || i10 == 6 || i10 == 7;
            jm0Var.setLoading(z12);
            if (z12 && i12 != i10) {
                a60Var.r(true);
            }
        }
        if (i12 == 3 && i10 == 4) {
            a60Var.q(2);
        }
        a60.l(a60Var);
    }

    public final void n() {
        r();
        if (this.Q != 3) {
            return;
        }
        this.y = i();
        this.E++;
        this.l.b("pause requested: durationMs=" + this.y);
        d();
        this.h.removeCallbacks(this.M);
        u(4);
        boolean q6 = this.k.q();
        this.v = q6;
        if (q6) {
            return;
        }
        g(new IllegalStateException("Unable to stop the camera segment"));
    }

    public final void o() {
        i2.e0 e0Var;
        r();
        if (this.Q != 5 || (e0Var = this.L) == null) {
            return;
        }
        long J0 = e0Var.J0();
        long j3 = this.A;
        if (J0 < j3 || J0 >= this.B) {
            this.L.W0(5, j3);
        }
        this.L.i();
        x(true);
    }

    public final void p() {
        this.h.removeCallbacks(this.N);
        this.r = false;
        i2.e0 e0Var = this.L;
        if (e0Var == null) {
            return;
        }
        e0Var.D(this.O);
        i2.e0 e0Var2 = this.L;
        e0Var2.B1();
        TextureView textureView = this.b;
        if (textureView != null && textureView == e0Var2.V) {
            e0Var2.B1();
            e0Var2.o1();
            e0Var2.t1(null);
            e0Var2.m1(0, 0);
        }
        this.L.U0();
        this.L = null;
    }

    public final void q(File file, long j3, long j10, boolean z10, int i10) {
        long nanoTime = System.nanoTime();
        j jVar = this.l;
        StringBuilder t10 = a4.a.t(j3, "final range remux started: range=", "..");
        t10.append(j10);
        t10.append(", includeAudio=");
        t10.append(z10);
        t10.append(", reason=");
        t10.append(k0.B(i10));
        jVar.b(t10.toString());
        f();
        j(this.I, i10);
        c(z10);
        f();
        a3.z a2 = w7.k.a(file, this.J, j3, j10, z10);
        this.J.c();
        this.l.b("final range remux completed: durationMs=" + a2.b + ", actualStartMs=" + a2.a + ", size=" + this.J.a.length() + ", elapsedMs=" + e(nanoTime));
        f();
        b(this.I, this.J.a, a2.b, z10);
    }

    public final void s(long j3) {
        r();
        if (this.Q != 5 || this.L == null) {
            return;
        }
        long j10 = this.A;
        long max = Math.max(j10, Math.min(Math.max(j10, this.B - 1), j3));
        this.L.W0(5, max);
        this.c.M(max);
    }

    public final void t(boolean z10) {
        if (this.p == z10) {
            return;
        }
        this.p = z10;
        w50 w50Var = this.e;
        if (w50Var != null) {
            w50Var.a.setScreenFlashEnabled(z10);
        }
    }

    public final void u(int i10) {
        int i11 = this.Q;
        this.Q = i10;
        this.l.b("state: " + k0.C(i11) + " -> " + k0.C(i10) + ", durationMs=" + i());
        m();
    }

    public final boolean v(long j3, long j10) {
        r();
        if (this.Q != 5) {
            return false;
        }
        long max = Math.max(0L, Math.min(this.y, j3));
        long max2 = Math.max(max, Math.min(this.y, j10));
        if (max2 - max < Math.min(800L, this.y)) {
            return false;
        }
        this.A = max;
        this.B = max2;
        i2.e0 e0Var = this.L;
        if (e0Var != null) {
            e0Var.W0(5, max);
        }
        this.c.M(this.A);
        m();
        return true;
    }

    public final void w(float f7) {
        r();
        if (this.Q != 3 || this.q) {
            return;
        }
        this.k.n(Math.max(0.0f, Math.min(1.0f, f7)));
    }

    public final void x(boolean z10) {
        if (this.r == z10) {
            return;
        }
        this.r = z10;
        Handler handler = this.h;
        q4 q4Var = this.N;
        handler.removeCallbacks(q4Var);
        if (z10) {
            handler.post(q4Var);
        }
        this.c.getClass();
        m();
    }
}
