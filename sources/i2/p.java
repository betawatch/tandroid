package i2;

import android.content.Context;
import android.os.Looper;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class p {
    public final Context a;
    public final e2.x b;
    public d9.i c;
    public final d d;
    public d9.i e;
    public d9.i f;
    public final d g;
    public final Looper h;
    public final int i;
    public final b2.e j;
    public final int k;
    public final boolean l;
    public final q1 m;
    public final p1 n;
    public final long o;
    public final long p;
    public final long q;
    public final i r;
    public final long s;
    public final long t;
    public final boolean u;
    public boolean v;
    public final String w;

    public p(Context context) {
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
        this.m = q1.e;
        this.o = 5000L;
        this.p = 15000L;
        this.q = 3000L;
        this.n = p1.b;
        this.r = new i(e2.d0.Q(20L), e2.d0.Q(500L));
        this.b = e2.x.a;
        this.s = 500L;
        this.t = 2000L;
        this.u = true;
        this.w = "";
        this.i = -1000;
        new rb.a();
    }

    public final f0 a() {
        e2.d.g(!this.v);
        this.v = true;
        return new f0(this);
    }
}
