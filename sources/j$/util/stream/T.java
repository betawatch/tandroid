package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class T implements IntConsumer {
    public final /* synthetic */ m2 a;

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.a.accept(i);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }
}
