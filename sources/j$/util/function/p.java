package j$.util.function;

import java.util.function.DoublePredicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class p {
    public final /* synthetic */ DoublePredicate a;

    private /* synthetic */ p(DoublePredicate doublePredicate) {
        this.a = doublePredicate;
    }

    public static /* synthetic */ p a(DoublePredicate doublePredicate) {
        if (doublePredicate == null) {
            return null;
        }
        if (!(doublePredicate instanceof q)) {
            return new p(doublePredicate);
        }
        throw null;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoublePredicate doublePredicate = this.a;
        if (obj instanceof p) {
            obj = ((p) obj).a;
        }
        return doublePredicate.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
