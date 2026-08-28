package j$.util.stream;

import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class l1 implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ r1 b;

    public /* synthetic */ l1(r1 r1Var, int i9) {
        this.a = i9;
        this.b = r1Var;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new o1(this.b);
            case 1:
                return new n1(this.b);
            default:
                return new p1(this.b);
        }
    }
}
