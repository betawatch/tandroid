package j$.util.function;

import java.util.function.IntUnaryOperator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements IntUnaryOperator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ IntUnaryOperator b;
    public final /* synthetic */ IntUnaryOperator c;

    public /* synthetic */ f(IntUnaryOperator intUnaryOperator, IntUnaryOperator intUnaryOperator2, byte b) {
        this.a = b;
        this.b = intUnaryOperator;
        this.c = intUnaryOperator2;
    }

    public final /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        switch (this.a) {
        }
        return IntUnaryOperator$-CC.$default$andThen(this, intUnaryOperator);
    }

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i) {
        switch (this.a) {
            case 0:
                return this.c.applyAsInt(this.b.applyAsInt(i));
            default:
                return this.b.applyAsInt(this.c.applyAsInt(i));
        }
    }

    public final /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        switch (this.a) {
        }
        return IntUnaryOperator$-CC.$default$compose(this, intUnaryOperator);
    }
}
