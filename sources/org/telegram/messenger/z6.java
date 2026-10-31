package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class z6 {
    public final int a;
    public final long b;

    public z6(long j10, int i10, long j11) {
        this.a = i10;
        this.b = j11;
    }

    public final int hashCode() {
        long j10 = this.b;
        return (int) (j10 ^ (j10 >>> 32));
    }
}
