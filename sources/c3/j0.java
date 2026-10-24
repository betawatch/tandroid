package c3;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class j0 extends x {
    public final /* synthetic */ e0 b;
    public final /* synthetic */ ad.d c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(ad.d dVar, e0 e0Var, e0 e0Var2) {
        super(e0Var);
        this.c = dVar;
        this.b = e0Var2;
    }

    @Override // c3.x, c3.e0
    public final d0 f(long j10) {
        d0 f7 = this.b.f(j10);
        f0 f0Var = f7.a;
        long j11 = f0Var.a;
        long j12 = f0Var.b;
        long j13 = this.c.b;
        f0 f0Var2 = new f0(j11, j12 + j13);
        f0 f0Var3 = f7.b;
        return new d0(f0Var2, new f0(f0Var3.a, f0Var3.b + j13));
    }
}
