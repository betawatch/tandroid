package j$.util.function;

import java.util.function.LongPredicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class b0 {
    public final /* synthetic */ LongPredicate a;

    private /* synthetic */ b0(LongPredicate longPredicate) {
        this.a = longPredicate;
    }

    public static /* synthetic */ b0 a(LongPredicate longPredicate) {
        if (longPredicate == null) {
            return null;
        }
        if (!(longPredicate instanceof c0)) {
            return new b0(longPredicate);
        }
        throw null;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongPredicate longPredicate = this.a;
        if (obj instanceof b0) {
            obj = ((b0) obj).a;
        }
        return longPredicate.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
