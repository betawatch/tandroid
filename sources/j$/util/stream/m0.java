package j$.util.stream;

import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class m0 implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    public /* synthetic */ m0(t0 t0Var, int i) {
        this.a = i;
        this.b = t0Var;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new q0(this.b);
            case 1:
                return new p0(this.b);
            default:
                return new r0(this.b);
        }
    }
}
