package m4;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
