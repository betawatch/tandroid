package fd;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
