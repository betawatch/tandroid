package d3;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import h9.s1;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class t {
    public static final b q = new b(0);
    public final Context a;
    public final r b;
    public final SparseArray c;
    public final boolean d;
    public final e e;
    public final h2.g0 f;
    public final CopyOnWriteArraySet g;
    public final long h;
    public final y i;
    public h2.j0 j = new h2.j0();
    public h2.i0 k;
    public Pair l;
    public int m;
    public int n;
    public long o;
    public int p;

    public t(ai.x xVar) {
        this.a = (Context) xVar.d;
        r rVar = (r) xVar.f;
        rVar.getClass();
        this.b = rVar;
        this.c = new SparseArray();
        h9.g0 g0Var = h9.i0.b;
        s1 s1Var = s1.e;
        this.d = xVar.a;
        h2.g0 g0Var2 = (h2.g0) xVar.g;
        this.f = g0Var2;
        long j3 = xVar.c;
        this.h = j3 != -9223372036854775807L ? -j3 : -9223372036854775807L;
        y yVar = (y) xVar.h;
        this.i = yVar;
        this.e = new e((x) xVar.e, yVar, g0Var2);
        this.g = new CopyOnWriteArraySet();
        new e2.t().a();
        this.o = -9223372036854775807L;
        this.p = -1;
        this.n = 0;
    }
}
