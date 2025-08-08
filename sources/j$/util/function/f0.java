package j$.util.function;

import java.util.function.LongToIntFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class f0 {
    public final /* synthetic */ LongToIntFunction a;

    private /* synthetic */ f0(LongToIntFunction longToIntFunction) {
        this.a = longToIntFunction;
    }

    public static /* synthetic */ f0 a(LongToIntFunction longToIntFunction) {
        if (longToIntFunction == null) {
            return null;
        }
        if (!(longToIntFunction instanceof g0)) {
            return new f0(longToIntFunction);
        }
        throw null;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongToIntFunction longToIntFunction = this.a;
        if (obj instanceof f0) {
            obj = ((f0) obj).a;
        }
        return longToIntFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
