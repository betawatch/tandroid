package j$.util.stream;

import j$.util.stream.IntStream;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final class n0 implements IntFunction, LongFunction {
    public IntFunction a;

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        Object apply = this.a.apply(i);
        if (apply == null) {
            return null;
        }
        if (apply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) apply);
        }
        if (apply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) apply);
        }
        j$.util.g.a(apply.getClass(), "java.util.stream.IntStream");
        throw null;
    }

    @Override // java.util.function.LongFunction
    public final Object apply(long j) {
        return w3.x(j, this.a);
    }
}
