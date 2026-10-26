package i2;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements e2.o, e2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ u(float f7, int i10) {
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
                ((m4.n1) obj).U(this.b);
                break;
        }
    }

    @Override // e2.o
    public void invoke(Object obj) {
        ((b2.e1) obj).onVolumeChanged(this.b);
    }
}
