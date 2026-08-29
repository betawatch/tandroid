package j3;

import android.content.Context;
import android.os.Looper;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class r {
    public final Context a;
    public final f5.y b;
    public p8.i c;
    public final p d;
    public p8.i e;
    public p8.i f;
    public final p g;
    public final Looper h;
    public final l3.e i;
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
        int i10 = f5.d0.a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.i = l3.e.h;
        this.j = 1;
        this.k = true;
        this.l = j2.e;
        this.m = 5000L;
        this.n = 15000L;
        this.o = new i(f5.d0.H(20L), f5.d0.H(500L));
        this.b = f5.y.a;
        this.p = 500L;
        this.q = 2000L;
        this.r = true;
    }
}
