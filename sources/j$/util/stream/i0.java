package j$.util.stream;

import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class i0 implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ o0 b;

    public /* synthetic */ i0(o0 o0Var, int i) {
        this.a = i;
        this.b = o0Var;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new l0(this.b);
            case 1:
                return new k0(this.b);
            default:
                return new m0(this.b);
        }
    }
}
