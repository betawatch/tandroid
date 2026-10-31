package i2;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import org.telegram.tgnet.ConnectionsManager;
import v7.r6;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class n {
    public static final int C;
    public static final boolean D;
    public final String A;
    public final boolean B;
    public final Context a;
    public final e2.g0 b;
    public d9.t c;
    public final c2.c d;
    public d9.t e;
    public d9.t f;
    public final c2.c g;
    public final Looper h;
    public final int i;
    public final b2.f j;
    public final int k;
    public final boolean l;
    public final v1 m;
    public final u1 n;
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
        String str = e2.l0.a;
        String c10 = r6.c(Build.DEVICE);
        C = (c10.contains("emulator") || c10.contains("emu64a") || c10.contains("emu64x") || c10.contains("generic")) ? 30000 : 10000;
        D = true;
    }

    public n(Context context) {
        c2.c cVar = new c2.c(context, 1);
        c2.c cVar2 = new c2.c(context, 2);
        c2.c cVar3 = new c2.c(context, 3);
        a3.s sVar = new a3.s(3);
        c2.c cVar4 = new c2.c(context, 4);
        context.getClass();
        this.a = context;
        this.c = cVar;
        this.d = cVar2;
        this.e = cVar3;
        this.f = sVar;
        this.g = cVar4;
        String str = e2.l0.a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.j = b2.f.i;
        this.k = 1;
        this.l = true;
        this.m = v1.f;
        this.o = 5000L;
        this.p = 15000L;
        this.q = 3000L;
        this.n = u1.b;
        this.r = new f(e2.l0.S(20L), e2.l0.S(500L));
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
        new t7.u();
        this.B = true;
    }

    public final i0 a() {
        t6.p(!this.z);
        this.z = true;
        return new i0(this);
    }
}
