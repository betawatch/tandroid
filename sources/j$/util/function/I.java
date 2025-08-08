package j$.util.function;

import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class I {
    public final /* synthetic */ IntPredicate a;

    private /* synthetic */ I(IntPredicate intPredicate) {
        this.a = intPredicate;
    }

    public static /* synthetic */ I a(IntPredicate intPredicate) {
        if (intPredicate == null) {
            return null;
        }
        if (!(intPredicate instanceof J)) {
            return new I(intPredicate);
        }
        throw null;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntPredicate intPredicate = this.a;
        if (obj instanceof I) {
            obj = ((I) obj).a;
        }
        return intPredicate.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
