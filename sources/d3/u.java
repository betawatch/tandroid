package d3;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import h9.t1;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class u {
    public static final b q = new b(0);
    public final Context a;
    public final s b;
    public final SparseArray c;
    public final boolean d;
    public final e e;
    public final h2.g0 f;
    public final CopyOnWriteArraySet g;
    public final long h;
    public final z i;
    public h2.j0 j = new h2.j0();
    public h2.i0 k;
    public Pair l;
    public int m;
    public int n;
    public long o;
    public int p;

    public u(o oVar) {
        this.a = oVar.a;
        s sVar = oVar.c;
        sVar.getClass();
        this.b = sVar;
        this.c = new SparseArray();
        h9.g0 g0Var = h9.i0.b;
        t1 t1Var = t1.e;
        this.d = oVar.d;
        h2.g0 g0Var2 = oVar.e;
        this.f = g0Var2;
        long j3 = oVar.g;
        this.h = j3 != -9223372036854775807L ? -j3 : -9223372036854775807L;
        z zVar = oVar.h;
        this.i = zVar;
        this.e = new e(oVar.b, zVar, g0Var2);
        this.g = new CopyOnWriteArraySet();
        new e2.t().a();
        this.o = -9223372036854775807L;
        this.p = -1;
        this.n = 0;
    }
}
