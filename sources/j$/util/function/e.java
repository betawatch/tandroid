package j$.util.function;

import java.util.function.IntUnaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements IntUnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ IntUnaryOperator b;
    public final /* synthetic */ IntUnaryOperator c;

    public /* synthetic */ e(IntUnaryOperator intUnaryOperator, IntUnaryOperator intUnaryOperator2, int i10) {
        this.a = i10;
        this.b = intUnaryOperator;
        this.c = intUnaryOperator2;
    }

    public final /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        switch (this.a) {
        }
        return IntUnaryOperator$-CC.$default$andThen(this, intUnaryOperator);
    }

    public final /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        switch (this.a) {
        }
        return IntUnaryOperator$-CC.$default$compose(this, intUnaryOperator);
    }

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i10) {
        switch (this.a) {
            case 0:
                return this.c.applyAsInt(this.b.applyAsInt(i10));
            default:
                return this.b.applyAsInt(this.c.applyAsInt(i10));
        }
    }
}
