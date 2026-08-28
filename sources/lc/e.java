package lc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e extends k {
    public final StringBuilder c;

    public e() {
        super(4, 0);
        this.c = new StringBuilder();
    }

    @Override // lc.k
    public final k c() {
        k.d(this.c);
        return this;
    }

    @Override // lc.k
    public final String toString() {
        return "<!--" + this.c.toString() + "-->";
    }
}
