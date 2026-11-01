package i2;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements e2.o, e2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ t(float f7, int i10) {
        this.a = i10;
        this.b = f7;
    }

    @Override // e2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                ((m4.n1) obj).b(this.b);
                break;
            default:
                ((m4.n1) obj).S(this.b);
                break;
        }
    }

    @Override // e2.o
    public void invoke(Object obj) {
        ((b2.d1) obj).q(this.b);
    }
}
