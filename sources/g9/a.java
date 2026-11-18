package g9;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
