package a3;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import e9.a1;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class v {
    public static final a o = new a(0);
    public final Context a;
    public final t b;
    public final SparseArray c;
    public final boolean d;
    public final e e;
    public final e2.x f;
    public final CopyOnWriteArraySet g;
    public e2.a0 h = new e2.a0();
    public e2.z i;
    public Pair j;
    public int k;
    public int l;
    public long m;
    public int n;

    public v(p pVar) {
        this.a = (Context) pVar.c;
        t tVar = (t) pVar.e;
        e2.d.h(tVar);
        this.b = tVar;
        this.c = new SparseArray();
        e9.g0 g0Var = e9.i0.b;
        a1 a1Var = a1.e;
        this.d = pVar.a;
        e2.x xVar = (e2.x) pVar.f;
        this.f = xVar;
        this.e = new e((z) pVar.d, xVar);
        this.g = new CopyOnWriteArraySet();
        new b2.r().a();
        this.m = -9223372036854775807L;
        this.n = -1;
        this.l = 0;
    }
}
