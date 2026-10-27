package i2;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
