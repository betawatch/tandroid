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
import org.telegram.ui.Components.d60;
import org.telegram.ui.Components.nv;
import org.telegram.ui.Components.q01;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes4.dex */
public final class s0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public volatile boolean D;
    public long E;
    public long F;
    public long G;
    public long H;
    public long J;
    public long K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public volatile o0 P;
    public volatile t Q;
    public volatile File R;
    public i2.f0 S;
    public final i0 V;
    public final Context a;
    public final TextureView b;
    public final File c;
    public final l.d d;
    public final p0 e;
    public final nv f;
    public final i l;
    public final m m;
    public final q0 n;
    public final long o;
    public l0 p;
    public l0 q;
    public m0 r;
    public n0 s;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public final Object g = new Object();
    public final Matrix h = new Matrix();
    public final Handler i = new Handler(Looper.getMainLooper());
    public final ExecutorService j = Executors.newSingleThreadExecutor(new e2.c0(1));
    public final ExecutorService k = Executors.newSingleThreadExecutor(new e2.c0(2));
    public int W = 1;
    public int X = 1;
    public float t = 1.0f;
    public long I = 1;
    public final b0 T = new b0(this, 1);
    public final q4 U = new q4(this, 24);

    public s0(j0 j0Var) {
        k2.u uVar = new k2.u(this, 1);
        this.V = new i0(this, 0);
        t();
        Context context = j0Var.a;
        Context applicationContext = context.getApplicationContext();
        Context context2 = applicationContext == null ? context : applicationContext;
        this.a = context2;
        TextureView textureView = j0Var.b;
        this.b = textureView;
        File file = j0Var.c;
        this.c = file == null ? context2.getCacheDir() : file;
        this.p = j0Var.d;
        q0 q0Var = j0Var.e;
        this.n = q0Var;
        int i10 = j0Var.h;
        m0 m0Var = j0Var.f;
        n0 n0Var = j0Var.g;
        this.o = 60000L;
        boolean z10 = j0Var.i;
        this.d = j0Var.j;
        this.e = j0Var.k;
        this.f = j0Var.l;
        m mVar = new m();
        this.m = mVar;
        StringBuilder sb2 = new StringBuilder("session created: device=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(" ");
        sb2.append(Build.MODEL);
        sb2.append(", sdk=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(", output=");
        sb2.append(q0Var.a);
        sb2.append("x");
        hg.c.t(sb2, q0Var.a, ", bitrate=", i10, ", cameraMode=");
        sb2.append(m0Var);
        sb2.append(", fps=");
        sb2.append(n0Var.a);
        sb2.append(", composition=");
        sb2.append(z10);
        sb2.append(", facing=");
        sb2.append(this.p);
        sb2.append(", maxDurationMs=60000");
        mVar.b(sb2.toString());
        this.l = new i(context2, textureView, q0Var, i10, m0Var, n0Var, z10, mVar, uVar);
    }

    public static long f(long j3) {
        return (System.nanoTime() - j3) / 1000000;
    }

    public static void t() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("RoundVideoSession must be used from the main thread");
        }
    }

    public final void a() {
        t();
        int i10 = this.W;
        if (i10 == 10 || i10 == 8) {
            return;
        }
        this.m.b("cancel requested: state=".concat(hg.c.C(i10)));
        if (b(3)) {
            e();
            r();
            v(10);
            if (!this.B && !this.l.D()) {
                i();
            } else {
                this.B = true;
                this.A = true;
            }
        }
    }

    public final boolean b(int i10) {
        synchronized (this.g) {
            try {
                o0 o0Var = this.P;
                if (o0Var != null && o0Var.e) {
                    return false;
                }
                this.D = true;
                if (o0Var != null && !o0Var.d) {
                    o0Var.d = true;
                    this.m.b("output generation invalidated: id=" + o0Var.a + ", reason=" + hg.c.B(i10) + ", availableSize=" + o0Var.c);
                    this.k.execute(new e0(this, o0Var, i10, 1));
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(boolean z10) {
        synchronized (this.g) {
            g();
            File d = d("round_video_");
            long j3 = this.I;
            this.I = 1 + j3;
            o0 o0Var = new o0(j3, d);
            this.P = o0Var;
            this.Q = new t(d, this.n.a, z10, this.m, new ah.b(23, this, o0Var));
            this.m.b("output generation started: id=" + j3 + ", includeAudio=" + z10 + ", file=" + d.getName());
            this.k.execute(new gg.t(this, o0Var, d, 24));
        }
    }

    public final File d(String str) {
        File file = this.c;
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IOException("Round-video output path is not a directory: " + file);
            }
        } else if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException("Cannot create round-video output directory: " + file);
        }
        return File.createTempFile(str, ".mp4", file);
    }

    public final void e() {
        this.u = false;
        i iVar = this.l;
        iVar.z(0.0f);
        iVar.y(false);
        u(false);
    }

    public final void g() {
        if (this.D) {
            throw new IOException("Round-video operation was cancelled");
        }
    }

    public final void h(Exception exc) {
        int i10 = this.W;
        if (i10 == 9 || i10 == 10) {
            return;
        }
        this.m.a("fatal error in state=".concat(hg.c.C(i10)), exc);
        if (b(4)) {
            e();
            r();
            this.i.removeCallbacks(this.T);
            o0 o0Var = this.P;
            if (o0Var != null) {
                this.k.execute(new e0(this, o0Var, exc));
            }
            v(9);
            m("error");
            d60 d60Var = (d60) this.d.a;
            d60Var.u();
            FileLog.e(exc);
            q01 q01Var = d60Var.T;
            if (q01Var != null) {
                q01Var.d(true);
            }
            d60Var.T = null;
            NotificationCenter.getInstance(d60Var.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStartError, Integer.valueOf(d60Var.n));
            if (!this.B && !this.l.D()) {
                i();
            } else {
                this.B = true;
                this.A = true;
            }
        }
    }

    public final void i() {
        if (this.C) {
            return;
        }
        this.C = true;
        m("cancelled");
        b0 b0Var = new b0(this, 0);
        ExecutorService executorService = this.j;
        executorService.execute(b0Var);
        this.l.s();
        this.i.removeCallbacksAndMessages(null);
        executorService.shutdown();
        this.k.shutdown();
    }

    public final long j() {
        t();
        if (this.W != 3) {
            return this.E;
        }
        return Math.min(this.o, (SystemClock.elapsedRealtime() + this.E) - this.F);
    }

    public final void k(o0 o0Var, int i10) {
        synchronized (this.g) {
            try {
                if (!o0Var.d && !o0Var.e) {
                    o0Var.d = true;
                    this.m.b("output generation invalidated: id=" + o0Var.a + ", reason=" + hg.c.B(i10) + ", availableSize=" + o0Var.c);
                    this.k.execute(new e0(this, o0Var, i10, 0));
                }
            } finally {
            }
        }
    }

    public final boolean l() {
        long j3 = this.K;
        if (j3 <= 0) {
            j3 = this.E;
        }
        return j3 > this.o || this.G > 0 || this.H + 10 < j3;
    }

    public final void m(String str) {
        if (this.O) {
            return;
        }
        this.O = true;
        o0 o0Var = this.P;
        m mVar = this.m;
        StringBuilder w10 = a4.a.w("session summary: terminal=", str, ", state=");
        w10.append(hg.c.C(this.W));
        w10.append(", durationMs=");
        w10.append(j());
        w10.append(", pauses=");
        w10.append(this.L);
        w10.append(", resumes=");
        w10.append(this.M);
        w10.append(", cameraSwitches=");
        w10.append(this.N);
        w10.append(", facing=");
        w10.append(this.q);
        w10.append(", cameraMode=");
        w10.append(this.r);
        w10.append(", generation=");
        w10.append(o0Var == null ? 0L : o0Var.a);
        w10.append(", availableSize=");
        w10.append(o0Var != null ? o0Var.c : 0L);
        mVar.b(w10.toString());
    }

    public final void n() {
        l0 l0Var = this.p;
        l0 l0Var2 = this.q;
        k0 k0Var = new k0(l0Var, l0Var2, this.X, this.t);
        d60 d60Var = (d60) this.d.a;
        d60Var.S = k0Var;
        if (l0Var2 != null) {
            pi.e.h.b(l0Var2);
        }
        d60.k(d60Var);
    }

    public final void o() {
        int i10 = this.W;
        long j3 = this.E;
        long j10 = this.F;
        boolean z10 = this.w;
        boolean z11 = this.u;
        long j11 = this.o;
        r0 r0Var = new r0(i10, j3, j10, j11, z10, z11);
        d60 d60Var = (d60) this.d.a;
        r0 r0Var2 = d60Var.R;
        int i11 = d60Var.h;
        int i12 = r0Var2 == null ? 0 : r0Var2.a;
        d60Var.R = r0Var;
        if (i12 == 3 && i10 != 3) {
            d60Var.s(true);
        }
        d60Var.n0 = Math.max(d60Var.n0, j3);
        if (i10 == 3) {
            if (!d60Var.v0) {
                d60Var.v0 = true;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            }
            d60.l(d60Var);
            d60Var.setRecordingUiFrameClockActive(true);
            d60Var.w();
            if (!d60Var.e0) {
                d60Var.e0 = true;
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(d60Var.n), Boolean.FALSE);
            } else if (d60Var.f0) {
                d60Var.f0 = false;
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
            }
        } else {
            d60Var.setRecordingUiFrameClockActive(false);
            d60Var.w.setProgress(j3 / j11);
        }
        if (i10 == 8 || i10 == 9 || i10 == 10) {
            d60Var.u();
        }
        if (i12 == 3 && i10 == 4) {
            d60Var.r(2);
        }
        d60.k(d60Var);
    }

    public final void p() {
        t();
        if (this.W != 3) {
            return;
        }
        this.E = j();
        this.L++;
        this.m.b("pause requested: durationMs=" + this.E);
        e();
        this.i.removeCallbacks(this.T);
        v(4);
        boolean D = this.l.D();
        this.B = D;
        if (D) {
            return;
        }
        h(new IllegalStateException("Unable to stop the camera segment"));
    }

    public final void q() {
        i2.f0 f0Var;
        t();
        if (this.W != 5 || (f0Var = this.S) == null) {
            return;
        }
        long J0 = f0Var.J0();
        long j3 = this.G;
        if (J0 < j3 || J0 >= this.H) {
            this.S.W0(5, j3);
        }
        this.S.i();
        x(true);
    }

    public final void r() {
        this.i.removeCallbacks(this.U);
        this.x = false;
        i2.f0 f0Var = this.S;
        if (f0Var == null) {
            return;
        }
        f0Var.D(this.V);
        i2.f0 f0Var2 = this.S;
        f0Var2.B1();
        TextureView textureView = this.b;
        if (textureView != null && textureView == f0Var2.V) {
            f0Var2.B1();
            f0Var2.o1();
            f0Var2.t1(null);
            f0Var2.m1(0, 0);
        }
        this.S.U0();
        this.S = null;
    }

    public final void s(File file, long j3, long j10, boolean z10, int i10) {
        long nanoTime = System.nanoTime();
        m mVar = this.m;
        StringBuilder u10 = a4.a.u(j3, "final range remux started: range=", "..");
        u10.append(j10);
        u10.append(", includeAudio=");
        u10.append(z10);
        u10.append(", reason=");
        u10.append(hg.c.B(i10));
        mVar.b(u10.toString());
        g();
        k(this.P, i10);
        c(z10);
        g();
        a3.z a2 = w7.k.a(file, this.Q, j3, j10, z10);
        this.Q.f();
        long e = w7.k.e(this.Q.a) / 1000;
        m mVar2 = this.m;
        StringBuilder u11 = a4.a.u(e, "final range remux completed: durationMs=", ", requestedDurationMs=");
        u11.append(a2.b);
        u11.append(", actualStartMs=");
        u11.append(a2.a);
        u11.append(", size=");
        u11.append(this.Q.a.length());
        u11.append(", elapsedMs=");
        u11.append(f(nanoTime));
        mVar2.b(u11.toString());
        g();
        this.k.execute(new f0(this, this.P, this.Q.a, e, z10));
    }

    public final void u(boolean z10) {
        if (this.v == z10) {
            return;
        }
        this.v = z10;
        nv nvVar = this.f;
        if (nvVar != null) {
            ((d60) nvVar.b).setScreenFlashEnabled(z10);
        }
    }

    public final void v(int i10) {
        int i11 = this.W;
        this.W = i10;
        this.m.b("state: " + hg.c.C(i11) + " -> " + hg.c.C(i10) + ", durationMs=" + j());
        o();
    }

    public final void w(float f7) {
        t();
        if (this.W != 3 || this.w) {
            return;
        }
        this.l.z(Math.max(0.0f, Math.min(1.0f, f7)));
    }

    public final void x(boolean z10) {
        if (this.x == z10) {
            return;
        }
        this.x = z10;
        Handler handler = this.i;
        q4 q4Var = this.U;
        handler.removeCallbacks(q4Var);
        if (z10) {
            handler.post(q4Var);
        }
        this.d.getClass();
        o();
    }
}
