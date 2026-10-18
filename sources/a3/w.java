package a3;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import e9.x1;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class w {
    public static final b q = new b(0);
    public final Context a;
    public final u b;
    public final SparseArray c;
    public final boolean d;
    public final f e;
    public final e2.g0 f;
    public final CopyOnWriteArraySet g;
    public final long h;
    public final b0 i;
    public e2.j0 j = new e2.j0();
    public e2.i0 k;
    public Pair l;
    public int m;
    public int n;
    public long o;
    public int p;

    public w(q qVar) {
        this.a = qVar.a;
        u uVar = qVar.c;
        uVar.getClass();
        this.b = uVar;
        this.c = new SparseArray();
        e9.l0 l0Var = e9.n0.b;
        x1 x1Var = x1.e;
        this.d = qVar.d;
        e2.g0 g0Var = qVar.e;
        this.f = g0Var;
        long j10 = qVar.g;
        this.h = j10 != -9223372036854775807L ? -j10 : -9223372036854775807L;
        b0 b0Var = qVar.h;
        this.i = b0Var;
        this.e = new f(qVar.b, b0Var, g0Var);
        this.g = new CopyOnWriteArraySet();
        new b2.v().a();
        this.o = -9223372036854775807L;
        this.p = -1;
        this.n = 0;
    }
}
