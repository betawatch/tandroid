package nc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e extends k {
    public final StringBuilder c;

    public e() {
        super(4, 0);
        this.c = new StringBuilder();
    }

    @Override // nc.k
    public final k c() {
        k.d(this.c);
        return this;
    }

    @Override // nc.k
    public final String toString() {
        return "<!--" + this.c.toString() + "-->";
    }
}
