package h9;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class g0 extends a {
    public final i0 c;

    public g0(i0 i0Var, int i7) {
        super(i0Var.size(), i7);
        this.c = i0Var;
    }

    @Override // h9.a
    public final Object a(int i7) {
        return this.c.get(i7);
    }
}
