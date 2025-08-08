package j$.util.concurrent;

/* loaded from: classes2.dex */
final class w extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final Object initialValue() {
        ThreadLocalRandom threadLocalRandom = new ThreadLocalRandom();
        threadLocalRandom.c = true;
        return threadLocalRandom;
    }
}
