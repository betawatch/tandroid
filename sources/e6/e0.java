package e6;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e0 extends com.google.android.gms.common.api.j implements f0 {
    public static final i6.b H = new i6.b("CastClient", null);
    public static final com.google.android.gms.common.api.e I = new com.google.android.gms.common.api.e("Cast.API_CXLESS", new a6.b(2), i6.j.a);
    public x A;
    public final CastDevice B;
    public final HashMap C;
    public final HashMap D;
    public final f6.e0 E;
    public final List F;
    public int G;
    public final d0 l;
    public com.google.android.gms.internal.cast.z m;
    public boolean n;
    public boolean o;
    public TaskCompletionSource p;
    public TaskCompletionSource q;
    public final AtomicLong r;
    public final Object s;
    public final Object t;
    public d u;
    public String v;
    public double w;
    public boolean x;
    public int y;
    public int z;

    public e0(Context context, e eVar) {
        super(context, I, eVar, com.google.android.gms.common.api.i.c);
        this.l = new d0(this);
        this.s = new Object();
        this.t = new Object();
        this.F = DesugarCollections.synchronizedList(new ArrayList());
        this.E = eVar.b;
        this.B = eVar.a;
        this.C = new HashMap();
        this.D = new HashMap();
        this.r = new AtomicLong(0L);
        this.G = 1;
        j();
    }

    public static void f(e0 e0Var, long j10, int i3) {
        TaskCompletionSource taskCompletionSource;
        synchronized (e0Var.C) {
            HashMap hashMap = e0Var.C;
            Long valueOf = Long.valueOf(j10);
            taskCompletionSource = (TaskCompletionSource) hashMap.get(valueOf);
            e0Var.C.remove(valueOf);
        }
        if (taskCompletionSource != null) {
            if (i3 == 0) {
                taskCompletionSource.setResult(null);
            } else {
                taskCompletionSource.setException(p6.m.l(new Status(i3, null, null, null)));
            }
        }
    }

    public static void g(e0 e0Var, int i3) {
        synchronized (e0Var.t) {
            try {
                TaskCompletionSource taskCompletionSource = e0Var.q;
                if (taskCompletionSource == null) {
                    return;
                }
                if (i3 == 0) {
                    taskCompletionSource.setResult(new Status(0, null, null, null));
                } else {
                    taskCompletionSource.setException(p6.m.l(new Status(i3, null, null, null)));
                }
                e0Var.q = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Handler k(e0 e0Var) {
        if (e0Var.m == null) {
            e0Var.m = new com.google.android.gms.internal.cast.z(e0Var.g, 0);
        }
        return e0Var.m;
    }

    public final void h() {
        H.b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.D) {
            this.D.clear();
        }
    }

    public final void i(int i3) {
        synchronized (this.s) {
            try {
                TaskCompletionSource taskCompletionSource = this.p;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setException(p6.m.l(new Status(i3, null, null, null)));
                }
                this.p = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j() {
        CastDevice castDevice = this.B;
        if (castDevice.c(2048) || !castDevice.c(4) || castDevice.c(1)) {
            return;
        }
        "Chromecast Audio".equals(castDevice.e);
    }
}
