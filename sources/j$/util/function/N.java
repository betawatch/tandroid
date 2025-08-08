package j$.util.function;

import java.util.function.IntToLongFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class N implements IntToLongFunction {
    public final /* synthetic */ O a;

    private /* synthetic */ N(O o) {
        this.a = o;
    }

    public static /* synthetic */ IntToLongFunction a(O o) {
        if (o == null) {
            return null;
        }
        return o instanceof M ? ((M) o).a : new N(o);
    }

    @Override // java.util.function.IntToLongFunction
    public final /* synthetic */ long applyAsLong(int i) {
        return this.a.applyAsLong(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        O o = this.a;
        if (obj instanceof N) {
            obj = ((N) obj).a;
        }
        return o.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
