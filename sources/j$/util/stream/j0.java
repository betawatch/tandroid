package j$.util.stream;

import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class j0 implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0 b;

    public /* synthetic */ j0(p0 p0Var, int i) {
        this.a = i;
        this.b = p0Var;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new m0(this.b);
            case 1:
                return new l0(this.b);
            default:
                return new n0(this.b);
        }
    }
}
