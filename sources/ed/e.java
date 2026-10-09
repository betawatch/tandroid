package ed;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class e extends k {
    public final StringBuilder c;

    public e() {
        super(4, 0);
        this.c = new StringBuilder();
    }

    @Override // ed.k
    public final k b() {
        k.c(this.c);
        return this;
    }

    @Override // ed.k
    public final String toString() {
        return "<!--" + this.c.toString() + "-->";
    }
}
