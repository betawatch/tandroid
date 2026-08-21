package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public abstract class f0 extends g0 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(a aVar, int i, int i2) {
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

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final LongStream sequential() {
        switch (this.l) {
            case 0:
                this.a.k = false;
                break;
            default:
                this.a.k = false;
                break;
        }
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final LongStream parallel() {
        switch (this.l) {
            case 0:
                this.a.k = true;
                break;
            default:
                this.a.k = true;
                break;
        }
        return this;
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
        return new t(this, S2.r, 4);
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        switch (this.l) {
        }
        return spliterator();
    }
}
