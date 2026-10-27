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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class dc1 {
    public boolean A;
    public boolean B;
    public volatile boolean C;
    public int D;
    public ac1 E;
    public ac1 F;
    public JSONObject G;
    public boolean H;
    public cc1 I;
    public volatile b3 J;
    public volatile b3 K;
    public cc1 L;
    public String M;
    public final oa1 N;
    public final oa1 O;
    public final oa1 P;
    public final xb1 Q;
    public final Context c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;
    public final float i;
    public volatile int q;
    public volatile boolean r;
    public volatile long s;
    public volatile boolean t;
    public volatile boolean u;
    public volatile boolean v;
    public volatile boolean w;
    public volatile boolean x;
    public String y;
    public boolean z;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final WidgetSandboxBackend b = new WidgetSandboxBackend(this);
    public volatile String h = "{}";
    public final long j = System.nanoTime();
    public final AtomicBoolean k = new AtomicBoolean();
    public final AtomicBoolean l = new AtomicBoolean();
    public final AtomicBoolean m = new AtomicBoolean();
    public final AtomicBoolean n = new AtomicBoolean();
    public final AtomicBoolean o = new AtomicBoolean();
    public final Object p = new Object();

    /* JADX WARN: Type inference failed for: r1v12, types: [org.telegram.ui.Components.xb1] */
    public dc1(Context context, String str, String str2, int i10, String str3, String str4) {
        new JSONObject();
        this.N = new oa1(this, 3);
        this.O = new oa1(this, 4);
        this.P = new oa1(this, 5);
        this.Q = new Choreographer.FrameCallback() { // from class: org.telegram.ui.Components.xb1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                dc1 dc1Var = dc1.this;
                dc1Var.A = false;
                long j11 = dc1Var.s;
                if (dc1Var.t || j11 == 0) {
                    return;
                }
                if (dc1Var.l.compareAndSet(false, true)) {
                    WidgetSandboxNative.tick(j11, (j10 - dc1Var.j) / 1000000.0f, dc1Var.C && dc1Var.m.getAndSet(false), dc1Var.C && (dc1Var.o.getAndSet(false) || dc1Var.n.get()), dc1Var.k.getAndSet(false));
                }
            }
        };
        if (i10 < 1 || i10 > 4) {
            throw new IllegalArgumentException("CPU multiplier must be 1..4");
        }
        this.c = context.getApplicationContext();
        this.d = str;
        this.y = str2;
        str2.contains("\"dark\"");
        this.e = i10;
        this.f = str3 == null ? "en-US" : str3;
        this.g = str4 == null ? "{}" : str4;
        this.i = context.getResources().getDisplayMetrics().density;
    }

    public final void a(int i10, String str, long j10) {
        long j11 = this.s;
        if (this.t || j11 == 0) {
            return;
        }
        WidgetSandboxNative.answerRequest(j11, j10, i10, str == null ? null : str.getBytes(StandardCharsets.UTF_8));
    }

    public final void b() {
        if (this.t) {
            return;
        }
        this.t = true;
        this.I = null;
        this.a.removeCallbacks(this.O);
        this.a.removeCallbacks(this.N);
        this.a.removeCallbacks(this.P);
        if (this.A) {
            Choreographer.getInstance().removeFrameCallback(this.Q);
        }
        this.A = false;
        synchronized (this.p) {
            try {
                ac1 ac1Var = this.F;
                if (ac1Var != null) {
                    ac1Var.a.c();
                }
                this.F = null;
                this.G = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        long j10 = this.s;
        this.s = 0L;
        if (j10 != 0) {
            vb1.a.execute(new zb1(j10));
        }
    }

    public final void c(db1 db1Var, bc1[] bc1VarArr, double d, int i10, int i11, float f7, float f10, int i12, int i13, int i14, ic1 ic1Var) {
        Object obj;
        boolean z10 = this.v;
        Object obj2 = this.p;
        synchronized (obj2) {
            try {
                try {
                    if (this.t) {
                        db1Var.c();
                        return;
                    }
                    ac1 ac1Var = this.F;
                    if (ac1Var != null) {
                        ac1Var.a.c();
                    }
                    try {
                        this.F = new ac1(db1Var, bc1VarArr, d, i10, i11, f7, f10, i12, i13, i14, ic1Var, z10, this.x);
                        if (!this.H) {
                            this.H = true;
                            this.a.post(this.N);
                        }
                        this.q = i11;
                        this.r = true;
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

    public final void d() {
        if (this.t || this.s == 0 || this.A || this.l.get()) {
            return;
        }
        if (!this.k.get()) {
            if (!this.C) {
                return;
            }
            if (!this.m.get() && !this.n.get() && !this.o.get()) {
                return;
            }
        }
        this.A = true;
        Choreographer.getInstance().postFrameCallback(this.Q);
    }

    public final void e(String str) {
        if (this.t || str == null || str.equals(this.y)) {
            return;
        }
        this.y = str;
        str.contains("\"dark\"");
        long j10 = this.s;
        if (j10 != 0) {
            WidgetSandboxNative.theme(j10, str.getBytes(StandardCharsets.UTF_8));
        }
    }

    public final void f(boolean z10) {
        if (this.t || this.C == z10) {
            return;
        }
        this.C = z10;
        long j10 = this.s;
        if (j10 != 0) {
            WidgetSandboxNative.visible(j10, z10);
        }
        if (z10) {
            d();
        }
    }

    public final void g(final int i10) {
        final long j10;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Start WidgetSandboxSession off UI");
        }
        if (this.D == 0) {
            this.D = i10;
        }
        Trace.beginSection("WidgetSandbox:Create");
        try {
            try {
                String absolutePath = vb1.a(this.c).getAbsolutePath();
                if (this.t) {
                    return;
                }
                Charset charset = StandardCharsets.UTF_8;
                byte[] bytes = absolutePath.getBytes(charset);
                byte[] bytes2 = this.d.getBytes(charset);
                byte[] bytes3 = this.y.getBytes(charset);
                float f7 = this.i;
                j10 = WidgetSandboxNative.create(bytes, bytes2, bytes3, i10 / f7, f7, this.e, this.f.getBytes(charset), this.g.getBytes(charset), this.h.getBytes(charset), LocaleController.getString(R.string.WidgetStopped).getBytes(charset), this.C, this.b);
                try {
                    final String str = this.y;
                    this.a.post(new Runnable() { // from class: org.telegram.ui.Components.wb1
                        @Override // java.lang.Runnable
                        public final void run() {
                            dc1 dc1Var = dc1.this;
                            long j11 = j10;
                            int i11 = i10;
                            String str2 = str;
                            if (dc1Var.t) {
                                vb1.a.execute(new zb1(j11));
                                return;
                            }
                            dc1Var.s = j11;
                            int i12 = dc1Var.D;
                            if (i12 != i11 && i12 > 0) {
                                WidgetSandboxNative.width(j11, i12 / dc1Var.i);
                            }
                            if (!dc1Var.y.equals(str2)) {
                                WidgetSandboxNative.theme(j11, dc1Var.y.getBytes(StandardCharsets.UTF_8));
                            }
                            dc1Var.z = true;
                            WidgetSandboxNative.visible(j11, dc1Var.C);
                            dc1Var.d();
                        }
                    });
                } catch (Exception e) {
                    e = e;
                    if (j10 != 0) {
                        vb1.a.execute(new zb1(j10));
                    }
                    this.a.post(new d71(13, this, e));
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
