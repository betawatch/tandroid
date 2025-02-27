package j$.util.function;

import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class G {
    public final /* synthetic */ IntPredicate a;

    private /* synthetic */ G(IntPredicate intPredicate) {
        this.a = intPredicate;
    }

    public static /* synthetic */ G a(IntPredicate intPredicate) {
        if (intPredicate == null) {
            return null;
        }
        return new G(intPredicate);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntPredicate intPredicate = this.a;
        if (obj instanceof G) {
            obj = ((G) obj).a;
        }
        return intPredicate.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
