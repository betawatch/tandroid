package j$.util.function;

import java.util.function.LongBinaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class S implements U {
    public final /* synthetic */ LongBinaryOperator a;

    private /* synthetic */ S(LongBinaryOperator longBinaryOperator) {
        this.a = longBinaryOperator;
    }

    public static /* synthetic */ U a(LongBinaryOperator longBinaryOperator) {
        if (longBinaryOperator == null) {
            return null;
        }
        return longBinaryOperator instanceof T ? ((T) longBinaryOperator).a : new S(longBinaryOperator);
    }

    @Override // j$.util.function.U
    public final /* synthetic */ long applyAsLong(long j, long j2) {
        return this.a.applyAsLong(j, j2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongBinaryOperator longBinaryOperator = this.a;
        if (obj instanceof S) {
            obj = ((S) obj).a;
        }
        return longBinaryOperator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
