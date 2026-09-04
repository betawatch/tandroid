package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class z6 extends b7 implements IntConsumer {
    public final int[] c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }

    public z6(int i10) {
        this.c = new int[i10];
    }

    @Override // j$.util.stream.b7
    public final void a(Object obj, long j3) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i10 = 0; i10 < j3; i10++) {
            intConsumer.accept(this.c[i10]);
        }
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i10) {
        int i11 = this.b;
        this.b = i11 + 1;
        this.c[i11] = i10;
    }
}
