package j$.util;

/* loaded from: classes2.dex */
public interface e0 extends Spliterator {
    void forEachRemaining(Object obj);

    boolean tryAdvance(Object obj);

    @Override // j$.util.Spliterator
    e0 trySplit();
}
