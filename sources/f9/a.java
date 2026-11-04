package f9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    @Override // f9.l
    public final boolean apply(Object obj) {
        return c(((Character) obj).charValue());
    }

    @Override // f9.i
    public final boolean c(char c2) {
        return this.a.c(c2) && this.b.c(c2);
    }

    public final String toString() {
        return "CharMatcher.and(" + this.a + ", " + this.b + ")";
    }
}
