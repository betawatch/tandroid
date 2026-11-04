package k2;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import b8.xb;
import b8.zb;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n {
    public static final int C;
    public static final boolean D;
    public final String A;
    public final boolean B;
    public final Context a;
    public final g2.h0 b;
    public f9.t c;
    public final e2.c d;
    public f9.t e;
    public f9.t f;
    public final e2.c g;
    public final Looper h;
    public final int i;
    public final d2.f j;
    public final int k;
    public final boolean l;
    public final t1 m;
    public final s1 n;
    public final long o;
    public final long p;
    public final long q;
    public final f r;
    public final long s;
    public final long t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final boolean y;
    public boolean z;

    static {
        String str = g2.n0.a;
        String c2 = xb.c(Build.DEVICE);
        C = (c2.contains("emulator") || c2.contains("emu64a") || c2.contains("emu64x") || c2.contains("generic")) ? 30000 : 10000;
        D = true;
    }

    public n(Context context) {
        e2.c cVar = new e2.c(context, 1);
        e2.c cVar2 = new e2.c(context, 2);
        e2.c cVar3 = new e2.c(context, 3);
        c3.q qVar = new c3.q(3);
        e2.c cVar4 = new e2.c(context, 4);
        context.getClass();
        this.a = context;
        this.c = cVar;
        this.d = cVar2;
        this.e = cVar3;
        this.f = qVar;
        this.g = cVar4;
        String str = g2.n0.a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.j = d2.f.i;
        this.k = 1;
        this.l = true;
        this.m = t1.f;
        this.o = 5000L;
        this.p = 15000L;
        this.q = 3000L;
        this.n = s1.b;
        this.r = new f(g2.n0.S(20L), g2.n0.S(500L));
        this.b = g2.h0.a;
        this.s = 500L;
        this.t = 2000L;
        this.u = 600000;
        int i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        boolean z10 = D;
        this.v = z10 ? C : Integer.MAX_VALUE;
        this.w = z10 ? 60000 : i3;
        this.x = 600000;
        this.y = true;
        this.A = "";
        this.i = -1000;
        new mb.b();
        this.B = true;
    }

    public final i0 a() {
        zb.p(!this.z);
        this.z = true;
        return new i0(this);
    }
}
