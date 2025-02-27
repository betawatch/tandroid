package j$.util.function;

import java.util.function.IntToLongFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class J implements IntToLongFunction {
    public final /* synthetic */ K a;

    private /* synthetic */ J(K k) {
        this.a = k;
    }

    public static /* synthetic */ IntToLongFunction a(K k) {
        if (k == null) {
            return null;
        }
        return k instanceof I ? ((I) k).a : new J(k);
    }

    @Override // java.util.function.IntToLongFunction
    public final /* synthetic */ long applyAsLong(int i) {
        return this.a.applyAsLong(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        K k = this.a;
        if (obj instanceof J) {
            obj = ((J) obj).a;
        }
        return k.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
