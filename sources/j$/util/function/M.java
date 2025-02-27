package j$.util.function;

import java.util.function.LongBinaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class M implements O {
    public final /* synthetic */ LongBinaryOperator a;

    private /* synthetic */ M(LongBinaryOperator longBinaryOperator) {
        this.a = longBinaryOperator;
    }

    public static /* synthetic */ O a(LongBinaryOperator longBinaryOperator) {
        if (longBinaryOperator == null) {
            return null;
        }
        return longBinaryOperator instanceof N ? ((N) longBinaryOperator).a : new M(longBinaryOperator);
    }

    @Override // j$.util.function.O
    public final /* synthetic */ long applyAsLong(long j, long j2) {
        return this.a.applyAsLong(j, j2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongBinaryOperator longBinaryOperator = this.a;
        if (obj instanceof M) {
            obj = ((M) obj).a;
        }
        return longBinaryOperator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
