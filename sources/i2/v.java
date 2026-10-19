package i2;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements e2.o, e2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ v(float f7, int i10) {
        this.a = i10;
        this.b = f7;
    }

    @Override // e2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                ((m4.m1) obj).a(this.b);
                break;
            default:
                ((m4.m1) obj).U(this.b);
                break;
        }
    }

    @Override // e2.o
    public void invoke(Object obj) {
        ((b2.d1) obj).onVolumeChanged(this.b);
    }
}
