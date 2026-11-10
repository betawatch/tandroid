package h9;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
