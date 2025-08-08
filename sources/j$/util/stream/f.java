package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.stream.DoubleStream;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements BaseStream {
    public final /* synthetic */ java.util.stream.BaseStream a;

    private /* synthetic */ f(java.util.stream.BaseStream baseStream) {
        this.a = baseStream;
    }

    public static /* synthetic */ BaseStream f0(java.util.stream.BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        return baseStream instanceof g ? ((g) baseStream).a : baseStream instanceof DoubleStream ? B.f0((DoubleStream) baseStream) : baseStream instanceof java.util.stream.IntStream ? IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) baseStream) : baseStream instanceof java.util.stream.LongStream ? i0.f0((java.util.stream.LongStream) baseStream) : baseStream instanceof java.util.stream.Stream ? Stream.VivifiedWrapper.convert((java.util.stream.Stream) baseStream) : new f(baseStream);
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.BaseStream baseStream = this.a;
        if (obj instanceof f) {
            obj = ((f) obj).a;
        }
        return baseStream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.D
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return f0(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return f0(this.a.parallel());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return f0(this.a.sequential());
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.D
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.N.b(this.a.spliterator());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return f0(this.a.unordered());
    }
}
