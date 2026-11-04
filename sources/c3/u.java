package c3;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import g9.s1;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u {
    public static final b q = new b(0);
    public final Context a;
    public final s b;
    public final SparseArray c;
    public final boolean d;
    public final e e;
    public final g2.h0 f;
    public final CopyOnWriteArraySet g;
    public final long h;
    public final z i;
    public g2.k0 j = new g2.k0();
    public g2.j0 k;
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
        g9.g0 g0Var = g9.i0.b;
        s1 s1Var = s1.e;
        this.d = oVar.d;
        g2.h0 h0Var = oVar.e;
        this.f = h0Var;
        long j10 = oVar.g;
        this.h = j10 != -9223372036854775807L ? -j10 : -9223372036854775807L;
        z zVar = oVar.h;
        this.i = zVar;
        this.e = new e(oVar.b, zVar, h0Var);
        this.g = new CopyOnWriteArraySet();
        new d2.u().a();
        this.o = -9223372036854775807L;
        this.p = -1;
        this.n = 0;
    }
}
