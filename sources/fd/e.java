package fd;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
