package m4;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ p0(float f7, int i10) {
        this.a = i10;
        this.b = f7;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((k1) obj).a(this.b);
                break;
            default:
                ((k1) obj).U(this.b);
                break;
        }
    }
}
