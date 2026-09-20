package dd;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
