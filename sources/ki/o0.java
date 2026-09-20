package ki;

import ai.q4;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.TextureView;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Cells.u6;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.z50;
import w7.a6;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class o0 {
    public boolean A;
    public boolean B;
    public volatile boolean C;
    public long D;
    public long E;
    public long F;
    public long G;
    public long I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public volatile k0 N;
    public volatile q O;
    public volatile File P;
    public i2.e0 Q;
    public final e0 T;
    public final Context a;
    public final TextureView b;
    public final l.d c;
    public final l0 d;
    public final mv e;
    public final h k;
    public final k l;
    public final m0 m;
    public final long n;
    public h0 o;
    public h0 p;
    public i0 q;
    public j0 r;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public final Object f = new Object();
    public final Matrix g = new Matrix();
    public final Handler h = new Handler(Looper.getMainLooper());
    public final ExecutorService i = Executors.newSingleThreadExecutor(new e2.c0(1));
    public final ExecutorService j = Executors.newSingleThreadExecutor(new e2.c0(2));
    public int U = 1;
    public int V = 1;
    public float s = 1.0f;
    public long H = 1;
    public final y R = new y(this, 1);
    public final q4 S = new q4(this, 24);

    public o0(f0 f0Var) {
        k2.u uVar = new k2.u(this, 1);
        this.T = new e0(this, 0);
        s();
        Context context = f0Var.a;
        Context applicationContext = context.getApplicationContext();
        Context context2 = applicationContext == null ? context : applicationContext;
        this.a = context2;
        TextureView textureView = f0Var.b;
        this.b = textureView;
        this.o = f0Var.c;
        m0 m0Var = f0Var.d;
        this.m = m0Var;
        int i10 = f0Var.g;
        i0 i0Var = f0Var.e;
        j0 j0Var = f0Var.f;
        this.n = 60000L;
        boolean z10 = f0Var.h;
        this.c = f0Var.i;
        this.d = f0Var.j;
        this.e = f0Var.k;
        k kVar = new k();
        this.l = kVar;
        StringBuilder sb2 = new StringBuilder("session created: device=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(" ");
        sb2.append(Build.MODEL);
        sb2.append(", sdk=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(", output=");
        sb2.append(m0Var.a);
        sb2.append("x");
        hg.k0.t(sb2, m0Var.a, ", bitrate=", i10, ", cameraMode=");
        sb2.append(i0Var);
        sb2.append(", fps=");
        sb2.append(j0Var.a);
        sb2.append(", composition=");
        sb2.append(z10);
        sb2.append(", facing=");
        sb2.append(this.o);
        sb2.append(", maxDurationMs=60000");
        kVar.b(sb2.toString());
        this.k = new h(context2, textureView, m0Var, i10, i0Var, j0Var, z10, kVar, uVar);
    }

    public static long e(long j3) {
        return (System.nanoTime() - j3) / 1000000;
    }

    public static void s() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("RoundVideoSession must be used from the main thread");
        }
    }

    public final void a() {
        s();
        int i10 = this.U;
        if (i10 == 10 || i10 == 8) {
            return;
        }
        this.l.b("cancel requested: state=".concat(hg.k0.C(i10)));
        this.C = true;
        d();
        q();
        k0 k0Var = this.N;
        if (k0Var != null) {
            j(k0Var, 3);
        }
        u(10);
        if (!this.A && !this.k.z()) {
            h();
        } else {
            this.A = true;
            this.z = true;
        }
    }

    public final void b(k0 k0Var, File file, long j3, boolean z10) {
        if (this.C || k0Var.d) {
            return;
        }
        this.j.execute(new b0(this, k0Var, file, j3, z10));
    }

    public final void c(boolean z10) {
        synchronized (this.f) {
            f();
            File createTempFile = File.createTempFile("round_video_", ".mp4", this.a.getCacheDir());
            long j3 = this.H;
            this.H = 1 + j3;
            k0 k0Var = new k0(j3, createTempFile);
            this.N = k0Var;
            this.O = new q(createTempFile, this.m.a, z10, this.l, new ah.b(23, this, k0Var));
            this.l.b("output generation started: id=" + j3 + ", includeAudio=" + z10 + ", file=" + createTempFile.getName());
            this.j.execute(new gg.t(this, k0Var, createTempFile, 24));
        }
    }

    public final void d() {
        this.t = false;
        h hVar = this.k;
        hVar.w(0.0f);
        hVar.v(false);
        t(false);
    }

    public final void f() {
        if (this.C) {
            throw new IOException("Round-video operation was cancelled");
        }
    }

    public final void g(Exception exc) {
        int i10 = this.U;
        if (i10 == 9 || i10 == 10) {
            return;
        }
        this.l.a("fatal error in state=".concat(hg.k0.C(i10)), exc);
        this.C = true;
        d();
        q();
        this.h.removeCallbacks(this.R);
        k0 k0Var = this.N;
        if (k0Var != null) {
            j(k0Var, 4);
        }
        k0 k0Var2 = this.N;
        if (k0Var2 != null) {
            this.j.execute(new c0(this, k0Var2, exc));
        }
        u(9);
        l("error");
        z50 z50Var = (z50) this.c.a;
        z50Var.s();
        FileLog.e(exc);
        p01 p01Var = z50Var.O;
        if (p01Var != null) {
            p01Var.b(true);
        }
        z50Var.O = null;
        NotificationCenter.getInstance(z50Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStartError, Integer.valueOf(z50Var.f));
        if (!this.A && !this.k.z()) {
            h();
        } else {
            this.A = true;
            this.z = true;
        }
    }

    public final void h() {
        if (this.B) {
            return;
        }
        this.B = true;
        l("cancelled");
        y yVar = new y(this, 0);
        ExecutorService executorService = this.i;
        executorService.execute(yVar);
        this.k.r();
        this.h.removeCallbacksAndMessages(null);
        executorService.shutdown();
        this.j.shutdown();
    }

    public final long i() {
        s();
        if (this.U != 3) {
            return this.D;
        }
        return Math.min(this.n, (SystemClock.elapsedRealtime() + this.D) - this.E);
    }

    public final void j(k0 k0Var, int i10) {
        synchronized (this.f) {
            try {
                if (k0Var.d) {
                    return;
                }
                k0Var.d = true;
                this.l.b("output generation invalidated: id=" + k0Var.a + ", reason=" + hg.k0.B(i10) + ", availableSize=" + k0Var.c);
                this.j.execute(new c0(this, k0Var, i10));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean k() {
        return this.F > 0 || this.G + 10 < this.D;
    }

    public final void l(String str) {
        if (this.M) {
            return;
        }
        this.M = true;
        k0 k0Var = this.N;
        k kVar = this.l;
        StringBuilder v = a4.a.v("session summary: terminal=", str, ", state=");
        v.append(hg.k0.C(this.U));
        v.append(", durationMs=");
        v.append(i());
        v.append(", pauses=");
        v.append(this.J);
        v.append(", resumes=");
        v.append(this.K);
        v.append(", cameraSwitches=");
        v.append(this.L);
        v.append(", facing=");
        v.append(this.p);
        v.append(", cameraMode=");
        v.append(this.q);
        v.append(", generation=");
        v.append(k0Var == null ? 0L : k0Var.a);
        v.append(", availableSize=");
        v.append(k0Var != null ? k0Var.c : 0L);
        kVar.b(v.toString());
    }

    public final void m() {
        h0 h0Var = this.o;
        h0 h0Var2 = this.p;
        g0 g0Var = new g0(h0Var, h0Var2, this.V, this.s);
        z50 z50Var = (z50) this.c.a;
        z50Var.N = g0Var;
        if (h0Var2 != null) {
            a6.b("round_video_last_camera", h0Var2);
        }
        z50.l(z50Var);
    }

    public final void n() {
        int i10 = this.U;
        long j3 = this.D;
        long j10 = this.E;
        boolean z10 = this.v;
        boolean z11 = this.t;
        long j11 = this.n;
        n0 n0Var = new n0(i10, j3, j10, j11, z10, z11);
        z50 z50Var = (z50) this.c.a;
        n0 n0Var2 = z50Var.M;
        int i11 = z50Var.e;
        u6 u6Var = z50Var.t0;
        im0 im0Var = z50Var.s;
        int i12 = n0Var2 == null ? 0 : n0Var2.a;
        z50Var.M = n0Var;
        if (i12 == 3 && i10 != 3) {
            z50Var.q(true);
        }
        z50Var.i0 = Math.max(z50Var.i0, j3);
        im0Var.removeCallbacks(u6Var);
        if (i10 == 3) {
            if (!z50Var.q0) {
                z50Var.q0 = true;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            }
            z50.k(z50Var);
            im0Var.postOnAnimation(u6Var);
            if (!z50Var.W) {
                z50Var.W = true;
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(z50Var.f), Boolean.FALSE);
            } else if (z50Var.a0) {
                z50Var.a0 = false;
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
            }
        } else {
            im0Var.setProgress(j3 / j11);
        }
        if (i10 == 8 || i10 == 9 || i10 == 10) {
            z50Var.s();
        }
        if (i12 == 3 && i10 == 4) {
            z50Var.p(2);
        }
        z50.l(z50Var);
    }

    public final void o() {
        s();
        if (this.U != 3) {
            return;
        }
        this.D = i();
        this.J++;
        this.l.b("pause requested: durationMs=" + this.D);
        d();
        this.h.removeCallbacks(this.R);
        u(4);
        boolean z10 = this.k.z();
        this.A = z10;
        if (z10) {
            return;
        }
        g(new IllegalStateException("Unable to stop the camera segment"));
    }

    public final void p() {
        i2.e0 e0Var;
        s();
        if (this.U != 5 || (e0Var = this.Q) == null) {
            return;
        }
        long J0 = e0Var.J0();
        long j3 = this.F;
        if (J0 < j3 || J0 >= this.G) {
            this.Q.W0(5, j3);
        }
        this.Q.i();
        w(true);
    }

    public final void q() {
        this.h.removeCallbacks(this.S);
        this.w = false;
        i2.e0 e0Var = this.Q;
        if (e0Var == null) {
            return;
        }
        e0Var.D(this.T);
        i2.e0 e0Var2 = this.Q;
        e0Var2.B1();
        TextureView textureView = this.b;
        if (textureView != null && textureView == e0Var2.V) {
            e0Var2.B1();
            e0Var2.o1();
            e0Var2.t1(null);
            e0Var2.m1(0, 0);
        }
        this.Q.U0();
        this.Q = null;
    }

    public final void r(File file, long j3, long j10, boolean z10, int i10) {
        long nanoTime = System.nanoTime();
        k kVar = this.l;
        StringBuilder t10 = a4.a.t(j3, "final range remux started: range=", "..");
        t10.append(j10);
        t10.append(", includeAudio=");
        t10.append(z10);
        t10.append(", reason=");
        t10.append(hg.k0.B(i10));
        kVar.b(t10.toString());
        f();
        j(this.N, i10);
        c(z10);
        f();
        a3.z a2 = w7.k.a(file, this.O, j3, j10, z10);
        this.O.c();
        this.l.b("final range remux completed: durationMs=" + a2.b + ", actualStartMs=" + a2.a + ", size=" + this.O.a.length() + ", elapsedMs=" + e(nanoTime));
        f();
        b(this.N, this.O.a, a2.b, z10);
    }

    public final void t(boolean z10) {
        if (this.u == z10) {
            return;
        }
        this.u = z10;
        mv mvVar = this.e;
        if (mvVar != null) {
            ((z50) mvVar.b).setScreenFlashEnabled(z10);
        }
    }

    public final void u(int i10) {
        int i11 = this.U;
        this.U = i10;
        this.l.b("state: " + hg.k0.C(i11) + " -> " + hg.k0.C(i10) + ", durationMs=" + i());
        n();
    }

    public final void v(float f7) {
        s();
        if (this.U != 3 || this.v) {
            return;
        }
        this.k.w(Math.max(0.0f, Math.min(1.0f, f7)));
    }

    public final void w(boolean z10) {
        if (this.w == z10) {
            return;
        }
        this.w = z10;
        Handler handler = this.h;
        q4 q4Var = this.S;
        handler.removeCallbacks(q4Var);
        if (z10) {
            handler.post(q4Var);
        }
        this.c.getClass();
        n();
    }
}
