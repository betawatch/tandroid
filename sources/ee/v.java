package ee;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class v implements fb.n {
    public final /* synthetic */ int a;
    public final String b;

    public /* synthetic */ v(String str, int i10) {
        this.a = i10;
        this.b = str;
    }

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
}
