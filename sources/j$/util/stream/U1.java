package j$.util.stream;

/* loaded from: classes2.dex */
abstract class U1 extends V1 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U1(b bVar, int i, int i2) {
        super(bVar, i);
        this.l = i2;
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
