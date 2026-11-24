package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final class s7 extends u7 implements j$.util.x0 {
    @Override // j$.util.stream.w7
    public final Spliterator a(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new s7((j$.util.x0) spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.stream.u7
    public final Object b() {
        return new c2((byte) 1);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.time.a.i(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.time.a.z(this, consumer);
    }
}
