package j$.util.function;

import java.util.function.LongPredicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class W {
    public final /* synthetic */ LongPredicate a;

    private /* synthetic */ W(LongPredicate longPredicate) {
        this.a = longPredicate;
    }

    public static /* synthetic */ W a(LongPredicate longPredicate) {
        if (longPredicate == null) {
            return null;
        }
        return new W(longPredicate);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongPredicate longPredicate = this.a;
        if (obj instanceof W) {
            obj = ((W) obj).a;
        }
        return longPredicate.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
