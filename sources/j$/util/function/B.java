package j$.util.function;

import java.util.function.IntBinaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class B implements IntBinaryOperator {
    public final /* synthetic */ C a;

    private /* synthetic */ B(C c) {
        this.a = c;
    }

    public static /* synthetic */ IntBinaryOperator a(C c) {
        if (c == null) {
            return null;
        }
        return c instanceof A ? ((A) c).a : new B(c);
    }

    @Override // java.util.function.IntBinaryOperator
    public final /* synthetic */ int applyAsInt(int i, int i2) {
        return this.a.applyAsInt(i, i2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        C c = this.a;
        if (obj instanceof B) {
            obj = ((B) obj).a;
        }
        return c.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
