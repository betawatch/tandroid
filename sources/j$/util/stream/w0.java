package j$.util.stream;

import java.util.function.IntConsumer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class w0 extends b1 {
    public final /* synthetic */ byte l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(c1 c1Var, IntConsumer intConsumer) {
        super(c1Var, 0);
        this.l = (byte) 0;
        this.m = intConsumer;
    }

    @Override // j$.util.stream.a
    public final n5 M(int i, n5 n5Var) {
        switch (this.l) {
            case 0:
                return new v0(this, n5Var, (byte) 1);
            case 1:
                return new v0(this, n5Var, (byte) 2);
            case 2:
                return new y0(this, n5Var);
            case 3:
                return new a5(this, n5Var, (byte) 3);
            default:
                return new z4(this, n5Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(a aVar, int i, Object obj, byte b) {
        super(aVar, i);
        this.l = b;
        this.m = obj;
    }
}
