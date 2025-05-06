package j$.util.stream;

/* loaded from: classes2.dex */
abstract class h0 extends i0 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(b bVar, int i, int i2) {
        super(bVar, i);
        this.l = i2;
    }

    @Override // j$.util.stream.b, j$.util.stream.BaseStream, j$.util.stream.E
    public final /* bridge */ /* synthetic */ LongStream parallel() {
        switch (this.l) {
            case 0:
                parallel();
                break;
            default:
                parallel();
                break;
        }
        return this;
    }

    @Override // j$.util.stream.b, j$.util.stream.BaseStream, j$.util.stream.E
    public final /* bridge */ /* synthetic */ LongStream sequential() {
        switch (this.l) {
            case 0:
                sequential();
                break;
            default:
                sequential();
                break;
        }
        return this;
    }

    @Override // j$.util.stream.b
    final boolean v0() {
        switch (this.l) {
            case 0:
                return true;
            default:
                return false;
        }
    }
}
