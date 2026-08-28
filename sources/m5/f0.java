package m5;

import android.content.Context;
import android.os.Handler;
import c2.u0;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f0 extends com.google.android.gms.common.api.j implements g0 {
    public static final q5.b G = new q5.b("CastClient", null);
    public static final com.google.android.gms.common.api.e H = new com.google.android.gms.common.api.e("Cast.API_CXLESS", new b7.d(8), q5.j.a);
    public final CastDevice A;
    public final HashMap B;
    public final HashMap C;
    public final n5.f0 D;
    public final List E;
    public int F;
    public final e0 k;
    public u0 l;
    public boolean m;
    public boolean n;
    public TaskCompletionSource o;
    public TaskCompletionSource p;
    public final AtomicLong q;
    public final Object r;
    public final Object s;
    public d t;
    public String u;
    public double v;
    public boolean w;
    public int x;
    public int y;
    public x z;

    public f0(Context context, e eVar) {
        super(context, H, eVar, com.google.android.gms.common.api.i.c);
        this.k = new e0(this);
        this.r = new Object();
        this.s = new Object();
        this.E = DesugarCollections.synchronizedList(new ArrayList());
        this.D = eVar.b;
        this.A = eVar.a;
        this.B = new HashMap();
        this.C = new HashMap();
        this.q = new AtomicLong(0L);
        this.F = 1;
        j();
    }

    public static void f(f0 f0Var, long j10, int i9) {
        TaskCompletionSource taskCompletionSource;
        synchronized (f0Var.B) {
            HashMap hashMap = f0Var.B;
            Long valueOf = Long.valueOf(j10);
            taskCompletionSource = (TaskCompletionSource) hashMap.get(valueOf);
            f0Var.B.remove(valueOf);
        }
        if (taskCompletionSource != null) {
            if (i9 == 0) {
                taskCompletionSource.setResult(null);
            } else {
                taskCompletionSource.setException(x5.l.m(new Status(i9, null, null, null)));
            }
        }
    }

    public static void g(f0 f0Var, int i9) {
        synchronized (f0Var.s) {
            try {
                TaskCompletionSource taskCompletionSource = f0Var.p;
                if (taskCompletionSource == null) {
                    return;
                }
                if (i9 == 0) {
                    taskCompletionSource.setResult(new Status(0, null, null, null));
                } else {
                    taskCompletionSource.setException(x5.l.m(new Status(i9, null, null, null)));
                }
                f0Var.p = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Handler k(f0 f0Var) {
        if (f0Var.l == null) {
            f0Var.l = new u0(f0Var.f, 1);
        }
        return f0Var.l;
    }

    public final void h() {
        G.b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.C) {
            this.C.clear();
        }
    }

    public final void i(int i9) {
        synchronized (this.r) {
            try {
                TaskCompletionSource taskCompletionSource = this.o;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setException(x5.l.m(new Status(i9, null, null, null)));
                }
                this.o = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        CastDevice castDevice = this.A;
        if (castDevice.c(2048) || !castDevice.c(4) || castDevice.c(1)) {
            return;
        }
        "Chromecast Audio".equals(castDevice.e);
    }
}
