package j$.util.stream;

import j$.util.function.IntConsumer$-CC;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class z6 extends b7 implements IntConsumer {
    public final int[] c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$-CC.$default$andThen(this, intConsumer);
    }

    public z6(int i3) {
        this.c = new int[i3];
    }

    @Override // j$.util.stream.b7
    public final void a(Object obj, long j10) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i3 = 0; i3 < j10; i3++) {
            intConsumer.accept(this.c[i3]);
        }
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i3) {
        int i10 = this.b;
        this.b = i10 + 1;
        this.c[i10] = i3;
    }
}
