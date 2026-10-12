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
import ji.d4;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.xv;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class u0 {
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
    public volatile q0 P;
    public volatile x Q;
    public volatile File R;
    public i2.h0 S;
    public final e2.z V;
    public final Context a;
    public final TextureView b;
    public final File c;
    public final l2.f d;
    public final r0 e;
    public final xv f;
    public final l l;
    public final p m;
    public final s0 n;
    public final long o;
    public n0 p;
    public n0 q;
    public o0 r;
    public p0 s;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public final Object g = new Object();
    public final Matrix h = new Matrix();
    public final Handler i = new Handler(Looper.getMainLooper());
    public final ExecutorService j = Executors.newSingleThreadExecutor(new e2.l0(1));
    public final ExecutorService k = Executors.newSingleThreadExecutor(new e2.l0(2));
    public int W = 1;
    public int X = 1;
    public float t = 1.0f;
    public long I = 1;
    public final f0 T = new f0(this, 1);
    public final androidx.activity.i U = new androidx.activity.i(this, 24);

    public u0(l0 l0Var) {
        d4 d4Var = new d4(this, 3);
        this.V = new e2.z(this, 1);
        t();
        Context context = l0Var.a;
        Context applicationContext = context.getApplicationContext();
        Context context2 = applicationContext == null ? context : applicationContext;
        this.a = context2;
        TextureView textureView = l0Var.b;
        this.b = textureView;
        File file = l0Var.c;
        this.c = file == null ? context2.getCacheDir() : file;
        this.p = l0Var.d;
        s0 s0Var = l0Var.e;
        this.n = s0Var;
        int i10 = l0Var.h;
        o0 o0Var = l0Var.f;
        p0 p0Var = l0Var.g;
        this.o = 60000L;
        boolean z10 = l0Var.i;
        this.d = l0Var.j;
        this.e = l0Var.k;
        this.f = l0Var.l;
        p pVar = new p();
        this.m = pVar;
        StringBuilder sb2 = new StringBuilder("session created: device=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(" ");
        sb2.append(Build.MODEL);
        sb2.append(", sdk=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(", output=");
        sb2.append(s0Var.a);
        sb2.append("x");
        i2.d.u(sb2, s0Var.a, ", bitrate=", i10, ", cameraMode=");
        sb2.append(o0Var);
        sb2.append(", fps=");
        sb2.append(p0Var.a);
        sb2.append(", composition=");
        sb2.append(z10);
        sb2.append(", facing=");
        sb2.append(this.p);
        sb2.append(", maxDurationMs=60000");
        pVar.b(sb2.toString());
        this.l = new l(context2, textureView, s0Var, i10, o0Var, p0Var, z10, pVar, d4Var);
    }

    public static long f(long j10) {
        return (System.nanoTime() - j10) / 1000000;
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
        this.m.b("cancel requested: state=".concat(i2.d.C(i10)));
        if (b(3)) {
            e();
            r();
            v(10);
            if (!this.B && !this.l.Y()) {
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
                q0 q0Var = this.P;
                if (q0Var != null && q0Var.e) {
                    return false;
                }
                this.D = true;
                if (q0Var != null && !q0Var.d) {
                    q0Var.d = true;
                    this.m.b("output generation invalidated: id=" + q0Var.a + ", reason=" + i2.d.B(i10) + ", availableSize=" + q0Var.c);
                    this.k.execute(new i0(this, q0Var, i10, 1));
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
            long j10 = this.I;
            this.I = 1 + j10;
            q0 q0Var = new q0(j10, d);
            this.P = q0Var;
            this.Q = new x(d, this.n.a, z10, this.m, new ah.h0(24, this, q0Var));
            this.m.b("output generation started: id=" + j10 + ", includeAudio=" + z10 + ", file=" + d.getName());
            this.k.execute(new hg.t(this, q0Var, d, 26));
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
        l lVar = this.l;
        lVar.U(0.0f);
        lVar.T(false);
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
        this.m.a("fatal error in state=".concat(i2.d.C(i10)), exc);
        if (b(4)) {
            e();
            r();
            this.i.removeCallbacks(this.T);
            q0 q0Var = this.P;
            if (q0Var != null) {
                this.k.execute(new i0(this, q0Var, exc));
            }
            v(9);
            m("error");
            o60 o60Var = (o60) this.d.b;
            o60Var.x();
            FileLog.e(exc);
            c11 c11Var = o60Var.T;
            if (c11Var != null) {
                c11Var.d(true);
            }
            o60Var.T = null;
            MediaController.getInstance().requestRecordAudioFocus(false);
            if (o60Var.f0) {
                o60Var.u(6);
            } else {
                NotificationCenter.getInstance(o60Var.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStartError, Integer.valueOf(o60Var.n));
            }
            o60Var.w(false, false);
            if (!this.B && !this.l.Y()) {
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
        f0 f0Var = new f0(this, 0);
        ExecutorService executorService = this.j;
        executorService.execute(f0Var);
        this.l.M();
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

    public final void k(q0 q0Var, int i10) {
        synchronized (this.g) {
            try {
                if (!q0Var.d && !q0Var.e) {
                    q0Var.d = true;
                    this.m.b("output generation invalidated: id=" + q0Var.a + ", reason=" + i2.d.B(i10) + ", availableSize=" + q0Var.c);
                    this.k.execute(new i0(this, q0Var, i10, 0));
                }
            } finally {
            }
        }
    }

    public final boolean l() {
        long j10 = this.K;
        if (j10 <= 0) {
            j10 = this.E;
        }
        return j10 > this.o || this.G > 0 || this.H + 10 < j10;
    }

    public final void m(String str) {
        if (this.O) {
            return;
        }
        this.O = true;
        q0 q0Var = this.P;
        p pVar = this.m;
        StringBuilder v = a1.g.v("session summary: terminal=", str, ", state=");
        v.append(i2.d.C(this.W));
        v.append(", durationMs=");
        v.append(j());
        v.append(", pauses=");
        v.append(this.L);
        v.append(", resumes=");
        v.append(this.M);
        v.append(", cameraSwitches=");
        v.append(this.N);
        v.append(", facing=");
        v.append(this.q);
        v.append(", cameraMode=");
        v.append(this.r);
        v.append(", generation=");
        v.append(q0Var == null ? 0L : q0Var.a);
        v.append(", availableSize=");
        v.append(q0Var != null ? q0Var.c : 0L);
        pVar.b(v.toString());
    }

    public final void n() {
        n0 n0Var = this.p;
        n0 n0Var2 = this.q;
        m0 m0Var = new m0(n0Var, n0Var2, this.X, this.t);
        o60 o60Var = (o60) this.d.b;
        o60Var.S = m0Var;
        if (n0Var2 != null) {
            si.e.j.b(n0Var2);
        }
        o60Var.y();
    }

    public final void o() {
        int i10 = this.W;
        long j10 = this.E;
        long j11 = this.F;
        boolean z10 = this.w;
        boolean z11 = this.u;
        long j12 = this.o;
        t0 t0Var = new t0(i10, j10, j11, j12, z10, z11);
        o60 o60Var = (o60) this.d.b;
        t0 t0Var2 = o60Var.R;
        int i11 = o60Var.h;
        int i12 = t0Var2 == null ? 0 : t0Var2.a;
        o60Var.R = t0Var;
        if (i12 == 3 && i10 != 3) {
            o60Var.v(true);
        }
        o60Var.u0 = Math.max(o60Var.u0, j10);
        if (i10 == 3) {
            if (!o60Var.C0) {
                o60Var.C0 = true;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            }
            o60.m(o60Var);
            o60Var.setRecordingUiFrameClockActive(true);
            o60Var.A();
            if (!o60Var.f0) {
                o60Var.f0 = true;
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(o60Var.n), Boolean.FALSE);
            } else if (o60Var.g0) {
                o60Var.g0 = false;
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
            }
        } else {
            o60Var.setRecordingUiFrameClockActive(false);
            o60Var.w.setProgress(j10 / j12);
        }
        if (i10 == 8 || i10 == 9 || i10 == 10) {
            o60Var.q();
            o60Var.x();
        }
        if (i12 == 3 && i10 == 4) {
            o60Var.u(2);
        }
        o60Var.y();
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
        boolean Y = this.l.Y();
        this.B = Y;
        if (Y) {
            return;
        }
        h(new IllegalStateException("Unable to stop the camera segment"));
    }

    public final void q() {
        i2.h0 h0Var;
        t();
        if (this.W != 5 || (h0Var = this.S) == null) {
            return;
        }
        long M0 = h0Var.M0();
        long j10 = this.G;
        if (M0 < j10 || M0 >= this.H) {
            this.S.Z0(5, j10);
        }
        this.S.i();
        x(true);
    }

    public final void r() {
        this.i.removeCallbacks(this.U);
        this.x = false;
        i2.h0 h0Var = this.S;
        if (h0Var == null) {
            return;
        }
        h0Var.C(this.V);
        i2.h0 h0Var2 = this.S;
        h0Var2.F1();
        TextureView textureView = this.b;
        if (textureView != null && textureView == h0Var2.X) {
            h0Var2.F1();
            h0Var2.s1();
            h0Var2.x1(null);
            h0Var2.q1(0, 0);
        }
        this.S.X0();
        this.S = null;
    }

    public final void s(File file, long j10, long j11, boolean z10, int i10) {
        long nanoTime = System.nanoTime();
        p pVar = this.m;
        StringBuilder t10 = a1.g.t(j10, "final range remux started: range=", "..");
        t10.append(j11);
        t10.append(", includeAudio=");
        t10.append(z10);
        t10.append(", reason=");
        t10.append(i2.d.B(i10));
        pVar.b(t10.toString());
        g();
        k(this.P, i10);
        c(z10);
        g();
        a3.z a2 = w7.p.a(file, this.Q, j10, j11, z10);
        this.Q.g();
        long e = w7.p.e(this.Q.a) / 1000;
        p pVar2 = this.m;
        StringBuilder t11 = a1.g.t(e, "final range remux completed: durationMs=", ", requestedDurationMs=");
        t11.append(a2.b);
        t11.append(", actualStartMs=");
        t11.append(a2.a);
        t11.append(", size=");
        t11.append(this.Q.a.length());
        t11.append(", elapsedMs=");
        t11.append(f(nanoTime));
        pVar2.b(t11.toString());
        g();
        this.k.execute(new j0(this, this.P, this.Q.a, e, z10));
    }

    public final void u(boolean z10) {
        if (this.v == z10) {
            return;
        }
        this.v = z10;
        xv xvVar = this.f;
        if (xvVar != null) {
            ((o60) xvVar.b).setScreenFlashEnabled(z10);
        }
    }

    public final void v(int i10) {
        int i11 = this.W;
        this.W = i10;
        this.m.b("state: " + i2.d.C(i11) + " -> " + i2.d.C(i10) + ", durationMs=" + j());
        o();
    }

    public final void w(float f7) {
        t();
        if (this.W != 3 || this.w) {
            return;
        }
        this.l.U(Math.max(0.0f, Math.min(1.0f, f7)));
    }

    public final void x(boolean z10) {
        if (this.x == z10) {
            return;
        }
        this.x = z10;
        Handler handler = this.i;
        androidx.activity.i iVar = this.U;
        handler.removeCallbacks(iVar);
        if (z10) {
            handler.post(iVar);
        }
        this.d.getClass();
        o();
    }
}
