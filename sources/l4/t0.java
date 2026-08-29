package l4;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class t0 implements b0 {
    public final com.google.android.exoplayer2.upstream.l a;
    public final s0 b;
    public final a3.c c;
    public final f7.v d;
    public final int e;

    public t0(com.google.android.exoplayer2.upstream.l lVar, o3.i iVar) {
        s0 s0Var = new s0(iVar, 0);
        a3.c cVar = new a3.c();
        f7.v vVar = new f7.v(4);
        this.a = lVar;
        this.b = s0Var;
        this.c = cVar;
        this.d = vVar;
        this.e = 1048576;
    }

    @Override // l4.b0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final u0 a(j3.f1 f1Var) {
        f1Var.b.getClass();
        Object obj = f1Var.b.f;
        return new u0(f1Var, this.a, this.b, this.c.b(f1Var), this.d, this.e);
    }
}
