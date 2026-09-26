package dd;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
