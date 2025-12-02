package kotlin.random;

/* loaded from: classes3.dex */
public abstract class AbstractPlatformRandom extends Random {
    public abstract java.util.Random getImpl();

    @Override // kotlin.random.Random
    public int nextInt(int i) {
        return getImpl().nextInt(i);
    }
}
