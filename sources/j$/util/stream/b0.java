package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public abstract class b0 extends c0 {
    @Override // j$.util.stream.a
    public final boolean L() {
        return false;
    }

    @Override // j$.util.stream.BaseStream
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final f0 parallel() {
        this.a.k = true;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final f0 sequential() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !b7.ORDERED.n(this.f) ? this : new u(this, b7.r, (byte) 1);
    }
}
