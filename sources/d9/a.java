package d9;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class a extends i {
    public final i a;
    public final i b;

    public a(i iVar, i iVar2) {
        iVar.getClass();
        this.a = iVar;
        iVar2.getClass();
        this.b = iVar2;
    }

    @Override // d9.m
    public final boolean apply(Object obj) {
        return c(((Character) obj).charValue());
    }

    @Override // d9.i
    public final boolean c(char c10) {
        return this.a.c(c10) && this.b.c(c10);
    }

    public final String toString() {
        return "CharMatcher.and(" + this.a + ", " + this.b + ")";
    }
}
