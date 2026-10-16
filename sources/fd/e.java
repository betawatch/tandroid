package fd;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class e extends f2.e {
    public final StringBuilder c;

    public e() {
        super(4, 1);
        this.c = new StringBuilder();
    }

    @Override // f2.e
    public final f2.e b() {
        f2.e.c(this.c);
        return this;
    }

    @Override // f2.e
    public final String toString() {
        return "<!--" + this.c.toString() + "-->";
    }
}
