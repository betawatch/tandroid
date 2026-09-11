package dd;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class e extends k {
    public final StringBuilder c;

    public e() {
        super(4, 0);
        this.c = new StringBuilder();
    }

    @Override // dd.k
    public final k f() {
        k.g(this.c);
        return this;
    }

    @Override // dd.k
    public final String toString() {
        return "<!--" + this.c.toString() + "-->";
    }
}
