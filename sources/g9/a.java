package g9;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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

    @Override // g9.l
    public final boolean apply(Object obj) {
        return c(((Character) obj).charValue());
    }

    @Override // g9.i
    public final boolean c(char c10) {
        return this.a.c(c10) && this.b.c(c10);
    }

    public final String toString() {
        return "CharMatcher.and(" + this.a + ", " + this.b + ")";
    }
}
