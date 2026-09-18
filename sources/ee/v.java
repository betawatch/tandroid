package ee;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
