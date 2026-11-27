package j$.util.stream;

import java.util.function.Supplier;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final /* synthetic */ class o1 implements Supplier {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u1 b;

    public /* synthetic */ o1(u1 u1Var, byte b) {
        this.a = b;
        this.b = u1Var;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new r1(this.b);
            case 1:
                return new q1(this.b);
            default:
                return new s1(this.b);
        }
    }
}
