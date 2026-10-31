package ki;

import a3.l0;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import di.n;
import e2.z;
import i2.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import k2.t0;
import k2.u;
import ki.g;
import ki.i;
import ki.j;
import ki.k;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.f8;
import org.telegram.messenger.me;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class k {
    public static final hb.a H = new hb.a(10);
    public static final AtomicLong I = new AtomicLong(1);
    public i0 A;
    public byte[] B;
    public g C;
    public final e D;
    public final e E;
    public final Context a;
    public final File b;
    public final long c;
    public final i d;
    public final boolean e;
    public final m5.e f;
    public final m4.c g;
    public final b h;
    public org.telegram.utils.recorder.audio.d n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public volatile j z;
    public final Handler i = new Handler(Looper.getMainLooper());
    public final ExecutorService j = Executors.newSingleThreadExecutor(new n(2));
    public final ExecutorService k = Executors.newSingleThreadExecutor(new n(3));
    public final Object l = new Object();
    public final ArrayList m = new ArrayList();
    public int G = 1;
    public long t = 1;
    public final z F = new z(this, 1);

    /* JADX WARN: Type inference failed for: r4v3, types: [ki.e] */
    /* JADX WARN: Type inference failed for: r4v4, types: [ki.e] */
    public k(t0 t0Var) {
        q();
        Context context = (Context) t0Var.a;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.a = context;
        File file = (File) t0Var.c;
        this.b = file == null ? context.getCacheDir() : file;
        this.c = 700L;
        i iVar = (i) t0Var.d;
        this.d = iVar;
        this.e = t0Var.b;
        this.f = (m5.e) t0Var.e;
        this.g = (m4.c) t0Var.f;
        b bVar = new b((h) t0Var.g);
        this.h = bVar;
        final int i10 = 0;
        this.D = new Runnable(this) { // from class: ki.e
            public final /* synthetic */ k b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                i0 i0Var;
                switch (i10) {
                    case 0:
                        k kVar = this.b;
                        if (kVar.G == 3 && !kVar.w) {
                            kVar.w = true;
                            kVar.h.b("maximum duration reached: durationMs=" + kVar.j());
                            kVar.f.getClass();
                            kVar.n();
                            break;
                        }
                        break;
                    default:
                        k kVar2 = this.b;
                        if (kVar2.G == 5 && (i0Var = kVar2.A) != null && kVar2.u) {
                            long M0 = i0Var.M0();
                            long j10 = kVar2.r;
                            if (M0 < j10 || M0 >= kVar2.s) {
                                kVar2.A.Z0(5, j10);
                            }
                            m5.e eVar = kVar2.f;
                            kVar2.j();
                            eVar.getClass();
                            kVar2.i.postDelayed(kVar2.E, 32L);
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 1;
        this.E = new Runnable(this) { // from class: ki.e
            public final /* synthetic */ k b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                i0 i0Var;
                switch (i11) {
                    case 0:
                        k kVar = this.b;
                        if (kVar.G == 3 && !kVar.w) {
                            kVar.w = true;
                            kVar.h.b("maximum duration reached: durationMs=" + kVar.j());
                            kVar.f.getClass();
                            kVar.n();
                            break;
                        }
                        break;
                    default:
                        k kVar2 = this.b;
                        if (kVar2.G == 5 && (i0Var = kVar2.A) != null && kVar2.u) {
                            long M0 = i0Var.M0();
                            long j10 = kVar2.r;
                            if (M0 < j10 || M0 >= kVar2.s) {
                                kVar2.A.Z0(5, j10);
                            }
                            m5.e eVar = kVar2.f;
                            kVar2.j();
                            eVar.getClass();
                            kVar2.i.postDelayed(kVar2.E, 32L);
                            break;
                        }
                        break;
                }
            }
        };
        bVar.b("session created: device=" + Build.MANUFACTURER + " " + Build.MODEL + ", sdk=" + Build.VERSION.SDK_INT + ", sampleRate=48000, noiseSuppression=" + iVar + ", minimumDurationMs=700, maximumDurationMs=0");
    }

    public static void q() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("AudioRecordingSession must be used on the main thread");
        }
    }

    public static long r(long j10) {
        return (j10 * 1000) / 48000;
    }

    public final void a(j jVar, long j10) {
        if (j10 <= 0) {
            return;
        }
        synchronized (this.l) {
            try {
                if (jVar.d && !jVar.e) {
                    long j11 = jVar.c;
                    if (j10 > j11) {
                        jVar.c = j10;
                        this.k.execute(new c(this, jVar, j11, j10 - j11, 1));
                    }
                }
            } finally {
            }
        }
    }

    public final void b() {
        q();
        int i10 = this.G;
        if (i10 == 10 || i10 == 8) {
            return;
        }
        this.h.b("cancel requested: state=".concat(i0.a.y(i10)));
        e eVar = this.D;
        Handler handler = this.i;
        handler.removeCallbacks(eVar);
        handler.removeCallbacks(this.E);
        p();
        k(2);
        s(10);
        org.telegram.utils.recorder.audio.d dVar = this.n;
        if (dVar != null) {
            dVar.d();
        } else {
            c();
            t();
        }
    }

    public final void c() {
        if (this.x) {
            return;
        }
        this.x = true;
        g gVar = this.C;
        u uVar = new u(9, this, gVar == null ? null : (File) gVar.b);
        try {
            this.j.execute(uVar);
        } catch (RejectedExecutionException unused) {
            uVar.run();
        }
    }

    public final j d() {
        File f7 = f();
        long j10 = this.t;
        this.t = 1 + j10;
        j jVar = new j(j10, f7);
        synchronized (this.l) {
            this.z = jVar;
            this.k.execute(new l0(this, jVar, f7, 29));
        }
        b bVar = this.h;
        StringBuilder s10 = a1.g.s(j10, "output generation started: id=", ", file=");
        s10.append(f7.getName());
        bVar.b(s10.toString());
        return jVar;
    }

    public final ae.j e() {
        return new ae.j(this.G);
    }

    public final File f() {
        File file = new File(this.b, "audio_recording_voice_" + System.currentTimeMillis() + "_" + I.getAndIncrement() + ".ogg");
        synchronized (this.m) {
            this.m.add(file);
        }
        return file;
    }

    public final void g(Exception exc) {
        int i10 = this.G;
        if (i10 == 9 || i10 == 10 || i10 == 8) {
            return;
        }
        this.h.a("fatal error in state=".concat(i0.a.y(i10)), exc);
        Handler handler = this.i;
        handler.removeCallbacks(this.D);
        handler.removeCallbacks(this.E);
        p();
        k(3);
        s(9);
        j jVar = this.z;
        if (jVar != null) {
            this.k.execute(new c(this, jVar, exc));
        }
        MediaController mediaController = ((me) this.f.b).a;
        String[] strArr = MediaController.U1;
        f8.e("AudioRecorderV2 failed", exc);
        zs.f(mediaController.g1).k(zs.m2, Integer.valueOf(mediaController.f1));
        mediaController.x(false);
        org.telegram.utils.recorder.audio.d dVar = this.n;
        if (dVar != null) {
            dVar.d();
        } else {
            c();
            t();
        }
        l("error");
    }

    public final void h() {
        q();
        int i10 = this.G;
        if (i10 == 3 || i10 == 5) {
            this.h.b("finish requested: state=" + i0.a.y(this.G) + ", durationMs=" + j() + ", trim=" + this.r + ".." + this.s);
            if (this.G == 3) {
                this.v = true;
                this.i.removeCallbacks(this.D);
                s(7);
                this.n.d();
                return;
            }
            p();
            s(7);
            final j jVar = this.z;
            if (jVar == null) {
                g(new IllegalStateException("Output generation is missing"));
                return;
            }
            long r10 = r(this.p);
            final long j10 = this.r;
            if (j10 == 0 && this.s == r10) {
                i();
                return;
            }
            final long j11 = this.s;
            k(1);
            final j d = d();
            this.j.execute(new Runnable() { // from class: org.telegram.utils.recorder.audio.e
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    k kVar;
                    j jVar2 = jVar;
                    j jVar3 = d;
                    long j12 = j10;
                    long j13 = j11;
                    k kVar2 = k.this;
                    Handler handler = kVar2.i;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    try {
                        String absolutePath = jVar2.b.getAbsolutePath();
                        File file = jVar3.b;
                        String absolutePath2 = file.getAbsolutePath();
                        try {
                            if (!AudioRecorderNative.b(absolutePath, absolutePath2, j12, j13)) {
                                throw new IllegalStateException("Unable to trim final Opus output");
                            }
                            kVar2.h.b("final trim completed: source=" + jVar2.b.getName() + ", output=" + file.getName() + ", trim=" + j12 + ".." + j13 + ", bytes=" + file.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                            kVar2.a(jVar3, file.length());
                            handler.post(new ki.d(kVar2, j13, j12, 0));
                        } catch (Throwable th2) {
                            th = th2;
                            kVar = absolutePath2;
                            handler.post(new u(8, kVar, th));
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        kVar = kVar2;
                    }
                }
            });
        }
    }

    public final void i() {
        if (this.G != 7) {
            return;
        }
        j jVar = this.z;
        if (jVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        long j10 = j();
        if (j10 >= this.c) {
            this.j.execute(new org.telegram.utils.recorder.audio.b(j10, jVar, this));
            return;
        }
        this.h.b("recording rejected as too short: durationMs=" + j10);
        MediaController mediaController = ((me) this.f.b).a;
        zs.f(mediaController.g1).k(zs.t2, Integer.valueOf(mediaController.f1), Boolean.FALSE, Integer.valueOf((int) j10));
        mediaController.x(false);
        k(2);
        s(10);
        c();
        t();
        l("too_short");
    }

    public final long j() {
        q();
        return r(this.p + this.q);
    }

    public final void k(int i10) {
        synchronized (this.l) {
            j jVar = this.z;
            if (jVar != null && jVar.d && !jVar.e) {
                jVar.d = false;
                this.k.execute(new c(this, jVar, i10));
                b bVar = this.h;
                StringBuilder sb2 = new StringBuilder("output generation invalidated: id=");
                sb2.append(jVar.a);
                sb2.append(", reason=");
                sb2.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? "null" : "ERROR" : "CANCELLED" : "REBUILT");
                bVar.b(sb2.toString());
            }
        }
    }

    public final void l(String str) {
        if (this.y) {
            return;
        }
        this.y = true;
        StringBuilder u10 = a1.g.u("session summary: terminal=", str, ", durationMs=");
        u10.append(r(this.p + this.q));
        u10.append(", generations=");
        u10.append(this.t - 1);
        this.h.b(u10.toString());
    }

    public final void m() {
        ae.j e = e();
        m5.e eVar = this.f;
        MediaController mediaController = ((me) eVar.b).a;
        int i10 = e.a;
        e0.h hVar = (e0.h) eVar.c;
        int i11 = hVar.a;
        hVar.a = i10;
        if (i10 == 3) {
            boolean z10 = hVar.b;
            if (!z10 && i11 == 2) {
                System.currentTimeMillis();
                String[] strArr = MediaController.U1;
                if (!mediaController.H1) {
                    zs.f(mediaController.g1).k(zs.l2, Integer.valueOf(mediaController.f1), Boolean.TRUE);
                }
            } else if (!z10 && i11 == 6) {
                mediaController.Y(true);
                zs.f(mediaController.g1).k(zs.p2, new Object[0]);
            }
            if (hVar.b) {
                if (i10 == 3 || i10 == 5) {
                    hVar.b = false;
                    ((k) hVar.e).h();
                }
            }
        }
    }

    public final boolean n() {
        q();
        if (this.G != 3 || this.n == null) {
            return false;
        }
        this.h.b("pause requested: durationMs=" + j());
        this.i.removeCallbacks(this.D);
        s(4);
        this.n.d();
        return true;
    }

    public final void o() {
        q();
        int i10 = this.G;
        if (i10 == 10) {
            return;
        }
        if (i10 != 8) {
            b();
            return;
        }
        p();
        c();
        s(10);
        l("released");
    }

    public final void p() {
        this.i.removeCallbacks(this.E);
        this.u = false;
        i0 i0Var = this.A;
        if (i0Var != null) {
            i0Var.C(this.F);
            this.A.X0();
            this.A = null;
        }
    }

    public final void s(int i10) {
        int i11 = this.G;
        if (i11 == i10) {
            return;
        }
        this.G = i10;
        this.h.b("state: " + i0.a.y(i11) + " -> " + i0.a.y(i10) + ", durationMs=" + r(this.p + this.q));
        m();
    }

    public final void t() {
        this.j.shutdown();
        this.k.shutdown();
    }

    public final void u(long j10, long j11, File file) {
        long j12 = this.o + 1;
        this.o = j12;
        j jVar = this.z;
        if (jVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        final org.telegram.utils.recorder.audio.d dVar = new org.telegram.utils.recorder.audio.d(jVar.b, file, j10, j11, this.d, this.h, new g(j12, jVar, this));
        this.n = dVar;
        this.q = 0L;
        dVar.k.post(new Runnable() { // from class: org.telegram.utils.recorder.audio.a
            @Override // java.lang.Runnable
            public final void run() {
                String str;
                d dVar2 = d.this;
                File file2 = dVar2.b;
                ki.b bVar = dVar2.f;
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AudioRecorderNative a2 = AudioRecorderNative.a(dVar2.c, dVar2.d, dVar2.a, dVar2.b);
                    dVar2.t = a2;
                    if (a2 == null) {
                        throw new IllegalStateException("Unable to initialize native Opus recorder");
                    }
                    if (dVar2.e == i.b) {
                        AudioNoiseSuppressor a10 = AudioNoiseSuppressor.a();
                        dVar2.u = a10;
                        if (a10 == null) {
                            bVar.b("RNNoise unavailable; recording unprocessed PCM");
                        } else {
                            bVar.b("RNNoise started: sampleRate=48000, captureFrameSamples=960");
                        }
                    }
                    long d = dVar2.t.d();
                    StringBuilder sb2 = new StringBuilder("Opus encoder started: prefix=");
                    if (file2 == null) {
                        str = "none";
                    } else {
                        str = file2.getName() + " " + dVar2.c + ".." + dVar2.d;
                    }
                    sb2.append(str);
                    sb2.append(", initialBytes=");
                    sb2.append(d);
                    sb2.append(", queuedChunks=");
                    sb2.append(dVar2.m.get());
                    sb2.append(", elapsedMs=");
                    sb2.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                    bVar.b(sb2.toString());
                    dVar2.x = SystemClock.elapsedRealtime();
                    if (d > 0) {
                        g gVar = dVar2.g;
                        ((k) gVar.c).a((j) gVar.b, d);
                    }
                } catch (Throwable th2) {
                    if (dVar2.v != null) {
                        return;
                    }
                    dVar2.f.a("encoding failed", th2);
                    dVar2.v = d.a(th2);
                    dVar2.n = true;
                }
            }
        });
        dVar.i.post(new a(dVar, 0));
    }
}
