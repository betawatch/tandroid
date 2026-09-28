package dd;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
