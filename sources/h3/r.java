package h3;

import android.content.Context;
import android.os.Looper;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r {
    public final Context a;
    public final d5.a0 b;
    public n8.i c;
    public final p d;
    public n8.i e;
    public n8.i f;
    public final p g;
    public final Looper h;
    public final j3.e i;
    public final int j;
    public final boolean k;
    public final j2 l;
    public final long m;
    public final long n;
    public final i o;
    public final long p;
    public final long q;
    public final boolean r;
    public boolean s;

    public r(Context context) {
        p pVar = new p(context, 0);
        p pVar2 = new p(context, 1);
        p pVar3 = new p(context, 2);
        q qVar = new q(0);
        p pVar4 = new p(context, 3);
        context.getClass();
        this.a = context;
        this.c = pVar;
        this.d = pVar2;
        this.e = pVar3;
        this.f = qVar;
        this.g = pVar4;
        int i9 = d5.f0.a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.i = j3.e.h;
        this.j = 1;
        this.k = true;
        this.l = j2.e;
        this.m = 5000L;
        this.n = 15000L;
        this.o = new i(d5.f0.H(20L), d5.f0.H(500L));
        this.b = d5.a0.a;
        this.p = 500L;
        this.q = 2000L;
        this.r = true;
    }
}
