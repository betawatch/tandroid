package ee;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class v implements fb.o {
    public final /* synthetic */ int a;
    public final String b;

    public /* synthetic */ v(String str, int i10) {
        this.a = i10;
        this.b = str;
    }

    @Override // fb.o
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
