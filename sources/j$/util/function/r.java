package j$.util.function;

import java.util.function.DoubleToIntFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class r {
    public final /* synthetic */ DoubleToIntFunction a;

    private /* synthetic */ r(DoubleToIntFunction doubleToIntFunction) {
        this.a = doubleToIntFunction;
    }

    public static /* synthetic */ r a(DoubleToIntFunction doubleToIntFunction) {
        if (doubleToIntFunction == null) {
            return null;
        }
        return new r(doubleToIntFunction);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleToIntFunction doubleToIntFunction = this.a;
        if (obj instanceof r) {
            obj = ((r) obj).a;
        }
        return doubleToIntFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
