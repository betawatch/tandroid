package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.Spliterator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements java.util.stream.BaseStream {
    public final /* synthetic */ BaseStream a;

    public /* synthetic */ f(BaseStream baseStream) {
        this.a = baseStream;
    }

    public static /* synthetic */ java.util.stream.BaseStream g(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        return baseStream instanceof e ? ((e) baseStream).a : baseStream instanceof f0 ? e0.g((f0) baseStream) : baseStream instanceof IntStream ? IntStream.Wrapper.convert((IntStream) baseStream) : baseStream instanceof LongStream ? n1.g((LongStream) baseStream) : baseStream instanceof Stream ? Stream.Wrapper.convert((Stream) baseStream) : new f(baseStream);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BaseStream baseStream = this.a;
        if (obj instanceof f) {
            obj = ((f) obj).a;
        }
        return baseStream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream onClose(Runnable runnable) {
        return g(this.a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream parallel() {
        return g(this.a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream sequential() {
        return g(this.a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream unordered() {
        return g(this.a.unordered());
    }
}
