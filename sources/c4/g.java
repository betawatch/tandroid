package c4;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
