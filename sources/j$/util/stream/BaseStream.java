package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.BaseStream;
import java.util.Iterator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public interface BaseStream<T, S extends BaseStream<T, S>> extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    boolean isParallel();

    Iterator iterator();

    BaseStream onClose(Runnable runnable);

    BaseStream parallel();

    BaseStream sequential();

    Spliterator spliterator();

    BaseStream unordered();
}
