package l2;

import a8.ja;
import a8.la;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class n {
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
    public final p1 m;
    public final o1 n;
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
        String str = h2.l0.a;
        String c10 = ja.c(Build.DEVICE);
        C = (c10.contains("emulator") || c10.contains("emu64a") || c10.contains("emu64x") || c10.contains("generic")) ? 30000 : 10000;
        D = true;
    }

    public n(Context context) {
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
        this.m = p1.f;
        this.o = 5000L;
        this.p = 15000L;
        this.q = 3000L;
        this.n = o1.b;
        this.r = new f(h2.l0.S(20L), h2.l0.S(500L));
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

    public final f0 a() {
        la.p(!this.z);
        this.z = true;
        return new f0(this);
    }
}
