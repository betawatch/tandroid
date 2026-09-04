package j$.util;

import j$.util.stream.j5;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class m0 implements LongConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ m0(Consumer consumer, int i10) {
        this.a = i10;
        this.b = consumer;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j3) {
        switch (this.a) {
            case 0:
                this.b.accept(Long.valueOf(j3));
                break;
            default:
                ((j5) this.b).accept(j3);
                break;
        }
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.a) {
        }
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }
}
