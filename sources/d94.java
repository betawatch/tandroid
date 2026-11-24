// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class d94 {
    public final int a;
    public final long b;

    public d94(long j, int i, long j2) {
        this.a = i;
        this.b = j2;
    }

    public final int hashCode() {
        long j = this.b;
        return (int) (j ^ (j >>> 32));
    }
}
