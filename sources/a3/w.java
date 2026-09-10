package a3;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import e9.a1;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class w {
    public static final b o = new b(0);
    public final Context a;
    public final u b;
    public final SparseArray c;
    public final boolean d;
    public final f e;
    public final e2.x f;
    public final CopyOnWriteArraySet g;
    public e2.a0 h = new e2.a0();
    public e2.z i;
    public Pair j;
    public int k;
    public int l;
    public long m;
    public int n;

    public w(q qVar) {
        this.a = (Context) qVar.c;
        u uVar = (u) qVar.e;
        e2.d.h(uVar);
        this.b = uVar;
        this.c = new SparseArray();
        e9.g0 g0Var = e9.i0.b;
        a1 a1Var = a1.e;
        this.d = qVar.a;
        e2.x xVar = (e2.x) qVar.f;
        this.f = xVar;
        this.e = new f((a0) qVar.d, xVar);
        this.g = new CopyOnWriteArraySet();
        new b2.r().a();
        this.m = -9223372036854775807L;
        this.n = -1;
        this.l = 0;
    }
}
