package j$.util.function;

import java.util.function.LongBinaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class T implements LongBinaryOperator {
    public final /* synthetic */ U a;

    private /* synthetic */ T(U u) {
        this.a = u;
    }

    public static /* synthetic */ LongBinaryOperator a(U u) {
        if (u == null) {
            return null;
        }
        return u instanceof S ? ((S) u).a : new T(u);
    }

    @Override // java.util.function.LongBinaryOperator
    public final /* synthetic */ long applyAsLong(long j, long j2) {
        return this.a.applyAsLong(j, j2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        U u = this.a;
        if (obj instanceof T) {
            obj = ((T) obj).a;
        }
        return u.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
