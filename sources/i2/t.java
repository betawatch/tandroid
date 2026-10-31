package i2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
