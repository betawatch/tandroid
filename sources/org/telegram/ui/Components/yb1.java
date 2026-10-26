package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.view.Choreographer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class yb1 {
    public boolean A;
    public volatile boolean B;
    public int C;
    public vb1 D;
    public vb1 E;
    public JSONObject F;
    public boolean G;
    public xb1 H;
    public volatile b3 I;
    public volatile b3 J;
    public xb1 K;
    public String L;
    public final na1 M;
    public final na1 N;
    public final na1 O;
    public final sb1 P;
    public final Context c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;
    public final float h;
    public volatile int p;
    public volatile boolean q;
    public volatile long r;
    public volatile boolean s;
    public volatile boolean t;
    public volatile boolean u;
    public volatile boolean v;
    public volatile boolean w;
    public String x;
    public boolean y;
    public boolean z;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final WidgetSandboxBackend b = new WidgetSandboxBackend(this);
    public final long i = System.nanoTime();
    public final AtomicBoolean j = new AtomicBoolean();
    public final AtomicBoolean k = new AtomicBoolean();
    public final AtomicBoolean l = new AtomicBoolean();
    public final AtomicBoolean m = new AtomicBoolean();
    public final AtomicBoolean n = new AtomicBoolean();
    public final Object o = new Object();

    /* JADX WARN: Type inference failed for: r0v13, types: [org.telegram.ui.Components.sb1] */
    public yb1(Context context, String str, String str2, int i10, String str3, String str4) {
        new JSONObject();
        this.M = new na1(this, 5);
        this.N = new na1(this, 3);
        this.O = new na1(this, 4);
        this.P = new Choreographer.FrameCallback() { // from class: org.telegram.ui.Components.sb1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                yb1 yb1Var = yb1.this;
                yb1Var.z = false;
                long j11 = yb1Var.r;
                if (yb1Var.s || j11 == 0) {
                    return;
                }
                if (yb1Var.k.compareAndSet(false, true)) {
                    WidgetSandboxNative.tick(j11, (j10 - yb1Var.i) / 1000000.0f, yb1Var.B && yb1Var.l.getAndSet(false), yb1Var.B && (yb1Var.n.getAndSet(false) || yb1Var.m.get()), yb1Var.j.getAndSet(false));
                }
            }
        };
        if (i10 < 1 || i10 > 4) {
            throw new IllegalArgumentException("CPU multiplier must be 1..4");
        }
        this.c = context.getApplicationContext();
        this.d = str;
        this.x = str2;
        str2.contains("\"dark\"");
        this.e = i10;
        this.f = str3 == null ? "en-US" : str3;
        this.g = str4 == null ? "{}" : str4;
        this.h = context.getResources().getDisplayMetrics().density;
    }

    public final void a() {
        if (this.s) {
            return;
        }
        this.s = true;
        this.H = null;
        this.a.removeCallbacks(this.N);
        this.a.removeCallbacks(this.M);
        this.a.removeCallbacks(this.O);
        if (this.z) {
            Choreographer.getInstance().removeFrameCallback(this.P);
        }
        this.z = false;
        synchronized (this.o) {
            try {
                vb1 vb1Var = this.E;
                if (vb1Var != null) {
                    vb1Var.a.c();
                }
                this.E = null;
                this.F = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        long j10 = this.r;
        this.r = 0L;
        if (j10 != 0) {
            qb1.a.execute(new ub1(j10));
        }
    }

    public final void b(cb1 cb1Var, wb1[] wb1VarArr, double d, int i10, int i11, float f7, float f10, int i12, int i13, int i14, dc1 dc1Var) {
        Object obj;
        boolean z10 = this.u;
        Object obj2 = this.o;
        synchronized (obj2) {
            try {
                try {
                    if (this.s) {
                        cb1Var.c();
                        return;
                    }
                    vb1 vb1Var = this.E;
                    if (vb1Var != null) {
                        vb1Var.a.c();
                    }
                    try {
                        this.E = new vb1(cb1Var, wb1VarArr, d, i10, i11, f7, f10, i12, i13, i14, dc1Var, z10, this.w);
                        if (!this.G) {
                            this.G = true;
                            this.a.post(this.M);
                        }
                        this.p = i11;
                        this.q = true;
                    } catch (Throwable th2) {
                        th = th2;
                        obj = obj2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = obj2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final void c() {
        if (this.s || this.r == 0 || this.z || this.k.get()) {
            return;
        }
        if (!this.j.get()) {
            if (!this.B) {
                return;
            }
            if (!this.l.get() && !this.m.get() && !this.n.get()) {
                return;
            }
        }
        this.z = true;
        Choreographer.getInstance().postFrameCallback(this.P);
    }

    public final void d(String str) {
        if (this.s || str == null || str.equals(this.x)) {
            return;
        }
        this.x = str;
        str.contains("\"dark\"");
        long j10 = this.r;
        if (j10 != 0) {
            WidgetSandboxNative.theme(j10, str.getBytes(StandardCharsets.UTF_8));
        }
    }

    public final void e(boolean z10) {
        if (this.s || this.B == z10) {
            return;
        }
        this.B = z10;
        long j10 = this.r;
        if (j10 != 0) {
            WidgetSandboxNative.visible(j10, z10);
        }
        if (z10) {
            c();
        }
    }

    public final void f(final int i10) {
        final long j10;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Start WidgetSandboxSession off UI");
        }
        if (this.C == 0) {
            this.C = i10;
        }
        Trace.beginSection("WidgetSandbox:Create");
        try {
            try {
                String absolutePath = qb1.a(this.c).getAbsolutePath();
                if (this.s) {
                    return;
                }
                Charset charset = StandardCharsets.UTF_8;
                byte[] bytes = absolutePath.getBytes(charset);
                byte[] bytes2 = this.d.getBytes(charset);
                byte[] bytes3 = this.x.getBytes(charset);
                float f7 = this.h;
                j10 = WidgetSandboxNative.create(bytes, bytes2, bytes3, i10 / f7, f7, this.e, this.f.getBytes(charset), this.g.getBytes(charset), LocaleController.getString(R.string.WidgetStopped).getBytes(charset), this.B, this.b);
                try {
                    final String str = this.x;
                    this.a.post(new Runnable() { // from class: org.telegram.ui.Components.rb1
                        @Override // java.lang.Runnable
                        public final void run() {
                            yb1 yb1Var = yb1.this;
                            long j11 = j10;
                            int i11 = i10;
                            String str2 = str;
                            if (yb1Var.s) {
                                qb1.a.execute(new ub1(j11));
                                return;
                            }
                            yb1Var.r = j11;
                            int i12 = yb1Var.C;
                            if (i12 != i11 && i12 > 0) {
                                WidgetSandboxNative.width(j11, i12 / yb1Var.h);
                            }
                            if (!yb1Var.x.equals(str2)) {
                                WidgetSandboxNative.theme(j11, yb1Var.x.getBytes(StandardCharsets.UTF_8));
                            }
                            yb1Var.y = true;
                            WidgetSandboxNative.visible(j11, yb1Var.B);
                            yb1Var.c();
                        }
                    });
                } catch (Exception e) {
                    e = e;
                    if (j10 != 0) {
                        qb1.a.execute(new ub1(j10));
                    }
                    this.a.post(new c71(12, this, e));
                    throw e;
                }
            } catch (Exception e10) {
                e = e10;
                j10 = 0;
            }
        } finally {
            Trace.endSection();
        }
    }
}
