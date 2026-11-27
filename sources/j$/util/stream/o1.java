package j$.util.stream;

import java.util.function.Supplier;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
