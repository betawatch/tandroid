package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final class e1 extends i5 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(a aVar, n5 n5Var, byte b) {
        super(n5Var);
        this.b = b;
        this.c = aVar;
    }

    @Override // j$.util.stream.m5, j$.util.stream.n5
    public final void accept(long j) {
        byte b = this.b;
        n5 n5Var = this.a;
        a aVar = this.c;
        switch (b) {
            case 0:
                n5Var.accept((n5) ((LongFunction) ((s) aVar).m).apply(j));
                break;
            default:
                ((LongConsumer) ((h1) aVar).m).accept(j);
                n5Var.accept(j);
                break;
        }
    }
}
