package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f extends l {
    public final StringBuilder c;

    public f() {
        super(4, 0);
        this.c = new StringBuilder();
    }

    @Override // ad.l
    public final l b() {
        l.c(this.c);
        return this;
    }

    @Override // ad.l
    public final String toString() {
        return "<!--" + this.c.toString() + "-->";
    }
}
