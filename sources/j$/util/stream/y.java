package j$.util.stream;

import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final class y extends b0 {
    public final /* synthetic */ byte l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(c0 c0Var, DoubleConsumer doubleConsumer) {
        super(c0Var, 0);
        this.l = (byte) 1;
        this.m = doubleConsumer;
    }

    @Override // j$.util.stream.a
    public final n5 M(int i, n5 n5Var) {
        switch (this.l) {
            case 0:
                return new x(this, n5Var);
            case 1:
                return new p(this, n5Var, (byte) 1);
            case 2:
                return new a5(this, n5Var, (byte) 5);
            default:
                return new z4(this, n5Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(a aVar, int i, Object obj, byte b) {
        super(aVar, i);
        this.l = b;
        this.m = obj;
    }
}
