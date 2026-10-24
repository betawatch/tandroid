package fd;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
