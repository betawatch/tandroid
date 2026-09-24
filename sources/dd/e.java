package dd;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final class e extends k {
    public final StringBuilder c;

    public e() {
        super(4, 0);
        this.c = new StringBuilder();
    }

    @Override // dd.k
    public final k b() {
        k.c(this.c);
        return this;
    }

    @Override // dd.k
    public final String toString() {
        return "<!--" + this.c.toString() + "-->";
    }
}
