package c4;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class g implements Comparable {
    public final long a;
    public final byte[] b;

    public g(long j3, byte[] bArr) {
        this.a = j3;
        this.b = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((g) obj).a);
    }
}
