package j3;

import android.content.Context;
import android.os.Looper;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class p {
    public final Context a;
    public final h5.y b;
    public r8.i c;
    public final o d;
    public r8.i e;
    public r8.i f;
    public final o g;
    public final Looper h;
    public final l3.d i;
    public final int j;
    public final boolean k;
    public final h2 l;
    public final long m;
    public final long n;
    public final i o;
    public final long p;
    public final long q;
    public final boolean r;
    public boolean s;

    public p(Context context) {
        o oVar = new o(context, 0);
        o oVar2 = new o(context, 1);
        o oVar3 = new o(context, 2);
        f5.u uVar = new f5.u(21);
        o oVar4 = new o(context, 3);
        context.getClass();
        this.a = context;
        this.c = oVar;
        this.d = oVar2;
        this.e = oVar3;
        this.f = uVar;
        this.g = oVar4;
        int i10 = h5.d0.a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.i = l3.d.h;
        this.j = 1;
        this.k = true;
        this.l = h2.e;
        this.m = 5000L;
        this.n = 15000L;
        this.o = new i(h5.d0.G(20L), h5.d0.G(500L));
        this.b = h5.y.a;
        this.p = 500L;
        this.q = 2000L;
        this.r = true;
    }
}
