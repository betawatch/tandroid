package ee;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
