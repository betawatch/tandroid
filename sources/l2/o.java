package l2;

import a8.ka;
import a8.ma;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class o {
    public static final int C;
    public static final boolean D;
    public final String A;
    public final boolean B;
    public final Context a;
    public final h2.g0 b;
    public g9.t c;
    public final f2.d d;
    public g9.t e;
    public g9.t f;
    public final f2.d g;
    public final Looper h;
    public final int i;
    public final e2.e j;
    public final int k;
    public final boolean l;
    public final q1 m;
    public final p1 n;
    public final long o;
    public final long p;
    public final long q;
    public final g r;
    public final long s;
    public final long t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final boolean y;
    public boolean z;

    static {
        String str = h2.l0.a;
        String c10 = ka.c(Build.DEVICE);
        C = (c10.contains("emulator") || c10.contains("emu64a") || c10.contains("emu64x") || c10.contains("generic")) ? 30000 : 10000;
        D = true;
    }

    public o(Context context) {
        f2.d dVar = new f2.d(context, 1);
        f2.d dVar2 = new f2.d(context, 2);
        f2.d dVar3 = new f2.d(context, 3);
        d3.p pVar = new d3.p(3);
        f2.d dVar4 = new f2.d(context, 4);
        context.getClass();
        this.a = context;
        this.c = dVar;
        this.d = dVar2;
        this.e = dVar3;
        this.f = pVar;
        this.g = dVar4;
        String str = h2.l0.a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.j = e2.e.i;
        this.k = 1;
        this.l = true;
        this.m = q1.f;
        this.o = 5000L;
        this.p = 15000L;
        this.q = 3000L;
        this.n = p1.b;
        this.r = new g(h2.l0.S(20L), h2.l0.S(500L));
        this.b = h2.g0.a;
        this.s = 500L;
        this.t = 2000L;
        this.u = 600000;
        int i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        boolean z10 = D;
        this.v = z10 ? C : Integer.MAX_VALUE;
        this.w = z10 ? 60000 : i7;
        this.x = 600000;
        this.y = true;
        this.A = "";
        this.i = -1000;
        new w7.s();
        this.B = true;
    }

    public final g0 a() {
        ma.p(!this.z);
        this.z = true;
        return new g0(this);
    }
}
