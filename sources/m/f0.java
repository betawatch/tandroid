package m;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class f0 extends v1 {
    public final /* synthetic */ n0 s;
    public final /* synthetic */ q0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(q0 q0Var, q0 q0Var2, n0 n0Var) {
        super(q0Var2);
        this.w = q0Var;
        this.s = n0Var;
    }

    @Override // m.v1
    public final l.b0 b() {
        return this.s;
    }

    @Override // m.v1
    public final boolean c() {
        q0 q0Var = this.w;
        if (q0Var.getInternalPopup().a()) {
            return true;
        }
        q0Var.f.l(h0.b(q0Var), h0.a(q0Var));
        return true;
    }
}
