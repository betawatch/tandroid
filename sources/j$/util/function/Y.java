package j$.util.function;

import java.util.function.LongToIntFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class Y {
    public final /* synthetic */ LongToIntFunction a;

    private /* synthetic */ Y(LongToIntFunction longToIntFunction) {
        this.a = longToIntFunction;
    }

    public static /* synthetic */ Y a(LongToIntFunction longToIntFunction) {
        if (longToIntFunction == null) {
            return null;
        }
        return new Y(longToIntFunction);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongToIntFunction longToIntFunction = this.a;
        if (obj instanceof Y) {
            obj = ((Y) obj).a;
        }
        return longToIntFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
