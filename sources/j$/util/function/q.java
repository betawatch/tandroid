package j$.util.function;

import java.util.function.DoublePredicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class q {
    public final /* synthetic */ DoublePredicate a;

    private /* synthetic */ q(DoublePredicate doublePredicate) {
        this.a = doublePredicate;
    }

    public static /* synthetic */ q a(DoublePredicate doublePredicate) {
        if (doublePredicate == null) {
            return null;
        }
        return new q(doublePredicate);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoublePredicate doublePredicate = this.a;
        if (obj instanceof q) {
            obj = ((q) obj).a;
        }
        return doublePredicate.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
