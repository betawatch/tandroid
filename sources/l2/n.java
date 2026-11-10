package l2;

import a8.ga;
import a8.ia;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class n {
    public static final int C;
    public static final boolean D;
    public final String A;
    public final boolean B;
    public final Context a;
    public final h2.g0 b;
    public g9.u c;
    public final f2.c d;
    public g9.u e;
    public g9.u f;
    public final f2.c g;
    public final Looper h;
    public final int i;
    public final e2.e j;
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
        String str = h2.m0.a;
        String c10 = ga.c(Build.DEVICE);
        C = (c10.contains("emulator") || c10.contains("emu64a") || c10.contains("emu64x") || c10.contains("generic")) ? 30000 : 10000;
        D = true;
    }

    public n(Context context) {
        f2.c cVar = new f2.c(context, 1);
        f2.c cVar2 = new f2.c(context, 2);
        f2.c cVar3 = new f2.c(context, 3);
        d3.q qVar = new d3.q(3);
        f2.c cVar4 = new f2.c(context, 4);
        context.getClass();
        this.a = context;
        this.c = cVar;
        this.d = cVar2;
        this.e = cVar3;
        this.f = qVar;
        this.g = cVar4;
        String str = h2.m0.a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.j = e2.e.i;
        this.k = 1;
        this.l = true;
        this.m = t1.f;
        this.o = 5000L;
        this.p = 15000L;
        this.q = 3000L;
        this.n = s1.b;
        this.r = new f(h2.m0.S(20L), h2.m0.S(500L));
        this.b = h2.g0.a;
        this.s = 500L;
        this.t = 2000L;
        this.u = 600000;
        int i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        boolean z9 = D;
        this.v = z9 ? C : Integer.MAX_VALUE;
        this.w = z9 ? 60000 : i7;
        this.x = 600000;
        this.y = true;
        this.A = "";
        this.i = -1000;
        new w7.s(12);
        this.B = true;
    }

    public final i0 a() {
        ia.p(!this.z);
        this.z = true;
        return new i0(this);
    }
}
