package fd;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
