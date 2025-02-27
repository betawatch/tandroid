package j$.util.function;

import java.util.function.IntBinaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class z implements IntBinaryOperator {
    public final /* synthetic */ A a;

    private /* synthetic */ z(A a) {
        this.a = a;
    }

    public static /* synthetic */ IntBinaryOperator a(A a) {
        if (a == null) {
            return null;
        }
        return a instanceof y ? ((y) a).a : new z(a);
    }

    @Override // java.util.function.IntBinaryOperator
    public final /* synthetic */ int applyAsInt(int i, int i2) {
        return this.a.applyAsInt(i, i2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        A a = this.a;
        if (obj instanceof z) {
            obj = ((z) obj).a;
        }
        return a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
