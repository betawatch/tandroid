package j$.util.stream;

/* loaded from: classes2.dex */
public abstract class X1 extends Y1 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X1(a aVar, int i, int i2) {
        super(aVar, i);
        this.l = i2;
    }

    @Override // j$.util.stream.a
    public final boolean L() {
        switch (this.l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        switch (this.l) {
            case 0:
                if (!S2.ORDERED.q(this.f)) {
                    break;
                } else {
                    break;
                }
            default:
                if (!S2.ORDERED.q(this.f)) {
                    break;
                } else {
                    break;
                }
        }
        return new V1(this, S2.r, 1);
    }
}
