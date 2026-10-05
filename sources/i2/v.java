package i2;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements e2.m, e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ v(float f7, int i10) {
        this.a = i10;
        this.b = f7;
    }

    @Override // e2.h
    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                ((m4.e1) obj).a(this.b);
                break;
            default:
                ((m4.e1) obj).U(this.b);
                break;
        }
    }

    @Override // e2.m
    public void invoke(Object obj) {
        ((b2.z0) obj).onVolumeChanged(this.b);
    }
}
