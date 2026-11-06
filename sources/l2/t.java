package l2;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements h2.o, h2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ t(float f10, int i7) {
        this.a = i7;
        this.b = f10;
    }

    @Override // h2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                ((p4.g1) obj).d(this.b);
                break;
            default:
                ((p4.g1) obj).T(this.b);
                break;
        }
    }

    @Override // h2.o
    public void invoke(Object obj) {
        ((e2.a1) obj).l(this.b);
    }
}
