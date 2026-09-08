package i2;

import android.content.Context;
import android.os.Looper;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class q {
    public final Context a;
    public final e2.x b;
    public d9.j c;
    public final d d;
    public d9.j e;
    public d9.j f;
    public final d g;
    public final Looper h;
    public final int i;
    public final b2.e j;
    public final int k;
    public final boolean l;
    public final p1 m;
    public final o1 n;
    public final long o;
    public final long p;
    public final long q;
    public final j r;
    public final long s;
    public final long t;
    public final boolean u;
    public boolean v;
    public final String w;

    public q(Context context) {
        d dVar = new d(context, 1);
        d dVar2 = new d(context, 2);
        d dVar3 = new d(context, 3);
        a3.s sVar = new a3.s(3);
        d dVar4 = new d(context, 4);
        context.getClass();
        this.a = context;
        this.c = dVar;
        this.d = dVar2;
        this.e = dVar3;
        this.f = sVar;
        this.g = dVar4;
        String str = e2.d0.a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.j = b2.e.h;
        this.k = 1;
        this.l = true;
        this.m = p1.e;
        this.o = 5000L;
        this.p = 15000L;
        this.q = 3000L;
        this.n = o1.b;
        this.r = new j(e2.d0.Q(20L), e2.d0.Q(500L));
        this.b = e2.x.a;
        this.s = 500L;
        this.t = 2000L;
        this.u = true;
        this.w = "";
        this.i = -1000;
        new t7.u();
    }
}
