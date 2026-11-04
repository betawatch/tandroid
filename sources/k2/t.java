package k2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements g2.p, g2.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ t(float f10, int i3) {
        this.a = i3;
        this.b = f10;
    }

    @Override // g2.k
    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                ((o4.l1) obj).b(this.b);
                break;
            default:
                ((o4.l1) obj).R(this.b);
                break;
        }
    }

    @Override // g2.p
    public void invoke(Object obj) {
        ((d2.c1) obj).s(this.b);
    }
}
