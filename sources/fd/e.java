package fd;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class e extends f2.f {
    public final StringBuilder c;

    public e() {
        super(4, 1);
        this.c = new StringBuilder();
    }

    @Override // f2.f
    public final f2.f b() {
        f2.f.c(this.c);
        return this;
    }

    @Override // f2.f
    public final String toString() {
        return "<!--" + this.c.toString() + "-->";
    }
}
