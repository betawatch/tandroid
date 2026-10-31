package li;

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
import org.telegram.messenger.MediaController;
import org.telegram.messenger.f8;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.lz0;
import org.telegram.ui.Components.px;
import org.telegram.ui.Components.z40;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class x0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public volatile boolean G;
    public long H;
    public long I;
    public long J;
    public long K;
    public long M;
    public long N;
    public int O;
    public int P;
    public int Q;
    public boolean R;
    public volatile t0 S;
    public volatile z T;
    public volatile File U;
    public i2.i0 V;
    public final e2.z Y;
    public final Context a;
    public final TextureView b;
    public final File c;
    public final k2.m0 d;
    public final u0 e;
    public final px f;
    public final l l;
    public final p m;
    public final v0 n;
    public final int o;
    public final s0 p;
    public final long q;
    public q0 r;
    public q0 s;
    public r0 t;
    public s0 u;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public final Object g = new Object();
    public final Matrix h = new Matrix();
    public final Handler i = new Handler(Looper.getMainLooper());
    public final ExecutorService j = Executors.newSingleThreadExecutor(new di.n(4));
    public final ExecutorService k = Executors.newSingleThreadExecutor(new di.n(5));
    public int Z = 1;
    public int a0 = 1;
    public float v = 1.0f;
    public long L = 1;
    public final l0 W = new l0(this, 0);
    public final androidx.activity.i X = new androidx.activity.i(this, 26);

    public x0(o0 o0Var) {
        a4.l lVar = new a4.l(this, 27);
        this.Y = new e2.z(this, 2);
        u();
        Context context = o0Var.a;
        Context applicationContext = context.getApplicationContext();
        Context context2 = applicationContext == null ? context : applicationContext;
        this.a = context2;
        TextureView textureView = o0Var.b;
        this.b = textureView;
        File file = o0Var.c;
        this.c = file == null ? context2.getCacheDir() : file;
        this.r = o0Var.d;
        v0 v0Var = o0Var.e;
        this.n = v0Var;
        int i10 = o0Var.h;
        this.o = i10;
        r0 r0Var = o0Var.f;
        s0 s0Var = o0Var.g;
        this.p = s0Var;
        this.q = 60000L;
        boolean z10 = o0Var.i;
        this.d = o0Var.j;
        this.e = o0Var.k;
        this.f = o0Var.l;
        p pVar = new p();
        this.m = pVar;
        StringBuilder sb2 = new StringBuilder("session created: device=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(" ");
        sb2.append(Build.MODEL);
        sb2.append(", sdk=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(", output=");
        sb2.append(v0Var.a);
        sb2.append("x");
        i0.a.t(sb2, v0Var.a, ", bitrate=", i10, ", cameraMode=");
        sb2.append(r0Var);
        sb2.append(", fps=");
        sb2.append(s0Var.a);
        sb2.append(", composition=");
        sb2.append(z10);
        sb2.append(", facing=");
        sb2.append(this.r);
        sb2.append(", maxDurationMs=60000");
        pVar.b(sb2.toString());
        this.l = new l(context2, textureView, v0Var, i10, r0Var, s0Var, z10, pVar, lVar);
    }

    public static long f(long j10) {
        return (System.nanoTime() - j10) / 1000000;
    }

    public static void u() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("RoundVideoSession must be used from the main thread");
        }
    }

    public final boolean a() {
        u();
        int i10 = this.Z;
        if (i10 == 10 || i10 == 8) {
            return false;
        }
        this.m.b("cancel requested: state=".concat(i0.a.A(i10)));
        b(3, true);
        e();
        s();
        w(10);
        if (!this.E && !this.l.Y()) {
            i();
            return true;
        }
        this.E = true;
        this.C = true;
        return true;
    }

    public final boolean b(int i10, boolean z10) {
        synchronized (this.g) {
            try {
                t0 t0Var = this.S;
                if (t0Var != null && t0Var.e && !z10) {
                    return false;
                }
                this.G = true;
                if (t0Var != null && !t0Var.d) {
                    t0Var.d = true;
                    this.m.b("output generation invalidated: id=" + t0Var.a + ", reason=" + i0.a.z(i10) + ", availableSize=" + t0Var.c);
                    this.k.execute(new k0(this, t0Var, i10, 2));
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
            long j10 = this.L;
            this.L = 1 + j10;
            t0 t0Var = new t0(j10, d);
            this.S = t0Var;
            this.T = new z(d, this.n.a, z10, this.m, new ag.m(17, this, t0Var));
            this.m.b("output generation started: id=" + j10 + ", includeAudio=" + z10 + ", file=" + d.getName());
            this.k.execute(new s(this, t0Var, d, 2));
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
        this.w = false;
        l lVar = this.l;
        lVar.U(0.0f);
        lVar.T(false);
        v(false);
    }

    public final void g() {
        if (this.G) {
            throw new IOException("Round-video operation was cancelled");
        }
    }

    public final void h(Exception exc) {
        int i10 = this.Z;
        if (i10 == 9 || i10 == 10) {
            return;
        }
        this.m.a("fatal error in state=".concat(i0.a.A(i10)), exc);
        if (b(4, false)) {
            e();
            s();
            this.i.removeCallbacks(this.W);
            t0 t0Var = this.S;
            if (t0Var != null) {
                this.k.execute(new k0(this, t0Var, exc));
            }
            w(9);
            m("error");
            d50 d50Var = (d50) this.d.a;
            d50Var.A();
            f8.g(exc, true);
            lz0 lz0Var = d50Var.S;
            if (lz0Var != null) {
                lz0Var.d(true);
            }
            d50Var.S = null;
            MediaController.B().Y(false);
            if (d50Var.f0) {
                d50Var.x(6);
            } else {
                zs.f(d50Var.f).k(zs.m2, Integer.valueOf(d50Var.h));
            }
            d50Var.z(false, false);
            if (!this.E && !this.l.Y()) {
                i();
            } else {
                this.E = true;
                this.C = true;
            }
        }
    }

    public final void i() {
        if (this.F) {
            return;
        }
        this.F = true;
        m("cancelled");
        l0 l0Var = new l0(this, 1);
        ExecutorService executorService = this.j;
        executorService.execute(l0Var);
        this.l.M();
        this.i.removeCallbacksAndMessages(null);
        executorService.shutdown();
        this.k.shutdown();
    }

    public final long j() {
        u();
        if (this.Z != 3) {
            return this.H;
        }
        return Math.min(this.q, (SystemClock.elapsedRealtime() + this.H) - this.I);
    }

    public final void k(t0 t0Var, int i10) {
        synchronized (this.g) {
            try {
                if (!t0Var.d && !t0Var.e) {
                    t0Var.d = true;
                    this.m.b("output generation invalidated: id=" + t0Var.a + ", reason=" + i0.a.z(i10) + ", availableSize=" + t0Var.c);
                    this.k.execute(new k0(this, t0Var, i10, 0));
                }
            } finally {
            }
        }
    }

    public final boolean l() {
        long j10 = this.N;
        if (j10 <= 0) {
            j10 = this.H;
        }
        return j10 > this.q || this.J > 0 || this.K + 10 < j10;
    }

    public final void m(String str) {
        if (this.R) {
            return;
        }
        this.R = true;
        t0 t0Var = this.S;
        p pVar = this.m;
        StringBuilder u10 = a1.g.u("session summary: terminal=", str, ", state=");
        u10.append(i0.a.A(this.Z));
        u10.append(", durationMs=");
        u10.append(j());
        u10.append(", pauses=");
        u10.append(this.O);
        u10.append(", resumes=");
        u10.append(this.P);
        u10.append(", cameraSwitches=");
        u10.append(this.Q);
        u10.append(", facing=");
        u10.append(this.s);
        u10.append(", cameraMode=");
        u10.append(this.t);
        u10.append(", generation=");
        u10.append(t0Var == null ? 0L : t0Var.a);
        u10.append(", availableSize=");
        u10.append(t0Var != null ? t0Var.c : 0L);
        pVar.b(u10.toString());
    }

    public final void n() {
        q0 q0Var = this.r;
        q0 q0Var2 = this.s;
        p0 p0Var = new p0(q0Var, q0Var2, this.a0, this.v);
        d50 d50Var = (d50) this.d.a;
        d50Var.R = p0Var;
        if (q0Var2 != null) {
            mi.e.j.b(q0Var2);
        }
        d50Var.B();
    }

    public final void o() {
        int i10 = this.Z;
        long j10 = this.H;
        long j11 = this.I;
        boolean z10 = this.z;
        boolean z11 = this.y;
        boolean z12 = this.w;
        long j12 = this.q;
        w0 w0Var = new w0(i10, j10, j11, j12, z10, z11, z12);
        d50 d50Var = (d50) this.d.a;
        w0 w0Var2 = d50Var.Q;
        int i11 = d50Var.f;
        int i12 = w0Var2 == null ? 0 : w0Var2.a;
        d50Var.Q = w0Var;
        if (i12 == 3 && i10 != 3) {
            d50Var.y(true);
        }
        d50Var.u0 = Math.max(d50Var.u0, j10);
        if (i10 == 3) {
            if (!d50Var.C0) {
                d50Var.C0 = true;
                zs.e().k(zs.j1, 512);
            }
            d50.n(d50Var);
            d50Var.setRecordingUiFrameClockActive(true);
            d50Var.D();
            if (!d50Var.f0) {
                d50Var.f0 = true;
                zs.f(i11).k(zs.l2, Integer.valueOf(d50Var.h), Boolean.FALSE);
            } else if (d50Var.g0) {
                d50Var.g0 = false;
                zs.f(i11).k(zs.p2, new Object[0]);
            }
        } else {
            d50Var.setRecordingUiFrameClockActive(false);
            d50Var.w.setProgress(j10 / j12);
        }
        if (i10 == 8 || i10 == 9 || i10 == 10) {
            d50Var.r();
            d50Var.A();
        }
        if (i12 == 3 && i10 == 4) {
            d50Var.x(2);
        }
        d50Var.B();
        if (d50Var.U != null && !d50Var.V) {
            org.telegram.messenger.i0.g3(new z40(d50Var, 1));
        }
        if (!z10 || d50Var.getWindowVisibility() == 0) {
            return;
        }
        org.telegram.messenger.i0.g3(new z40(d50Var, 2));
    }

    public final void p() {
        i2.i0 i0Var;
        u();
        if (this.Z != 5 || (i0Var = this.V) == null) {
            return;
        }
        i0Var.e();
        y(false);
        this.V.M0();
        this.d.getClass();
    }

    public final void q() {
        u();
        if (this.Z != 3) {
            return;
        }
        this.H = j();
        this.O++;
        this.m.b("pause requested: durationMs=" + this.H);
        e();
        this.i.removeCallbacks(this.W);
        w(4);
        boolean Y = this.l.Y();
        this.E = Y;
        if (Y) {
            return;
        }
        h(new IllegalStateException("Unable to stop the camera segment"));
    }

    public final void r() {
        i2.i0 i0Var;
        u();
        if (this.Z != 5 || (i0Var = this.V) == null) {
            return;
        }
        long M0 = i0Var.M0();
        long j10 = this.J;
        if (M0 < j10 || M0 >= this.K) {
            this.V.Z0(5, j10);
        }
        this.V.j();
        y(true);
    }

    public final void s() {
        this.i.removeCallbacks(this.X);
        this.z = false;
        i2.i0 i0Var = this.V;
        if (i0Var == null) {
            return;
        }
        i0Var.C(this.Y);
        i2.i0 i0Var2 = this.V;
        i0Var2.F1();
        TextureView textureView = this.b;
        if (textureView != null && textureView == i0Var2.X) {
            i0Var2.F1();
            i0Var2.s1();
            i0Var2.x1(null);
            i0Var2.q1(0, 0);
        }
        this.V.X0();
        this.V = null;
    }

    public final void t(File file, int i10, long j10, long j11, boolean z10, int i11) {
        long nanoTime = System.nanoTime();
        p pVar = this.m;
        StringBuilder s10 = a1.g.s(j10, "final range remux started: range=", "..");
        s10.append(j11);
        s10.append(", includeAudio=");
        s10.append(z10);
        s10.append(", reason=");
        s10.append(i0.a.z(i11));
        pVar.b(s10.toString());
        g();
        k(this.S, i11);
        c(z10);
        g();
        z zVar = this.T;
        int i12 = i10;
        int i13 = this.n.a;
        int i14 = this.o;
        if (i12 <= 0) {
            i12 = this.p.a;
        }
        k2.v0 a2 = w7.q.a(file, zVar, j10, j11, z10, new a3.l(i13, i14, i12));
        this.T.g();
        long h = this.T.h();
        p pVar2 = this.m;
        StringBuilder s11 = a1.g.s(h, "final range remux completed: durationMs=", ", requestedDurationMs=");
        s11.append(j11 - j10);
        s11.append(", actualStartMs=");
        s11.append(a2.a);
        s11.append(", mode=");
        s11.append((String) a2.c);
        s11.append(", size=");
        s11.append(this.T.a.length());
        s11.append(", elapsedMs=");
        s11.append(f(nanoTime));
        pVar2.b(s11.toString());
        g();
        this.k.execute(new j0(this, this.S, this.T.a, h, z10));
    }

    public final void v(boolean z10) {
        if (this.x == z10) {
            return;
        }
        this.x = z10;
        px pxVar = this.f;
        if (pxVar != null) {
            ((d50) pxVar.b).setScreenFlashEnabled(z10);
        }
    }

    public final void w(int i10) {
        int i11 = this.Z;
        this.Z = i10;
        this.m.b("state: " + i0.a.A(i11) + " -> " + i0.a.A(i10) + ", durationMs=" + j());
        o();
    }

    public final void x(float f7) {
        u();
        if (this.Z != 3 || this.y) {
            return;
        }
        this.l.U(Math.max(0.0f, Math.min(1.0f, f7)));
    }

    public final void y(boolean z10) {
        if (this.z == z10) {
            return;
        }
        this.z = z10;
        Handler handler = this.i;
        androidx.activity.i iVar = this.X;
        handler.removeCallbacks(iVar);
        if (z10) {
            handler.post(iVar);
        }
        this.d.getClass();
        o();
    }
}
