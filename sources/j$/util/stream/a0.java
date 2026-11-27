package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public abstract class a0 extends c0 {
    @Override // j$.util.stream.a
    public final boolean L() {
        return true;
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
