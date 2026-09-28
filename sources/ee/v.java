package ee;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final class v implements fb.n {
    public final /* synthetic */ int a;
    public String b;

    @Override // fb.n
    public Object p2() {
        throw new db.j(this.b);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "<" + this.b + '>';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ v(String str, int i10) {
        this.a = i10;
        this.b = str;
    }
}
