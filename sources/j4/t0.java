package j4;

import gh.i3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class t0 implements c0 {
    public final com.google.android.exoplayer2.upstream.l a;
    public final i3 b;
    public final e.a c;
    public final v9.d d;
    public final int e;

    public t0(com.google.android.exoplayer2.upstream.l lVar, m3.i iVar) {
        i3 i3Var = new i3(iVar, 27);
        e.a aVar = new e.a();
        v9.d dVar = new v9.d(4);
        this.a = lVar;
        this.b = i3Var;
        this.c = aVar;
        this.d = dVar;
        this.e = 1048576;
    }

    @Override // j4.c0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final u0 a(h3.f1 f1Var) {
        f1Var.b.getClass();
        Object obj = f1Var.b.f;
        return new u0(f1Var, this.a, this.b, this.c.b(f1Var), this.d, this.e);
    }
}
