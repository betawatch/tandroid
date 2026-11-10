package l2;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
