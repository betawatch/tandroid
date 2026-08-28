package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class z6 extends b7 implements IntConsumer {
    public final int[] c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }

    public z6(int i9) {
        this.c = new int[i9];
    }

    @Override // j$.util.stream.b7
    public final void a(Object obj, long j10) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i9 = 0; i9 < j10; i9++) {
            intConsumer.accept(this.c[i9]);
        }
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i9) {
        int i10 = this.b;
        this.b = i10 + 1;
        this.c[i10] = i9;
    }
}
