package i2;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import org.telegram.tgnet.ConnectionsManager;
import v7.s6;
import v7.u6;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class p {
    public static final int C;
    public static final boolean D;
    public final String A;
    public final boolean B;
    public final Context a;
    public final e2.g0 b;
    public d9.u c;
    public final c2.d d;
    public d9.u e;
    public d9.u f;
    public final c2.d g;
    public final Looper h;
    public final int i;
    public final b2.f j;
    public final int k;
    public final boolean l;
    public final s1 m;
    public final r1 n;
    public final long o;
    public final long p;
    public final long q;
    public final h r;
    public final long s;
    public final long t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final boolean y;
    public boolean z;

    static {
        String str = e2.m0.a;
        String c10 = s6.c(Build.DEVICE);
        C = (c10.contains("emulator") || c10.contains("emu64a") || c10.contains("emu64x") || c10.contains("generic")) ? 30000 : 10000;
        D = true;
    }

    public p(Context context) {
        c2.d dVar = new c2.d(context, 1);
        c2.d dVar2 = new c2.d(context, 2);
        c2.d dVar3 = new c2.d(context, 3);
        a3.s sVar = new a3.s(3);
        c2.d dVar4 = new c2.d(context, 4);
        context.getClass();
        this.a = context;
        this.c = dVar;
        this.d = dVar2;
        this.e = dVar3;
        this.f = sVar;
        this.g = dVar4;
        String str = e2.m0.a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.j = b2.f.i;
        this.k = 1;
        this.l = true;
        this.m = s1.f;
        this.o = 5000L;
        this.p = 15000L;
        this.q = 3000L;
        this.n = r1.b;
        this.r = new h(e2.m0.S(20L), e2.m0.S(500L));
        this.b = e2.g0.a;
        this.s = 500L;
        this.t = 2000L;
        this.u = 600000;
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        boolean z10 = D;
        this.v = z10 ? C : Integer.MAX_VALUE;
        this.w = z10 ? 60000 : i10;
        this.x = 600000;
        this.y = true;
        this.A = "";
        this.i = -1000;
        new pb.a();
        this.B = true;
    }

    public final i0 a() {
        u6.p(!this.z);
        this.z = true;
        return new i0(this);
    }
}
