package i2;

import a8.wb;
import a8.yb;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class o {
    public static final int C;
    public static final boolean D;
    public final String A;
    public final boolean B;
    public final Context a;
    public final e2.g0 b;
    public e9.t c;
    public final c2.d d;
    public e9.t e;
    public e9.t f;
    public final c2.d g;
    public final Looper h;
    public final int i;
    public final b2.f j;
    public final int k;
    public final boolean l;
    public final t1 m;
    public final s1 n;
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
        String str = e2.n0.a;
        String c10 = wb.c(Build.DEVICE);
        C = (c10.contains("emulator") || c10.contains("emu64a") || c10.contains("emu64x") || c10.contains("generic")) ? 30000 : 10000;
        D = true;
    }

    public o(Context context) {
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
        String str = e2.n0.a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.j = b2.f.i;
        this.k = 1;
        this.l = true;
        this.m = t1.f;
        this.o = 5000L;
        this.p = 15000L;
        this.q = 3000L;
        this.n = s1.b;
        this.r = new g(e2.n0.S(20L), e2.n0.S(500L));
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
        new sb.b();
        this.B = true;
    }

    public final j0 a() {
        yb.p(!this.z);
        this.z = true;
        return new j0(this);
    }
}
