package mc;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e extends k {
    public final StringBuilder c;

    public e() {
        super(4, 0);
        this.c = new StringBuilder();
    }

    @Override // mc.k
    public final k c() {
        k.d(this.c);
        return this;
    }

    @Override // mc.k
    public final String toString() {
        return "<!--" + this.c.toString() + "-->";
    }
}
