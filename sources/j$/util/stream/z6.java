package j$.util.stream;

import j$.util.function.IntConsumer$-CC;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class z6 extends b7 implements IntConsumer {
    public final int[] c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$-CC.$default$andThen(this, intConsumer);
    }

    public z6(int i7) {
        this.c = new int[i7];
    }

    @Override // j$.util.stream.b7
    public final void a(Object obj, long j3) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i7 = 0; i7 < j3; i7++) {
            intConsumer.accept(this.c[i7]);
        }
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i7) {
        int i10 = this.b;
        this.b = i10 + 1;
        this.c[i10] = i7;
    }
}
