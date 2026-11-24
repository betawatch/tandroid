package j$.util.stream;

import java.util.function.Supplier;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
