package l2;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements h2.o, h2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ s(float f10, int i7) {
        this.a = i7;
        this.b = f10;
    }

    @Override // h2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                ((p4.i1) obj).d(this.b);
                break;
            default:
                ((p4.i1) obj).T(this.b);
                break;
        }
    }

    @Override // h2.o
    public void invoke(Object obj) {
        ((e2.a1) obj).l(this.b);
    }
}
