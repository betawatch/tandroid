package j$.util.stream;

/* loaded from: classes2.dex */
abstract class d2 extends e2 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d2(b bVar, int i, int i2) {
        super(bVar, i);
        this.l = i2;
    }

    @Override // j$.util.stream.b
    final boolean P() {
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
                if (!K()) {
                    break;
                } else {
                    break;
                }
            default:
                if (!K()) {
                    break;
                } else {
                    break;
                }
        }
        return new b2(this, a3.r, 1);
    }
}
